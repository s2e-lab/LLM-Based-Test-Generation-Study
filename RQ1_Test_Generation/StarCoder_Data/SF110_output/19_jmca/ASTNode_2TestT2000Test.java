// ASTNode_2Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains ten unit test cases for the {@link ASTNode#createTree()} method.
*/
class ASTNode_2Test {

    /**
    * Test method for {@link ASTNode#createTree()}.
    */
    @Test
    void testCreateTree() {
        ASTNode root = new ASTNode("root", "root", null);
        ASTNode node1 = new ASTNode("node1", "node1", root);
        ASTNode node2 = new ASTNode("node2", "node2", root);
        ASTNode node3 = new ASTNode("node3", "node3", root);
        ASTNode node4 = new ASTNode("node4", "node4", node1);
        ASTNode node5 = new ASTNode("node5", "node5", node1);
        ASTNode node6 = new ASTNode("node6", "node6", node2);
        ASTNode node7 = new ASTNode("node7", "node7", node2);
        ASTNode node8 = new ASTNode("node8", "node8", node3);
        ASTNode node9 = new ASTNode("node9", "node9", node3);
        ASTNode node10 = new ASTNode("node10", "node10", node4);
        ASTNode node11 = new ASTNode("node11", "node11", node5);
        ASTNode node12 = new ASTNode("node12", "node12", node6);
        ASTNode node13 = new ASTNode("node13", "node13", node7);
        ASTNode node14 = new ASTNode("node14", "node14", node8);
        ASTNode node15 = new ASTNode("node15", "node15", node9);
        ASTNode node16 = new ASTNode("node16", "node16", node10);
        ASTNode node17 = new ASTNode("node17", "node17", node11);
        ASTNode node18 = new ASTNode("node18", "node18", node12);
        ASTNode node19 = new ASTNode("node19", "node19", node13);
        ASTNode node20 = new ASTNode("node20", "node20", node14);
        ASTNode node21 = new ASTNode("node21", "node21", node15);
        ASTNode node22 = new ASTNode("node22", "node22", node16);
        ASTNode node23 = new ASTNode("node23", "node23", node17);
        ASTNode node24 = new ASTNode("node24", "node24", node18);
        ASTNode node25 = new ASTNode("node25", "node25", node19);
        ASTNode node26 = new ASTNode("node26", "node26", node20);
        ASTNode node27 = new ASTNode("node27", "node27", node21);
        ASTNode node28 = new ASTNode("node28", "node28", node22);
        ASTNode node29 = new ASTNode("node29", "node29", node23);
        ASTNode node30 = new ASTNode("node30", "node30", node24);
        ASTNode node31 = new ASTNode("node31", "node31", node25);
        ASTNode node32 = new ASTNode("node32", "node32", node26);
        ASTNode node33 = new ASTNode("node33", "node33", node27);
        ASTNode node34 = new ASTNode("node34", "node34", node28);
        ASTNode node35 = new ASTNode("node35", "node35", node29);
        ASTNode node36 = new ASTNode("node36", "node36", node30);
        ASTNode node37 = new ASTNode("node37", "node37", node31);
        ASTNode node38 = new ASTNode("node38", "node38", node32);
        ASTNode node39 = new ASTNode("node39", "node39", node33);
        ASTNode node40 = new ASTNode("node40", "node40", node34);
        ASTNode node41 = new ASTNode("node41", "node41", node35);
        ASTNode node42 = new ASTNode("node42", "node42", node36);
        ASTNode node43 = new ASTNode("node43", "node43", node37);
        ASTNode node44 = new ASTNode("node44", "node44", node38);
        ASTNode node45 = new ASTNode("node45", "node45", node39);
        ASTNode node46 = new ASTNode("node46", "node46", node40);
        ASTNode node47 = new ASTNode("node47", "node47", node41);
        ASTNode node48 = new ASTNode("node48", "node48", node42);
        ASTNode node49 = new ASTNode("node49", "node49", node43);
        ASTNode node50 = new ASTNode("node50", "node50", node44);
        ASTNode node51 = new ASTNode("node51", "node51", node45);
        ASTNode node52 = new ASTNode("node52", "node52", node46);
        ASTNode node53 = new ASTNode("node53", "node53", node47);
        ASTNode node54 = new ASTNode("node54", "node54", node48);
        ASTNode node55 = new ASTNode("node55", "node55", node49);
        ASTNode node56 = new ASTNode("node56", "node56", node50);
        ASTNode node57 = new ASTNode("node57", "node57", node51);
        ASTNode node58 = new ASTNode("node58", "node58", node52);
        ASTNode node59 = new ASTNode("node59", "node59", node53);
        ASTNode node60 = new ASTNode("node60", "node60", node54);
        ASTNode node61 = new ASTNode("node61", "node61", node55);
        ASTNode node62 = new ASTNode("node62", "node62", node56);
        ASTNode node63 = new ASTNode("node63", "node63", node57);
        ASTNode node64 = new ASTNode("node64", "node64", node58);
        ASTNode node65 = new ASTNode("node65", "node65", node59);
        ASTNode node66 = new ASTNode("node66", "node66", node60);
        ASTNode node67 = new ASTNode("node67", "node67", node61);
        ASTNode node68 = new ASTNode("node68", "node68", node62);
        ASTNode node69 = new ASTNode("node69", "node69", node63);
        ASTNode node70 = new ASTNode("node70", "node70", node64);
        ASTNode node71 = new ASTNode("node71", "node71", node65);
        ASTNode node72 = new ASTNode("node72", "node72", node66);
        ASTNode node73 = new ASTNode("node73", "node73", node67);
        ASTNode node74 = new ASTNode("node74", "node74", node68);
        ASTNode node75 = new ASTNode("node75", "node75", node69);
        ASTNode node76 = new ASTNode("node76", "node76", node70);
        ASTNode node77 = new ASTNode("node77", "node77", node71);
        ASTNode node78 = new ASTNode("node78", "node78", node72);
        ASTNode node79 = new ASTNode("node79", "node79", node73);
        ASTNode node80 = new ASTNode("node80", "node80", node74);
        ASTNode node81 = new ASTNode("node81", "node81", node75);
        ASTNode node82 = new ASTNode("node82", "node82", node76);
        ASTNode node83 = new ASTNode("node83", "node83", node77);
        ASTNode node84 = new ASTNode