// DecompilerTest.java
package org.mozilla.javascript;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Decompiler}.
* It contains ten unit test cases for the {@link Decompiler#decompile(String, int, UintMap)} method.
*/
class DecompilerTest {

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "}";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithComments() {
        String source = "function f(x) { return x + 1; } // comment";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "} // comment";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithCommentsAndWhitespace() {
        String source = "function f(x) { return x + 1; } // comment\n";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "} // comment\n";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithCommentsAndWhitespace2() {
        String source = "function f(x) { return x + 1; } // comment\n\n";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "} // comment\n\n";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithCommentsAndWhitespace3() {
        String source = "function f(x) { return x + 1; } // comment\n\n\n";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "} // comment\n\n\n";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithCommentsAndWhitespace4() {
        String source = "function f(x) { return x + 1; } // comment\n\n\n\n";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "} // comment\n\n\n\n";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithCommentsAndWhitespace5() {
        String source = "function f(x) { return x + 1; } // comment\n\n\n\n\n";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "} // comment\n\n\n\n\n";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithCommentsAndWhitespace6() {
        String source = "function f(x) { return x + 1; } // comment\n\n\n\n\n\n";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "} // comment\n\n\n\n\n\n";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithCommentsAndWhitespace7() {
        String source = "function f(x) { return x + 1; } // comment\n\n\n\n\n\n\n";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "} // comment\n\n\n\n\n\n\n";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithCommentsAndWhitespace8() {
        String source = "function f(x) { return x + 1; } // comment\n\n\n\n\n\n\n\n";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "} // comment\n\n\n\n\n\n\n\n";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithCommentsAndWhitespace9() {
        String source = "function f(x) { return x + 1; } // comment\n\n\n\n\n\n\n\n\n";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "} // comment\n\n\n\n\n\n\n\n\n";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithCommentsAndWhitespace10() {
        String source = "function f(x) { return x + 1; } // comment\n\n\n\n\n\n\n\n\n\n";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "} // comment\n\n\n\n\n\n\n\n\n\n";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithCommentsAndWhitespace11() {
        String source = "function f(x) { return x + 1; } // comment\n\n\n\n\n\n\n\n\n\n\n";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "} // comment\n\n\n\n\n\n\n\n\n\n\n";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithCommentsAndWhitespace12() {
        String source = "function f(x) { return x + 1; } // comment\n\n\n\n\n\n\n\n\n\n\n\n";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "} // comment\n\n\n\n\n\n\n\n\n\n\n\n";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    *