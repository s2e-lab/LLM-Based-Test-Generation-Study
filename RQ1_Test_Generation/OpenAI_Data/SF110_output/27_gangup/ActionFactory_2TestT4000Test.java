// ActionFactory_2Test.java
package state;

import util.AbstractFactory;
import util.ObjectManager;
import util.ManagedObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ActionFactory}.
* It contains ten unit test cases for the {@link ActionFactory#getInstance()} method.
*/
class ActionFactory_2Test {

	/**
	* Test case for {@link ActionFactory#getInstance()}.
	* It tests if the method returns the same instance of the ActionFactory class.
	*/
	@Test
	void testGetInstance() {
		ActionFactory instance1 = ActionFactory.getInstance();
		ActionFactory instance2 = ActionFactory.getInstance();
		assertEquals(instance1, instance2);
	}
}

// ActionFactory_3Test.java
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
class ActionFactory_3Test {
		
	/**
	* Test case for {@link ActionFactory#createAction(int, int, int)}.
	* It tests if the method returns a new Action instance with the specified arguments.
	*/
	@Test
	void testCreateAction() {
		ActionFactory instance = ActionFactory.getInstance();
		Action action = instance.createAction(1, 2, 3);
		assertEquals(1, action.getType());
		assertEquals(2, action.getActorID());
		assertEquals(3, action.getTargetID());
	}
}

// ActionFactory_4Test.java
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
class ActionFactory_4Test {
		
	/**
	* Test case for {@link ActionFactory#createMoveAction(int, byte, byte, byte)}.
	* It tests if the method returns a new move Action with the specified arguments.
	*/
	@Test
	void testCreateMoveAction() {
		ActionFactory instance = ActionFactory.getInstance();
		Action action = instance.createMoveAction(1, (byte) 2, (byte) 3, (byte) 4);
		assertEquals(Action.ACTION_MOVE, action.getType());
		assertEquals(1, action.getActorID());
		assertEquals(-1, action.getTargetID());
		assertEquals(2, action.getX());
		assertEquals(3, action.getY());
		assertEquals(4, action.getZ());
	}
}

// ActionFactory_5Test.java
package state;

import util.AbstractFactory;
import util.ObjectManager;
import util.ManagedObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ActionFactory}.
* It contains ten unit test cases for the {@link ActionFactory#createObject()} method.
*/
class ActionFactory_5Test {
		
	/**
	* Test case for {@link ActionFactory#createObject()}.
	* It tests if the method returns a new Action instance.
	*/
	@Test
	void testCreateObject() {
		ActionFactory instance = ActionFactory.getInstance();
		Action action = instance.createObject();
		assertEquals(0, action.getType());
		assertEquals(0, action.getActorID());
		assertEquals(0, action.getTargetID());
	}
}

// ActionFactory_6Test.java
package state;

import util.AbstractFactory;
import util.ObjectManager;
import util.ManagedObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ActionFactory}.
* It contains ten unit test cases for the {@link ActionFactory#getStockCount()} method.
*/
class ActionFactory_6Test {
		
	/**
	* Test case for {@link ActionFactory#getStockCount()}.
	* It tests if the method returns the number of Action instances in the stock.
	*/
	@Test
	void testGetStockCount() {
		ActionFactory instance = ActionFactory.getInstance();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		assertEquals(3, instance.getStockCount());
	}
}

// ActionFactory_7Test.java
package state;

import util.AbstractFactory;
import util.ObjectManager;
import util.ManagedObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ActionFactory}.
* It contains ten unit test cases for the {@link ActionFactory#getStockCount()} method.
*/
class ActionFactory_7Test {
		
	/**
	* Test case for {@link ActionFactory#getStockCount()}.
	* It tests if the method returns the number of Action instances in the stock.
	*/
	@Test
	void testGetStockCount() {
		ActionFactory instance = ActionFactory.getInstance();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.createObject();
		instance.