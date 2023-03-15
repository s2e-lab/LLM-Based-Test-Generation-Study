// EventTest.java



import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Event}.
* It contains ten unit test cases for the {@link Event#compareTo(Object)} method.
*/
class EventTest {

		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests the case when the two events are equal.
		*/
		@Test
		void testCompareTo_Equal() {
				Event event1 = new Event("a");
				Event event2 = new Event("a");
				assertEquals(0, event1.compareTo(event2));
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests the case when the first event is less than the second event.
		*/
		@Test
		void testCompareTo_LessThan() {
				Event event1 = new Event("a");
				Event event2 = new Event("b");
				assertEquals(-1, event1.compareTo(event2));
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests the case when the first event is greater than the second event.
		*/
		@Test
		void testCompareTo_GreaterThan() {
				Event event1 = new Event("b");
				Event event2 = new Event("a");
				assertEquals(1, event1.compareTo(event2));
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests the case when the first event is less than the second event.
		*/
		@Test
		void testCompareTo_LessThan2() {
				Event event1 = new Event("a");
				Event event2 = new Event("aa");
				assertEquals(-1, event1.compareTo(event2));
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests the case when the first event is greater than the second event.
		*/
		@Test
		void testCompareTo_GreaterThan2() {
				Event event1 = new Event("aa");
				Event event2 = new Event("a");
				assertEquals(1, event1.compareTo(event2));
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests the case when the first event is less than the second event.
		*/
		@Test
		void testCompareTo_LessThan3() {
				Event event1 = new Event("a");
				Event event2 = new Event("ab");
				assertEquals(-1, event1.compareTo(event2));
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests the case when the first event is greater than the second event.
		*/
		@Test
		void testCompareTo_GreaterThan3() {
				Event event1 = new Event("ab");
				Event event2 = new Event("a");
				assertEquals(1, event1.compareTo(event2));
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests the case when the first event is less than the second event.
		*/
		@Test
		void testCompareTo_LessThan4() {
				Event event1 = new Event("a");
				Event event2 = new Event("ba");
				assertEquals(-1, event1.compareTo(event2));
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests the case when the first event is greater than the second event.
		*/
		@Test
		void testCompareTo_GreaterThan4() {
				Event event1 = new Event("ba");
				Event event2 = new Event("a");
				assertEquals(1, event1.compareTo(event2));
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests the case when the first event is less than the second event.
		*/
		@Test
		void testCompareTo_LessThan5() {
				Event event1 = new Event("a");
				Event event2 = new Event("b");
				assertEquals(-1, event1.compareTo(event2));
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests the case when the first event is greater than the second event.
		*/
		@Test
		void testCompareTo_GreaterThan5() {
				Event event1 = new Event("b");
				Event event2 = new Event("a");
				assertEquals(1, event1.compareTo(event2));
		}
}