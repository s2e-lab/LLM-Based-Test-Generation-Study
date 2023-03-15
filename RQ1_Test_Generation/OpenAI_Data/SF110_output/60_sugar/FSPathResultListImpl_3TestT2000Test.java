// FSPathResultListImpl_3Test.java
/*
 * FSPathResultListImpl.java
 *
 * Created on 08 April 2008, 18:00
 *
 */
package net.sf.sugar.fspath;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FSPathResultListImpl}.
* It contains ten unit test cases for the {@link FSPathResultListImpl#rename(String, String)} method.
*/
class FSPathResultListImpl_3Test {

	/**
	 * Test of rename method, of class FSPathResultListImpl.
	 * This test case tests the rename method with a simple rename.
	 * It renames the file "a.txt" to "b.txt".
	 */
	@Test
	void testRename_SimpleRename() throws Exception {
		System.out.println("rename");
		String matchExpression = "a.txt";
		String replaceExpresion = "b.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("a.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(1, result.getSuccesses().size());
		assertEquals(0, result.getFailures().size());
		assertEquals("b.txt", result.getSuccesses().get(0).getFile().getName());
	}
	
	/**
	 * Test of rename method, of class FSPathResultListImpl.
	 * This test case tests the rename method with a simple rename.
	 * It renames the file "a.txt" to "b.txt".
	 */
	@Test
	void testRename_SimpleRename_2() throws Exception {
		System.out.println("rename");
		String matchExpression = "a.txt";
		String replaceExpresion = "b.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("b.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(1, result.getSuccesses().size());
		assertEquals(1, result.getFailures().size());
		assertEquals("b.txt", result.getSuccesses().get(0).getFile().getName());
		assertEquals("b.txt", result.getFailures().get(0).getFile().getName());
	}
	
	/**
	 * Test of rename method, of class FSPathResultListImpl.
	 * This test case tests the rename method with a simple rename.
	 * It renames the file "a.txt" to "b.txt".
	 */
	@Test
	void testRename_SimpleRename_3() throws Exception {
		System.out.println("rename");
		String matchExpression = "a.txt";
		String replaceExpresion = "b.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("b.txt")));
		instance.add(new FSPathResult(new File("c.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(1, result.getSuccesses().size());
		assertEquals(2, result.getFailures().size());
		assertEquals("b.txt", result.getSuccesses().get(0).getFile().getName());
		assertEquals("b.txt", result.getFailures().get(0).getFile().getName());
		assertEquals("c.txt", result.getFailures().get(1).getFile().getName());
	}
	
	/**
	 * Test of rename method, of class FSPathResultListImpl.
	 * This test case tests the rename method with a simple rename.
	 * It renames the file "a.txt" to "b.txt".
	 */
	@Test
	void testRename_SimpleRename_4() throws Exception {
		System.out.println("rename");
		String matchExpression = "a.txt";
		String replaceExpresion = "b.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("b.txt")));
		instance.add(new FSPathResult(new File("c.txt")));
		instance.add(new FSPathResult(new File("d.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(1, result.getSuccesses().size());
		assertEquals(3, result.getFailures().size());
		assertEquals("b.txt", result.getSuccesses().get(0).getFile().getName());
		assertEquals("b.txt", result.getFailures().get(0).getFile().getName());
		assertEquals("c.txt", result.getFailures().get(1).getFile().getName());
		assertEquals("d.txt", result.getFailures().get(2).getFile().getName());
	}
	
	/**
	 * Test of rename method, of class FSPathResultListImpl.
	 * This test case tests the rename method with a simple rename.
	 * It renames the file "a.txt" to "b.txt".
	 */
	@Test
	void testRename_SimpleRename_5() throws Exception {
		System.out.println("rename");
		String matchExpression = "a.txt";
		String replaceExpresion = "b.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("b.txt")));
		instance.add(new FSPathResult(new File("c.txt")));
		instance.add(new FSPathResult(new File("d.txt")));
		instance.add(new FSPathResult(new File("e.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(1, result.getSuccesses().size());
		assertEquals(4, result.getFailures().size());
		assertEquals("b.txt", result.getSuccesses().get(0).getFile().getName());
		assertEquals("b.txt", result.getFailures().get(0).getFile().getName());
		assertEquals("c.txt", result.getFailures().get(1).getFile().getName());
		assertEquals("d.txt", result.getFailures().get(2).getFile().getName());
		assertEquals("e.txt", result.getFailures().get(3).getFile().getName());
	}
	
	/**
	 * Test of rename method, of class FSPathResultListImpl.
	 * This test case tests the rename method with a simple rename.
	 * It renames the file "a.txt" to "b.txt".
	 */
	@Test
	void testRename_SimpleRename_6() throws Exception {
		System.out.println("rename");
		String matchExpression = "a.txt";
		String replaceExpresion = "b.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("b.txt")));
		instance.add(new FSPathResult(new File("c.txt")));
		instance.add(new FSPathResult(new File("d.txt")));
		instance.add(new FSPathResult(new File("e.txt")));
		instance.add(new FSPathResult(new File("f.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression,