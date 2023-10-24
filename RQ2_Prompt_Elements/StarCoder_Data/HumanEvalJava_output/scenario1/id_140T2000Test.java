// FixSpacesTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FixSpaces}.
* It contains ten unit test cases for the {@link FixSpaces#fixSpaces(String)} method.
*/
class FixSpacesTest {

    @Test
    void testFixSpaces1() {
        String text = "Hello World";
        String expected = "Hello_World";
        assertEquals(expected, FixSpaces.fixSpaces(text));
    }

    @Test
    void testFixSpaces2() {
        String text = "Hello  World";
        String expected = "Hello_World";
        assertEquals(expected, FixSpaces.fixSpaces(text));
    }

    @Test
    void testFixSpaces3() {
        String text = "Hello   World";
        String expected = "Hello_World";
        assertEquals(expected, FixSpaces.fixSpaces(text));
    }

    @Test
    void testFixSpaces4() {
        String text = "Hello    World";
        String expected = "Hello_World";
        assertEquals(expected, FixSpaces.fixSpaces(text));
    }

    @Test
    void testFixSpaces5() {
        String text = "Hello     World";
        String expected = "Hello_World";
        assertEquals(expected, FixSpaces.fixSpaces(text));
    }

    @Test
    void testFixSpaces6() {
        String text = "Hello      World";
        String expected = "Hello_World";
        assertEquals(expected, FixSpaces.fixSpaces(text));
    }

    @Test
    void testFixSpaces7() {
        String text = "Hello       World";
        String expected = "Hello_World";
        assertEquals(expected, FixSpaces.fixSpaces(text));
    }

    @Test
    void testFixSpaces8() {
        String text = "Hello        World";
        String expected = "Hello_World";
        assertEquals(expected, FixSpaces.fixSpaces(text));
    }

    @Test
    void testFixSpaces9() {
        String text = "Hello         World";
        String expected = "Hello_World";
        assertEquals(expected, FixSpaces.fixSpaces(text));
    }

    @Test
    void testFixSpaces10() {
        String text = "Hello          World";
        String expected = "Hello_World";
        assertEquals(expected, FixSpaces.fixSpaces(text));
    }
}
