// AtRobotCompiler_0Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompiler_0Test {

    /**
     * Test case for the {@link AtRobotCompiler#compile(File)} method.
     *
     * @throws IOException if there is a problem reading from the file.
     */
    @Test
    void testCompile() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_0.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final AtRobotCompilerOutput.Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_0", robot.getName());
        assertEquals(1, robot.getInstructions().size());
        final AtRobotCompilerOutput.Instruction instruction = robot.getInstructions().get(0);
        assertEquals("move", instruction.getCommand());
        assertEquals(1, instruction.getArguments().size());
        assertEquals("1", instruction.getArguments().get(0));
    }
}

// AtRobotCompiler_1Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompiler_1Test {
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(File)} method.
     *
     * @throws IOException if there is a problem reading from the file.
     */
    @Test
    void testCompile() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_1.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final AtRobotCompilerOutput.Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_1", robot.getName());
        assertEquals(1, robot.getInstructions().size());
        final AtRobotCompilerOutput.Instruction instruction = robot.getInstructions().get(0);
        assertEquals("move", instruction.getCommand());
        assertEquals(1, instruction.getArguments().size());
        assertEquals("1", instruction.getArguments().get(0));
    }
}

// AtRobotCompiler_2Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompiler_2Test {
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(File)} method.
     *
     * @throws IOException if there is a problem reading from the file.
     */
    @Test
    void testCompile() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_2.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final AtRobotCompilerOutput.Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_2", robot.getName());
        assertEquals(1, robot.getInstructions().size());
        final AtRobotCompilerOutput.Instruction instruction = robot.getInstructions().get(0);
        assertEquals("move", instruction.getCommand());
        assertEquals(1, instruction.getArguments().size());
        assertEquals("1", instruction.getArguments().get(0));
    }
}

// AtRobotCompiler_3Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompiler_3Test {
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(File)} method.
     *
     * @throws IOException if there is a problem reading from the file.
     */
    @Test
    void testCompile() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_3.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final AtRobotCompilerOutput.Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_3", robot.getName());
        assertEquals(1, robot.getInstructions().size());
        final AtRobotCompilerOutput.Instruction instruction = robot.getInstructions().get(0);
        assertEquals("move", instruction.getCommand());
        assertEquals(1, instruction.getArguments().size());
        assertEquals("1", instruction.getArguments().get(0));
    }
}

// AtRobotCompiler_4Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompiler_4Test {
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(File)} method.
     *
     * @throws IOException if there is a problem reading from the file.
     */
    @Test
    void testCompile() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_4.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final AtRobotCompilerOutput.Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_4", robot.getName());
        assertEquals(1, robot.getInstructions().size());
        final AtRobotCompilerOutput.Instruction instruction = robot.getInstructions().get(0);
        assertEquals("move", instruction.getCommand());
        assertEquals(1, instruction.getArguments().size());
        assertEquals("1", instruction.getArguments().get(0));
    }
}

// AtRobotCompiler_5Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(File)} method.
*/
class AtRobotCompiler_5Test {
		
    /**
     * Test case for the {@link AtRobotCompiler#compile(File)} method.
     *
     * @throws IOException if there is a problem reading from the file.
     */
    @Test
    void testCompile() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_5.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final AtRobotCompilerOutput.Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_5", robot.getName());
        assertEquals(1, robot.getInstructions().size());
        final AtRobotCompilerOutput.Instruction instruction = robot.getInstructions().get(0);
        assertEquals("move", instruction.getCommand());
        assertEquals(1, instruction.getArguments().size());
        assertEquals("1", instruction.getArguments().get(0));
    }
}

//