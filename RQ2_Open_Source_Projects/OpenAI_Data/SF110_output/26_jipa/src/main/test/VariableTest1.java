// VariableTest1.java
// * JIPA - Java Interpreted Pseuso-Assembly *
// ***                                     ***
// * Created by: Dominic Charley-Roy         *
// ***                                     ***
// * Released under GNU General              *
// * Public License                          *
// *******************************************
package jipa;

/**
 * Class Name: Variable
 * Class Use: This class is the basis for the variables in JIPA and will
 *            provide an interface for the interpreter to access.
 * @author Dominic Charley-Roy
 */
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Variable}.
* It contains ten unit test cases for the {@link Variable#getVariableValue(String)} method.
*/
class VariableTest1 {

	/**
	* Test case 1 for {@link Variable#getVariableValue(String)}.
	* It tests the method with a variable that is not in the variable list.
	*/
	@Test
	void testGetVariableValue1() {
		assertEquals(0, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 2 for {@link Variable#getVariableValue(String)}.
	* It tests the method with a variable that is in the variable list.
	*/
	@Test
	void testGetVariableValue2() {
		Variable.addVariable("test");
		assertEquals(0, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 3 for {@link Variable#getVariableValue(String)}.
	* It tests the method with a variable that is in the variable list and has a value.
	*/
	@Test
	void testGetVariableValue3() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		assertEquals(5, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 4 for {@link Variable#getVariableValue(String)}.
	* It tests the method with a variable that is in the variable list and has a value.
	*/
	@Test
	void testGetVariableValue4() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		assertEquals(5, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 5 for {@link Variable#getVariableValue(String)}.
	* It tests the method with a variable that is in the variable list and has a value.
	*/
	@Test
	void testGetVariableValue5() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		assertEquals(5, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 6 for {@link Variable#getVariableValue(String)}.
	* It tests the method with a variable that is in the variable list and has a value.
	*/
	@Test
	void testGetVariableValue6() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		assertEquals(5, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 7 for {@link Variable#getVariableValue(String)}.
	* It tests the method with a variable that is in the variable list and has a value.
	*/
	@Test
	void testGetVariableValue7() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		assertEquals(5, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 8 for {@link Variable#getVariableValue(String)}.
	* It tests the method with a variable that is in the variable list and has a value.
	*/
	@Test
	void testGetVariableValue8() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		assertEquals(5, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 9 for {@link Variable#getVariableValue(String)}.
	* It tests the method with a variable that is in the variable list and has a value.
	*/
	@Test
	void testGetVariableValue9() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		assertEquals(5, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 10 for {@link Variable#getVariableValue(String)}.
	* It tests the method with a variable that is in the variable list and has a value.
	*/
	@Test
	void testGetVariableValue10() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		assertEquals(5, Variable.getVariableValue("test"));
	}
}

// VariableTest2.java
// * JIPA - Java Interpreted Pseuso-Assembly *
// ***                                     ***
// * Created by: Dominic Charley-Roy         *
// ***                                     ***
// * Released under GNU General              *
// * Public License                         *
// *******************************************
package jipa;

/**
 * Class Name: Variable
 * Class Use: This class is the basis for the variables in JIPA and will
 *            provide an interface for the interpreter to access.
 * @author Dominic Charley-Roy
 */
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Variable}.
* It contains ten unit test cases for the {@link Variable#setVariableValue(String, int)} method.
*/
class VariableTest2 {
		
	/**
	* Test case 1 for {@link Variable#setVariableValue(String, int)}.
	* It tests the method with a variable that is not in the variable list.
	*/
	@Test
	void testSetVariableValue1() {
		Variable.setVariableValue("test", 5);
		assertEquals(0, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 2 for {@link Variable#setVariableValue(String, int)}.
	* It tests the method with a variable that is in the variable list.
	*/
	@Test
	void testSetVariableValue2() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		assertEquals(5, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 3 for {@link Variable#setVariableValue(String, int)}.
	* It tests the method with a variable that is in the variable list and has a value.
	*/
	@Test
	void testSetVariableValue3() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		Variable.setVariableValue("test", 10);
		assertEquals(10, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 4 for {@link Variable#setVariableValue(String, int)}.
	* It tests the method with a variable that is in the variable list and has a value.
	*/
	@Test
	void testSetVariableValue4() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		Variable.setVariableValue("test", 10);
		assertEquals(10, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 5 for {@link Variable#setVariableValue(String, int)}.
	* It tests the method with a variable that is in the variable list and has a value.
	*/
	@Test
	void testSetVariableValue5() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		Variable.setVariableValue("test", 10);
		assertEquals(10, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 6 for {@link Variable#setVariableValue(String, int)}.
	* It tests the method with a variable that is in the variable list and has a value.
	*/
	@Test
	void testSetVariableValue6() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		Variable.setVariableValue("test", 10);
		assertEquals(10, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 7 for {@link Variable#setVariableValue(String, int)}.
	* It tests the method with a variable that is in the variable list and has a value.
	*/
	@Test
	void testSetVariableValue7() {
		Variable.addVariable("test");
		Variable.setVariableValue("test", 5);
		Variable.setVariableValue("test", 10);
		assertEquals(10, Variable.getVariableValue("test"));
	}
	
	/**
	* Test case 8 for {@