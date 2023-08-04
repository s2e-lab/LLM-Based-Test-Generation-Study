// StringMatchesGuardConditionTest.java
package uk.me.jockmacmad.jstate.state;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StringMatchesGuardCondition}.
* It contains ten unit test cases for the {@link StringMatchesGuardCondition#evaluate(Object)} method.
*/
class StringMatchesGuardConditionTest {

    /**
    * Test case for {@link StringMatchesGuardCondition#evaluate(Object)}
    * @throws Exception
    */
    @Test
    void testEvaluate() throws Exception {
        StringMatchesGuardCondition condition = new StringMatchesGuardCondition("test");
        assertTrue(condition.evaluate(new Event("test")));
        assertFalse(condition.evaluate(new Event("test2")));
    }
}
