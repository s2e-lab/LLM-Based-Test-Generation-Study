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

    @Test
    void testUsage() {
        JCLO jclo = new JCLO();
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(10, lines.length);
        assertEquals("-a,--additional <arg>", lines[0]);
        assertEquals("-b,--boolean", lines[1]);
        assertEquals("-c,--char", lines[2]);
        assertEquals("-d,--double", lines[3]);
        assertEquals("-e,--enum <arg>", lines[4]);
        assertEquals("-f,--float", lines[5]);
        assertEquals("-i,--int", lines[6]);
        assertEquals("-l,--long", lines[7]);
        assertEquals("-s,--string <arg>", lines[8]);
        assertEquals("-t,--type <arg>", lines[9]);
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
		
    @Test
    void testUsage() {
        JCLO jclo = new JCLO();
        jclo.setPrefix("a");
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(10, lines.length);
        assertEquals("-a,--additional <arg>", lines[0]);
        assertEquals("-a,--boolean", lines[1]);
        assertEquals("-a,--char", lines[2]);
        assertEquals("-a,--double", lines[3]);
        assertEquals("-a,--enum <arg>", lines[4]);
        assertEquals("-a,--float", lines[5]);
        assertEquals("-a,--int", lines[6]);
        assertEquals("-a,--long", lines[7]);
        assertEquals("-a,--string <arg>", lines[8]);
        assertEquals("-a,--type <arg>", lines[9]);
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
		
    @Test
    void testUsage() {
        JCLO jclo = new JCLO();
        jclo.setPrefix("a");
        jclo.setDoubleDashes(true);
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(10, lines.length);
        assertEquals("--additional <arg>", lines[0]);
        assertEquals("--boolean", lines[1]);
        assertEquals("--char", lines[2]);
        assertEquals("--double", lines[3]);
        assertEquals("--enum <arg>", lines[4]);
        assertEquals("--float", lines[5]);
        assertEquals("--int", lines[6]);
        assertEquals("--long", lines[7]);
        assertEquals("--string <arg>", lines[8]);
        assertEquals("--type <arg>", lines[9]);
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
		
    @Test
    void testUsage() {
        JCLO jclo = new JCLO();
        jclo.setPrefix("a");
        jclo.setDoubleDashes(true);
        jclo.setAdditional(true);
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(11, lines.length);
        assertEquals("--additional <arg>", lines[0]);
        assertEquals("--boolean", lines[1]);
        assertEquals("--char", lines[2]);
        assertEquals("--double", lines[3]);
        assertEquals("--enum <arg>", lines[4]);
        assertEquals("--float", lines[5]);
        assertEquals("--int", lines[6]);
        assertEquals("--long", lines[7]);
        assertEquals("--string <arg>", lines[8]);
        assertEquals("--type <arg>", lines[9]);
        assertEquals("--", lines[10]);
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
		
    @Test
    void testUsage() {
        JCLO jclo = new JCLO();
        jclo.setPrefix("a");
        jclo.setDoubleDashes(true);
        jclo.setAdditional(true);
        jclo.setAdditionalName("additional");
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(11, lines.length);
        assertEquals("--additional <arg>", lines[0]);
        assertEquals("--boolean", lines[1]);
        assertEquals("--char", lines[2]);
        assertEquals("--double", lines[3]);
        assertEquals("--enum <arg>", lines[4]);
        assertEquals("--float", lines[5]);
        assertEquals("--int", lines[6]);
        assertEquals("--long", lines[7]);
        assertEquals("--string <arg>", lines[8]);
        assertEquals("--type <arg>", lines[9]);
        assertEquals("--", lines[10]);
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
		
    @Test
    void testUsage() {
        JCLO jclo = new JCLO();
        jclo.setPrefix("a");
        jclo.setDoubleDashes(true);
        jclo.setAdditional(true);
        jclo.setAdditionalName("additional");
        jclo.setAdditionalType(String.class);
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(11, lines.length);
        assertEquals("--additional <arg>", lines[0]);
        assertEquals("--boolean", lines[1]);
        assertEquals("--char", lines[2]);
        assertEquals("--double", lines[3]);
        assertEquals("--enum <arg>", lines[4]);
        assertEquals("--float", lines[5]);
        assertEquals("--int", lines[6]);
        assertEquals("--long", lines[7]);
        assertEquals("--string <arg>", lines[8]);
        assertEquals("--type <arg>", lines[9]);
        assertEquals("--", lines[10]);
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
		
    @Test
    void testUsage() {
        JCLO jclo = new JCLO();
        jclo.setPrefix("a");
        jclo.setDoubleDashes(true);
        jclo.setAdditional(true);
        jclo.setAdditionalName("additional");
        jclo.setAdditionalType(String.class);
        jclo.setAdditionalValue("default");
        String usage = jclo.usage();
        String[] lines = usage.split("\n");
        assertEquals(11, lines.length);
        assertEquals("--additional <arg>", lines[0]);
        assertEquals("--boolean", lines[1]);
        assertEquals("--char", lines[2]);
        assertEquals("--double", lines[3]);
        assertEquals("--enum <