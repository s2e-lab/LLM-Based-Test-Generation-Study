// GroupLayoutEngineer_4Test.java
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
* It contains ten unit test cases for the {@link GroupLayoutEngineer#getTopSequentialGroup(Axis)} method.
*/
class GroupLayoutEngineer_4Test {

    /**
     * Test case for the {@link GroupLayoutEngineer#getTopSequentialGroup(Axis)} method.
     * It tests the correctness of the method for the horizontal layout direction.
     */
    @Test
    void testGetTopSequentialGroup_Horizontal() {
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

        FunctionsOnTopSequentialGroup topGroup = gle.getTopSequentialGroup(Axis.HORIZONTAL);

        assertEquals(topGroup.getAxis(), Axis.HORIZONTAL);
        assertEquals(topGroup.getGroups().size(), 1);
        assertEquals(topGroup.getGroups().get(0).getAxis(), Axis.HORIZONTAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().size(), 2);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getAxis(), Axis.VERTICAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().size(), 1);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getAxis(), Axis.HORIZONTAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().size(), 2);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getAxis(), Axis.VERTICAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().size(), 1);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getAxis(), Axis.HORIZONTAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().size(), 1);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getAxis(), Axis.VERTICAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().size(), 1);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getAxis(), Axis.HORIZONTAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().size(), 1);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getAxis(), Axis.VERTICAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().size(), 1);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getAxis(), Axis.HORIZONTAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().size(), 1);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getAxis(), Axis.VERTICAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().size(), 1);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getAxis(), Axis.HORIZONTAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().size(), 1);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getAxis(), Axis.VERTICAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().size(), 1);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getAxis(), Axis.HORIZONTAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().size(), 1);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getAxis(), Axis.VERTICAL);
        assertEquals(topGroup.getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).getGroups().get(0).get