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
    * It tests the border insets for a border with thickness 1 and innerThickness 0.
    */
    @Test
    void test_getBorderInsets_0() {
        ConditionalBorder border = new ConditionalBorder(1, 0);
        Insets insets = border.getBorderInsets(null);
        assertEquals(1, insets.top);
        assertEquals(1, insets.left);
        assertEquals(1, insets.bottom);
        assertEquals(1, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a border with thickness 1 and innerThickness 1.
    */
    @Test
    void test_getBorderInsets_1() {
        ConditionalBorder border = new ConditionalBorder(1, 1);
        Insets insets = border.getBorderInsets(null);
        assertEquals(2, insets.top);
        assertEquals(2, insets.left);
        assertEquals(2, insets.bottom);
        assertEquals(2, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a border with thickness 2 and innerThickness 0.
    */
    @Test
    void test_getBorderInsets_2() {
        ConditionalBorder border = new ConditionalBorder(2, 0);
        Insets insets = border.getBorderInsets(null);
        assertEquals(2, insets.top);
        assertEquals(2, insets.left);
        assertEquals(2, insets.bottom);
        assertEquals(2, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a border with thickness 2 and innerThickness 1.
    */
    @Test
    void test_getBorderInsets_3() {
        ConditionalBorder border = new ConditionalBorder(2, 1);
        Insets insets = border.getBorderInsets(null);
        assertEquals(3, insets.top);
        assertEquals(3, insets.left);
        assertEquals(3, insets.bottom);
        assertEquals(3, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a border with thickness 3 and innerThickness 0.
    */
    @Test
    void test_getBorderInsets_4() {
        ConditionalBorder border = new ConditionalBorder(3, 0);
        Insets insets = border.getBorderInsets(null);
        assertEquals(3, insets.top);
        assertEquals(3, insets.left);
        assertEquals(3, insets.bottom);
        assertEquals(3, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a border with thickness 3 and innerThickness 1.
    */
    @Test
    void test_getBorderInsets_5() {
        ConditionalBorder border = new ConditionalBorder(3, 1);
        Insets insets = border.getBorderInsets(null);
        assertEquals(4, insets.top);
        assertEquals(4, insets.left);
        assertEquals(4, insets.bottom);
        assertEquals(4, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a border with thickness 4 and innerThickness 0.
    */
    @Test
    void test_getBorderInsets_6() {
        ConditionalBorder border = new ConditionalBorder(4, 0);
        Insets insets = border.getBorderInsets(null);
        assertEquals(4, insets.top);
        assertEquals(4, insets.left);
        assertEquals(4, insets.bottom);
        assertEquals(4, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a border with thickness 4 and innerThickness 1.
    */
    @Test
    void test_getBorderInsets_7() {
        ConditionalBorder border = new ConditionalBorder(4, 1);
        Insets insets = border.getBorderInsets(null);
        assertEquals(5, insets.top);
        assertEquals(5, insets.left);
        assertEquals(5, insets.bottom);
        assertEquals(5, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a border with thickness 5 and innerThickness 0.
    */
    @Test
    void test_getBorderInsets_8() {
        ConditionalBorder border = new ConditionalBorder(5, 0);
        Insets insets = border.getBorderInsets(null);
        assertEquals(5, insets.top);
        assertEquals(5, insets.left);
        assertEquals(5, insets.bottom);
        assertEquals(5, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a border with thickness 5 and innerThickness 1.
    */
    @Test
    void test_getBorderInsets_9() {
        ConditionalBorder border = new ConditionalBorder(5, 1);
        Insets insets = border.getBorderInsets(null);
        assertEquals(6, insets.top);
        assertEquals(6, insets.left);
        assertEquals(6, insets.bottom);
        assertEquals(6, insets.right);
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
* It contains ten unit test cases for the {@link ConditionalBorder#paintBorder(Component, Graphics, int, int, int, int)} method.
*/
class ConditionalBorder_1Test {
		
    /**
    * Test case for the {@link ConditionalBorder#paintBorder(Component, Graphics, int, int, int, int)} method.
    * It tests the border painting for a border with thickness 1 and innerThickness 0.
    */
    @Test
    void test_paintBorder_0() {
        ConditionalBorder border = new ConditionalBorder(1, 0);
        Graphics graphics = new GraphicsMock();
        border.paintBorder(null, graphics, 0, 0, 0, 0);
        assertEquals(1, graphics.drawLineCount);
        assertEquals(1, graphics.drawRectCount);
    }

    /**
    * Test case for the {@link ConditionalBorder#paintBorder(Component, Graphics, int, int, int, int)} method.
    * It tests the border painting for a border with thickness 1 and innerThickness 1.
    */
    @Test
    void test_paintBorder_1() {
        ConditionalBorder border = new ConditionalBorder(1, 1);
        Graphics graphics = new GraphicsMock();
        border.paintBorder(null, graphics, 0, 0, 0, 0);
        assertEquals(1, graphics.drawLineCount);
        assertEquals(1, graphics.drawRectCount);
    }

    /**
    * Test case for the {@link ConditionalBorder#paintBorder(Component, Graphics, int, int, int, int)} method.
    * It tests the border painting for a border with thickness 2 and innerThickness 0.
    */
    @Test
    void test_paintBorder_2() {
        ConditionalBorder border = new ConditionalBorder(2, 0);
        Graphics graphics = new GraphicsMock();
        border.paintBorder(null, graphics, 0, 0, 0, 0);
        assertEquals(1, graphics.drawLineCount);
        assertEquals(1, graphics.drawRectCount);
    }

    /**
    * Test case for the {@link ConditionalBorder#paintBorder(Component, Graphics, int, int, int, int)} method.
    * It tests the border painting for a border with thickness 2 and innerThickness 1.
    */
    @Test
    void test_paintBorder_3() {
        ConditionalBorder border = new ConditionalBorder(2, 1);
        Graphics graphics = new GraphicsMock();
        border.paintBorder(null, graphics, 0, 0, 0, 0);
        assertEquals(1, graphics.drawLineCount);
        assertEquals(1, graphics.drawRectCount);
    }

    /**
    * Test case for the {@link ConditionalBorder#paintBorder(Component, Graphics, int, int, int, int)} method.
    * It tests the border painting for a border with thickness 3 and innerThickness 0.
    */
    @