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
     * Test of the {@link GroupLayoutEngineer#getTopSequentialGroup(Axis)} method.
     */
    @Test
    void testGetTopSequentialGroup() {
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
        assertNotNull(topGroup);
        assertEquals(2, topGroup.getGroups().size());

        FunctionsOnTopParallelGroup group1 = topGroup.getGroups().get(0);
        assertEquals(2, group1.getGroups().size());
        assertEquals(2, group1.getGroups().get(0).getGroups().size());
        assertEquals(2, group1.getGroups().get(1).getGroups().size());

        FunctionsOnTopParallelGroup group2 = topGroup.getGroups().get(1);
        assertEquals(2, group2.getGroups().size());
        assertEquals(2, group2.getGroups().get(0).getGroups().size());
        assertEquals(2, group2.getGroups().get(1).getGroups().size());
    }
}

// GroupLayoutEngineer_5Test.java
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
class GroupLayoutEngineer_5Test {
		
    /**
     * Test of the {@link GroupLayoutEngineer#getTopSequentialGroup(Axis)} method.
     */
    @Test
    void testGetTopSequentialGroup() {
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

        FunctionsOnTopSequentialGroup topGroup = gle.getTopSequentialGroup(Axis.VERTICAL);
        assertNotNull(topGroup);
        assertEquals(2, topGroup.getGroups().size());

        FunctionsOnTopParallelGroup group1 = topGroup.getGroups().get(0);
        assertEquals(2, group1.getGroups().size());
        assertEquals(2, group1.getGroups().get(0).getGroups().size());
        assertEquals(2, group1.getGroups().get(1).getGroups().size());

        FunctionsOnTopParallelGroup group2 = topGroup.getGroups().get(1);
        assertEquals(2, group2.getGroups().size());
        assertEquals(2, group2.getGroups().get(0).getGroups().size());
        assertEquals(2, group2.getGroups().get(1).getGroups().size());
    }
}

// GroupLayoutEngineer_6Test.java
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
class GroupLayoutEngineer_6Test {
		
    /**
     * Test of the {@link GroupLayoutEngineer#getTopSequentialGroup(Axis)} method.
     */
    @Test
    void testGetTopSequentialGroup() {
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
        assertNotNull(topGroup);
        assertEquals(2, topGroup.getGroups().size());

        FunctionsOnTopParallelGroup group1 = topGroup.getGroups().get(0);
        assertEquals(2, group1.getGroups().size());
        assertEquals(2, group1.getGroups().get(0).getGroups().size());
        assertEquals(2, group1.getGroups().get(1).getGroups().size());

        FunctionsOnTopParallelGroup group2 = topGroup.getGroups().get(1);
        assertEquals(2, group2.getGroups().size());
        assertEquals(2, group2.getGroups().get(0).getGroups().size());
        assertEquals(2, group2.getGroups().get(1).getGroups().size());
    }
}

// GroupLayoutEngineer_7Test.java
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
class GroupLayoutEngineer_7Test {
		
    /**
     * Test of the {@link GroupLayoutEngineer#getTopSequentialGroup(Axis)} method.
     */
    @Test
    void testGetTopSequentialGroup() {
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

        FunctionsOnTopSequentialGroup topGroup = gle.getTopSequentialGroup(Axis.VERTICAL);
        assertNotNull(topGroup);
        assertEquals(2, topGroup.getGroups().size());

        FunctionsOnTopParallelGroup group1 = topGroup.getGroups().get(0);
        assertEquals(2, group1.getGroups().size());
        assertEquals(2, group1.getGroups().get(0).getGroups().size());
        assertEquals(2, group1.getGroups().get(1).getGroups().size());

        FunctionsOnTopParallelGroup group2 = topGroup.getGroups().get(1);
        assertEquals(2, group2.getGroups().size());
        assertEquals(2, group2.getGroups().get(0).getGroups().size());
        assertEquals(2, group2.getGroups().get(1).getGroups().size());
    }
}

// GroupLayoutEngineer_8Test.java
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
import