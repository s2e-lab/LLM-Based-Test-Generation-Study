// VerticalBlock_1Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains ten unit test cases for the {@link VerticalBlock#extractParallelSubblocks()} method.
*/
class VerticalBlock_1Test {

    @Test
    void extractParallelSubblocks_1() {
        // Arrange
        Scheme scheme = new Scheme(10, 10);
        scheme.setCharAt(new CharPosition(0, 0), 'a');
        scheme.setCharAt(new CharPosition(1, 0), 'b');
        scheme.setCharAt(new CharPosition(2, 0), 'c');
        scheme.setCharAt(new CharPosition(3, 0), 'd');
        scheme.setCharAt(new CharPosition(4, 0), 'e');
        scheme.setCharAt(new CharPosition(5, 0), 'f');
        scheme.setCharAt(new CharPosition(6, 0), 'g');
        scheme.setCharAt(new CharPosition(7, 0), 'h');
        scheme.setCharAt(new CharPosition(8, 0), 'i');
        scheme.setCharAt(new CharPosition(9, 0), 'j');
        scheme.setCharAt(new CharPosition(0, 1), 'k');
        scheme.setCharAt(new CharPosition(1, 1), 'l');
        scheme.setCharAt(new CharPosition(2, 1), 'm');
        scheme.setCharAt(new CharPosition(3, 1), 'n');
        scheme.setCharAt(new CharPosition(4, 1), 'o');
        scheme.setCharAt(new CharPosition(5, 1), 'p');
        scheme.setCharAt(new CharPosition(6, 1), 'q');
        scheme.setCharAt(new CharPosition(7, 1), 'r');
        scheme.setCharAt(new CharPosition(8, 1), 's');
        scheme.setCharAt(new CharPosition(9, 1), 't');
        scheme.setCharAt(new CharPosition(0, 2), 'u');
        scheme.setCharAt(new CharPosition(1, 2), 'v');
        scheme.setCharAt(new CharPosition(2, 2), 'w');
        scheme.setCharAt(new CharPosition(3, 2), 'x');
        scheme.setCharAt(new CharPosition(4, 2), 'y');
        scheme.setCharAt(new CharPosition(5, 2), 'z');
        scheme.setCharAt(new CharPosition(6, 2), 'A');
        scheme.setCharAt(new CharPosition(7, 2), 'B');
        scheme.setCharAt(new CharPosition(8, 2), 'C');
        scheme.setCharAt(new CharPosition(9, 2), 'D');
        scheme.setCharAt(new CharPosition(0, 3), 'E');
        scheme.setCharAt(new CharPosition(1, 3), 'F');
        scheme.setCharAt(new CharPosition(2, 3), 'G');
        scheme.setCharAt(new CharPosition(3, 3), 'H');
        scheme.setCharAt(new CharPosition(4, 3), 'I');
        scheme.setCharAt(new CharPosition(5, 3), 'J');
        scheme.setCharAt(new CharPosition(6, 3), 'K');
        scheme.setCharAt(new CharPosition(7, 3), 'L');
        scheme.setCharAt(new CharPosition(8, 3), 'M');
        scheme.setCharAt(new CharPosition(9, 3), 'N');
        scheme.setCharAt(new CharPosition(0, 4), 'O');
        scheme.setCharAt(new CharPosition(1, 4), 'P');
        scheme.setCharAt(new CharPosition(2, 4), 'Q');
        scheme.setCharAt(new CharPosition(3, 4), 'R');
        scheme.setCharAt(new CharPosition(4, 4), 'S');
        scheme.setCharAt(new CharPosition(5, 4), 'T');
        scheme.setCharAt(new CharPosition(6, 4), 'U');
        scheme.setCharAt(new CharPosition(7, 4), 'V');
        scheme.setCharAt(new CharPosition(8, 4), 'W');
        scheme.setCharAt(new CharPosition(9, 4), 'X');
        scheme.setCharAt(new CharPosition(0, 5), 'Y');
        scheme.setCharAt(new CharPosition(1, 5), 'Z');
        scheme.setCharAt(new CharPosition(2, 5), ' ');
        scheme.setCharAt(new CharPosition(3, 5), ' ');
        scheme.setCharAt(new CharPosition(4, 5), ' ');
        scheme.setCharAt(new CharPosition(5, 5), ' ');
        scheme.setCharAt(new CharPosition(6, 5), ' ');
        scheme.setCharAt(new CharPosition(7, 5), ' ');
        scheme.setCharAt(new CharPosition(8, 5), ' ');
        scheme.setCharAt(new CharPosition(9, 5), ' ');
        scheme.setCharAt(new CharPosition(0, 6), ' ');
        scheme.setCharAt(new CharPosition(1, 6), ' ');
        scheme.setCharAt(new CharPosition(2, 6), ' ');
        scheme.setCharAt(new CharPosition(3, 6), ' ');
        scheme.setCharAt(new CharPosition(4, 6), ' ');
        scheme.setCharAt(new CharPosition(5, 6), ' ');
        scheme.setCharAt(new CharPosition(6, 6), ' ');
        scheme.setCharAt(new CharPosition(7, 6), ' ');
        scheme.setCharAt(new CharPosition(8, 6), ' ');
        scheme.setCharAt(new CharPosition(9, 6), ' ');
        scheme.setCharAt(new CharPosition(0, 7), ' ');
        scheme.setCharAt(new CharPosition(1, 7), ' ');
        scheme.setCharAt(new CharPosition(2, 7), ' ');
        scheme.setCharAt(new CharPosition(3, 7), ' ');
        scheme.setCharAt(new CharPosition(4, 7), ' ');
        scheme.setCharAt(new CharPosition(5, 7), ' ');
        scheme.setCharAt(new CharPosition(6, 7), ' ');
        scheme.setCharAt(new CharPosition(7, 7), ' ');
        scheme.setCharAt(new CharPosition(8, 7), ' ');
        scheme.setCharAt(new CharPosition(9, 7), ' ');
        scheme.setCharAt(new CharPosition(0, 8), ' ');
        scheme.setCharAt(new CharPosition(1, 8), ' ');
        scheme.setCharAt(new CharPosition(2, 8), ' ');
        scheme.setCharAt(new CharPosition(3, 8), ' ');
        scheme.setCharAt(new CharPosition(4, 8), ' ');
        scheme.setCharAt(new CharPosition(5, 8), ' ');
        scheme.setCharAt(new CharPosition(6, 8), ' ');
        scheme.setCharAt(new CharPosition(7, 8), ' ');
        scheme.setCharAt(new CharPosition(8, 8), ' ');
        scheme.setCharAt(new CharPosition(9, 8), ' ');
        scheme.setCharAt(new CharPosition(0, 9), ' ');
        scheme.setCharAt(new CharPosition(1, 9), ' ');
        scheme.setCharAt(new CharPosition(2, 9), ' ');
        scheme.setCharAt(new CharPosition(3, 9), ' ');
        scheme.setCharAt(new CharPosition(4, 9), ' ');
        scheme.setCharAt(new CharPosition(5, 9), ' ');
        scheme.setCharAt(new CharPosition(6, 9), ' ');
        scheme.setCharAt(new CharPosition(7, 9), ' ');
        scheme.setCharAt(new CharPosition(8, 9), ' ');
        scheme.setCharAt(new CharPosition(9, 9), ' ');
        VerticalBlock block = new VerticalBlock(scheme);

        // Act
        List<Block> subblocks = block.extractParallelSubblocks();

        // Assert
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }

    @Test
    void extractParallelSubblocks_2() {
        // Arrange
        Scheme scheme = new Scheme(10, 10);
        scheme.setCharAt(new CharPosition(0, 0), 'a');
        scheme.setCharAt(new CharPosition(1,