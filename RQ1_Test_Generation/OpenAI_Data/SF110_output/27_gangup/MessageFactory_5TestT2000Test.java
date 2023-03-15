// MessageFactory_5Test.java
package module;

import util.AbstractFactory;
import module.Message;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFactory}.
* It contains ten unit test cases for the {@link MessageFactory#createWarningMessage(String, Object[])} method.
*/
class MessageFactory_5Test {

	/**
	* Test case for {@link MessageFactory#createWarningMessage(String, Object[])} method.
	* This test case tests the functionality of the method when the locale key is null.
	*/
	@Test
	void testCreateWarningMessage_1() {
		Message msg = MessageFactory.createWarningMessage(null);
		assertEquals("WARNING", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("Reading string from locale failed: key=null\nThis probably means that you have an old or otherwise\ninaccurate locale file (maybe it's missing altogether)\nor that the classpath does not contain the directory.", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createWarningMessage(String, Object[])} method.
	* This test case tests the functionality of the method when the locale key is empty.
	*/
	@Test
	void testCreateWarningMessage_2() {
		Message msg = MessageFactory.createWarningMessage("");
		assertEquals("WARNING", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("Reading string from locale failed: key=\nThis probably means that you have an old or otherwise\ninaccurate locale file (maybe it's missing altogether)\nor that the classpath does not contain the directory.", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createWarningMessage(String, Object[])} method.
	* This test case tests the functionality of the method when the locale key is not found.
	*/
	@Test
	void testCreateWarningMessage_3() {
		Message msg = MessageFactory.createWarningMessage("test");
		assertEquals("WARNING", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("Reading string from locale failed: key=test\nThis probably means that you have an old or otherwise\ninaccurate locale file (maybe it's missing altogether)\nor that the classpath does not contain the directory.", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createWarningMessage(String, Object[])} method.
	* This test case tests the functionality of the method when the locale key is found.
	*/
	@Test
	void testCreateWarningMessage_4() {
		Message msg = MessageFactory.createWarningMessage("gangup.test");
		assertEquals("WARNING", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("This is a test message.", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createWarningMessage(String, Object[])} method.
	* This test case tests the functionality of the method when the locale key is found and the arguments are not null.
	*/
	@Test
	void testCreateWarningMessage_5() {
		Message msg = MessageFactory.createWarningMessage("gangup.test", "test");
		assertEquals("WARNING", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("This is a test message. test", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createWarningMessage(String, Object[])} method.
	* This test case tests the functionality of the method when the locale key is found and the arguments are null.
	*/
	@Test
	void testCreateWarningMessage_6() {
		Message msg = MessageFactory.createWarningMessage("gangup.test", (Object[]) null);
		assertEquals("WARNING", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("This is a test message.", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createWarningMessage(String, Object[])} method.
	* This test case tests the functionality of the method when the locale key is found and the arguments are empty.
	*/
	@Test
	void testCreateWarningMessage_7() {
		Message msg = MessageFactory.createWarningMessage("gangup.test", new Object[0]);
		assertEquals("WARNING", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("This is a test message.", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createWarningMessage(String, Object[])} method.
	* This test case tests the functionality of the method when the locale key is found and the arguments are not empty.
	*/
	@Test
	void testCreateWarningMessage_8() {
		Message msg = MessageFactory.createWarningMessage("gangup.test", "test", "test");
		assertEquals("WARNING", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("This is a test message. test test", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createWarningMessage(String, Object[])} method.
	* This test case tests the functionality of the method when the locale key is found and the arguments are not empty.
	*/
	@Test
	void testCreateWarningMessage_9() {
		Message msg = MessageFactory.createWarningMessage("gangup.test", "test", "test", "test");
		assertEquals("WARNING", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("This is a test message. test test test", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createWarningMessage(String, Object[])} method.
	* This test case tests the functionality of the method when the locale key is found and the arguments are not empty.
	*/
	@Test
	void testCreateWarningMessage_10() {
		Message msg = MessageFactory.createWarningMessage("gangup.test", "test", "test", "test", "test");
		assertEquals("WARNING", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("This is a test message. test test test test", msg.getData());
	}
}

// MessageFactory_6Test.java
package module;

import util.AbstractFactory;
import module.Message;
import java.util.ResourceBundle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFactory}.
* It contains ten unit test cases for the {@link MessageFactory#createErrorMessage(String, Object[])} method.
*/
class MessageFactory_6Test {
		
	/**
	* Test case for {@link MessageFactory#createErrorMessage(String, Object[])} method.
	* This test case tests the functionality of the method when the locale key is null.
	*/
	@Test
	void testCreateErrorMessage_1() {
		Message msg = MessageFactory.createErrorMessage(null);
		assertEquals("ERROR", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("Reading string from locale failed: key=null\nThis probably means that you have an old or otherwise\ninaccurate locale file (maybe it's missing altogether)\nor that the classpath does not contain the directory.", msg.getData());
	}
	
	/**
	* Test case for {@link MessageFactory#createErrorMessage(String, Object[])} method.
	* This test case tests the functionality of the method when the locale key is empty.
	*/
	@Test
	void testCreateErrorMessage_2() {
		Message msg = MessageFactory.createErrorMessage("");
		assertEquals("ERROR", msg.getHeader());
		assertEquals("*", msg.getRecipient());
		assertEquals("Reading string from locale failed: key=\nThis probably means that you have an old or otherwise\ninaccurate locale file (maybe it's missing altogether)\nor that the classpath does not contain the directory.", msg.getData());
	}
	
