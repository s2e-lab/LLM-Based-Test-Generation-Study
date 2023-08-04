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
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        assertEquals(input, stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage_2() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        stream.bufpos = 5;
        assertEquals(input.substring(5), stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage_3() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        stream.bufpos = 5;
        stream.bufsize = 10;
        assertEquals(input.substring(5), stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage_4() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        stream.bufpos = 5;
        stream.bufsize = 10;
        stream.tokenBegin = 3;
        assertEquals(input.substring(3, 8), stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage_5() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        stream.bufpos = 5;
        stream.bufsize = 10;
        stream.tokenBegin = 3;
        stream.adjustBeginLineColumn(1, 1);
        assertEquals(input.substring(3, 8), stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage_6() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        stream.bufpos = 5;
        stream.bufsize = 10;
        stream.tokenBegin = 3;
        stream.adjustBeginLineColumn(1, 1);
        stream.adjustEndLineColumn(1, 1);
        assertEquals(input.substring(3, 8), stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage_7() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        stream.bufpos = 5;
        stream.bufsize = 10;
        stream.tokenBegin = 3;
        stream.adjustBeginLineColumn(1, 1);
        stream.adjustEndLineColumn(1, 1);
        stream.backup(1);
        assertEquals(input.substring(3, 8), stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage_8() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        stream.bufpos = 5;
        stream.bufsize = 10;
        stream.tokenBegin = 3;
        stream.adjustBeginLineColumn(1, 1);
        stream.adjustEndLineColumn(1, 1);
        stream.backup(1);
        stream.backup(1);
        assertEquals(input.substring(3, 8), stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage_9() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        stream.bufpos = 5;
        stream.bufsize = 10;
        stream.tokenBegin = 3;
        stream.adjustBeginLineColumn(1, 1);
        stream.adjustEndLineColumn(1, 1);
        stream.backup(1);
        stream.backup(1);
        stream.backup(1);
        assertEquals(input.substring(3, 8), stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage_10() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        stream.bufpos = 5;
        stream.bufsize = 10;
        stream.tokenBegin = 3;
        stream.adjustBeginLineColumn(1, 1);
        stream.adjustEndLineColumn(1, 1);
        stream.backup(1);
        stream.backup(1);
        stream.backup(1);
        stream.backup(1);
        assertEquals(input.substring(3, 8), stream.GetImage());
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
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        assertEquals(input, stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage_2() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        stream.bufpos = 5;
        assertEquals(input.substring(5), stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage_3() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        stream.bufpos = 5;
        stream.bufsize = 10;
        assertEquals(input.substring(5), stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage_4() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        stream.bufpos = 5;
        stream.bufsize = 10;
        stream.tokenBegin = 3;
        assertEquals(input.substring(3, 8), stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage_5() {
        String input = "1234567890";
        SimpleCharStream stream = new SimpleCharStream(input.toCharArray(), 0, input.length(), 0, 0);
        stream.bufpos = 5;
        stream.bufsize = 10;
        stream.tokenBegin = 3;
        stream.adjustBeginLineColumn(1, 1);
        assertEquals(input.substring(3, 8), stream.GetImage());
    }

    /**
    * Test case for {@link SimpleCharStream#Get