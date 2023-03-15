// ReflectionSearch_1Test.java
package net.sourceforge.beanbin.reflect;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import net.sourceforge.beanbin.BeanBinException;
import net.sourceforge.beanbin.query.Conditional;
import net.sourceforge.beanbin.query.Criteria;
import net.sourceforge.beanbin.query.Query;
import net.sourceforge.beanbin.query.SearchType;
import net.sourceforge.beanbin.search.WildcardSearch;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ReflectionSearch}.
* It contains ten unit test cases for the {@link ReflectionSearch#methodsThatHave(String)} method.
*/
class ReflectionSearch_1Test {

	/**
	* Test case for the {@link ReflectionSearch#methodsThatHave(String)} method.
	* <br><br>
	* Tested Method: {@link ReflectionSearch#methodsThatHave(String)}
	* <br><br>
	* Case: Test that the method returns a list of methods that have the annotation.
	* <br><br>
	* Expected Result: The list should contain the method with the annotation.
	* <br><br>
	* Assertion: assertEquals(1, list.size());
	*/
	@Test
	void testMethodsThatHave_1() throws BeanBinException {
		ReflectionSearch search = new ReflectionSearch(ReflectionSearch_1Test.class);
		List<Method> list = search.methodsThatHave("@Test").getMethods();
		assertEquals(1, list.size());
	}
	
	/**
	* Test case for the {@link ReflectionSearch#methodsThatHave(String)} method.
	* <br><br>
	* Tested Method: {@link ReflectionSearch#methodsThatHave(String)}
	* <br><br>
	* Case: Test that the method returns a list of methods that have the annotation.
	* <br><br>
	* Expected Result: The list should contain the method with the annotation.
	* <br><br>
	* Assertion: assertEquals(1, list.size());
	*/
	@Test
	void testMethodsThatHave_2() throws BeanBinException {
		ReflectionSearch search = new ReflectionSearch(ReflectionSearch_1Test.class);
		List<Method> list = search.methodsThatHave("@Test").getMethods();
		assertEquals(1, list.size());
	}
	
	/**
	* Test case for the {@link ReflectionSearch#methodsThatHave(String)} method.
	* <br><br>
	* Tested Method: {@link ReflectionSearch#methodsThatHave(String)}
	* <br><br>
	* Case: Test that the method returns a list of methods that have the annotation.
	* <br><br>
	* Expected Result: The list should contain the method with the annotation.
	* <br><br>
	* Assertion: assertEquals(1, list.size());
	*/
	@Test
	void testMethodsThatHave_3() throws BeanBinException {
		ReflectionSearch search = new ReflectionSearch(ReflectionSearch_1Test.class);
		List<Method> list = search.methodsThatHave("@Test").getMethods();
		assertEquals(1, list.size());
	}
	
	/**
	* Test case for the {@link ReflectionSearch#methodsThatHave(String)} method.
	* <br><br>
	* Tested Method: {@link ReflectionSearch#methodsThatHave(String)}
	* <br><br>
	* Case: Test that the method returns a list of methods that have the annotation.
	* <br><br>
	* Expected Result: The list should contain the method with the annotation.
	* <br><br>
	* Assertion: assertEquals(1, list.size());
	*/
	@Test
	void testMethodsThatHave_4() throws BeanBinException {
		ReflectionSearch search = new ReflectionSearch(ReflectionSearch_1Test.class);
		List<Method> list = search.methodsThatHave("@Test").getMethods();
		assertEquals(1, list.size());
	}
	
	/**
	* Test case for the {@link ReflectionSearch#methodsThatHave(String)} method.
	* <br><br>
	* Tested Method: {@link ReflectionSearch#methodsThatHave(String)}
	* <br><br>
	* Case: Test that the method returns a list of methods that have the annotation.
	* <br><br>
	* Expected Result: The list should contain the method with the annotation.
	* <br><br>
	* Assertion: assertEquals(1, list.size());
	*/
	@Test
	void testMethodsThatHave_5() throws BeanBinException {
		ReflectionSearch search = new ReflectionSearch(ReflectionSearch_1Test.class);
		List<Method> list = search.methodsThatHave("@Test").getMethods();
		assertEquals(1, list.size());
	}
	
	/**
	* Test case for the {@link ReflectionSearch#methodsThatHave(String)} method.
	* <br><br>
	* Tested Method: {@link ReflectionSearch#methodsThatHave(String)}
	* <br><br>
	* Case: Test that the method returns a list of methods that have the annotation.
	* <br><br>
	* Expected Result: The list should contain the method with the annotation.
	* <br><br>
	* Assertion: assertEquals(1, list.size());
	*/
	@Test
	void testMethodsThatHave_6() throws BeanBinException {
		ReflectionSearch search = new ReflectionSearch(ReflectionSearch_1Test.class);
		List<Method> list = search.methodsThatHave("@Test").getMethods();
		assertEquals(1, list.size());
	}
	
	/**
	* Test case for the {@link ReflectionSearch#methodsThatHave(String)} method.
	* <br><br>
	* Tested Method: {@link ReflectionSearch#methodsThatHave(String)}
	* <br><br>
	* Case: Test that the method returns a list of methods that have the annotation.
	* <br><br>
	* Expected Result: The list should contain the method with the annotation.
	* <br><br>
	* Assertion: assertEquals(1, list.size());
	*/
	@Test
	void testMethodsThatHave_7() throws BeanBinException {
		ReflectionSearch search = new ReflectionSearch(ReflectionSearch_1Test.class);
		List<Method> list = search.methodsThatHave("@Test").getMethods();
		assertEquals(1, list.size());
	}
	
	/**
	* Test case for the {@link ReflectionSearch#methodsThatHave(String)} method.
	* <br><br>
	* Tested Method: {@link ReflectionSearch#methodsThatHave(String)}
	* <br><br>
	* Case: Test that the method returns a list of methods that have the annotation.
	* <br><br>
	* Expected Result: The list should contain the method with the annotation.
	* <br><br>
	* Assertion: assertEquals(1, list.size());
	*/
	@Test
	void testMethodsThatHave_8() throws BeanBinException {
		ReflectionSearch search = new ReflectionSearch(ReflectionSearch_1Test.class);
		List<Method> list = search.methodsThatHave("@Test").getMethods();
		assertEquals(1, list.size());
	}
	
	/**
	* Test case for the {@link ReflectionSearch#methodsThatHave(String)} method.
	* <br><br>
	* Tested Method: {@link ReflectionSearch#methodsThatHave(String)}
	* <br><br>
	* Case: Test that the method returns a list of methods that have the annotation.
	* <br><br>
	* Expected Result: The list should contain the method with the annotation.
	* <br><br>
	* Assertion: assertEquals(1, list.size());
	*/
	@Test
	void testMethodsThatHave_9() throws BeanBinException {
		ReflectionSearch search = new ReflectionSearch(ReflectionSearch_1Test.class);
		List<Method> list = search.methodsThatHave("@Test").getMethods();
		assertEquals(1, list.size());
	}
	
	/**
	* Test case for the {@link ReflectionSearch#methodsThatHave(String)} method.
	* <br><br>
	* Tested Method: {@link ReflectionSearch