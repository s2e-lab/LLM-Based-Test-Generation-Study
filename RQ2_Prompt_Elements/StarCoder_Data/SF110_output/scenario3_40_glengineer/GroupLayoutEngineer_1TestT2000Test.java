// GroupLayoutEngineer_1Test.java
package glengineer;

import glengineer.agents.*;
import glengineer.agents.setters.*;
import glengineer.agents.settings.*;
import glengineer.blocks.*;
import java.util.*;
import java.awt.Component;
import java.awt.Container;
import javax.swing.*;
import javax.swing.GroupLayout.*;
import javax.swing.LayoutStyle.ComponentPlacement;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GroupLayoutEngineer}.
* It contains ten unit test cases for the {@link GroupLayoutEngineer#getGroup(Axis, String, String)} method.
*/
class GroupLayoutEngineer_1Test {

    /**
     * Test case for the {@link GroupLayoutEngineer#getGroup(Axis, String, String)} method.
     * It tests the correctness of the method for the horizontal layout direction.
     */
    @Test
    void testGetGroup_Horizontal() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            getContentPane(),
            "FINDLABEL .. TEXTFIELD      . FINDBUTTON  ",
            "            --------------+       .       ",
            "             CB11 .g CB12 |   CANSELBUTTON",
            "               .          |               ",
            "             CB21    CB22 |               ");

        gle.associateGap(".", ComponentPlacement.RELATED);
        gle.associateGap("..", ComponentPlacement.UNRELATED);
        gle.associateGap(".g1", 20);

        FunctionsOnGroup group = gle.getGroup(Axis.HORIZONTAL, "FINDLABEL", "CANSELBUTTON");
        assertNotNull(group);

        group.setAlignment(Alignment.BASELINE);
        group.setAlignment(Alignment.BASELINE_LEADING);
        group.setAlignment(Alignment.BASELINE_TRAILING);
        group.setAlignment(Alignment.CENTER);
        group.setAlignment(Alignment.CENTER_SELECTION);
        group.setAlignment(Alignment.LEADING);
        group.setAlignment(Alignment.TRAILING);

        group.setVerticalAlignment(Alignment.BASELINE);
        group.setVerticalAlignment(Alignment.BASELINE_LEADING);
        group.setVerticalAlignment(Alignment.BASELINE_TRAILING);
        group.setVerticalAlignment(Alignment.CENTER);
        group.setVerticalAlignment(Alignment.CENTER_SELECTION);
        group.setVerticalAlignment(Alignment.LEADING);
        group.setVerticalAlignment(Alignment.TRAILING);

        group.setVerticalGroupAlignment(Alignment.BASELINE);
        group.setVerticalGroupAlignment(Alignment.BASELINE_LEADING);
        group.setVerticalGroupAlignment(Alignment.BASELINE_TRAILING);
        group.setVerticalGroupAlignment(Alignment.CENTER);
        group.setVerticalGroupAlignment(Alignment.CENTER_SELECTION);
        group.setVerticalGroupAlignment(Alignment.LEADING);
        group.setVerticalGroupAlignment(Alignment.TRAILING);

        group.setHorizontalGroupAlignment(Alignment.BASELINE);
        group.setHorizontalGroupAlignment(Alignment.BASELINE_LEADING);
        group.setHorizontalGroupAlignment(Alignment.BASELINE_TRAILING);
        group.setHorizontalGroupAlignment(Alignment.CENTER);
        group.setHorizontalGroupAlignment(Alignment.CENTER_SELECTION);
        group.setHorizontalGroupAlignment(Alignment.LEADING);
        group.setHorizontalGroupAlignment(Alignment.TRAILING);

        group.setVerticalGroupAlignment(Alignment.BASELINE, 0.5f);
        group.setVerticalGroupAlignment(Alignment.BASELINE_LEADING, 0.5f);
        group.setVerticalGroupAlignment(Alignment.BASELINE_TRAILING, 0.5f);
        group.setVerticalGroupAlignment(Alignment.CENTER, 0.5f);
        group.setVerticalGroupAlignment(Alignment.CENTER_SELECTION, 0.5f);
        group.setVerticalGroupAlignment(Alignment.LEADING, 0.5f);
        group.setVerticalGroupAlignment(Alignment.TRAILING, 0.5f);

        group.setHorizontalGroupAlignment(Alignment.BASELINE, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.BASELINE_LEADING, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.BASELINE_TRAILING, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.CENTER, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.CENTER_SELECTION, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.LEADING, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.TRAILING, 0.5f);

        group.setVerticalGroupAlignment(Alignment.BASELINE, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.BASELINE_LEADING, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.BASELINE_TRAILING, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.CENTER, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.CENTER_SELECTION, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.LEADING, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.TRAILING, 0.5f, 0.5f);

        group.setHorizontalGroupAlignment(Alignment.BASELINE, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.BASELINE_LEADING, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.BASELINE_TRAILING, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.CENTER, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.CENTER_SELECTION, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.LEADING, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.TRAILING, 0.5f, 0.5f);

        group.setVerticalGroupAlignment(Alignment.BASELINE, 0.5f, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.BASELINE_LEADING, 0.5f, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.BASELINE_TRAILING, 0.5f, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.CENTER, 0.5f, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.CENTER_SELECTION, 0.5f, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.LEADING, 0.5f, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.TRAILING, 0.5f, 0.5f, 0.5f);

        group.setHorizontalGroupAlignment(Alignment.BASELINE, 0.5f, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.BASELINE_LEADING, 0.5f, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.BASELINE_TRAILING, 0.5f, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.CENTER, 0.5f, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.CENTER_SELECTION, 0.5f, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.LEADING, 0.5f, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.TRAILING, 0.5f, 0.5f, 0.5f);

        group.setVerticalGroupAlignment(Alignment.BASELINE, 0.5f, 0.5f, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.BASELINE_LEADING, 0.5f, 0.5f, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.BASELINE_TRAILING, 0.5f, 0.5f, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.CENTER, 0.5f, 0.5f, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.CENTER_SELECTION, 0.5f, 0.5f, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.LEADING, 0.5f, 0.5f, 0.5f, 0.5f);
        group.setVerticalGroupAlignment(Alignment.TRAILING, 0.5f, 0.5f, 0.5f, 0.5f);

        group.setHorizontalGroupAlignment(Alignment.BASELINE, 0.5f, 0.5f, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.BASELINE_LEADING, 0.5f, 0.5f, 0.5f, 0.5f);
        group.setHorizontalGroupAlignment(Alignment.BASELINE_TRAILING, 0.5f, 0.5f, 0.5f, 0