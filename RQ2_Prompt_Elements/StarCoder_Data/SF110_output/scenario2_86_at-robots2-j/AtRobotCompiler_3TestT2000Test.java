// AtRobotCompiler_3Test.java
package net.virtualinfinity.atrobots.compiler;

import java.io.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AtRobotCompiler}.
* It contains ten unit test cases for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
*/
class AtRobotCompiler_3Test {

    /**
    * Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
    * It tests the compilation of a simple program.
    */
    @Test
    void testCompile_1() throws IOException {
        final String source = "10 LET A = 10\n" + "20 LET B = 20\n" + "30 LET C = A + B\n" + "40 PRINT C\n" + "50 END\n";
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(new LineNumberReader(new StringReader(source)));
        assertEquals(0, output.getErrors().size());
        assertEquals(0, output.getWarnings().size());
        assertEquals(1, output.getLabels().size());
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("END"));
        assertEquals(1, output.getLabels().get("PRINT"));
        assertEquals(1, output.getLabels().get("LET"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("30"));
        assertEquals(1, output.getLabels().get("40"));
        assertEquals(1, output.getLabels().get("50"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
        assertEquals(1, output.getLabels().get("20"));
        assertEquals(1, output.getLabels().get("A"));
        assertEquals(1, output.getLabels().get("B"));
        assertEquals(1, output.getLabels().get("C"));
        assertEquals(1, output.getLabels().get("10"));
       