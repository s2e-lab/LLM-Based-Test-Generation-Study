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

    @Test
    void test_compile_0() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_0.at");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final AtRobot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_0", robot.getName());
        assertEquals(1, robot.getActions().size());
        final AtAction action = robot.getActions().get(0);
        assertEquals("AtRobotCompiler_0", action.getName());
        assertEquals(1, action.getCommands().size());
        final AtCommand command = action.getCommands().get(0);
        assertEquals("AtRobotCompiler_0", command.getName());
        assertEquals(0, command.getArguments().size());
    }

    @Test
    void test_compile_1() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_1.at");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final AtRobot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_1", robot.getName());
        assertEquals(1, robot.getActions().size());
        final AtAction action = robot.getActions().get(0);
        assertEquals("AtRobotCompiler_1", action.getName());
        assertEquals(1, action.getCommands().size());
        final AtCommand command = action.getCommands().get(0);
        assertEquals("AtRobotCompiler_1", command.getName());
        assertEquals(0, command.getArguments().size());
    }

    @Test
    void test_compile_2() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_2.at");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final AtRobot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_2", robot.getName());
        assertEquals(1, robot.getActions().size());
        final AtAction action = robot.getActions().get(0);
        assertEquals("AtRobotCompiler_2", action.getName());
        assertEquals(1, action.getCommands().size());
        final AtCommand command = action.getCommands().get(0);
        assertEquals("AtRobotCompiler_2", command.getName());
        assertEquals(0, command.getArguments().size());
    }

    @Test
    void test_compile_3() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_3.at");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final AtRobot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_3", robot.getName());
        assertEquals(1, robot.getActions().size());
        final AtAction action = robot.getActions().get(0);
        assertEquals("AtRobotCompiler_3", action.getName());
        assertEquals(1, action.getCommands().size());
        final AtCommand command = action.getCommands().get(0);
        assertEquals("AtRobotCompiler_3", command.getName());
        assertEquals(0, command.getArguments().size());
    }

    @Test
    void test_compile_4() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_4.at");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final AtRobot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_4", robot.getName());
        assertEquals(1, robot.getActions().size());
        final AtAction action = robot.getActions().get(0);
        assertEquals("AtRobotCompiler_4", action.getName());
        assertEquals(1, action.getCommands().size());
        final AtCommand command = action.getCommands().get(0);
        assertEquals("AtRobotCompiler_4", command.getName());
        assertEquals(0, command.getArguments().size());
    }

    @Test
    void test_compile_5() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_5.at");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final AtRobot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_5", robot.getName());
        assertEquals(1, robot.getActions().size());
        final AtAction action = robot.getActions().get(0);
        assertEquals("AtRobotCompiler_5", action.getName());
        assertEquals(1, action.getCommands().size());
        final AtCommand command = action.getCommands().get(0);
        assertEquals("AtRobotCompiler_5", command.getName());
        assertEquals(0, command.getArguments().size());
    }

    @Test
    void test_compile_6() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_6.at");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final AtRobot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_6", robot.getName());
        assertEquals(1, robot.getActions().size());
        final AtAction action = robot.getActions().get(0);
        assertEquals("AtRobotCompiler_6", action.getName());
        assertEquals(1, action.getCommands().size());
        final AtCommand command = action.getCommands().get(0);
        assertEquals("AtRobotCompiler_6", command.getName());
        assertEquals(0, command.getArguments().size());
    }

    @Test
    void test_compile_7() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_7.at");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final AtRobot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_7", robot.getName());
        assertEquals(1, robot.getActions().size());
        final AtAction action = robot.getActions().get(0);
        assertEquals("AtRobotCompiler_7", action.getName());
        assertEquals(1, action.getCommands().size());
        final AtCommand command = action.getCommands().get(0);
        assertEquals("AtRobotCompiler_7", command.getName());
        assertEquals(0, command.getArguments().size());
    }

    @Test
    void test_compile_8() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_8.at");
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getRobots().size());
        final AtRobot robot = output.getRobots().get(0);
        assertEquals("AtRobotCompiler_8", robot.getName());
        assertEquals(1, robot.getActions().size());
        final AtAction action = robot.getActions().get(0);
        assertEquals("AtRobotCompiler_8", action.getName());
        assertEquals(1, action.getCommands().size());
        final AtCommand command = action.getCommands().get(0);
        assertEquals