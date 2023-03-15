// ParallelGroupAgent_1Test.java
package glengineer.agents;

import glengineer.agents.setters.FunctionsOnGroup;
import glengineer.agents.setters.FunctionsOnParallelGroup;
import glengineer.agents.setters.FunctionsOnParallelGroupAndElement;
import glengineer.agents.settings.ParallelGroupSettings;
import java.util.Iterator;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParallelGroupAgent}.
* It contains ten unit test cases for the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
*/
class ParallelGroupAgent_1Test {

	/**
	 * Test case #1.
	 * <p>
	 * The parallel group contains a single gap.
	 * <p>
	 * The gap is added to the parallel group.
	 */
	@Test
	void testGroupContent_1() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		
		assertEquals(1, parallelGroup.getComponentCount());
		assertEquals(10, parallelGroup.getComponent(0).getPreferredSize().width);
	}
	
	/**
	 * Test case #2.
	 * <p>
	 * The parallel group contains a single component.
	 * <p>
	 * The component is added to the parallel group.
	 */
	@Test
	void testGroupContent_2() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addComponent("component", 10, 20);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		
		assertEquals(1, parallelGroup.getComponentCount());
		assertEquals(10, parallelGroup.getComponent(0).getPreferredSize().width);
	}
	
	/**
	 * Test case #3.
	 * <p>
	 * The parallel group contains a single group.
	 * <p>
	 * The group is added to the parallel group.
	 */
	@Test
	void testGroupContent_3() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGroup("group", new FunctionsOnGroup() {
			public void setContentAlignment(Alignment alignment) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
			public void setResizable(boolean resizable) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
			public FunctionsOnParallelGroup getParallelGroup() {
				return new FunctionsOnParallelGroup() {
					public void setContentAlignment(Alignment alignment) {
						throw new UnsupportedOperationException("Not supported yet.");
					}
					public void setResizable(boolean resizable) {
						throw new UnsupportedOperationException("Not supported yet.");
					}
					public FunctionsOnParallelGroupAndElement getComponent(String componentName) {
						throw new UnsupportedOperationException("Not supported yet.");
					}
					public FunctionsOnParallelGroupAndElement getGroup(String firstName, String lastName) {
						throw new UnsupportedOperationException("Not supported yet.");
					}
				};
			}
			public FunctionsOnParallelGroup getSequentialGroup() {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				group.addGroup(groupAgent.groupContent(this));
			}
		});
		
		assertEquals(1, parallelGroup.getComponentCount());
	}
	
	/**
	 * Test case #4.
	 * <p>
	 * The parallel group contains a single gap and a single component.
	 * <p>
	 * The gap and the component are added to the parallel group.
	 */
	@Test
	void testGroupContent_4() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.addComponent("component", 10, 20);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup(ParallelGroupSettings settings) {
				return new ParallelGroup(Alignment.LEADING);
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
			public void addGroupToGroup(ParallelGroup group, GroupAgent groupAgent) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
		});
		
		assertEquals(2, parallelGroup.getComponentCount());
		assertEquals(10, parallelGroup.getComponent(0).getPreferredSize().width);
		assertEquals(10, parallelGroup.getComponent(1).getPreferredSize().width);
	}
	
	/**
	 * Test case #5.
	 * <p>
	 * The parallel group contains a single gap and a single group.
	 * <p>
	 * The gap and the group are added to the parallel group.
	 */
	@Test
	void testGroupContent_5() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.addGroup("group", new FunctionsOnGroup() {
			public void setContentAlignment(Alignment alignment) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
			public void setResizable(boolean resizable) {
				throw new UnsupportedOperationException("Not supported yet.");
			}
			public FunctionsOnParallelGroup getParallelGroup() {
				return new FunctionsOnParallelGroup() {
					public void setContentAlignment(Alignment alignment) {
						throw new UnsupportedOperationException("Not supported yet.");
					}
					public void setResizable(boolean resizable) {
						throw new UnsupportedOperationException("Not supported yet.");
					}
					public FunctionsOnParallelGroupAndElement getComponent(String componentName) {
						throw new UnsupportedOperationException("Not supported yet.");
					}
					public FunctionsOnParallelGroupAndElement getGroup(String firstName, String lastName) {
						throw new UnsupportedOperationException("Not supported yet.");
					}
