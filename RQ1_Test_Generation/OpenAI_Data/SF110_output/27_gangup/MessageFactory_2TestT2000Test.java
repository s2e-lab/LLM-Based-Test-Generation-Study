// MessageFactory_2Test.java
package module;

import util.AbstractFactory;
import module.Message;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFactory}.
* It contains ten unit test cases for the {@link MessageFactory#createMessage(String, Object)} method.
*/
class MessageFactory_2Test {

	/**
	* Test case for the {@link MessageFactory#createMessage(String, Object)} method.
	* It tests if the method returns a new message with the specified topic and data.
	*/
	@Test
	void testCreateMessage() {
		Message msg = MessageFactory.createMessage("topic", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("*", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
	
	/**
	* Test case for the {@link MessageFactory#createMessage(String, Object)} method.
	* It tests if the method returns a new message with the specified topic and data.
	*/
	@Test
	void testCreateMessage2() {
		Message msg = MessageFactory.createMessage("topic", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("*", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
	
	/**
	* Test case for the {@link MessageFactory#createMessage(String, Object)} method.
	* It tests if the method returns a new message with the specified topic and data.
	*/
	@Test
	void testCreateMessage3() {
		Message msg = MessageFactory.createMessage("topic", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("*", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
	
	/**
	* Test case for the {@link MessageFactory#createMessage(String, Object)} method.
	* It tests if the method returns a new message with the specified topic and data.
	*/
	@Test
	void testCreateMessage4() {
		Message msg = MessageFactory.createMessage("topic", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("*", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
	
	/**
	* Test case for the {@link MessageFactory#createMessage(String, Object)} method.
	* It tests if the method returns a new message with the specified topic and data.
	*/
	@Test
	void testCreateMessage5() {
		Message msg = MessageFactory.createMessage("topic", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("*", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
	
	/**
	* Test case for the {@link MessageFactory#createMessage(String, Object)} method.
	* It tests if the method returns a new message with the specified topic and data.
	*/
	@Test
	void testCreateMessage6() {
		Message msg = MessageFactory.createMessage("topic", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("*", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
	
	/**
	* Test case for the {@link MessageFactory#createMessage(String, Object)} method.
	* It tests if the method returns a new message with the specified topic and data.
	*/
	@Test
	void testCreateMessage7() {
		Message msg = MessageFactory.createMessage("topic", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("*", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
	
	/**
	* Test case for the {@link MessageFactory#createMessage(String, Object)} method.
	* It tests if the method returns a new message with the specified topic and data.
	*/
	@Test
	void testCreateMessage8() {
		Message msg = MessageFactory.createMessage("topic", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("*", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
	
	/**
	* Test case for the {@link MessageFactory#createMessage(String, Object)} method.
	* It tests if the method returns a new message with the specified topic and data.
	*/
	@Test
	void testCreateMessage9() {
		Message msg = MessageFactory.createMessage("topic", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("*", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
	
	/**
	* Test case for the {@link MessageFactory#createMessage(String, Object)} method.
	* It tests if the method returns a new message with the specified topic and data.
	*/
	@Test
	void testCreateMessage10() {
		Message msg = MessageFactory.createMessage("topic", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("*", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
}

// MessageFactory_3Test.java
package module;

import util.AbstractFactory;
import module.Message;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFactory}.
* It contains ten unit test cases for the {@link MessageFactory#createMessage(String, String, Object)} method.
*/
class MessageFactory_3Test {
		
	/**
	* Test case for the {@link MessageFactory#createMessage(String, String, Object)} method.
	* It tests if the method returns a new message with the specified topic, recipient, and data.
	*/
	@Test
	void testCreateMessage() {
		Message msg = MessageFactory.createMessage("topic", "recipient", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("recipient", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
	
	/**
	* Test case for the {@link MessageFactory#createMessage(String, String, Object)} method.
	* It tests if the method returns a new message with the specified topic, recipient, and data.
	*/
	@Test
	void testCreateMessage2() {
		Message msg = MessageFactory.createMessage("topic", "recipient", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("recipient", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
	
	/**
	* Test case for the {@link MessageFactory#createMessage(String, String, Object)} method.
	* It tests if the method returns a new message with the specified topic, recipient, and data.
	*/
	@Test
	void testCreateMessage3() {
		Message msg = MessageFactory.createMessage("topic", "recipient", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("recipient", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
	
	/**
	* Test case for the {@link MessageFactory#createMessage(String, String, Object)} method.
	* It tests if the method returns a new message with the specified topic, recipient, and data.
	*/
	@Test
	void testCreateMessage4() {
		Message msg = MessageFactory.createMessage("topic", "recipient", "data");
		assertEquals("topic", msg.getTopic());
		assertEquals("recipient", msg.getRecipient());
		assertEquals("data", msg.getData());
	}
	
	/**
	* Test case for the {@link MessageFactory#createMessage(String, String, Object)} method.
	* It tests if the method returns a new message with the specified topic, recipient, and data.
	*/
	@Test
	void testCreateMessage5() {
		Message msg = MessageFactory.createMessage("topic", "recipient", "data");
	