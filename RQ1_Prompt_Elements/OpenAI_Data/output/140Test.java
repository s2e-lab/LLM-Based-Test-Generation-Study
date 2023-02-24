// FixSpacesTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link FixSpaces}.
* It contains ten test cases for the {@link FixSpaces#fixSpaces()} method.
*/
class FixSpacesTest {


    @Test
    void testFixSpaces() {
        assertEquals("", FixSpaces.fixSpaces(""));
        assertEquals("a", FixSpaces.fixSpaces("a"));
        assertEquals("a", FixSpaces.fixSpaces(" a"));
        assertEquals("a", FixSpaces.fixSpaces("a "));
        assertEquals("a", FixSpaces.fixSpaces(" a "));
        assertEquals("a", FixSpaces.fixSpaces("  a"));
        assertEquals("a", FixSpaces.fixSpaces("a  "));
        assertEquals("a", FixSpaces.fixSpaces("  a  "));
        assertEquals("a-b", FixSpaces.fixSpaces("a b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a  b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a   b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a    b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a     b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a      b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a       b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a        b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a         b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a          b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a           b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a            b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a             b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a              b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a               b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                 b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                  b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                   b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                    b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                     b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                      b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                       b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                        b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                         b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                          b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                           b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                            b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                             b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                              b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                               b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                                b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                                 b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                                  b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                                   b"));
        assertEquals("a-b", FixSpaces.fixSpaces("a                                    b"));
        assertEquals("a-b", FixSpaces.fixSpaces("