// SimpleCharStream_0Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#BeginToken()} method.
*/
class SimpleCharStream_0Test {

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    * It tests the case when the buffer is empty.
    */
    @Test
    void BeginToken_0() {
        try {
            SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader(""));
            simpleCharStream.BeginToken();
            assertEquals(0, simpleCharStream.getBeginColumn());
            assertEquals(0, simpleCharStream.getBeginLine());
            assertEquals(0, simpleCharStream.getEndColumn());
            assertEquals(0, simpleCharStream.getEndLine());
            assertEquals(0, simpleCharStream.getColumn());
            assertEquals(0, simpleCharStream.getLine());
            assertEquals("", simpleCharStream.GetImage());
            assertEquals("", simpleCharStream.GetSuffix(0));
        } catch (java.io.IOException e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void BeginToken_1() {
        try {
            SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("a"));
            simpleCharStream.BeginToken();
            assertEquals(0, simpleCharStream.getBeginColumn());
            assertEquals(0, simpleCharStream.getBeginLine());
            assertEquals(1, simpleCharStream.getEndColumn());
            assertEquals(1, simpleCharStream.getEndLine());
            assertEquals(1, simpleCharStream.getColumn());
            assertEquals(1, simpleCharStream.getLine());
            assertEquals("a", simpleCharStream.GetImage());
            assertEquals("", simpleCharStream.GetSuffix(0));
        } catch (java.io.IOException e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void BeginToken_2() {
        try {
            SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("ab"));
            simpleCharStream.BeginToken();
            assertEquals(0, simpleCharStream.getBeginColumn());
            assertEquals(0, simpleCharStream.getBeginLine());
            assertEquals(1, simpleCharStream.getEndColumn());
            assertEquals(1, simpleCharStream.getEndLine());
            assertEquals(1, simpleCharStream.getColumn());
            assertEquals(1, simpleCharStream.getLine());
            assertEquals("a", simpleCharStream.GetImage());
            assertEquals("b", simpleCharStream.GetSuffix(0));
        } catch (java.io.IOException e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void BeginToken_3() {
        try {
            SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("abc"));
            simpleCharStream.BeginToken();
            assertEquals(0, simpleCharStream.getBeginColumn());
            assertEquals(0, simpleCharStream.getBeginLine());
            assertEquals(1, simpleCharStream.getEndColumn());
            assertEquals(1, simpleCharStream.getEndLine());
            assertEquals(1, simpleCharStream.getColumn());
            assertEquals(1, simpleCharStream.getLine());
            assertEquals("a", simpleCharStream.GetImage());
            assertEquals("bc", simpleCharStream.GetSuffix(0));
        } catch (java.io.IOException e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void BeginToken_4() {
        try {
            SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("abcd"));
            simpleCharStream.BeginToken();
            assertEquals(0, simpleCharStream.getBeginColumn());
            assertEquals(0, simpleCharStream.getBeginLine());
            assertEquals(1, simpleCharStream.getEndColumn());
            assertEquals(1, simpleCharStream.getEndLine());
            assertEquals(1, simpleCharStream.getColumn());
            assertEquals(1, simpleCharStream.getLine());
            assertEquals("a", simpleCharStream.GetImage());
            assertEquals("bcd", simpleCharStream.GetSuffix(0));
        } catch (java.io.IOException e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void BeginToken_5() {
        try {
            SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("abcde"));
            simpleCharStream.BeginToken();
            assertEquals(0, simpleCharStream.getBeginColumn());
            assertEquals(0, simpleCharStream.getBeginLine());
            assertEquals(1, simpleCharStream.getEndColumn());
            assertEquals(1, simpleCharStream.getEndLine());
            assertEquals(1, simpleCharStream.getColumn());
            assertEquals(1, simpleCharStream.getLine());
            assertEquals("a", simpleCharStream.GetImage());
            assertEquals("bcde", simpleCharStream.GetSuffix(0));
        } catch (java.io.IOException e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void BeginToken_6() {
        try {
            SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("abcdef"));
            simpleCharStream.BeginToken();
            assertEquals(0, simpleCharStream.getBeginColumn());
            assertEquals(0, simpleCharStream.getBeginLine());
            assertEquals(1, simpleCharStream.getEndColumn());
            assertEquals(1, simpleCharStream.getEndLine());
            assertEquals(1, simpleCharStream.getColumn());
            assertEquals(1, simpleCharStream.getLine());
            assertEquals("a", simpleCharStream.GetImage());
            assertEquals("bcdef", simpleCharStream.GetSuffix(0));
        } catch (java.io.IOException e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void BeginToken_7() {
        try {
            SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("abcdefg"));
            simpleCharStream.BeginToken();
            assertEquals(0, simpleCharStream.getBeginColumn());
            assertEquals(0, simpleCharStream.getBeginLine());
            assertEquals(1, simpleCharStream.getEndColumn());
            assertEquals(1, simpleCharStream.getEndLine());
            assertEquals(1, simpleCharStream.getColumn());
            assertEquals(1, simpleCharStream.getLine());
            assertEquals("a", simpleCharStream.GetImage());
            assertEquals("bcdefg", simpleCharStream.GetSuffix(0));
        } catch (java.io.IOException e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void BeginToken_8() {
        try {
            SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("abcdefgh"));
            simpleCharStream.BeginToken();
            assertEquals(0, simpleCharStream.getBeginColumn());
            assertEquals(0, simpleCharStream.getBeginLine());
            assertEquals(1, simpleCharStream.getEndColumn());
            assertEquals(1, simpleCharStream.getEndLine());
            assertEquals(1, simpleCharStream.getColumn());
            assertEquals(1, simpleCharStream.getLine());
            assertEquals("a", simpleCharStream.GetImage());
            assertEquals("bcdefgh", simpleCharStream.GetSuffix(0));
        } catch (java.io.IOException e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void BeginToken_9() {
        try {
            SimpleCharStream simpleCharStream = new SimpleCharStream(new java.io.StringReader("abcdefghi"));
            simpleCharStream.BeginToken();
            assertEquals(0, simpleCharStream.getBeginColumn());
            assertEquals(0, simpleCharStream.getBeginLine());
            assertEquals(1, simpleCharStream.getEndColumn());
            assertEquals(1, simpleCharStream.getEndLine());
            assertEquals(1, simpleCharStream.getColumn());
            assertEquals(1, simpleCharStream.getLine());
            assertEquals("a", simpleCharStream.GetImage());
            assertEquals("bcdefghi", simpleCharStream.GetSuffix(0));
        } catch (java.io.IOException e) {
            fail(e.getMessage());
        }
    }
}
