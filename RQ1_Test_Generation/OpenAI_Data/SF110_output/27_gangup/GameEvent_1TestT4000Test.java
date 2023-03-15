// GameEvent_1Test.java
package state;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameEvent}.
* It contains ten unit test cases for the {@link GameEvent#pack()} method.
*/
class GameEvent_1Test {

	/**
	* Test case 1.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase1() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent(0, 0, 0);
		byte[] data = gameEvent.pack();
		assertEquals(3, data.length);
		assertEquals(0, data[0]);
		assertEquals(0, data[1]);
		assertEquals(0, data[2]);
	}
	
	/**
	* Test case 2.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase2() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent(1, 1, 1);
		byte[] data = gameEvent.pack();
		assertEquals(3, data.length);
		assertEquals(1, data[0]);
		assertEquals(1, data[1]);
		assertEquals(1, data[2]);
	}
	
	/**
	* Test case 3.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase3() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent(2, 2, 2);
		byte[] data = gameEvent.pack();
		assertEquals(3, data.length);
		assertEquals(2, data[0]);
		assertEquals(2, data[1]);
		assertEquals(2, data[2]);
	}
	
	/**
	* Test case 4.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase4() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent(3, 3, 3);
		byte[] data = gameEvent.pack();
		assertEquals(3, data.length);
		assertEquals(3, data[0]);
		assertEquals(3, data[1]);
		assertEquals(3, data[2]);
	}
	
	/**
	* Test case 5.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase5() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent(4, 4, 4);
		byte[] data = gameEvent.pack();
		assertEquals(3, data.length);
		assertEquals(4, data[0]);
		assertEquals(4, data[1]);
		assertEquals(4, data[2]);
	}
	
	/**
	* Test case 6.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase6() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent(5, 5, 5);
		byte[] data = gameEvent.pack();
		assertEquals(3, data.length);
		assertEquals(5, data[0]);
		assertEquals(5, data[1]);
		assertEquals(5, data[2]);
	}
	
	/**
	* Test case 7.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase7() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent(6, 6, 6);
		byte[] data = gameEvent.pack();
		assertEquals(3, data.length);
		assertEquals(6, data[0]);
		assertEquals(6, data[1]);
		assertEquals(6, data[2]);
	}
	
	/**
	* Test case 8.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase8() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent(7, 7, 7);
		byte[] data = gameEvent.pack();
		assertEquals(3, data.length);
		assertEquals(7, data[0]);
		assertEquals(7, data[1]);
		assertEquals(7, data[2]);
	}
	
	/**
	* Test case 9.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase9() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent(8, 8, 8);
		byte[] data = gameEvent.pack();
		assertEquals(3, data.length);
		assertEquals(8, data[0]);
		assertEquals(8, data[1]);
		assertEquals(8, data[2]);
	}
	
	/**
	* Test case 10.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase10() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent(9, 9, 9);
		byte[] data = gameEvent.pack();
		assertEquals(3, data.length);
		assertEquals(9, data[0]);
		assertEquals(9, data[1]);
		assertEquals(9, data[2]);
	}
}

// GameEvent_2Test.java
package state;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameEvent}.
* It contains ten unit test cases for the {@link GameEvent#unpack(byte[])} method.
*/
class GameEvent_2Test {
		
	/**
	* Test case 1.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase1() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		byte[] data = new byte[3];
		data[0] = 0;
		data[1] = 0;
		data[2] = 0;
		gameEvent.unpack(data);
		assertEquals(0, gameEvent.getActor());
		assertEquals(0, gameEvent.getTarget());
		assertEquals(0, gameEvent.getEventType());
	}
	
	/**
	* Test case 2.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase2() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		byte[] data = new byte[3];
		data[0] = 1;
		data[1] = 1;
		data[2] = 1;
		gameEvent.unpack(data);
		assertEquals(1, gameEvent.getActor());
		assertEquals(1, gameEvent.getTarget());
		assertEquals(1, gameEvent.getEventType());
	}
	
	/**
	* Test case 3.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase3() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		byte[] data = new byte[3];
		data[0] = 2;
		data[1] = 2;
		data[2] = 2;
		gameEvent.unpack(data);
		assertEquals(2, gameEvent.getActor());
		assertEquals(2, gameEvent.getTarget());
		assertEquals(2, gameEvent.getEventType());
	}
	
	/**
	* Test case 4.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase4() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		byte[] data = new byte[3];
		data[0] = 3;
		data[1] = 3;
		data[2] = 3;
		gameEvent.unpack(data);
		assertEquals(3, gameEvent.getActor());
		assertEquals(3, gameEvent.getTarget());
		assertEquals(3, gameEvent.getEventType());
	}
	
	/**
	* Test case 5.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase5() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		byte[] data = new byte[3];
		data[0] = 4;
		data[1] = 4;
		data[2] = 4;
		gameEvent.unpack(data);
		assertEquals(4, gameEvent.getActor());
		assertEquals(4, gameEvent.getTarget());
		assertEquals(4, gameEvent.getEventType());
	}
	
	/**
	* Test case 6.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase6() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		byte[] data = new byte[3];
		data[0] = 5;
		data[1] = 5;
		data[2] = 5;
		gameEvent.unpack(data);
		assertEquals(5, gameEvent.getActor());
		assertEquals(5, gameEvent.getTarget());
		assertEquals(5, gameEvent.getEventType());
	}
	
	/**
	* Test case 7.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase7() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		byte[] data = new byte[3];
		data[0] = 6;
		data[1] = 6;
		data[2] = 6;
		gameEvent.unpack(data);
		assertEquals(6, gameEvent.getActor());
		assertEquals(6, gameEvent.getTarget());
		assertEquals(6, gameEvent.getEventType());
	}
	
	/**
	* Test case 8.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase8() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		byte[] data = new byte[3];
		data[0] = 7;
		data[1] = 7;
		data[2] = 7;
		gameEvent.unpack(data);
		assertEquals(7, gameEvent.getActor());
		assertEquals(7, gameEvent.getTarget());
		assertEquals(7, gameEvent.getEventType());
	}
	
	/**
	* Test case 9.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase9() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		byte[] data = new byte[3];
		data[0] = 8;
		data[1] = 8;
		data[2] = 8;
		gameEvent.unpack(data);
		assertEquals(8, gameEvent.getActor());
		assertEquals(8, gameEvent.getTarget());
		assertEquals(8, gameEvent.getEventType());
	}
	
	/**
	* Test case 10.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase10() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		byte[] data = new byte[3];
		data[0] = 9;
		data[1] = 9;
		data[2] = 9;
		gameEvent.unpack(data);
		assertEquals(9, gameEvent.getActor());
		assertEquals(9, gameEvent.getTarget());
		assertEquals(9, gameEvent.getEventType());
	}
}

// GameEvent_3Test.java
package state;

import java.io.UnsupportedEncodingException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GameEvent}.
* It contains ten unit test cases for the {@link GameEvent#setAction(int, int, int)} method.
*/
class GameEvent_3Test {
		
	/**
	* Test case 1.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase1() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		gameEvent.setAction(0, 0, 0);
		assertEquals(0, gameEvent.getActor());
		assertEquals(0, gameEvent.getTarget());
		assertEquals(0, gameEvent.getEventType());
	}
	
	/**
	* Test case 2.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase2() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		gameEvent.setAction(1, 1, 1);
		assertEquals(1, gameEvent.getActor());
		assertEquals(1, gameEvent.getTarget());
		assertEquals(1, gameEvent.getEventType());
	}
	
	/**
	* Test case 3.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase3() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		gameEvent.setAction(2, 2, 2);
		assertEquals(2, gameEvent.getActor());
		assertEquals(2, gameEvent.getTarget());
		assertEquals(2, gameEvent.getEventType());
	}
	
	/**
	* Test case 4.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase4() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		gameEvent.setAction(3, 3, 3);
		assertEquals(3, gameEvent.getActor());
		assertEquals(3, gameEvent.getTarget());
		assertEquals(3, gameEvent.getEventType());
	}
	
	/**
	* Test case 5.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase5() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		gameEvent.setAction(4, 4, 4);
		assertEquals(4, gameEvent.getActor());
		assertEquals(4, gameEvent.getTarget());
		assertEquals(4, gameEvent.getEventType());
	}
	
	/**
	* Test case 6.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase6() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		gameEvent.setAction(5, 5, 5);
		assertEquals(5, gameEvent.getActor());
		assertEquals(5, gameEvent.getTarget());
		assertEquals(5, gameEvent.getEventType());
	}
	
	/**
	* Test case 7.
	*
	* @throws UnsupportedEncodingException
	*/
	@Test
	void testCase7() throws UnsupportedEncodingException {
		GameEvent gameEvent = new GameEvent();
		gameEvent.setAction(6, 6, 6);
		assertEquals(6, gameEvent.getActor());
		assertEquals(6, gameEvent.getTarget());
		assertEquals