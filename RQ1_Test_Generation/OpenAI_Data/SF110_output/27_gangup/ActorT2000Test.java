// ActorTest.java
package gui.gl;

import static java.lang.Math.abs;
import static java.lang.Math.sin;
import static java.lang.Math.cos;
import static java.lang.Math.atan2;
import static java.lang.Math.PI;
import static com.xith3d.image.DirectBufferedImage.getDirectImageRGBA;
import java.io.FileInputStream;
import java.awt.geom.*;
import java.util.Enumeration;
import java.util.Vector;
import javax.vecmath.*;
import state.Player;
import com.xith3d.image.DirectBufferedImage;
import com.xith3d.scenegraph.*;
import com.xith3d.datatypes.Coord3f;
import com.xith3d.utility.interpolate.*;
import com.xith3d.loaders.texture.*;
import org.newdawn.xith3d.obj.OBJLoader;
import org.newdawn.xith3d.loaders.md2.MD2Loader;
import org.newdawn.xith3d.loaders.md2.MD2Model;
import org.newdawn.xith3d.loaders.md2.MD2ModelInstance;
import org.newdawn.xith3d.loaders.ModelLoadingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Actor}.
* It contains ten unit test cases for the {@link Actor#getBearing(Tuple3f)} method.
*/
class ActorTest {

		/**
		* Test case for {@link Actor#getBearing(Tuple3f)} method.
		* It tests the case when the target is in the first quadrant.
		*/
		@Test
		void testGetBearingFirstQuadrant() {
				Actor actor = new Actor("test");
				actor.setPosition(new Point3f(0, 0, 0));
				actor.setHeading(new Vector3f(0, 0, 0));
				Point3f target = new Point3f(1, 0, 1);
				float bearing = actor.getBearing(target);
				assertEquals(PI / 4, bearing, 0.001);
		}
		
		/**
		* Test case for {@link Actor#getBearing(Tuple3f)} method.
		* It tests the case when the target is in the second quadrant.
		*/
		@Test
		void testGetBearingSecondQuadrant() {
				Actor actor = new Actor("test");
				actor.setPosition(new Point3f(0, 0, 0));
				actor.setHeading(new Vector3f(0, 0, 0));
				Point3f target = new Point3f(-1, 0, 1);
				float bearing = actor.getBearing(target);
				assertEquals(3 * PI / 4, bearing, 0.001);
		}
		
		/**
		* Test case for {@link Actor#getBearing(Tuple3f)} method.
		* It tests the case when the target is in the third quadrant.
		*/
		@Test
		void testGetBearingThirdQuadrant() {
				Actor actor = new Actor("test");
				actor.setPosition(new Point3f(0, 0, 0));
				actor.setHeading(new Vector3f(0, 0, 0));
				Point3f target = new Point3f(-1, 0, -1);
				float bearing = actor.getBearing(target);
				assertEquals(-3 * PI / 4, bearing, 0.001);
		}
		
		/**
		* Test case for {@link Actor#getBearing(Tuple3f)} method.
		* It tests the case when the target is in the fourth quadrant.
		*/
		@Test
		void testGetBearingFourthQuadrant() {
				Actor actor = new Actor("test");
				actor.setPosition(new Point3f(0, 0, 0));
				actor.setHeading(new Vector3f(0, 0, 0));
				Point3f target = new Point3f(1, 0, -1);
				float bearing = actor.getBearing(target);
				assertEquals(-PI / 4, bearing, 0.001);
		}
		
		/**
		* Test case for {@link Actor#getBearing(Tuple3f)} method.
		* It tests the case when the target is in the first quadrant and the actor is rotated.
		*/
		@Test
		void testGetBearingFirstQuadrantRotated() {
				Actor actor = new Actor("test");
				actor.setPosition(new Point3f(0, 0, 0));
				actor.setHeading(new Vector3f(0, PI / 4, 0));
				Point3f target = new Point3f(1, 0, 1);
				float bearing = actor.getBearing(target);
				assertEquals(PI / 4, bearing, 0.001);
		}
		
		/**
		* Test case for {@link Actor#getBearing(Tuple3f)} method.
		* It tests the case when the target is in the second quadrant and the actor is rotated.
		*/
		@Test
		void testGetBearingSecondQuadrantRotated() {
				Actor actor = new Actor("test");
				actor.setPosition(new Point3f(0, 0, 0));
				actor.setHeading(new Vector3f(0, PI / 4, 0));
				Point3f target = new Point3f(-1, 0, 1);
				float bearing = actor.getBearing(target);
				assertEquals(3 * PI / 4, bearing, 0.001);
		}
		
		/**
		* Test case for {@link Actor#getBearing(Tuple3f)} method.
		* It tests the case when the target is in the third quadrant and the actor is rotated.
		*/
		@Test
		void testGetBearingThirdQuadrantRotated() {
				Actor actor = new Actor("test");
				actor.setPosition(new Point3f(0, 0, 0));
				actor.setHeading(new Vector3f(0, PI / 4, 0));
				Point3f target = new Point3f(-1, 0, -1);
				float bearing = actor.getBearing(target);
				assertEquals(-3 * PI / 4, bearing, 0.001);
		}
		
		/**
		* Test case for {@link Actor#getBearing(Tuple3f)} method.
		* It tests the case when the target is in the fourth quadrant and the actor is rotated.
		*/
		@Test
		void testGetBearingFourthQuadrantRotated() {
				Actor actor = new Actor("test");
				actor.setPosition(new Point3f(0, 0, 0));
				actor.setHeading(new Vector3f(0, PI / 4, 0));
				Point3f target = new Point3f(1, 0, -1);
				float bearing = actor.getBearing(target);
				assertEquals(-PI / 4, bearing, 0.001);
		}
		
		/**
		* Test case for {@link Actor#getBearing(Tuple3f)} method.
		* It tests the case when the target is in the first quadrant and the actor is rotated.
		*/
		@Test
		void testGetBearingFirstQuadrantRotated2() {
				Actor actor = new Actor("test");
				actor.setPosition(new Point3f(0, 0, 0));
				actor.setHeading(new Vector3f(0, -PI / 4, 0));
				Point3f target = new Point3f(1, 0, 1);
				float bearing = actor.getBearing(target);
				assertEquals(PI / 4, bearing, 0.001);
		}
		
		/**
		* Test case for {@link Actor#getBearing(Tuple3f)} method.
		* It tests the case when the target is in the second quadrant and the actor is rotated.
		*/
		@Test
		void testGetBearingSecondQuadrantRotated2() {
				Actor actor = new Actor("test");
				actor.setPosition(new Point3f(0, 0, 0));
				actor.setHeading(new Vector3f(0, -PI / 4, 0));
				Point3f target = new Point3f(-1, 0, 1);
				float bearing = actor.getBearing(target);
				assertEquals(3 * PI / 4, bearing, 0.001);
		}
		
		/**
		* Test case for {@link Actor#getBearing(Tuple3f)} method.
		* It tests the case when the target is in the third quadrant and the actor is rotated.
		*/
		@