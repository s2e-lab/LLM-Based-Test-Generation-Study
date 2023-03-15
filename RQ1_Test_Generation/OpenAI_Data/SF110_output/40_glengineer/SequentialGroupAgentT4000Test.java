// SequentialGroupAgentTest.java
package glengineer.agents;

import java.util.ListIterator;
import glengineer.agents.setters.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.GroupLayout.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialGroupAgent}.
* It contains ten unit test cases for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
*/
class SequentialGroupAgentTest {

	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has no children.
	 */
	@Test
	void testGroupContent_NoChildren() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(0, result.getComponents().length);
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has one child.
	 */
	@Test
	void testGroupContent_OneChild() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		ComponentAgent child = new ComponentAgent("child");
		group.add(child);
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(1, result.getComponents().length);
		assertEquals(child.getComponent(), result.getComponents()[0]);
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has two children.
	 */
	@Test
	void testGroupContent_TwoChildren() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		ComponentAgent child1 = new ComponentAgent("child1");
		ComponentAgent child2 = new ComponentAgent("child2");
		group.add(child1);
		group.add(child2);
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(2, result.getComponents().length);
		assertEquals(child1.getComponent(), result.getComponents()[0]);
		assertEquals(child2.getComponent(), result.getComponents()[1]);
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has three children.
	 */
	@Test
	void testGroupContent_ThreeChildren() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		ComponentAgent child1 = new ComponentAgent("child1");
		ComponentAgent child2 = new ComponentAgent("child2");
		ComponentAgent child3 = new ComponentAgent("child3");
		group.add(child1);
		group.add(child2);
		group.add(child3);
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(3, result.getComponents().length);
		assertEquals(child1.getComponent(), result.getComponents()[0]);
		assertEquals(child2.getComponent(), result.getComponents()[1]);
		assertEquals(child3.getComponent(), result.getComponents()[2]);
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has four children.
	 */
	@Test
	void testGroupContent_FourChildren() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		ComponentAgent child1 = new ComponentAgent("child1");
		ComponentAgent child2 = new ComponentAgent("child2");
		ComponentAgent child3 = new ComponentAgent("child3");
		ComponentAgent child4 = new ComponentAgent("child4");
		group.add(child1);
		group.add(child2);
		group.add(child3);
		group.add(child4);
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(4, result.getComponents().length);
		assertEquals(child1.getComponent(), result.getComponents()[0]);
		assertEquals(child2.getComponent(), result.getComponents()[1]);
		assertEquals(child3.getComponent(), result.getComponents()[2]);
		assertEquals(child4.getComponent(), result.getComponents()[3]);
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has five children.
	 */
	@Test
	void testGroupContent_FiveChildren() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		ComponentAgent child1 = new ComponentAgent("child1");
		ComponentAgent child2 = new ComponentAgent("child2");
		ComponentAgent child3 = new ComponentAgent("child3");
		ComponentAgent child4 = new ComponentAgent("child4");
		ComponentAgent child5 = new ComponentAgent("child5");
		group.add(child1);
		group.add(child2);
		group.add(child3);
		group.add(child4);
		group.add(child5);
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(5, result.getComponents().length);
		assertEquals(child1.getComponent(), result.getComponents()[0]);
		assertEquals(child2.getComponent(), result.getComponents()[1]);
		assertEquals(child3.getComponent(), result.getComponents()[2]);
		assertEquals(child4.getComponent(), result.getComponents()[3]);
		assertEquals(child5.getComponent(), result.getComponents()[4]);
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has six children.
	 */
	@Test
	void testGroupContent_SixChildren() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		ComponentAgent child1 = new ComponentAgent("child1");
		ComponentAgent child2 = new ComponentAgent("child2");
		ComponentAgent child3 = new ComponentAgent("child3");
		ComponentAgent child4 = new ComponentAgent("child4");
		ComponentAgent child5 = new ComponentAgent("child5");
		ComponentAgent child6 = new ComponentAgent("child6");
		group.add(child1);
		group.add(child2);
		group.add(child3);
		group.add(child4);
		group.add(child5);
		group.add(child6);
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(6, result.getComponents().length);
		assertEquals(child1.getComponent(), result.getComponents()[0]);
		assertEquals(child2.getComponent(), result.getComponents()[1]);
		assertEquals(child3.getComponent(), result.getComponents()[2]);
		assertEquals(child4.getComponent(), result.getComponents()[3]);
		assertEquals(child5.getComponent(), result.getComponents()[4]);
		assertEquals(child6.getComponent(), result.getComponents()[5]);
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has seven children.
	 */
	@Test
	void testGroupContent_SevenChildren() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		ComponentAgent child1 = new ComponentAgent("child1");
		ComponentAgent child2 = new ComponentAgent("child2");
		ComponentAgent child3 = new ComponentAgent("child3");
		ComponentAgent child4 = new ComponentAgent("child4");
		ComponentAgent child5 = new ComponentAgent("child5");
		ComponentAgent child6 = new ComponentAgent("child6");
		ComponentAgent child7 = new ComponentAgent("child7");
		group.add(child1);
		group.add(child2);
		group.add(child3);
		group.add(child4);
		group.add(child5);
		group.add(child6);
		group.add(child7);
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(7, result.getComponents().length);
		assertEquals(child1.getComponent(), result.getComponents()[0]);
		assertEquals(child2.getComponent(), result.getComponents()[1]);
		assertEquals(child3.getComponent(), result.getComponents()[2]);
		assertEquals(child4.getComponent(), result.getComponents()[3]);
		assertEquals(child5.getComponent(), result.getComponents()[4]);
		assertEquals(child6.getComponent(), result.getComponents()[5]);
		assertEquals(child7.getComponent(), result.getComponents()[6]);
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has eight children.
	 */
	@Test
	void testGroupContent_EightChildren() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		ComponentAgent child1 = new ComponentAgent("child1");
		ComponentAgent child2 = new ComponentAgent("child2");
		ComponentAgent child3 = new ComponentAgent("child3");
		ComponentAgent child4 = new ComponentAgent("child4");
		ComponentAgent child5 = new ComponentAgent("child5");
		ComponentAgent child6 = new ComponentAgent("child6");
		ComponentAgent child7 = new ComponentAgent("child7");
		ComponentAgent child8 = new ComponentAgent("child8");
		group.add(child1);
		group.add(child2);
		group.add(child3);
		group.add(child4);
		group.add(child5);
		group.add(child6);
		group.add(child7);
		group.add(child8);
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(8, result.getComponents().length);
		assertEquals(child1.getComponent(), result.getComponents()[0]);
		assertEquals(child2.getComponent(), result.getComponents()[1]);
		assertEquals(child3.getComponent(), result.getComponents()[2]);
		assertEquals(child4.getComponent(), result.getComponents()[3]);
		assertEquals(child5.getComponent(), result.getComponents()[4]);
		assertEquals(child6.getComponent(), result.getComponents()[5]);
		assertEquals(child7.getComponent(), result.getComponents()[6]);
		assertEquals(child8.getComponent(), result.getComponents()[7]);
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has nine children.
	 */
	@Test
	void testGroupContent_NineChildren() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		ComponentAgent child1 = new ComponentAgent("child1");
		ComponentAgent child2 = new ComponentAgent("child2");
		ComponentAgent child3 = new ComponentAgent("child3");
		ComponentAgent child4 = new ComponentAgent("child4");
		ComponentAgent child5 = new ComponentAgent("child5");
		ComponentAgent child6 = new ComponentAgent("child6");
		ComponentAgent child7 = new ComponentAgent("child7");
		ComponentAgent child8 = new ComponentAgent("child8");
		ComponentAgent child9 = new ComponentAgent("child9");
		group.add(child1);
		group.add(child2);
		group.add(child3);
		group.add(child4);
		group.add(child5);
		group.add(child6);
		group.add(child7);
		group.add(child8);
		group.add(child9);
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(9, result.getComponents().length);
		assertEquals(child1.getComponent(), result.getComponents()[0]);
		assertEquals(child2.getComponent(), result.getComponents()[1]);
		assertEquals(child3.getComponent(), result.getComponents()[2]);
		assertEquals(child4.getComponent(), result.getComponents()[3]);
		assertEquals(child5.getComponent(), result.getComponents()[4]);
		assertEquals(child6.getComponent(), result.getComponents()[5]);
		assertEquals(child7.getComponent(), result.getComponents()[6]);
		assertEquals(child8.getComponent(), result.getComponents()[7]);
		assertEquals(child9.getComponent(), result.getComponents()[8]);
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has ten children.
	 */
	@Test
	void testGroupContent_TenChildren() {
		SequentialGroupAgent group = new SequentialGroupAgent();
		ComponentAgent child1 = new ComponentAgent("child1");
		ComponentAgent child2 = new ComponentAgent("child2");
		ComponentAgent child3 = new ComponentAgent("child3");
		ComponentAgent child4 = new ComponentAgent("child4");
		ComponentAgent child5 = new ComponentAgent("child5");
		ComponentAgent child6 = new ComponentAgent("child6");
		ComponentAgent child7 = new ComponentAgent("child7");
		ComponentAgent child8 = new ComponentAgent("child8");
		ComponentAgent child9 = new ComponentAgent("child9");
		ComponentAgent child10 = new ComponentAgent("child10");
		group.add(child1);
		group.add(child2);
		group.add(child3);
		group.add(child4);
		group.add(child5);
		group.add(child6);
		group.add(child7);
		group.add(child8);
		group.add(child9);
		group.add(child10);
		SequentialGroup result = group.groupContent(new GroupCreatorAndElementAdderImplementation());
		assertEquals(10, result.getComponents().length);
		assertEquals(child1.getComponent(), result.getComponents()[0]);
		assertEquals(child2.getComponent(), result.getComponents()[1]);
		assertEquals(child3.getComponent(), result.getComponents()[2]);
		assertEquals(child4.getComponent(), result.getComponents()[3]);
		assertEquals(child5.getComponent(), result.getComponents()[4]);
		assertEquals(child6.getComponent(), result.getComponents()[5]);
		assertEquals(child7.getComponent(), result.getComponents()[6]);
		assertEquals(child8.getComponent(), result.getComponents()[7]);
		assertEquals(child9.getComponent(), result.getComponents()[8]);
		assertEquals(child10.getComponent(), result.getComponents()[9]);
	}
	
	/**
	 * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
	 * It tests the case when the sequential group has one