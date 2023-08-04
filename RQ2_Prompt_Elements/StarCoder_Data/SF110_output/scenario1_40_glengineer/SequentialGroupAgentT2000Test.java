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

    @Test
    void testGroupContent() {
        SequentialGroupAgent agent = new SequentialGroupAgent();
        agent.addAgent(new LabelAgent("Label 1"));
        agent.addAgent(new LabelAgent("Label 2"));
        agent.addAgent(new LabelAgent("Label 3"));
        agent.addAgent(new LabelAgent("Label 4"));
        agent.addAgent(new LabelAgent("Label 5"));
        agent.addAgent(new LabelAgent("Label 6"));
        agent.addAgent(new LabelAgent("Label 7"));
        agent.addAgent(new LabelAgent("Label 8"));
        agent.addAgent(new LabelAgent("Label 9"));
        agent.addAgent(new LabelAgent("Label 10"));
        SequentialGroup group = agent.groupContent(new GroupCreatorAndElementAdder() {
            @Override
            public SequentialGroup createSequentialGroup() {
                return new SequentialGroup();
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap) {
                return new SequentialGroup(gap);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment) {
                return new SequentialGroup(gap, alignment);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill) {
                return new SequentialGroup(gap, alignment, fill);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx) {
                return new SequentialGroup(gap, alignment, fill, weightx);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize, prefSize);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize, float[] maxSize) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize, prefSize, maxSize);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize, float[] maxSize, boolean parallel) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize, prefSize, maxSize, parallel);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize, float[] maxSize, boolean parallel, String name) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize, prefSize, maxSize, parallel, name);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize, float[] maxSize, boolean parallel, String name, Object userData) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize, prefSize, maxSize, parallel, name, userData);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize, float[] maxSize, boolean parallel, String name, Object userData, Object[] constraints) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize, prefSize, maxSize, parallel, name, userData, constraints);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize, float[] maxSize, boolean parallel, String name, Object userData, Object[] constraints, String[] keys) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize, prefSize, maxSize, parallel, name, userData, constraints, keys);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize, float[] maxSize, boolean parallel, String name, Object userData, Object[] constraints, String[] keys, String[] values) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize, prefSize, maxSize, parallel, name, userData, constraints, keys, values);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize, float[] maxSize, boolean parallel, String name, Object userData, Object[] constraints, String[] keys, String[] values, String[] collapsibleConstraints) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize, prefSize, maxSize, parallel, name, userData, constraints, keys, values, collapsibleConstraints);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize, float[] maxSize, boolean parallel, String name, Object userData, Object[] constraints, String[] keys, String[] values, String[] collapsibleConstraints, String[] collapsedConstraints) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize, prefSize, maxSize, parallel, name, userData, constraints, keys, values, collapsibleConstraints, collapsedConstraints);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize, float[] maxSize, boolean parallel, String name, Object userData, Object[] constraints, String[] keys, String[] values, String[] collapsibleConstraints, String[] collapsedConstraints, String[] expandedConstraints) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize, prefSize, maxSize, parallel, name, userData, constraints, keys, values, collapsibleConstraints, collapsedConstraints, expandedConstraints);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize, float[] maxSize, boolean parallel, String name, Object userData, Object[] constraints, String[] keys, String[] values, String[] collapsibleConstraints, String[] collapsedConstraints, String[] expandedConstraints, String[] leftToRightConstraints) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize, prefSize, maxSize, parallel, name, userData, constraints, keys, values, collapsibleConstraints, collapsedConstraints, expandedConstraints, leftToRightConstraints);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize, float[] maxSize, boolean parallel, String name, Object userData, Object[] constraints, String[] keys, String[] values, String[] collapsibleConstraints, String[] collapsedConstraints, String[] expandedConstraints, String[] leftToRightConstraints, String[] rightToLeftConstraints) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor, minSize, prefSize, maxSize, parallel, name, userData, constraints, keys, values, collapsibleConstraints, collapsedConstraints, expandedConstraints, leftToRightConstraints, rightToLeftConstraints);
            }

            @Override
            public SequentialGroup createSequentialGroup(int gap, int alignment, int fill, float weightx, float weighty, float anchor, float[] minSize, float[] prefSize, float[] maxSize, boolean parallel, String name, Object userData, Object[] constraints, String[] keys, String[] values, String[] collapsibleConstraints, String[] collapsedConstraints, String[] expandedConstraints, String[] leftToRightConstraints, String[] rightToLeftConstraints, String[] topToBottomConstraints) {
                return new SequentialGroup(gap, alignment, fill, weightx, weighty, anchor,