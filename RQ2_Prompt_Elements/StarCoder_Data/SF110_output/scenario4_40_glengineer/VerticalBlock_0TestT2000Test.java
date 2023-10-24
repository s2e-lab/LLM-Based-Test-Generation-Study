// VerticalBlock_0Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link VerticalBlock}.
* It contains ten unit test cases for the {@link VerticalBlock#extractSequentialSubblocks()} method.
*/
class VerticalBlock_0Test {

    @Test
    void extractSequentialSubblocks_0() {
        // Arrange
        Scheme scheme = new Scheme(10, 10);
        scheme.set(0, 0, 'a');
        scheme.set(1, 0, 'b');
        scheme.set(2, 0, 'c');
        scheme.set(3, 0, 'd');
        scheme.set(4, 0, 'e');
        scheme.set(5, 0, 'f');
        scheme.set(6, 0, 'g');
        scheme.set(7, 0, 'h');
        scheme.set(8, 0, 'i');
        scheme.set(9, 0, 'j');
        VerticalBlock block = new VerticalBlock(scheme);

        // Act
        List<Block> subblocks = block.extractSequentialSubblocks();

        // Assert
        assertEquals(1, subblocks.size());
        assertEquals(block, subblocks.get(0));
    }

    @Test
    void extractSequentialSubblocks_1() {
        // Arrange
        Scheme scheme = new Scheme(10, 10);
        scheme.set(0, 0, 'a');
        scheme.set(1, 0, 'b');
        scheme.set(2, 0, 'c');
        scheme.set(3, 0, 'd');
        scheme.set(4, 0, 'e');
        scheme.set(5, 0, 'f');
        scheme.set(6, 0, 'g');
        scheme.set(7, 0, 'h');
        scheme.set(8, 0, 'i');
        scheme.set(9, 0, 'j');
        scheme.set(0, 1, 'k');
        scheme.set(1, 1, 'l');
        scheme.set(2, 1, 'm');
        scheme.set(3, 1, 'n');
        scheme.set(4, 1, 'o');
        scheme.set(5, 1, 'p');
        scheme.set(6, 1, 'q');
        scheme.set(7, 1, 'r');
        scheme.set(8, 1, 's');
        scheme.set(9, 1, 't');
        VerticalBlock block = new VerticalBlock(scheme);

        // Act
        List<Block> subblocks = block.extractSequentialSubblocks();

        // Assert
        assertEquals(2, subblocks.size());
        assertEquals(new VerticalBlock(scheme, 0, 0, 9, 0), subblocks.get(0));
        assertEquals(new VerticalBlock(scheme, 0, 1, 9, 1), subblocks.get(1));
    }

    @Test
    void extractSequentialSubblocks_2() {
        // Arrange
        Scheme scheme = new Scheme(10, 10);
        scheme.set(0, 0, 'a');
        scheme.set(1, 0, 'b');
        scheme.set(2, 0, 'c');
        scheme.set(3, 0, 'd');
        scheme.set(4, 0, 'e');
        scheme.set(5, 0, 'f');
        scheme.set(6, 0, 'g');
        scheme.set(7, 0, 'h');
        scheme.set(8, 0, 'i');
        scheme.set(9, 0, 'j');
        scheme.set(0, 1, 'k');
        scheme.set(1, 1, 'l');
        scheme.set(2, 1, 'm');
        scheme.set(3, 1, 'n');
        scheme.set(4, 1, 'o');
        scheme.set(5, 1, 'p');
        scheme.set(6, 1, 'q');
        scheme.set(7, 1, 'r');
        scheme.set(8, 1, 's');
        scheme.set(9, 1, 't');
        scheme.set(0, 2, 'u');
        scheme.set(1, 2, 'v');
        scheme.set(2, 2, 'w');
        scheme.set(3, 2, 'x');
        scheme.set(4, 2, 'y');
        scheme.set(5, 2, 'z');
        scheme.set(6, 2, 'A');
        scheme.set(7, 2, 'B');
        scheme.set(8, 2, 'C');
        scheme.set(9, 2, 'D');
        VerticalBlock block = new VerticalBlock(scheme);

        // Act
        List<Block> subblocks = block.extractSequentialSubblocks();

        // Assert
        assertEquals(3, subblocks.size());
        assertEquals(new VerticalBlock(scheme, 0, 0, 9, 0), subblocks.get(0));
        assertEquals(new VerticalBlock(scheme, 0, 1, 9, 1), subblocks.get(1));
        assertEquals(new VerticalBlock(scheme, 0, 2, 9, 2), subblocks.get(2));
    }

    @Test
    void extractSequentialSubblocks_3() {
        // Arrange
        Scheme scheme = new Scheme(10, 10);
        scheme.set(0, 0, 'a');
        scheme.set(1, 0, 'b');
        scheme.set(2, 0, 'c');
        scheme.set(3, 0, 'd');
        scheme.set(4, 0, 'e');
        scheme.set(5, 0, 'f');
        scheme.set(6, 0, 'g');
        scheme.set(7, 0, 'h');
        scheme.set(8, 0, 'i');
        scheme.set(9, 0, 'j');
        scheme.set(0, 1, 'k');
        scheme.set(1, 1, 'l');
        scheme.set(2, 1, 'm');
        scheme.set(3, 1, 'n');
        scheme.set(4, 1, 'o');
        scheme.set(5, 1, 'p');
        scheme.set(6, 1, 'q');
        scheme.set(7, 1, 'r');
        scheme.set(8, 1, 's');
        scheme.set(9, 1, 't');
        scheme.set(0, 2, 'u');
        scheme.set(1, 2, 'v');
        scheme.set(2, 2, 'w');
        scheme.set(3, 2, 'x');
        scheme.set(4, 2, 'y');
        scheme.set(5, 2, 'z');
        scheme.set(6, 2, 'A');
        scheme.set(7, 2, 'B');
        scheme.set(8, 2, 'C');
        scheme.set(9, 2, 'D');
        scheme.set(0, 3, 'E');
        scheme.set(1, 3, 'F');
        scheme.set(2, 3, 'G');
        scheme.set(3, 3, 'H');
        scheme.set(4, 3, 'I');
        scheme.set(5, 3, 'J');
        scheme.set(6, 3, 'K');
        scheme.set(7, 3, 'L');
        scheme.set(8, 3, 'M');
        scheme.set(9, 3, 'N');
        VerticalBlock block = new VerticalBlock(scheme);

        // Act
        List<Block> subblocks = block.extractSequentialSubblocks();

        // Assert
        assertEquals(4, subblocks.size());
        assertEquals(new VerticalBlock(scheme, 0, 0, 9, 0), subblocks.get(0));
        assertEquals(new VerticalBlock(scheme, 0, 1, 9, 1), subblocks.get(1));
        assertEquals(new VerticalBlock(scheme, 0, 2, 9, 2), subblocks.get(2));
        assertEquals(new VerticalBlock(scheme, 0, 3, 9, 3), subblocks.get(3));
    }

    @Test
    void extractSequentialSubblocks_4() {
        // Arrange
        Scheme scheme = new Scheme(10, 10);
        scheme.set(0, 0, 'a');
        scheme.set(1, 0, 'b');
        scheme.set(2, 0, 'c');
        scheme.set(3, 0, 'd');
        scheme.set(4, 0, 'e');
        scheme.set(5, 0, 'f');
        scheme.set(6, 0, 'g');
        scheme.set(7, 0, 'h');
        scheme.set(8