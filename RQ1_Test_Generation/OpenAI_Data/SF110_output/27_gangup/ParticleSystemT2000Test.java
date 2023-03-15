// ParticleSystemTest.java
package gui.gl;

import javax.vecmath.*;
import com.xith3d.scenegraph.*;
import com.xith3d.datatypes.*;
import com.xith3d.loaders.texture.TextureLoader;
import com.xith3d.image.*;
import java.util.Random;
import javax.imageio.ImageIO;
import java.io.File;
import java.io.IOException;
import java.awt.image.BufferedImage;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParticleSystem}.
* It contains ten unit test cases for the {@link ParticleSystem#updateSystem(Transform3D)} method.
*/
class ParticleSystemTest {

		/**
		* Test case for {@link ParticleSystem#updateSystem(Transform3D)} method.
		* It tests if the method returns true when the age is less than the lifetime.
		*/
		@Test
		void testUpdateSystem_ageLessThanLifetime() {
				ParticleManager m = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(m, 0, new Coord3f(), 1, 100);
				ps.age = 99;
				assertTrue(ps.updateSystem(new Transform3D()));
		}
		
		/**
		* Test case for {@link ParticleSystem#updateSystem(Transform3D)} method.
		* It tests if the method returns false when the age is equal to the lifetime.
		*/
		@Test
		void testUpdateSystem_ageEqualToLifetime() {
				ParticleManager m = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(m, 0, new Coord3f(), 1, 100);
				ps.age = 100;
				assertFalse(ps.updateSystem(new Transform3D()));
		}
		
		/**
		* Test case for {@link ParticleSystem#updateSystem(Transform3D)} method.
		* It tests if the method returns false when the age is greater than the lifetime.
		*/
		@Test
		void testUpdateSystem_ageGreaterThanLifetime() {
				ParticleManager m = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(m, 0, new Coord3f(), 1, 100);
				ps.age = 101;
				assertFalse(ps.updateSystem(new Transform3D()));
		}
		
		/**
		* Test case for {@link ParticleSystem#updateSystem(Transform3D)} method.
		* It tests if the method returns true when the age is less than the lifetime and the lifetime is 0.
		*/
		@Test
		void testUpdateSystem_ageLessThanLifetime_lifetimeZero() {
				ParticleManager m = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(m, 0, new Coord3f(), 1, 0);
				ps.age = 99;
				assertTrue(ps.updateSystem(new Transform3D()));
		}
		
		/**
		* Test case for {@link ParticleSystem#updateSystem(Transform3D)} method.
		* It tests if the method returns true when the age is equal to the lifetime and the lifetime is 0.
		*/
		@Test
		void testUpdateSystem_ageEqualToLifetime_lifetimeZero() {
				ParticleManager m = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(m, 0, new Coord3f(), 1, 0);
				ps.age = 100;
				assertTrue(ps.updateSystem(new Transform3D()));
		}
		
		/**
		* Test case for {@link ParticleSystem#updateSystem(Transform3D)} method.
		* It tests if the method returns true when the age is greater than the lifetime and the lifetime is 0.
		*/
		@Test
		void testUpdateSystem_ageGreaterThanLifetime_lifetimeZero() {
				ParticleManager m = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(m, 0, new Coord3f(), 1, 0);
				ps.age = 101;
				assertTrue(ps.updateSystem(new Transform3D()));
		}
		
		/**
		* Test case for {@link ParticleSystem#updateSystem(Transform3D)} method.
		* It tests if the method returns true when the age is less than the lifetime and the lifetime is -1.
		*/
		@Test
		void testUpdateSystem_ageLessThanLifetime_lifetimeMinusOne() {
				ParticleManager m = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(m, 0, new Coord3f(), 1, -1);
				ps.age = 99;
				assertTrue(ps.updateSystem(new Transform3D()));
		}
		
		/**
		* Test case for {@link ParticleSystem#updateSystem(Transform3D)} method.
		* It tests if the method returns true when the age is equal to the lifetime and the lifetime is -1.
		*/
		@Test
		void testUpdateSystem_ageEqualToLifetime_lifetimeMinusOne() {
				ParticleManager m = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(m, 0, new Coord3f(), 1, -1);
				ps.age = 100;
				assertTrue(ps.updateSystem(new Transform3D()));
		}
		
		/**
		* Test case for {@link ParticleSystem#updateSystem(Transform3D)} method.
		* It tests if the method returns true when the age is greater than the lifetime and the lifetime is -1.
		*/
		@Test
		void testUpdateSystem_ageGreaterThanLifetime_lifetimeMinusOne() {
				ParticleManager m = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(m, 0, new Coord3f(), 1, -1);
				ps.age = 101;
				assertTrue(ps.updateSystem(new Transform3D()));
		}
		
		/**
		* Test case for {@link ParticleSystem#updateSystem(Transform3D)} method.
		* It tests if the method returns true when the age is less than the lifetime and the lifetime is -2.
		*/
		@Test
		void testUpdateSystem_ageLessThanLifetime_lifetimeMinusTwo() {
				ParticleManager m = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(m, 0, new Coord3f(), 1, -2);
				ps.age = 99;
				assertTrue(ps.updateSystem(new Transform3D()));
		}
		
		/**
		* Test case for {@link ParticleSystem#updateSystem(Transform3D)} method.
		* It tests if the method returns true when the age is equal to the lifetime and the lifetime is -2.
		*/
		@Test
		void testUpdateSystem_ageEqualToLifetime_lifetimeMinusTwo() {
				ParticleManager m = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(m, 0, new Coord3f(), 1, -2);
				ps.age = 100;
				assertTrue(ps.updateSystem(new Transform3D()));
		}
		
		/**
		* Test case for {@link ParticleSystem#updateSystem(Transform3D)} method.
		* It tests if the method returns true when the age is greater than the lifetime and the lifetime is -2.
		*/
		@Test
		void testUpdateSystem_ageGreaterThanLifetime_lifetimeMinusTwo() {
				ParticleManager m = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(m, 0, new Coord3f(), 1, -2);
				ps.age = 101;
				assertTrue(ps.updateSystem(new Transform3D()));
		}
}

// Particle.java
/* $Id: Particle.java,v 1.6 2004/05/05 11:55:12 emill Exp $
 *
 *
 * @author Emil Lundstr�m <emill@kth.se