// TransitionTest3.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#willTrigger(IState, Event)} method.
*/
class TransitionTest3 {

		/**
		 * Test case for {@link Transition#willTrigger(IState, Event)} method.
		 * <p>
		 * This test case checks if the method returns true when the current state is the initial state and the event is the trigger event.
		 * <p>
		 * The method should return true.
		 */
		@Test
		void testWillTrigger_True() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				
				// Act
				boolean result = transition.willTrigger(initialState, triggerEvent);
				
				// Assert
				assertTrue(result);
		}
		
		/**
		 * Test case for {@link Transition#willTrigger(IState, Event)} method.
		 * <p>
		 * This test case checks if the method returns false when the current state is not the initial state and the event is the trigger event.
		 * <p>
		 * The method should return false.
		 */
		@Test
		void testWillTrigger_False_CurrentStateNotInitialState() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				
				// Act
				boolean result = transition.willTrigger(outcomeState, triggerEvent);
				
				// Assert
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link Transition#willTrigger(IState, Event)} method.
		 * <p>
		 * This test case checks if the method returns false when the current state is the initial state and the event is not the trigger event.
		 * <p>
		 * The method should return false.
		 */
		@Test
		void testWillTrigger_False_EventNotTriggerEvent() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				
				// Act
				boolean result = transition.willTrigger(initialState, new Event("event"));
				
				// Assert
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link Transition#willTrigger(IState, Event)} method.
		 * <p>
		 * This test case checks if the method returns false when the current state is not the initial state and the event is not the trigger event.
		 * <p>
		 * The method should return false.
		 */
		@Test
		void testWillTrigger_False_CurrentStateNotInitialState_EventNotTriggerEvent() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				
				// Act
				boolean result = transition.willTrigger(outcomeState, new Event("event"));
				
				// Assert
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link Transition#willTrigger(IState, Event)} method.
		 * <p>
		 * This test case checks if the method returns false when the current state is null and the event is the trigger event.
		 * <p>
		 * The method should return false.
		 */
		@Test
		void testWillTrigger_False_CurrentStateNull() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				
				// Act
				boolean result = transition.willTrigger(null, triggerEvent);
				
				// Assert
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link Transition#willTrigger(IState, Event)} method.
		 * <p>
		 * This test case checks if the method returns false when the current state is the initial state and the event is null.
		 * <p>
		 * The method should return false.
		 */
		@Test
		void testWillTrigger_False_EventNull() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				
				// Act
				boolean result = transition.willTrigger(initialState, null);
				
				// Assert
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link Transition#willTrigger(IState, Event)} method.
		 * <p>
		 * This test case checks if the method returns false when the current state is null and the event is null.
		 * <p>
		 * The method should return false.
		 */
		@Test
		void testWillTrigger_False_CurrentStateNull_EventNull() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				
				// Act
				boolean result = transition.willTrigger(null, null);
				
				// Assert
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link Transition#willTrigger(IState, Event)} method.
		 * <p>
		 * This test case checks if the method returns false when the current state is not the initial state and the event is null.
		 * <p>
		 * The method should return false.
		 */
		@Test
		void testWillTrigger_False_CurrentStateNotInitialState_EventNull() {
				// Arrange
				IState initialState = new State("initialState");
				IState outcomeState = new State("outcomeState");
				Event triggerEvent = new Event("triggerEvent");
				Transition transition = new Transition("transition", triggerEvent, initialState, outcomeState);
				
				// Act
				boolean result = transition.willTrigger(outcomeState, null);
				
				// Assert
				assertFalse(result);
		}
		
		/**
		 * Test case for {@link Transition#willTrigger(IState, Event)} method.
		 * <p>
		 * This test case checks if the method returns false when the current state is null and the event is not the trigger event.
		 * <p>
		 * The method should return