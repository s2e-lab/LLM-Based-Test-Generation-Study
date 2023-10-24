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

    /**
     * Test case for the {@link VerticalBlock#extractParallelSubblocks()} method.
     * <p>
     * The test case checks the following:
     * <ul>
     * <li>The method returns a list of subblocks.</li>
     * <li>The list contains the same number of subblocks as the original block.</li>
     * <li>The subblocks are parallel.</li>
     * <li>The subblocks are not overlapping.</li>
     * <li>The subblocks are not empty.</li>
     * <li>The subblocks are not null.</li>
     * </ul>
     */
    @Test
    void extractParallelSubblocks() {
        // Arrange
        Block block = new VerticalBlock(new Position(0, 0), new Position(10, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(0, 0));
        block.addVerticalLine(new Position(5, 5));
        block.addVerticalLine(new Position(10, 0));
        block.addVerticalLine(new Position(5, 5));
        block.addVerticalLine(new Position(0, 10));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position(5, 0));
        block.addVerticalLine(new Position(10, 5));
        block.addVerticalLine(new Position(5, 10));
        block.addVerticalLine(new Position(0, 5));
        block.addVerticalLine(new Position