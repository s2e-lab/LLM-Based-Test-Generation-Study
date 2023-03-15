// Message_0Test.java
package module;

import util.ManagedObject;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Message}.
* It contains ten unit test cases for the {@link Message#reply(Object)} method.
*/
class Message_0Test {

	/**
	* Test case 1 for method {@link Message#reply(Object)}.
	*
	* @throws MessageDeliveryException
	*/
	@Test
	void testReply_1() throws MessageDeliveryException {
		Message m = new Message();
		m.setHeader("header");
		m.setRecipient("recipient");
		m.setSender("sender");
		m.setBody(new ManagedObject());
		Message reply = m.reply(new ManagedObject());
		assertEquals(m.getHeader(), reply.getHeader());
		assertEquals(m.getSender(), reply.getRecipient());
		assertEquals(m.getRecipient(), reply.getSender());
		assertEquals(m.getSID(), reply.getSID());
	}
	
	/**
	* Test case 2 for method {@link Message#reply(Object)}.
	*
	* @throws MessageDeliveryException
	*/
	@Test
	void testReply_2() throws MessageDeliveryException {
		Message m = new Message();
		m.setHeader("header");
		m.setRecipient("recipient");
		m.setSender("sender");
		m.setBody(new ManagedObject());
		Message reply = m.reply(new ManagedObject());
		assertEquals(m.getHeader(), reply.getHeader());
		assertEquals(m.getSender(), reply.getRecipient());
		assertEquals(m.getRecipient(), reply.getSender());
		assertEquals(m.getSID(), reply.getSID());
	}
	
	/**
	* Test case 3 for method {@link Message#reply(Object)}.
	*
	* @throws MessageDeliveryException
	*/
	@Test
	void testReply_3() throws MessageDeliveryException {
		Message m = new Message();
		m.setHeader("header");
		m.setRecipient("recipient");
		m.setSender("sender");
		m.setBody(new ManagedObject());
		Message reply = m.reply(new ManagedObject());
		assertEquals(m.getHeader(), reply.getHeader());
		assertEquals(m.getSender(), reply.getRecipient());
		assertEquals(m.getRecipient(), reply.getSender());
		assertEquals(m.getSID(), reply.getSID());
	}
	
	/**
	* Test case 4 for method {@link Message#reply(Object)}.
	*
	* @throws MessageDeliveryException
	*/
	@Test
	void testReply_4() throws MessageDeliveryException {
		Message m = new Message();
		m.setHeader("header");
		m.setRecipient("recipient");
		m.setSender("sender");
		m.setBody(new ManagedObject());
		Message reply = m.reply(new ManagedObject());
		assertEquals(m.getHeader(), reply.getHeader());
		assertEquals(m.getSender(), reply.getRecipient());
		assertEquals(m.getRecipient(), reply.getSender());
		assertEquals(m.getSID(), reply.getSID());
	}
	
	/**
	* Test case 5 for method {@link Message#reply(Object)}.
	*
	* @throws MessageDeliveryException
	*/
	@Test
	void testReply_5() throws MessageDeliveryException {
		Message m = new Message();
		m.setHeader("header");
		m.setRecipient("recipient");
		m.setSender("sender");
		m.setBody(new ManagedObject());
		Message reply = m.reply(new ManagedObject());
		assertEquals(m.getHeader(), reply.getHeader());
		assertEquals(m.getSender(), reply.getRecipient());
		assertEquals(m.getRecipient(), reply.getSender());
		assertEquals(m.getSID(), reply.getSID());
	}
	
	/**
	* Test case 6 for method {@link Message#reply(Object)}.
	*
	* @throws MessageDeliveryException
	*/
	@Test
	void testReply_6() throws MessageDeliveryException {
		Message m = new Message();
		m.setHeader("header");
		m.setRecipient("recipient");
		m.setSender("sender");
		m.setBody(new ManagedObject());
		Message reply = m.reply(new ManagedObject());
		assertEquals(m.getHeader(), reply.getHeader());
		assertEquals(m.getSender(), reply.getRecipient());
		assertEquals(m.getRecipient(), reply.getSender());
		assertEquals(m.getSID(), reply.getSID());
	}
	
	/**
	* Test case 7 for method {@link Message#reply(Object)}.
	*
	* @throws MessageDeliveryException
	*/
	@Test
	void testReply_7() throws MessageDeliveryException {
		Message m = new Message();
		m.setHeader("header");
		m.setRecipient("recipient");
		m.setSender("sender");
		m.setBody(new ManagedObject());
		Message reply = m.reply(new ManagedObject());
		assertEquals(m.getHeader(), reply.getHeader());
		assertEquals(m.getSender(), reply.getRecipient());
		assertEquals(m.getRecipient(), reply.getSender());
		assertEquals(m.getSID(), reply.getSID());
	}
	
	/**
	* Test case 8 for method {@link Message#reply(Object)}.
	*
	* @throws MessageDeliveryException
	*/
	@Test
	void testReply_8() throws MessageDeliveryException {
		Message m = new Message();
		m.setHeader("header");
		m.setRecipient("recipient");
		m.setSender("sender");
		m.setBody(new ManagedObject());
		Message reply = m.reply(new ManagedObject());
		assertEquals(m.getHeader(), reply.getHeader());
		assertEquals(m.getSender(), reply.getRecipient());
		assertEquals(m.getRecipient(), reply.getSender());
		assertEquals(m.getSID(), reply.getSID());
	}
	
	/**
	* Test case 9 for method {@link Message#reply(Object)}.
	*
	* @throws MessageDeliveryException
	*/
	@Test
	void testReply_9() throws MessageDeliveryException {
		Message m = new Message();
		m.setHeader("header");
		m.setRecipient("recipient");
		m.setSender("sender");
		m.setBody(new ManagedObject());
		Message reply = m.reply(new ManagedObject());
		assertEquals(m.getHeader(), reply.getHeader());
		assertEquals(m.getSender(), reply.getRecipient());
		assertEquals(m.getRecipient(), reply.getSender());
		assertEquals(m.getSID(), reply.getSID());
	}
	
	/**
	* Test case 10 for method {@link Message#reply(Object)}.
	*
	* @throws MessageDeliveryException
	*/
	@Test
	void testReply_10() throws MessageDeliveryException {
		Message m = new Message();
		m.setHeader("header");
		m.setRecipient("recipient");
		m.setSender("sender");
		m.setBody(new ManagedObject());
		Message reply = m.reply(new ManagedObject());
		assertEquals(m.getHeader(), reply.getHeader());
		assertEquals(m.getSender(), reply.getRecipient());
		assertEquals(m.getRecipient(),