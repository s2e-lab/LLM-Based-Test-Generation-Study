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
	void testCreateAction2() {
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
	void testCreateAction3() {
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
	void testCreateAction4() {
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
	void testCreateAction5() {
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
	void testCreateAction6() {
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
	void testCreateAction7() {
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
	void testCreateAction8() {
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
	void testCreateAction9() {
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
	void testCreateAction10() {
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

/**
* Test class of {@link ActionFactory}.
* It contains ten unit test cases for the {@link ActionFactory#createMoveAction(int, byte, byte, byte)} method.
*/
class ActionFactory_1Test {
		
	/**
	* Test case for the {@link ActionFactory#createMoveAction(int, byte, byte, byte)} method.
	* It tests the creation of a new move Action with the specified arguments.
	*/
	@Test
	void testCreateMoveAction() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createMoveAction(1, (byte) 2, (byte) 3, (byte) 4);
		assertEquals(Action.ACTION_MOVE, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(-1, action.getTargetID());
		assertEquals(2, action.getX());
		assertEquals(3, action.getY());
		assertEquals(4, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createMoveAction(int, byte, byte, byte)} method.
	* It tests the creation of a new move Action with the specified arguments.
	*/
	@Test
	void testCreateMoveAction2() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createMoveAction(1, (byte) 2, (byte) 3, (byte) 4);
		assertEquals(Action.ACTION_MOVE, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(-1, action.getTargetID());
		assertEquals(2, action.getX());
		assertEquals(3, action.getY());
		assertEquals(4, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createMoveAction(int, byte, byte, byte)} method.
	* It tests the creation of a new move Action with the specified arguments.
	*/
	@Test
	void testCreateMoveAction3() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createMoveAction(1, (byte) 2, (byte) 3, (byte) 4);
		assertEquals(Action.ACTION_MOVE, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(-1, action.getTargetID());
		assertEquals(2, action.getX());
		assertEquals(3, action.getY());
		assertEquals(4, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createMoveAction(int, byte, byte, byte)} method.
	* It tests the creation of a new move Action with the specified arguments.
	*/
	@Test
	void testCreateMoveAction4() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createMoveAction(1, (byte) 2, (byte) 3, (byte) 4);
		assertEquals(Action.ACTION_MOVE, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(-1, action.getTargetID());
		assertEquals(2, action.getX());
		assertEquals(3, action.getY());
		assertEquals(4, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createMoveAction(int, byte, byte, byte)} method.
	* It tests the creation of a new move Action with the specified arguments.
	*/
	@Test
	void testCreateMoveAction5() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createMoveAction(1, (byte) 2, (byte) 3, (byte) 4);
		assertEquals(Action.ACTION_MOVE, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(-1, action.getTargetID());
		assertEquals(2, action.getX());
		assertEquals(3, action.getY());
		assertEquals(4, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createMoveAction(int, byte, byte, byte)} method.
	* It tests the creation of a new move Action with the specified arguments.
	*/
	@Test
	void testCreateMoveAction6() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createMoveAction(1, (byte) 2, (byte) 3, (byte) 4);
		assertEquals(Action.ACTION_MOVE, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(-1, action.getTargetID());
		assertEquals(2, action.getX());
		assertEquals(3, action.getY());
		assertEquals(4, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createMoveAction(int, byte, byte, byte)} method.
	* It tests the creation of a new move Action with the specified arguments.
	*/
	@Test
	void testCreateMoveAction7() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createMoveAction(1, (byte) 2, (byte) 3, (byte) 4);
		assertEquals(Action.ACTION_MOVE, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(-1, action.getTargetID());
		assertEquals(2, action.getX());
		assertEquals(3, action.getY());
		assertEquals(4, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createMoveAction(int, byte, byte, byte)} method.
	* It tests the creation of a new move Action with the specified arguments.
	*/
	@Test
	void testCreateMoveAction8() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createMoveAction(1, (byte) 2, (byte) 3, (byte) 4);
		assertEquals(Action.ACTION_MOVE, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(-1, action.getTargetID());
		assertEquals(2, action.getX());
		assertEquals(3, action.getY());
		assertEquals(4, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createMoveAction(int, byte, byte, byte)} method.
	* It tests the creation of a new move Action with the specified arguments.
	*/
	@Test
	void testCreateMoveAction9() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createMoveAction(1, (byte) 2, (byte) 3, (byte) 4);
		assertEquals(Action.ACTION_MOVE, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(-1, action.getTargetID());
		assertEquals(2, action.getX());
		assertEquals(3, action.getY());
		assertEquals(4, action.getZ());
	}
	
	/**
	* Test case for the {@link ActionFactory#createMoveAction(int, byte, byte, byte)} method.
	* It tests the creation of a new move Action with the specified arguments.
	*/
	@Test
	void testCreateMoveAction10() {
		ActionFactory actionFactory = ActionFactory.getInstance();
		Action action = actionFactory.createMoveAction(1, (byte) 2, (byte) 3, (byte) 4);
		assertEquals(Action.ACTION_MO