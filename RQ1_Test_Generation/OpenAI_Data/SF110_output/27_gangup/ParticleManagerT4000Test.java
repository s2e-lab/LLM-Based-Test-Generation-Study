// ParticleManagerTest.java
package gui.gl;

import com.xith3d.scenegraph.*;
import com.xith3d.datatypes.*;
import java.util.LinkedList;
import java.util.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParticleManager}.
* It contains ten unit test cases for the {@link ParticleManager#createParticleSystem(int, Coord3f, int, int)} method.
*/
class ParticleManagerTest {

		/**
		* Test case 1 for {@link ParticleManager#createParticleSystem(int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object.
		*/
		@Test
		void testCreateParticleSystem1() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = pm.createParticleSystem(ParticleSystem.TYPE_SMOKE, new Coord3f(0, 0, 0), 100, 100);
				assertTrue(ps instanceof ParticleSystem);
		}
		
		/**
		* Test case 2 for {@link ParticleManager#createParticleSystem(int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct type.
		*/
		@Test
		void testCreateParticleSystem2() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = pm.createParticleSystem(ParticleSystem.TYPE_SMOKE, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(ParticleSystem.TYPE_SMOKE, ps.getType());
		}
		
		/**
		* Test case 3 for {@link ParticleManager#createParticleSystem(int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct location.
		*/
		@Test
		void testCreateParticleSystem3() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = pm.createParticleSystem(ParticleSystem.TYPE_SMOKE, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(new Coord3f(0, 0, 0), ps.getLocation());
		}
		
		/**
		* Test case 4 for {@link ParticleManager#createParticleSystem(int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct particle count.
		*/
		@Test
		void testCreateParticleSystem4() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = pm.createParticleSystem(ParticleSystem.TYPE_SMOKE, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(100, ps.getParticleCount());
		}
		
		/**
		* Test case 5 for {@link ParticleManager#createParticleSystem(int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct lifetime.
		*/
		@Test
		void testCreateParticleSystem5() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = pm.createParticleSystem(ParticleSystem.TYPE_SMOKE, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(100, ps.getLifetime());
		}
		
		/**
		* Test case 6 for {@link ParticleManager#createParticleSystem(int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct type.
		*/
		@Test
		void testCreateParticleSystem6() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = pm.createParticleSystem(ParticleSystem.TYPE_FIRE, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(ParticleSystem.TYPE_FIRE, ps.getType());
		}
		
		/**
		* Test case 7 for {@link ParticleManager#createParticleSystem(int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct type.
		*/
		@Test
		void testCreateParticleSystem7() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = pm.createParticleSystem(ParticleSystem.TYPE_EXPLOSION, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(ParticleSystem.TYPE_EXPLOSION, ps.getType());
		}
		
		/**
		* Test case 8 for {@link ParticleManager#createParticleSystem(int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct type.
		*/
		@Test
		void testCreateParticleSystem8() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = pm.createParticleSystem(ParticleSystem.TYPE_SPARK, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(ParticleSystem.TYPE_SPARK, ps.getType());
		}
		
		/**
		* Test case 9 for {@link ParticleManager#createParticleSystem(int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct type.
		*/
		@Test
		void testCreateParticleSystem9() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = pm.createParticleSystem(ParticleSystem.TYPE_SMOKE_TRAIL, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(ParticleSystem.TYPE_SMOKE_TRAIL, ps.getType());
		}
		
		/**
		* Test case 10 for {@link ParticleManager#createParticleSystem(int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct type.
		*/
		@Test
		void testCreateParticleSystem10() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = pm.createParticleSystem(ParticleSystem.TYPE_SPARK_TRAIL, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(ParticleSystem.TYPE_SPARK_TRAIL, ps.getType());
		}
}

// ParticleSystem.java
/* $Id: ParticleSystem.java,v 1.4 2004/05/04 19:42:07 emill Exp $
 *
 *
 * @author Emil Lundstr�m <emill@kth.se>
 */
package gui.gl;

import com.xith3d.scenegraph.*;
import com.xith3d.datatypes.*;
import java.util.LinkedList;
import java.util.Stack;

/**
 * A particle system manages a set of particles.
 */
public class ParticleSystem extends TransformGroup {

    public static final int TYPE_SMOKE = 0;
    public static final int TYPE_FIRE = 1;
    public static final int TYPE_EXPLOSION = 2;
    public static final int TYPE_SPARK = 3;
    public static final int TYPE_SMOKE_TRAIL = 4;
    public static final int TYPE_SPARK_TRAIL = 5;

    private ParticleManager manager;

    private int type;
    private Coord3f location;
    private int particleCount;
    private int lifetime;

    private LinkedList<Particle> particles;

    private TransformGroup particleGroup = new TransformGroup();

