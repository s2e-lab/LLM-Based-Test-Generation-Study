// JCLO_1Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#usage()} method.
*/
class JCLO_1Test {

    /**
    * Test case for the {@link JCLO#usage()} method.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void testUsage() throws Exception {
        JCLO jclo = new JCLO();
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(1, lines.length);
        assertEquals("-a,--additional <arg>   Additional argument\n", lines[0]);
    }
}

// JCLO_2Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#usage()} method.
*/
class JCLO_2Test {
		
    /**
    * Test case for the {@link JCLO#usage()} method.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void testUsage() throws Exception {
        JCLO jclo = new JCLO();
        jclo.setPrefix("test");
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(1, lines.length);
        assertEquals("-a,--additional <arg>   Additional argument\n", lines[0]);
    }
}

// JCLO_3Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#usage()} method.
*/
class JCLO_3Test {
		
    /**
    * Test case for the {@link JCLO#usage()} method.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void testUsage() throws Exception {
        JCLO jclo = new JCLO();
        jclo.setPrefix("test");
        jclo.setDoubleDashes(true);
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(1, lines.length);
        assertEquals("--additional <arg>   Additional argument\n", lines[0]);
    }
}

// JCLO_4Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#usage()} method.
*/
class JCLO_4Test {
		
    /**
    * Test case for the {@link JCLO#usage()} method.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void testUsage() throws Exception {
        JCLO jclo = new JCLO();
        jclo.setPrefix("test");
        jclo.setDoubleDashes(true);
        jclo.setAdditional(true);
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(2, lines.length);
        assertEquals("--additional <arg>   Additional argument\n", lines[0]);
        assertEquals("--test-additional <arg>   Additional argument\n", lines[1]);
    }
}

// JCLO_5Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#usage()} method.
*/
class JCLO_5Test {
		
    /**
    * Test case for the {@link JCLO#usage()} method.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void testUsage() throws Exception {
        JCLO jclo = new JCLO();
        jclo.setPrefix("test");
        jclo.setDoubleDashes(true);
        jclo.setAdditional(true);
        jclo.setAdditionalName("test-additional");
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(2, lines.length);
        assertEquals("--additional <arg>   Additional argument\n", lines[0]);
        assertEquals("--test-additional <arg>   Additional argument\n", lines[1]);
    }
}

// JCLO_6Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#usage()} method.
*/
class JCLO_6Test {
		
    /**
    * Test case for the {@link JCLO#usage()} method.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void testUsage() throws Exception {
        JCLO jclo = new JCLO();
        jclo.setPrefix("test");
        jclo.setDoubleDashes(true);
        jclo.setAdditional(true);
        jclo.setAdditionalName("test-additional");
        jclo.setAdditionalType(String.class);
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(2, lines.length);
        assertEquals("--additional <arg>   Additional argument\n", lines[0]);
        assertEquals("--test-additional <arg>   Additional argument\n", lines[1]);
    }
}

// JCLO_7Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#usage()} method.
*/
class JCLO_7Test {
		
    /**
    * Test case for the {@link JCLO#usage()} method.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void testUsage() throws Exception {
        JCLO jclo = new JCLO();
        jclo.setPrefix("test");
        jclo.setDoubleDashes(true);
        jclo.setAdditional(true);
        jclo.setAdditionalName("test-additional");
        jclo.setAdditionalType(String.class);
        jclo.setAdditionalDescription("Additional argument");
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(2, lines.length);
        assertEquals("--additional <arg>   Additional argument\n", lines[0]);
        assertEquals("--test-additional <arg>   Additional argument\n", lines[1]);
    }
}

// JCLO_8Test.java
package edu.mscd.cs.jclo;

import java.lang.reflect.Field;
import java.lang.reflect.Array;
import java.lang.reflect.Modifier;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JCLO}.
* It contains ten unit test cases for the {@link JCLO#usage()} method.
*/
class JCLO_8Test {
		
    /**
    * Test case for the {@link JCLO#usage()} method.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void testUsage() throws Exception {
        JCLO jclo = new JCLO();
        jclo.setPrefix("test");
        jclo.setDoubleDashes(true);
        jclo.setAdditional(true);
        jclo.setAdditionalName("test-additional");
        jclo.setAdditionalType(String.class);
        jclo.setAdditionalDescription("Additional argument");
        jclo.setAdditionalRequired(true);
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(2,