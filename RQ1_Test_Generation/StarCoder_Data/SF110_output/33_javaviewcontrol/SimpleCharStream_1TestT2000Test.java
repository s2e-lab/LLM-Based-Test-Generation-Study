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
    void test_readChar_001() {
        // Arrange
        final String input = "";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 4096;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        final char actual = charStream.readChar();

        // Assert
        assertEquals('\u0000', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void test_readChar_002() {
        // Arrange
        final String input = "a";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 4096;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        final char actual = charStream.readChar();

        // Assert
        assertEquals('a', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void test_readChar_003() {
        // Arrange
        final String input = "ab";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 4096;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        final char actual = charStream.readChar();

        // Assert
        assertEquals('a', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void test_readChar_004() {
        // Arrange
        final String input = "abc";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 4096;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        final char actual = charStream.readChar();

        // Assert
        assertEquals('a', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void test_readChar_005() {
        // Arrange
        final String input = "abcd";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 4096;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        final char actual = charStream.readChar();

        // Assert
        assertEquals('a', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void test_readChar_006() {
        // Arrange
        final String input = "abcde";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 4096;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        final char actual = charStream.readChar();

        // Assert
        assertEquals('a', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void test_readChar_007() {
        // Arrange
        final String input = "abcdef";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 4096;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        final char actual = charStream.readChar();

        // Assert
        assertEquals('a', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void test_readChar_008() {
        // Arrange
        final String input = "abcdefg";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 4096;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        final char actual = charStream.readChar();

        // Assert
        assertEquals('a', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the buffer is not empty.
    */
    @Test
    void test_readChar_009() {
        // Arrange
        final String input = "abcdefgh";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 4096;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        final char actual = charStream.readChar();

        // Assert
        assertEquals('a', actual);
    }
}
