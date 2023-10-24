// HWordPosition_5Test.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HWordPosition}.
* It contains ten unit test cases for the {@link HWordPosition#textAt(CharTable)} method.
*/
class HWordPosition_5Test {

    /**
    * Tests the {@link HWordPosition#textAt(CharTable)} method.
    */
    @Test
    void testTextAt() {
        CharTable ct = new CharTable(10, 10);
        ct.setCharAt(new CharPosition1(0, 0), 'a');
        ct.setCharAt(new CharPosition1(1, 0), 'b');
        ct.setCharAt(new CharPosition1(2, 0), 'c');
        ct.setCharAt(new CharPosition1(3, 0), 'd');
        ct.setCharAt(new CharPosition1(4, 0), 'e');
        ct.setCharAt(new CharPosition1(5, 0), 'f');
        ct.setCharAt(new CharPosition1(6, 0), 'g');
        ct.setCharAt(new CharPosition1(7, 0), 'h');
        ct.setCharAt(new CharPosition1(8, 0), 'i');
        ct.setCharAt(new CharPosition1(9, 0), 'j');
        ct.setCharAt(new CharPosition1(0, 1), 'k');
        ct.setCharAt(new CharPosition1(1, 1), 'l');
        ct.setCharAt(new CharPosition1(2, 1), 'm');
        ct.setCharAt(new CharPosition1(3, 1), 'n');
        ct.setCharAt(new CharPosition1(4, 1), 'o');
        ct.setCharAt(new CharPosition1(5, 1), 'p');
        ct.setCharAt(new CharPosition1(6, 1), 'q');
        ct.setCharAt(new CharPosition1(7, 1), 'r');
        ct.setCharAt(new CharPosition1(8, 1), 's');
        ct.setCharAt(new CharPosition1(9, 1), 't');
        ct.setCharAt(new CharPosition1(0, 2), 'u');
        ct.setCharAt(new CharPosition1(1, 2), 'v');
        ct.setCharAt(new CharPosition1(2, 2), 'w');
        ct.setCharAt(new CharPosition1(3, 2), 'x');
        ct.setCharAt(new CharPosition1(4, 2), 'y');
        ct.setCharAt(new CharPosition1(5, 2), 'z');
        ct.setCharAt(new CharPosition1(6, 2), 'A');
        ct.setCharAt(new CharPosition1(7, 2), 'B');
        ct.setCharAt(new CharPosition1(8, 2), 'C');
        ct.setCharAt(new CharPosition1(9, 2), 'D');
        ct.setCharAt(new CharPosition1(0, 3), 'E');
        ct.setCharAt(new CharPosition1(1, 3), 'F');
        ct.setCharAt(new CharPosition1(2, 3), 'G');
        ct.setCharAt(new CharPosition1(3, 3), 'H');
        ct.setCharAt(new CharPosition1(4, 3), 'I');
        ct.setCharAt(new CharPosition1(5, 3), 'J');
        ct.setCharAt(new CharPosition1(6, 3), 'K');
        ct.setCharAt(new CharPosition1(7, 3), 'L');
        ct.setCharAt(new CharPosition1(8, 3), 'M');
        ct.setCharAt(new CharPosition1(9, 3), 'N');
        ct.setCharAt(new CharPosition1(0, 4), 'O');
        ct.setCharAt(new CharPosition1(1, 4), 'P');
        ct.setCharAt(new CharPosition1(2, 4), 'Q');
        ct.setCharAt(new CharPosition1(3, 4), 'R');
        ct.setCharAt(new CharPosition1(4, 4), 'S');
        ct.setCharAt(new CharPosition1(5, 4), 'T');
        ct.setCharAt(new CharPosition1(6, 4), 'U');
        ct.setCharAt(new CharPosition1(7, 4), 'V');
        ct.setCharAt(new CharPosition1(8, 4), 'W');
        ct.setCharAt(new CharPosition1(9, 4), 'X');
        ct.setCharAt(new CharPosition1(0, 5), 'Y');
        ct.setCharAt(new CharPosition1(1, 5), 'Z');
        ct.setCharAt(new CharPosition1(2, 5), ' ');
        ct.setCharAt(new CharPosition1(3, 5), ' ');
        ct.setCharAt(new CharPosition1(4, 5), ' ');
        ct.setCharAt(new CharPosition1(5, 5), ' ');
        ct.setCharAt(new CharPosition1(6, 5), ' ');
        ct.setCharAt(new CharPosition1(7, 5), ' ');
        ct.setCharAt(new CharPosition1(8, 5), ' ');
        ct.setCharAt(new CharPosition1(9, 5), ' ');
        ct.setCharAt(new CharPosition1(0, 6), ' ');
        ct.setCharAt(new CharPosition1(1, 6), ' ');
        ct.setCharAt(new CharPosition1(2, 6), ' ');
        ct.setCharAt(new CharPosition1(3, 6), ' ');
        ct.setCharAt(new CharPosition1(4, 6), ' ');
        ct.setCharAt(new CharPosition1(5, 6), ' ');
        ct.setCharAt(new CharPosition1(6, 6), ' ');
        ct.setCharAt(new CharPosition1(7, 6), ' ');
        ct.setCharAt(new CharPosition1(8, 6), ' ');
        ct.setCharAt(new CharPosition1(9, 6), ' ');
        ct.setCharAt(new CharPosition1(0, 7), ' ');
        ct.setCharAt(new CharPosition1(1, 7), ' ');
        ct.setCharAt(new CharPosition1(2, 7), ' ');
        ct.setCharAt(new CharPosition1(3, 7), ' ');
        ct.setCharAt(new CharPosition1(4, 7), ' ');
        ct.setCharAt(new CharPosition1(5, 7), ' ');
        ct.setCharAt(new CharPosition1(6, 7), ' ');
        ct.setCharAt(new CharPosition1(7, 7), ' ');
        ct.setCharAt(new CharPosition1(8, 7), ' ');
        ct.setCharAt(new CharPosition1(9, 7), ' ');
        ct.setCharAt(new CharPosition1(0, 8), ' ');
        ct.setCharAt(new CharPosition1(1, 8), ' ');
        ct.setCharAt(new CharPosition1(2, 8), ' ');
        ct.setCharAt(new CharPosition1(3, 8), ' ');
        ct.setCharAt(new CharPosition1(4, 8), ' ');
        ct.setCharAt(new CharPosition1(5, 8), ' ');
        ct.setCharAt(new CharPosition1(6, 8), ' ');
        ct.setCharAt(new CharPosition1(7, 8), ' ');
        ct.setCharAt(new CharPosition1(8, 8), ' ');
        ct.setCharAt(new CharPosition1(9, 8), ' ');
        ct.setCharAt(new CharPosition1(0, 9), ' ');
        ct.setCharAt(new CharPosition1(1, 9), ' ');
        ct.setCharAt(new CharPosition1(2, 9), ' ');
        ct.setCharAt(new CharPosition1(3, 9), ' ');
        ct.setCharAt(new CharPosition1(4, 9), ' ');
        ct.setCharAt(new CharPosition1(5, 9), ' ');
        ct.setCharAt(new CharPosition1(6, 9), ' ');
        ct.setCharAt(new CharPosition1(7, 9), ' ');
        ct.setCharAt(new CharPosition1(8, 9), ' ');
        ct.setCharAt(new CharPosition1(9, 9), ' ');