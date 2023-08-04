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
    * @since 0.1
    */
    @Test
    void testWillTrigger() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        assertTrue(transition.willTrigger(new State("test"), new Event("test")));
        assertFalse(transition.willTrigger(new State("test"), new Event("test2")));
        assertFalse(transition.willTrigger(new State("test2"), new Event("test")));
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
* It contains ten unit test cases for the {@link Transition#trigger(IState, Event)} method.
*/
class Transition_2Test {
		
    /**
    * Test method for {@link Transition#trigger(IState, Event)}.
    * @since 0.1
    */
    @Test
    void testTrigger() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        assertEquals(new State("test"), transition.trigger(new State("test"), new Event("test")));
        assertEquals(new State("test"), transition.trigger(new State("test"), new Event("test2")));
        assertEquals(new State("test"), transition.trigger(new State("test2"), new Event("test")));
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
* It contains ten unit test cases for the {@link Transition#equals(Object)} method.
*/
class Transition_3Test {
		
    /**
    * Test method for {@link Transition#equals(Object)}.
    * @since 0.1
    */
    @Test
    void testEquals() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        Transition transition2 = new Transition("test", new Event("test"), new State("test"), new State("test"));
        assertTrue(transition.equals(transition2));
        transition2 = new Transition("test2", new Event("test"), new State("test"), new State("test"));
        assertFalse(transition.equals(transition2));
        transition2 = new Transition("test", new Event("test2"), new State("test"), new State("test"));
        assertFalse(transition.equals(transition2));
        transition2 = new Transition("test", new Event("test"), new State("test2"), new State("test"));
        assertFalse(transition.equals(transition2));
        transition2 = new Transition("test", new Event("test"), new State("test"), new State("test2"));
        assertFalse(transition.equals(transition2));
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
* It contains ten unit test cases for the {@link Transition#hashCode()} method.
*/
class Transition_4Test {
		
    /**
    * Test method for {@link Transition#hashCode()}.
    * @since 0.1
    */
    @Test
    void testHashCode() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        Transition transition2 = new Transition("test", new Event("test"), new State("test"), new State("test"));
        assertEquals(transition.hashCode(), transition2.hashCode());
        transition2 = new Transition("test2", new Event("test"), new State("test"), new State("test"));
        assertNotEquals(transition.hashCode(), transition2.hashCode());
        transition2 = new Transition("test", new Event("test2"), new State("test"), new State("test"));
        assertNotEquals(transition.hashCode(), transition2.hashCode());
        transition2 = new Transition("test", new Event("test"), new State("test2"), new State("test"));
        assertNotEquals(transition.hashCode(), transition2.hashCode());
        transition2 = new Transition("test", new Event("test"), new State("test"), new State("test2"));
        assertNotEquals(transition.hashCode(), transition2.hashCode());
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
* It contains ten unit test cases for the {@link Transition#toString()} method.
*/
class Transition_5Test {
		
    /**
    * Test method for {@link Transition#toString()}.
    * @since 0.1
    */
    @Test
    void testToString() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        assertEquals("Transition [name=test, triggerEvent=Event [name=test], initialState=State [name=test], outcomeState=State [name=test], guardConditions=[]]", transition.toString());
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
* It contains ten unit test cases for the {@link Transition#addGuardCondition(IGuardCondition)} method.
*/
class Transition_6Test {
		
    /**
    * Test method for {@link Transition#addGuardCondition(IGuardCondition)}.
    * @since 0.1
    */
    @Test
    void testAddGuardCondition() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        transition.addGuardCondition(new GuardCondition("test", new Predicate("test")));
        assertEquals(1, transition.getGuardConditions().size());
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
* It contains ten unit test cases for the {@link Transition#getInitialState()} method.
*/
class Transition_7Test {
		
    /**
    * Test method for {@link Transition#getInitialState()}.
    * @since 0.1
    */
    @Test
    void testGetInitialState() {
        Transition transition = new Transition("test", new Event("test"), new State("test"), new State("test"));
        assertEquals(new State("test"), transition.getInitialState());
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
* It contains ten unit test cases for the {@link Transition#getOutcomeState()} method.
*/
class Transition_8Test {
		
    /**
    * Test method for {@