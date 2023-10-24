// StartState_0Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getSingleton()} method.
*/
class StartState_0Test {

    /**
    * Test method for {@link StartState#getSingleton()}.
    */
    @Test
    void testGetSingleton() {
        StartState startState = StartState.getSingleton();
        assertNotNull(startState);
    }

    /**
    * Test method for {@link StartState#getSingleton()}.
    */
    @Test
    void testGetSingleton_0() {
        StartState startState = StartState.getSingleton();
        StartState startState2 = StartState.getSingleton();
        assertEquals(startState, startState2);
    }

    /**
    * Test method for {@link StartState#getSingleton()}.
    */
    @Test
    void testGetSingleton_1() {
        StartState startState = StartState.getSingleton();
        StartState startState2 = StartState.getSingleton();
        assertEquals(startState.hashCode(), startState2.hashCode());
    }

    /**
    * Test method for {@link StartState#getSingleton()}.
    */
    @Test
    void testGetSingleton_2() {
        StartState startState = StartState.getSingleton();
        StartState startState2 = StartState.getSingleton();
        assertEquals(startState.equals(startState2), startState2.equals(startState));
    }

    /**
    * Test method for {@link StartState#getSingleton()}.
    */
    @Test
    void testGetSingleton_3() {
        StartState startState = StartState.getSingleton();
        StartState startState2 = StartState.getSingleton();
        assertEquals(startState.equals(startState2), startState.equals(startState2));
    }

    /**
    * Test method for {@link StartState#getSingleton()}.
    */
    @Test
    void testGetSingleton_4() {
        StartState startState = StartState.getSingleton();
        StartState startState2 = StartState.getSingleton();
        assertEquals(startState.equals(startState2), startState2.equals(startState));
    }

    /**
    * Test method for {@link StartState#getSingleton()}.
    */
    @Test
    void testGetSingleton_5() {
        StartState startState = StartState.getSingleton();
        StartState startState2 = StartState.getSingleton();
        assertEquals(startState.equals(startState2), startState.equals(startState2));
    }

    /**
    * Test method for {@link StartState#getSingleton()}.
    */
    @Test
    void testGetSingleton_6() {
        StartState startState = StartState.getSingleton();
        StartState startState2 = StartState.getSingleton();
        assertEquals(startState.equals(startState2), startState2.equals(startState));
    }

    /**
    * Test method for {@link StartState#getSingleton()}.
    */
    @Test
    void testGetSingleton_7() {
        StartState startState = StartState.getSingleton();
        StartState startState2 = StartState.getSingleton();
        assertEquals(startState.equals(startState2), startState.equals(startState2));
    }

    /**
    * Test method for {@link StartState#getSingleton()}.
    */
    @Test
    void testGetSingleton_8() {
        StartState startState = StartState.getSingleton();
        StartState startState2 = StartState.getSingleton();
        assertEquals(startState.equals(startState2), startState2.equals(startState));
    }

    /**
    * Test method for {@link StartState#getSingleton()}.
    */
    @Test
    void testGetSingleton_9() {
        StartState startState = StartState.getSingleton();
        StartState startState2 = StartState.getSingleton();
        assertEquals(startState.equals(startState2), startState.equals(startState2));
    }
}
