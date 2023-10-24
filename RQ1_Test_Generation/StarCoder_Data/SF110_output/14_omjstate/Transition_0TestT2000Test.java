// Transition_0Test.java
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
class Transition_0Test {

    /**
    * Test method for {@link Transition#trigger(IState, Event)}.
    * It tests the case where the Transition is triggered
    * and the outcome state is returned.
    */
    @Test
    void testTrigger() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        State currentState = new State("test");
        Event event = new Event("test");
        State outcomeState = transition.trigger(currentState, event);
        assertEquals(outcomeState, transition.getOutcomeState());
    }

    /**
    * Test method for {@link Transition#trigger(IState, Event)}.
    * It tests the case where the Transition is not triggered
    * and the current state is returned.
    */
    @Test
    void testTrigger_0() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        State currentState = new State("test");
        Event event = new Event("test");
        State outcomeState = transition.trigger(currentState, event);
        assertNotEquals(outcomeState, transition.getInitialState());
    }

    /**
    * Test method for {@link Transition#trigger(IState, Event)}.
    * It tests the case where the Transition is triggered
    * but the guard conditions are not met and the current
    * state is returned.
    */
    @Test
    void testTrigger_1() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        transition.addGuardCondition(new GuardCondition("test", new Predicate("test")));
        State currentState = new State("test");
        Event event = new Event("test");
        State outcomeState = transition.trigger(currentState, event);
        assertNotEquals(outcomeState, transition.getOutcomeState());
    }

    /**
    * Test method for {@link Transition#trigger(IState, Event)}.
    * It tests the case where the Transition is triggered
    * but the guard conditions are not met and the current
    * state is returned.
    */
    @Test
    void testTrigger_2() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        transition.addGuardCondition(new GuardCondition("test", new Predicate("test")));
        State currentState = new State("test");
        Event event = new Event("test");
        State outcomeState = transition.trigger(currentState, event);
        assertNotEquals(outcomeState, transition.getOutcomeState());
    }

    /**
    * Test method for {@link Transition#trigger(IState, Event)}.
    * It tests the case where the Transition is triggered
    * but the guard conditions are not met and the current
    * state is returned.
    */
    @Test
    void testTrigger_3() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        transition.addGuardCondition(new GuardCondition("test", new Predicate("test")));
        State currentState = new State("test");
        Event event = new Event("test");
        State outcomeState = transition.trigger(currentState, event);
        assertNotEquals(outcomeState, transition.getOutcomeState());
    }

    /**
    * Test method for {@link Transition#trigger(IState, Event)}.
    * It tests the case where the Transition is triggered
    * but the guard conditions are not met and the current
    * state is returned.
    */
    @Test
    void testTrigger_4() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        transition.addGuardCondition(new GuardCondition("test", new Predicate("test")));
        State currentState = new State("test");
        Event event = new Event("test");
        State outcomeState = transition.trigger(currentState, event);
        assertNotEquals(outcomeState, transition.getOutcomeState());
    }

    /**
    * Test method for {@link Transition#trigger(IState, Event)}.
    * It tests the case where the Transition is triggered
    * but the guard conditions are not met and the current
    * state is returned.
    */
    @Test
    void testTrigger_5() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        transition.addGuardCondition(new GuardCondition("test", new Predicate("test")));
        State currentState = new State("test");
        Event event = new Event("test");
        State outcomeState = transition.trigger(currentState, event);
        assertNotEquals(outcomeState, transition.getOutcomeState());
    }

    /**
    * Test method for {@link Transition#trigger(IState, Event)}.
    * It tests the case where the Transition is triggered
    * but the guard conditions are not met and the current
    * state is returned.
    */
    @Test
    void testTrigger_6() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        transition.addGuardCondition(new GuardCondition("test", new Predicate("test")));
        State currentState = new State("test");
        Event event = new Event("test");
        State outcomeState = transition.trigger(currentState, event);
        assertNotEquals(outcomeState, transition.getOutcomeState());
    }

    /**
    * Test method for {@link Transition#trigger(IState, Event)}.
    * It tests the case where the Transition is triggered
    * but the guard conditions are not met and the current
    * state is returned.
    */
    @Test
    void testTrigger_7() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        transition.addGuardCondition(new GuardCondition("test", new Predicate("test")));
        State currentState = new State("test");
        Event event = new Event("test");
        State outcomeState = transition.trigger(currentState, event);
        assertNotEquals(outcomeState, transition.getOutcomeState());
    }

    /**
    * Test method for {@link Transition#trigger(IState, Event)}.
    * It tests the case where the Transition is triggered
    * but the guard conditions are not met and the current
    * state is returned.
    */
    @Test
    void testTrigger_8() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        transition.addGuardCondition(new GuardCondition("test", new Predicate("test")));
        State currentState = new State("test");
        Event event = new Event("test");
        State outcomeState = transition.trigger(currentState, event);
        assertNotEquals(outcomeState, transition.getOutcomeState());
    }

    /**
    * Test method for {@link Transition#trigger(IState, Event)}.
    * It tests the case where the Transition is triggered
    * but the guard conditions are not met and the current
    * state is returned.
    */
    @Test
    void testTrigger_9() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        transition.addGuardCondition(new GuardCondition("test", new Predicate("test")));
        State currentState = new State("test");
        Event event = new Event("test");
        State outcomeState = transition.trigger(currentState, event);
        assertNotEquals(outcomeState, transition.getOutcomeState());
    }
}
