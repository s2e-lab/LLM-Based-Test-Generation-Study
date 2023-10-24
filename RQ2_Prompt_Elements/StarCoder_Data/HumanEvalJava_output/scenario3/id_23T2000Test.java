// StrlenTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Strlen}.
* It contains ten unit test cases for the {@link Strlen#strlen(String)} method.
*/
class StrlenTest {

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("")
    * 0
    */
    @Test
    void testStrlenEmptyString() {
        assertEquals(0, Strlen.strlen(""));
    }

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("abc")
    * 3
    */
    @Test
    void testStrlenString() {
        assertEquals(3, Strlen.strlen("abc"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("")
    * 0
    */
    @Test
    void testStrlenEmptyString2() {
        assertEquals(0, Strlen.strlen(""));
    }

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("x")
    * 1
    */
    @Test
    void testStrlenString2() {
        assertEquals(1, Strlen.strlen("x"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("asdasnakj")
    * 9
    */
    @Test
    void testStrlenString3() {
        assertEquals(9, Strlen.strlen("asdasnakj"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("")
    * 0
    */
    @Test
    void testStrlenEmptyString3() {
        assertEquals(0, Strlen.strlen(""));
    }

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("x")
    * 1
    */
    @Test
    void testStrlenString4() {
        assertEquals(1, Strlen.strlen("x"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("asdasnakj")
    * 9
    */
    @Test
    void testStrlenString5() {
        assertEquals(9, Strlen.strlen("asdasnakj"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("")
    * 0
    */
    @Test
    void testStrlenEmptyString4() {
        assertEquals(0, Strlen.strlen(""));
    }

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("x")
    * 1
    */
    @Test
    void testStrlenString6() {
        assertEquals(1, Strlen.strlen("x"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("asdasnakj")
    * 9
    */
    @Test
    void testStrlenString7() {
        assertEquals(9, Strlen.strlen("asdasnakj"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("")
    * 0
    */
    @Test
    void testStrlenEmptyString5() {
        assertEquals(0, Strlen.strlen(""));
    }

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("x")
    * 1
    */
    @Test
    void testStrlenString8() {
        assertEquals(1, Strlen.strlen("x"));
    }

    /**
    * Test case for {@link Strlen#strlen(String)}
    *
    * > strlen("asdasnakj")
    * 9
    */
    @Test
    void testStrlenString9() {
        assertEquals(9, Strlen.strlen("asdasnakj"));
    }
}
