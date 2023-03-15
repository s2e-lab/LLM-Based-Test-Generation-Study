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
		* It tests if the method returns a negative integer when the event is less than the other event.
		*/
		@Test
		void testCompareTo_LessThan() {
				Event event1 = new Event("a");
				Event event2 = new Event("b");
				assertTrue(event1.compareTo(event2) < 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns a positive integer when the event is greater than the other event.
		*/
		@Test
		void testCompareTo_GreaterThan() {
				Event event1 = new Event("b");
				Event event2 = new Event("a");
				assertTrue(event1.compareTo(event2) > 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns zero when the event is equal to the other event.
		*/
		@Test
		void testCompareTo_Equal() {
				Event event1 = new Event("a");
				Event event2 = new Event("a");
				assertTrue(event1.compareTo(event2) == 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns a negative integer when the event is less than the other event.
		*/
		@Test
		void testCompareTo_LessThan2() {
				Event event1 = new Event("a");
				Event event2 = new Event("b");
				assertTrue(event1.compareTo(event2) < 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns a positive integer when the event is greater than the other event.
		*/
		@Test
		void testCompareTo_GreaterThan2() {
				Event event1 = new Event("b");
				Event event2 = new Event("a");
				assertTrue(event1.compareTo(event2) > 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns zero when the event is equal to the other event.
		*/
		@Test
		void testCompareTo_Equal2() {
				Event event1 = new Event("a");
				Event event2 = new Event("a");
				assertTrue(event1.compareTo(event2) == 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns a negative integer when the event is less than the other event.
		*/
		@Test
		void testCompareTo_LessThan3() {
				Event event1 = new Event("a");
				Event event2 = new Event("b");
				assertTrue(event1.compareTo(event2) < 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns a positive integer when the event is greater than the other event.
		*/
		@Test
		void testCompareTo_GreaterThan3() {
				Event event1 = new Event("b");
				Event event2 = new Event("a");
				assertTrue(event1.compareTo(event2) > 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns zero when the event is equal to the other event.
		*/
		@Test
		void testCompareTo_Equal3() {
				Event event1 = new Event("a");
				Event event2 = new Event("a");
				assertTrue(event1.compareTo(event2) == 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns a negative integer when the event is less than the other event.
		*/
		@Test
		void testCompareTo_LessThan4() {
				Event event1 = new Event("a");
				Event event2 = new Event("b");
				assertTrue(event1.compareTo(event2) < 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns a positive integer when the event is greater than the other event.
		*/
		@Test
		void testCompareTo_GreaterThan4() {
				Event event1 = new Event("b");
				Event event2 = new Event("a");
				assertTrue(event1.compareTo(event2) > 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns zero when the event is equal to the other event.
		*/
		@Test
		void testCompareTo_Equal4() {
				Event event1 = new Event("a");
				Event event2 = new Event("a");
				assertTrue(event1.compareTo(event2) == 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns a negative integer when the event is less than the other event.
		*/
		@Test
		void testCompareTo_LessThan5() {
				Event event1 = new Event("a");
				Event event2 = new Event("b");
				assertTrue(event1.compareTo(event2) < 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns a positive integer when the event is greater than the other event.
		*/
		@Test
		void testCompareTo_GreaterThan5() {
				Event event1 = new Event("b");
				Event event2 = new Event("a");
				assertTrue(event1.compareTo(event2) > 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns zero when the event is equal to the other event.
		*/
		@Test
		void testCompareTo_Equal5() {
				Event event1 = new Event("a");
				Event event2 = new Event("a");
				assertTrue(event1.compareTo(event2) == 0);
		}
		
		/**
		* Test case for {@link Event#compareTo(Object)} method.
		* It tests if the method returns a negative integer when the event is less than the other event.
		*/
		@Test
		void testCompareTo_LessThan6() {
				Event event1 = new Event("a");
				Event event2 = new Event("b");
				assertTrue(event1.compareTo(event2) < 0);
		}