// ComponentAgent_3Test.java
package glengineer.agents;

import glengineer.agents.setters.FunctionsOnComponent;
import glengineer.agents.settings.ComponentSettings;
import glengineer.agents.settings.Sizes;
import javax.swing.GroupLayout.Group;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ComponentAgent}.
* It contains ten unit test cases for the {@link ComponentAgent#findDependingComponentByName(String)} method.
*/
class ComponentAgent_3Test {

	/**
	 * Test case for the {@link ComponentAgent#findDependingComponentByName(String)} method.
	 * <p>
	 * The test case checks that the method returns the component agent itself
	 * if its name equals the specified one.
	 */
	@Test
	void testFindDependingComponentByName_1() {
		ComponentAgent componentAgent = new ComponentAgent("component");
		assertEquals(componentAgent, componentAgent.findDependingComponentByName("component"));
	}
	
	/**
	 * Test case for the {@link ComponentAgent#findDependingComponentByName(String)} method.
	 * <p>
	 * The test case checks that the method returns null
	 * if the name of the component agent does not equal the specified one.
	 */
	@Test
	void testFindDependingComponentByName_2() {
		ComponentAgent componentAgent = new ComponentAgent("component");
		assertNull(componentAgent.findDependingComponentByName("another component"));
	}
	
	/**
	 * Test case for the {@link ComponentAgent#findDependingComponentByName(String)} method.
	 * <p>
	 * The test case checks that the method returns null
	 * if the name of the component agent is null.
	 */
	@Test
	void testFindDependingComponentByName_3() {
		ComponentAgent componentAgent = new ComponentAgent(null);
		assertNull(componentAgent.findDependingComponentByName("component"));
	}
	
	/**
	 * Test case for the {@link ComponentAgent#findDependingComponentByName(String)} method.
	 * <p>
	 * The test case checks that the method returns null
	 * if the name of the component agent is empty.
	 */
	@Test
	void testFindDependingComponentByName_4() {
		ComponentAgent componentAgent = new ComponentAgent("");
		assertNull(componentAgent.findDependingComponentByName("component"));
	}
	
	/**
	 * Test case for the {@link ComponentAgent#findDependingComponentByName(String)} method.
	 * <p>
	 * The test case checks that the method returns null
	 * if the name of the component agent is blank.
	 */
	@Test
	void testFindDependingComponentByName_5() {
		ComponentAgent componentAgent = new ComponentAgent(" ");
		assertNull(componentAgent.findDependingComponentByName("component"));
	}
	
	/**
	 * Test case for the {@link ComponentAgent#findDependingComponentByName(String)} method.
	 * <p>
	 * The test case checks that the method returns null
	 * if the name of the component agent is blank.
	 */
	@Test
	void testFindDependingComponentByName_6() {
		ComponentAgent componentAgent = new ComponentAgent("\t");
		assertNull(componentAgent.findDependingComponentByName("component"));
	}
	
	/**
	 * Test case for the {@link ComponentAgent#findDependingComponentByName(String)} method.
	 * <p>
	 * The test case checks that the method returns null
	 * if the name of the component agent is blank.
	 */
	@Test
	void testFindDependingComponentByName_7() {
		ComponentAgent componentAgent = new ComponentAgent("\n");
		assertNull(componentAgent.findDependingComponentByName("component"));
	}
	
	/**
	 * Test case for the {@link ComponentAgent#findDependingComponentByName(String)} method.
	 * <p>
	 * The test case checks that the method returns null
	 * if the name of the component agent is blank.
	 */
	@Test
	void testFindDependingComponentByName_8() {
		ComponentAgent componentAgent = new ComponentAgent("\r");
		assertNull(componentAgent.findDependingComponentByName("component"));
	}
	
	/**
	 * Test case for the {@link ComponentAgent#findDependingComponentByName(String)} method.
	 * <p>
	 * The test case checks that the method returns null
	 * if the name of the component agent is blank.
	 */
	@Test
	void testFindDependingComponentByName_9() {
		ComponentAgent componentAgent = new ComponentAgent("\f");
		assertNull(componentAgent.findDependingComponentByName("component"));
	}
	
	/**
	 * Test case for the {@link ComponentAgent#findDependingComponentByName(String)} method.
	 * <p>
	 * The test case checks that the method returns null
	 * if the name of the component agent is blank.
	 */
	@Test
	void testFindDependingComponentByName_10() {
		ComponentAgent componentAgent = new ComponentAgent("\b");
		assertNull(componentAgent.findDependingComponentByName("component"));
	}
	
}</code>





A:

В общем, проблема была в том, что в классе <code>ComponentAgent</code> не было переопределено метода <code>equals</code>. После его переопределения все заработало.
