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
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_0Test.at");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final AtRobotCompilerOutput.Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_0Test", robot.getName());
        assertEquals(1, robot.getActions().size());
        final AtRobotCompilerOutput.Action action = robot.getActions().get(0);
        assertEquals("test", action.getName());
        assertEquals(1, action.getCommands().size());
        final AtRobotCompilerOutput.Command command = action.getCommands().get(0);
        assertEquals("move", command.getName());
        assertEquals(1, command.getArguments().size());
        final AtRobotCompilerOutput.Argument argument = command.getArguments().get(0);
        assertEquals("forward", argument.getName());
        assertEquals(1, argument.getExpressions().size());
        final AtRobotCompilerOutput.Expression expression = argument.getExpressions().get(0);
        assertEquals("10", expression.getExpression());
        assertEquals(1, expression.getVariables().size());
        final AtRobotCompilerOutput.Variable variable = expression.getVariables().get(0);
        assertEquals("distance", variable.getName());
        assertEquals("int", variable.getType());
        assertEquals(1, variable.getInitializations().size());
        final AtRobotCompilerOutput.Initialization initialization = variable.getInitializations().get(0);
        assertEquals("10", initialization.getExpression());
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
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_1Test.at");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final AtRobotCompilerOutput.Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_1Test", robot.getName());
        assertEquals(1, robot.getActions().size());
        final AtRobotCompilerOutput.Action action = robot.getActions().get(0);
        assertEquals("test", action.getName());
        assertEquals(1, action.getCommands().size());
        final AtRobotCompilerOutput.Command command = action.getCommands().get(0);
        assertEquals("move", command.getName());
        assertEquals(1, command.getArguments().size());
        final AtRobotCompilerOutput.Argument argument = command.getArguments().get(0);
        assertEquals("forward", argument.getName());
        assertEquals(1, argument.getExpressions().size());
        final AtRobotCompilerOutput.Expression expression = argument.getExpressions().get(0);
        assertEquals("10", expression.getExpression());
        assertEquals(1, expression.getVariables().size());
        final AtRobotCompilerOutput.Variable variable = expression.getVariables().get(0);
        assertEquals("distance", variable.getName());
        assertEquals("int", variable.getType());
        assertEquals(1, variable.getInitializations().size());
        final AtRobotCompilerOutput.Initialization initialization = variable.getInitializations().get(0);
        assertEquals("10", initialization.getExpression());
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
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_2Test.at");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final AtRobotCompilerOutput.Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_2Test", robot.getName());
        assertEquals(1, robot.getActions().size());
        final AtRobotCompilerOutput.Action action = robot.getActions().get(0);
        assertEquals("test", action.getName());
        assertEquals(1, action.getCommands().size());
        final AtRobotCompilerOutput.Command command = action.getCommands().get(0);
        assertEquals("move", command.getName());
        assertEquals(1, command.getArguments().size());
        final AtRobotCompilerOutput.Argument argument = command.getArguments().get(0);
        assertEquals("forward", argument.getName());
        assertEquals(1, argument.getExpressions().size());
        final AtRobotCompilerOutput.Expression expression = argument.getExpressions().get(0);
        assertEquals("10", expression.getExpression());
        assertEquals(1, expression.getVariables().size());
        final AtRobotCompilerOutput.Variable variable = expression.getVariables().get(0);
        assertEquals("distance", variable.getName());
        assertEquals("int", variable.getType());
        assertEquals(1, variable.getInitializations().size());
        final AtRobotCompilerOutput.Initialization initialization = variable.getInitializations().get(0);
        assertEquals("10", initialization.getExpression());
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
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_3Test.at");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final AtRobotCompilerOutput.Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_3Test", robot.getName());
        assertEquals(1, robot.getActions().size());
        final AtRobotCompilerOutput.Action action = robot.getActions().get(0);
        assertEquals("test", action.getName());
        assertEquals(1, action.getCommands().size());
        final AtRobotCompilerOutput.Command command = action.getCommands().get(0);
        assertEquals("move", command.getName());
        assertEquals(1, command.getArguments().size());
        final AtRobotCompilerOutput.Argument argument = command.getArguments().get(0);
        assertEquals("forward", argument.getName());
        assertEquals(1, argument.getExpressions().size());
        final AtRobotCompilerOutput.Expression expression = argument.getExpressions().get(0);
        assertEquals("10", expression.getExpression());
        assertEquals(1, expression.getVariables().size());
        final AtRobotCompilerOutput.Variable variable = expression.getVariables().get(0);
        assertEquals("distance", variable.getName());