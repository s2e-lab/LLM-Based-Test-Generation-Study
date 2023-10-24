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

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader(""));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile_1() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile_2() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile_3() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile_4() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile_5() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile_6() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile_7() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile_8() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile_9() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile_10() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot robot robot robot robot robot robot robot robot robot"));
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
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile_1() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile_2() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    /**
     * Test case for the {@link AtRobotCompiler#compile(Reader)} method.
     *
     * @throws IOException if there is a problem reading from the reader.
     */
    @Test
    void testCompile_3() throws IOException {
        final AtRobotCompiler compiler = new AtRobotCompiler();
        final AtRobotCompilerOutput output = compiler.compile(new StringReader("robot robot robot robot robot robot robot robot robot robot robot robot robot robot"));
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobot