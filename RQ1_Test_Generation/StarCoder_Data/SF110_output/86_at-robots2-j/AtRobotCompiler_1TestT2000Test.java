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
        final InputStream in = getClass().getResourceAsStream("AtRobotCompiler_1Test.txt");
        try {
            final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
            assertEquals(1, output.getErrors().size());
            assertEquals(0, output.getWarnings().size());
            assertEquals(0, output.getRobots().size());
        } finally {
            in.close();
        }
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
        final InputStream in = getClass().getResourceAsStream("AtRobotCompiler_2Test.txt");
        try {
            final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
            assertEquals(0, output.getErrors().size());
            assertEquals(0, output.getWarnings().size());
            assertEquals(1, output.getRobots().size());
            final AtRobotCompilerOutput.Robot robot = output.getRobots().get(0);
            assertEquals("Test", robot.getName());
            assertEquals(1, robot.getInstructions().size());
            final AtRobotCompilerOutput.Instruction instruction = robot.getInstructions().get(0);
            assertEquals(AtRobotCompilerOutput.InstructionType.MOVE, instruction.getType());
            assertEquals(1, instruction.getArguments().size());
            assertEquals("1", instruction.getArguments().get(0));
        } finally {
            in.close();
        }
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
        final InputStream in = getClass().getResourceAsStream("AtRobotCompiler_3Test.txt");
        try {
            final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
            assertEquals(0, output.getErrors().size());
            assertEquals(0, output.getWarnings().size());
            assertEquals(1, output.getRobots().size());
            final AtRobotCompilerOutput.Robot robot = output.getRobots().get(0);
            assertEquals("Test", robot.getName());
            assertEquals(1, robot.getInstructions().size());
            final AtRobotCompilerOutput.Instruction instruction = robot.getInstructions().get(0);
            assertEquals(AtRobotCompilerOutput.InstructionType.MOVE, instruction.getType());
            assertEquals(1, instruction.getArguments().size());
            assertEquals("1", instruction.getArguments().get(0));
        } finally {
            in.close();
        }
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
        final InputStream in = getClass().getResourceAsStream("AtRobotCompiler_4Test.txt");
        try {
            final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
            assertEquals(0, output.getErrors().size());
            assertEquals(0, output.getWarnings().size());
            assertEquals(1, output.getRobots().size());
            final AtRobotCompilerOutput.Robot robot = output.getRobots().get(0);
            assertEquals("Test", robot.getName());
            assertEquals(1, robot.getInstructions().size());
            final AtRobotCompilerOutput.Instruction instruction = robot.getInstructions().get(0);
            assertEquals(AtRobotCompilerOutput.InstructionType.MOVE, instruction.getType());
            assertEquals(1, instruction.getArguments().size());
            assertEquals("1", instruction.getArguments().get(0));
        } finally {
            in.close();
        }
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
        final InputStream in = getClass().getResourceAsStream("AtRobotCompiler_5Test.txt");
        try {
            final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
            assertEquals(0, output.getErrors().size());
            assertEquals(0, output.getWarnings().size());
            assertEquals(1, output.getRobots().size());
            final AtRobotCompilerOutput.Robot robot = output.getRobots().get(0);
            assertEquals("Test", robot.getName());
            assertEquals(1, robot.getInstructions().size());
            final AtRobotCompilerOutput.Instruction instruction = robot.getInstructions().get(0);
            assertEquals(AtRobotCompilerOutput.InstructionType.MOVE, instruction.getType());
            assertEquals(1, instruction.getArguments().size());
            assertEquals("1", instruction.getArguments().get(0));
        } finally {
            in.close();
        }
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
        final InputStream in = getClass().getResourceAsStream("AtRobotCompiler_6Test.txt");
        try {
            final AtRobotCompilerOutput output = new AtRobotCompiler().compile(in);
            assertEquals(0, output.getErrors().size());
            assertEquals(0, output.getWarnings().size());
            assertEquals(1, output.getRobots().size());
            final AtRobotCompilerOutput.Robot robot = output.getRobots().get(0);
            assertEquals("Test", robot.getName());
            assertEquals(1, robot.getInstructions().size());
            final AtRobotCompilerOutput.Instruction instruction = robot.getInstructions().get(0);
            assertEquals(AtRobotCompilerOutput.InstructionType.MOVE, instruction.getType());
            assertEquals(1, instruction.getArguments().size());
            assertEquals("1", instruction.getArguments().get(0));
        } finally {
            in.close();
        }
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
   