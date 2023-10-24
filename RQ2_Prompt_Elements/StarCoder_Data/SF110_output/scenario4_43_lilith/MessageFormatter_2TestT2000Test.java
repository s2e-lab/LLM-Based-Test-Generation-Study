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
        String messagePattern = "Message with {} placeholders";
        Object[] arguments = new Object[] { "one", "two", "three" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] formattedArguments = result.getArguments();
        assertEquals(3, formattedArguments.length);
        assertEquals("one", formattedArguments[0]);
        assertEquals("two", formattedArguments[1]);
        assertEquals("three", formattedArguments[2]);
        assertNull(result.getThrowable());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowable() {
        String messagePattern = "Message with {} placeholders";
        Object[] arguments = new Object[] { "one", "two", "three", new IllegalArgumentException("Illegal argument") };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] formattedArguments = result.getArguments();
        assertEquals(3, formattedArguments.length);
        assertEquals("one", formattedArguments[0]);
        assertEquals("two", formattedArguments[1]);
        assertEquals("three", formattedArguments[2]);
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgument() {
        String messagePattern = "Message with {} placeholders";
        Object[] arguments = new Object[] { "one", "two", "three", new IllegalArgumentException("Illegal argument"), "four" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] formattedArguments = result.getArguments();
        assertEquals(3, formattedArguments.length);
        assertEquals("one", formattedArguments[0]);
        assertEquals("two", formattedArguments[1]);
        assertEquals("three", formattedArguments[2]);
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgumentAtEnd() {
        String messagePattern = "Message with {} placeholders";
        Object[] arguments = new Object[] { "one", "two", "three", "four", new IllegalArgumentException("Illegal argument") };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] formattedArguments = result.getArguments();
        assertEquals(3, formattedArguments.length);
        assertEquals("one", formattedArguments[0]);
        assertEquals("two", formattedArguments[1]);
        assertEquals("three", formattedArguments[2]);
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgumentAtStart() {
        String messagePattern = "Message with {} placeholders";
        Object[] arguments = new Object[] { new IllegalArgumentException("Illegal argument"), "one", "two", "three" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] formattedArguments = result.getArguments();
        assertEquals(3, formattedArguments.length);
        assertEquals("one", formattedArguments[0]);
        assertEquals("two", formattedArguments[1]);
        assertEquals("three", formattedArguments[2]);
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgumentAtStartAndEnd() {
        String messagePattern = "Message with {} placeholders";
        Object[] arguments = new Object[] { new IllegalArgumentException("Illegal argument"), "one", "two", "three", "four" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] formattedArguments = result.getArguments();
        assertEquals(3, formattedArguments.length);
        assertEquals("one", formattedArguments[0]);
        assertEquals("two", formattedArguments[1]);
        assertEquals("three", formattedArguments[2]);
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgumentInMiddle() {
        String messagePattern = "Message with {} placeholders";
        Object[] arguments = new Object[] { "one", new IllegalArgumentException("Illegal argument"), "two", "three" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] formattedArguments = result.getArguments();
        assertEquals(3, formattedArguments.length);
        assertEquals("one", formattedArguments[0]);
        assertEquals("two", formattedArguments[1]);
        assertEquals("three", formattedArguments[2]);
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgumentInMiddleAndEnd() {
        String messagePattern = "Message with {} placeholders";
        Object[] arguments = new Object[] { "one", new IllegalArgumentException("Illegal argument"), "two", "three", "four" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] formattedArguments = result.getArguments();
        assertEquals(3, formattedArguments.length);
        assertEquals("one", formattedArguments[0]);
        assertEquals("two", formattedArguments[1]);
        assertEquals("three", formattedArguments[2]);
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgumentInMiddleAndStart() {
        String messagePattern = "Message with {} placeholders";
        Object[] arguments = new Object[] { "one", "two", new IllegalArgumentException("Illegal argument"), "three" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] formattedArguments = result.getArguments();
        assertEquals(3, formattedArguments.length);
        assertEquals("one", formattedArguments[0]);
        assertEquals("two", formattedArguments[1]);
        assertEquals("three", formattedArguments[2]);
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgumentInMiddleAndStartAndEnd() {
        String messagePattern = "Message with {} placeholders";
        Object[] arguments = new Object[] { "one", "two", new IllegalArgumentException("Illegal argument"), "three", "four" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] formattedArguments = result.getArguments();
        assertEquals(3, formattedArguments.length);
        assertEquals("one", formattedArguments[0]);
        assertEquals("two", formattedArguments[1]);
        assertEquals("three", formattedArguments[2]);
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgumentAtStartAndMiddleAndEnd() {
        String messagePattern = "Message with {} placeholders";
        Object[] arguments = new Object[] { new IllegalArgumentException("Illegal argument"), "one", "two", "three", "four" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] formattedArguments = result.getArguments();
        assertEquals(3, formattedArguments.length);
        assertEquals("one", formattedArguments[0]);
        assertEquals("two", formattedArguments[1]);
        assertEquals("three", formattedArguments[2]);
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndUnusedArgumentAtStartAndMiddleAndEndAndUnusedArgumentAtStart() {
        String messagePattern = "Message with {} placeholders";
        Object[] arguments = new Object[] { new IllegalArgumentException("Illegal argument"), "one", "two", "three", "four", "five" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        String[] formattedArguments = result.getArguments();
        assertEquals(3, formattedArguments.length);
        assertEquals("one", formattedArguments[0]);
        assertEquals("two", formattedArguments[1]);
        assertEquals("three", formattedArguments[2]);
        assertEquals("java.lang.IllegalArgumentException: Illegal argument", result.getThrowable().toString());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void test