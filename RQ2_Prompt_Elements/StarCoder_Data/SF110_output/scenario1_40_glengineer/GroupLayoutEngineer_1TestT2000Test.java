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

    @Test
    void getGroup_1() {
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

        GroupLayoutEngineer_1Test.assertLayout(gle.getLayout());
    }

    @Test
    void getGroup_2() {
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

        GroupLayoutEngineer_1Test.assertLayout(gle.getLayout());
    }

    @Test
    void getGroup_3() {
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

        GroupLayoutEngineer_1Test.assertLayout(gle.getLayout());
    }

    @Test
    void getGroup_4() {
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

        GroupLayoutEngineer_1Test.assertLayout(gle.getLayout());
    }

    @Test
    void getGroup_5() {
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

        GroupLayoutEngineer_1Test.assertLayout(gle.getLayout());
    }

    @Test
    void getGroup_6() {
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

        GroupLayoutEngineer_1Test.assertLayout(gle.getLayout());
    }

    @Test
    void getGroup_7() {
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

        gle.linkSize("FINDBUTTON", "