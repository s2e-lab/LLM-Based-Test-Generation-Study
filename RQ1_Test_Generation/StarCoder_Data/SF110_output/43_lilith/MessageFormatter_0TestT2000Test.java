// MessageFormatter_0Test.java
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
* It contains ten unit test cases for the {@link MessageFormatter#format(String, String[])} method.
*/
class MessageFormatter_0Test {

    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat() {
        String messagePattern = "This is a test";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_0() {
        String messagePattern = "This is a test {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_1() {
        String messagePattern = "This is a test {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_2() {
        String messagePattern = "This is a test {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_3() {
        String messagePattern = "This is a test {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_4() {
        String messagePattern = "This is a test {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {} {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_5() {
        String messagePattern = "This is a test {} {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {} {} {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_6() {
        String messagePattern = "This is a test {} {} {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {} {} {} {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_7() {
        String messagePattern = "This is a test {} {} {} {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {} {} {} {} {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_8() {
        String messagePattern = "This is a test {} {} {} {} {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {} {} {} {} {} {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_9() {
        String messagePattern = "This is a test {} {} {} {} {} {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {} {} {} {} {} {} {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_10() {
        String messagePattern = "This is a test {} {} {} {} {} {} {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {} {} {} {} {} {} {} {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_11() {
        String messagePattern = "This is a test {} {} {} {} {} {} {} {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {} {} {} {} {} {} {} {} {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_12() {
        String messagePattern = "This is a test {} {} {} {} {} {} {} {} {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {} {} {} {} {} {} {} {} {} {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_13() {
        String messagePattern = "This is a test {} {} {} {} {} {} {} {} {} {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {} {} {} {} {} {} {} {} {} {} {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_14() {
        String messagePattern = "This is a test {} {} {} {} {} {} {} {} {} {} {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {} {} {} {} {} {} {} {} {} {} {} {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_15() {
        String messagePattern = "This is a test {} {} {} {} {} {} {} {} {} {} {} {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {} {} {} {} {} {} {} {} {} {} {} {} {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_16() {
        String messagePattern = "This is a test {} {} {} {} {} {} {} {} {} {} {} {} {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a test one two three {} {} {} {} {} {} {} {} {} {} {} {} {} {}", result);
    }
		
    /**
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat_17() {
        String messagePattern = "This is a test {} {} {} {} {} {} {} {} {} {} {} {} {} {} {} {} {} {}";
        String[] arguments = new String[] { "one", "two", "three" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertEquals("This is a