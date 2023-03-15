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
	* This test case tests the method with a class and a search term that does not match any method.
	*/
	@Test
	public void testGetMethodsThatHaveWithClassAndSearchTermThatDoesNotMatchAnyMethod() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, "get");
		assertNotNull(methods);
		assertEquals(0, methods.size());
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a class and a search term that matches a method.
	*/
	@Test
	public void testGetMethodsThatHaveWithClassAndSearchTermThatMatchesAMethod() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, "getBytes");
		assertNotNull(methods);
		assertEquals(1, methods.size());
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a class and a search term that matches multiple methods.
	*/
	@Test
	public void testGetMethodsThatHaveWithClassAndSearchTermThatMatchesMultipleMethods() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, "get");
		assertNotNull(methods);
		assertEquals(2, methods.size());
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a class and a search term that matches a method with a parameter.
	*/
	@Test
	public void testGetMethodsThatHaveWithClassAndSearchTermThatMatchesAMethodWithAParameter() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, "getBytes(int)");
		assertNotNull(methods);
		assertEquals(1, methods.size());
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a class and a search term that matches a method with multiple parameters.
	*/
	@Test
	public void testGetMethodsThatHaveWithClassAndSearchTermThatMatchesAMethodWithMultipleParameters() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, "getBytes(int, int)");
		assertNotNull(methods);
		assertEquals(1, methods.size());
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a class and a search term that matches a method with a parameter and a return type.
	*/
	@Test
	public void testGetMethodsThatHaveWithClassAndSearchTermThatMatchesAMethodWithAParameterAndAReturnType() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, "getBytes(int):byte[]");
		assertNotNull(methods);
		assertEquals(1, methods.size());
	}
	
	/**
	* Test case for {@link ReflectionEngine#getMethodsThatHave(Class, String)} method.
	* This test case tests the method with a class and a search term that matches a method with multiple parameters and a return type.
	*/
	@Test
	public void testGetMethodsThatHaveWithClassAndSearchTermThatMatchesAMethodWithMultipleParametersAndAReturnType() {
		ReflectionEngine reflectionEngine = new ReflectionEngine();
		List<Method> methods = reflectionEngine.getMethodsThatHave(String.class, "getBytes(int, int):byte[]");
		assertNotNull(methods);
		assertEquals(1, methods.size());
	}
}