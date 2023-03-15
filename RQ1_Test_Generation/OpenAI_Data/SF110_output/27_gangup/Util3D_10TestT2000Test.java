// Util3D_10Test.java
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
* It contains ten unit test cases for the {@link Util3D#toScreen(Canvas3D, Point3f)} method.
*/
class Util3D_10Test {

		/**
		* Test case 1 for {@link Util3D#toScreen(Canvas3D, Point3f)}.
		* It tests the method with a point in the center of the screen.
		*/
		@Test
		void testToScreen1() {
				Canvas3D c = new Canvas3D(new JoglRenderPeerImpl());
				Point3f p = new Point3f(0, 0, 0);
				Point3f result = Util3D.toScreen(c, p);
				assertEquals(c.getWidth() / 2, result.x);
				assertEquals(c.getHeight() / 2, result.y);
		}
		
		/**
		* Test case 2 for {@link Util3D#toScreen(Canvas3D, Point3f)}.
		* It tests the method with a point in the upper left corner of the screen.
		*/
		@Test
		void testToScreen2() {
				Canvas3D c = new Canvas3D(new JoglRenderPeerImpl());
				Point3f p = new Point3f(-1, 1, 0);
				Point3f result = Util3D.toScreen(c, p);
				assertEquals(0, result.x);
				assertEquals(0, result.y);
		}
		
		/**
		* Test case 3 for {@link Util3D#toScreen(Canvas3D, Point3f)}.
		* It tests the method with a point in the upper right corner of the screen.
		*/
		@Test
		void testToScreen3() {
				Canvas3D c = new Canvas3D(new JoglRenderPeerImpl());
				Point3f p = new Point3f(1, 1, 0);
				Point3f result = Util3D.toScreen(c, p);
				assertEquals(c.getWidth(), result.x);
				assertEquals(0, result.y);
		}
		
		/**
		* Test case 4 for {@link Util3D#toScreen(Canvas3D, Point3f)}.
		* It tests the method with a point in the lower left corner of the screen.
		*/
		@Test
		void testToScreen4() {
				Canvas3D c = new Canvas3D(new JoglRenderPeerImpl());
				Point3f p = new Point3f(-1, -1, 0);
				Point3f result = Util3D.toScreen(c, p);
				assertEquals(0, result.x);
				assertEquals(c.getHeight(), result.y);
		}
		
		/**
		* Test case 5 for {@link Util3D#toScreen(Canvas3D, Point3f)}.
		* It tests the method with a point in the lower right corner of the screen.
		*/
		@Test
		void testToScreen5() {
				Canvas3D c = new Canvas3D(new JoglRenderPeerImpl());
				Point3f p = new Point3f(1, -1, 0);
				Point3f result = Util3D.toScreen(c, p);
				assertEquals(c.getWidth(), result.x);
				assertEquals(c.getHeight(), result.y);
		}
		
		/**
		* Test case 6 for {@link Util3D#toScreen(Canvas3D, Point3f)}.
		* It tests the method with a point in the center of the screen.
		*/
		@Test
		void testToScreen6() {
				Canvas3D c = new Canvas3D(new JoglRenderPeerImpl());
				Point3f p = new Point3f(0, 0, 0);
				Point3f result = Util3D.toScreen(c, p);
				assertEquals(c.getWidth() / 2, result.x);
				assertEquals(c.getHeight() / 2, result.y);
		}
		
		/**
		* Test case 7 for {@link Util3D#toScreen(Canvas3D, Point3f)}.
		* It tests the method with a point in the center of the screen.
		*/
		@Test
		void testToScreen7() {
				Canvas3D c = new Canvas3D(new JoglRenderPeerImpl());
				Point3f p = new Point3f(0, 0, 0);
				Point3f result = Util3D.toScreen(c, p);
				assertEquals(c.getWidth() / 2, result.x);
				assertEquals(c.getHeight() / 2, result.y);
		}
		
		/**
		* Test case 8 for {@link Util3D#toScreen(Canvas3D, Point3f)}.
		* It tests the method with a point in the center of the screen.
		*/
		@Test
		void testToScreen8() {
				Canvas3D c = new Canvas3D(new JoglRenderPeerImpl());
				Point3f p = new Point3f(0, 0, 0);
				Point3f result = Util3D.toScreen(c, p);
				assertEquals(c.getWidth() / 2, result.x);
				assertEquals(c.getHeight() / 2, result.y);
		}
		
		/**
		* Test case 9 for {@link Util3D#toScreen(Canvas3D, Point3f)}.
		* It tests the method with a point in the center of the screen.
		*/
		@Test
		void testToScreen9() {
				Canvas3D c = new Canvas3D(new JoglRenderPeerImpl());
				Point3f p = new Point3f(0, 0, 0);
				Point3f result = Util3D.toScreen(c, p);
				assertEquals(c.getWidth() / 2, result.x);
				assertEquals(c.getHeight() / 2, result.y);
		}
		
		/**
		* Test case 10 for {@link Util3D#toScreen(Canvas3D, Point3f)}.
		* It tests the method with a point in the center of the screen.
		*/
		@Test
		void testToScreen10() {
				Canvas3D c = new Canvas3D(new JoglRenderPeerImpl());
				Point3f p = new Point3f(0, 0, 0);
				Point3f result = Util3D.toScreen(c, p);
				assertEquals(c.getWidth() / 2, result.x);
				assertEquals(c.getHeight() / 2, result.y);
		}
}

// Util3D_11Test.java
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
import com.xith3d.