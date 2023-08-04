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

    @Test
    void test_compile_1() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test1.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void test_compile_2() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test2.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_3() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test3.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_4() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test4.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_5() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test5.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_6() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test6.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_7() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test7.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_8() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test8.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_9() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test9.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_10() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test10.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
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
		
    @Test
    void test_compile_1() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test1.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

    @Test
    void test_compile_2() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test2.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_3() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test3.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_4() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test4.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_5() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test5.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_6() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test6.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_7() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test7.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_8() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test8.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_9() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test9.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
    }

    @Test
    void test_compile_10() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test10.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
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
		
    @Test
    void test_compile_1() throws IOException {
        final InputStream in = getClass().getResourceAsStream("test1.txt");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
        assertEquals(1, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(0, output.getRobots().size());
    }

   