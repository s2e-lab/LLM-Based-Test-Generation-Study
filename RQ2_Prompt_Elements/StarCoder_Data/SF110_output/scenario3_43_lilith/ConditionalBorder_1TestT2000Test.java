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
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
    * It tests the border insets for a component with a width of 100 and a height of 100.
    */
    @Test
    void testGetBorderInsets_1() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 100;
            }
            public int getHeight() {
                return 100;
            }
        };
        final Insets insets = new Insets(0, 0, 0, 0);

        // Act
        final Insets result = border.getBorderInsets(component, insets);

        // Assert
        assertEquals(0, result.top);
        assertEquals(0, result.left);
        assertEquals(0, result.bottom);
        assertEquals(0, result.right);
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
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
*/
class ConditionalBorder_2Test {
		
    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
    * It tests the border insets for a component with a width of 100 and a height of 100.
    */
    @Test
    void testGetBorderInsets_2() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 100;
            }
            public int getHeight() {
                return 100;
            }
        };
        final Insets insets = new Insets(1, 2, 3, 4);

        // Act
        final Insets result = border.getBorderInsets(component, insets);

        // Assert
        assertEquals(1, result.top);
        assertEquals(2, result.left);
        assertEquals(3, result.bottom);
        assertEquals(4, result.right);
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
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
*/
class ConditionalBorder_3Test {
		
    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
    * It tests the border insets for a component with a width of 100 and a height of 100.
    */
    @Test
    void testGetBorderInsets_3() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 100;
            }
            public int getHeight() {
                return 100;
            }
        };
        final Insets insets = new Insets(1, 2, 3, 4);

        // Act
        final Insets result = border.getBorderInsets(component, insets);

        // Assert
        assertEquals(1, result.top);
        assertEquals(2, result.left);
        assertEquals(3, result.bottom);
        assertEquals(4, result.right);
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
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
*/
class ConditionalBorder_4Test {
		
    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
    * It tests the border insets for a component with a width of 100 and a height of 100.
    */
    @Test
    void testGetBorderInsets_4() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 100;
            }
            public int getHeight() {
                return 100;
            }
        };
        final Insets insets = new Insets(1, 2, 3, 4);

        // Act
        final Insets result = border.getBorderInsets(component, insets);

        // Assert
        assertEquals(1, result.top);
        assertEquals(2, result.left);
        assertEquals(3, result.bottom);
        assertEquals(4, result.right);
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
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
*/
class ConditionalBorder_5Test {
		
    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
    * It tests the border insets for a component with a width of 100 and a height of 100.
    */
    @Test
    void testGetBorderInsets_5() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 100;
            }
            public int getHeight() {
                return 100;
            }
        };
        final Insets insets = new Insets(1, 2, 3, 4);

        // Act
        final Insets result = border.getBorderInsets(component, insets);

        // Assert
        assertEquals(1, result.top);
        assertEquals(2, result.left);
        assertEquals(3, result.bottom);
        assertEquals(4, result.right);
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
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
*/
class ConditionalBorder_6Test {
		
    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
    * It tests the border insets for a component with a width of 100 and a height of 100.
    */
    @Test
    void testGetBorderInsets_6() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 100;
            }
            public int getHeight() {
                return 100;
            }
        };
        final Insets insets = new Insets(1, 2, 3, 4);

        // Act
        final Insets result = border.getBorderInsets(component, insets);

        // Assert
        assertEquals(1, result.top);
        assertEquals(2, result.left);
        assertEquals(3, result.bottom);
        assertEquals(4, result.right);
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
* It contains ten unit test cases for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
*/
class ConditionalBorder_7Test {
		
    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component, Insets)} method.
    * It tests the border insets