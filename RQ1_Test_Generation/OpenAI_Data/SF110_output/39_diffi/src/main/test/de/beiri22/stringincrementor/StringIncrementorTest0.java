// StringIncrementorTest0.java
package de.beiri22.stringincrementor;

import de.beiri22.stringincrementor.helper.ExtBoolArray;
import de.beiri22.stringincrementor.helper.IndexedString;
import de.beiri22.stringincrementor.relativestring.RelativeString;
import de.beiri22.stringincrementor.relativestring.StringLink;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringIncrementor}.
* It contains ten unit test cases for the {@link StringIncrementor#diff(String, String)} method.
*/
class StringIncrementorTest0 {

	/**
	* Test case 1.
	* Test of diff method, of class StringIncrementor.
	*/
	@Test
	void testDiff1() {
		System.out.println("diff1");
		String a = "";
		String b = "";
		RelativeString expResult = new RelativeString();
		RelativeString result = StringIncrementor.diff(a, b);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case 2.
	* Test of diff method, of class StringIncrementor.
	*/
	@Test
	void testDiff2() {
		System.out.println("diff2");
		String a = "";
		String b = "abc";
		RelativeString expResult = new RelativeString();
		expResult.setAbsolute("abc");
		RelativeString result = StringIncrementor.diff(a, b);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case 3.
	* Test of diff method, of class StringIncrementor.
	*/
	@Test
	void testDiff3() {
		System.out.println("diff3");
		String a = "abc";
		String b = "";
		RelativeString expResult = new RelativeString();
		expResult.setAbsolute("");
		RelativeString result = StringIncrementor.diff(a, b);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case 4.
	* Test of diff method, of class StringIncrementor.
	*/
	@Test
	void testDiff4() {
		System.out.println("diff4");
		String a = "abc";
		String b = "abc";
		RelativeString expResult = new RelativeString();
		expResult.setAbsolute("");
		expResult.addLink(new StringLink(0, 0, 3));
		RelativeString result = StringIncrementor.diff(a, b);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case 5.
	* Test of diff method, of class StringIncrementor.
	*/
	@Test
	void testDiff5() {
		System.out.println("diff5");
		String a = "abc";
		String b = "abcd";
		RelativeString expResult = new RelativeString();
		expResult.setAbsolute("d");
		expResult.addLink(new StringLink(0, 0, 3));
		RelativeString result = StringIncrementor.diff(a, b);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case 6.
	* Test of diff method, of class StringIncrementor.
	*/
	@Test
	void testDiff6() {
		System.out.println("diff6");
		String a = "abcd";
		String b = "abc";
		RelativeString expResult = new RelativeString();
		expResult.setAbsolute("");
		expResult.addLink(new StringLink(0, 0, 3));
		RelativeString result = StringIncrementor.diff(a, b);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case 7.
	* Test of diff method, of class StringIncrementor.
	*/
	@Test
	void testDiff7() {
		System.out.println("diff7");
		String a = "abc";
		String b = "abcd";
		RelativeString expResult = new RelativeString();
		expResult.setAbsolute("d");
		expResult.addLink(new StringLink(0, 0, 3));
		RelativeString result = StringIncrementor.diff(a, b);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case 8.
	* Test of diff method, of class StringIncrementor.
	*/
	@Test
	void testDiff8() {
		System.out.println("diff8");
		String a = "abcd";
		String b = "abc";
		RelativeString expResult = new RelativeString();
		expResult.setAbsolute("");
		expResult.addLink(new StringLink(0, 0, 3));
		RelativeString result = StringIncrementor.diff(a, b);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case 9.
	* Test of diff method, of class StringIncrementor.
	*/
	@Test
	void testDiff9() {
		System.out.println("diff9");
		String a = "abc";
		String b = "abcd";
		RelativeString expResult = new RelativeString();
		expResult.setAbsolute("d");
		expResult.addLink(new StringLink(0, 0, 3));
		RelativeString result = StringIncrementor.diff(a, b);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case 10.
	* Test of diff method, of class StringIncrementor.
	*/
	@Test
	void testDiff10() {
		System.out.println("diff10");
		String a = "abcd";
		String b = "abc";
		RelativeString expResult = new RelativeString();
		expResult.setAbsolute("");
		expResult.addLink(new StringLink(0, 0, 3));
		RelativeString result = StringIncrementor.diff(a, b);
		assertEquals(expResult, result);
	}
	
}

// StringIncrementorTest1.java
package de.beiri22.stringincrementor;

import de.beiri22.stringincrementor.helper.ExtBoolArray;
import de.beiri22.stringincrementor.helper.IndexedString;
import de.beiri22.stringincrementor.relativestring.RelativeString;
import de.beiri22.stringincrementor.relativestring.StringLink;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringIncrementor}.
* It contains ten unit test cases for the {@link StringIncrementor#patch(String, RelativeString)} method.
*/
class StringIncrementorTest1 {
		
	/**
	* Test case 1.
	* Test of patch method, of class StringIncrementor.
	*/
	@Test
	void testPatch1() {
		System.out.println("patch1");
		String a = "";
		RelativeString r = new RelativeString();
		String expResult = "";
		String result = StringIncrementor.patch(a, r);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case 2.
	* Test of patch method, of class StringIncrementor.
	*/
	@Test
	void testPatch2() {
		System.out.println("patch2");
		String a = "";
		RelativeString r = new RelativeString();
		r.setAbsolute("abc");
		String expResult = "abc";
		String result = StringIncrementor.patch(a, r);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case 3.
	* Test of patch method, of class StringIncrementor.
	*/
	@Test
	void testPatch3() {
		System.out.println("patch3");
		String a = "abc";
		RelativeString r = new RelativeString();
		String expResult = "";
		String result = StringIncrementor.patch(a, r);
		assertEquals(expResult, result);
	}
	
	/**
	* Test case 4.
	* Test of patch method, of class StringIncrementor.
	*/
	@Test
	void testPatch4() {
		System.out.println("patch4");
		String a = "abc