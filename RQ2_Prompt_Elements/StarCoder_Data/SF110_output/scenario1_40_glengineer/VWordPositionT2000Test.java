// VWordPositionTest.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VWordPosition}.
* It contains ten unit test cases for the {@link VWordPosition#textAt(CharTable)} method.
*/
class VWordPositionTest {

    @Test
    void testTextAt() {
        CharTable ct = new CharTable(10, 10);
        ct.set(new Block(0, 0, 10, 10), 'a');
        ct.set(new Block(0, 1, 10, 10), 'b');
        ct.set(new Block(0, 2, 10, 10), 'c');
        ct.set(new Block(0, 3, 10, 10), 'd');
        ct.set(new Block(0, 4, 10, 10), 'e');
        ct.set(new Block(0, 5, 10, 10), 'f');
        ct.set(new Block(0, 6, 10, 10), 'g');
        ct.set(new Block(0, 7, 10, 10), 'h');
        ct.set(new Block(0, 8, 10, 10), 'i');
        ct.set(new Block(0, 9, 10, 10), 'j');
        ct.set(new Block(1, 0, 10, 10), 'k');
        ct.set(new Block(1, 1, 10, 10), 'l');
        ct.set(new Block(1, 2, 10, 10), 'm');
        ct.set(new Block(1, 3, 10, 10), 'n');
        ct.set(new Block(1, 4, 10, 10), 'o');
        ct.set(new Block(1, 5, 10, 10), 'p');
        ct.set(new Block(1, 6, 10, 10), 'q');
        ct.set(new Block(1, 7, 10, 10), 'r');
        ct.set(new Block(1, 8, 10, 10), 's');
        ct.set(new Block(1, 9, 10, 10), 't');
        ct.set(new Block(2, 0, 10, 10), 'u');
        ct.set(new Block(2, 1, 10, 10), 'v');
        ct.set(new Block(2, 2, 10, 10), 'w');
        ct.set(new Block(2, 3, 10, 10), 'x');
        ct.set(new Block(2, 4, 10, 10), 'y');
        ct.set(new Block(2, 5, 10, 10), 'z');
        ct.set(new Block(2, 6, 10, 10), 'A');
        ct.set(new Block(2, 7, 10, 10), 'B');
        ct.set(new Block(2, 8, 10, 10), 'C');
        ct.set(new Block(2, 9, 10, 10), 'D');
        ct.set(new Block(3, 0, 10, 10), 'E');
        ct.set(new Block(3, 1, 10, 10), 'F');
        ct.set(new Block(3, 2, 10, 10), 'G');
        ct.set(new Block(3, 3, 10, 10), 'H');
        ct.set(new Block(3, 4, 10, 10), 'I');
        ct.set(new Block(3, 5, 10, 10), 'J');
        ct.set(new Block(3, 6, 10, 10), 'K');
        ct.set(new Block(3, 7, 10, 10), 'L');
        ct.set(new Block(3, 8, 10, 10), 'M');
        ct.set(new Block(3, 9, 10, 10), 'N');
        ct.set(new Block(4, 0, 10, 10), 'O');
        ct.set(new Block(4, 1, 10, 10), 'P');
        ct.set(new Block(4, 2, 10, 10), 'Q');
        ct.set(new Block(4, 3, 10, 10), 'R');
        ct.set(new Block(4, 4, 10, 10), 'S');
        ct.set(new Block(4, 5, 10, 10), 'T');
        ct.set(new Block(4, 6, 10, 10), 'U');
        ct.set(new Block(4, 7, 10, 10), 'V');
        ct.set(new Block(4, 8, 10, 10), 'W');
        ct.set(new Block(4, 9, 10, 10), 'X');
        ct.set(new Block(5, 0, 10, 10), 'Y');
        ct.set(new Block(5, 1, 10, 10), 'Z');
        ct.set(new Block(5, 2, 10, 10), ' ');
        ct.set(new Block(5, 3, 10, 10), ' ');
        ct.set(new Block(5, 4, 10, 10), ' ');
        ct.set(new Block(5, 5, 10, 10), ' ');
        ct.set(new Block(5, 6, 10, 10), ' ');
        ct.set(new Block(5, 7, 10, 10), ' ');
        ct.set(new Block(5, 8, 10, 10), ' ');
        ct.set(new Block(5, 9, 10, 10), ' ');
        ct.set(new Block(6, 0, 10, 10), ' ');
        ct.set(new Block(6, 1, 10, 10), ' ');
        ct.set(new Block(6, 2, 10, 10), ' ');
        ct.set(new Block(6, 3, 10, 10), ' ');
        ct.set(new Block(6, 4, 10, 10), ' ');
        ct.set(new Block(6, 5, 10, 10), ' ');
        ct.set(new Block(6, 6, 10, 10), ' ');
        ct.set(new Block(6, 7, 10, 10), ' ');
        ct.set(new Block(6, 8, 10, 10), ' ');
        ct.set(new Block(6, 9, 10, 10), ' ');
        ct.set(new Block(7, 0, 10, 10), ' ');
        ct.set(new Block(7, 1, 10, 10), ' ');
        ct.set(new Block(7, 2, 10, 10), ' ');
        ct.set(new Block(7, 3, 10, 10), ' ');
        ct.set(new Block(7, 4, 10, 10), ' ');
        ct.set(new Block(7, 5, 10, 10), ' ');
        ct.set(new Block(7, 6, 10, 10), ' ');
        ct.set(new Block(7, 7, 10, 10), ' ');
        ct.set(new Block(7, 8, 10, 10), ' ');
        ct.set(new Block(7, 9, 10, 10), ' ');
        ct.set(new Block(8, 0, 10, 10), ' ');
        ct.set(new Block(8, 1, 10, 10), ' ');
        ct.set(new Block(8, 2, 10, 10), ' ');
        ct.set(new Block(8, 3,