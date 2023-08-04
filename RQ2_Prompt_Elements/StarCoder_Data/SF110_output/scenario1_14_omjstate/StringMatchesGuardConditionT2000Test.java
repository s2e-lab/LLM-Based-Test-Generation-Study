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
    * Test of evaluate method, of class StringMatchesGuardCondition.
    */
    @Test
    void testEvaluate() {
        System.out.println("evaluate");
        StringMatchesGuardCondition instance = new StringMatchesGuardCondition();
        Object o = null;
        boolean expResult = false;
        boolean result = instance.evaluate(o);
        assertEquals(expResult, result);
    }

    /**
    * Test of evaluate method, of class StringMatchesGuardCondition.
    */
    @Test
    void testEvaluate1() {
        System.out.println("evaluate");
        StringMatchesGuardCondition instance = new StringMatchesGuardCondition();
        Object o = new uk.me.jockmacmad.jstate.state.Event("test", new java.util.Vector());
        boolean expResult = false;
        boolean result = instance.evaluate(o);
        assertEquals(expResult, result);
    }

    /**
    * Test of evaluate method, of class StringMatchesGuardCondition.
    */
    @Test
    void testEvaluate2() {
        System.out.println("evaluate");
        StringMatchesGuardCondition instance = new StringMatchesGuardCondition();
        Object o = new uk.me.jockmacmad.jstate.state.Event("test", new java.util.Vector());
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        boolean expResult = true;
        boolean result = instance.evaluate(o);
        assertEquals(expResult, result);
    }

    /**
    * Test of evaluate method, of class StringMatchesGuardCondition.
    */
    @Test
    void testEvaluate3() {
        System.out.println("evaluate");
        StringMatchesGuardCondition instance = new StringMatchesGuardCondition();
        Object o = new uk.me.jockmacmad.jstate.state.Event("test", new java.util.Vector());
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        boolean expResult = true;
        boolean result = instance.evaluate(o);
        assertEquals(expResult, result);
    }

    /**
    * Test of evaluate method, of class StringMatchesGuardCondition.
    */
    @Test
    void testEvaluate4() {
        System.out.println("evaluate");
        StringMatchesGuardCondition instance = new StringMatchesGuardCondition();
        Object o = new uk.me.jockmacmad.jstate.state.Event("test", new java.util.Vector());
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        boolean expResult = true;
        boolean result = instance.evaluate(o);
        assertEquals(expResult, result);
    }

    /**
    * Test of evaluate method, of class StringMatchesGuardCondition.
    */
    @Test
    void testEvaluate5() {
        System.out.println("evaluate");
        StringMatchesGuardCondition instance = new StringMatchesGuardCondition();
        Object o = new uk.me.jockmacmad.jstate.state.Event("test", new java.util.Vector());
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        boolean expResult = true;
        boolean result = instance.evaluate(o);
        assertEquals(expResult, result);
    }

    /**
    * Test of evaluate method, of class StringMatchesGuardCondition.
    */
    @Test
    void testEvaluate6() {
        System.out.println("evaluate");
        StringMatchesGuardCondition instance = new StringMatchesGuardCondition();
        Object o = new uk.me.jockmacmad.jstate.state.Event("test", new java.util.Vector());
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        boolean expResult = true;
        boolean result = instance.evaluate(o);
        assertEquals(expResult, result);
    }

    /**
    * Test of evaluate method, of class StringMatchesGuardCondition.
    */
    @Test
    void testEvaluate7() {
        System.out.println("evaluate");
        StringMatchesGuardCondition instance = new StringMatchesGuardCondition();
        Object o = new uk.me.jockmacmad.jstate.state.Event("test", new java.util.Vector());
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        boolean expResult = true;
        boolean result = instance.evaluate(o);
        assertEquals(expResult, result);
    }

    /**
    * Test of evaluate method, of class StringMatchesGuardCondition.
    */
    @Test
    void testEvaluate8() {
        System.out.println("evaluate");
        StringMatchesGuardCondition instance = new StringMatchesGuardCondition();
        Object o = new uk.me.jockmacmad.jstate.state.Event("test", new java.util.Vector());
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        boolean expResult = true;
        boolean result = instance.evaluate(o);
        assertEquals(expResult, result);
    }

    /**
    * Test of evaluate method, of class StringMatchesGuardCondition.
    */
    @Test
    void testEvaluate9() {
        System.out.println("evaluate");
        StringMatchesGuardCondition instance = new StringMatchesGuardCondition();
        Object o = new uk.me.jockmacmad.jstate.state.Event("test", new java.util.Vector());
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        ((uk.me.jockmacmad.jstate.state.Event) o).addParameter("test");
        boolean expResult = true;
        boolean result = instance.evaluate(o);
        assertEquals(expResult, result);
    }

    /**
    * Test of evaluate method, of class StringMatchesGuardCondition.
    */
    @Test
    void testEvaluate10() {
        System.out.println("evaluate");
        StringMatchesGuardCondition instance = new StringMatchesGuardCondition();
        Object o =