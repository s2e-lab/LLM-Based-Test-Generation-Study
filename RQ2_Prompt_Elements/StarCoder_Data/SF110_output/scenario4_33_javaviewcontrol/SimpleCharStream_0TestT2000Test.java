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
    */
    @Test
    void BeginToken_0() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("")).BeginToken();
            assertEquals(c, '\u0000');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_1() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("a")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_2() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("ab")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_3() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abc")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_4() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abcd")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_5() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abcde")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_6() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abcdef")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_7() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abcdefg")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_8() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abcdefgh")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_9() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abcdefghi")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}

// SimpleCharStream_1Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#BeginToken()} method.
*/
class SimpleCharStream_1Test {
		
    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_0() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("")).BeginToken();
            assertEquals(c, '\u0000');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_1() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("a")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_2() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("ab")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_3() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abc")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_4() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abcd")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_5() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abcde")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_6() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abcdef")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_7() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abcdefg")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_8() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abcdefgh")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }

    /**
    * Test case for {@link SimpleCharStream#BeginToken()} method.
    */
    @Test
    void BeginToken_9() {
        try {
            char c = new SimpleCharStream(new java.io.StringReader("abcdefghi")).BeginToken();
            assertEquals(c, 'a');
        } catch (java.io.IOException e) {
            fail("Unexpected exception: " + e.getMessage());
        }
    }
}

// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.