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
        String actual = Decompiler.decompile(source, 0, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlags() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "}";
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, null);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithProperties() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 2);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        String actual = Decompiler.decompile(source, 0, properties);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 2);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, properties);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties2() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 2);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG | Decompiler.TO_SOURCE_FLAG, properties);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties3() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 2);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        String actual = Decompiler.decompile(source, Decompiler.TO_SOURCE_FLAG, properties);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties4() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 2);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG | Decompiler.TO_SOURCE_FLAG, properties);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties5() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 2);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG | Decompiler.TO_SOURCE_FLAG, properties);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties6() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 2);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG | Decompiler.TO_SOURCE_FLAG, properties);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties7() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 2);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG | Decompiler.TO_SOURCE_FLAG, properties);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties8() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 2);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG | Decompiler.TO_SOURCE_FLAG, properties);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties9() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT_PROP, 2);
        properties.put(Decompiler.INDENT_GAP_PROP, 2);
        String actual = Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG | Decompiler.TO_SOURCE_FLAG, properties);
        assertEquals(expected, actual);
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompileWithFlagsAndProperties10() {
        String source = "function f(x) { return x + 1; }";
        String expected = "function f(x) {\n" + "  return x + 1;\n" + "}";
        UintMap properties = new UintMap();
        properties.put(Decompiler.INITIAL_INDENT