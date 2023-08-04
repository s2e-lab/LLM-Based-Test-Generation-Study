// GroupLayoutEngineer_0Test.java
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
* It contains ten unit test cases for the {@link GroupLayoutEngineer#getComponent(Axis, String)} method.
*/
class GroupLayoutEngineer_0Test {

    @Test
    void getComponent_0() {
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

        gle.engineer();

        FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "FINDLABEL");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "TEXTFIELD");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "FINDBUTTON");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "CB11");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "CB12");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "CB21");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "CB22");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "CANSELBUTTON");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);
    }

    @Test
    void getComponent_1() {
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

        gle.setAutoCreateGaps(true);
        gle.setAutoCreateContainerGaps(true);

        gle.engineer();

        FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "FINDLABEL");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "TEXTFIELD");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "FINDBUTTON");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "CB11");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "CB12");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "CB21");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "CB22");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "CANSELBUTTON");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);
    }

    @Test
    void getComponent_2() {
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

        gle.setAutoCreateGaps(true);
        gle.setAutoCreateContainerGaps(true);

        gle.engineer();

        FunctionsOnComponent foc = gle.getComponent(Axis.HORIZONTAL, "FINDLABEL");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "TEXTFIELD");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "FINDBUTTON");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "CB11");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED);
        assertEquals(foc.getHorizontalSize(), GroupLayout.DEFAULT_SIZE);
        assertEquals(foc.getVerticalSize(), GroupLayout.DEFAULT_SIZE);

        foc = gle.getComponent(Axis.HORIZONTAL, "CB12");
        assertEquals(foc.getAlignment(), ComponentPlacement.RELATED