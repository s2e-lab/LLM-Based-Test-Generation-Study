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
     * Test of {@link Transition#trigger(IState, Event)}
     * when the transition is not applicable.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     */
    @Test
    void testTrigger_0() {
        final StateMachine machine = new StateMachine();
        final State startState = new State("start");
        final State endState = new State("end");
        final Transition transition = new Transition(startState, endState);
        machine.addState(startState);
        machine.addState(endState);
        machine.addTransition(transition);
        machine.setCurrentState(startState);
        final Event event = new Event("event");
        final IState result = transition.trigger(machine.getCurrentState(), event);
        assertEquals(machine.getCurrentState(), result);
    }

    /**
     * Test of {@link Transition#trigger(IState, Event)}
     * when the transition is applicable but the guard conditions are not met.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     */
    @Test
    void testTrigger_1() {
        final StateMachine machine = new StateMachine();
        final State startState = new State("start");
        final State endState = new State("end");
        final Transition transition = new Transition(startState, endState);
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(final IState pCurrentState, final Event pEvent) {
                return false;
            }
        });
        machine.addState(startState);
        machine.addState(endState);
        machine.addTransition(transition);
        machine.setCurrentState(startState);
        final Event event = new Event("event");
        final IState result = transition.trigger(machine.getCurrentState(), event);
        assertEquals(machine.getCurrentState(), result);
    }

    /**
     * Test of {@link Transition#trigger(IState, Event)}
     * when the transition is applicable and the guard conditions are met.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     */
    @Test
    void testTrigger_2() {
        final StateMachine machine = new StateMachine();
        final State startState = new State("start");
        final State endState = new State("end");
        final Transition transition = new Transition(startState, endState);
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(final IState pCurrentState, final Event pEvent) {
                return true;
            }
        });
        machine.addState(startState);
        machine.addState(endState);
        machine.addTransition(transition);
        machine.setCurrentState(startState);
        final Event event = new Event("event");
        final IState result = transition.trigger(machine.getCurrentState(), event);
        assertEquals(endState, result);
    }

    /**
     * Test of {@link Transition#trigger(IState, Event)}
     * when the transition is applicable and the guard conditions are met.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     */
    @Test
    void testTrigger_3() {
        final StateMachine machine = new StateMachine();
        final State startState = new State("start");
        final State endState = new State("end");
        final Transition transition = new Transition(startState, endState);
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(final IState pCurrentState, final Event pEvent) {
                return true;
            }
        });
        machine.addState(startState);
        machine.addState(endState);
        machine.addTransition(transition);
        machine.setCurrentState(startState);
        final Event event = new Event("event");
        final IState result = transition.trigger(machine.getCurrentState(), event);
        assertEquals(endState, result);
    }

    /**
     * Test of {@link Transition#trigger(IState, Event)}
     * when the transition is applicable and the guard conditions are met.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     */
    @Test
    void testTrigger_4() {
        final StateMachine machine = new StateMachine();
        final State startState = new State("start");
        final State endState = new State("end");
        final Transition transition = new Transition(startState, endState);
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(final IState pCurrentState, final Event pEvent) {
                return true;
            }
        });
        machine.addState(startState);
        machine.addState(endState);
        machine.addTransition(transition);
        machine.setCurrentState(startState);
        final Event event = new Event("event");
        final IState result = transition.trigger(machine.getCurrentState(), event);
        assertEquals(endState, result);
    }

    /**
     * Test of {@link Transition#trigger(IState, Event)}
     * when the transition is applicable and the guard conditions are met.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     */
    @Test
    void testTrigger_5() {
        final StateMachine machine = new StateMachine();
        final State startState = new State("start");
        final State endState = new State("end");
        final Transition transition = new Transition(startState, endState);
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(final IState pCurrentState, final Event pEvent) {
                return true;
            }
        });
        machine.addState(startState);
        machine.addState(endState);
        machine.addTransition(transition);
        machine.setCurrentState(startState);
        final Event event = new Event("event");
        final IState result = transition.trigger(machine.getCurrentState(), event);
        assertEquals(endState, result);
    }

    /**
     * Test of {@link Transition#trigger(IState, Event)}
     * when the transition is applicable and the guard conditions are met.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     */
    @Test
    void testTrigger_6() {
        final StateMachine machine = new StateMachine();
        final State startState = new State("start");
        final State endState = new State("end");
        final Transition transition = new Transition(startState, endState);
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(final IState pCurrentState, final Event pEvent) {
                return true;
            }
        });
        machine.addState(startState);
        machine.addState(endState);
        machine.addTransition(transition);
        machine.setCurrentState(startState);
        final Event event = new Event("event");
        final IState result = transition.trigger(machine.getCurrentState(), event);
        assertEquals(endState, result);
    }

    /**
     * Test of {@link Transition#trigger(IState, Event)}
     * when the transition is applicable and the guard conditions are met.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     */
    @Test
    void testTrigger_7() {
        final StateMachine machine = new StateMachine();
        final State startState = new State("start");
        final State endState = new State("end");
        final Transition transition = new Transition(startState, endState);
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(final IState pCurrentState, final Event pEvent) {
                return true;
            }
        });
        machine.addState(startState);
        machine.addState(endState);
        machine.addTransition(transition);
        machine.setCurrentState(startState);
        final Event event = new Event("event");
        final IState result = transition.trigger(machine.getCurrentState(), event);
        assertEquals(endState, result);
    }

    /**
     * Test of {@link Transition#trigger(IState, Event)}
     * when the transition is applicable and the guard conditions are met.
     * Creation date: (14/02/01 6:21:09 PM)
     *
     * @author Don Stewart
     * @since 0.1
     */
    @Test
    void testTrigger_8() {
        final StateMachine machine = new StateMachine();
        final State startState =