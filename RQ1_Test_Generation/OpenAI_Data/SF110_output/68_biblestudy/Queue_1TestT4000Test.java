// Queue_1Test.java
package bible.util;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Queue}.
* It contains ten unit test cases for the {@link Queue#remove(Object)} method.
*/
class Queue_1Test {

	/**
	* Test case for {@link Queue#remove(Object)} method.
	* It tests the case when the queue is empty.
	*/
	@Test
	void testRemove_1() {
		Queue queue = new Queue();
		int result = queue.remove(new Object());
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link Queue#remove(Object)} method.
	* It tests the case when the queue has one element.
	*/
	@Test
	void testRemove_2() {
		Queue queue = new Queue();
		Object object = new Object();
		queue.enqueue(object);
		int result = queue.remove(object);
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link Queue#remove(Object)} method.
	* It tests the case when the queue has two elements.
	*/
	@Test
	void testRemove_3() {
		Queue queue = new Queue();
		Object object = new Object();
		queue.enqueue(object);
		queue.enqueue(object);
		int result = queue.remove(object);
		assertEquals(2, result);
	}
	
	/**
	* Test case for {@link Queue#remove(Object)} method.
	* It tests the case when the queue has three elements.
	*/
	@Test
	void testRemove_4() {
		Queue queue = new Queue();
		Object object = new Object();
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		int result = queue.remove(object);
		assertEquals(3, result);
	}
	
	/**
	* Test case for {@link Queue#remove(Object)} method.
	* It tests the case when the queue has four elements.
	*/
	@Test
	void testRemove_5() {
		Queue queue = new Queue();
		Object object = new Object();
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		int result = queue.remove(object);
		assertEquals(4, result);
	}
	
	/**
	* Test case for {@link Queue#remove(Object)} method.
	* It tests the case when the queue has five elements.
	*/
	@Test
	void testRemove_6() {
		Queue queue = new Queue();
		Object object = new Object();
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		int result = queue.remove(object);
		assertEquals(5, result);
	}
	
	/**
	* Test case for {@link Queue#remove(Object)} method.
	* It tests the case when the queue has six elements.
	*/
	@Test
	void testRemove_7() {
		Queue queue = new Queue();
		Object object = new Object();
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		int result = queue.remove(object);
		assertEquals(6, result);
	}
	
	/**
	* Test case for {@link Queue#remove(Object)} method.
	* It tests the case when the queue has seven elements.
	*/
	@Test
	void testRemove_8() {
		Queue queue = new Queue();
		Object object = new Object();
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		int result = queue.remove(object);
		assertEquals(7, result);
	}
	
	/**
	* Test case for {@link Queue#remove(Object)} method.
	* It tests the case when the queue has eight elements.
	*/
	@Test
	void testRemove_9() {
		Queue queue = new Queue();
		Object object = new Object();
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		int result = queue.remove(object);
		assertEquals(8, result);
	}
	
	/**
	* Test case for {@link Queue#remove(Object)} method.
	* It tests the case when the queue has nine elements.
	*/
	@Test
	void testRemove_10() {
		Queue queue = new Queue();
		Object object = new Object();
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		queue.enqueue(object);
		int result = queue.remove(object);
		assertEquals(9, result);
	}
}