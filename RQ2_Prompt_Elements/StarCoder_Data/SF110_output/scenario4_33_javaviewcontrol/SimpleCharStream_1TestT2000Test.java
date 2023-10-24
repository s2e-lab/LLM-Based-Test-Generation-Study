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
    * Test case for {@link SimpleCharStream#readChar()} method.
    */
    @Test
    void test_readChar_001() {
        // Arrange
        final String input = "1234567890";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 10;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        final char actual = charStream.readChar();

        // Assert
        assertEquals(input.charAt(0), actual);
    }

    /**
    * Test case for {@link SimpleCharStream#readChar()} method.
    */
    @Test
    void test_readChar_002() {
        // Arrange
        final String input = "1234567890";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 10;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        char actual = charStream.readChar();
        actual = charStream.readChar();

        // Assert
        assertEquals(input.charAt(1), actual);
    }

    /**
    * Test case for {@link SimpleCharStream#readChar()} method.
    */
    @Test
    void test_readChar_003() {
        // Arrange
        final String input = "1234567890";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 10;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        char actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();

        // Assert
        assertEquals(input.charAt(2), actual);
    }

    /**
    * Test case for {@link SimpleCharStream#readChar()} method.
    */
    @Test
    void test_readChar_004() {
        // Arrange
        final String input = "1234567890";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 10;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        char actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();

        // Assert
        assertEquals(input.charAt(3), actual);
    }

    /**
    * Test case for {@link SimpleCharStream#readChar()} method.
    */
    @Test
    void test_readChar_005() {
        // Arrange
        final String input = "1234567890";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 10;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        char actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();

        // Assert
        assertEquals(input.charAt(4), actual);
    }

    /**
    * Test case for {@link SimpleCharStream#readChar()} method.
    */
    @Test
    void test_readChar_006() {
        // Arrange
        final String input = "1234567890";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 10;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        char actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();

        // Assert
        assertEquals(input.charAt(5), actual);
    }

    /**
    * Test case for {@link SimpleCharStream#readChar()} method.
    */
    @Test
    void test_readChar_007() {
        // Arrange
        final String input = "1234567890";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 10;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        char actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();

        // Assert
        assertEquals(input.charAt(6), actual);
    }

    /**
    * Test case for {@link SimpleCharStream#readChar()} method.
    */
    @Test
    void test_readChar_008() {
        // Arrange
        final String input = "1234567890";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 10;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        char actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();

        // Assert
        assertEquals(input.charAt(7), actual);
    }

    /**
    * Test case for {@link SimpleCharStream#readChar()} method.
    */
    @Test
    void test_readChar_009() {
        // Arrange
        final String input = "1234567890";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 10;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        char actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();
        actual = charStream.readChar();

        // Assert
        assertEquals(input.charAt(8), actual);
    }
}

// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#readChar()} method.
*/
class SimpleCharStream_2Test {
		
    /**
    * Test case for {@link SimpleCharStream#readChar()} method.
    */
    @Test
    void test_readChar_001() {
        // Arrange
        final String input = "1234567890";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 10;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        final char actual = charStream.readChar();

        // Assert
        assertEquals(input.charAt(0), actual);
    }

    /**
    * Test case for {@link SimpleCharStream#readChar()} method.
    */
    @Test
    void test_readChar_002() {
        // Arrange
        final String input = "1234567890";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 10;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        char actual = charStream.readChar();
        actual = charStream.readChar();

        // Assert
        assertEquals(input.charAt(1), actual);
    }

    /**
    * Test case for {@link SimpleCharStream#readChar()} method.
    */
    @Test
    void test_readChar_003() {
        // Arrange
        final String input = "1234567890";
        final int startLine = 1;
        final int startColumn = 1;
        final int bufferSize = 10;
        final SimpleCharStream charStream = new SimpleCharStream(input, startLine, startColumn, bufferSize);

        // Act
        char