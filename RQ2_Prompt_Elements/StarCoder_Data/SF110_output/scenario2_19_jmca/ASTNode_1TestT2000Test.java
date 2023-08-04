// ASTNode_1Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode}.
* It contains ten unit test cases for the {@link ASTNode#getTree(String)} method.
*/
class ASTNode_1Test {

    /**
     * Test case for {@link ASTNode#getTree(String)}.
     */
    @Test
    void testGetTree() {
        ASTNode rootNode = ASTNode.getTree("ASTNode_1.ser");
        assertNotNull(rootNode);
        assertEquals("ASTNode_1", rootNode.getName());
        assertEquals(1, rootNode.getChildCount());
        assertEquals("ASTNode_2", rootNode.getChildAt(0).getName());
        assertEquals(1, rootNode.getChildAt(0).getChildCount());
        assertEquals("ASTNode_3", rootNode.getChildAt(0).getChildAt(0).getName());
        assertEquals(0, rootNode.getChildAt(0).getChildAt(0).getChildCount());
        assertEquals("ASTNode_4", rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getName());
        assertEquals(0, rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getChildCount());
        assertEquals("ASTNode_5", rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getName());
        assertEquals(0, rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildCount());
        assertEquals("ASTNode_6", rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getName());
        assertEquals(0, rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildCount());
        assertEquals("ASTNode_7", rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getName());
        assertEquals(0, rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildCount());
        assertEquals("ASTNode_8", rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getName());
        assertEquals(0, rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildCount());
        assertEquals("ASTNode_9", rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getName());
        assertEquals(0, rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildCount());
        assertEquals("ASTNode_10", rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getName());
        assertEquals(0, rootNode.getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildAt(0).getChildCount());
    }
}

// ASTNode_2.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ASTNode_2 extends ASTNode {

    public ASTNode_2() {
        super("ASTNode_2");
    }
}

// ASTNode_2Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode_2}.
* It contains one unit test case for the {@link ASTNode_2#ASTNode_2()} method.
*/
class ASTNode_2Test {
		
    /**
     * Test case for {@link ASTNode_2#ASTNode_2()}.
     */
    @Test
    void testASTNode_2() {
        ASTNode_2 node = new ASTNode_2();
        assertNotNull(node);
        assertEquals("ASTNode_2", node.getName());
        assertEquals(0, node.getChildCount());
    }
}

// ASTNode_3.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ASTNode_3 extends ASTNode {

    public ASTNode_3() {
        super("ASTNode_3");
    }
}

// ASTNode_3Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode_3}.
* It contains one unit test case for the {@link ASTNode_3#ASTNode_3()} method.
*/
class ASTNode_3Test {
		
    /**
     * Test case for {@link ASTNode_3#ASTNode_3()}.
     */
    @Test
    void testASTNode_3() {
        ASTNode_3 node = new ASTNode_3();
        assertNotNull(node);
        assertEquals("ASTNode_3", node.getName());
        assertEquals(0, node.getChildCount());
    }
}

// ASTNode_4.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ASTNode_4 extends ASTNode {

    public ASTNode_4() {
        super("ASTNode_4");
    }
}

// ASTNode_4Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode_4}.
* It contains one unit test case for the {@link ASTNode_4#ASTNode_4()} method.
*/
class ASTNode_4Test {
		
    /**
     * Test case for {@link ASTNode_4#ASTNode_4()}.
     */
    @Test
    void testASTNode_4() {
        ASTNode_4 node = new ASTNode_4();
        assertNotNull(node);
        assertEquals("ASTNode_4", node.getName());
        assertEquals(0, node.getChildCount());
    }
}

// ASTNode_5.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ASTNode_5 extends ASTNode {

    public ASTNode_5() {
        super("ASTNode_5");
    }
}

// ASTNode_5Test.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ASTNode_5}.
* It contains one unit test case for the {@link ASTNode_5#ASTNode_5()} method.
*/
class ASTNode_5Test {
		
    /**
     * Test case for {@link ASTNode_5#ASTNode_5()}.
     */
    @Test
    void testASTNode_5() {
        ASTNode_5 node = new ASTNode_5();
        assertNotNull(node);
        assertEquals("ASTNode_5", node.getName());
        assertEquals(0, node.getChildCount());
    }
}

// ASTNode_6.java
package com.soops.CEN4010.JMCA;

import java.util.ArrayList;
import java.io.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class ASTNode_6 extends ASTNode {

    public ASTNode_6() {
        super("ASTNode_6");
    }
}

//