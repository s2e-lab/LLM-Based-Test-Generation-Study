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

    /**
     * Test method for {@link ModelManager#loadModel(Content)}.
     */
    @Test
    void testLoadModel() throws IOException {
        // Test with a piece of furniture with a 3DS file
        Content content = new URLContent(getClass().getResource("resources/3ds/test.3ds"));
        BranchGroup branchGroup = ModelManager.getInstance().loadModel(content);
        assertNotNull(branchGroup);
        assertEquals(1, branchGroup.numChildren());
        Node node = branchGroup.getChild(0);
        assertTrue(node instanceof TransformGroup);
        TransformGroup transformGroup = (TransformGroup)node;
        assertTrue(transformGroup.getChild(0) instanceof Shape3D);
        Shape3D shape3D = (Shape3D)transformGroup.getChild(0);
        assertTrue(shape3D.getGeometry() instanceof IndexedTriangleArray);
        IndexedTriangleArray indexedTriangleArray = (IndexedTriangleArray)shape3D.getGeometry();
        assertEquals(12, indexedTriangleArray.getValidVertexCount());
        assertEquals(12, indexedTriangleArray.getVertexCount());
        assertEquals(12, indexedTriangleArray.getIndexCount());
        assertEquals(12, indexedTriangleArray.getValidIndexCount());
        assertEquals(12, indexedTriangleArray.getValidCoordinateIndices().length);
        assertEquals(12, indexedTriangleArray.getValidCoordinateIndices()[0]);
        assertEquals(12, indexedTriangleArray.getValidCoordinateIndices()[1]);
        assertEquals(12, indexedTriangleArray.getValidCoordinateIndices()[2]);
        assertEquals(12, indexedTriangleArray.getValidCoordinateIndices()[3]);
        assertEquals(12, indexedTriangleArray.getValidCoordinateIndices()[4]);
        assertEquals(12, indexedTriangleArray.getValidCoordinateIndices()[5]);
        assertEquals(12, indexedTriangleArray.getValidCoordinateIndices()[6]);
        assertEquals(12, indexedTriangleArray.getValidCoordinateIndices()[7]);
        assertEquals(12, indexedTriangleArray.getValidCoordinateIndices()[8]);
        assertEquals(12, indexedTriangleArray.getValidCoordinateIndices()[9]);
        assertEquals(12, indexedTriangleArray.getValidCoordinateIndices()[10]);
        assertEquals(12, indexedTriangleArray.getValidCoordinateIndices()[11]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices().length);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[0]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[1]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[2]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[3]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[4]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[5]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[6]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[7]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[8]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[9]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[10]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[11]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[12]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[13]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[14]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[15]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[16]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[17]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[18]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[19]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[20]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[21]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[22]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[23]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[24]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[25]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[26]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[27]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[28]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[29]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[30]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[31]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[32]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[33]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[34]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[35]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[36]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[37]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[38]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[39]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[40]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[41]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[42]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[43]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[44]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[45]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[46]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[47]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[48]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[49]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[50]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[51]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[52]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[53]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[54]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[55]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[56]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[57]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[58]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[59]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[60]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[61]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[62]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[63]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[64]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[65]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[66]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[67]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[68]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[69]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[70]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[71]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[72]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[73]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[74]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[75]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[76]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[77]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[78]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[79]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[80]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[81]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[82]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[83]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[84]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[85]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[86]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[87]);
        assertEquals(12, indexedTriangleArray.getCoordinateIndices()[88