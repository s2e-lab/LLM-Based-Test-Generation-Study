// ObjectUtilityTest3.java
package com.densebrain.rif.util;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import org.apache.axis2.util.Base64;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ObjectUtility}.
* It contains ten unit test cases for the {@link ObjectUtility#deserializeObject(byte[])} method.
*/
class ObjectUtilityTest3 {

	/**
	* Test case for {@link ObjectUtility#deserializeObject(byte[])} method.
	* It tests the method with a null byte array.
	* It expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testDeserializeObject_NullByteArray() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.deserializeObject(null);
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#deserializeObject(byte[])} method.
	* It tests the method with an empty byte array.
	* It expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testDeserializeObject_EmptyByteArray() {
		assertThrows(IllegalArgumentException.class, () -> {
			ObjectUtility.deserializeObject(new byte[0]);
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#deserializeObject(byte[])} method.
	* It tests the method with a byte array containing a non-serialized object.
	* It expects an {@link IOException} to be thrown.
	*/
	@Test
	void testDeserializeObject_NonSerializedObject() {
		assertThrows(IOException.class, () -> {
			ObjectUtility.deserializeObject("Hello World".getBytes());
		});
	}
	
	/**
	* Test case for {@link ObjectUtility#deserializeObject(byte[])} method.
	* It tests the method with a byte array containing a serialized object.
	* It expects the object to be deserialized successfully.
	*/
	@Test
	void testDeserializeObject_SerializedObject() throws IOException {
		String s = "Hello World";
		ByteArrayOutputStream baos = null;
		ObjectOutputStream oos = null;
		try {
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(s);
		} finally {
			try {
				oos.close();
			} catch (Exception e) {
			}
			try {
				baos.close();
			} catch (Exception e) {
			}
		}
		byte[] bytes = baos.toByteArray();
		Object o = ObjectUtility.deserializeObject(bytes);
		assertEquals(s, o);
	}
	
	/**
	* Test case for {@link ObjectUtility#deserializeObject(byte[])} method.
	* It tests the method with a byte array containing a serialized object.
	* It expects the object to be deserialized successfully.
	*/
	@Test
	void testDeserializeObject_SerializedObject2() throws IOException {
		String s = "Hello World";
		ByteArrayOutputStream baos = null;
		ObjectOutputStream oos = null;
		try {
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(s);
		} finally {
			try {
				oos.close();
			} catch (Exception e) {
			}
			try {
				baos.close();
			} catch (Exception e) {
			}
		}
		byte[] bytes = baos.toByteArray();
		Object o = ObjectUtility.deserializeObject(bytes);
		assertEquals(s, o);
	}
	
	/**
	* Test case for {@link ObjectUtility#deserializeObject(byte[])} method.
	* It tests the method with a byte array containing a serialized object.
	* It expects the object to be deserialized successfully.
	*/
	@Test
	void testDeserializeObject_SerializedObject3() throws IOException {
		String s = "Hello World";
		ByteArrayOutputStream baos = null;
		ObjectOutputStream oos = null;
		try {
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(s);
		} finally {
			try {
				oos.close();
			} catch (Exception e) {
			}
			try {
				baos.close();
			} catch (Exception e) {
			}
		}
		byte[] bytes = baos.toByteArray();
		Object o = ObjectUtility.deserializeObject(bytes);
		assertEquals(s, o);
	}
	
	/**
	* Test case for {@link ObjectUtility#deserializeObject(byte[])} method.
	* It tests the method with a byte array containing a serialized object.
	* It expects the object to be deserialized successfully.
	*/
	@Test
	void testDeserializeObject_SerializedObject4() throws IOException {
		String s = "Hello World";
		ByteArrayOutputStream baos = null;
		ObjectOutputStream oos = null;
		try {
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(s);
		} finally {
			try {
				oos.close();
			} catch (Exception e) {
			}
			try {
				baos.close();
			} catch (Exception e) {
			}
		}
		byte[] bytes = baos.toByteArray();
		Object o = ObjectUtility.deserializeObject(bytes);
		assertEquals(s, o);
	}
	
	/**
	* Test case for {@link ObjectUtility#deserializeObject(byte[])} method.
	* It tests the method with a byte array containing a serialized object.
	* It expects the object to be deserialized successfully.
	*/
	@Test
	void testDeserializeObject_SerializedObject5() throws IOException {
		String s = "Hello World";
		ByteArrayOutputStream baos = null;
		ObjectOutputStream oos = null;
		try {
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(s);
		} finally {
			try {
				oos.close();
			} catch (Exception e) {
			}
			try {
				baos.close();
			} catch (Exception e) {
			}
		}
		byte[] bytes = baos.toByteArray();
		Object o = ObjectUtility.deserializeObject(bytes);
		assertEquals(s, o);
	}
	
	/**
	* Test case for {@link ObjectUtility#deserializeObject(byte[])} method.
	* It tests the method with a byte array containing a serialized object.
	* It expects the object to be deserialized successfully.
	*/
	@Test
	void testDeserializeObject_SerializedObject6() throws IOException {
		String s = "Hello World";
		ByteArrayOutputStream baos = null;
		ObjectOutputStream oos = null;
		try {
			baos = new ByteArrayOutputStream();
			oos = new ObjectOutputStream(baos);
			oos.writeObject(s);
		} finally {
			try {
				oos.close();
			} catch (Exception e) {
			}
			try {
				baos.close();
			} catch (Exception e) {
			}
		}
		byte[] bytes = baos.toByteArray();
		Object o = ObjectUtility.deserializeObject(bytes);
		assertEquals(s, o);
	}
	
	/**