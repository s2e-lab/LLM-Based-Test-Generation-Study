// IsNestedTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IsNested}.
* It contains ten unit test cases for the {@link IsNested#isNested(String)} method.
*/
class IsNestedTest {

    /**
     * Test case for the {@link IsNested#isNested(String)} method.
     * It checks if the method returns True if and only if there is a valid subsequence of brackets
     * where at least one bracket in the subsequence is nested.
     */
    @Test
    void testIsNested() {
        String string = "[]";
        assertTrue(IsNested.isNested(string));
        string = "[[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]]";
        assertTrue(IsNested.isNested(string));
        string = "[[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]][[]