// Action_1Test.java
package state;

import java.io.UnsupportedEncodingException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import util.TaintedByteArrayOutputStream;
import util.TaintedByteArrayInputStream;
import util.ManagedObject;
import util.ObjectManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Action}.
* It contains ten unit test cases for the {@link Action#pack()} method.
*/
class Action_1Test {

	/**
	* Test case 1 for {@link Action#pack()}.
	* It tests the normal case.
	*/
	@Test
	void testPack_1() {
		Action a = new Action();
		a.set(Action.ACTION_JOIN, 1, 2, (byte)3, (byte)4, (byte)5);
		byte[] b = a.pack();
		assertEquals(b[0], 1);
		assertEquals(b[1], 2);
		assertEquals(b[2], 0);
		assertEquals(b[3], 3);
		assertEquals(b[4], 4);
		assertEquals(b[5], 5);
	}
	
	/**
	* Test case 2 for {@link Action#pack()}.
	* It tests the normal case.
	*/
	@Test
	void testPack_2() {
		Action a = new Action();
		a.set(Action.ACTION_PART, 1, 2, (byte)3, (byte)4, (byte)5);
		byte[] b = a.pack();
		assertEquals(b[0], 1);
		assertEquals(b[1], 2);
		assertEquals(b[2], 1);
		assertEquals(b[3], 3);
		assertEquals(b[4], 4);
		assertEquals(b[5], 5);
	}
	
	/**
	* Test case 3 for {@link Action#pack()}.
	* It tests the normal case.
	*/
	@Test
	void testPack_3() {
		Action a = new Action();
		a.set(Action.ACTION_ATTACK, 1, 2, (byte)3, (byte)4, (byte)5);
		byte[] b = a.pack();
		assertEquals(b[0], 1);
		assertEquals(b[1], 2);
		assertEquals(b[2], 2);
		assertEquals(b[3], 3);
		assertEquals(b[4], 4);
		assertEquals(b[5], 5);
	}
	
	/**
	* Test case 4 for {@link Action#pack()}.
	* It tests the normal case.
	*/
	@Test
	void testPack_4() {
		Action a = new Action();
		a.set(Action.ACTION_JOIN_APPLY, 1, 2, (byte)3, (byte)4, (byte)5);
		byte[] b = a.pack();
		assertEquals(b[0], 1);
		assertEquals(b[1], 2);
		assertEquals(b[2], 3);
		assertEquals(b[3], 3);
		assertEquals(b[4], 4);
		assertEquals(b[5], 5);
	}
	
	/**
	* Test case 5 for {@link Action#pack()}.
	* It tests the normal case.
	*/
	@Test
	void testPack_5() {
		Action a = new Action();
		a.set(Action.ACTION_JOIN_INVITE, 1, 2, (byte)3, (byte)4, (byte)5);
		byte[] b = a.pack();
		assertEquals(b[0], 1);
		assertEquals(b[1], 2);
		assertEquals(b[2], 4);
		assertEquals(b[3], 3);
		assertEquals(b[4], 4);
		assertEquals(b[5], 5);
	}
	
	/**
	* Test case 6 for {@link Action#pack()}.
	* It tests the normal case.
	*/
	@Test
	void testPack_6() {
		Action a = new Action();
		a.set(Action.ACTION_JOIN_ALLOW, 1, 2, (byte)3, (byte)4, (byte)5);
		byte[] b = a.pack();
		assertEquals(b[0], 1);
		assertEquals(b[1], 2);
		assertEquals(b[2], 5);
		assertEquals(b[3], 3);
		assertEquals(b[4], 4);
		assertEquals(b[5], 5);
	}
	
	/**
	* Test case 7 for {@link Action#pack()}.
	* It tests the normal case.
	*/
	@Test
	void testPack_7() {
		Action a = new Action();
		a.set(Action.ACTION_JOIN_AGREE, 1, 2, (byte)3, (byte)4, (byte)5);
		byte[] b = a.pack();
		assertEquals(b[0], 1);
		assertEquals(b[1], 2);
		assertEquals(b[2], 6);
		assertEquals(b[3], 3);
		assertEquals(b[4], 4);
		assertEquals(b[5], 5);
	}
	
	/**
	* Test case 8 for {@link Action#pack()}.
	* It tests the normal case.
	*/
	@Test
	void testPack_8() {
		Action a = new Action();
		a.set(Action.ACTION_MOVE, 1, 2, (byte)3, (byte)4, (byte)5);
		byte[] b = a.pack();
		assertEquals(b[0], 1);
		assertEquals(b[1], 2);
		assertEquals(b[2], 7);
		assertEquals(b[3], 3);
		assertEquals(b[4], 4);
		assertEquals(b[5], 5);
	}
	
	/**
	* Test case 9 for {@link Action#pack()}.
	* It tests the normal case.
	*/
	@Test
	void testPack_9() {
		Action a = new Action();
		a.set(Action.ACTION_KICK, 1, 2, (byte)3, (byte)4, (byte)5);
		byte[] b = a.pack();
		assertEquals(b[0], 1);
		assertEquals(b[1], 2);
		assertEquals(b[2], 8);
		assertEquals(b[3], 3);
		assertEquals(b[4], 4);
		assertEquals(b[5], 5);
	}
	
	/**
	* Test case 10 for {@link Action#pack()}.
	* It tests the normal case.
	*/
	@Test
	void testPack_10() {
		Action a = new Action();
		a.set(Action.ACTION_KICK, 1, 2, (byte)3, (byte)4, (byte)5);
		byte[] b = a.pack();
		assertEquals(b[0], 1);
		assertEquals(b[1], 2);
		assertEquals(b[2], 8);
		assertEquals(b[3], 3);
		assertEquals(b[4], 4);
		assertEquals(b[5], 5);
	}
}

// Action_2Test.java
package state;

import java.io.UnsupportedEncodingException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import util.TaintedByteArrayOutputStream;
import util.TaintedByteArrayInputStream;
import util.ManagedObject;
import util.ObjectManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Action}.
* It contains ten unit test cases for the {@link Action#unpack(byte[])} method.
*/
class Action_2Test {
		
	/**
	* Test case 1 for {@link Action#unpack(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpack_1() {
		Action a = new Action();
		byte[] b = {1, 2, 0, 3, 4, 5};
		a.unpack(b);
		assertEquals(a.getActor(), 1);
		assertEquals(a.getTarget(), 2);
		assertEquals(a.getAction(), 0);
		assertEquals(a.destX, 3);
		assertEquals(a.destY, 4);
		assertEquals(a.destZ, 5);
	}
	
	/**
	* Test case 2 for {@link Action#unpack(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpack_2() {
		Action a = new Action();
		byte[] b = {1, 2, 1, 3, 4, 5};
		a.unpack(b);
		assertEquals(a.getActor(), 1);
		assertEquals(a.getTarget(), 2);
		assertEquals(a.getAction(), 1);
		assertEquals(a.destX, 3);
		assertEquals(a.destY, 4);
		assertEquals(a.destZ, 5);
	}
	
	/**
	* Test case 3 for {@link Action#unpack(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpack_3() {
		Action a = new Action();
		byte[] b = {1, 2, 2, 3, 4, 5};
		a.unpack(b);
		assertEquals(a.getActor(), 1);
		assertEquals(a.getTarget(), 2);
		assertEquals(a.getAction(), 2);
		assertEquals(a.destX, 3);
		assertEquals(a.destY, 4);
		assertEquals(a.destZ, 5);
	}
	
	/**
	* Test case 4 for {@link Action#unpack(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpack_4() {
		Action a = new Action();
		byte[] b = {1, 2, 3, 3, 4, 5};
		a.unpack(b);
		assertEquals(a.getActor(), 1);
		assertEquals(a.getTarget(), 2);
		assertEquals(a.getAction(), 3);
		assertEquals(a.destX, 3);
		assertEquals(a.destY, 4);
		assertEquals(a.destZ, 5);
	}
	
	/**
	* Test case 5 for {@link Action#unpack(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpack_5() {
		Action a = new Action();
		byte[] b = {1, 2, 4, 3, 4, 5};
		a.unpack(b);
		assertEquals(a.getActor(), 1);
		assertEquals(a.getTarget(), 2);
		assertEquals(a.getAction(), 4);
		assertEquals(a.destX, 3);
		assertEquals(a.destY, 4);
		assertEquals(a.destZ, 5);
	}
	
	/**
	* Test case 6 for {@link Action#unpack(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpack_6() {
		Action a = new Action();
		byte[] b = {1, 2, 5, 3, 4, 5};
		a.unpack(b);
		assertEquals(a.getActor(), 1);
		assertEquals(a.getTarget(), 2);
		assertEquals(a.getAction(), 5);
		assertEquals(a.destX, 3);
		assertEquals(a.destY, 4);
		assertEquals(a.destZ, 5);
	}
	
	/**
	* Test case 7 for {@link Action#unpack(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpack_7() {
		Action a = new Action();
		byte[] b = {1, 2, 6, 3, 4, 5};
		a.unpack(b);
		assertEquals(a.getActor(), 1);
		assertEquals(a.getTarget(), 2);
		assertEquals(a.getAction(), 6);
		assertEquals(a.destX, 3);
		assertEquals(a.destY, 4);
		assertEquals(a.destZ, 5);
	}
	
	/**
	* Test case 8 for {@link Action#unpack(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpack_8() {
		Action a = new Action();
		byte[] b = {1, 2, 7, 3, 4, 5};
		a.unpack(b);
		assertEquals(a.getActor(), 1);
		assertEquals(a.getTarget(), 2);
		assertEquals(a.getAction(), 7);
		assertEquals(a.destX, 3);
		assertEquals(a.destY, 4);
		assertEquals(a.destZ, 5);
	}
	
	/**
	* Test case 9 for {@link Action#unpack(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpack_9() {
		Action a = new Action();
		byte[] b = {1, 2, 8, 3, 4, 5};
		a.unpack(b);
		assertEquals(a.getActor(), 1);
		assertEquals(a.getTarget(), 2);
		assertEquals(a.getAction(), 8);
		assertEquals(a.destX, 3);
		assertEquals(a.destY, 4);
		assertEquals(a.destZ, 5);
	}
	
	/**
	* Test case 10 for {@link Action#unpack(byte[])}.
	* It tests the normal case.
	*/
	@Test
	void testUnpack_10() {
		Action a = new Action();
		byte[] b = {1, 2, 8, 3, 4, 5};
		a.unpack(b);
		assertEquals(a.getActor(), 1);
		assertEquals(a.getTarget(), 2);
		assertEquals(a.getAction(), 8);
		assertEquals(a.destX, 3);
		assertEquals(a.destY, 4);
		assertEquals(a.destZ, 5);
	}
}

// Action_3Test.java
package state;

import java.io.UnsupportedEncodingException;
import java.io.DataOutputStream;
import java.io.DataInputStream;
import java.io.ByteArrayInputStream;
import util.TaintedByteArrayOutputStream;
import util.TaintedByteArrayInputStream;
import util.ManagedObject;
import util.ObjectManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Action}.
* It contains ten unit test cases for the {@link Action#unpack(DataInputStream)} method.
*/
class Action_3Test {
		
	/**
	* Test case 1 for {@link Action#unpack(DataInputStream)}.
	* It tests the normal case.
	*/
	@Test
	void testUnpack_1() {
		Action a = new Action();
		byte[] b = {1, 2, 0, 3, 4, 5};
		TaintedByteArrayInputStream