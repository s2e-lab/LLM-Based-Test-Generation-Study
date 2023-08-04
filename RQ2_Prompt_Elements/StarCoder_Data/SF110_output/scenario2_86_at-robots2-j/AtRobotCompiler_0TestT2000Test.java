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
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_0.atr");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final Robot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_0", robot.getName());
        assertEquals(1, robot.getActions().size());
        final Action action = robot.getActions().get(0);
        assertEquals("move", action.getName());
        assertEquals(1, action.getArguments().size());
        final Argument argument = action.getArguments().get(0);
        assertEquals("direction", argument.getName());
        assertEquals("Direction", argument.getType());
        assertEquals(1, argument.getChoices().size());
        final Choice choice = argument.getChoices().get(0);
        assertEquals("north", choice.getName());
        assertEquals(0, choice.getArguments().size());
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
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_1.atr");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final Robot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_1", robot.getName());
        assertEquals(1, robot.getActions().size());
        final Action action = robot.getActions().get(0);
        assertEquals("move", action.getName());
        assertEquals(1, action.getArguments().size());
        final Argument argument = action.getArguments().get(0);
        assertEquals("direction", argument.getName());
        assertEquals("Direction", argument.getType());
        assertEquals(1, argument.getChoices().size());
        final Choice choice = argument.getChoices().get(0);
        assertEquals("north", choice.getName());
        assertEquals(0, choice.getArguments().size());
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
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_2.atr");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final Robot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_2", robot.getName());
        assertEquals(1, robot.getActions().size());
        final Action action = robot.getActions().get(0);
        assertEquals("move", action.getName());
        assertEquals(1, action.getArguments().size());
        final Argument argument = action.getArguments().get(0);
        assertEquals("direction", argument.getName());
        assertEquals("Direction", argument.getType());
        assertEquals(1, argument.getChoices().size());
        final Choice choice = argument.getChoices().get(0);
        assertEquals("north", choice.getName());
        assertEquals(0, choice.getArguments().size());
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
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_3.atr");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final Robot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_3", robot.getName());
        assertEquals(1, robot.getActions().size());
        final Action action = robot.getActions().get(0);
        assertEquals("move", action.getName());
        assertEquals(1, action.getArguments().size());
        final Argument argument = action.getArguments().get(0);
        assertEquals("direction", argument.getName());
        assertEquals("Direction", argument.getType());
        assertEquals(1, argument.getChoices().size());
        final Choice choice = argument.getChoices().get(0);
        assertEquals("north", choice.getName());
        assertEquals(0, choice.getArguments().size());
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
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_4.atr");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final Robot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_4", robot.getName());
        assertEquals(1, robot.getActions().size());
        final Action action = robot.getActions().get(0);
        assertEquals("move", action.getName());
        assertEquals(1, action.getArguments().size());
        final Argument argument = action.getArguments().get(0);
        assertEquals("direction", argument.getName());
        assertEquals("Direction", argument.getType());
        assertEquals(1, argument.getChoices().size());
        final Choice choice = argument.getChoices().get(0);
        assertEquals("north", choice.getName());
        assertEquals(0, choice.getArguments().size());
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
		