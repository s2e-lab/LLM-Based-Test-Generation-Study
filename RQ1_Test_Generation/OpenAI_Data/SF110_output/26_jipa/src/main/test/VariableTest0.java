// VariableTest0.java
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
* It contains ten unit test cases for the {@link Variable#addVariable(String)} method.
*/
class VariableTest0 {

	/**
	* Test case 1 for {@link Variable#addVariable(String)}.
	* It tests if the method returns true when adding a new variable.
	*/
	@Test
	void testAddVariable1() {
		assertTrue(Variable.addVariable("test"));
	}
	
	/**
	* Test case 2 for {@link Variable#addVariable(String)}.
	* It tests if the method returns false when adding an existing variable.
	*/
	@Test
	void testAddVariable2() {
		Variable.addVariable("test");
		assertFalse(Variable.addVariable("test"));
	}
	
	/**
	* Test case 3 for {@link Variable#addVariable(String)}.
	* It tests if the method returns true when adding a new variable.
	*/
	@Test
	void testAddVariable3() {
		assertTrue(Variable.addVariable("test2"));
	}
	
	/**
	* Test case 4 for {@link Variable#addVariable(String)}.
	* It tests if the method returns false when adding an existing variable.
	*/
	@Test
	void testAddVariable4() {
		Variable.addVariable("test2");
		assertFalse(Variable.addVariable("test2"));
	}
	
	/**
	* Test case 5 for {@link Variable#addVariable(String)}.
	* It tests if the method returns true when adding a new variable.
	*/
	@Test
	void testAddVariable5() {
		assertTrue(Variable.addVariable("test3"));
	}
	
	/**
	* Test case 6 for {@link Variable#addVariable(String)}.
	* It tests if the method returns false when adding an existing variable.
	*/
	@Test
	void testAddVariable6() {
		Variable.addVariable("test3");
		assertFalse(Variable.addVariable("test3"));
	}
	
	/**
	* Test case 7 for {@link Variable#addVariable(String)}.
	* It tests if the method returns true when adding a new variable.
	*/
	@Test
	void testAddVariable7() {
		assertTrue(Variable.addVariable("test4"));
	}
	
	/**
	* Test case 8 for {@link Variable#addVariable(String)}.
	* It tests if the method returns false when adding an existing variable.
	*/
	@Test
	void testAddVariable8() {
		Variable.addVariable("test4");
		assertFalse(Variable.addVariable("test4"));
	}
	
	/**
	* Test case 9 for {@link Variable#addVariable(String)}.
	* It tests if the method returns true when adding a new variable.
	*/
	@Test
	void testAddVariable9() {
		assertTrue(Variable.addVariable("test5"));
	}
	
	/**
	* Test case 10 for {@link Variable#addVariable(String)}.
	* It tests if the method returns false when adding an existing variable.
	*/
	@Test
	void testAddVariable10() {
		Variable.addVariable("test5");
		assertFalse(Variable.addVariable("test5"));
	}
}

// VariableTest1.java
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
* It contains ten unit test cases for the {@link Variable#removeVariable(String)} method.
*/
class VariableTest1 {
		
	/**
	* Test case 1 for {@link Variable#removeVariable(String)}.
	* It tests if the method removes a variable.
	*/
	@Test
	void testRemoveVariable1() {
		Variable.addVariable("test");
		Variable.removeVariable("test");
		assertEquals(-1, Variable.findVariable("test"));
	}
	
	/**
	* Test case 2 for {@link Variable#removeVariable(String)}.
	* It tests if the method removes a variable.
	*/
	@Test
	void testRemoveVariable2() {
		Variable.addVariable("test2");
		Variable.removeVariable("test2");
		assertEquals(-1, Variable.findVariable("test2"));
	}
	
	/**
	* Test case 3 for {@link Variable#removeVariable(String)}.
	* It tests if the method removes a variable.
	*/
	@Test
	void testRemoveVariable3() {
		Variable.addVariable("test3");
		Variable.removeVariable("test3");
		assertEquals(-1, Variable.findVariable("test3"));
	}
	
	/**
	* Test case 4 for {@link Variable#removeVariable(String)}.
	* It tests if the method removes a variable.
	*/
	@Test
	void testRemoveVariable4() {
		Variable.addVariable("test4");
		Variable.removeVariable("test4");
		assertEquals(-1, Variable.findVariable("test4"));
	}
	
	/**
	* Test case 5 for {@link Variable#removeVariable(String)}.
	* It tests if the method removes a variable.
	*/
	@Test
	void testRemoveVariable5() {
		Variable.addVariable("test5");
		Variable.removeVariable("test5");
		assertEquals(-1, Variable.findVariable("test5"));
	}
	
	/**
	* Test case 6 for {@link Variable#removeVariable(String)}.
	* It tests if the method removes a variable.
	*/
	@Test
	void testRemoveVariable6() {
		Variable.addVariable("test6");
		Variable.removeVariable("test6");
		assertEquals(-1, Variable.findVariable("test6"));
	}
	
	/**
	* Test case 7 for {@link Variable#removeVariable(String)}.
	* It tests if the method removes a variable.
	*/
	@Test
	void testRemoveVariable7() {
		Variable.addVariable("test7");
		Variable.removeVariable("test7");
		assertEquals(-1, Variable.findVariable("test7"));
	}
	
	/**
	* Test case 8 for {@link Variable#removeVariable(String)}.
	* It tests if the method removes a variable.
	*/
	@Test
	void testRemoveVariable8() {
		Variable.addVariable("test8");
		Variable.removeVariable("test8");
		assertEquals(-1, Variable.findVariable("test8"));
	}
	
	/**
	* Test case 9 for {@link Variable#removeVariable(String)}.
	* It tests if the method removes a variable.
	*/
	@Test
	void testRemoveVariable9() {
		Variable.addVariable("test9");
		Variable.removeVariable("test9");
		assertEquals(-1, Variable.findVariable("test9"));
	}
	
	/**
	* Test case 10 for {@link Variable#removeVariable(String)}.
	* It tests if the method removes a variable.
	*/
	@Test
	void testRemoveVariable10() {
		Variable.addVariable("test10");
		Variable.removeVariable("test10");
		assertEquals(-1, Variable.findVariable("test10"));
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
