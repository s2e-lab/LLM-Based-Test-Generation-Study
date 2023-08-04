// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#GetImage()} method.
*/
class SimpleCharStream_2Test {

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        assertEquals(input, stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_2() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(1);
        assertEquals(input.substring(0, input.length() - 1), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_3() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(2);
        assertEquals(input.substring(0, input.length() - 2), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_4() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(3);
        assertEquals(input.substring(0, input.length() - 3), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_5() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(4);
        assertEquals(input.substring(0, input.length() - 4), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_6() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(5);
        assertEquals(input.substring(0, input.length() - 5), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_7() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(6);
        assertEquals(input.substring(0, input.length() - 6), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_8() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(7);
        assertEquals(input.substring(0, input.length() - 7), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_9() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(8);
        assertEquals(input.substring(0, input.length() - 8), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_10() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(9);
        assertEquals(input.substring(0, input.length() - 9), stream.GetImage());
    }
}

// SimpleCharStream_3Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#GetImage()} method.
*/
class SimpleCharStream_3Test {
		
    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        assertEquals(input, stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_2() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(1);
        assertEquals(input.substring(0, input.length() - 1), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_3() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(2);
        assertEquals(input.substring(0, input.length() - 2), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_4() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(3);
        assertEquals(input.substring(0, input.length() - 3), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_5() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(4);
        assertEquals(input.substring(0, input.length() - 4), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_6() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(5);
        assertEquals(input.substring(0, input.length() - 5), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_7() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(6);
        assertEquals(input.substring(0, input.length() - 6), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_8() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(7);
        assertEquals(input.substring(0, input.length() - 7), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_9() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(8);
        assertEquals(input.substring(0, input.length() - 8), stream.GetImage());
    }

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It tests the case when the token is a string.
    */
    @Test
    void testGetImage_String_10() {
        String input = "test";
        SimpleCharStream stream = new SimpleCharStream(input);
        stream.backup(9);
        assertEquals(input.substring(0, input.length() - 9), stream.GetImage());
    }
}

// SimpleCharStream_4Test.java
/* JavaCCOptions:STATIC=false,