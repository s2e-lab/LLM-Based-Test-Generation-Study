// AtRobotCompiler_1Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_1Test {

    /**
     * Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
     *
     * @throws IOException if there is a problem reading from the stream.
     */
    @Test
    void testCompile() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(getClass().getResourceAsStream("test1.txt"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }
}

// AtRobotCompiler_2Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_2Test {
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
     *
     * @throws IOException if there is a problem reading from the stream.
     */
    @Test
    void testCompile() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(getClass().getResourceAsStream("test2.txt"));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }
}

// AtRobotCompiler_3Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_3Test {
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
     *
     * @throws IOException if there is a problem reading from the stream.
     */
    @Test
    void testCompile() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(getClass().getResourceAsStream("test3.txt"));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }
}

// AtRobotCompiler_4Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_4Test {
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
     *
     * @throws IOException if there is a problem reading from the stream.
     */
    @Test
    void testCompile() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(getClass().getResourceAsStream("test4.txt"));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }
}

// AtRobotCompiler_5Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_5Test {
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
     *
     * @throws IOException if there is a problem reading from the stream.
     */
    @Test
    void testCompile() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(getClass().getResourceAsStream("test5.txt"));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }
}

// AtRobotCompiler_6Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_6Test {
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
     *
     * @throws IOException if there is a problem reading from the stream.
     */
    @Test
    void testCompile() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(getClass().getResourceAsStream("test6.txt"));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }
}

// AtRobotCompiler_7Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_7Test {
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
     *
     * @throws IOException if there is a problem reading from the stream.
     */
    @Test
    void testCompile() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(getClass().getResourceAsStream("test7.txt"));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }
}

// AtRobotCompiler_8Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_8Test {
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
     *
     * @throws IOException if there is a problem reading from the stream.
     */
    @Test
    void testCompile() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(getClass().getResourceAsStream("test8.txt"));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }
}

// AtRobotCompiler_9Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(InputStream)} method.
*/
class AtRobotCompiler_9Test {
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(InputStream)} method.
     *
     * @throws IOException if there is a problem reading from the stream.
     */
    @Test
    void testCompile() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(getClass().getResourceAsStream("test9.txt"));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }
}

// AtRobotCompiler_10Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter