// GroupLayoutEngineer_3Test.java
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
* It contains ten unit test cases for the {@link GroupLayoutEngineer#getSequentialGroup(Axis, String, String)} method.
*/
class GroupLayoutEngineer_3Test {

    /**
     * Test case for the {@link GroupLayoutEngineer#getSequentialGroup(Axis, String, String)} method.
     * It tests the case when the first and the last components
     * of the sequential group are not intersected by any lines.
     *
     * @see GroupLayoutEngineer#getSequentialGroup(Axis, String, String)
     */
    @Test
    void testGetSequentialGroup_1() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            getContentPane(),
            "FINDLABEL  TEXTFIELD      FINDBUTTON  ",
            "          --------------+             ",
            "           CB11   CB12  | CANSELBUTTON",
            "                        |             ",
            "           CB21   CB22  |             ");

        gle.associate("FINDLABEL", new JLabel("Find What:"));
        gle.associate("TEXTFIELD", new JTextField());
        gle.associate("FINDBUTTON", new JButton("Find"));
        gle.associate("CB11", new JCheckBox("Match Case"));
        gle.associate("CB12", new JCheckBox("Wrap Around"));
        gle.associate("CB21", new JCheckBox("Whole Words"));
        gle.associate("CB22", new JCheckBox("Search Backwards"));
        gle.associate("CANSELBUTTON", new JButton("Cancel"));

        gle.linkSize("FINDBUTTON", "CANSELBUTTON");

        gle.getParallelGroup(Axis.VERTICAL, "FINDLABEL","FINDBUTTON")
            .setContentAlignment(Alignment.BASELINE);

        gle.setAutoCreateGaps(true);
        gle.setAutoCreateContainerGaps(true);

        gle.engineer();

        FunctionsOnSequentialGroup seqGroup = gle.getSequentialGroup(Axis.HORIZONTAL, "FINDLABEL", "CANSELBUTTON");

        assertEquals(seqGroup.getAxis(), Axis.HORIZONTAL);
        assertEquals(seqGroup.getFirstComponentName(), "FINDLABEL");
        assertEquals(seqGroup.getLastComponentName(), "CANSELBUTTON");

        assertEquals(seqGroup.getGapCount(), 0);
        assertEquals(seqGroup.getGap(0), null);

        assertEquals(seqGroup.getGroupCount(), 1);
        assertEquals(seqGroup.getGroup(0).getAxis(), Axis.HORIZONTAL);
        assertEquals(seqGroup.getGroup(0).getFirstComponentName(), "FINDLABEL");
        assertEquals(seqGroup.getGroup(0).getLastComponentName(), "CANSELBUTTON");

        assertEquals(seqGroup.getGroup(0).getGapCount(), 0);
        assertEquals(seqGroup.getGroup(0).getGap(0), null);

        assertEquals(seqGroup.getGroup(0).getElementCount(), 2);
        assertEquals(seqGroup.getGroup(0).getElement(0).getComponentName(), "FINDLABEL");
        assertEquals(seqGroup.getGroup(0).getElement(1).getComponentName(), "CANSELBUTTON");

        assertEquals(seqGroup.getGroup(0).getElement(0).getGapCount(), 0);
        assertEquals(seqGroup.getGroup(0).getElement(0).getGap(0), null);

        assertEquals(seqGroup.getGroup(0).getElement(1).getGapCount(), 0);
        assertEquals(seqGroup.getGroup(0).getElement(1).getGap(0), null);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getSequentialGroup(Axis, String, String)} method.
     * It tests the case when the first and the last components
     * of the sequential group are intersected by a horizontal line.
     *
     * @see GroupLayoutEngineer#getSequentialGroup(Axis, String, String)
     */
    @Test
    void testGetSequentialGroup_2() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            getContentPane(),
            "FINDLABEL  TEXTFIELD      FINDBUTTON  ",
            "          --------------+             ",
            "           CB11   CB12  | CANSELBUTTON",
            "                        |             ",
            "           CB21   CB22  |             ");

        gle.associate("FINDLABEL", new JLabel("Find What:"));
        gle.associate("TEXTFIELD", new JTextField());
        gle.associate("FINDBUTTON", new JButton("Find"));
        gle.associate("CB11", new JCheckBox("Match Case"));
        gle.associate("CB12", new JCheckBox("Wrap Around"));
        gle.associate("CB21", new JCheckBox("Whole Words"));
        gle.associate("CB22", new JCheckBox("Search Backwards"));
        gle.associate("CANSELBUTTON", new JButton("Cancel"));

        gle.linkSize("FINDBUTTON", "CANSELBUTTON");

        gle.getParallelGroup(Axis.VERTICAL, "FINDLABEL","FINDBUTTON")
            .setContentAlignment(Alignment.BASELINE);

        gle.setAutoCreateGaps(true);
        gle.setAutoCreateContainerGaps(true);

        gle.engineer();

        FunctionsOnSequentialGroup seqGroup = gle.getSequentialGroup(Axis.HORIZONTAL, "FINDLABEL", "CB11");

        assertEquals(seqGroup.getAxis(), Axis.HORIZONTAL);
        assertEquals(seqGroup.getFirstComponentName(), "FINDLABEL");
        assertEquals(seqGroup.getLastComponentName(), "CB11");

        assertEquals(seqGroup.getGapCount(), 0);
        assertEquals(seqGroup.getGap(0), null);

        assertEquals(seqGroup.getGroupCount(), 1);
        assertEquals(seqGroup.getGroup(0).getAxis(), Axis.HORIZONTAL);
        assertEquals(seqGroup.getGroup(0).getFirstComponentName(), "FINDLABEL");
        assertEquals(seqGroup.getGroup(0).getLastComponentName(), "CB11");

        assertEquals(seqGroup.getGroup(0).getGapCount(), 0);
        assertEquals(seqGroup.getGroup(0).getGap(0), null);

        assertEquals(seqGroup.getGroup(0).getElementCount(), 2);
        assertEquals(seqGroup.getGroup(0).getElement(0).getComponentName(), "FINDLABEL");
        assertEquals(seqGroup.getGroup(0).getElement(1).getComponentName(), "CB11");

        assertEquals(seqGroup.getGroup(0).getElement(0).getGapCount(), 0);
        assertEquals(seqGroup.getGroup(0).getElement(0).getGap(0), null);

        assertEquals(seqGroup.getGroup(0).getElement(1).getGapCount(), 0);
        assertEquals(seqGroup.getGroup(0).getElement(1).getGap(0), null);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getSequentialGroup(Axis, String, String)} method.
     * It tests the case when the first and the last components
     * of the sequential group are intersected by a vertical line.
     *
     * @see GroupLayoutEngineer#getSequentialGroup(Axis, String, String)
     */
    @Test
    void testGetSequentialGroup_3() {
        GroupLayoutEngineer gle = new GroupLayoutEngineer(
            getContentPane(),
            "FINDLABEL  TEXTFIELD      FINDBUTTON  ",
            "          --------------+             ",
            "           CB11   CB12  | CANSELBUTTON",
            "                        |             ",
            "           CB21   CB22  |             ");

        gle.associate("FINDLABEL", new JLabel("Find What:"));
        gle.associate("TEXTFIELD", new JTextField());
        gle.associate("FINDBUTTON", new JButton("Find"));
        gle.associate("CB11", new JCheckBox("Match Case"));
        gle.associate("CB12", new JCheckBox("Wrap Around"));
        gle.associate("CB21", new JCheckBox("Whole Words"));
        gle.associate("CB22", new JCheckBox("Search Backwards"));
        gle.associate("CANSELBUTTON", new JButton("Cancel"));

        gle.linkSize("FINDBUTTON", "CANSELBUTTON");

        gle.getParallelGroup(Axis.VERTICAL, "FINDLABEL","FINDBUTTON")
            .setContentAlignment(Alignment.BASELINE);

        gle.setAutoCreateGaps(true);
        gle.setAutoCreateContainerGaps(true);

        gle.engineer();

        FunctionsOnSequentialGroup seqGroup = gle.getSequentialGroup(Axis.HORIZONTAL, "CB11", "CB22");

        assertEquals(seqGroup.getAxis(), Axis.HORIZONTAL);
        assertEquals(seqGroup.getFirstComponentName(), "CB11");
        assertEquals(seqGroup.getLastComponentName(), "CB22");

        assertEquals(seqGroup.getGapCount(), 0);
        assertEquals(seqGroup.getGap(0), null);

        assertEquals(seqGroup.getGroupCount(), 1);
        assertEquals(seqGroup.getGroup(0).getAxis(), Axis.HORIZONTAL);
        assertEquals(seqGroup.getGroup(0).getFirstComponentName(), "CB11");
        assertEquals(seqGroup.getGroup(0).getLastComponentName(), "CB22");

        assertEquals(seqGroup.getGroup(0).getGapCount(), 0);
        assertEquals(seqGroup.getGroup(0).getGap(0), null);

        assertEquals(seqGroup.getGroup(0).getElementCount(), 2);
        assertEquals(seqGroup.getGroup(0).getElement(0).getComponentName(), "CB11");
        assertEquals(seqGroup.getGroup(0).getElement(1).getComponentName(), "CB22");

        assertEquals(seqGroup