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
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile2() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile3() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile4() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile5() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile6() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile7() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile8() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile9() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile10() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }
}

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
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile2() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile3() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile4() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile5() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile6() {
        String source = "function f(a,b,c){return a+b+c;}";
        String expected = "function f(a, b, c) {\n" + "    return a + b + c;\n" + "}";
        assertEquals(expected, Decompiler.decompile(source, Decompiler.ONLY_BODY_FLAG, new UintMap()));
    }

    /**
    * Test method for {@link Decompiler#decompile(String, int, UintMap)}.
    */
    @Test
    void testDecompile7() {
       