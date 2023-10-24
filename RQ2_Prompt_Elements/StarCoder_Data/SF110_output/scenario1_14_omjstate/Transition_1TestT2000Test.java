// Transition_1Test.java
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
class Transition_1Test {

    /**
    * Test method for {@link Transition#willTrigger(IState, Event)}.
    */
    @Test
    void testWillTrigger() {
        Transition transition = new Transition();
        transition.setTriggerEvent(new Event("event"));
        transition.setInitialState(new State("state"));
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(Event pEvent) {
                return true;
            }
        });
        assertTrue(transition.willTrigger(new State("state"), new Event("event")));
    }
}

// Transition_2Test.java
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
class Transition_2Test {
		
    /**
    * Test method for {@link Transition#willTrigger(IState, Event)}.
    */
    @Test
    void testWillTrigger() {
        Transition transition = new Transition();
        transition.setTriggerEvent(new Event("event"));
        transition.setInitialState(new State("state"));
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(Event pEvent) {
                return false;
            }
        });
        assertFalse(transition.willTrigger(new State("state"), new Event("event")));
    }
}

// Transition_3Test.java
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
class Transition_3Test {
		
    /**
    * Test method for {@link Transition#willTrigger(IState, Event)}.
    */
    @Test
    void testWillTrigger() {
        Transition transition = new Transition();
        transition.setTriggerEvent(new Event("event"));
        transition.setInitialState(new State("state"));
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(Event pEvent) {
                return true;
            }
        });
        assertTrue(transition.willTrigger(new State("state"), new Event("event")));
    }
}

// Transition_4Test.java
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
class Transition_4Test {
		
    /**
    * Test method for {@link Transition#willTrigger(IState, Event)}.
    */
    @Test
    void testWillTrigger() {
        Transition transition = new Transition();
        transition.setTriggerEvent(new Event("event"));
        transition.setInitialState(new State("state"));
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(Event pEvent) {
                return false;
            }
        });
        assertFalse(transition.willTrigger(new State("state"), new Event("event")));
    }
}

// Transition_5Test.java
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
class Transition_5Test {
		
    /**
    * Test method for {@link Transition#willTrigger(IState, Event)}.
    */
    @Test
    void testWillTrigger() {
        Transition transition = new Transition();
        transition.setTriggerEvent(new Event("event"));
        transition.setInitialState(new State("state"));
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(Event pEvent) {
                return true;
            }
        });
        assertTrue(transition.willTrigger(new State("state"), new Event("event")));
    }
}

// Transition_6Test.java
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
class Transition_6Test {
		
    /**
    * Test method for {@link Transition#willTrigger(IState, Event)}.
    */
    @Test
    void testWillTrigger() {
        Transition transition = new Transition();
        transition.setTriggerEvent(new Event("event"));
        transition.setInitialState(new State("state"));
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(Event pEvent) {
                return false;
            }
        });
        assertFalse(transition.willTrigger(new State("state"), new Event("event")));
    }
}

// Transition_7Test.java
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
class Transition_7Test {
		
    /**
    * Test method for {@link Transition#willTrigger(IState, Event)}.
    */
    @Test
    void testWillTrigger() {
        Transition transition = new Transition();
        transition.setTriggerEvent(new Event("event"));
        transition.setInitialState(new State("state"));
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(Event pEvent) {
                return true;
            }
        });
        assertTrue(transition.willTrigger(new State("state"), new Event("event")));
    }
}

// Transition_8Test.java
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
class Transition_8Test {
		
    /**
    * Test method for {@link Transition#willTrigger(IState, Event)}.
    */
    @Test
    void testWillTrigger() {
        Transition transition = new Transition();
        transition.setTriggerEvent(new Event("event"));
        transition.setInitialState(new State("state"));
        transition.addGuardCondition(new GuardCondition() {
            public boolean evaluate(Event pEvent) {
                return false;
            }
        });
        assertFalse(transition.willTrigger(new State("state"), new Event("event")));
    }
}

// Transition_9Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test