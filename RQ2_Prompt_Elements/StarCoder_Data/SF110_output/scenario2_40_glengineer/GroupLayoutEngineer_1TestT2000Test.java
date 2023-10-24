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
     * It tests the case when the specified group is not found.
     */
    @Test
    void testGetGroup_1() {
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
            gle.getGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        });
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getGroup(Axis, String, String)} method.
     * It tests the case when the specified group is found.
     */
    @Test
    void testGetGroup_2() {
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

        FunctionsOnGroup f = gle.getGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        assertNotNull(f);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getGroup(Axis, String, String)} method.
     * It tests the case when the specified group is found.
     */
    @Test
    void testGetGroup_3() {
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

        FunctionsOnGroup f = gle.getGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        assertNotNull(f);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getGroup(Axis, String, String)} method.
     * It tests the case when the specified group is found.
     */
    @Test
    void testGetGroup_4() {
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

        FunctionsOnGroup f = gle.getGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        assertNotNull(f);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getGroup(Axis, String, String)} method.
     * It tests the case when the specified group is found.
     */
    @Test
    void testGetGroup_5() {
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

        FunctionsOnGroup f = gle.getGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        assertNotNull(f);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getGroup(Axis, String, String)} method.
     * It tests the case when the specified group is found.
     */
    @Test
    void testGetGroup_6() {
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

        FunctionsOnGroup f = gle.getGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        assertNotNull(f);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getGroup(Axis, String, String)} method.
     * It tests the case when the specified group is found.
     */
    @Test
    void testGetGroup_7() {
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

        FunctionsOnGroup f = gle.getGroup(Axis.VERTICAL, "FINDLABEL", "CANSELBUTTON");
        assertNotNull(f);
    }

    /**
     * Test case for the {@link GroupLayoutEngineer#getGroup(Axis, String, String)} method.
     * It tests the case when the specified group is found.
     */
    @Test
    void testGetGroup_8() {