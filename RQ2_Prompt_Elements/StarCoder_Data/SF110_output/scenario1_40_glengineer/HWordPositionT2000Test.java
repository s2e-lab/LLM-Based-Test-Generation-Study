// HWordPositionTest.java
package glengineer.positions;

import glengineer.blocks.Block;
import glengineer.blocks.CharTable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HWordPosition}.
* It contains ten unit test cases for the {@link HWordPosition#textAt(CharTable)} method.
*/
class HWordPositionTest {

    @Test
    void testTextAt() {
        CharTable ct = new CharTable(10, 10);
        ct.set(new Block(0, 0, 10, 10), 'a');
        ct.set(new Block(1, 0, 9, 10), 'b');
        ct.set(new Block(2, 0, 8, 10), 'c');
        ct.set(new Block(3, 0, 7, 10), 'd');
        ct.set(new Block(4, 0, 6, 10), 'e');
        ct.set(new Block(5, 0, 5, 10), 'f');
        ct.set(new Block(6, 0, 4, 10), 'g');
        ct.set(new Block(7, 0, 3, 10), 'h');
        ct.set(new Block(8, 0, 2, 10), 'i');
        ct.set(new Block(9, 0, 1, 10), 'j');
        ct.set(new Block(10, 0, 0, 10), 'k');
        ct.set(new Block(11, 0, -1, 10), 'l');
        ct.set(new Block(12, 0, -2, 10), 'm');
        ct.set(new Block(13, 0, -3, 10), 'n');
        ct.set(new Block(14, 0, -4, 10), 'o');
        ct.set(new Block(15, 0, -5, 10), 'p');
        ct.set(new Block(16, 0, -6, 10), 'q');
        ct.set(new Block(17, 0, -7, 10), 'r');
        ct.set(new Block(18, 0, -8, 10), 's');
        ct.set(new Block(19, 0, -9, 10), 't');
        ct.set(new Block(20, 0, -10, 10), 'u');
        ct.set(new Block(21, 0, -11, 10), 'v');
        ct.set(new Block(22, 0, -12, 10), 'w');
        ct.set(new Block(23, 0, -13, 10), 'x');
        ct.set(new Block(24, 0, -14, 10), 'y');
        ct.set(new Block(25, 0, -15, 10), 'z');
        ct.set(new Block(26, 0, -16, 10), 'A');
        ct.set(new Block(27, 0, -17, 10), 'B');
        ct.set(new Block(28, 0, -18, 10), 'C');
        ct.set(new Block(29, 0, -19, 10), 'D');
        ct.set(new Block(30, 0, -20, 10), 'E');
        ct.set(new Block(31, 0, -21, 10), 'F');
        ct.set(new Block(32, 0, -22, 10), 'G');
        ct.set(new Block(33, 0, -23, 10), 'H');
        ct.set(new Block(34, 0, -24, 10), 'I');
        ct.set(new Block(35, 0, -25, 10), 'J');
        ct.set(new Block(36, 0, -26, 10), 'K');
        ct.set(new Block(37, 0, -27, 10), 'L');
        ct.set(new Block(38, 0, -28, 10), 'M');
        ct.set(new Block(39, 0, -29, 10), 'N');
        ct.set(new Block(40, 0, -30, 10), 'O');
        ct.set(new Block(41, 0, -31, 10), 'P');
        ct.set(new Block(42, 0, -32, 10), 'Q');
        ct.set(new Block(43, 0, -33, 10), 'R');
        ct.set(new Block(44, 0, -34, 10), 'S');
        ct.set(new Block(45, 0, -35, 10), 'T');
        ct.set(new Block(46, 0, -36, 10), 'U');
        ct.set(new Block(47, 0, -37, 10), 'V');
        ct.set(new Block(48, 0, -38, 10), 'W');
        ct.set(new Block(49, 0, -39, 10), 'X');
        ct.set(new Block(50, 0, -40, 10), 'Y');
        ct.set(new Block(51, 0, -41, 10), 'Z');
        ct.set(new Block(52, 0, -42, 10), ' ');
        ct.set(new Block(53, 0, -43, 10), ' ');
        ct.set(new Block(54, 0, -44, 10), ' ');
        ct.set(new Block(55, 0, -45, 10), ' ');
        ct.set(new Block(56, 0, -46, 10), ' ');
        ct.set(new Block(57, 0, -47, 10), ' ');
        ct.set(new Block(58, 0, -48, 10), ' ');
        ct.set(new Block(59, 0, -49, 10), ' ');
        ct.set(new Block(60, 0, -50, 10), ' ');
        ct.set(new Block(61, 0, -51, 10), ' ');
        ct.set(new Block(62, 0, -52, 10), ' ');
        ct.set(new Block(63, 0, -53, 10), ' ');
        ct.set(new Block(64, 0, -54, 10), ' ');
        ct.set(new Block(65, 0, -55, 10), ' ');
        ct.set(new Block(66, 0, -56, 10), ' ');
        ct.set(new Block(67, 0, -57, 10), ' ');
        ct.set(new Block(68, 0, -58, 10), ' ');
        ct.set(new Block(69, 0, -59, 10), ' ');
        ct.set(new Block(70, 0, -60, 10), ' ');
        ct.set(new Block(71, 0, -61, 10), ' ');
        ct.set(new Block(72, 0, -62, 10), ' ');
        ct.set(new Block(73, 0, -63, 10), ' ');
        ct.set(new Block(74, 0, -64, 10), ' ');
        ct.set(new Block(75, 0, -65, 10), ' ');
        ct.set(new Block(76, 0, -66, 10), ' ');
        ct.set(new Block(77, 0, -67, 10), ' ');
        ct.set(new Block(78, 0, -68, 10), ' ');
        ct.set(new Block(79, 0, -69, 10), ' ');
        ct.set(new Block(80, 0, -70, 10), ' ');
        ct.set(new Block