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
 * @author Emil Lundstr�m <emill@kth.se>
 */
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

/**
 * A particle in the particle engine.
 */
public class Particle {

    public Point3f[] particleCoordinates = { new Point3f(), new Point3f(), new Point3f(), new Point3f() };

    public Color4f color = new Color4f();

    public Vector3f speed = new Vector3f();

    public Vector3f acceleration = new Vector3f();

    public int lifetime = 0;

    public int age = 0;

    public float fadeSpeed = 1f;

    /**
     * Creates a new particle.
     */
    public Particle() {
    }

    /**
     * Sets up a new particle.
     *
     * @param ps The particle system this particle belongs to.
     * @param loc The world coordinate where this particle spawns.
     * @param sp The initial speed of this particle.
     * @param ac The acceleration of this particle.
     * @param c The color of this particle.
     * @param lt The lifetime of this particle.
     * @param fs The fade speed of this particle.
     */
    public void newParticle(ParticleSystem ps, Coord3f loc, Vector3f sp, Vector3f ac, Color4f c, int lt, float fs) {
        speed.set(sp);
        acceleration.set(ac);
        color.set(c);
        lifetime = lt;
        age = 0;
        fadeSpeed = fs;
        particleCoordinates[0].set(loc.x + ps.particleSize, loc.y + ps.particleSize, loc.z);
        particleCoordinates[1].set(loc.x - ps.particleSize, loc.y + ps.particleSize, loc.z);
        particleCoordinates[2].set(loc.x + ps.particleSize, loc.y - ps.particleSize, loc.z);
        particleCoordinates[3].set(loc.x - ps.particleSize, loc.y - ps.particleSize, loc.z);
    }

    /**
     * Updates this particle.
     */
    public boolean updateParticle() {
        if (lifetime == 0 || age++ < lifetime) {
            speed.add(acceleration);
            for (int i = 0; i < 4; i++) {
                particleCoordinates[i].add(speed);
            }
            color.w -= fadeSpeed;
            return true;
        }
        return false;
    }
}

// ParticleTest.java
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
* Test class of {@link Particle}.
* It contains ten unit test cases for the {@link Particle#updateParticle()} method.
*/
class ParticleTest {
		
		/**
		* Test case for {@link Particle#updateParticle()} method.
		* It tests if the method returns true when the age is less than the lifetime.
		*/
		@Test
		void testUpdateParticle_ageLessThanLifetime() {
				Particle p = new Particle();
				p.lifetime = 100;
				p.age = 99;
				assertTrue(p.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()} method.
		* It tests if the method returns false when the age is equal to the lifetime.
		*/
		@Test
		void testUpdateParticle_ageEqualToLifetime() {
				Particle p = new Particle();
				p.lifetime = 100;
				p.age = 100;
				assertFalse(p.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()} method.
		* It tests if the method returns false when the age is greater than the lifetime.
		*/
		@Test
		void testUpdateParticle_ageGreaterThanLifetime() {
				Particle p = new Particle();
				p.lifetime = 100;
				p.age = 101;
				assertFalse(p.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()} method.
		* It tests if the method returns true when the age is less than the lifetime and the lifetime is 0.
		*/
		@Test
		void testUpdateParticle_ageLessThanLifetime_lifetimeZero() {
				Particle p = new Particle();
				p.lifetime = 0;
				p.age = 99;
				assertTrue(p.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()} method.
		* It tests if the method returns true when the age is equal to the lifetime and the lifetime is 0.
		*/
		@Test
		void testUpdateParticle_ageEqualToLifetime_lifetimeZero() {
				Particle p = new Particle();
				p.lifetime = 0;
				p.age = 100;
				assertTrue(p.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()} method.
		* It tests if the method returns true when the age is greater than the lifetime and the lifetime is 0.
		*/
		@Test
		void testUpdateParticle_ageGreaterThanLifetime_lifetimeZero() {
				Particle p = new Particle();
				p.lifetime = 0;
				p.age = 101;
				assertTrue(p.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()} method.
		* It tests if the method returns true when the age is less than the lifetime and the lifetime is -1.
		*/
		@Test
		void testUpdateParticle_ageLessThanLifetime_lifetimeMinusOne() {
				Particle p = new Particle();
				p.lifetime = -1;
				p.age = 99;
				assertTrue(p.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()} method.
		* It tests if the method returns true when the age is equal to the lifetime and the lifetime is -1.
		*/
		@Test
		void testUpdateParticle_ageEqualToLifetime_lifetimeMinusOne() {
				Particle p = new Particle();
				p.lifetime = -1;
				p.age = 100;
				assertTrue(p.updateParticle());
	