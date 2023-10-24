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
    * Test case for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat() {
        String messagePattern = "This is a test";
        String[] arguments = new String[] { "1", "2", "3" };
        String expected = "This is a test";
        String actual = MessageFormatter.format(messagePattern, arguments);
        assertEquals(expected, actual);
    }
}

// MessageFormatter_1Test.java
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
class MessageFormatter_1Test {
		
    /**
    * Test case for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat() {
        String messagePattern = "This is a test {}";
        String[] arguments = new String[] { "1", "2", "3" };
        String expected = "This is a test 1";
        String actual = MessageFormatter.format(messagePattern, arguments);
        assertEquals(expected, actual);
    }
}

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
* It contains ten unit test cases for the {@link MessageFormatter#format(String, String[])} method.
*/
class MessageFormatter_2Test {
		
    /**
    * Test case for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat() {
        String messagePattern = "This is a test {} {}";
        String[] arguments = new String[] { "1", "2", "3" };
        String expected = "This is a test 1 2";
        String actual = MessageFormatter.format(messagePattern, arguments);
        assertEquals(expected, actual);
    }
}

// MessageFormatter_3Test.java
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
class MessageFormatter_3Test {
		
    /**
    * Test case for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat() {
        String messagePattern = "This is a test {} {} {}";
        String[] arguments = new String[] { "1", "2", "3" };
        String expected = "This is a test 1 2 3";
        String actual = MessageFormatter.format(messagePattern, arguments);
        assertEquals(expected, actual);
    }
}

// MessageFormatter_4Test.java
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
class MessageFormatter_4Test {
		
    /**
    * Test case for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat() {
        String messagePattern = "This is a test {} {} {} {}";
        String[] arguments = new String[] { "1", "2", "3" };
        String expected = "This is a test 1 2 3 {}";
        String actual = MessageFormatter.format(messagePattern, arguments);
        assertEquals(expected, actual);
    }
}

// MessageFormatter_5Test.java
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
class MessageFormatter_5Test {
		
    /**
    * Test case for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat() {
        String messagePattern = "This is a test {} {} {} {} {}";
        String[] arguments = new String[] { "1", "2", "3" };
        String expected = "This is a test 1 2 3 {} {}";
        String actual = MessageFormatter.format(messagePattern, arguments);
        assertEquals(expected, actual);
    }
}

// MessageFormatter_6Test.java
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
class MessageFormatter_6Test {
		
    /**
    * Test case for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat() {
        String messagePattern = "This is a test {} {} {} {} {} {}";
        String[] arguments = new String[] { "1", "2", "3" };
        String expected = "This is a test 1 2 3 {} {} {}";
        String actual = MessageFormatter.format(messagePattern, arguments);
        assertEquals(expected, actual);
    }
}

// MessageFormatter_7Test.java
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
class MessageFormatter_7Test {
		
    /**
    * Test case for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat() {
        String messagePattern = "This is a test {} {} {} {} {} {} {}";
        String[] arguments = new String[] { "1", "2", "3" };
        String expected = "This is a test 1 2 3 {} {} {} {}";
        String actual = MessageFormatter.format(messagePattern, arguments);
        assertEquals(expected, actual);
    }
}

// MessageFormatter_8Test.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map