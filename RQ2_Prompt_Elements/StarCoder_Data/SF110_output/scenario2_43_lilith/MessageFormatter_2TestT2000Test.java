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
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArguments() {
        String messagePattern = "Message with {} and {}";
        Object[] arguments = new Object[] { "one", "two" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] stringArgs = result.getArguments();
        assertEquals(2, stringArgs.length);
        assertEquals("one", stringArgs[0]);
        assertEquals("two", stringArgs[1]);
        assertNull(result.getThrowable());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowable() {
        String messagePattern = "Message with {} and {}";
        Object[] arguments = new Object[] { "one", "two", new IllegalArgumentException("Illegal argument") };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] stringArgs = result.getArguments();
        assertEquals(2, stringArgs.length);
        assertEquals("one", stringArgs[0]);
        assertEquals("two", stringArgs[1]);
        assertNotNull(result.getThrowable());
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgument() {
        String messagePattern = "Message with {} and {}";
        Object[] arguments = new Object[] { "one", "two", new IllegalArgumentException("Illegal argument"), "three" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] stringArgs = result.getArguments();
        assertEquals(2, stringArgs.length);
        assertEquals("one", stringArgs[0]);
        assertEquals("two", stringArgs[1]);
        assertNotNull(result.getThrowable());
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgument2() {
        String messagePattern = "Message with {} and {}";
        Object[] arguments = new Object[] { "one", "two", new IllegalArgumentException("Illegal argument"), "three", "four" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] stringArgs = result.getArguments();
        assertEquals(2, stringArgs.length);
        assertEquals("one", stringArgs[0]);
        assertEquals("two", stringArgs[1]);
        assertNotNull(result.getThrowable());
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgument3() {
        String messagePattern = "Message with {} and {}";
        Object[] arguments = new Object[] { "one", "two", new IllegalArgumentException("Illegal argument"), "three", "four", "five" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] stringArgs = result.getArguments();
        assertEquals(2, stringArgs.length);
        assertEquals("one", stringArgs[0]);
        assertEquals("two", stringArgs[1]);
        assertNotNull(result.getThrowable());
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgument4() {
        String messagePattern = "Message with {} and {}";
        Object[] arguments = new Object[] { "one", "two", new IllegalArgumentException("Illegal argument"), "three", "four", "five", "six" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] stringArgs = result.getArguments();
        assertEquals(2, stringArgs.length);
        assertEquals("one", stringArgs[0]);
        assertEquals("two", stringArgs[1]);
        assertNotNull(result.getThrowable());
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgument5() {
        String messagePattern = "Message with {} and {}";
        Object[] arguments = new Object[] { "one", "two", new IllegalArgumentException("Illegal argument"), "three", "four", "five", "six", "seven" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] stringArgs = result.getArguments();
        assertEquals(2, stringArgs.length);
        assertEquals("one", stringArgs[0]);
        assertEquals("two", stringArgs[1]);
        assertNotNull(result.getThrowable());
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgument6() {
        String messagePattern = "Message with {} and {}";
        Object[] arguments = new Object[] { "one", "two", new IllegalArgumentException("Illegal argument"), "three", "four", "five", "six", "seven", "eight" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] stringArgs = result.getArguments();
        assertEquals(2, stringArgs.length);
        assertEquals("one", stringArgs[0]);
        assertEquals("two", stringArgs[1]);
        assertNotNull(result.getThrowable());
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgument7() {
        String messagePattern = "Message with {} and {}";
        Object[] arguments = new Object[] { "one", "two", new IllegalArgumentException("Illegal argument"), "three", "four", "five", "six", "seven", "eight", "nine" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] stringArgs = result.getArguments();
        assertEquals(2, stringArgs.length);
        assertEquals("one", stringArgs[0]);
        assertEquals("two", stringArgs[1]);
        assertNotNull(result.getThrowable());
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgument8() {
        String messagePattern = "Message with {} and {}";
        Object[] arguments = new Object[] { "one", "two", new IllegalArgumentException("Illegal argument"), "three", "four", "five", "six", "seven", "eight", "nine", "ten" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] stringArgs = result.getArguments();
        assertEquals(2, stringArgs.length);
        assertEquals("one", stringArgs[0]);
        assertEquals("two", stringArgs[1]);
        assertNotNull(result.getThrowable());
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgument9() {
        String messagePattern = "Message with {} and {}";
        Object[] arguments = new Object[] { "one", "two", new IllegalArgumentException("Illegal argument"), "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] stringArgs = result.getArguments();
        assertEquals(2, stringArgs.length);
        assertEquals("one", stringArgs[0]);
        assertEquals("two", stringArgs[1]);
        assertNotNull(result.getThrowable());
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgument10() {
        String messagePattern = "Message with {} and {}";
        Object[] arguments = new Object[] { "one", "two", new IllegalArgumentException("Illegal argument"), "three", "four", "five", "six", "seven", "eight", "nine", "ten", "eleven", "twelve" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] stringArgs = result.getArguments();
        assertEquals(2, stringArgs.length);
        assertEquals("one", stringArgs[0