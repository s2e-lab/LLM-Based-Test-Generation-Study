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
    void testCompile_0() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_0.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_0", robot.getName());
        assertEquals(1, robot.getInstructions().size());
        final Instruction instruction = robot.getInstructions().get(0);
        assertEquals(InstructionType.MOVE, instruction.getInstructionType());
        assertEquals(1, instruction.getArguments().size());
        final Argument argument = instruction.getArguments().get(0);
        assertEquals(ArgumentType.DIRECTION, argument.getArgumentType());
        assertEquals(Direction.NORTH, argument.getDirection());
    }
		
    /**
    * Test case for the {@link AtRobotCompiler#compile(File)} method.
    *
    * @throws IOException if there is a problem reading from the file.
    */
    @Test
    void testCompile_1() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_1.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_1", robot.getName());
        assertEquals(1, robot.getInstructions().size());
        final Instruction instruction = robot.getInstructions().get(0);
        assertEquals(InstructionType.MOVE, instruction.getInstructionType());
        assertEquals(1, instruction.getArguments().size());
        final Argument argument = instruction.getArguments().get(0);
        assertEquals(ArgumentType.DIRECTION, argument.getArgumentType());
        assertEquals(Direction.NORTH, argument.getDirection());
    }
		
    /**
    * Test case for the {@link AtRobotCompiler#compile(File)} method.
    *
    * @throws IOException if there is a problem reading from the file.
    */
    @Test
    void testCompile_2() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_2.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_2", robot.getName());
        assertEquals(1, robot.getInstructions().size());
        final Instruction instruction = robot.getInstructions().get(0);
        assertEquals(InstructionType.MOVE, instruction.getInstructionType());
        assertEquals(1, instruction.getArguments().size());
        final Argument argument = instruction.getArguments().get(0);
        assertEquals(ArgumentType.DIRECTION, argument.getArgumentType());
        assertEquals(Direction.NORTH, argument.getDirection());
    }
		
    /**
    * Test case for the {@link AtRobotCompiler#compile(File)} method.
    *
    * @throws IOException if there is a problem reading from the file.
    */
    @Test
    void testCompile_3() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_3.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_3", robot.getName());
        assertEquals(1, robot.getInstructions().size());
        final Instruction instruction = robot.getInstructions().get(0);
        assertEquals(InstructionType.MOVE, instruction.getInstructionType());
        assertEquals(1, instruction.getArguments().size());
        final Argument argument = instruction.getArguments().get(0);
        assertEquals(ArgumentType.DIRECTION, argument.getArgumentType());
        assertEquals(Direction.NORTH, argument.getDirection());
    }
		
    /**
    * Test case for the {@link AtRobotCompiler#compile(File)} method.
    *
    * @throws IOException if there is a problem reading from the file.
    */
    @Test
    void testCompile_4() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_4.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_4", robot.getName());
        assertEquals(1, robot.getInstructions().size());
        final Instruction instruction = robot.getInstructions().get(0);
        assertEquals(InstructionType.MOVE, instruction.getInstructionType());
        assertEquals(1, instruction.getArguments().size());
        final Argument argument = instruction.getArguments().get(0);
        assertEquals(ArgumentType.DIRECTION, argument.getArgumentType());
        assertEquals(Direction.NORTH, argument.getDirection());
    }
		
    /**
    * Test case for the {@link AtRobotCompiler#compile(File)} method.
    *
    * @throws IOException if there is a problem reading from the file.
    */
    @Test
    void testCompile_5() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_5.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_5", robot.getName());
        assertEquals(1, robot.getInstructions().size());
        final Instruction instruction = robot.getInstructions().get(0);
        assertEquals(InstructionType.MOVE, instruction.getInstructionType());
        assertEquals(1, instruction.getArguments().size());
        final Argument argument = instruction.getArguments().get(0);
        assertEquals(ArgumentType.DIRECTION, argument.getArgumentType());
        assertEquals(Direction.NORTH, argument.getDirection());
    }
		
    /**
    * Test case for the {@link AtRobotCompiler#compile(File)} method.
    *
    * @throws IOException if there is a problem reading from the file.
    */
    @Test
    void testCompile_6() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_6.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput.getWarnings().size());
        assertEquals(1, compilerOutput.getRobots().size());
        final Robot robot = compilerOutput.getRobots().get(0);
        assertEquals("AtRobotCompiler_6", robot.getName());
        assertEquals(1, robot.getInstructions().size());
        final Instruction instruction = robot.getInstructions().get(0);
        assertEquals(InstructionType.MOVE, instruction.getInstructionType());
        assertEquals(1, instruction.getArguments().size());
        final Argument argument = instruction.getArguments().get(0);
        assertEquals(ArgumentType.DIRECTION, argument.getArgumentType());
        assertEquals(Direction.NORTH, argument.getDirection());
    }
		
    /**
    * Test case for the {@link AtRobotCompiler#compile(File)} method.
    *
    * @throws IOException if there is a problem reading from the file.
    */
    @Test
    void testCompile_7() throws IOException {
        final File sourceFile = new File("src/test/resources/net/virtualinfinity/atrobots/compiler/AtRobotCompiler_7.txt");
        final AtRobotCompilerOutput compilerOutput = new AtRobotCompiler().compile(sourceFile);
        assertEquals(0, compilerOutput.getErrors().size());
        assertEquals(0, compilerOutput