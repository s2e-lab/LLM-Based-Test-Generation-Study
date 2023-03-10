// LabelTest.java
// * JIPA - Java Interpreted Pseuso-Assembly *
// ***                                     ***
// * Created by: Dominic Charley-Roy         *
// ***                                     ***
// * Released under GNU General              *
// * Public License                          *
// *******************************************
package jipa;

/**
 * Class Name: Label
 * Class Use: This class will handle all the labels in JIPA, and provide
 *            a basic interface for accessinh and using them.
 * @author Dominic Charley-Roy
 */
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Label}.
* It contains ten unit test cases for the {@link Label#findLabel(String)} method.
*/
class LabelTest {

	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is found.
	*/
	@Test
	void testFindLabelFound() {
		Main.instruction[0] = "LBL test";
		Label.buildLabelList();
		assertEquals(0, Label.findLabel("test"));
	}
	
	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is not found.
	*/
	@Test
	void testFindLabelNotFound() {
		Main.instruction[0] = "LBL test";
		Label.buildLabelList();
		assertEquals(-1, Label.findLabel("test2"));
	}
	
	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is found in the middle of the code.
	*/
	@Test
	void testFindLabelFoundMiddle() {
		Main.instruction[0] = "LBL test";
		Main.instruction[1] = "LBL test2";
		Main.instruction[2] = "LBL test3";
		Label.buildLabelList();
		assertEquals(1, Label.findLabel("test2"));
	}
	
	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is found at the end of the code.
	*/
	@Test
	void testFindLabelFoundEnd() {
		Main.instruction[0] = "LBL test";
		Main.instruction[1] = "LBL test2";
		Main.instruction[2] = "LBL test3";
		Label.buildLabelList();
		assertEquals(2, Label.findLabel("test3"));
	}
	
	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is found at the beginning of the code.
	*/
	@Test
	void testFindLabelFoundBeginning() {
		Main.instruction[0] = "LBL test";
		Main.instruction[1] = "LBL test2";
		Main.instruction[2] = "LBL test3";
		Label.buildLabelList();
		assertEquals(0, Label.findLabel("test"));
	}
	
	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is found at the beginning of the code.
	*/
	@Test
	void testFindLabelFoundBeginning2() {
		Main.instruction[0] = "LBL test";
		Main.instruction[1] = "LBL test2";
		Main.instruction[2] = "LBL test3";
		Label.buildLabelList();
		assertEquals(0, Label.findLabel("test"));
	}
	
	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is found at the beginning of the code.
	*/
	@Test
	void testFindLabelFoundBeginning3() {
		Main.instruction[0] = "LBL test";
		Main.instruction[1] = "LBL test2";
		Main.instruction[2] = "LBL test3";
		Label.buildLabelList();
		assertEquals(0, Label.findLabel("test"));
	}
	
	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is found at the beginning of the code.
	*/
	@Test
	void testFindLabelFoundBeginning4() {
		Main.instruction[0] = "LBL test";
		Main.instruction[1] = "LBL test2";
		Main.instruction[2] = "LBL test3";
		Label.buildLabelList();
		assertEquals(0, Label.findLabel("test"));
	}
	
	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is found at the beginning of the code.
	*/
	@Test
	void testFindLabelFoundBeginning5() {
		Main.instruction[0] = "LBL test";
		Main.instruction[1] = "LBL test2";
		Main.instruction[2] = "LBL test3";
		Label.buildLabelList();
		assertEquals(0, Label.findLabel("test"));
	}
	
	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is found at the beginning of the code.
	*/
	@Test
	void testFindLabelFoundBeginning6() {
		Main.instruction[0] = "LBL test";
		Main.instruction[1] = "LBL test2";
		Main.instruction[2] = "LBL test3";
		Label.buildLabelList();
		assertEquals(0, Label.findLabel("test"));
	}
	
	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is found at the beginning of the code.
	*/
	@Test
	void testFindLabelFoundBeginning7() {
		Main.instruction[0] = "LBL test";
		Main.instruction[1] = "LBL test2";
		Main.instruction[2] = "LBL test3";
		Label.buildLabelList();
		assertEquals(0, Label.findLabel("test"));
	}
	
	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is found at the beginning of the code.
	*/
	@Test
	void testFindLabelFoundBeginning8() {
		Main.instruction[0] = "LBL test";
		Main.instruction[1] = "LBL test2";
		Main.instruction[2] = "LBL test3";
		Label.buildLabelList();
		assertEquals(0, Label.findLabel("test"));
	}
	
	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is found at the beginning of the code.
	*/
	@Test
	void testFindLabelFoundBeginning9() {
		Main.instruction[0] = "LBL test";
		Main.instruction[1] = "LBL test2";
		Main.instruction[2] = "LBL test3";
		Label.buildLabelList();
		assertEquals(0, Label.findLabel("test"));
	}
	
	/**
	* Test case for {@link Label#findLabel(String)} method.
	* It tests the case when the label is found at the beginning of the code.
	*/
	@Test
	void testFindLabelFoundBeginning10() {
		Main.instruction[0] = "LBL test";
		Main.instruction[1] = "LBL test2";
		Main.instruction[2] = "LBL test3";
		Label.buildLabelList();
		assertEquals(0, Label.findLabel("test"));
	}
}

// Main.java
// *******************************************
// * JIPA - Java Interpreted Pseuso-Assembly *
// ***                                     ***
// * Created by: Dominic Charley-Roy         *
// ***                                     ***
// * Released under GNU General              *
// * Public License                         *
// *******************************************
package jipa;

/**
 * Class Name: Main
 * Class Use: This class will handle all the labels in JIPA, and provide
 *            a basic interface for accessinh and using them.
 * @author Dominic Charley-Roy
 */
import java.util.*;

public class Main {

    public static String[] instruction = new String[1000];

    public static int TOTAL_INSTRUCTIONS = 0;

    public static void main(String[] args) {
