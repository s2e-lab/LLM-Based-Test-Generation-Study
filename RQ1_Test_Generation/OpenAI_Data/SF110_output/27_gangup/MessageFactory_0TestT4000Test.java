// MessageFactory_0Test.java
package module;

import util.AbstractFactory;
import module.Message;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFactory}.
* It contains ten unit test cases for the {@link MessageFactory#createMessage()} method.
*/
class MessageFactory_0Test {

	/**
	* Test case for {@link MessageFactory#createMessage()}.
	*/
	@Test
	void testCreateMessage() {
		MessageFactory mf = MessageFactory.getInstance();
		Message msg = mf.createMessage();
		assertNotNull(msg);
		assertEquals(msg.getTopic(), null);
		assertEquals(msg.getRecipient(), "*");
		assertEquals(msg.getData(), null);
	}
	
	/**
	* Test case for {@link MessageFactory#createMessage(String, Object)}.
	*/
	@Test
	void testCreateMessage_0() {
		MessageFactory mf = MessageFactory.getInstance();
		Message msg = mf.createMessage("topic", "data");
		assertNotNull(msg);
		assertEquals(msg.getTopic(), "topic");
		assertEquals(msg.getRecipient(), "*");
		assertEquals(msg.getData(), "data");
	}
	
	/**
	* Test case for {@link MessageFactory#createMessage(String, String, Object)}.
	*/
	@Test
	void testCreateMessage_1() {
		MessageFactory mf = MessageFactory.getInstance();
		Message msg = mf.createMessage("topic", "recipient", "data");
		assertNotNull(msg);
		assertEquals(msg.getTopic(), "topic");
		assertEquals(msg.getRecipient(), "recipient");
		assertEquals(msg.getData(), "data");
	}
	
	/**
	* Test case for {@link MessageFactory#createUnloadMessage(String)}.
	*/
	@Test
	void testCreateUnloadMessage() {
		MessageFactory mf = MessageFactory.getInstance();
		Message msg = mf.createUnloadMessage("name");
		assertNotNull(msg);
		assertEquals(msg.getTopic(), "KERNEL");
		assertEquals(msg.getRecipient(), "*");
		assertEquals(msg.getData(), "UNLOAD name");
	}
	
	/**
	* Test case for {@link MessageFactory#createWarningMessage(String, Object...)}.
	*/
	@Test
	void testCreateWarningMessage() {
		MessageFactory mf = MessageFactory.getInstance();
		Message msg = mf.createWarningMessage("localeKey", "args");
		assertNotNull(msg);
		assertEquals(msg.getTopic(), "WARNING");
		assertEquals(msg.getRecipient(), "*");
		assertEquals(msg.getData(), "Reading string from locale failed: key=localeKey\nThis probably means that you have an old or otherwise\ninaccurate locale file (maybe it's missing altogether)\nor that the classpath does not contain the directory.");
	}
	
	/**
	* Test case for {@link MessageFactory#createErrorMessage(String, Object...)}.
	*/
	@Test
	void testCreateErrorMessage() {
		MessageFactory mf = MessageFactory.getInstance();
		Message msg = mf.createErrorMessage("localeKey", "args");
		assertNotNull(msg);
		assertEquals(msg.getTopic(), "ERROR");
		assertEquals(msg.getRecipient(), "*");
		assertEquals(msg.getData(), "Reading string from locale failed: key=localeKey\nThis probably means that you have an old or otherwise\ninaccurate locale file (maybe it's missing altogether)\nor that the classpath does not contain the directory.");
	}
	
	/**
	* Test case for {@link MessageFactory#createConnectionDroppedMessage(int, String)}.
	*/
	@Test
	void testCreateConnectionDroppedMessage() {
		MessageFactory mf = MessageFactory.getInstance();
		Message msg = mf.createConnectionDroppedMessage(1, "addr");
		assertNotNull(msg);
		assertEquals(msg.getTopic(), "DROPPED");
		assertEquals(msg.getRecipient(), "*");
		assertEquals(msg.getData(), "ID: 1 IP: addr");
	}
	
}