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
    * Test of {@link GroupLayoutEngineer#getTopSequentialGroup(Axis)} method.
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

        FunctionsOnTopSequentialGroup topAgent = gle.getTopAgent(Axis.HORIZONTAL);
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
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
    * Test of {@link GroupLayoutEngineer#getTopSequentialGroup(Axis)} method.
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

        FunctionsOnTopSequentialGroup topAgent = gle.getTopAgent(Axis.HORIZONTAL);
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
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
    * Test of {@link GroupLayoutEngineer#getTopSequentialGroup(Axis)} method.
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

        FunctionsOnTopSequentialGroup topAgent = gle.getTopAgent(Axis.HORIZONTAL);
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
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
    * Test of {@link GroupLayoutEngineer#getTopSequentialGroup(Axis)} method.
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

        FunctionsOnTopSequentialGroup topAgent = gle.getTopAgent(Axis.HORIZONTAL);
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroupImplemenation().getAgentName(), "FINDLABEL");
        assertEquals(topAgent.getFunctionsOnTopSequentialGroup