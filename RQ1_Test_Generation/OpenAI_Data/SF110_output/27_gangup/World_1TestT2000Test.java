// World_1Test.java
package gui.gl;

import static java.lang.Math.round;
import static gui.gl.Util3D.*;
import java.awt.geom.*;
import java.awt.Point;
import javax.vecmath.*;
import com.xith3d.scenegraph.*;
import com.xith3d.loaders.texture.*;
import java.util.Iterator;
import map.TileMap;
import map.Path;
import map.PathNotFoundException;
import org.newdawn.xith3d.obj.OBJLoader;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.StreamTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link World}.
* It contains ten unit test cases for the {@link World#intersect(PickRay)} method.
*/
class World_1Test {

		/**
		* Test case 1 for {@link World#intersect(PickRay)}.
		* The test case is a ray that intersects the grid.
		*/
		@Test
		void testIntersect1() {
				World world = new World(10, 10, 1.0f);
				PickRay ray = new PickRay(new Point3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, -1.0f, 0.0f));
				Point3f p = world.intersect(ray);
				assertEquals(0.0f, p.x, 0.0f);
				assertEquals(0.0f, p.y, 0.0f);
				assertEquals(0.0f, p.z, 0.0f);
		}

		/**
		* Test case 2 for {@link World#intersect(PickRay)}.
		* The test case is a ray that intersects the grid.
		*/
		@Test
		void testIntersect2() {
				World world = new World(10, 10, 1.0f);
				PickRay ray = new PickRay(new Point3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 1.0f, 0.0f));
				Point3f p = world.intersect(ray);
				assertEquals(0.0f, p.x, 0.0f);
				assertEquals(0.0f, p.y, 0.0f);
				assertEquals(0.0f, p.z, 0.0f);
		}

		/**
		* Test case 3 for {@link World#intersect(PickRay)}.
		* The test case is a ray that intersects the grid.
		*/
		@Test
		void testIntersect3() {
				World world = new World(10, 10, 1.0f);
				PickRay ray = new PickRay(new Point3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, -1.0f));
				Point3f p = world.intersect(ray);
				assertEquals(0.0f, p.x, 0.0f);
				assertEquals(0.0f, p.y, 0.0f);
				assertEquals(0.0f, p.z, 0.0f);
		}

		/**
		* Test case 4 for {@link World#intersect(PickRay)}.
		* The test case is a ray that intersects the grid.
		*/
		@Test
		void testIntersect4() {
				World world = new World(10, 10, 1.0f);
				PickRay ray = new PickRay(new Point3f(0.0f, 0.0f, 0.0f), new Vector3f(0.0f, 0.0f, 1.0f));
				Point3f p = world.intersect(ray);
				assertEquals(0.0f, p.x, 0.0f);
				assertEquals(0.0f, p.y, 0.0f);
				assertEquals(0.0f, p.z, 0.0f);
		}

		/**
		* Test case 5 for {@link World#intersect(PickRay)}.
		* The test case is a ray that intersects the grid.
		*/
		@Test
		void testIntersect5() {
				World world = new World(10, 10, 1.0f);
				PickRay ray = new PickRay(new Point3f(0.0f, 0.0f, 0.0f), new Vector3f(-1.0f, 0.0f, 0.0f));
				Point3f p = world.intersect(ray);
				assertEquals(0.0f, p.x, 0.0f);
				assertEquals(0.0f, p.y, 0.0f);
				assertEquals(0.0f, p.z, 0.0f);
		}

		/**
		* Test case 6 for {@link World#intersect(PickRay)}.
		* The test case is a ray that intersects the grid.
		*/
		@Test
		void testIntersect6() {
				World world = new World(10, 10, 1.0f);
				PickRay ray = new PickRay(new Point3f(0.0f, 0.0f, 0.0f), new Vector3f(1.0f, 0.0f, 0.0f));
				Point3f p = world.intersect(ray);
				assertEquals(0.0f, p.x, 0.0f);
				assertEquals(0.0f, p.y, 0.0f);
				assertEquals(0.0f, p.z, 0.0f);
		}

		/**
		* Test case 7 for {@link World#intersect(PickRay)}.
		* The test case is a ray that intersects the grid.
		*/
		@Test
		void testIntersect7() {
				World world = new World(10, 10, 1.0f);
				PickRay ray = new PickRay(new Point3f(0.0f, 0.0f, 0.0f), new Vector3f(1.0f, 1.0f, 0.0f));
				Point3f p = world.intersect(ray);
				assertEquals(0.0f, p.x, 0.0f);
				assertEquals(0.0f, p.y, 0.0f);
				assertEquals(0.0f, p.z, 0.0f);
		}

		/**
		* Test case 8 for {@link World#intersect(PickRay)}.
		* The test case is a ray that intersects the grid.
		*/
		@Test
		void testIntersect8() {
				World world = new World(10, 10, 1.0f);
				PickRay ray = new PickRay(new Point3f(0.0f, 0.0f, 0.0f), new Vector3f(1.0f, -1.0f, 0.0f));
				Point3f p = world.intersect(ray);
				assertEquals(0.0f, p.x, 0.0f);
				assertEquals(0.0f, p.y, 0.0f);
				assertEquals(0.0f, p.z, 0.0f);
		}

		/**
		* Test case 9 for {@link World#intersect(PickRay)}.
		* The test case is a ray that intersects the grid.
		*/
		@Test
		void testIntersect9() {
				World world = new World(10, 10, 1.0f);
				PickRay ray = new PickRay(new Point3f(0.0f, 0.0f, 0.0f), new Vector3f(-1.0f, 1.0f, 0.0f));
				Point3f p = world.intersect(ray);
				assertEquals(0.0f, p.x, 0.0f);
				assertEquals(0.0f, p.y, 0.0f);
				assertEquals(0.0f, p.z, 0.0f);
		