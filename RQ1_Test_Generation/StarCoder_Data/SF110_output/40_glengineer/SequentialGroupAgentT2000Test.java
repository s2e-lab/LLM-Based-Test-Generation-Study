// SequentialGroupAgentTest.java
package glengineer.agents;

import java.util.ListIterator;
import glengineer.agents.setters.*;
import javax.swing.GroupLayout;
import javax.swing.LayoutStyle;
import javax.swing.GroupLayout.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialGroupAgent}.
* It contains ten unit test cases for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
*/
class SequentialGroupAgentTest {

    /**
    * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
    * It tests the creation of a sequential group with two components.
    */
    @Test
    void testGroupContent() {
        SequentialGroupAgent group = new SequentialGroupAgent("group", "group");
        group.add(new LabelAgent("label1", "label1"));
        group.add(new LabelAgent("label2", "label2"));
        GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
        SequentialGroup result = group.groupContent(creatorAndAdder);
        assertEquals(2, result.getComponents().length);
    }

    /**
    * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
    * It tests the creation of a sequential group with two components and a gap.
    */
    @Test
    void testGroupContentWithGap() {
        SequentialGroupAgent group = new SequentialGroupAgent("group", "group");
        group.add(new LabelAgent("label1", "label1"));
        group.add(new LabelAgent("label2", "label2"));
        group.addPreferredGapBefore(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, 10, 10), group.getComponent("label1"));
        GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
        SequentialGroup result = group.groupContent(creatorAndAdder);
        assertEquals(3, result.getComponents().length);
    }

    /**
    * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
    * It tests the creation of a sequential group with two components and two gaps.
    */
    @Test
    void testGroupContentWithTwoGaps() {
        SequentialGroupAgent group = new SequentialGroupAgent("group", "group");
        group.add(new LabelAgent("label1", "label1"));
        group.add(new LabelAgent("label2", "label2"));
        group.addPreferredGapBefore(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, 10, 10), group.getComponent("label1"));
        group.addPreferredGapAfter(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, 10, 10), group.getComponent("label2"));
        GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
        SequentialGroup result = group.groupContent(creatorAndAdder);
        assertEquals(4, result.getComponents().length);
    }

    /**
    * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
    * It tests the creation of a sequential group with two components and two gaps.
    */
    @Test
    void testGroupContentWithTwoGapsAndTwoComponents() {
        SequentialGroupAgent group = new SequentialGroupAgent("group", "group");
        group.add(new LabelAgent("label1", "label1"));
        group.add(new LabelAgent("label2", "label2"));
        group.addPreferredGapBefore(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, 10, 10), group.getComponent("label1"));
        group.addPreferredGapAfter(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, 10, 10), group.getComponent("label2"));
        group.add(new LabelAgent("label3", "label3"));
        group.add(new LabelAgent("label4", "label4"));
        GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
        SequentialGroup result = group.groupContent(creatorAndAdder);
        assertEquals(6, result.getComponents().length);
    }

    /**
    * Test case for the {@link SequentialGroupAgent#groupContent(GroupCreatorAndElementAdder)} method.
    * It tests the creation of a sequential group with two components and two gaps.
    */
    @Test
    void testGroupContentWithTwoGapsAndTwoComponentsAndTwoGaps() {
        SequentialGroupAgent group = new SequentialGroupAgent("group", "group");
        group.add(new LabelAgent("label1", "label1"));
        group.add(new LabelAgent("label2", "label2"));
        group.addPreferredGapBefore(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, 10, 10), group.getComponent("label1"));
        group.addPreferredGapAfter(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, 10, 10), group.getComponent("label2"));
        group.add(new LabelAgent("label3", "label3"));
        group.add(new LabelAgent("label4", "label4"));
        group.addPreferredGapBefore(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, 10, 10), group.getComponent("label3"));
        group.addPreferredGapAfter(new PreferredGapAgent(LayoutStyle.ComponentPlacement.RELATED, 10, 10), group.getComponent("label4"));
        GroupCreatorAndElementAdder creatorAndAdder = new GroupCreatorAndElementAdder();
        SequentialGroup result = group.groupContent(creatorAndAdder);
        assertEquals(8, result.getComponents().length);
    }
}
