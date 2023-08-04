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
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "a", "b", "c" };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertNotNull(result);
        assertEquals(arguments.length, result.getArguments().length);
        for (int i = 0; i < arguments.length; i++) {
            assertEquals(arguments[i].toString(), result.getArguments()[i]);
        }
        assertNull(result.getThrowable());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowable() {
        String messagePattern = "This is a test";
        Object[] arguments = new Object[] { "a", "b", "c", new IllegalArgumentException("test") };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertNotNull(result);
        assertEquals(arguments.length - 1, result.getArguments().length);
        for (int i = 0; i < arguments.length - 1; i++) {
            assertEquals(arguments[i].toString(), result.getArguments()[i]);
        }
        assertNotNull(result.getThrowable());
        assertEquals(IllegalArgumentException.class, result.getThrowable().getClass());
        assertEquals("test", result.getThrowable().getMessage());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndPlaceholder() {
        String messagePattern = "This is a test {}";
        Object[] arguments = new Object[] { "a", "b", "c", new IllegalArgumentException("test") };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertNotNull(result);
        assertEquals(arguments.length, result.getArguments().length);
        for (int i = 0; i < arguments.length; i++) {
            assertEquals(arguments[i].toString(), result.getArguments()[i]);
        }
        assertNotNull(result.getThrowable());
        assertEquals(IllegalArgumentException.class, result.getThrowable().getClass());
        assertEquals("test", result.getThrowable().getMessage());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndPlaceholderAndEscapedPlaceholder() {
        String messagePattern = "This is a test \\{}";
        Object[] arguments = new Object[] { "a", "b", "c", new IllegalArgumentException("test") };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertNotNull(result);
        assertEquals(arguments.length, result.getArguments().length);
        for (int i = 0; i < arguments.length; i++) {
            assertEquals(arguments[i].toString(), result.getArguments()[i]);
        }
        assertNotNull(result.getThrowable());
        assertEquals(IllegalArgumentException.class, result.getThrowable().getClass());
        assertEquals("test", result.getThrowable().getMessage());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndPlaceholderAndEscapedEscape() {
        String messagePattern = "This is a test \\\\{}";
        Object[] arguments = new Object[] { "a", "b", "c", new IllegalArgumentException("test") };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertNotNull(result);
        assertEquals(arguments.length, result.getArguments().length);
        for (int i = 0; i < arguments.length; i++) {
            assertEquals(arguments[i].toString(), result.getArguments()[i]);
        }
        assertNotNull(result.getThrowable());
        assertEquals(IllegalArgumentException.class, result.getThrowable().getClass());
        assertEquals("test", result.getThrowable().getMessage());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndPlaceholderAndEscapedEscapeAndPlaceholder() {
        String messagePattern = "This is a test \\\\{} {}";
        Object[] arguments = new Object[] { "a", "b", "c", new IllegalArgumentException("test") };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertNotNull(result);
        assertEquals(arguments.length, result.getArguments().length);
        for (int i = 0; i < arguments.length; i++) {
            assertEquals(arguments[i].toString(), result.getArguments()[i]);
        }
        assertNotNull(result.getThrowable());
        assertEquals(IllegalArgumentException.class, result.getThrowable().getClass());
        assertEquals("test", result.getThrowable().getMessage());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndPlaceholderAndEscapedEscapeAndPlaceholderAndEscapedPlaceholder() {
        String messagePattern = "This is a test \\\\{} \\{}";
        Object[] arguments = new Object[] { "a", "b", "c", new IllegalArgumentException("test") };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertNotNull(result);
        assertEquals(arguments.length, result.getArguments().length);
        for (int i = 0; i < arguments.length; i++) {
            assertEquals(arguments[i].toString(), result.getArguments()[i]);
        }
        assertNotNull(result.getThrowable());
        assertEquals(IllegalArgumentException.class, result.getThrowable().getClass());
        assertEquals("test", result.getThrowable().getMessage());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndPlaceholderAndEscapedEscapeAndPlaceholderAndEscapedEscape() {
        String messagePattern = "This is a test \\\\{} \\\\{}";
        Object[] arguments = new Object[] { "a", "b", "c", new IllegalArgumentException("test") };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertNotNull(result);
        assertEquals(arguments.length, result.getArguments().length);
        for (int i = 0; i < arguments.length; i++) {
            assertEquals(arguments[i].toString(), result.getArguments()[i]);
        }
        assertNotNull(result.getThrowable());
        assertEquals(IllegalArgumentException.class, result.getThrowable().getClass());
        assertEquals("test", result.getThrowable().getMessage());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndPlaceholderAndEscapedEscapeAndPlaceholderAndEscapedEscapeAndPlaceholder() {
        String messagePattern = "This is a test \\\\{} \\\\{} {}";
        Object[] arguments = new Object[] { "a", "b", "c", new IllegalArgumentException("test") };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertNotNull(result);
        assertEquals(arguments.length, result.getArguments().length);
        for (int i = 0; i < arguments.length; i++) {
            assertEquals(arguments[i].toString(), result.getArguments()[i]);
        }
        assertNotNull(result.getThrowable());
        assertEquals(IllegalArgumentException.class, result.getThrowable().getClass());
        assertEquals("test", result.getThrowable().getMessage());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndPlaceholderAndEscapedEscapeAndPlaceholderAndEscapedEscapeAndPlaceholderAndEscapedPlaceholder() {
        String messagePattern = "This is a test \\\\{} \\\\{} \\{}";
        Object[] arguments = new Object[] { "a", "b", "c", new IllegalArgumentException("test") };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertNotNull(result);
        assertEquals(arguments.length, result.getArguments().length);
        for (int i = 0; i < arguments.length; i++) {
            assertEquals(arguments[i].toString(), result.getArguments()[i]);
        }
        assertNotNull(result.getThrowable());
        assertEquals(IllegalArgumentException.class, result.getThrowable().getClass());
        assertEquals("test", result.getThrowable().getMessage());
    }

    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArgumentsWithThrowableAndPlaceholderAndEscapedEscapeAndPlaceholderAndEscapedEscapeAndPlaceholderAndEscapedEscape() {
        String messagePattern = "This is a test \\\\{} \\\\{} \\\\{}";
        Object[] arguments = new Object[] { "a", "b", "c", new IllegalArgumentException("test") };
        ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertNotNull(result);
        assertEquals(arguments.length, result.getArguments().length);
        for (int i = 0; i < arguments.length; i++) {
            assertEquals(arguments