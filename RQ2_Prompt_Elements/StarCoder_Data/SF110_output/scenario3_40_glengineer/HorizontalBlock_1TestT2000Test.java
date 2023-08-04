// HorizontalBlock_1Test.java
package glengineer.blocks;

import glengineer.positions.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HorizontalBlock}.
* It contains ten unit test cases for the {@link HorizontalBlock#extractParallelSubblocks()} method.
*/
class HorizontalBlock_1Test {

    /**
     * Test case for the {@link HorizontalBlock#extractParallelSubblocks()} method.
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
        HorizontalBlock block = new HorizontalBlock(new Position(0, 0), new Position(10, 10));
        block.addHorizontalLine(new Position(0, 0), new Position(10, 0));
        block.addHorizontalLine(new Position(0, 10), new Position(10, 10));
        block.addHorizontalLine(new Position(0, 20), new Position(10, 20));
        block.addHorizontalLine(new Position(0, 30), new Position(10, 30));
        block.addHorizontalLine(new Position(0, 40), new Position(10, 40));
        block.addHorizontalLine(new Position(0, 50), new Position(10, 50));
        block.addHorizontalLine(new Position(0, 60), new Position(10, 60));
        block.addHorizontalLine(new Position(0, 70), new Position(10, 70));
        block.addHorizontalLine(new Position(0, 80), new Position(10, 80));
        block.addHorizontalLine(new Position(0, 90), new Position(10, 90));
        block.addHorizontalLine(new Position(0, 100), new Position(10, 100));
        block.addHorizontalLine(new Position(0, 110), new Position(10, 110));
        block.addHorizontalLine(new Position(0, 120), new Position(10, 120));
        block.addHorizontalLine(new Position(0, 130), new Position(10, 130));
        block.addHorizontalLine(new Position(0, 140), new Position(10, 140));
        block.addHorizontalLine(new Position(0, 150), new Position(10, 150));
        block.addHorizontalLine(new Position(0, 160), new Position(10, 160));
        block.addHorizontalLine(new Position(0, 170), new Position(10, 170));
        block.addHorizontalLine(new Position(0, 180), new Position(10, 180));
        block.addHorizontalLine(new Position(0, 190), new Position(10, 190));
        block.addHorizontalLine(new Position(0, 200), new Position(10, 200));
        block.addHorizontalLine(new Position(0, 210), new Position(10, 210));
        block.addHorizontalLine(new Position(0, 220), new Position(10, 220));
        block.addHorizontalLine(new Position(0, 230), new Position(10, 230));
        block.addHorizontalLine(new Position(0, 240), new Position(10, 240));
        block.addHorizontalLine(new Position(0, 250), new Position(10, 250));
        block.addHorizontalLine(new Position(0, 260), new Position(10, 260));
        block.addHorizontalLine(new Position(0, 270), new Position(10, 270));
        block.addHorizontalLine(new Position(0, 280), new Position(10, 280));
        block.addHorizontalLine(new Position(0, 290), new Position(10, 290));
        block.addHorizontalLine(new Position(0, 300), new Position(10, 300));
        block.addHorizontalLine(new Position(0, 310), new Position(10, 310));
        block.addHorizontalLine(new Position(0, 320), new Position(10, 320));
        block.addHorizontalLine(new Position(0, 330), new Position(10, 330));
        block.addHorizontalLine(new Position(0, 340), new Position(10, 340));
        block.addHorizontalLine(new Position(0, 350), new Position(10, 350));
        block.addHorizontalLine(new Position(0, 360), new Position(10, 360));
        block.addHorizontalLine(new Position(0, 370), new Position(10, 370));
        block.addHorizontalLine(new Position(0, 380), new Position(10, 380));
        block.addHorizontalLine(new Position(0, 390), new Position(10, 390));
        block.addHorizontalLine(new Position(0, 400), new Position(10, 400));
        block.addHorizontalLine(new Position(0, 410), new Position(10, 410));
        block.addHorizontalLine(new Position(0, 420), new Position(10, 420));
        block.addHorizontalLine(new Position(0, 430), new Position(10, 430));
        block.addHorizontalLine(new Position(0, 440), new Position(10, 440));
        block.addHorizontalLine(new Position(0, 450), new Position(10, 450));
        block.addHorizontalLine(new Position(0, 460), new Position(10, 460));
        block.addHorizontalLine(new Position(0, 470), new Position(10, 470));
        block.addHorizontalLine(new Position(0, 480), new Position(10, 480));
        block.addHorizontalLine(new Position(0, 490), new Position(10, 490));
        block.addHorizontalLine(new Position(0, 500), new Position(10, 500));
        block.addHorizontalLine(new Position(0, 510), new Position(10, 510));
        block.addHorizontalLine(new Position(0, 520), new Position(10, 520));
        block.addHorizontalLine(new Position(0, 530), new Position(10, 530));
        block.addHorizontalLine(new Position(0, 540), new Position(10, 540));
        block.addHorizontalLine(new Position(0, 550), new Position(10, 550));
        block.addHorizontalLine(new Position(0, 560), new Position(10, 560));
        block.addHorizontalLine(new Position(0, 570), new Position(10, 570));
        block.addHorizontalLine(new Position(0, 580), new Position(10, 580));
        block.addHorizontalLine(new Position(0, 590), new Position(10, 590));
        block.addHorizontalLine(new Position(0, 600), new Position(10, 600));
        block.addHorizontalLine(new Position(0, 610), new Position(10, 610));
        block.addHorizontalLine(new Position(0, 620), new Position(10, 620));
        block.addHorizontalLine(new Position(0, 630), new Position(10, 630));
        block.addHorizontalLine(new Position(0, 640), new Position(10, 640));
        block.addHorizontalLine(new Position(0, 650), new Position(10,