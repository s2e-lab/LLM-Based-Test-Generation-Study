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
    * It tests the border insets for a component with a width of 100 and a height of 100.
    */
    @Test
    void testGetBorderInsets_100_100() {
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

        // Act
        final Insets insets = border.getBorderInsets(component);

        // Assert
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a width of 100 and a height of 10.
    */
    @Test
    void testGetBorderInsets_100_10() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 100;
            }
            public int getHeight() {
                return 10;
            }
        };

        // Act
        final Insets insets = border.getBorderInsets(component);

        // Assert
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a width of 10 and a height of 100.
    */
    @Test
    void testGetBorderInsets_10_100() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 10;
            }
            public int getHeight() {
                return 100;
            }
        };

        // Act
        final Insets insets = border.getBorderInsets(component);

        // Assert
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a width of 10 and a height of 10.
    */
    @Test
    void testGetBorderInsets_10_10() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 10;
            }
            public int getHeight() {
                return 10;
            }
        };

        // Act
        final Insets insets = border.getBorderInsets(component);

        // Assert
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a width of 100 and a height of 1.
    */
    @Test
    void testGetBorderInsets_100_1() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 100;
            }
            public int getHeight() {
                return 1;
            }
        };

        // Act
        final Insets insets = border.getBorderInsets(component);

        // Assert
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a width of 1 and a height of 100.
    */
    @Test
    void testGetBorderInsets_1_100() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 1;
            }
            public int getHeight() {
                return 100;
            }
        };

        // Act
        final Insets insets = border.getBorderInsets(component);

        // Assert
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a width of 1 and a height of 1.
    */
    @Test
    void testGetBorderInsets_1_1() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 1;
            }
            public int getHeight() {
                return 1;
            }
        };

        // Act
        final Insets insets = border.getBorderInsets(component);

        // Assert
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a width of 100 and a height of 0.
    */
    @Test
    void testGetBorderInsets_100_0() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 100;
            }
            public int getHeight() {
                return 0;
            }
        };

        // Act
        final Insets insets = border.getBorderInsets(component);

        // Assert
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a width of 0 and a height of 100.
    */
    @Test
    void testGetBorderInsets_0_100() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 0;
            }
            public int getHeight() {
                return 100;
            }
        };

        // Act
        final Insets insets = border.getBorderInsets(component);

        // Assert
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
    }

    /**
    * Test case for the {@link ConditionalBorder#getBorderInsets(Component)} method.
    * It tests the border insets for a component with a width of 0 and a height of 0.
    */
    @Test
    void testGetBorderInsets_0_0() {
        // Arrange
        final ConditionalBorder border = new ConditionalBorder();
        final Component component = new Component() {
            public int getWidth() {
                return 0;
            }
            public int getHeight() {
                return 0;
            }
        };

        // Act
        final Insets insets = border.getBorderInsets(component);

        // Assert
        assertEquals(0, insets.top);
        assertEquals(0, insets.left);
        assertEquals(0, insets.bottom);
        assertEquals(0, insets.right);
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
    * It tests the border insets for a component with a width of 100 and a height of 100.
    */
    @Test
    void testGetBorderInsets_