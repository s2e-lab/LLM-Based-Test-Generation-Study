// Util3D_2Test.java
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
* It contains ten unit test cases for the {@link Util3D#createPlane(float, float)} method.
*/
class Util3D_2Test {

		/**
		* Test case for {@link Util3D#createPlane(float, float)} method.
		* It tests if the method returns a plane with the correct size.
		*/
		@Test
		void testCreatePlane_1() {
				Geometry plane = Util3D.createPlane(10, 1);
				Point3f[] coords = new Point3f[4];
				plane.getCoordinates(0, coords);
				assertEquals(coords[0].x, 0);
				assertEquals(coords[0].y, 0);
				assertEquals(coords[0].z, 0);
				assertEquals(coords[1].x, 10);
				assertEquals(coords[1].y, 0);
				assertEquals(coords[1].z, 0);
				assertEquals(coords[2].x, 10);
				assertEquals(coords[2].y, 0);
				assertEquals(coords[2].z, 10);
				assertEquals(coords[3].x, 0);
				assertEquals(coords[3].y, 0);
				assertEquals(coords[3].z, 10);
		}
		
		/**
		* Test case for {@link Util3D#createPlane(float, float)} method.
		* It tests if the method returns a plane with the correct size.
		*/
		@Test
		void testCreatePlane_2() {
				Geometry plane = Util3D.createPlane(10, 1);
				Point3f[] coords = new Point3f[4];
				plane.getCoordinates(0, coords);
				assertEquals(coords[0].x, 0);
				assertEquals(coords[0].y, 0);
				assertEquals(coords[0].z, 0);
				assertEquals(coords[1].x, 10);
				assertEquals(coords[1].y, 0);
				assertEquals(coords[1].z, 0);
				assertEquals(coords[2].x, 10);
				assertEquals(coords[2].y, 0);
				assertEquals(coords[2].z, 10);
				assertEquals(coords[3].x, 0);
				assertEquals(coords[3].y, 0);
				assertEquals(coords[3].z, 10);
		}
		
		/**
		* Test case for {@link Util3D#createPlane(float, float)} method.
		* It tests if the method returns a plane with the correct size.
		*/
		@Test
		void testCreatePlane_3() {
				Geometry plane = Util3D.createPlane(10, 1);
				Point3f[] coords = new Point3f[4];
				plane.getCoordinates(0, coords);
				assertEquals(coords[0].x, 0);
				assertEquals(coords[0].y, 0);
				assertEquals(coords[0].z, 0);
				assertEquals(coords[1].x, 10);
				assertEquals(coords[1].y, 0);
				assertEquals(coords[1].z, 0);
				assertEquals(coords[2].x, 10);
				assertEquals(coords[2].y, 0);
				assertEquals(coords[2].z, 10);
				assertEquals(coords[3].x, 0);
				assertEquals(coords[3].y, 0);
				assertEquals(coords[3].z, 10);
		}
		
		/**
		* Test case for {@link Util3D#createPlane(float, float)} method.
		* It tests if the method returns a plane with the correct size.
		*/
		@Test
		void testCreatePlane_4() {
				Geometry plane = Util3D.createPlane(10, 1);
				Point3f[] coords = new Point3f[4];
				plane.getCoordinates(0, coords);
				assertEquals(coords[0].x, 0);
				assertEquals(coords[0].y, 0);
				assertEquals(coords[0].z, 0);
				assertEquals(coords[1].x, 10);
				assertEquals(coords[1].y, 0);
				assertEquals(coords[1].z, 0);
				assertEquals(coords[2].x, 10);
				assertEquals(coords[2].y, 0);
				assertEquals(coords[2].z, 10);
				assertEquals(coords[3].x, 0);
				assertEquals(coords[3].y, 0);
				assertEquals(coords[3].z, 10);
		}
		
		/**
		* Test case for {@link Util3D#createPlane(float, float)} method.
		* It tests if the method returns a plane with the correct size.
		*/
		@Test
		void testCreatePlane_5() {
				Geometry plane = Util3D.createPlane(10, 1);
				Point3f[] coords = new Point3f[4];
				plane.getCoordinates(0, coords);
				assertEquals(coords[0].x, 0);
				assertEquals(coords[0].y, 0);
				assertEquals(coords[0].z, 0);
				assertEquals(coords[1].x, 10);
				assertEquals(coords[1].y, 0);
				assertEquals(coords[1].z, 0);
				assertEquals(coords[2].x, 10);
				assertEquals(coords[2].y, 0);
				assertEquals(coords[2].z, 10);
				assertEquals(coords[3].x, 0);
				assertEquals(coords[3].y, 0);
				assertEquals(coords[3].z, 10);
		}
		
		/**
		* Test case for {@link Util3D#createPlane(float, float)} method.
		* It tests if the method returns a plane with the correct size.
		*/
		@Test
		void testCreatePlane_6() {
				Geometry plane = Util3D.createPlane(10, 1);
				Point3f[] coords = new Point3f[4];
				plane.getCoordinates(0, coords);
				assertEquals(coords[0].x, 0);
				assertEquals(coords[0].y, 0);
				assertEquals(coords[0].z, 0);
				assertEquals(coords[1].x, 10);
				assertEquals(coords[1].y, 0);
				assertEquals(coords[1].z, 0);
				assertEquals(coords[2].x, 10);
				assertEquals(