    /**
     * Creates a new particle system.
     *
     * @param m The particle manager that manages this system.
     * @param type The type of the new system, as specified in
     * ParticleSystem constants.
     * @param l The coordinate of this the new ParticleSystem in this
     * ParticleManager's coordinate system, which typically should be
     * equal to the world system.
     * @param pc The desired particle count. If a unused particle
     * system with the correct particle count is found, it will be
     * used. Otherwise, a new one is allocated.
     * @param lt The lifetime of the particle system.
     */
    public ParticleSystem(ParticleManager m, int type, Coord3f l, int pc, int lt) {
        manager = m;
        newSystem(type, l, lt);
        particles = new LinkedList<Particle>();
        for (int i = 0; i < pc; i++) {
            particles.add(new Particle(this));
        }
        particleGroup.addChildren(particles);
        addChild(particleGroup);
    }

    /**
     * Creates a new particle system.
     *
     * @param type The type of the new system, as specified in
     * ParticleSystem constants.
     * @param l The coordinate of this the new ParticleSystem in this
     * ParticleManager's coordinate system, which typically should be
     * equal to the world system.
     * @param lt The lifetime of the particle system.
     */
    public void newSystem(int type, Coord3f l, int lt) {
        this.type = type;
        location = l;
        lifetime = lt;
        setTransform(new Transform3D(new Matrix4f(1, 0, 0, l.x,
                0, 1, 0, l.y,
                0, 0, 1, l.z,
                0, 0, 0, 1)));
    }

    /**
     * Returns the type of this particle system.
     */
    public int getType() {
        return type;
    }

    /**
     * Returns the location of this particle system.
     */
    public Coord3f getLocation() {
        return location;
    }

    /**
     * Returns the particle count of this particle system.
     */
    public int getParticleCount() {
        return particleCount;
    }

    /**
     * Returns the lifetime of this particle system.
     */
    public int getLifetime() {
        return lifetime;
    }

    /**
     * Updates the particle system.
     *
     * @param c The transformation used for particle
     * billboarding. Translation is omitted.
     * @return True if the system is still alive, false otherwise.
     */
    public boolean updateSystem(Transform3D c) {
        for (Particle p : particles) {
            p.updateParticle(c);
        }
        lifetime--;
        return lifetime > 0;
    }
}

// ParticleSystemTest.java
package gui.gl;

import com.xith3d.scenegraph.*;
import com.xith3d.datatypes.*;
import java.util.LinkedList;
import java.util.Stack;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParticleSystem}.
* It contains ten unit test cases for the {@link ParticleSystem#ParticleSystem(ParticleManager, int, Coord3f, int, int)} method.
*/
class ParticleSystemTest {
		
		/**
		* Test case 1 for {@link ParticleSystem#ParticleSystem(ParticleManager, int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object.
		*/
		@Test
		void testParticleSystem1() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(pm, ParticleSystem.TYPE_SMOKE, new Coord3f(0, 0, 0), 100, 100);
				assertTrue(ps instanceof ParticleSystem);
		}
		
		/**
		* Test case 2 for {@link ParticleSystem#ParticleSystem(ParticleManager, int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct type.
		*/
		@Test
		void testParticleSystem2() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(pm, ParticleSystem.TYPE_SMOKE, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(ParticleSystem.TYPE_SMOKE, ps.getType());
		}
		
		/**
		* Test case 3 for {@link ParticleSystem#ParticleSystem(ParticleManager, int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct location.
		*/
		@Test
		void testParticleSystem3() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(pm, ParticleSystem.TYPE_SMOKE, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(new Coord3f(0, 0, 0), ps.getLocation());
		}
		
		/**
		* Test case 4 for {@link ParticleSystem#ParticleSystem(ParticleManager, int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct particle count.
		*/
		@Test
		void testParticleSystem4() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(pm, ParticleSystem.TYPE_SMOKE, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(100, ps.getParticleCount());
		}
		
		/**
		* Test case 5 for {@link ParticleSystem#ParticleSystem(ParticleManager, int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct lifetime.
		*/
		@Test
		void testParticleSystem5() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(pm, ParticleSystem.TYPE_SMOKE, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(100, ps.getLifetime());
		}
		
		/**
		* Test case 6 for {@link ParticleSystem#ParticleSystem(ParticleManager, int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct type.
		*/
		@Test
		void testParticleSystem6() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(pm, ParticleSystem.TYPE_FIRE, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(ParticleSystem.TYPE_FIRE, ps.getType());
		}
		
		/**
		* Test case 7 for {@link ParticleSystem#ParticleSystem(ParticleManager, int, Coord3f, int, int)}.
		* It tests if the method returns a {@link ParticleSystem} object with the correct type.
		*/
		@Test
		void testParticleSystem7() {
				ParticleManager pm = new ParticleManager();
				ParticleSystem ps = new ParticleSystem(pm, ParticleSystem.TYPE_EXPLOSION, new Coord3f(0, 0, 0), 100, 100);
				assertEquals(ParticleSystem.TYPE_EXPLOSION, ps.getType());
		}
		
	