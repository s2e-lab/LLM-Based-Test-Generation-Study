// GlobalClientGroupTest0.java
package ioproject.server.network;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GlobalClientGroup}.
* It contains ten unit test cases for the {@link GlobalClientGroup#add(Client)} method.
*/
class GlobalClientGroupTest0 {

	/**
	 * Test case for {@link GlobalClientGroup#add(Client)}.
	 * Tests if the method throws an exception.
	 */
	@Test
	void testAdd() {
		GlobalClientGroup globalClientGroup = new GlobalClientGroup();
		Client client = new Client(null, null);
		assertThrows(UnsupportedOperationException.class, () -> {
			globalClientGroup.add(client);
		});
	}
}

// GlobalClientGroupTest1.java
package ioproject.server.network;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GlobalClientGroup}.
* It contains ten unit test cases for the {@link GlobalClientGroup#remove(Client)} method.
*/
class GlobalClientGroupTest1 {
		
	/**
	 * Test case for {@link GlobalClientGroup#remove(Client)}.
	 * Tests if the method throws an exception.
	 */
	@Test
	void testRemove() {
		GlobalClientGroup globalClientGroup = new GlobalClientGroup();
		Client client = new Client(null, null);
		assertThrows(UnsupportedOperationException.class, () -> {
			globalClientGroup.remove(client);
		});
	}
}

// GlobalClientGroupTest2.java
package ioproject.server.network;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GlobalClientGroup}.
* It contains ten unit test cases for the {@link GlobalClientGroup#notifyClientConnected(Client)} method.
*/
class GlobalClientGroupTest2 {
		
	/**
	 * Test case for {@link GlobalClientGroup#notifyClientConnected(Client)}.
	 * Tests if the method adds the client to the group.
	 */
	@Test
	void testNotifyClientConnected() {
		GlobalClientGroup globalClientGroup = new GlobalClientGroup();
		Client client = new Client(null, null);
		globalClientGroup.notifyClientConnected(client);
		assertTrue(globalClientGroup.contains(client));
	}
}

// GlobalClientGroupTest3.java
package ioproject.server.network;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GlobalClientGroup}.
* It contains ten unit test cases for the {@link GlobalClientGroup#notifyClientDisconnected(Client)} method.
*/
class GlobalClientGroupTest3 {
		
	/**
	 * Test case for {@link GlobalClientGroup#notifyClientDisconnected(Client)}.
	 * Tests if the method removes the client from the group.
	 */
	@Test
	void testNotifyClientDisconnected() {
		GlobalClientGroup globalClientGroup = new GlobalClientGroup();
		Client client = new Client(null, null);
		globalClientGroup.notifyClientConnected(client);
		globalClientGroup.notifyClientDisconnected(client);
		assertFalse(globalClientGroup.contains(client));
	}
}

// GlobalClientGroupTest4.java
package ioproject.server.network;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GlobalClientGroup}.
* It contains ten unit test cases for the {@link GlobalClientGroup#contains(Client)} method.
*/
class GlobalClientGroupTest4 {
		
	/**
	 * Test case for {@link GlobalClientGroup#contains(Client)}.
	 * Tests if the method returns true if the client is in the group.
	 */
	@Test
	void testContains() {
		GlobalClientGroup globalClientGroup = new GlobalClientGroup();
		Client client = new Client(null, null);
		globalClientGroup.notifyClientConnected(client);
		assertTrue(globalClientGroup.contains(client));
	}
}

// GlobalClientGroupTest5.java
package ioproject.server.network;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GlobalClientGroup}.
* It contains ten unit test cases for the {@link GlobalClientGroup#contains(Client)} method.
*/
class GlobalClientGroupTest5 {
		
	/**
	 * Test case for {@link GlobalClientGroup#contains(Client)}.
	 * Tests if the method returns false if the client is not in the group.
	 */
	@Test
	void testContains() {
		GlobalClientGroup globalClientGroup = new GlobalClientGroup();
		Client client = new Client(null, null);
		assertFalse(globalClientGroup.contains(client));
	}
}

// GlobalClientGroupTest6.java
package ioproject.server.network;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GlobalClientGroup}.
* It contains ten unit test cases for the {@link GlobalClientGroup#contains(Client)} method.
*/
class GlobalClientGroupTest6 {
		
	/**
	 * Test case for {@link GlobalClientGroup#contains(Client)}.
	 * Tests if the method returns false if the client is not in the group.
	 */
	@Test
	void testContains() {
		GlobalClientGroup globalClientGroup = new GlobalClientGroup();
		Client client = new Client(null, null);
		globalClientGroup.notifyClientConnected(client);
		globalClientGroup.notifyClientDisconnected(client);
		assertFalse(globalClientGroup.contains(client));
	}
}

// GlobalClientGroupTest7.java
package ioproject.server.network;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GlobalClientGroup}.
* It contains ten unit test cases for the {@link GlobalClientGroup#contains(Client)} method.
*/
class GlobalClientGroupTest7 {
		
	/**
	 * Test case for {@link GlobalClientGroup#contains(Client)}.
	 * Tests if the method returns false if the client is not in the group.
	 */
	@Test
	void testContains() {
		GlobalClientGroup globalClientGroup = new GlobalClientGroup();
		Client client = new Client(null, null);
		globalClientGroup.notifyClientConnected(client);
		globalClientGroup.notifyClientDisconnected(client);
		assertFalse(globalClientGroup.contains(client));
	}
}

// GlobalClientGroupTest8.java
package ioproject.server.network;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GlobalClientGroup}.
* It contains ten unit test cases for the {@link GlobalClientGroup#contains(Client)} method.
*/
class GlobalClientGroupTest8 {
		
	/**
	 * Test case for {@link GlobalClientGroup#contains(Client)}.
	 * Tests if the method returns false if the client is not in the group.
	 */
	@Test
	void testContains() {
		GlobalClientGroup globalClientGroup = new GlobalClientGroup();
		Client client = new Client(null, null);
		globalClientGroup.notifyClientConnected(client);
		globalClientGroup.notifyClientDisconnected(client);
		assertFalse(globalClientGroup.contains(client));
	}
}

// GlobalClientGroupTest9.java
package ioproject.server.network;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GlobalClientGroup}.
* It contains ten unit test cases for the {@link GlobalClientGroup#contains(Client)} method.
*/
class