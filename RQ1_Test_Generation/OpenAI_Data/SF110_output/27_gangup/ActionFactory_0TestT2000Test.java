// ActionFactory_0Test.java
package state;

import util.AbstractFactory;
import util.ObjectManager;
import util.ManagedObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ActionFactory}.
* It contains ten unit test cases for the {@link ActionFactory#createAction(int, int, int)} method.
*/
class ActionFactory_0Test {

	/**
	* Test case for the {@link ActionFactory#createAction(int, int, int)} method.
	* It tests the creation of a new Action with the specified arguments.
	*/
	@Test
	void testCreateAction() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createAction(Action.ACTION_MOVE, 1, 2);
		assertEquals(Action.ACTION_MOVE, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(2, action.getTargetID());
		assertEquals(0, action.getX());
		assertEquals(0, action.getY());
		assertEquals(0, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createAction(int, int, int)} method.
	* It tests the creation of a new Action with the specified arguments.
	*/
	@Test
	void testCreateAction_1() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createAction(Action.ACTION_ATTACK, 1, 2);
		assertEquals(Action.ACTION_ATTACK, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(2, action.getTargetID());
		assertEquals(0, action.getX());
		assertEquals(0, action.getY());
		assertEquals(0, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createAction(int, int, int)} method.
	* It tests the creation of a new Action with the specified arguments.
	*/
	@Test
	void testCreateAction_2() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createAction(Action.ACTION_ATTACK, 1, 2);
		assertEquals(Action.ACTION_ATTACK, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(2, action.getTargetID());
		assertEquals(0, action.getX());
		assertEquals(0, action.getY());
		assertEquals(0, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createAction(int, int, int)} method.
	* It tests the creation of a new Action with the specified arguments.
	*/
	@Test
	void testCreateAction_3() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createAction(Action.ACTION_ATTACK, 1, 2);
		assertEquals(Action.ACTION_ATTACK, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(2, action.getTargetID());
		assertEquals(0, action.getX());
		assertEquals(0, action.getY());
		assertEquals(0, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createAction(int, int, int)} method.
	* It tests the creation of a new Action with the specified arguments.
	*/
	@Test
	void testCreateAction_4() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createAction(Action.ACTION_ATTACK, 1, 2);
		assertEquals(Action.ACTION_ATTACK, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(2, action.getTargetID());
		assertEquals(0, action.getX());
		assertEquals(0, action.getY());
		assertEquals(0, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createAction(int, int, int)} method.
	* It tests the creation of a new Action with the specified arguments.
	*/
	@Test
	void testCreateAction_5() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createAction(Action.ACTION_ATTACK, 1, 2);
		assertEquals(Action.ACTION_ATTACK, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(2, action.getTargetID());
		assertEquals(0, action.getX());
		assertEquals(0, action.getY());
		assertEquals(0, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createAction(int, int, int)} method.
	* It tests the creation of a new Action with the specified arguments.
	*/
	@Test
	void testCreateAction_6() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createAction(Action.ACTION_ATTACK, 1, 2);
		assertEquals(Action.ACTION_ATTACK, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(2, action.getTargetID());
		assertEquals(0, action.getX());
		assertEquals(0, action.getY());
		assertEquals(0, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createAction(int, int, int)} method.
	* It tests the creation of a new Action with the specified arguments.
	*/
	@Test
	void testCreateAction_7() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createAction(Action.ACTION_ATTACK, 1, 2);
		assertEquals(Action.ACTION_ATTACK, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(2, action.getTargetID());
		assertEquals(0, action.getX());
		assertEquals(0, action.getY());
		assertEquals(0, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createAction(int, int, int)} method.
	* It tests the creation of a new Action with the specified arguments.
	*/
	@Test
	void testCreateAction_8() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createAction(Action.ACTION_ATTACK, 1, 2);
		assertEquals(Action.ACTION_ATTACK, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(2, action.getTargetID());
		assertEquals(0, action.getX());
		assertEquals(0, action.getY());
		assertEquals(0, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createAction(int, int, int)} method.
	* It tests the creation of a new Action with the specified arguments.
	*/
	@Test
	void testCreateAction_9() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createAction(Action.ACTION_ATTACK, 1, 2);
		assertEquals(Action.ACTION_ATTACK, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(2, action.getTargetID());
		assertEquals(0, action.getX());
		assertEquals(0, action.getY());
		assertEquals(0, action.getZ());
	}
	
}

// ActionFactory_1Test.java
package state;

import util.AbstractFactory;
import util.ObjectManager;
import util.ManagedObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
