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
	 * The test case checks the following assertion:
	 * <p>
	 * If the parallel group agent contains gaps only,
	 * the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method
	 * returns a parallel group with gaps only.
	 */
	@Test
	void testGroupContent_1() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.addGap(20);
		parallelGroupAgent.addGap(30);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup() {
				return new ParallelGroup();
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
		});
		
		assertEquals(3, parallelGroup.getSize());
		Iterator<ParallelGroup> iterator = parallelGroup.iterator();
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
	}
	
	/**
	 * Test case #2.
	 * <p>
	 * The test case checks the following assertion:
	 * <p>
	 * If the parallel group agent contains gaps only,
	 * the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method
	 * returns a parallel group with gaps only.
	 * <p>
	 * The gaps have different types.
	 */
	@Test
	void testGroupContent_2() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.addGap(20);
		parallelGroupAgent.addGap(30);
		parallelGroupAgent.addGap(40);
		parallelGroupAgent.addGap(50);
		parallelGroupAgent.addGap(60);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup() {
				return new ParallelGroup();
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
		});
		
		assertEquals(6, parallelGroup.getSize());
		Iterator<ParallelGroup> iterator = parallelGroup.iterator();
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
	}
	
	/**
	 * Test case #3.
	 * <p>
	 * The test case checks the following assertion:
	 * <p>
	 * If the parallel group agent contains gaps only,
	 * the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method
	 * returns a parallel group with gaps only.
	 * <p>
	 * The gaps have different types.
	 */
	@Test
	void testGroupContent_3() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.addGap(20);
		parallelGroupAgent.addGap(30);
		parallelGroupAgent.addGap(40);
		parallelGroupAgent.addGap(50);
		parallelGroupAgent.addGap(60);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup() {
				return new ParallelGroup();
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
		});
		
		assertEquals(6, parallelGroup.getSize());
		Iterator<ParallelGroup> iterator = parallelGroup.iterator();
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
	}
	
	/**
	 * Test case #4.
	 * <p>
	 * The test case checks the following assertion:
	 * <p>
	 * If the parallel group agent contains gaps only,
	 * the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method
	 * returns a parallel group with gaps only.
	 * <p>
	 * The gaps have different types.
	 */
	@Test
	void testGroupContent_4() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.addGap(20);
		parallelGroupAgent.addGap(30);
		parallelGroupAgent.addGap(40);
		parallelGroupAgent.addGap(50);
		parallelGroupAgent.addGap(60);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup() {
				return new ParallelGroup();
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
		});
		
		assertEquals(6, parallelGroup.getSize());
		Iterator<ParallelGroup> iterator = parallelGroup.iterator();
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
	}
	
	/**
	 * Test case #5.
	 * <p>
	 * The test case checks the following assertion:
	 * <p>
	 * If the parallel group agent contains gaps only,
	 * the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method
	 * returns a parallel group with gaps only.
	 * <p>
	 * The gaps have different types.
	 */
	@Test
	void testGroupContent_5() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.addGap(20);
		parallelGroupAgent.addGap(30);
		parallelGroupAgent.addGap(40);
		parallelGroupAgent.addGap(50);
		parallelGroupAgent.addGap(60);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup() {
				return new ParallelGroup();
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
		});
		
		assertEquals(6, parallelGroup.getSize());
		Iterator<ParallelGroup> iterator = parallelGroup.iterator();
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
	}
	
	/**
	 * Test case #6.
	 * <p>
	 * The test case checks the following assertion:
	 * <p>
	 * If the parallel group agent contains gaps only,
	 * the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method
	 * returns a parallel group with gaps only.
	 * <p>
	 * The gaps have different types.
	 */
	@Test
	void testGroupContent_6() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.addGap(20);
		parallelGroupAgent.addGap(30);
		parallelGroupAgent.addGap(40);
		parallelGroupAgent.addGap(50);
		parallelGroupAgent.addGap(60);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup() {
				return new ParallelGroup();
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
		});
		
		assertEquals(6, parallelGroup.getSize());
		Iterator<ParallelGroup> iterator = parallelGroup.iterator();
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
	}
	
	/**
	 * Test case #7.
	 * <p>
	 * The test case checks the following assertion:
	 * <p>
	 * If the parallel group agent contains gaps only,
	 * the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method
	 * returns a parallel group with gaps only.
	 * <p>
	 * The gaps have different types.
	 */
	@Test
	void testGroupContent_7() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.addGap(20);
		parallelGroupAgent.addGap(30);
		parallelGroupAgent.addGap(40);
		parallelGroupAgent.addGap(50);
		parallelGroupAgent.addGap(60);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup() {
				return new ParallelGroup();
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
		});
		
		assertEquals(6, parallelGroup.getSize());
		Iterator<ParallelGroup> iterator = parallelGroup.iterator();
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
	}
	
	/**
	 * Test case #8.
	 * <p>
	 * The test case checks the following assertion:
	 * <p>
	 * If the parallel group agent contains gaps only,
	 * the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method
	 * returns a parallel group with gaps only.
	 * <p>
	 * The gaps have different types.
	 */
	@Test
	void testGroupContent_8() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.addGap(20);
		parallelGroupAgent.addGap(30);
		parallelGroupAgent.addGap(40);
		parallelGroupAgent.addGap(50);
		parallelGroupAgent.addGap(60);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup() {
				return new ParallelGroup();
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
		});
		
		assertEquals(6, parallelGroup.getSize());
		Iterator<ParallelGroup> iterator = parallelGroup.iterator();
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
	}
	
	/**
	 * Test case #9.
	 * <p>
	 * The test case checks the following assertion:
	 * <p>
	 * If the parallel group agent contains gaps only,
	 * the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method
	 * returns a parallel group with gaps only.
	 * <p>
	 * The gaps have different types.
	 */
	@Test
	void testGroupContent_9() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.addGap(20);
		parallelGroupAgent.addGap(30);
		parallelGroupAgent.addGap(40);
		parallelGroupAgent.addGap(50);
		parallelGroupAgent.addGap(60);
		
		ParallelGroup parallelGroup = parallelGroupAgent.groupContent(new GroupCreatorAndElementAdder() {
			public ParallelGroup createParallelGroup() {
				return new ParallelGroup();
			}
			public void addComponentToGroup(ParallelGroup group, Agent componentAgent) {
				group.addComponent(componentAgent.getComponent());
			}
		});
		
		assertEquals(6, parallelGroup.getSize());
		Iterator<ParallelGroup> iterator = parallelGroup.iterator();
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
		assertTrue(iterator.next().isGap());
	}
	
	/**
	 * Test case #10.
	 * <p>
	 * The test case checks the following assertion:
	 * <p>
	 * If the parallel group agent contains gaps only,
	 * the {@link ParallelGroupAgent#groupContent(GroupCreatorAndElementAdder)} method
	 * returns a parallel group with gaps only.
	 * <p>
	 * The gaps have different types.
	 */
	@Test
	void testGroupContent_10() {
		ParallelGroupAgent parallelGroupAgent = new ParallelGroupAgent();
		parallelGroupAgent.addGap(10);
		parallelGroupAgent.addGap(20);
