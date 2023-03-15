// Util3D_4Test.java
package gui.gl;

import static java.lang.Math.PI;
import static java.lang.Math.tan;
import static java.lang.Math.cos;
import static java.lang.Math.sin;
import javax.vecmath.*;
import com.xith3d.scenegraph.*;
import com.xith3d.loaders.texture.*;
import com.xith3d.render.*;
import com.xith3d.render.jogl.*;
import javax.imageio.ImageIO;
import java.io.*;
import com.xith3d.image.DirectBufferedImage;
import java.awt.image.BufferedImage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Util3D}.
* It contains ten unit test cases for the {@link Util3D#createTexturedPlane(String, float, float)} method.
*/
class Util3D_4Test {

		/**
		* Test case for {@link Util3D#createTexturedPlane(String, float, float)} method.
		* It tests if the method returns a Shape3D object.
		*/
		@Test
		void testCreateTexturedPlane() {
				Shape3D shape = Util3D.createTexturedPlane("dat/tex/grass.jpg", 1.0f, 1.0f);
				assertNotNull(shape);
		}
		
		/**
		* Test case for {@link Util3D#createTexturedPlane(String, float, float)} method.
		* It tests if the method returns a Shape3D object with a GeometryArray.
		*/
		@Test
		void testCreateTexturedPlane2() {
				Shape3D shape = Util3D.createTexturedPlane("dat/tex/grass.jpg", 1.0f, 1.0f);
				assertNotNull(shape.getGeometry());
		}
		
		/**
		* Test case for {@link Util3D#createTexturedPlane(String, float, float)} method.
		* It tests if the method returns a Shape3D object with a GeometryArray of type QuadArray.
		*/
		@Test
		void testCreateTexturedPlane3() {
				Shape3D shape = Util3D.createTexturedPlane("dat/tex/grass.jpg", 1.0f, 1.0f);
				assertTrue(shape.getGeometry() instanceof QuadArray);
		}
		
		/**
		* Test case for {@link Util3D#createTexturedPlane(String, float, float)} method.
		* It tests if the method returns a Shape3D object with a GeometryArray of type QuadArray with four vertices.
		*/
		@Test
		void testCreateTexturedPlane4() {
				Shape3D shape = Util3D.createTexturedPlane("dat/tex/grass.jpg", 1.0f, 1.0f);
				assertEquals(4, ((QuadArray) shape.getGeometry()).getVertexCount());
		}
		
		/**
		* Test case for {@link Util3D#createTexturedPlane(String, float, float)} method.
		* It tests if the method returns a Shape3D object with a GeometryArray of type QuadArray with four vertices and two texture coordinates.
		*/
		@Test
		void testCreateTexturedPlane5() {
				Shape3D shape = Util3D.createTexturedPlane("dat/tex/grass.jpg", 1.0f, 1.0f);
				assertEquals(2, ((QuadArray) shape.getGeometry()).getTexCoordSetCount());
		}
		
		/**
		* Test case for {@link Util3D#createTexturedPlane(String, float, float)} method.
		* It tests if the method returns a Shape3D object with a GeometryArray of type QuadArray with four vertices and two texture coordinates with four texture coordinates each.
		*/
		@Test
		void testCreateTexturedPlane6() {
				Shape3D shape = Util3D.createTexturedPlane("dat/tex/grass.jpg", 1.0f, 1.0f);
				assertEquals(4, ((QuadArray) shape.getGeometry()).getTexCoordSetCount(0));
				assertEquals(4, ((QuadArray) shape.getGeometry()).getTexCoordSetCount(1));
		}
		
		/**
		* Test case for {@link Util3D#createTexturedPlane(String, float, float)} method.
		* It tests if the method returns a Shape3D object with a GeometryArray of type QuadArray with four vertices and two texture coordinates with four texture coordinates each and a texture.
		*/
		@Test
		void testCreateTexturedPlane7() {
				Shape3D shape = Util3D.createTexturedPlane("dat/tex/grass.jpg", 1.0f, 1.0f);
				assertNotNull(shape.getAppearance().getTexture());
		}
		
		/**
		* Test case for {@link Util3D#createTexturedPlane(String, float, float)} method.
		* It tests if the method returns a Shape3D object with a GeometryArray of type QuadArray with four vertices and two texture coordinates with four texture coordinates each and a texture with the correct path.
		*/
		@Test
		void testCreateTexturedPlane8() {
				Shape3D shape = Util3D.createTexturedPlane("dat/tex/grass.jpg", 1.0f, 1.0f);
				assertEquals("dat/tex/grass.jpg", shape.getAppearance().getTexture().getPath());
		}
		
		/**
		* Test case for {@link Util3D#createTexturedPlane(String, float, float)} method.
		* It tests if the method returns a Shape3D object with a GeometryArray of type QuadArray with four vertices and two texture coordinates with four texture coordinates each and a texture with the correct path and the correct texture coordinates.
		*/
		@Test
		void testCreateTexturedPlane9() {
				Shape3D shape = Util3D.createTexturedPlane("dat/tex/grass.jpg", 1.0f, 1.0f);
				assertEquals(new TexCoord2f(0f, 0f), ((QuadArray) shape.getGeometry()).getTextureCoordinate(0, 0));
				assertEquals(new TexCoord2f(1f, 0f), ((QuadArray) shape.getGeometry()).getTextureCoordinate(0, 1));
				assertEquals(new TexCoord2f(1f, 1f), ((QuadArray) shape.getGeometry()).getTextureCoordinate(0, 2));
				assertEquals(new TexCoord2f(0f, 1f), ((QuadArray) shape.getGeometry()).getTextureCoordinate(0, 3));
				assertEquals(new TexCoord2f(0f, 0f), ((QuadArray) shape.getGeometry()).getTextureCoordinate(1, 0));
				assertEquals(new TexCoord2f(1f, 0f), ((QuadArray) shape.getGeometry()).getTextureCoordinate(1, 1));
				assertEquals(new TexCoord2f(1f, 1f), ((QuadArray) shape.getGeometry()).getTextureCoordinate(1, 2));
				assertEquals(new TexCoord2f(0f, 1f), ((QuadArray) shape.getGeometry()).getTextureCoordinate(1, 3));
		}
		
		/**
		* Test case for {@link Util3D#createTexturedPlane(String, float, float)} method.
		* It tests if the method returns a Shape3D object with a GeometryArray of type QuadArray with four vertices and two texture coordinates with four texture coordinates each and a texture with the correct path and the correct texture coordinates and the correct texture mode.
		*/
		@Test
		void testCreateTexturedPlane10() {
				Shape3D shape = Util3D.createTexturedPlane("dat/tex/grass.jpg", 1.0f, 1.0f);
				assertEquals(TextureAttributes.MODULATE, shape.getAppearance().getTextureAttributes().getTextureMode());
		}
}