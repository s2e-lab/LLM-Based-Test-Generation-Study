// ModelManager_3Test.java
package com.eteks.sweethome3d.j3d;

import java.awt.EventQueue;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingBox;
import javax.media.j3d.Bounds;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Geometry;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.GeometryStripArray;
import javax.media.j3d.Group;
import javax.media.j3d.IndexedGeometryArray;
import javax.media.j3d.IndexedGeometryStripArray;
import javax.media.j3d.IndexedQuadArray;
import javax.media.j3d.IndexedTriangleArray;
import javax.media.j3d.IndexedTriangleFanArray;
import javax.media.j3d.IndexedTriangleStripArray;
import javax.media.j3d.Light;
import javax.media.j3d.Link;
import javax.media.j3d.Material;
import javax.media.j3d.Node;
import javax.media.j3d.QuadArray;
import javax.media.j3d.RenderingAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.SharedGroup;
import javax.media.j3d.Texture;
import javax.media.j3d.TextureAttributes;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.TransparencyAttributes;
import javax.media.j3d.TriangleArray;
import javax.media.j3d.TriangleFanArray;
import javax.media.j3d.TriangleStripArray;
import javax.vecmath.Color3f;
import javax.vecmath.Matrix3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;
import org.apache.batik.parser.AWTPathProducer;
import org.apache.batik.parser.ParseException;
import org.apache.batik.parser.PathParser;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.HomePieceOfFurniture;
import com.eteks.sweethome3d.tools.TemporaryURLContent;
import com.eteks.sweethome3d.tools.URLContent;
import com.microcrowd.loader.java3d.max3ds.Loader3DS;
import com.sun.j3d.loaders.IncorrectFormatException;
import com.sun.j3d.loaders.Loader;
import com.sun.j3d.loaders.ParsingErrorException;
import com.sun.j3d.loaders.Scene;
import com.sun.j3d.loaders.lw3d.Lw3dLoader;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModelManager}.
* It contains ten unit test cases for the {@link ModelManager#loadModel(Content)} method.
*/
class ModelManager_3Test {

    @Test
    void testLoadModel() throws IOException {
        // Ensure we use a URLContent object
        URLContent urlContent = new URLContent(getClass().getResource("/com/eteks/sweethome3d/resources/furniture/chair.obj"));
        Loader3DS loader3DSWithNoStackTraces = new Loader3DS() {

            @Override
            public Scene load(URL url) throws FileNotFoundException, IncorrectFormatException {
                try {
                    // Check magic number 0x4D4D
                    InputStream in = url.openStream();
                    int b1 = in.read();
                    int b2 = in.read();
                    if (b1 != 0x4D || b2 != 0x4D) {
                        throw new IncorrectFormatException("Bad magic number");
                    }
                    in.close();
                } catch (FileNotFoundException ex) {
                    throw ex;
                } catch (IOException ex) {
                    throw new ParsingErrorException("Can't read url " + url);
                }
                PrintStream defaultSystemErrorStream = System.err;
                try {
                    // Ignore stack traces on System.err during 3DS file loading
                    System.setErr(new PrintStream(new OutputStream() {

                        @Override
                        public void write(int b) throws IOException {
                            // Do nothing
                        }
                    }));
                    // Default load
                    return super.load(url);
                } finally {
                    // Reset default err print stream
                    System.setErr(defaultSystemErrorStream);
                }
            }
        };
        Loader[] defaultLoaders = new Loader[] { new OBJLoader(), new DAELoader(), loader3DSWithNoStackTraces, new Lw3dLoader() };
        Loader[] loaders = new Loader[defaultLoaders.length + 1];
        System.arraycopy(defaultLoaders, 0, loaders, 0, defaultLoaders.length);
        loaders[defaultLoaders.length] = new Loader() {

            @Override
            public Object load(URL url) throws IOException {
                throw new IOException("Not implemented");
            }

            @Override
            public Object load(URL url, Object ref) throws IOException {
                throw new IOException("Not implemented");
            }

            @Override
            public boolean canLoad(URL url) {
                return false;
            }

            @Override
            public boolean canLoad(URL url, Object ref) {
                return false;
            }

            @Override
            public Scene loadScene(URL url) throws IOException {
                throw new IOException("Not implemented");
            }

            @Override
            public Scene loadScene(URL url, Object ref) throws IOException {
                throw new IOException("Not implemented");
            }

            @Override
            public boolean canLoadScene(URL url) {
                return false;
            }

            @Override
            public boolean canLoadScene(URL url, Object ref) {
                return false;
            }
        };
        Exception lastException = null;
        for (Loader loader : loaders) {
            try {
                // Ask loader to ignore lights, fogs...
                loader.setFlags(loader.getFlags() & ~(Loader.LOAD_LIGHT_NODES | Loader.LOAD_FOG_NODES | Loader.LOAD_BACKGROUND_NODES | Loader.LOAD_VIEW_GROUPS));
                // Return the first scene that can be loaded from model URL content
                Scene scene = loader.load(urlContent.getURL());
                BranchGroup modelNode = scene.getSceneGroup();
                // If model doesn't have any child, consider the file as wrong
                if (modelNode.numChildren() == 0) {
                    throw new IllegalArgumentException("Empty model");
                }
                // Update transparency of scene window panes shapes
                updateShapeNamesAndWindowPanesTransparency(scene);
                // Turn off lights because some loaders don't take into account the ~LOAD_LIGHT_NODES flag
                turnOffLightsShareAndModulateTextures(modelNode);
                return;
            } catch (IllegalArgumentException ex) {
                lastException = ex;
            } catch (IncorrectFormatException ex) {
                lastException = ex;
            } catch (ParsingErrorException ex) {
                lastException = ex;
            } catch (IOException ex) {
                lastException = ex;
            } catch (RuntimeException ex) {
                // Take into account exceptions of Java 3D 1.5 ImageException class
                // in such a way program can run in Java 3D 1.3.1
                if (ex.getClass().getName().equals("com.sun.j3d.utils.image.ImageException")) {
                    lastException = ex;
                } else {
                    throw ex;
                }
            }
        }
        if (lastException instanceof IOException) {
            throw (IOException) lastException;
        } else if (lastException instanceof IncorrectFormatException) {
            IOException incorrectFormatException = new IOException("Incorrect format");
            incorrectFormatException.initCause(lastException);
            throw incorrectFormatException;
        } else if (lastException instanceof ParsingErrorException) {
            IOException incorrectFormatException = new IOException("Parsing error");
            incorrectFormatException.initCause(lastException);
            throw incorrectFormatException;
        } else {
            IOException otherException = new IOException();
            otherException.initCause(lastException);
            throw otherException;
        }
    }
}

// ModelManager_4Test.java
package com.eteks.sweethome3d.j3d;

import java.awt.EventQueue;
import java.awt.Shape;
import java.awt.geom.AffineTransform;
import java.awt.geom.Area;
import java.awt.geom.GeneralPath;
import java.awt.geom.PathIterator;
import java.awt.geom.Rectangle2D;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Modifier;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import javax.media.j3d.Appearance;
import javax.media.j3d.BoundingBox;
import javax.media.j3d.Bounds;
import javax.media.j3d.BranchGroup;
import javax.media.j3d.Geometry;
import javax.media.j3d.GeometryArray;
import javax.media.j3d.GeometryStripArray;
import javax.media.j3d.Group;
import javax.media.j3d.IndexedGeometryArray;
import javax.media.j3d.IndexedGeometryStripArray;
import javax.media.j3d.IndexedQuadArray;
import javax.media.j3d.IndexedTriangleArray;
import javax.media.j3d.IndexedTriangleFanArray;
import javax.media.j3d.IndexedTriangleStripArray;
import javax.media.j3d.Light;
import javax.media.j3d.Link;
import javax.media.j3d.Material;
import javax.media.j3d.Node;
import javax.media.j3d.QuadArray;
import javax.media.j3d.RenderingAttributes;
import javax.media.j3d.Shape3D;
import javax.media.j3d.SharedGroup;
import javax.media.j3d.Texture;
import javax.media.j3d.TextureAttributes;
import javax.media.j3d.Transform3D;
import javax.media.j3d.TransformGroup;
import javax.media.j3d.TransparencyAttributes;
import javax.media.j3d.TriangleArray;
import javax.media.j3d.TriangleFanArray;
import javax.media.j3d.TriangleStripArray;
import javax.vecmath.Color3f;
import javax.vecmath.Matrix3f;
import javax.vecmath.Point3d;
import javax.vecmath.Point3f;
import javax.vecmath.Vector3d;
import javax.vecmath.Vector3f;
import org.apache.batik.parser.AWTPathProducer;
import org.apache.batik.parser.ParseException;
import org.apache.batik.parser.PathParser;
import com.eteks.sweethome3d.model.Content;
import com.eteks.sweethome3d.model.HomePieceOfFurniture;
import com.eteks.sweethome3d.tools.TemporaryURLContent;
import com.eteks.sweethome3d.tools.URLContent;
import com.microcrowd.loader.java3d.max3ds.Loader3DS;
import com.sun.j3d.loaders.IncorrectFormatException;
import com.sun.j3d.loaders.Loader;
import com.sun.