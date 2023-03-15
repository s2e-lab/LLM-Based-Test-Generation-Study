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
* It contains ten unit test cases for the {@link Util3D#toWorld(Canvas3D, int, int)} method.
*/
class Util3D_8Test {

		/**
		* Test case for {@link Util3D#toWorld(Canvas3D, int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>canvas: {@link Canvas3D}</li>
		* <li>x: 0</li>
		* <li>y: 0</li>
		* </ul>
		*
		* @see Util3D#toWorld(Canvas3D, int, int)
		*/
		@Test
		void testToWorld_1() {
				Canvas3D canvas = new Canvas3D();
				int x = 0;
				int y = 0;
				Point3f result = Util3D.toWorld(canvas, x, y);
				assertEquals(new Point3f(0.0f, 0.0f, 0.0f), result);
		}
		
		/**
		* Test case for {@link Util3D#toWorld(Canvas3D, int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>canvas: {@link Canvas3D}</li>
		* <li>x: 0</li>
		* <li>y: 1</li>
		* </ul>
		*
		* @see Util3D#toWorld(Canvas3D, int, int)
		*/
		@Test
		void testToWorld_2() {
				Canvas3D canvas = new Canvas3D();
				int x = 0;
				int y = 1;
				Point3f result = Util3D.toWorld(canvas, x, y);
				assertEquals(new Point3f(0.0f, 0.0f, 0.0f), result);
		}
		
		/**
		* Test case for {@link Util3D#toWorld(Canvas3D, int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>canvas: {@link Canvas3D}</li>
		* <li>x: 1</li>
		* <li>y: 0</li>
		* </ul>
		*
		* @see Util3D#toWorld(Canvas3D, int, int)
		*/
		@Test
		void testToWorld_3() {
				Canvas3D canvas = new Canvas3D();
				int x = 1;
				int y = 0;
				Point3f result = Util3D.toWorld(canvas, x, y);
				assertEquals(new Point3f(0.0f, 0.0f, 0.0f), result);
		}
		
		/**
		* Test case for {@link Util3D#toWorld(Canvas3D, int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>canvas: {@link Canvas3D}</li>
		* <li>x: 1</li>
		* <li>y: 1</li>
		* </ul>
		*
		* @see Util3D#toWorld(Canvas3D, int, int)
		*/
		@Test
		void testToWorld_4() {
				Canvas3D canvas = new Canvas3D();
				int x = 1;
				int y = 1;
				Point3f result = Util3D.toWorld(canvas, x, y);
				assertEquals(new Point3f(0.0f, 0.0f, 0.0f), result);
		}
		
		/**
		* Test case for {@link Util3D#toWorld(Canvas3D, int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>canvas: {@link Canvas3D}</li>
		* <li>x: -1</li>
		* <li>y: 0</li>
		* </ul>
		*
		* @see Util3D#toWorld(Canvas3D, int, int)
		*/
		@Test
		void testToWorld_5() {
				Canvas3D canvas = new Canvas3D();
				int x = -1;
				int y = 0;
				Point3f result = Util3D.toWorld(canvas, x, y);
				assertEquals(new Point3f(0.0f, 0.0f, 0.0f), result);
		}
		
		/**
		* Test case for {@link Util3D#toWorld(Canvas3D, int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>canvas: {@link Canvas3D}</li>
		* <li>x: 0</li>
		* <li>y: -1</li>
		* </ul>
		*
		* @see Util3D#toWorld(Canvas3D, int, int)
		*/
		@Test
		void testToWorld_6() {
				Canvas3D canvas = new Canvas3D();
				int x = 0;
				int y = -1;
				Point3f result = Util3D.toWorld(canvas, x, y);
				assertEquals(new Point3f(0.0f, 0.0f, 0.0f), result);
		}
		
		/**
		* Test case for {@link Util3D#toWorld(Canvas3D, int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>canvas: {@link Canvas3D}</li>
		* <li>x: -1</li>
		* <li>y: -1</li>
		* </ul>
		*
		* @see Util3D#toWorld(Canvas3D, int, int)
		*/
		@Test
		void testToWorld_7() {
				Canvas3D canvas = new Canvas3D();
				int x = -1;
				int y = -1;
				Point3f result = Util3D.toWorld(canvas, x, y);
				assertEquals(new Point3f(0.0f, 0.0f, 0.0f), result);
		}
		
		/**
		* Test case for {@link Util3D#toWorld(Canvas3D, int, int)}.
		* It tests the method with the following parameters:
		* <ul>
		* <li>canvas: {@link Canvas3D}</li>
		* <li>x: 1</li>
		* <li>y: -1</li>
		* </ul>
		*
		* @see Util3D#toWorld(Canvas3D, int, int)
		*/
		@Test
		void testToWorld_8() {
				Canvas3D canvas = new Canvas3D();
				int x = 1;
				int y = -1;
				Point3f result = Util3D.toWorld(canvas, x, y);
			