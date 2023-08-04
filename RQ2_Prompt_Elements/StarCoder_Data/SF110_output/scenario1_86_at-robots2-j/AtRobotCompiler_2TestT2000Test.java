// AtRobotCompiler_2Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(Reader)} method.
*/
class AtRobotCompiler_2Test {

    @Test
    void testCompile_1() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader(""));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_2() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_3() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_4() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_5() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_6() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_7() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_8() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_9() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_10() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }
}

// AtRobotCompiler_3Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(Reader)} method.
*/
class AtRobotCompiler_3Test {
		
    @Test
    void testCompile_1() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_2() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_3() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_4() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_5() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_6() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_7() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_8() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_9() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_10() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }
}

// AtRobotCompiler_4Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(Reader)} method.
*/
class AtRobotCompiler_4Test {
		
    @Test
    void testCompile_1() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void testCompile_2() throws IOException {
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
       