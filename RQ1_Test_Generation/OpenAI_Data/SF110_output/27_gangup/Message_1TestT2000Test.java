// Message_1Test.java
package module;

import util.ManagedObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Message}.
* It contains ten unit test cases for the {@link Message#delivered()} method.
*/
class Message_1Test {

	/**
	* Test case 1 for {@link Message#delivered()}.
	* This test case tests the delivered method with the state set to 0.
	* The expected result is false.
	*/
	@Test
	void testDelivered_1() {
		Message message = new Message();
		message.state = 0;
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 2 for {@link Message#delivered()}.
	* This test case tests the delivered method with the state set to 1.
	* The expected result is false.
	*/
	@Test
	void testDelivered_2() {
		Message message = new Message();
		message.state = 1;
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 3 for {@link Message#delivered()}.
	* This test case tests the delivered method with the state set to 2.
	* The expected result is false.
	*/
	@Test
	void testDelivered_3() {
		Message message = new Message();
		message.state = 2;
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 4 for {@link Message#delivered()}.
	* This test case tests the delivered method with the state set to 3.
	* The expected result is false.
	*/
	@Test
	void testDelivered_4() {
		Message message = new Message();
		message.state = 3;
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 5 for {@link Message#delivered()}.
	* This test case tests the delivered method with the state set to 4.
	* The expected result is true.
	*/
	@Test
	void testDelivered_5() {
		Message message = new Message();
		message.state = 4;
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 6 for {@link Message#delivered()}.
	* This test case tests the delivered method with the state set to 5.
	* The expected result is true.
	*/
	@Test
	void testDelivered_6() {
		Message message = new Message();
		message.state = 5;
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 7 for {@link Message#delivered()}.
	* This test case tests the delivered method with the state set to 6.
	* The expected result is true.
	*/
	@Test
	void testDelivered_7() {
		Message message = new Message();
		message.state = 6;
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 8 for {@link Message#delivered()}.
	* This test case tests the delivered method with the state set to 7.
	* The expected result is true.
	*/
	@Test
	void testDelivered_8() {
		Message message = new Message();
		message.state = 7;
		assertTrue(message.delivered());
	}
	
	/**
	* Test case 9 for {@link Message#delivered()}.
	* This test case tests the delivered method with the state set to 8.
	* The expected result is false.
	*/
	@Test
	void testDelivered_9() {
		Message message = new Message();
		message.state = 8;
		assertFalse(message.delivered());
	}
	
	/**
	* Test case 10 for {@link Message#delivered()}.
	* This test case tests the delivered method with the state set to 9.
	* The expected result is false.
	*/
	@Test
	void testDelivered_10() {
		Message message = new Message();
		message.state = 9;
		assertFalse(message.delivered());
	}
}

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
	* This test case tests the received method with the state set to 0.
	* The expected result is false.
	*/
	@Test
	void testReceived_1() {
		Message message = new Message();
		message.state = 0;
		assertFalse(message.received());
	}
	
	/**
	* Test case 2 for {@link Message#received()}.
	* This test case tests the received method with the state set to 1.
	* The expected result is false.
	*/
	@Test
	void testReceived_2() {
		Message message = new Message();
		message.state = 1;
		assertFalse(message.received());
	}
	
	/**
	* Test case 3 for {@link Message#received()}.
	* This test case tests the received method with the state set to 2.
	* The expected result is true.
	*/
	@Test
	void testReceived_3() {
		Message message = new Message();
		message.state = 2;
		assertTrue(message.received());
	}
	
	/**
	* Test case 4 for {@link Message#received()}.
	* This test case tests the received method with the state set to 3.
	* The expected result is true.
	*/
	@Test
	void testReceived_4() {
		Message message = new Message();
		message.state = 3;
		assertTrue(message.received());
	}
	
	/**
	* Test case 5 for {@link Message#received()}.
	* This test case tests the received method with the state set to 4.
	* The expected result is true.
	*/
	@Test
	void testReceived_5() {
		Message message = new Message();
		message.state = 4;
		assertTrue(message.received());
	}
	
	/**
	* Test case 6 for {@link Message#received()}.
	* This test case tests the received method with the state set to 5.
	* The expected result is true.
	*/
	@Test
	void testReceived_6() {
		Message message = new Message();
		message.state = 5;
		assertTrue(message.received());
	}
	
	/**
	* Test case 7 for {@link Message#received()}.
	* This test case tests the received method with the state set to 6.
	* The expected result is true.
	*/
	@Test
	void testReceived_7() {
		Message message = new Message();
		message.state = 6;
		assertTrue(message.received());
	}
	
	/**
	* Test case 8 for {@link Message#received()}.
	* This test case tests the received method with the state set to 7.
	* The expected result is true.
	*/
	@Test
	void testReceived_8() {
		Message message = new Message();
		message.state = 7;
		assertTrue(message.received());
	}
	
	/**
	* Test case 9 for {@link Message#received()}.
	* This test case tests the received method with the state set to 8.
	* The expected result is false.
	*/
	@Test
	void testReceived_9() {
		Message message = new Message();
		message.state = 8;
		assertFalse(message.received());
	}
	
	/**
	* Test case 10 for {@link Message#received()}.
	* This test case tests the received method with the state set to 9.
	* The expected result is false.
	*/
	@Test
	void testReceived_10() {
		Message message = new Message();
		message.state = 9;
		assertFalse(message.received());
	}
}
