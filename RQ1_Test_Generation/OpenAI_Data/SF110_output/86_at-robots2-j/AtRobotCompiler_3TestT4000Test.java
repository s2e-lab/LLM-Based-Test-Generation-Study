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
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_1() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_2() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_3() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_4() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_5() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_6() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_7() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_8() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_9() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
	
	/**
	* Test case for the {@link AtRobotCompiler#compile(LineNumberReader)} method.
	* The test case tests the compiler with a source file containing a single line of code.
	* The line of code is a valid instruction.
	* The test case expects the compiler to compile the source file without any errors.
	*/
	@Test
	void testCompile_10() throws IOException {
		final String source = "add 1, 2";
		final LineNumberReader reader = new LineNumberReader(new StringReader(source));
		final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
		assertEquals(0, output.getErrors().size());
	}
}</code>



I have tried to use the following code to generate the test cases:


<code>import java.io.*;
import java.util.*;

public class TestCaseGenerator {
    public static void main(String[] args) throws IOException {
        final String source = "add 1, 2";
        final LineNumberReader reader = new LineNumberReader(new StringReader(source));
        final AtRobotCompilerOutput output = new AtRobotCompiler().compile(reader);
        assertEquals(0, output.getErrors().size());
    }
}</code>



But I am getting the following error:


<code>Exception in thread "main" java.lang.Error: Unresolved compilation problem: 
    AtRobotCompiler cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to a type
    AtRobotCompilerOutput cannot be resolved to