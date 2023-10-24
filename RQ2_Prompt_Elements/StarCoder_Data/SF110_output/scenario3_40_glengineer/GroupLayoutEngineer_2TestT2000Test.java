// GroupLayoutEngineer_2Test.java
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
* It contains ten unit test cases for the {@link GroupLayoutEngineer#getParallelGroup(Axis, String, String)} method.
*/
class GroupLayoutEngineer_2Test {

    /**
     * Test case for the {@link GroupLayoutEngineer#getParallelGroup(Axis, String, String)} method.
     * It tests the case when the first and the last components
     * have the same names.
     */
    @Test
    void testGetParallelGroup_1() {
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

        Container c = getContentPane();
        GroupLayout gl = (GroupLayout) c.getLayout();
        GroupLayout.ParallelGroup hg = gl.getParallelGroup(Axis.HORIZONTAL);
        GroupLayout.SequentialGroup vg = gl.getSequentialGroup(Axis.VERTICAL);

        assertEquals(hg.getAlignment(), Alignment.BASELINE);
        assertEquals(vg.getAlignment(), Alignment.BASELINE);

        assertEquals(hg.getMinimumSize(), new Dimension(0, 0));
        assertEquals(hg.getPreferredSize(), new Dimension(0, 0));
        assertEquals(hg.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(vg.getMinimumSize(), new Dimension(0, 0));
        assertEquals(vg.getPreferredSize(), new Dimension(0, 0));
        assertEquals(vg.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(hg.getGroups().size(), 1);
        assertEquals(vg.getGroups().size(), 1);

        GroupLayout.ParallelGroup hg1 = (GroupLayout.ParallelGroup) hg.getGroups().get(0);
        GroupLayout.SequentialGroup vg1 = (GroupLayout.SequentialGroup) vg.getGroups().get(0);

        assertEquals(hg1.getAlignment(), Alignment.BASELINE);
        assertEquals(vg1.getAlignment(), Alignment.BASELINE);

        assertEquals(hg1.getMinimumSize(), new Dimension(0, 0));
        assertEquals(hg1.getPreferredSize(), new Dimension(0, 0));
        assertEquals(hg1.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(vg1.getMinimumSize(), new Dimension(0, 0));
        assertEquals(vg1.getPreferredSize(), new Dimension(0, 0));
        assertEquals(vg1.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(hg1.getGroups().size(), 2);
        assertEquals(vg1.getGroups().size(), 2);

        GroupLayout.ParallelGroup hg11 = (GroupLayout.ParallelGroup) hg1.getGroups().get(0);
        GroupLayout.ParallelGroup hg12 = (GroupLayout.ParallelGroup) hg1.getGroups().get(1);
        GroupLayout.SequentialGroup vg11 = (GroupLayout.SequentialGroup) vg1.getGroups().get(0);
        GroupLayout.SequentialGroup vg12 = (GroupLayout.SequentialGroup) vg1.getGroups().get(1);

        assertEquals(hg11.getAlignment(), Alignment.BASELINE);
        assertEquals(hg12.getAlignment(), Alignment.BASELINE);
        assertEquals(vg11.getAlignment(), Alignment.BASELINE);
        assertEquals(vg12.getAlignment(), Alignment.BASELINE);

        assertEquals(hg11.getMinimumSize(), new Dimension(0, 0));
        assertEquals(hg11.getPreferredSize(), new Dimension(0, 0));
        assertEquals(hg11.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(hg12.getMinimumSize(), new Dimension(0, 0));
        assertEquals(hg12.getPreferredSize(), new Dimension(0, 0));
        assertEquals(hg12.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(vg11.getMinimumSize(), new Dimension(0, 0));
        assertEquals(vg11.getPreferredSize(), new Dimension(0, 0));
        assertEquals(vg11.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(vg12.getMinimumSize(), new Dimension(0, 0));
        assertEquals(vg12.getPreferredSize(), new Dimension(0, 0));
        assertEquals(vg12.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(hg11.getGroups().size(), 1);
        assertEquals(hg12.getGroups().size(), 1);
        assertEquals(vg11.getGroups().size(), 1);
        assertEquals(vg12.getGroups().size(), 1);

        GroupLayout.ParallelGroup hg111 = (GroupLayout.ParallelGroup) hg11.getGroups().get(0);
        GroupLayout.ParallelGroup hg112 = (GroupLayout.ParallelGroup) hg11.getGroups().get(1);
        GroupLayout.ParallelGroup hg121 = (GroupLayout.ParallelGroup) hg12.getGroups().get(0);
        GroupLayout.ParallelGroup hg122 = (GroupLayout.ParallelGroup) hg12.getGroups().get(1);
        GroupLayout.SequentialGroup vg111 = (GroupLayout.SequentialGroup) vg11.getGroups().get(0);
        GroupLayout.SequentialGroup vg112 = (GroupLayout.SequentialGroup) vg11.getGroups().get(1);
        GroupLayout.SequentialGroup vg121 = (GroupLayout.SequentialGroup) vg12.getGroups().get(0);
        GroupLayout.SequentialGroup vg122 = (GroupLayout.SequentialGroup) vg12.getGroups().get(1);

        assertEquals(hg111.getAlignment(), Alignment.BASELINE);
        assertEquals(hg112.getAlignment(), Alignment.BASELINE);
        assertEquals(hg121.getAlignment(), Alignment.BASELINE);
        assertEquals(hg122.getAlignment(), Alignment.BASELINE);
        assertEquals(vg111.getAlignment(), Alignment.BASELINE);
        assertEquals(vg112.getAlignment(), Alignment.BASELINE);
        assertEquals(vg121.getAlignment(), Alignment.BASELINE);
        assertEquals(vg122.getAlignment(), Alignment.BASELINE);

        assertEquals(hg111.getMinimumSize(), new Dimension(0, 0));
        assertEquals(hg111.getPreferredSize(), new Dimension(0, 0));
        assertEquals(hg111.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(hg112.getMinimumSize(), new Dimension(0, 0));
        assertEquals(hg112.getPreferredSize(), new Dimension(0, 0));
        assertEquals(hg112.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(hg121.getMinimumSize(), new Dimension(0, 0));
        assertEquals(hg121.getPreferredSize(), new Dimension(0, 0));
        assertEquals(hg121.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(hg122.getMinimumSize(), new Dimension(0, 0));
        assertEquals(hg122.getPreferredSize(), new Dimension(0, 0));
        assertEquals(hg122.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(vg111.getMinimumSize(), new Dimension(0, 0));
        assertEquals(vg111.getPreferredSize(), new Dimension(0, 0));
        assertEquals(vg111.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(vg112.getMinimumSize(), new Dimension(0, 0));
        assertEquals(vg112.getPreferredSize(), new Dimension(0, 0));
        assertEquals(vg112.getMaximumSize(), new Dimension(Short.MAX_VALUE, Short.MAX_VALUE));

        assertEquals(vg