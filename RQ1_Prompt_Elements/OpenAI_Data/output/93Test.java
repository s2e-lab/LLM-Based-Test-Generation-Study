// EncodeTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link Encode}.
* It contains ten test cases for the {@link Encode#encode()} method.
*/
class EncodeTest {


    @Test
    void testEncode() {
        assertEquals("B", Encode.encode("a"));
        assertEquals("C", Encode.encode("b"));
        assertEquals("D", Encode.encode("c"));
        assertEquals("F", Encode.encode("e"));
        assertEquals("G", Encode.encode("f"));
        assertEquals("H", Encode.encode("g"));
        assertEquals("J", Encode.encode("i"));
        assertEquals("K", Encode.encode("j"));
        assertEquals("L", Encode.encode("k"));
        assertEquals("N", Encode.encode("m"));
        assertEquals("P", Encode.encode("o"));
        assertEquals("Q", Encode.encode("p"));
        assertEquals("R", Encode.encode("q"));
        assertEquals("S", Encode.encode("r"));
        assertEquals("T", Encode.encode("s"));
        assertEquals("V", Encode.encode("u"));
        assertEquals("W", Encode.encode("v"));
        assertEquals("X", Encode.encode("w"));
        assertEquals("Y", Encode.encode("x"));
        assertEquals("Z", Encode.encode("y"));
        assertEquals("B", Encode.encode("A"));
        assertEquals("C", Encode.encode("B"));
        assertEquals("D", Encode.encode("C"));
        assertEquals("F", Encode.encode("E"));
        assertEquals("G", Encode.encode("F"));
        assertEquals("H", Encode.encode("G"));
        assertEquals("J", Encode.encode("I"));
        assertEquals("K", Encode.encode("J"));
        assertEquals("L", Encode.encode("K"));
        assertEquals("N", Encode.encode("M"));
        assertEquals("P", Encode.encode("O"));
        assertEquals("Q", Encode.encode("P"));
        assertEquals("R", Encode.encode("Q"));
        assertEquals("S", Encode.encode("R"));
        assertEquals("T", Encode.encode("S"));
        assertEquals("V", Encode.encode("U"));
        assertEquals("W", Encode.encode("V"));
        assertEquals("X", Encode.encode("W"));
        assertEquals("Y", Encode.encode("X"));
        assertEquals("Z", Encode.encode("Y"));
        assertEquals("B", Encode.encode("z"));
        assertEquals("C", Encode.encode("Z"));
        assertEquals("D", Encode.encode("Y"));
        assertEquals("F", Encode.encode("W"));
        assertEquals("G", Encode.encode("V"));
        assertEquals("H", Encode.encode("U"));
        assertEquals("J", Encode.encode("S"));
        assertEquals("K", Encode.encode("R"));
        assertEquals("L", Encode.encode("Q"));
        assertEquals("N", Encode.encode("O"));
        assertEquals("P", Encode.encode("M"));
        assertEquals("Q", Encode.encode("L"));
        assertEquals("R", Encode.encode("K"));
        assertEquals("S", Encode.encode("J"));
        assertEquals("T", Encode.encode("I"));
        assertEquals("V", Encode.encode("G"));
        assertEquals("W", Encode.encode("F"));
        assertEquals("X", Encode.encode("E"));
        assertEquals("Y", Encode.encode("D"));
        assertEquals("Z",