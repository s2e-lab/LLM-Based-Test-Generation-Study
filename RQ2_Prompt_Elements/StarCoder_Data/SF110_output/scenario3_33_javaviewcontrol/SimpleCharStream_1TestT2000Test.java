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
    * It tests the case when the character is a letter.
    */
    @Test
    void testReadChar_1() throws java.io.IOException {
        // Arrange
        final String input = "a";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('a', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a digit.
    */
    @Test
    void testReadChar_2() throws java.io.IOException {
        // Arrange
        final String input = "1";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('1', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a special character.
    */
    @Test
    void testReadChar_3() throws java.io.IOException {
        // Arrange
        final String input = "$";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('$', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a white space.
    */
    @Test
    void testReadChar_4() throws java.io.IOException {
        // Arrange
        final String input = " ";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals(' ', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a new line.
    */
    @Test
    void testReadChar_5() throws java.io.IOException {
        // Arrange
        final String input = "\n";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('\n', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a carriage return.
    */
    @Test
    void testReadChar_6() throws java.io.IOException {
        // Arrange
        final String input = "\r";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('\r', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a tab.
    */
    @Test
    void testReadChar_7() throws java.io.IOException {
        // Arrange
        final String input = "\t";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('\t', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a backslash.
    */
    @Test
    void testReadChar_8() throws java.io.IOException {
        // Arrange
        final String input = "\\";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('\\', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a single quote.
    */
    @Test
    void testReadChar_9() throws java.io.IOException {
        // Arrange
        final String input = "'";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('\'', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a double quote.
    */
    @Test
    void testReadChar_10() throws java.io.IOException {
        // Arrange
        final String input = "\"";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('"', actual);
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
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a letter.
    */
    @Test
    void testReadChar_1() throws java.io.IOException {
        // Arrange
        final String input = "a";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('a', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a digit.
    */
    @Test
    void testReadChar_2() throws java.io.IOException {
        // Arrange
        final String input = "1";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('1', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a special character.
    */
    @Test
    void testReadChar_3() throws java.io.IOException {
        // Arrange
        final String input = "$";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('$', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a white space.
    */
    @Test
    void testReadChar_4() throws java.io.IOException {
        // Arrange
        final String input = " ";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals(' ', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a new line.
    */
    @Test
    void testReadChar_5() throws java.io.IOException {
        // Arrange
        final String input = "\n";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('\n', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a carriage return.
    */
    @Test
    void testReadChar_6() throws java.io.IOException {
        // Arrange
        final String input = "\r";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('\r', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a tab.
    */
    @Test
    void testReadChar_7() throws java.io.IOException {
        // Arrange
        final String input = "\t";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('\t', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a backslash.
    */
    @Test
    void testReadChar_8() throws java.io.IOException {
        // Arrange
        final String input = "\\";
        final SimpleCharStream simpleCharStream = new SimpleCharStream(input);

        // Act
        final char actual = simpleCharStream.readChar();

        // Assert
        assertEquals('\\', actual);
    }

    /**
    * Test case for the {@link SimpleCharStream#readChar()} method.
    * It tests the case when the character is a single quote.
    */
    @Test
    void testReadChar_9() throws java.io.IOException {
        // Arrange
        final String input = "'";
        final SimpleCharStream