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
		instance.add(new FSPathResult(new File("a.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(2, result.getSuccesses().size());
		assertEquals(0, result.getFailures().size());
		assertEquals("b.txt", result.getSuccesses().get(0).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(1).getFile().getName());
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
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(3, result.getSuccesses().size());
		assertEquals(0, result.getFailures().size());
		assertEquals("b.txt", result.getSuccesses().get(0).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(1).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(2).getFile().getName());
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
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(4, result.getSuccesses().size());
		assertEquals(0, result.getFailures().size());
		assertEquals("b.txt", result.getSuccesses().get(0).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(1).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(2).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(3).getFile().getName());
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
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(5, result.getSuccesses().size());
		assertEquals(0, result.getFailures().size());
		assertEquals("b.txt", result.getSuccesses().get(0).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(1).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(2).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(3).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(4).getFile().getName());
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
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(6, result.getSuccesses().size());
		assertEquals(0, result.getFailures().size());
		assertEquals("b.txt", result.getSuccesses().get(0).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(1).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(2).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(3).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(4).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(5).getFile().getName());
	}
	
	/**
	 * Test of rename method, of class FSPathResultListImpl.
	 * This test case tests the rename method with a simple rename.
	 * It renames the file "a.txt" to "b.txt".
	 */
	@Test
	void testRename_SimpleRename_7() throws Exception {
		System.out.println("rename");
		String matchExpression = "a.txt";
		String replaceExpresion = "b.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(7, result.getSuccesses().size());
		assertEquals(0, result.getFailures().size());
		assertEquals("b.txt", result.getSuccesses().get(0).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(1).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(2).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(3).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(4).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(5).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(6).getFile().getName());
	}
	
	/**
	 * Test of rename method, of class FSPathResultListImpl.
	 * This test case tests the rename method with a simple rename.
	 * It renames the file "a.txt" to "b.txt".
	 */
	@Test
	void testRename_SimpleRename_8() throws Exception {
		System.out.println("rename");
		String matchExpression = "a.txt";
		String replaceExpresion = "b.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(8, result.getSuccesses().size());
		assertEquals(0, result.getFailures().size());
		assertEquals("b.txt", result.getSuccesses().get(0).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(1).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(2).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(3).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(4).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(5).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(6).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(7).getFile().getName());
	}
	
	/**
	 * Test of rename method, of class FSPathResultListImpl.
	 * This test case tests the rename method with a simple rename.
	 * It renames the file "a.txt" to "b.txt".
	 */
	@Test
	void testRename_SimpleRename_9() throws Exception {
		System.out.println("rename");
		String matchExpression = "a.txt";
		String replaceExpresion = "b.txt";
		FSPathResultListImpl instance = new FSPathResultListImpl();
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		instance.add(new FSPathResult(new File("a.txt")));
		FSPathResultModificationList result = instance.rename(matchExpression, replaceExpresion);
		assertEquals(9, result.getSuccesses().size());
		assertEquals(0, result.getFailures().size());
		assertEquals("b.txt", result.getSuccesses().get(0).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(1).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(2).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(3).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(4).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(5).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(6).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(7).getFile().getName());
		assertEquals("b.txt", result.getSuccesses().get(8).getFile().getName());
	}
	
	/**
	 * Test of rename method, of class FSPathResultListImpl.
	 * This test case tests the rename method with a simple rename.
	 * It renames the