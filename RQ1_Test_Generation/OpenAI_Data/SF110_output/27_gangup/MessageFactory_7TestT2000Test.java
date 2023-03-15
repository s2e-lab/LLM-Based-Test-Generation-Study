// MessageFactory_7Test.java
package module;

import util.AbstractFactory;
import module.Message;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFactory}.
* It contains ten unit test cases for the {@link MessageFactory#createConnectionDroppedMessage(int, String)} method.
*/
class MessageFactory_7Test {

	/**
	* Test case for {@link MessageFactory#createConnectionDroppedMessage(int, String)} method.
	* This test case tests the method with a valid id and a valid address.
	*/
	@Test
	void testCreateConnectionDroppedMessage_1() {
		Message msg = MessageFactory.createConnectionDroppedMessage(1, "127.0.0.1");
		assertEquals("DROPPED", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("ID: 1 IP: 127.0.0.1", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createConnectionDroppedMessage(int, String)} method.
	* This test case tests the method with a valid id and a valid address.
	*/
	@Test
	void testCreateConnectionDroppedMessage_2() {
		Message msg = MessageFactory.createConnectionDroppedMessage(2, "127.0.0.1");
		assertEquals("DROPPED", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("ID: 2 IP: 127.0.0.1", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createConnectionDroppedMessage(int, String)} method.
	* This test case tests the method with a valid id and a valid address.
	*/
	@Test
	void testCreateConnectionDroppedMessage_3() {
		Message msg = MessageFactory.createConnectionDroppedMessage(3, "127.0.0.1");
		assertEquals("DROPPED", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("ID: 3 IP: 127.0.0.1", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createConnectionDroppedMessage(int, String)} method.
	* This test case tests the method with a valid id and a valid address.
	*/
	@Test
	void testCreateConnectionDroppedMessage_4() {
		Message msg = MessageFactory.createConnectionDroppedMessage(4, "127.0.0.1");
		assertEquals("DROPPED", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("ID: 4 IP: 127.0.0.1", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createConnectionDroppedMessage(int, String)} method.
	* This test case tests the method with a valid id and a valid address.
	*/
	@Test
	void testCreateConnectionDroppedMessage_5() {
		Message msg = MessageFactory.createConnectionDroppedMessage(5, "127.0.0.1");
		assertEquals("DROPPED", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("ID: 5 IP: 127.0.0.1", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createConnectionDroppedMessage(int, String)} method.
	* This test case tests the method with a valid id and a valid address.
	*/
	@Test
	void testCreateConnectionDroppedMessage_6() {
		Message msg = MessageFactory.createConnectionDroppedMessage(6, "127.0.0.1");
		assertEquals("DROPPED", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("ID: 6 IP: 127.0.0.1", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createConnectionDroppedMessage(int, String)} method.
	* This test case tests the method with a valid id and a valid address.
	*/
	@Test
	void testCreateConnectionDroppedMessage_7() {
		Message msg = MessageFactory.createConnectionDroppedMessage(7, "127.0.0.1");
		assertEquals("DROPPED", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("ID: 7 IP: 127.0.0.1", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createConnectionDroppedMessage(int, String)} method.
	* This test case tests the method with a valid id and a valid address.
	*/
	@Test
	void testCreateConnectionDroppedMessage_8() {
		Message msg = MessageFactory.createConnectionDroppedMessage(8, "127.0.0.1");
		assertEquals("DROPPED", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("ID: 8 IP: 127.0.0.1", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createConnectionDroppedMessage(int, String)} method.
	* This test case tests the method with a valid id and a valid address.
	*/
	@Test
	void testCreateConnectionDroppedMessage_9() {
		Message msg = MessageFactory.createConnectionDroppedMessage(9, "127.0.0.1");
		assertEquals("DROPPED", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("ID: 9 IP: 127.0.0.1", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createConnectionDroppedMessage(int, String)} method.
	* This test case tests the method with a valid id and a valid address.
	*/
	@Test
	void testCreateConnectionDroppedMessage_10() {
		Message msg = MessageFactory.createConnectionDroppedMessage(10, "127.0.0.1");
		assertEquals("DROPPED", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("ID: 10 IP: 127.0.0.1", msg.getData());
	}
}

// MessageFactory_8Test.java
package module;

import util.AbstractFactory;
import module.Message;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFactory}.
* It contains ten unit test cases for the {@link MessageFactory#createUnloadMessage(String)} method.
*/
class MessageFactory_8Test {
		
	/**
	* Test case for {@link MessageFactory#createUnloadMessage(String)} method.
	* This test case tests the method with a valid name.
	*/
	@Test
	void testCreateUnloadMessage_1() {
		Message msg = MessageFactory.createUnloadMessage("module1");
		assertEquals("KERNEL", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("UNLOAD module1", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createUnloadMessage(String)} method.
	* This test case tests the method with a valid name.
	*/
	@Test
	void testCreateUnloadMessage_2() {
		Message msg = MessageFactory.createUnloadMessage("module2");
		assertEquals("KERNEL", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("UNLOAD module2", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createUnloadMessage(String)} method.
	* This test case tests the method with a valid name.
	*/
	@Test
	void testCreateUnloadMessage_3() {
		Message msg = MessageFactory.createUnloadMessage("module3");
		assertEquals("KERNEL", msg.getHeader());
		assert