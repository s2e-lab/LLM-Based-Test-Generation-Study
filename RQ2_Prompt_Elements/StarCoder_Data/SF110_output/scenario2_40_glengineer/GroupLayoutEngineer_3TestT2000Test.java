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
     * It tests the case when the specified names are not found.
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

        assertThrows(IllegalArgumentException.class, () -> {
            gle.getSequentialGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        });
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getSequentialGroup(Axis, String, String)} method.
     * It tests the case when the specified names are found.
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

        FunctionsOnSequentialGroup seqGroup = gle.getSequentialGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        assertNotNull(seqGroup);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getSequentialGroup(Axis, String, String)} method.
     * It tests the case when the specified names are found.
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

        FunctionsOnSequentialGroup seqGroup = gle.getSequentialGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        assertNotNull(seqGroup);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getSequentialGroup(Axis, String, String)} method.
     * It tests the case when the specified names are found.
     */
    @Test
    void testGetSequentialGroup_4() {
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

        FunctionsOnSequentialGroup seqGroup = gle.getSequentialGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        assertNotNull(seqGroup);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getSequentialGroup(Axis, String, String)} method.
     * It tests the case when the specified names are found.
     */
    @Test
    void testGetSequentialGroup_5() {
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

        FunctionsOnSequentialGroup seqGroup = gle.getSequentialGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        assertNotNull(seqGroup);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getSequentialGroup(Axis, String, String)} method.
     * It tests the case when the specified names are found.
     */
    @Test
    void testGetSequentialGroup_6() {
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

        FunctionsOnSequentialGroup seqGroup = gle.getSequentialGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        assertNotNull(seqGroup);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getSequentialGroup(Axis, String, String)} method.
     * It tests the case when the specified names are found.
     */
    @Test
    void testGetSequentialGroup_7() {
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

        FunctionsOnSequentialGroup seqGroup = gle.getSequentialGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        assertNotNull(seqGroup);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getSequentialGroup(Axis, String, String)} method