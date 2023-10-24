// SimpleCharStream_1Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#readChar()} method.
*/
class SimpleCharStream_1Test {

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the buffer is empty.
    */
    @Test
    void testReadChar_1() throws java.io.IOException {
        char[] input = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        SimpleCharStream stream = new SimpleCharStream(input, 0, 13, 0, 13);
        assertEquals('a', stream.readChar());
        assertEquals('b', stream.readChar());
        assertEquals('c', stream.readChar());
        assertEquals('d', stream.readChar());
        assertEquals('e', stream.readChar());
        assertEquals('f', stream.readChar());
        assertEquals('g', stream.readChar());
        assertEquals('h', stream.readChar());
        assertEquals('i', stream.readChar());
        assertEquals('j', stream.readChar());
        assertEquals('k', stream.readChar());
        assertEquals('l', stream.readChar());
        assertEquals('m', stream.readChar());
        assertEquals('n', stream.readChar());
        assertEquals('o', stream.readChar());
        assertEquals('p', stream.readChar());
        assertEquals('q', stream.readChar());
        assertEquals('r', stream.readChar());
        assertEquals('s', stream.readChar());
        assertEquals('t', stream.readChar());
        assertEquals('u', stream.readChar());
        assertEquals('v', stream.readChar());
        assertEquals('w', stream.readChar());
        assertEquals('x', stream.readChar());
        assertEquals('y', stream.readChar());
        assertEquals('z', stream.readChar());
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void testReadChar_2() throws java.io.IOException {
        char[] input = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        SimpleCharStream stream = new SimpleCharStream(input, 0, 13, 0, 13);
        assertEquals('a', stream.readChar());
        assertEquals('b', stream.readChar());
        assertEquals('c', stream.readChar());
        assertEquals('d', stream.readChar());
        assertEquals('e', stream.readChar());
        assertEquals('f', stream.readChar());
        assertEquals('g', stream.readChar());
        assertEquals('h', stream.readChar());
        assertEquals('i', stream.readChar());
        assertEquals('j', stream.readChar());
        assertEquals('k', stream.readChar());
        assertEquals('l', stream.readChar());
        assertEquals('m', stream.readChar());
        assertEquals('n', stream.readChar());
        assertEquals('o', stream.readChar());
        assertEquals('p', stream.readChar());
        assertEquals('q', stream.readChar());
        assertEquals('r', stream.readChar());
        assertEquals('s', stream.readChar());
        assertEquals('t', stream.readChar());
        assertEquals('u', stream.readChar());
        assertEquals('v', stream.readChar());
        assertEquals('w', stream.readChar());
        assertEquals('x', stream.readChar());
        assertEquals('y', stream.readChar());
        assertEquals('z', stream.readChar());
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void testReadChar_3() throws java.io.IOException {
        char[] input = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        SimpleCharStream stream = new SimpleCharStream(input, 0, 13, 0, 13);
        assertEquals('a', stream.readChar());
        assertEquals('b', stream.readChar());
        assertEquals('c', stream.readChar());
        assertEquals('d', stream.readChar());
        assertEquals('e', stream.readChar());
        assertEquals('f', stream.readChar());
        assertEquals('g', stream.readChar());
        assertEquals('h', stream.readChar());
        assertEquals('i', stream.readChar());
        assertEquals('j', stream.readChar());
        assertEquals('k', stream.readChar());
        assertEquals('l', stream.readChar());
        assertEquals('m', stream.readChar());
        assertEquals('n', stream.readChar());
        assertEquals('o', stream.readChar());
        assertEquals('p', stream.readChar());
        assertEquals('q', stream.readChar());
        assertEquals('r', stream.readChar());
        assertEquals('s', stream.readChar());
        assertEquals('t', stream.readChar());
        assertEquals('u', stream.readChar());
        assertEquals('v', stream.readChar());
        assertEquals('w', stream.readChar());
        assertEquals('x', stream.readChar());
        assertEquals('y', stream.readChar());
        assertEquals('z', stream.readChar());
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void testReadChar_4() throws java.io.IOException {
        char[] input = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        SimpleCharStream stream = new SimpleCharStream(input, 0, 13, 0, 13);
        assertEquals('a', stream.readChar());
        assertEquals('b', stream.readChar());
        assertEquals('c', stream.readChar());
        assertEquals('d', stream.readChar());
        assertEquals('e', stream.readChar());
        assertEquals('f', stream.readChar());
        assertEquals('g', stream.readChar());
        assertEquals('h', stream.readChar());
        assertEquals('i', stream.readChar());
        assertEquals('j', stream.readChar());
        assertEquals('k', stream.readChar());
        assertEquals('l', stream.readChar());
        assertEquals('m', stream.readChar());
        assertEquals('n', stream.readChar());
        assertEquals('o', stream.readChar());
        assertEquals('p', stream.readChar());
        assertEquals('q', stream.readChar());
        assertEquals('r', stream.readChar());
        assertEquals('s', stream.readChar());
        assertEquals('t', stream.readChar());
        assertEquals('u', stream.readChar());
        assertEquals('v', stream.readChar());
        assertEquals('w', stream.readChar());
        assertEquals('x', stream.readChar());
        assertEquals('y', stream.readChar());
        assertEquals('z', stream.readChar());
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void testReadChar_5() throws java.io.IOException {
        char[] input = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        SimpleCharStream stream = new SimpleCharStream(input, 0, 13, 0, 13);
        assertEquals('a', stream.readChar());
        assertEquals('b', stream.readChar());
        assertEquals('c', stream.readChar());
        assertEquals('d', stream.readChar());
        assertEquals('e', stream.readChar());
        assertEquals('f', stream.readChar());
        assertEquals('g', stream.readChar());
        assertEquals('h', stream.readChar());
        assertEquals('i', stream.readChar());
        assertEquals('j', stream.readChar());
        assertEquals('k', stream.readChar());
        assertEquals('l', stream.readChar());
        assertEquals('m', stream.readChar());
        assertEquals('