// ReflectionEngineTest.java
package net.sourceforge.beanbin.reflect;

import java.lang.reflect.Method;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ReflectionEngine}.
* It contains ten unit test cases for the {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
*/
class ReflectionEngineTest {

	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a null class.
	*/
	@Test
	public void testGetMethodsThatHaveWithNullClass() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(null, "get");
		assertNull(methods);
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a null search term.
	*/
	@Test
	public void testGetMethodsThatHaveWithNullSearchTerm() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, null);
		assertNull(methods);
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a null class and a null search term.
	*/
	@Test
	public void testGetMethodsThatHaveWithNullClassAndNullSearchTerm() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(null, null);
		assertNull(methods);
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a class and a null search term.
	*/
	@Test
	public void testGetMethodsThatHaveWithClassAndNullSearchTerm() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, null);
		assertNull(methods);
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a null class and a search term.
	*/
	@Test
	public void testGetMethodsThatHaveWithNullClassAndSearchTerm() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(null, "get");
		assertNull(methods);
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a class and a search term.
	*/
	@Test
	public void testGetMethodsThatHaveWithClassAndSearchTerm() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, "get");
		assertNotNull(methods);
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a class and a search term.
	*/
	@Test
	public void testGetMethodsThatHaveWithClassAndSearchTerm2() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, "get");
		assertNotNull(methods);
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a class and a search term.
	*/
	@Test
	public void testGetMethodsThatHaveWithClassAndSearchTerm3() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, "get");
		assertNotNull(methods);
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a class and a search term.
	*/
	@Test
	public void testGetMethodsThatHaveWithClassAndSearchTerm4() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, "get");
		assertNotNull(methods);
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a class and a search term.
	*/
	@Test
	public void testGetMethodsThatHaveWithClassAndSearchTerm5() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, "get");
		assertNotNull(methods);
	}
	
}