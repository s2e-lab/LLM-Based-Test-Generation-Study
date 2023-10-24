// MessageFormatter_2Test.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFormatter}.
* It contains ten unit test cases for the {@link MessageFormatter#evaluateArguments(String, Object[])} method.
*/
class MessageFormatter_2Test {

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and no arguments.
    */
    @Test
    void testEvaluateArguments_01() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[0];
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertEquals(messagePattern, result.getFormattedMessage());
        assertNull(result.getThrowable());
    }

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and one argument.
    */
    @Test
    void testEvaluateArguments_02() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "argument" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertEquals("This is a test argument", result.getFormattedMessage());
        assertNull(result.getThrowable());
    }

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and two arguments.
    */
    @Test
    void testEvaluateArguments_03() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "argument1", "argument2" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertEquals("This is a test argument1 argument2", result.getFormattedMessage());
        assertNull(result.getThrowable());
    }

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and three arguments.
    */
    @Test
    void testEvaluateArguments_04() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "argument1", "argument2", "argument3" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertEquals("This is a test argument1 argument2 argument3", result.getFormattedMessage());
        assertNull(result.getThrowable());
    }

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and four arguments.
    */
    @Test
    void testEvaluateArguments_05() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "argument1", "argument2", "argument3", "argument4" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertEquals("This is a test argument1 argument2 argument3 argument4", result.getFormattedMessage());
        assertNull(result.getThrowable());
    }

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and five arguments.
    */
    @Test
    void testEvaluateArguments_06() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "argument1", "argument2", "argument3", "argument4", "argument5" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertEquals("This is a test argument1 argument2 argument3 argument4 argument5", result.getFormattedMessage());
        assertNull(result.getThrowable());
    }

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and six arguments.
    */
    @Test
    void testEvaluateArguments_07() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "argument1", "argument2", "argument3", "argument4", "argument5", "argument6" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertEquals("This is a test argument1 argument2 argument3 argument4 argument5 argument6", result.getFormattedMessage());
        assertNull(result.getThrowable());
    }

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and seven arguments.
    */
    @Test
    void testEvaluateArguments_08() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "argument1", "argument2", "argument3", "argument4", "argument5", "argument6", "argument7" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertEquals("This is a test argument1 argument2 argument3 argument4 argument5 argument6 argument7", result.getFormattedMessage());
        assertNull(result.getThrowable());
    }

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and eight arguments.
    */
    @Test
    void testEvaluateArguments_09() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "argument1", "argument2", "argument3", "argument4", "argument5", "argument6", "argument7", "argument8" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertEquals("This is a test argument1 argument2 argument3 argument4 argument5 argument6 argument7 argument8", result.getFormattedMessage());
        assertNull(result.getThrowable());
    }

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and nine arguments.
    */
    @Test
    void testEvaluateArguments_10() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "argument1", "argument2", "argument3", "argument4", "argument5", "argument6", "argument7", "argument8", "argument9" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertEquals("This is a test argument1 argument2 argument3 argument4 argument5 argument6 argument7 argument8 argument9", result.getFormattedMessage());
        assertNull(result.getThrowable());
    }

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and ten arguments.
    */
    @Test
    void testEvaluateArguments_11() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "argument1", "argument2", "argument3", "argument4", "argument5", "argument6", "argument7", "argument8", "argument9", "argument10" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertEquals("This is a test argument1 argument2 argument3 argument4 argument5 argument6 argument7 argument8 argument9 argument10", result.getFormattedMessage());
        assertNull(result.getThrowable());
    }

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and eleven arguments.
    */
    @Test
    void testEvaluateArguments_12() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "argument1", "argument2", "argument3", "argument4", "argument5", "argument6", "argument7", "argument8", "argument9", "argument10", "argument11" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertEquals("This is a test argument1 argument2 argument3 argument4 argument5 argument6 argument7 argument8 argument9 argument10 argument11", result.getFormattedMessage());
        assertNull(result.getThrowable());
    }

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and twelve arguments.
    */
    @Test
    void testEvaluateArguments_13() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "argument1", "argument2", "argument3", "argument4", "argument5", "argument6", "argument7", "argument8", "argument9", "argument10", "argument11", "argument12" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertEquals("This is a test argument1 argument2 argument3 argument4 argument5 argument6 argument7 argument8 argument9 argument10 argument11 argument12", result.getFormattedMessage());
        assertNull(result.getThrowable());
    }

    /**
    * Test case for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    * It tests the conversion of a message pattern with no placeholders and thirteen arguments.
    */
    @Test
    void testEvaluateArguments_1