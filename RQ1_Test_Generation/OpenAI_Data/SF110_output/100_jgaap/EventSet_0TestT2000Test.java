// EventSet_0Test.java


import java.util.Vector;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EventSet}.
* It contains ten unit test cases for the {@link EventSet#subset(int, int)} method.
*/
class EventSet_0Test {

		/**
		* Test case 1 for {@link EventSet#subset(int, int)}.
		* It tests the case when the start index is negative.
		*/
		@Test
		void testSubset_0() {
				EventSet eventSet = new EventSet();
				Event event = new Event();
				eventSet.events.add(event);
				EventSet result = eventSet.subset(-1, 1);
				assertEquals(0, result.events.size());
		}
		
		/**
		* Test case 2 for {@link EventSet#subset(int, int)}.
		* It tests the case when the start index is zero.
		*/
		@Test
		void testSubset_1() {
				EventSet eventSet = new EventSet();
				Event event = new Event();
				eventSet.events.add(event);
				EventSet result = eventSet.subset(0, 1);
				assertEquals(1, result.events.size());
		}
		
		/**
		* Test case 3 for {@link EventSet#subset(int, int)}.
		* It tests the case when the start index is positive.
		*/
		@Test
		void testSubset_2() {
				EventSet eventSet = new EventSet();
				Event event = new Event();
				eventSet.events.add(event);
				EventSet result = eventSet.subset(1, 1);
				assertEquals(0, result.events.size());
		}
		
		/**
		* Test case 4 for {@link EventSet#subset(int, int)}.
		* It tests the case when the length is negative.
		*/
		@Test
		void testSubset_3() {
				EventSet eventSet = new EventSet();
				Event event = new Event();
				eventSet.events.add(event);
				EventSet result = eventSet.subset(0, -1);
				assertEquals(0, result.events.size());
		}
		
		/**
		* Test case 5 for {@link EventSet#subset(int, int)}.
		* It tests the case when the length is zero.
		*/
		@Test
		void testSubset_4() {
				EventSet eventSet = new EventSet();
				Event event = new Event();
				eventSet.events.add(event);
				EventSet result = eventSet.subset(0, 0);
				assertEquals(0, result.events.size());
		}
		
		/**
		* Test case 6 for {@link EventSet#subset(int, int)}.
		* It tests the case when the length is positive.
		*/
		@Test
		void testSubset_5() {
				EventSet eventSet = new EventSet();
				Event event = new Event();
				eventSet.events.add(event);
				EventSet result = eventSet.subset(0, 1);
				assertEquals(1, result.events.size());
		}
		
		/**
		* Test case 7 for {@link EventSet#subset(int, int)}.
		* It tests the case when the start index is negative and the length is negative.
		*/
		@Test
		void testSubset_6() {
				EventSet eventSet = new EventSet();
				Event event = new Event();
				eventSet.events.add(event);
				EventSet result = eventSet.subset(-1, -1);
				assertEquals(0, result.events.size());
		}
		
		/**
		* Test case 8 for {@link EventSet#subset(int, int)}.
		* It tests the case when the start index is negative and the length is zero.
		*/
		@Test
		void testSubset_7() {
				EventSet eventSet = new EventSet();
				Event event = new Event();
				eventSet.events.add(event);
				EventSet result = eventSet.subset(-1, 0);
				assertEquals(0, result.events.size());
		}
		
		/**
		* Test case 9 for {@link EventSet#subset(int, int)}.
		* It tests the case when the start index is negative and the length is positive.
		*/
		@Test
		void testSubset_8() {
				EventSet eventSet = new EventSet();
				Event event = new Event();
				eventSet.events.add(event);
				EventSet result = eventSet.subset(-1, 1);
				assertEquals(0, result.events.size());
		}
		
		/**
		* Test case 10 for {@link EventSet#subset(int, int)}.
		* It tests the case when the start index is zero and the length is zero.
		*/
		@Test
		void testSubset_9() {
				EventSet eventSet = new EventSet();
				Event event = new Event();
				eventSet.events.add(event);
				EventSet result = eventSet.subset(0, 0);
				assertEquals(0, result.events.size());
		}
		
}

// EventSet_1Test.java


import java.util.Vector;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EventSet}.
* It contains ten unit test cases for the {@link EventSet#subset(int, int)} method.
*/
class EventSet_1Test {
		
		/**
		* Test case 1 for {@link EventSet#subset(int, int)}.
		* It tests the case when the start index is negative.
		*/
		@Test
		void testSubset_0() {
				EventSet eventSet = new EventSet();
				Event event = new Event();
				eventSet.events.add(event);
				EventSet result = eventSet.subset(-1, 1);
				assertEquals(0, result.events.size());
		}
		
		/**
		* Test case 2 for {@link EventSet#subset(int, int)}.
		* It tests the case when the start index is zero.
		*/
		@Test
		void testSubset_1() {
				EventSet eventSet = new EventSet();
				Event event = new Event();
				eventSet.events.add(event);
				EventSet result = eventSet.subset(0, 1);
				assertEquals(1, result.events.size());
		}
		
		/**
		* Test case 3 for {@link EventSet#subset(int, int)}.
		* It tests the case when the start index is positive.
		*/
		@Test
		void testSubset_2() {
				EventSet eventSet = new EventSet();
				Event event = new Event();
				eventSet.events.add(event);
				EventSet result = eventSet.subset(1, 1);
				assertEquals(0, result.events.size());
		}
		
		/**
		* Test