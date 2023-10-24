// CheckIfLastCharIsALetterTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CheckIfLastCharIsALetter}.
* It contains ten unit test cases for the {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)} method.
*/
class CheckIfLastCharIsALetterTest {

    /**
    * Test case for {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)}.
    *
    * If the given string is empty, the method should return False.
    */
    @Test
    void testCheckIfLastCharIsALetter1() {
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter(""));
    }

    /**
    * Test case for {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)}.
    *
    * If the given string is not empty, the method should return True if the last character is an alphabetical character and is not a part of a word, and False otherwise.
    */
    @Test
    void testCheckIfLastCharIsALetter2() {
        assertEquals(true, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
    }

    /**
    * Test case for {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)}.
    *
    * If the given string is not empty, the method should return True if the last character is an alphabetical character and is not a part of a word, and False otherwise.
    */
    @Test
    void testCheckIfLastCharIsALetter3() {
        assertEquals(true, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e"));
    }

    /**
    * Test case for {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)}.
    *
    * If the given string is not empty, the method should return True if the last character is an alphabetical character and is not a part of a word, and False otherwise.
    */
    @Test
    void testCheckIfLastCharIsALetter4() {
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pi e "));
    }

    /**
    * Test case for {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)}.
    *
    * If the given string is not empty, the method should return True if the last character is an alphabetical character and is not a part of a word, and False otherwise.
    */
    @Test
    void testCheckIfLastCharIsALetter5() {
        assertEquals(true, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("A"));
    }

    /**
    * Test case for {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)}.
    *
    * If the given string is not empty, the method should return True if the last character is an alphabetical character and is not a part of a word, and False otherwise.
    */
    @Test
    void testCheckIfLastCharIsALetter6() {
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie "));
    }

    /**
    * Test case for {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)}.
    *
    * If the given string is not empty, the method should return True if the last character is an alphabetical character and is not a part of a word, and False otherwise.
    */
    @Test
    void testCheckIfLastCharIsALetter7() {
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("Pumpkin pie 1"));
    }

    /**
    * Test case for {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)}.
    *
    * If the given string is not empty, the method should return True if the last character is an alphabetical character and is not a part of a word, and False otherwise.
    */
    @Test
    void testCheckIfLastCharIsALetter8() {
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee"));
    }

    /**
    * Test case for {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)}.
    *
    * If the given string is not empty, the method should return True if the last character is an alphabetical character and is not a part of a word, and False otherwise.
    */
    @Test
    void testCheckIfLastCharIsALetter9() {
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("eeeee e "));
    }

    /**
    * Test case for {@link CheckIfLastCharIsALetter#checkIfLastCharIsALetter(String)}.
    *
    * If the given string is not empty, the method should return True if the last character is an alphabetical character and is not a part of a word, and False otherwise.
    */
    @Test
    void testCheckIfLastCharIsALetter10() {
        assertEquals(false, CheckIfLastCharIsALetter.checkIfLastCharIsALetter("apple pie"));
    }
}
