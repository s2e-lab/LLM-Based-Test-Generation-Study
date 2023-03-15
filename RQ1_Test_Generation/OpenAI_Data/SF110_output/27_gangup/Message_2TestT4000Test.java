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
	* Test case 10 for {@link Message#delivered()}.
	* This test case tests the method with a message that has been received and has an undefined state.
	*/
	@Test
	void testDelivered_10() {
		Message message = new Message();
		message.state = Message.RECEIVED | Message.UNDEFINED;
		assertFalse(message.delivered());
	}
}

// Message_4Test.java
package module;

import util.ManagedObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Message}.
* It contains ten unit test cases for the {@link Message#setDelivered(boolean)} method.
*/
class Message_4Test {
		
	/**
	* Test case 1 for {@link Message#setDelivered(boolean)}.
	* This test case tests the method with a message that has been delivered.
	*/
	@Test
	void testSetDelivered_1() {
		Message message = new Message();
		message.state = Message.DELIVERED;
		message.setDelivered(true);
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 2 for {@link Message#setDelivered(boolean)}.
	* This test case tests the method with a message that has not been delivered.
	*/
	@Test
	void testSetDelivered_2() {
		Message message = new Message();
		message.state = Message.CREATED;
		message.setDelivered(false);
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 3 for {@link Message#setDelivered(boolean)}.
	* This test case tests the method with a message that has been delivered and received.
	*/
	@Test
	void testSetDelivered_3() {
		Message message = new Message();
		message.state = Message.DELIVERED | Message.RECEIVED;
		message.setDelivered(true);
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 4 for {@link Message#setDelivered(boolean)}.
	* This test case tests the method with a message that has been received.
	*/
	@Test
	void testSetDelivered_4() {
		Message message = new Message();
		message.state = Message.RECEIVED;
		message.setDelivered(false);
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 5 for {@link Message#setDelivered(boolean)}.
	* This test case tests the method with a message that has been delivered and received and has an undefined state.
	*/
	@Test
	void testSetDelivered_5() {
		Message message = new Message();
		message.state = Message.DELIVERED | Message.RECEIVED | Message.UNDEFINED;
		message.setDelivered(true);
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 6 for {@link Message#setDelivered(boolean)}.
	* This test case tests the method with a message that has been received and has an undefined state.
	*/
	@Test
	void testSetDelivered_6() {
		Message message = new Message();
		message.state = Message.RECEIVED | Message.UNDEFINED;
		message.setDelivered(false);
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 7 for {@link Message#setDelivered(boolean)}.
	* This test case tests the method with a message that has been delivered and has an undefined state.
	*/
	@Test
	void testSetDelivered_7() {
		Message message = new Message();
		message.state = Message.DELIVERED | Message.UNDEFINED;
		message.setDelivered(true);
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 8 for {@link Message#setDelivered(boolean)}.
	* This test case tests the method with a message that has an undefined state.
	*/
	@Test
	void testSetDelivered_8() {
		Message message = new Message();
		message.state = Message.UNDEFINED;
		message.setDelivered(false);
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 9 for {@link Message#setDelivered(boolean)}.
	* This test case tests the method with a message that has been delivered and received and has an undefined state.
	*/
	@Test
	void testSetDelivered_9() {
		Message message = new Message();
		message.state = Message.DELIVERED | Message.RECEIVED | Message.UNDEFINED;
		message.setDelivered(true);
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 10 for {@link Message#setDelivered(boolean)}.
	* This test case tests the method with a message that has been received and has an undefined state.
	*/
	@Test
	void testSetDelivered_10() {
		Message message = new Message();
		message.state = Message.RECEIVED | Message.UNDEFINED;
		message.setDelivered(false);
		assertFalse(message.delivered());
	}
}

// Message_5Test.java
package module;

import util.ManagedObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Message}.
* It contains ten unit test cases for the {@link Message#reply(Object)} method.
*/
class Message_5Test {
		
	/**
	* Test case 1 for {@link Message#reply(Object)}.
	* This test case tests the method with a message that has been delivered.
	*/
	@Test
	void testReply_1() {
		Message message = new Message();
		message.state = Message.DELIVERED;
		message.reply(null);
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 2 for {@link Message#reply(Object)}.
	* This test case tests the method with a message that has not been delivered.
	*/
	@Test
	void testReply_2() {
		Message message = new Message();
		message.state = Message.CREATED;
		message.reply(null);
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 3 for {@link Message#reply(Object)}.
	* This test case tests the method with a message that has been delivered and received.
	*/
	@Test
	void testReply_3() {
		Message message = new Message();
		message.state = Message.DELIVERED | Message.RECEIVED;
		message.reply(null);
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 4 for {@link Message#reply(Object)}.
	* This test case tests the method with a message that has been received.
	*/
	@Test
	void testReply_4() {
		Message message = new Message();
		message.state = Message.RECEIVED;
		message.reply(null);
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 5 for {@link Message#reply(Object)}.
	* This test case tests the method with a message that has been delivered and received and has an undefined state.
	*/
	@Test
	void testReply_5() {
		Message message = new Message();
		message.state = Message.DELIVERED | Message.RECEIVED | Message.UNDEFINED;
		message.reply(null);
		assertTrue(message.delivered());
	}
	
	