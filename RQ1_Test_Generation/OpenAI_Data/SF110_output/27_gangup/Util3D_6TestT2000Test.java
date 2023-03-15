// Util3D_6Test.java
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
* It contains ten unit test cases for the {@link Util3D#createCoordAxes(float)} method.
*/
class Util3D_6Test {

		/**
		* Test case for {@link Util3D#createCoordAxes(float)}.
		* It tests if the method returns a {@link Geometry} object.
		*/
		@Test
		void testCreateCoordAxes() {
				Geometry geom = Util3D.createCoordAxes(1.0f);
				assertTrue(geom instanceof Geometry);
		}
		
		/**
		* Test case for {@link Util3D#createCoordAxes(float)}.
		* It tests if the method returns a {@link Geometry} object.
		*/
		@Test
		void testCreateCoordAxes2() {
				Geometry geom = Util3D.createCoordAxes(2.0f);
				assertTrue(geom instanceof Geometry);
		}
		
		/**
		* Test case for {@link Util3D#createCoordAxes(float)}.
		* It tests if the method returns a {@link Geometry} object.
		*/
		@Test
		void testCreateCoordAxes3() {
				Geometry geom = Util3D.createCoordAxes(3.0f);
				assertTrue(geom instanceof Geometry);
		}
		
		/**
		* Test case for {@link Util3D#createCoordAxes(float)}.
		* It tests if the method returns a {@link Geometry} object.
		*/
		@Test
		void testCreateCoordAxes4() {
				Geometry geom = Util3D.createCoordAxes(4.0f);
				assertTrue(geom instanceof Geometry);
		}
		
		/**
		* Test case for {@link Util3D#createCoordAxes(float)}.
		* It tests if the method returns a {@link Geometry} object.
		*/
		@Test
		void testCreateCoordAxes5() {
				Geometry geom = Util3D.createCoordAxes(5.0f);
				assertTrue(geom instanceof Geometry);
		}
		
		/**
		* Test case for {@link Util3D#createCoordAxes(float)}.
		* It tests if the method returns a {@link Geometry} object.
		*/
		@Test
		void testCreateCoordAxes6() {
				Geometry geom = Util3D.createCoordAxes(6.0f);
				assertTrue(geom instanceof Geometry);
		}
		
		/**
		* Test case for {@link Util3D#createCoordAxes(float)}.
		* It tests if the method returns a {@link Geometry} object.
		*/
		@Test
		void testCreateCoordAxes7() {
				Geometry geom = Util3D.createCoordAxes(7.0f);
				assertTrue(geom instanceof Geometry);
		}
		
		/**
		* Test case for {@link Util3D#createCoordAxes(float)}.
		* It tests if the method returns a {@link Geometry} object.
		*/
		@Test
		void testCreateCoordAxes8() {
				Geometry geom = Util3D.createCoordAxes(8.0f);
				assertTrue(geom instanceof Geometry);
		}
		
		/**
		* Test case for {@link Util3D#createCoordAxes(float)}.
		* It tests if the method returns a {@link Geometry} object.
		*/
		@Test
		void testCreateCoordAxes9() {
				Geometry geom = Util3D.createCoordAxes(9.0f);
				assertTrue(geom instanceof Geometry);
		}
		
		/**
		* Test case for {@link Util3D#createCoordAxes(float)}.
		* It tests if the method returns a {@link Geometry} object.
		*/
		@Test
		void testCreateCoordAxes10() {
				Geometry geom = Util3D.createCoordAxes(10.0f);
				assertTrue(geom instanceof Geometry);
		}
}

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
		* Test case for {@link Util3D#createGrid(int, int, float)}.
		* It tests if the method returns a {@link Shape3D} object.
		*/
		@Test
		void testCreateGrid() {
				Shape3D shape = Util3D.createGrid(1, 1, 1.0f);
				assertTrue(shape instanceof Shape3D);
		}
		
		/**
		* Test case for {@link Util3D#createGrid(int, int, float)}.
		* It tests if the method returns a {@link Shape3D} object.
		*/
		@Test
		void testCreateGrid2() {
				Shape3D shape = Util3D.createGrid(2, 2, 2.0f);
				assertTrue(shape instanceof Shape3D);
		}
		
		/**
		* Test case for {@link Util3D#createGrid(int, int, float)}.
		* It tests if the method returns a {@link Shape3D} object.
		*/
		@Test
		void testCreateGrid3() {
				Shape3D shape = Util3D.createGrid(3, 3, 3.0f);
				assertTrue(shape instanceof Shape3D);
		}
		
		/**
		* Test case for {@link Util3D#createGrid(int, int, float)}.
		* It tests if the method returns a {@link Shape3D} object.
		*/
		@Test
		void testCreateGrid4() {
				Shape3D shape = Util3D.createGrid(4, 4, 4.0f);
				assertTrue(shape instanceof Shape3D);
		}
		
		/**
		* Test case for {@link Util3D#createGrid(int, int, float)}.
		* It tests if the method returns a {@link Shape3D} object.
		*/
		@Test
		void testCreateGrid5() {
				Shape3D shape = Util3D.createGrid(5, 5, 5.0f);
