// TransitionTest2.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#trigger(IState, Event)} method.
*/
class TransitionTest2 {

		/**
		 * Test method for {@link Transition#trigger(IState, Event)}.
		 */
		@Test
		void testTrigger() {
				// Create a new Transition object
				Transition transition = new Transition("transition", new Event("event"), new State("state"), new State("state"));
				// Create a new State object
				State state = new State("state");
				// Create a new Event object
				Event event = new Event("event");
				// Call the trigger method
				IState result = transition.trigger(state, event);
				// Create a new State object
				State expected = new State("state");
				// Check if the result is equal to the expected
				assertEquals(expected, result);
		}
		
		/**
		 * Test method for {@link Transition#trigger(IState, Event)}.
		 */
		@Test
		void testTrigger2() {
				// Create a new Transition object
				Transition transition = new Transition("transition", new Event("event"), new State("state"), new State("state"));
				// Create a new State object
				State state = new State("state");
				// Create a new Event object
				Event event = new Event("event");
				// Call the trigger method
				IState result = transition.trigger(state, event);
				// Create a new State object
				State expected = new State("state");
				// Check if the result is equal to the expected
				assertEquals(expected, result);
		}
		
		/**
		 * Test method for {@link Transition#trigger(IState, Event)}.
		 */
		@Test
		void testTrigger3() {
				// Create a new Transition object
				Transition transition = new Transition("transition", new Event("event"), new State("state"), new State("state"));
				// Create a new State object
				State state = new State("state");
				// Create a new Event object
				Event event = new Event("event");
				// Call the trigger method
				IState result = transition.trigger(state, event);
				// Create a new State object
				State expected = new State("state");
				// Check if the result is equal to the expected
				assertEquals(expected, result);
		}
		
		/**
		 * Test method for {@link Transition#trigger(IState, Event)}.
		 */
		@Test
		void testTrigger4() {
				// Create a new Transition object
				Transition transition = new Transition("transition", new Event("event"), new State("state"), new State("state"));
				// Create a new State object
				State state = new State("state");
				// Create a new Event object
				Event event = new Event("event");
				// Call the trigger method
				IState result = transition.trigger(state, event);
				// Create a new State object
				State expected = new State("state");
				// Check if the result is equal to the expected
				assertEquals(expected, result);
		}
		
		/**
		 * Test method for {@link Transition#trigger(IState, Event)}.
		 */
		@Test
		void testTrigger5() {
				// Create a new Transition object
				Transition transition = new Transition("transition", new Event("event"), new State("state"), new State("state"));
				// Create a new State object
				State state = new State("state");
				// Create a new Event object
				Event event = new Event("event");
				// Call the trigger method
				IState result = transition.trigger(state, event);
				// Create a new State object
				State expected = new State("state");
				// Check if the result is equal to the expected
				assertEquals(expected, result);
		}
		
		/**
		 * Test method for {@link Transition#trigger(IState, Event)}.
		 */
		@Test
		void testTrigger6() {
				// Create a new Transition object
				Transition transition = new Transition("transition", new Event("event"), new State("state"), new State("state"));
				// Create a new State object
				State state = new State("state");
				// Create a new Event object
				Event event = new Event("event");
				// Call the trigger method
				IState result = transition.trigger(state, event);
				// Create a new State object
				State expected = new State("state");
				// Check if the result is equal to the expected
				assertEquals(expected, result);
		}
		
		/**
		 * Test method for {@link Transition#trigger(IState, Event)}.
		 */
		@Test
		void testTrigger7() {
				// Create a new Transition object
				Transition transition = new Transition("transition", new Event("event"), new State("state"), new State("state"));
				// Create a new State object
				State state = new State("state");
				// Create a new Event object
				Event event = new Event("event");
				// Call the trigger method
				IState result = transition.trigger(state, event);
				// Create a new State object
				State expected = new State("state");
				// Check if the result is equal to the expected
				assertEquals(expected, result);
		}
		
		/**
		 * Test method for {@link Transition#trigger(IState, Event)}.
		 */
		@Test
		void testTrigger8() {
				// Create a new Transition object
				Transition transition = new Transition("transition", new Event("event"), new State("state"), new State("state"));
				// Create a new State object
				State state = new State("state");
				// Create a new Event object
				Event event = new Event("event");
				// Call the trigger method
				IState result = transition.trigger(state, event);
				// Create a new State object
				State expected = new State("state");
				// Check if the result is equal to the expected
				assertEquals(expected, result);
		}
		
		/**
		 * Test method for {@link Transition#trigger(IState, Event)}.
		 */
		@Test
		void testTrigger9() {
				// Create a new Transition object
				Transition transition = new Transition("transition", new Event("event"), new State("state"), new State("state"));
				// Create a new State object
				State state = new State("state");
				// Create a new Event object
				Event event = new Event("event");
				// Call the trigger method
				IState result = transition.trigger(state, event);
				// Create a new State object
				State expected = new State("state");
				// Check if the result is equal to the expected
				assertEquals(expected, result);
		}
		
		/**
		 * Test method for {@link Transition#trigger(IState, Event)}.
		 */
		@Test
		void testTrigger10() {
				// Create a new Transition object
				Transition transition = new Transition("transition", new Event("event"), new State("state"), new State("state"));
		