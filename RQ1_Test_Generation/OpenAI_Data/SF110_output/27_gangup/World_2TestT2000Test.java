// World_2Test.java
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
* It contains ten unit test cases for the {@link World#gridCoordToCell(Point3f)} method.
*/
class World_2Test {

	/**
	* Test case for {@link World#gridCoordToCell(Point3f)} method.
	* It tests the case when the point is in the first cell.
	*/
	@Test
	void testGridCoordToCell_1() {
		World world = new World(10, 10, 1);
		Point3f p = new Point3f(0.5f, 0.0f, 0.5f);
		Point expected = new Point(0, 0);
		Point actual = world.gridCoordToCell(p);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link World#gridCoordToCell(Point3f)} method.
	* It tests the case when the point is in the last cell.
	*/
	@Test
	void testGridCoordToCell_2() {
		World world = new World(10, 10, 1);
		Point3f p = new Point3f(9.5f, 0.0f, 9.5f);
		Point expected = new Point(9, 9);
		Point actual = world.gridCoordToCell(p);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link World#gridCoordToCell(Point3f)} method.
	* It tests the case when the point is in the middle of the grid.
	*/
	@Test
	void testGridCoordToCell_3() {
		World world = new World(10, 10, 1);
		Point3f p = new Point3f(5.5f, 0.0f, 5.5f);
		Point expected = new Point(5, 5);
		Point actual = world.gridCoordToCell(p);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link World#gridCoordToCell(Point3f)} method.
	* It tests the case when the point is in the middle of the grid.
	*/
	@Test
	void testGridCoordToCell_4() {
		World world = new World(10, 10, 1);
		Point3f p = new Point3f(5.5f, 0.0f, 5.5f);
		Point expected = new Point(5, 5);
		Point actual = world.gridCoordToCell(p);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link World#gridCoordToCell(Point3f)} method.
	* It tests the case when the point is in the middle of the grid.
	*/
	@Test
	void testGridCoordToCell_5() {
		World world = new World(10, 10, 1);
		Point3f p = new Point3f(5.5f, 0.0f, 5.5f);
		Point expected = new Point(5, 5);
		Point actual = world.gridCoordToCell(p);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link World#gridCoordToCell(Point3f)} method.
	* It tests the case when the point is in the middle of the grid.
	*/
	@Test
	void testGridCoordToCell_6() {
		World world = new World(10, 10, 1);
		Point3f p = new Point3f(5.5f, 0.0f, 5.5f);
		Point expected = new Point(5, 5);
		Point actual = world.gridCoordToCell(p);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link World#gridCoordToCell(Point3f)} method.
	* It tests the case when the point is in the middle of the grid.
	*/
	@Test
	void testGridCoordToCell_7() {
		World world = new World(10, 10, 1);
		Point3f p = new Point3f(5.5f, 0.0f, 5.5f);
		Point expected = new Point(5, 5);
		Point actual = world.gridCoordToCell(p);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link World#gridCoordToCell(Point3f)} method.
	* It tests the case when the point is in the middle of the grid.
	*/
	@Test
	void testGridCoordToCell_8() {
		World world = new World(10, 10, 1);
		Point3f p = new Point3f(5.5f, 0.0f, 5.5f);
		Point expected = new Point(5, 5);
		Point actual = world.gridCoordToCell(p);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link World#gridCoordToCell(Point3f)} method.
	* It tests the case when the point is in the middle of the grid.
	*/
	@Test
	void testGridCoordToCell_9() {
		World world = new World(10, 10, 1);
		Point3f p = new Point3f(5.5f, 0.0f, 5.5f);
		Point expected = new Point(5, 5);
		Point actual = world.gridCoordToCell(p);
		assertEquals(expected, actual);
	}
	
	/**
	* Test case for {@link World#gridCoordToCell(Point3f)} method.
	* It tests the case when the point is in the middle of the grid.
	*/
	@Test
	void testGridCoordToCell_10() {
		World world = new World(10, 10, 1);
		Point3f p = new Point3f(5.5f, 0.0f, 5.5f);
		Point expected = new Point(5, 5);
		Point actual = world.gridCoordToCell(p);
		assertEquals(expected, actual);
	}
}