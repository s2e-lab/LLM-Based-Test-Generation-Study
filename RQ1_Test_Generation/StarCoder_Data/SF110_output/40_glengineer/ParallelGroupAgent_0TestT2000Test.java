// ParallelGroupAgent_0Test.java
package glengineer.agents;

import glengineer.agents.setters.FunctionsOnGroup;
import glengineer.agents.setters.FunctionsOnParallelGroup;
import glengineer.agents.setters.FunctionsOnParallelGroupAndElement;
import glengineer.agents.settings.ParallelGroupSettings;
import java.util.Iterator;
import javax.swing.GroupLayout.Alignment;
import javax.swing.GroupLayout.ParallelGroup;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParallelGroupAgent}.
* It contains ten unit test cases for the {@link ParallelGroupAgent#containsGapsOnly()} method.
*/
class ParallelGroupAgent_0Test {

    @Test
    void containsGapsOnly_0() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_1() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_2() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_3() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_4() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        agent.add(new Agent("d"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_5() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        agent.add(new Agent("d"));
        agent.add(new Agent("e"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_6() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        agent.add(new Agent("d"));
        agent.add(new Agent("e"));
        agent.add(new Agent("f"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_7() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        agent.add(new Agent("d"));
        agent.add(new Agent("e"));
        agent.add(new Agent("f"));
        agent.add(new Agent("g"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_8() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        agent.add(new Agent("d"));
        agent.add(new Agent("e"));
        agent.add(new Agent("f"));
        agent.add(new Agent("g"));
        agent.add(new Agent("h"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_9() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        agent.add(new Agent("d"));
        agent.add(new Agent("e"));
        agent.add(new Agent("f"));
        agent.add(new Agent("g"));
        agent.add(new Agent("h"));
        agent.add(new Agent("i"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_10() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        agent.add(new Agent("d"));
        agent.add(new Agent("e"));
        agent.add(new Agent("f"));
        agent.add(new Agent("g"));
        agent.add(new Agent("h"));
        agent.add(new Agent("i"));
        agent.add(new Agent("j"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_11() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        agent.add(new Agent("d"));
        agent.add(new Agent("e"));
        agent.add(new Agent("f"));
        agent.add(new Agent("g"));
        agent.add(new Agent("h"));
        agent.add(new Agent("i"));
        agent.add(new Agent("j"));
        agent.add(new Agent("k"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_12() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        agent.add(new Agent("d"));
        agent.add(new Agent("e"));
        agent.add(new Agent("f"));
        agent.add(new Agent("g"));
        agent.add(new Agent("h"));
        agent.add(new Agent("i"));
        agent.add(new Agent("j"));
        agent.add(new Agent("k"));
        agent.add(new Agent("l"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_13() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        agent.add(new Agent("d"));
        agent.add(new Agent("e"));
        agent.add(new Agent("f"));
        agent.add(new Agent("g"));
        agent.add(new Agent("h"));
        agent.add(new Agent("i"));
        agent.add(new Agent("j"));
        agent.add(new Agent("k"));
        agent.add(new Agent("l"));
        agent.add(new Agent("m"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_14() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        agent.add(new Agent("d"));
        agent.add(new Agent("e"));
        agent.add(new Agent("f"));
        agent.add(new Agent("g"));
        agent.add(new Agent("h"));
        agent.add(new Agent("i"));
        agent.add(new Agent("j"));
        agent.add(new Agent("k"));
        agent.add(new Agent("l"));
        agent.add(new Agent("m"));
        agent.add(new Agent("n"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_15() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        agent.add(new Agent("d"));
        agent.add(new Agent("e"));
        agent.add(new Agent("f"));
        agent.add(new Agent("g"));
        agent.add(new Agent("h"));
        agent.add(new Agent("i"));
        agent.add(new Agent("j"));
        agent.add(new Agent("k"));
        agent.add(new Agent("l"));
        agent.add(new Agent("m"));
        agent.add(new Agent("n"));
        agent.add(new Agent("o"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_16() {
        ParallelGroupAgent agent = new ParallelGroupAgent();
        agent.add(new Agent("a"));
        agent.add(new Agent("b"));
        agent.add(new Agent("c"));
        agent.add(new Agent("d"));
        agent.add(new Agent("e"));
        agent.add(new Agent("f"));
        agent.add(new Agent("g"));
        agent.add(new Agent("h"));
        agent.add(new Agent("i"));
        agent.add(new Agent("j"));
        agent.add(new Agent("k"));
        agent.add(new Agent("l"));
        agent.add(new Agent("m"));
        agent.add(new Agent("n"));
        agent.add(new Agent("o"));
        agent.add(new Agent("p"));
        assertFalse(agent.containsGapsOnly());
    }

    @Test
    void containsGapsOnly_17() {
        ParallelGroupAgent agent = new