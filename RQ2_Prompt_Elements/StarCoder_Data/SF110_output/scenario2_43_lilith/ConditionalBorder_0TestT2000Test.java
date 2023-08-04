// ConditionalBorder_0Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component)} method.
*/
class ConditionalBorder_0Test {

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a null border.
    */
    @Test
    void testGetBorderInsets_0() {
        ConditionalBorder border = new ConditionalBorder(null, 0, 0, 0, 0);
        Insets insets = border.getBorderInsets(null);
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a non-null border.
    */
    @Test
    void testGetBorderInsets_1() {
        ConditionalBorder border = new ConditionalBorder(new AbstractBorder() {
            public Insets getBorderInsets(Component c) {
                return new Insets(1, 2, 3, 4);
            }
        }, 0, 0, 0, 0);
        Insets insets = border.getBorderInsets(null);
        assertEquals(1, insets.top);
        assertEquals(2, insets.left);
        assertEquals(3, insets.bottom);
        assertEquals(4, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a non-null border.
    */
    @Test
    void testGetBorderInsets_2() {
        ConditionalBorder border = new ConditionalBorder(new AbstractBorder() {
            public Insets getBorderInsets(Component c) {
                return new Insets(1, 2, 3, 4);
            }
        }, 5, 6, 7, 8);
        Insets insets = border.getBorderInsets(null);
        assertEquals(6, insets.top);
        assertEquals(8, insets.left);
        assertEquals(10, insets.bottom);
        assertEquals(12, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a non-null border.
    */
    @Test
    void testGetBorderInsets_3() {
        ConditionalBorder border = new ConditionalBorder(new AbstractBorder() {
            public Insets getBorderInsets(Component c) {
                return new Insets(1, 2, 3, 4);
            }
        }, 5, 6, 7, 8);
        Insets insets = border.getBorderInsets(null);
        assertEquals(6, insets.top);
        assertEquals(8, insets.left);
        assertEquals(10, insets.bottom);
        assertEquals(12, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a non-null border.
    */
    @Test
    void testGetBorderInsets_4() {
        ConditionalBorder border = new ConditionalBorder(new AbstractBorder() {
            public Insets getBorderInsets(Component c) {
                return new Insets(1, 2, 3, 4);
            }
        }, 5, 6, 7, 8);
        Insets insets = border.getBorderInsets(null);
        assertEquals(6, insets.top);
        assertEquals(8, insets.left);
        assertEquals(10, insets.bottom);
        assertEquals(12, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a non-null border.
    */
    @Test
    void testGetBorderInsets_5() {
        ConditionalBorder border = new ConditionalBorder(new AbstractBorder() {
            public Insets getBorderInsets(Component c) {
                return new Insets(1, 2, 3, 4);
            }
        }, 5, 6, 7, 8);
        Insets insets = border.getBorderInsets(null);
        assertEquals(6, insets.top);
        assertEquals(8, insets.left);
        assertEquals(10, insets.bottom);
        assertEquals(12, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a non-null border.
    */
    @Test
    void testGetBorderInsets_6() {
        ConditionalBorder border = new ConditionalBorder(new AbstractBorder() {
            public Insets getBorderInsets(Component c) {
                return new Insets(1, 2, 3, 4);
            }
        }, 5, 6, 7, 8);
        Insets insets = border.getBorderInsets(null);
        assertEquals(6, insets.top);
        assertEquals(8, insets.left);
        assertEquals(10, insets.bottom);
        assertEquals(12, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a non-null border.
    */
    @Test
    void testGetBorderInsets_7() {
        ConditionalBorder border = new ConditionalBorder(new AbstractBorder() {
            public Insets getBorderInsets(Component c) {
                return new Insets(1, 2, 3, 4);
            }
        }, 5, 6, 7, 8);
        Insets insets = border.getBorderInsets(null);
        assertEquals(6, insets.top);
        assertEquals(8, insets.left);
        assertEquals(10, insets.bottom);
        assertEquals(12, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a non-null border.
    */
    @Test
    void testGetBorderInsets_8() {
        ConditionalBorder border = new ConditionalBorder(new AbstractBorder() {
            public Insets getBorderInsets(Component c) {
                return new Insets(1, 2, 3, 4);
            }
        }, 5, 6, 7, 8);
        Insets insets = border.getBorderInsets(null);
        assertEquals(6, insets.top);
        assertEquals(8, insets.left);
        assertEquals(10, insets.bottom);
        assertEquals(12, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a non-null border.
    */
    @Test
    void testGetBorderInsets_9() {
        ConditionalBorder border = new ConditionalBorder(new AbstractBorder() {
            public Insets getBorderInsets(Component c) {
                return new Insets(1, 2, 3, 4);
            }
        }, 5, 6, 7, 8);
        Insets insets = border.getBorderInsets(null);
        assertEquals(6, insets.top);
        assertEquals(8, insets.left);
        assertEquals(10, insets.bottom);
        assertEquals(12, insets.right);
    }
}

// ConditionalBorder_1Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component)} method.
*/
class ConditionalBorder_1Test {
		
    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a null border.
    */
    @Test
    void testGetBorderInsets_0() {
        ConditionalBorder border = new ConditionalBorder(null, 0, 0, 0, 0);
        Insets insets = border.getBorderInsets(null);
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a non-null border.
    */
    @Test
    void testGetBorderInsets_1() {
        ConditionalBorder border = new ConditionalBorder(new AbstractBorder() {
            public Insets getBorderInsets(Component c) {
                return new Insets(1, 2, 3