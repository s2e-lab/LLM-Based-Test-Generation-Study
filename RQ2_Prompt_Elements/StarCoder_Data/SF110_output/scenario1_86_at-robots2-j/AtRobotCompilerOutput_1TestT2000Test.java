// AtRobotCompilerOutput_1Test.java
package net.virtualinfinity.atrobots.compiler;

import net.virtualinfinity.atrobots.computer.DebugInfo;
import net.virtualinfinity.atrobots.computer.Program;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompilerOutput}.
* It contains ten unit test cases for the {@link AtRobotCompilerOutput#hasErrors()} method.
*/
class AtRobotCompilerOutput_1Test {

    @Test
    void test_hasErrors_01() {
        final AtRobotCompilerOutput output = new AtRobotCompilerOutput(new DebugInfo(), new Program());
        assertFalse(output.hasErrors());
    }

    @Test
    void test_hasErrors_02() {
        final AtRobotCompilerOutput output = new AtRobotCompilerOutput(new DebugInfo(), new Program());
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        assertTrue(output.hasErrors());
    }

    @Test
    void test_hasErrors_03() {
        final AtRobotCompilerOutput output = new AtRobotCompilerOutput(new DebugInfo(), new Program());
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        assertTrue(output.hasErrors());
    }

    @Test
    void test_hasErrors_04() {
        final AtRobotCompilerOutput output = new AtRobotCompilerOutput(new DebugInfo(), new Program());
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        assertTrue(output.hasErrors());
    }

    @Test
    void test_hasErrors_05() {
        final AtRobotCompilerOutput output = new AtRobotCompilerOutput(new DebugInfo(), new Program());
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        assertTrue(output.hasErrors());
    }

    @Test
    void test_hasErrors_06() {
        final AtRobotCompilerOutput output = new AtRobotCompilerOutput(new DebugInfo(), new Program());
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        assertTrue(output.hasErrors());
    }

    @Test
    void test_hasErrors_07() {
        final AtRobotCompilerOutput output = new AtRobotCompilerOutput(new DebugInfo(), new Program());
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        assertTrue(output.hasErrors());
    }

    @Test
    void test_hasErrors_08() {
        final AtRobotCompilerOutput output = new AtRobotCompilerOutput(new DebugInfo(), new Program());
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        assertTrue(output.hasErrors());
    }

    @Test
    void test_hasErrors_09() {
        final AtRobotCompilerOutput output = new AtRobotCompilerOutput(new DebugInfo(), new Program());
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        assertTrue(output.hasErrors());
    }

    @Test
    void test_hasErrors_10() {
        final AtRobotCompilerOutput output = new AtRobotCompilerOutput(new DebugInfo(), new Program());
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        output.addError(new AtRobotCompilerError(AtRobotCompilerError.Type.SYNTAX_ERROR, 1, 1, "Syntax error"));
        assertTrue(output.hasErrors());
    }
}

// AtRobotCompilerOutput_2Test.java
package net.virtualinfinity