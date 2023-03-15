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
}</code></pre>
</div>
</div>

</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[&nbsp;]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="kn">import</span> <span class="nn">glengineer.agents</span>
<span class="kn">import</span> <span class="nn">glengineer.agents.setters</span>
<span class="kn">import</span> <span class="nn">glengineer.agents.settings</span>
<span class="kn">import</span> <span class="nn">javax.swing.GroupLayout.Group</span>
<span class="kn">import</span> <span class="nn">org.junit.jupiter.api.Test</span>
<span class="kn">import</span> <span class="nn">static</span> <span class="nn">org.junit.jupiter.api.Assertions.*</span>

<span class="c1">/**
* Test class of {@link ComponentAgent}.
* It contains ten unit test cases for the {@link ComponentAgent#findDependingComponentByName(String)} method.
*/</span>
<span class="k">class</span> <span class="nc">ComponentAgent_3Test</span> <span class="p">{</span>
		
	<span class="c1">/**
	 * Test case for the {@link ComponentAgent#findDependingComponentByName(String)} method.
	 * &lt;p&gt;
	 * The test case checks that the method returns the component agent itself
	 * if its name equals the specified one.
	 */</span>
	<span class="k">@Test</span>
	<span class="kd">void</span> <span class="nf">testFindDependingComponentByName_1</span><span class="p">()</span> <span class="p">{</span>
		<span class="n">ComponentAgent</span> <span class="n">componentAgent</span> <span class="o">=</span> <span class="k">new</span> <span class="n">ComponentAgent</span><span class="p">(</span><span class="s">"component"</span><span class="p">);</span>
		<span class="n">assertEquals</span><span class="p">(</span><span class="n">componentAgent</span><span class="p">,</span> <span class="n">componentAgent</span><span class="o">.</span><span class="na">findDependingComponentByName</span><span class="p">(</span><span class="s">"component"</span><span class="p">));</span>
	<span class="p">}</span>
	
	<span class="c1">/**
	 * Test case for the {@link ComponentAgent#findDependingComponentByName(String)} method.
	 * &lt;p&gt;
	 * The test case checks that the method returns null
	 * if the name of the component agent does not equal the specified one.
	 */</span>
	<span class="k">@Test</span>
	<span class="kd">void</span> <span class="nf">testFindDependingComponentByName_2</span><span class="p