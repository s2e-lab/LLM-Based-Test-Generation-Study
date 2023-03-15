// Util3D_7Test.java
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
* It contains ten unit test cases for the {@link Util3D#createGrid(int, int, float)} method.
*/
class Util3D_7Test {

		/**
		* Test case for {@link Util3D#createGrid(int, int, float)} method.
		* It tests if the method returns a Shape3D object.
		*/
		@Test
		void testCreateGrid_1() {
				Shape3D shape = Util3D.createGrid(1, 1, 1);
				assertNotNull(shape);
		}
		
		/**
		* Test case for {@link Util3D#createGrid(int, int, float)} method.
		* It tests if the method returns a Shape3D object.
		*/
		@Test
		void testCreateGrid_2() {
				Shape3D shape = Util3D.createGrid(2, 2, 2);
				assertNotNull(shape);
		}
		
		/**
		* Test case for {@link Util3D#createGrid(int, int, float)} method.
		* It tests if the method returns a Shape3D object.
		*/
		@Test
		void testCreateGrid_3() {
				Shape3D shape = Util3D.createGrid(3, 3, 3);
				assertNotNull(shape);
		}
		
		/**
		* Test case for {@link Util3D#createGrid(int, int, float)} method.
		* It tests if the method returns a Shape3D object.
		*/
		@Test
		void testCreateGrid_4() {
				Shape3D shape = Util3D.createGrid(4, 4, 4);
				assertNotNull(shape);
		}
		
		/**
		* Test case for {@link Util3D#createGrid(int, int, float)} method.
		* It tests if the method returns a Shape3D object.
		*/
		@Test
		void testCreateGrid_5() {
				Shape3D shape = Util3D.createGrid(5, 5, 5);
				assertNotNull(shape);
		}
		
		/**
		* Test case for {@link Util3D#createGrid(int, int, float)} method.
		* It tests if the method returns a Shape3D object.
		*/
		@Test
		void testCreateGrid_6() {
				Shape3D shape = Util3D.createGrid(6, 6, 6);
				assertNotNull(shape);
		}
		
		/**
		* Test case for {@link Util3D#createGrid(int, int, float)} method.
		* It tests if the method returns a Shape3D object.
		*/
		@Test
		void testCreateGrid_7() {
				Shape3D shape = Util3D.createGrid(7, 7, 7);
				assertNotNull(shape);
		}
		
		/**
		* Test case for {@link Util3D#createGrid(int, int, float)} method.
		* It tests if the method returns a Shape3D object.
		*/
		@Test
		void testCreateGrid_8() {
				Shape3D shape = Util3D.createGrid(8, 8, 8);
				assertNotNull(shape);
		}
		
		/**
		* Test case for {@link Util3D#createGrid(int, int, float)} method.
		* It tests if the method returns a Shape3D object.
		*/
		@Test
		void testCreateGrid_9() {
				Shape3D shape = Util3D.createGrid(9, 9, 9);
				assertNotNull(shape);
		}
		
		/**
		* Test case for {@link Util3D#createGrid(int, int, float)} method.
		* It tests if the method returns a Shape3D object.
		*/
		@Test
		void testCreateGrid_10() {
				Shape3D shape = Util3D.createGrid(10, 10, 10);
				assertNotNull(shape);
		}
}

// Util3D_8Test.java
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
class Util3D_8Test {
		
		/**
		* Test case for {@link Util3D#createPlane(float, float)} method.
		* It tests if the method returns a Geometry object.
		*/
		@Test
		void testCreatePlane_1() {
				Geometry geometry = Util3D.createPlane(1, 1);
				assertNotNull(geometry);
		}
		
		/**
		* Test case for {@link Util3D#createPlane(float, float)} method.
		* It tests if the method returns a Geometry object.
		*/
		@Test
		void testCreatePlane_2() {
				Geometry geometry = Util3D.createPlane(2, 2);
				assertNotNull(geometry);
		}
		
		/**
		* Test case for {@link Util3D#createPlane(float, float)} method.
		* It tests if the method returns a Geometry object.
		*/
		@Test
		void testCreatePlane_3() {
				Geometry geometry = Util3D.createPlane(3, 3);
				assertNotNull(geometry);
		}
		
		/**
		* Test case for {@link Util3D#createPlane(float, float)} method.
		* It tests if the method returns a Geometry object.
		*/
		@Test
		void testCreatePlane_4() {
				Geometry geometry = Util3D.createPlane(4, 4);
				assertNotNull(geometry);
		}
		
		/**
		* Test case for {@link Util3D#createPlane(float, float)} method.
		* It tests if the method returns a Geometry object.
		*/
		@Test
		void testCreatePlane_5() {
				Geometry geometry = Util3D.createPlane(5, 5);
				assertNotNull(geometry);
		}
		
		/**
		* Test case for {@link Util3D#createPlane(float, float)} method.
		* It tests if the method returns a Geometry object.
		*/
		@Test
		void testCreatePlane_6() {
				Geometry geometry = Util3D.createPlane(6, 6);
				assertNotNull(geometry);
		}
		
		/**
		* Test case for {@link Util3