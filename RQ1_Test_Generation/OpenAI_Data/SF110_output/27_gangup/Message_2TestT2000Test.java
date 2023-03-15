// Message_2Test.java
package module;

import util.ManagedObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Message}.
* It contains ten unit test cases for the {@link Message#received()} method.
*/
class Message_2Test {

	/**
	* Test case 1 for {@link Message#received()}.
	* This test case tests the method with a message that has been received.
	*/
	@Test
	void testReceived_1() {
		Message message = new Message();
		message.state = Message.RECEIVED;
		assertTrue(message.received());
	}
	
	/**
	* Test case 2 for {@link Message#received()}.
	* This test case tests the method with a message that has not been received.
	*/
	@Test
	void testReceived_2() {
		Message message = new Message();
		message.state = Message.CREATED;
		assertFalse(message.received());
	}
	
	/**
	* Test case 3 for {@link Message#received()}.
	* This test case tests the method with a message that has been received and delivered.
	*/
	@Test
	void testReceived_3() {
		Message message = new Message();
		message.state = Message.RECEIVED | Message.DELIVERED;
		assertTrue(message.received());
	}
	
	/**
	* Test case 4 for {@link Message#received()}.
	* This test case tests the method with a message that has been delivered.
	*/
	@Test
	void testReceived_4() {
		Message message = new Message();
		message.state = Message.DELIVERED;
		assertFalse(message.received());
	}
	
	/**
	* Test case 5 for {@link Message#received()}.
	* This test case tests the method with a message that has been received and delivered and has an undefined state.
	*/
	@Test
	void testReceived_5() {
		Message message = new Message();
		message.state = Message.RECEIVED | Message.DELIVERED | Message.UNDEFINED;
		assertTrue(message.received());
	}
	
	/**
	* Test case 6 for {@link Message#received()}.
	* This test case tests the method with a message that has been delivered and has an undefined state.
	*/
	@Test
	void testReceived_6() {
		Message message = new Message();
		message.state = Message.DELIVERED | Message.UNDEFINED;
		assertFalse(message.received());
	}
	
	/**
	* Test case 7 for {@link Message#received()}.
	* This test case tests the method with a message that has been received and has an undefined state.
	*/
	@Test
	void testReceived_7() {
		Message message = new Message();
		message.state = Message.RECEIVED | Message.UNDEFINED;
		assertTrue(message.received());
	}
	
	/**
	* Test case 8 for {@link Message#received()}.
	* This test case tests the method with a message that has an undefined state.
	*/
	@Test
	void testReceived_8() {
		Message message = new Message();
		message.state = Message.UNDEFINED;
		assertFalse(message.received());
	}
	
	/**
	* Test case 9 for {@link Message#received()}.
	* This test case tests the method with a message that has been received and delivered and has an undefined state.
	*/
	@Test
	void testReceived_9() {
		Message message = new Message();
		message.state = Message.RECEIVED | Message.DELIVERED | Message.UNDEFINED;
		assertTrue(message.received());
	}
	
	/**
	* Test case 10 for {@link Message#received()}.
	* This test case tests the method with a message that has been delivered and has an undefined state.
	*/
	@Test
	void testReceived_10() {
		Message message = new Message();
		message.state = Message.DELIVERED | Message.UNDEFINED;
		assertFalse(message.received());
	}
}

// Message_3Test.java
package module;

import util.ManagedObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Message}.
* It contains ten unit test cases for the {@link Message#delivered()} method.
*/
class Message_3Test {
		
	/**
	* Test case 1 for {@link Message#delivered()}.
	* This test case tests the method with a message that has been delivered.
	*/
	@Test
	void testDelivered_1() {
		Message message = new Message();
		message.state = Message.DELIVERED;
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 2 for {@link Message#delivered()}.
	* This test case tests the method with a message that has not been delivered.
	*/
	@Test
	void testDelivered_2() {
		Message message = new Message();
		message.state = Message.CREATED;
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 3 for {@link Message#delivered()}.
	* This test case tests the method with a message that has been delivered and received.
	*/
	@Test
	void testDelivered_3() {
		Message message = new Message();
		message.state = Message.DELIVERED | Message.RECEIVED;
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 4 for {@link Message#delivered()}.
	* This test case tests the method with a message that has been received.
	*/
	@Test
	void testDelivered_4() {
		Message message = new Message();
		message.state = Message.RECEIVED;
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 5 for {@link Message#delivered()}.
	* This test case tests the method with a message that has been delivered and received and has an undefined state.
	*/
	@Test
	void testDelivered_5() {
		Message message = new Message();
		message.state = Message.DELIVERED | Message.RECEIVED | Message.UNDEFINED;
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 6 for {@link Message#delivered()}.
	* This test case tests the method with a message that has been received and has an undefined state.
	*/
	@Test
	void testDelivered_6() {
		Message message = new Message();
		message.state = Message.RECEIVED | Message.UNDEFINED;
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 7 for {@link Message#delivered()}.
	* This test case tests the method with a message that has been delivered and has an undefined state.
	*/
	@Test
	void testDelivered_7() {
		Message message = new Message();
		message.state = Message.DELIVERED | Message.UNDEFINED;
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 8 for {@link Message#delivered()}.
	* This test case tests the method with a message that has an undefined state.
	*/
	@Test
	void testDelivered_8() {
		Message message = new Message();
		message.state = Message.UNDEFINED;
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 9 for {@link Message#delivered()}.
	* This test case tests the method with a message that has been delivered and received and has an undefined state.
	*/
	@Test
	void testDelivered_9() {
		Message message = new Message();
		message.state = Message.DELIVERED | Message.RECEIVED | Message.UNDEFINED;
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 10 for