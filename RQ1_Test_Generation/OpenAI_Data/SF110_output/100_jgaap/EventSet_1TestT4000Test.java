// EventSet_1Test.java


import java.util.Vector;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EventSet}.
* It contains ten unit test cases for the {@link EventSet#eventAt(int)} method.
*/
class EventSet_1Test {

		/**
		* Test case 1 for {@link EventSet#eventAt(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testEventAt_1() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new Event("B"), eventSet.eventAt(1));
		}
		
		/**
		* Test case 2 for {@link EventSet#eventAt(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testEventAt_2() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new Event("C"), eventSet.eventAt(2));
		}
		
		/**
		* Test case 3 for {@link EventSet#eventAt(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testEventAt_3() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new Event("A"), eventSet.eventAt(0));
		}
		
		/**
		* Test case 4 for {@link EventSet#eventAt(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testEventAt_4() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new Event("A"), eventSet.eventAt(0));
		}
		
		/**
		* Test case 5 for {@link EventSet#eventAt(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testEventAt_5() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new Event("B"), eventSet.eventAt(1));
		}
		
		/**
		* Test case 6 for {@link EventSet#eventAt(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testEventAt_6() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new Event("C"), eventSet.eventAt(2));
		}
		
		/**
		* Test case 7 for {@link EventSet#eventAt(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testEventAt_7() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new Event("A"), eventSet.eventAt(0));
		}
		
		/**
		* Test case 8 for {@link EventSet#eventAt(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testEventAt_8() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new Event("A"), eventSet.eventAt(0));
		}
		
		/**
		* Test case 9 for {@link EventSet#eventAt(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testEventAt_9() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new Event("B"), eventSet.eventAt(1));
		}
		
		/**
		* Test case 10 for {@link EventSet#eventAt(int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testEventAt_10() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new Event("C"), eventSet.eventAt(2));
		}
}

// EventSet_2Test.java


import java.util.Vector;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EventSet}.
* It contains ten unit test cases for the {@link EventSet#size()} method.
*/
class EventSet_2Test {
		
		/**
		* Test case 1 for {@link EventSet#size()}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSize_1() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(3, eventSet.size());
		}
		
		/**
		* Test case 2 for {@link EventSet#size()}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSize_2() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(3, eventSet.size());
		}
		
		/**
		* Test case 3 for {@link EventSet#size()}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSize_3() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(3, eventSet.size());
		}
		
		/**
		* Test case 4 for {@link EventSet#size()}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSize_4() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(3, eventSet.size());
		}
		
		/**
		* Test case 5 for {@link EventSet#size()}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSize_5() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(3, eventSet.size());
		}
		
		/**
		* Test case 6 for {@link EventSet#size()}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSize_6() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(3, eventSet.size());
		}
		
		/**
		* Test case 7 for {@link EventSet#size()}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSize_7() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(3, eventSet.size());
		}
		
		/**
		* Test case 8 for {@link EventSet#size()}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSize_8() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(3, eventSet.size());
		}
		
		/**
		* Test case 9 for {@link EventSet#size()}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSize_9() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(3, eventSet.size());
		}
		
		/**
		* Test case 10 for {@link EventSet#size()}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSize_10() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(3, eventSet.size());
		}
}

// EventSet_3Test.java


import java.util.Vector;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EventSet}.
* It contains ten unit test cases for the {@link EventSet#subset(int, int)} method.
*/
class EventSet_3Test {
		
		/**
		* Test case 1 for {@link EventSet#subset(int, int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSubset_1() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new EventSet(eventSet.events.subList(0, 2)), eventSet.subset(0, 2));
		}
		
		/**
		* Test case 2 for {@link EventSet#subset(int, int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSubset_2() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new EventSet(eventSet.events.subList(1, 3)), eventSet.subset(1, 3));
		}
		
		/**
		* Test case 3 for {@link EventSet#subset(int, int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSubset_3() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new EventSet(eventSet.events.subList(0, 3)), eventSet.subset(0, 3));
		}
		
		/**
		* Test case 4 for {@link EventSet#subset(int, int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSubset_4() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
				assertEquals(new EventSet(eventSet.events.subList(0, 2)), eventSet.subset(0, 2));
		}
		
		/**
		* Test case 5 for {@link EventSet#subset(int, int)}.
		* It tests the method with a valid index.
		*/
		@Test
		void testSubset_5() {
				EventSet eventSet = new EventSet();
				eventSet.events.add(new Event("A"));
				eventSet.events.add(new Event("B"));
				eventSet.events.add(new Event("C"));
