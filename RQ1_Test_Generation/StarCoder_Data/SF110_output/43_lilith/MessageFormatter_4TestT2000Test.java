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
* It contains ten unit test cases for the {@link MessageFormatter#identityToString(Object)} method.
*/
class MessageFormatter_4Test {

    /**
    * Test method for {@link MessageFormatter#identityToString(Object)}.
    */
    @Test
    void testIdentityToString() {
        Object o = new Object();
        String result = MessageFormatter.identityToString(o);
        assertNotNull(result);
        assertTrue(result.startsWith(o.getClass().getName()));
        assertTrue(result.endsWith("@" + Integer.toHexString(System.identityHashCode(o))));
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
* It contains ten unit test cases for the {@link MessageFormatter#deepToString(Object)} method.
*/
class MessageFormatter_3Test {
		
    /**
    * Test method for {@link MessageFormatter#deepToString(Object)}.
    */
    @Test
    void testDeepToString() {
        Object o = new Object();
        String result = MessageFormatter.deepToString(o);
        assertNotNull(result);
        assertTrue(result.startsWith(o.getClass().getName()));
        assertTrue(result.endsWith("@" + Integer.toHexString(System.identityHashCode(o))));
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
* It contains ten unit test cases for the {@link MessageFormatter#evaluateArguments(String, Object[])} method.
*/
class MessageFormatter_2Test {
		
    /**
    * Test method for {@link MessageFormatter#evaluateArguments(String, Object[])}.
    */
    @Test
    void testEvaluateArguments() {
        String messagePattern = "test";
        Object[] arguments = new Object[] { "test" };
        MessageFormatter.ArgumentResult result = MessageFormatter.evaluateArguments(messagePattern, arguments);
        assertNotNull(result);
        assertEquals(1, result.getArguments().length);
        assertEquals("test", result.getArguments()[0]);
        assertNull(result.getThrowable());
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
    * Test method for {@link MessageFormatter#format(String, String[])}.
    */
    @Test
    void testFormat() {
        String messagePattern = "test";
        String[] arguments = new String[] { "test" };
        String result = MessageFormatter.format(messagePattern, arguments);
        assertNotNull(result);
        assertEquals("test", result);
    }
}

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
* It contains ten unit test cases for the {@link MessageFormatter#countArgumentPlaceholders(String)} method.
*/
class MessageFormatter_0Test {
		
    /**
    * Test method for {@link MessageFormatter#countArgumentPlaceholders(String)}.
    */
    @Test
    void testCountArgumentPlaceholders() {
        String messagePattern = "test";
        int result = MessageFormatter.countArgumentPlaceholders(messagePattern);
        assertEquals(0, result);
    }
}

// MessageFormatter.java
/*
 * Lilith - a log event viewer.
 * Copyright (C) 2007-2009 <NAME>
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 * 
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 * 
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * <p>Replacement for org.slf4j.helpers.MessageFormatter.</p>
 * <p>
 * In contrast to the mentioned class, the formatting of message pattern and arguments into the actual message
 * is split into three parts:
 * </p>
 * <ol>
 * <li>Counting of placeholders in the message pattern (cheap)</li>
 * <li>Conversion of argument array into an ArgumentResult, containing the arguments converted to String as well as
 * an optional Throwable if available (relatively cheap)</li>
 * <li>Replacement of placeholders in a message pattern with arguments given as String[]. (most expensive)</li>
 * </ol>
 * <p>
 * That way only the first two steps have to be done during event creation while the most expensive part, i.e. the
 * actual construction of the message, is only done on demand.
 * </p>
 */
public class MessageFormatter {

    private static final char DELIM_START = '{';

    private static final char DELIM_STOP = '}';

    private static final char ESCAPE_CHAR = '\\';

    public static final String RECURSION_PREFIX = "[...";

    public static final String RECURSION_SUFFIX = "...]";

    public static final String ERROR_PREFIX = "[!!!";

    public static final String ERROR_SEPARATOR = "=>";

    public static final String ERROR_MSG_SEPARATOR = ":";

    public static final String ERROR_SUFFIX = "!!!]";

    /**
     * Replace placeholders in the given messagePattern with arguments.
     *
     * @param messagePattern the message pattern containing placeholders.
     * @param arguments      the arguments to be used to replace placeholders.
     * @return the formatted message.
     */
    public static String format(String messagePattern, String[] arguments) {
        if (messagePattern == null || arguments == null || arguments.length == 0) {
            return messagePattern;
        }
        StringBuilder result = new StringBuilder();
        int escapeCounter = 0;
        int currentArgument = 0;
        for (int i = 0; i < messagePattern.length(); i++) {
            char curChar = messagePattern.charAt(i);
            if (curChar == ESCAPE_CHAR) {
                escapeCounter++;
            } else {
                if (curChar == DELIM_START) {
                    if (i < messagePattern.length() - 1) {
                        if (messagePattern.charAt(i + 1) == DELIM_STOP) {
                            // write escaped escape chars
                            int escapedEscapes = escapeCounter / 2;
                            for (int j = 0; j < escapedEscapes; j++) {
                                result.append(ESCAPE_CHAR);
                            }
                            if (escapeCounter % 2 == 1) {
                                // i.e. escaped
                                // write escaped escape chars
                                result.append(DELIM_START);
                                result.append(DELIM_STOP);
                            } else {
                                // unescaped
                                if (currentArgument < arguments.length) {
                                    result.append(arguments[