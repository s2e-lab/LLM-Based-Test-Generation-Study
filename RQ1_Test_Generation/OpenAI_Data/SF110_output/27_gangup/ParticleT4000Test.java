// ParticleTest.java
package gui.gl;

import javax.vecmath.*;
import com.xith3d.scenegraph.*;
import com.xith3d.datatypes.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Particle}.
* It contains ten unit test cases for the {@link Particle#updateParticle()} method.
*/
class ParticleTest {

		/**
		* Test case for {@link Particle#updateParticle()}.
		* It tests if the particle is still alive after one update tick.
		*/
		@Test
		void testUpdateParticle() {
				Particle particle = new Particle();
				particle.newParticle(new ParticleSystem(), new Coord3f(), new Vector3f(), new Vector3f(), new Color4f(), 1, 1);
				assertTrue(particle.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()}.
		* It tests if the particle is still alive after two update ticks.
		*/
		@Test
		void testUpdateParticle2() {
				Particle particle = new Particle();
				particle.newParticle(new ParticleSystem(), new Coord3f(), new Vector3f(), new Vector3f(), new Color4f(), 2, 1);
				particle.updateParticle();
				assertTrue(particle.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()}.
		* It tests if the particle is still alive after three update ticks.
		*/
		@Test
		void testUpdateParticle3() {
				Particle particle = new Particle();
				particle.newParticle(new ParticleSystem(), new Coord3f(), new Vector3f(), new Vector3f(), new Color4f(), 3, 1);
				particle.updateParticle();
				particle.updateParticle();
				assertTrue(particle.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()}.
		* It tests if the particle is still alive after four update ticks.
		*/
		@Test
		void testUpdateParticle4() {
				Particle particle = new Particle();
				particle.newParticle(new ParticleSystem(), new Coord3f(), new Vector3f(), new Vector3f(), new Color4f(), 4, 1);
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				assertTrue(particle.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()}.
		* It tests if the particle is still alive after five update ticks.
		*/
		@Test
		void testUpdateParticle5() {
				Particle particle = new Particle();
				particle.newParticle(new ParticleSystem(), new Coord3f(), new Vector3f(), new Vector3f(), new Color4f(), 5, 1);
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				assertTrue(particle.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()}.
		* It tests if the particle is still alive after six update ticks.
		*/
		@Test
		void testUpdateParticle6() {
				Particle particle = new Particle();
				particle.newParticle(new ParticleSystem(), new Coord3f(), new Vector3f(), new Vector3f(), new Color4f(), 6, 1);
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				assertTrue(particle.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()}.
		* It tests if the particle is still alive after seven update ticks.
		*/
		@Test
		void testUpdateParticle7() {
				Particle particle = new Particle();
				particle.newParticle(new ParticleSystem(), new Coord3f(), new Vector3f(), new Vector3f(), new Color4f(), 7, 1);
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				assertTrue(particle.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()}.
		* It tests if the particle is still alive after eight update ticks.
		*/
		@Test
		void testUpdateParticle8() {
				Particle particle = new Particle();
				particle.newParticle(new ParticleSystem(), new Coord3f(), new Vector3f(), new Vector3f(), new Color4f(), 8, 1);
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				assertTrue(particle.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()}.
		* It tests if the particle is still alive after nine update ticks.
		*/
		@Test
		void testUpdateParticle9() {
				Particle particle = new Particle();
				particle.newParticle(new ParticleSystem(), new Coord3f(), new Vector3f(), new Vector3f(), new Color4f(), 9, 1);
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				assertTrue(particle.updateParticle());
		}
		
		/**
		* Test case for {@link Particle#updateParticle()}.
		* It tests if the particle is still alive after ten update ticks.
		*/
		@Test
		void testUpdateParticle10() {
				Particle particle = new Particle();
				particle.newParticle(new ParticleSystem(), new Coord3f(), new Vector3f(), new Vector3f(), new Color4f(), 10, 1);
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				particle.updateParticle();
				assertTrue(particle.updateParticle());
		}
}