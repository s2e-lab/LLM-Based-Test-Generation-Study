// ChangeBaseTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link ChangeBase}.
* It contains ten test cases for the {@link ChangeBase#changeBase()} method.
*/
class ChangeBaseTest {


    @Test
    void testChangeBase() {
        assertEquals("1010", ChangeBase.changeBase(10, 2));
        assertEquals("1010", ChangeBase.changeBase(10, 2));
        assertEquals("1010", ChangeBase.changeBase(10, 2));
        assertEquals("1010", ChangeBase.changeBase(10, 2));
        assertEquals("1010", ChangeBase.changeBase(10, 2));
        assertEquals("1010", ChangeBase.changeBase(10, 2));
        assertEquals("1010", ChangeBase.changeBase(10, 2));
        assertEquals("1010", ChangeBase.changeBase(10, 2));
        assertEquals("1010", ChangeBase.changeBase(10, 2));
        assertEquals("1010", ChangeBase.changeBase(10, 2));
    }
}