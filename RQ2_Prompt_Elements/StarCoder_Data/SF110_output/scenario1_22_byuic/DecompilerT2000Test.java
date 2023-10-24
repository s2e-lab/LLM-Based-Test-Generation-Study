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
        String expected = "function f(x) {\n\treturn x + 1;\n}";
        assertEquals(expected, Decompiler.decompile(source, 0, null));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlags() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n\treturn x + 1;\n}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n\treturn x + 1;\n}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 1);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        properties.put(Decompiler.CASE_GAP_PROP, 3);
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, properties));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties2() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n\treturn x + 1;\n}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 1);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        properties.put(Decompiler.CASE_GAP_PROP, 3);
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG | Decompiler.INITIAL_INDENT_PROP | Decompiler.INDENT_GAP_PROP | Decompiler.CASE_GAP_PROP, properties));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties3() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n\treturn x + 1;\n}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 1);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        properties.put(Decompiler.CASE_GAP_PROP, 3);
        assertEquals(expected, Decompiler.decompile(source, Decompiler.INITIAL_INDENT_PROP | Decompiler.INDENT_GAP_PROP | Decompiler.CASE_GAP_PROP, properties));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties4() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n\treturn x + 1;\n}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 1);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        properties.put(Decompiler.CASE_GAP_PROP, 3);
        assertEquals(expected, Decompiler.decompile(source, Decompiler.INITIAL_INDENT_PROP | Decompiler.INDENT_GAP_PROP | Decompiler.CASE_GAP_PROP | Decompiler.ONLY_BODY_FLAG, properties));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties5() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n\treturn x + 1;\n}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 1);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        properties.put(Decompiler.CASE_GAP_PROP, 3);
        assertEquals(expected, Decompiler.decompile(source, Decompiler.INITIAL_INDENT_PROP | Decompiler.INDENT_GAP_PROP | Decompiler.CASE_GAP_PROP | Decompiler.ONLY_BODY_FLAG, properties));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties6() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n\treturn x + 1;\n}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 1);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        properties.put(Decompiler.CASE_GAP_PROP, 3);
        assertEquals(expected, Decompiler.decompile(source, Decompiler.INITIAL_INDENT_PROP | Decompiler.INDENT_GAP_PROP | Decompiler.CASE_GAP_PROP | Decompiler.ONLY_BODY_FLAG, properties));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties7() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n\treturn x + 1;\n}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 1);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        properties.put(Decompiler.CASE_GAP_PROP, 3);
        assertEquals(expected, Decompiler.decompile(source, Decompiler.INITIAL_INDENT_PROP | Decompiler.INDENT_GAP_PROP | Decompiler.CASE_GAP_PROP | Decompiler.ONLY_BODY_FLAG, properties));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties8() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n\treturn x + 1;\n}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 1);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        properties.put(Decompiler.CASE_GAP_PROP, 3);
        assertEquals(expected, Decompiler.decompile(source, Decompiler.INITIAL_INDENT_PROP | Decompiler.INDENT_GAP_PROP | Decompiler.CASE_GAP_PROP | Decompiler.ONLY_BODY_FLAG, properties));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties9() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n\treturn x + 1;\n}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 1);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        properties.put(Decompiler.CASE_GAP_PROP, 3);
        assertEquals(expected, Decompiler.decompile(source, Decompiler.INITIAL_INDENT_PROP | Decompiler.INDENT_GAP_PROP | Decompiler.CASE_GAP_PROP | Decompiler.ONLY_BODY_FLAG, properties));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties10() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x