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

    @Test
    void test_readChar_0() throws java.io.IOException {
        char[] input = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        SimpleCharStream simpleCharStream = new SimpleCharStream(input, 0, 13, 0, 13);
        assertEquals('a', simpleCharStream.readChar());
        assertEquals('b', simpleCharStream.readChar());
        assertEquals('c', simpleCharStream.readChar());
        assertEquals('d', simpleCharStream.readChar());
        assertEquals('e', simpleCharStream.readChar());
        assertEquals('f', simpleCharStream.readChar());
        assertEquals('g', simpleCharStream.readChar());
        assertEquals('h', simpleCharStream.readChar());
        assertEquals('i', simpleCharStream.readChar());
        assertEquals('j', simpleCharStream.readChar());
        assertEquals('k', simpleCharStream.readChar());
        assertEquals('l', simpleCharStream.readChar());
        assertEquals('m', simpleCharStream.readChar());
        assertEquals('n', simpleCharStream.readChar());
        assertEquals('o', simpleCharStream.readChar());
        assertEquals('p', simpleCharStream.readChar());
        assertEquals('q', simpleCharStream.readChar());
        assertEquals('r', simpleCharStream.readChar());
        assertEquals('s', simpleCharStream.readChar());
        assertEquals('t', simpleCharStream.readChar());
        assertEquals('u', simpleCharStream.readChar());
        assertEquals('v', simpleCharStream.readChar());
        assertEquals('w', simpleCharStream.readChar());
        assertEquals('x', simpleCharStream.readChar());
        assertEquals('y', simpleCharStream.readChar());
        assertEquals('z', simpleCharStream.readChar());
    }

    @Test
    void test_readChar_1() throws java.io.IOException {
        char[] input = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        SimpleCharStream simpleCharStream = new SimpleCharStream(input, 0, 13, 0, 13);
        assertEquals('a', simpleCharStream.readChar());
        assertEquals('b', simpleCharStream.readChar());
        assertEquals('c', simpleCharStream.readChar());
        assertEquals('d', simpleCharStream.readChar());
        assertEquals('e', simpleCharStream.readChar());
        assertEquals('f', simpleCharStream.readChar());
        assertEquals('g', simpleCharStream.readChar());
        assertEquals('h', simpleCharStream.readChar());
        assertEquals('i', simpleCharStream.readChar());
        assertEquals('j', simpleCharStream.readChar());
        assertEquals('k', simpleCharStream.readChar());
        assertEquals('l', simpleCharStream.readChar());
        assertEquals('m', simpleCharStream.readChar());
        assertEquals('n', simpleCharStream.readChar());
        assertEquals('o', simpleCharStream.readChar());
        assertEquals('p', simpleCharStream.readChar());
        assertEquals('q', simpleCharStream.readChar());
        assertEquals('r', simpleCharStream.readChar());
        assertEquals('s', simpleCharStream.readChar());
        assertEquals('t', simpleCharStream.readChar());
        assertEquals('u', simpleCharStream.readChar());
        assertEquals('v', simpleCharStream.readChar());
        assertEquals('w', simpleCharStream.readChar());
        assertEquals('x', simpleCharStream.readChar());
        assertEquals('y', simpleCharStream.readChar());
        assertEquals('z', simpleCharStream.readChar());
    }

    @Test
    void test_readChar_2() throws java.io.IOException {
        char[] input = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        SimpleCharStream simpleCharStream = new SimpleCharStream(input, 0, 13, 0, 13);
        assertEquals('a', simpleCharStream.readChar());
        assertEquals('b', simpleCharStream.readChar());
        assertEquals('c', simpleCharStream.readChar());
        assertEquals('d', simpleCharStream.readChar());
        assertEquals('e', simpleCharStream.readChar());
        assertEquals('f', simpleCharStream.readChar());
        assertEquals('g', simpleCharStream.readChar());
        assertEquals('h', simpleCharStream.readChar());
        assertEquals('i', simpleCharStream.readChar());
        assertEquals('j', simpleCharStream.readChar());
        assertEquals('k', simpleCharStream.readChar());
        assertEquals('l', simpleCharStream.readChar());
        assertEquals('m', simpleCharStream.readChar());
        assertEquals('n', simpleCharStream.readChar());
        assertEquals('o', simpleCharStream.readChar());
        assertEquals('p', simpleCharStream.readChar());
        assertEquals('q', simpleCharStream.readChar());
        assertEquals('r', simpleCharStream.readChar());
        assertEquals('s', simpleCharStream.readChar());
        assertEquals('t', simpleCharStream.readChar());
        assertEquals('u', simpleCharStream.readChar());
        assertEquals('v', simpleCharStream.readChar());
        assertEquals('w', simpleCharStream.readChar());
        assertEquals('x', simpleCharStream.readChar());
        assertEquals('y', simpleCharStream.readChar());
        assertEquals('z', simpleCharStream.readChar());
    }

    @Test
    void test_readChar_3() throws java.io.IOException {
        char[] input = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        SimpleCharStream simpleCharStream = new SimpleCharStream(input, 0, 13, 0, 13);
        assertEquals('a', simpleCharStream.readChar());
        assertEquals('b', simpleCharStream.readChar());
        assertEquals('c', simpleCharStream.readChar());
        assertEquals('d', simpleCharStream.readChar());
        assertEquals('e', simpleCharStream.readChar());
        assertEquals('f', simpleCharStream.readChar());
        assertEquals('g', simpleCharStream.readChar());
        assertEquals('h', simpleCharStream.readChar());
        assertEquals('i', simpleCharStream.readChar());
        assertEquals('j', simpleCharStream.readChar());
        assertEquals('k', simpleCharStream.readChar());
        assertEquals('l', simpleCharStream.readChar());
        assertEquals('m', simpleCharStream.readChar());
        assertEquals('n', simpleCharStream.readChar());
        assertEquals('o', simpleCharStream.readChar());
        assertEquals('p', simpleCharStream.readChar());
        assertEquals('q', simpleCharStream.readChar());
        assertEquals('r', simpleCharStream.readChar());
        assertEquals('s', simpleCharStream.readChar());
        assertEquals('t', simpleCharStream.readChar());
        assertEquals('u', simpleCharStream.readChar());
        assertEquals('v', simpleCharStream.readChar());
        assertEquals('w', simpleCharStream.readChar());
        assertEquals('x', simpleCharStream.readChar());
        assertEquals('y', simpleCharStream.readChar());
        assertEquals('z', simpleCharStream.readChar());
    }

    @Test
    void test_readChar_4() throws java.io.IOException {
        char[] input = new char[] { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
        SimpleCharStream simpleCharStream = new SimpleCharStream(input, 0, 13, 0, 13);
        assertEquals('a', simpleCharStream.readChar());
        assertEquals('b', simpleCharStream.readChar());
        assertEquals('c', simpleCharStream.readChar());
        assertEquals('d', simpleCharStream.readChar());
        assertEquals('e', simpleCharStream.readChar());
        assertEquals('f', simpleCharStream.readChar());
        assertEquals('g', simpleCharStream.readChar());
        assertEquals('h', simpleCharStream.readChar());
        assertEquals('i', simpleCharStream.readChar());
        assertEquals('j', simpleCharStream.readChar());
        assertEquals('k', simpleCharStream.readChar());
        assertEquals('l', simpleCharStream.readChar());
        assertEquals('m', simpleCharStream.readChar());
        assertEquals('n', simpleCharStream.readChar());
        assertEquals('o', simpleCharStream.readChar());
        assertEquals('p', simpleCharStream.readChar());
        assertEquals('q', simpleCharStream