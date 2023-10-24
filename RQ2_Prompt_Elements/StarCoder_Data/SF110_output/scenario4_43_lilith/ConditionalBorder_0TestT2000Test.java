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
    * Test method for {@link ConditionalBorder#getBorderInsets(Component)}.
    */
    @Test
    void testGetBorderInsets() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 1);
        Insets insets = border.getBorderInsets(null);
        assertEquals(1, insets.top);
        assertEquals(1, insets.left);
        assertEquals(1, insets.bottom);
        assertEquals(1, insets.right);
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
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
*/
class ConditionalBorder_1Test {
		
    /**
    * Test method for {@link ConditionalBorder#getBorderInsets(Component, Insets)}.
    */
    @Test
    void testGetBorderInsets() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 1);
        Insets insets = new Insets(1, 1, 1, 1);
        Insets result = border.getBorderInsets(null, insets);
        assertSame(insets, result);
        assertEquals(1, insets.top);
        assertEquals(1, insets.left);
        assertEquals(1, insets.bottom);
        assertEquals(1, insets.right);
    }
}

// ConditionalBorder_2Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#paintBorder(Component, Graphics, int, int, int, int)} method.
*/
class ConditionalBorder_2Test {
		
    /**
    * Test method for {@link ConditionalBorder#paintBorder(Component, Graphics, int, int, int, int)}.
    */
    @Test
    void testPaintBorder() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 1);
        Graphics g = null;
        int x = 0;
        int y = 0;
        int width = 0;
        int height = 0;
        border.paintBorder(null, g, x, y, width, height);
    }
}

// ConditionalBorder_3Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#isBorderOpaque()} method.
*/
class ConditionalBorder_3Test {
		
    /**
    * Test method for {@link ConditionalBorder#isBorderOpaque()}.
    */
    @Test
    void testIsBorderOpaque() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 1);
        boolean result = border.isBorderOpaque();
        assertFalse(result);
    }
}

// ConditionalBorder_4Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderColor()} method.
*/
class ConditionalBorder_4Test {
		
    /**
    * Test method for {@link ConditionalBorder#getBorderColor()}.
    */
    @Test
    void testGetBorderColor() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 1);
        Color result = border.getBorderColor();
        assertEquals(Color.BLACK, result);
    }
}

// ConditionalBorder_5Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#getInnerThickness()} method.
*/
class ConditionalBorder_5Test {
		
    /**
    * Test method for {@link ConditionalBorder#getInnerThickness()}.
    */
    @Test
    void testGetInnerThickness() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 1);
        int result = border.getInnerThickness();
        assertEquals(1, result);
    }
}

// ConditionalBorder_6Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#setBorderColor(Color)} method.
*/
class ConditionalBorder_6Test {
		
    /**
    * Test method for {@link ConditionalBorder#setBorderColor(Color)}.
    */
    @Test
    void testSetBorderColor() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 1);
        Color color = Color.RED;
        border.setBorderColor(color);
        Color result = border.getBorderColor();
        assertEquals(color, result);
    }
}

// ConditionalBorder_7Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#setInnerThickness(int)} method.
*/
class ConditionalBorder_7Test {
		
    /**
    * Test method for {@link ConditionalBorder#setInnerThickness(int)}.
    */
    @Test
    void testSetInnerThickness() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 1);
        int thickness = 2;
        border.setInnerThickness(thickness);
        int result = border.getInnerThickness();
        assertEquals(thickness, result);
    }
}

// ConditionalBorder_8Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#setThickness(int)} method.
*/
class ConditionalBorder_8Test {
		
    /**
    * Test method for {@link ConditionalBorder#setThickness(int)}.
    */
    @Test
    void testSetThickness() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 1);
        int thickness = 2;
        border.setThickness(thickness);
        int result = border.getThickness();
        assertEquals(thickness, result);
    }
}

// ConditionalBorder_9Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConditionalBorder}.
* It contains ten unit test cases for the {@link ConditionalBorder#getThickness()} method.
*/
class ConditionalBorder_9Test {
		
    /**
    * Test method for {@link ConditionalBorder#getThickness()}.
    */
    @Test
    void testGetThickness() {
        ConditionalBorder border = new ConditionalBorder(Color.BLACK, 1, 1);
        int result = border.getThickness();
        assertEquals(1, result);
    }
}

// ConditionalBorder_10Test.java
package de.huxhorn.lilith.swing.table.renderer;

import java.awt.*;
import javax.swing.border.AbstractBorder;
import org.junit.jupiter.