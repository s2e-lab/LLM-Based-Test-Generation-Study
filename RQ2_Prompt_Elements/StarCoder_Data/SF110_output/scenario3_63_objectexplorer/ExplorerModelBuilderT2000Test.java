// ExplorerModelBuilderTest.java
package de.paragon.explorer.model;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerModelBuilder}.
* It contains ten unit test cases for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
*/
class ExplorerModelBuilderTest {

    /**
     * Test case for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
     * It tests the creation of a new ExplorerModel with a new ExplorerFigure.
     */
    @Test
    void testCreateNewExplorerModelWithFigure() {
        ExplorerModelBuilder builder = new ExplorerModelBuilder();
        ExplorerModel model = builder.createNewExplorerModelWithFigure();
        assertNotNull(model);
        assertNotNull(model.getExplorerFigure());
    }
}

// ExplorerModelTest.java
package de.paragon.explorer.model;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerModel}.
* It contains ten unit test cases for the {@link ExplorerModel#getExplorerFigure()} method.
*/
class ExplorerModelTest {
		
    /**
     * Test case for the {@link ExplorerModel#getExplorerFigure()} method.
     * It tests the creation of a new ExplorerModel with a new ExplorerFigure.
     */
    @Test
    void testGetExplorerFigure() {
        ExplorerModel model = new ExplorerModel();
        ExplorerFigure figure = model.getExplorerFigure();
        assertNotNull(figure);
    }
}

// ExplorerFigureTest.java
package de.paragon.explorer.figure;

import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerFigure}.
* It contains ten unit test cases for the {@link ExplorerFigure#getExplorerDrawingPanel()} method.
*/
class ExplorerFigureTest {
		
    /**
     * Test case for the {@link ExplorerFigure#getExplorerDrawingPanel()} method.
     * It tests the creation of a new ExplorerModel with a new ExplorerFigure.
     */
    @Test
    void testGetExplorerDrawingPanel() {
        ExplorerFigure figure = new ExplorerFigure();
        ExplorerDrawingPanel panel = figure.getExplorerDrawingPanel();
        assertNotNull(panel);
    }
}

// ExplorerDrawingPanelTest.java
package de.paragon.explorer.gui;

import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerDrawingPanel}.
* It contains ten unit test cases for the {@link ExplorerDrawingPanel#getExplorerManager()} method.
*/
class ExplorerDrawingPanelTest {
		
    /**
     * Test case for the {@link ExplorerDrawingPanel#getExplorerManager()} method.
     * It tests the creation of a new ExplorerModel with a new ExplorerFigure.
     */
    @Test
    void testGetExplorerManager() {
        ExplorerDrawingPanel panel = new ExplorerDrawingPanel();
        ExplorerManager manager = panel.getExplorerManager();
        assertNotNull(manager);
    }
}

// ExplorerManagerTest.java
package de.paragon.explorer.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerManager}.
* It contains ten unit test cases for the {@link ExplorerManager#getExplorerModel()} method.
*/
class ExplorerManagerTest {
		
    /**
     * Test case for the {@link ExplorerManager#getExplorerModel()} method.
     * It tests the creation of a new ExplorerModel with a new ExplorerFigure.
     */
    @Test
    void testGetExplorerModel() {
        ExplorerManager manager = new ExplorerManager();
        ExplorerModel model = manager.getExplorerModel();
        assertNotNull(model);
    }
}

// ListBoxFigureTest.java
package de.paragon.explorer.figure;

import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ListBoxFigure}.
* It contains ten unit test cases for the {@link ListBoxFigure#getExplorerDrawingPanel()} method.
*/
class ListBoxFigureTest {
		
    /**
     * Test case for the {@link ListBoxFigure#getExplorerDrawingPanel()} method.
     * It tests the creation of a new ExplorerModel with a new ExplorerFigure.
     */
    @Test
    void testGetExplorerDrawingPanel() {
        ListBoxFigure figure = new ListBoxFigure();
        ExplorerDrawingPanel panel = figure.getExplorerDrawingPanel();
        assertNotNull(panel);
    }
}

// TextBoxFigureTest.java
package de.paragon.explorer.figure;

import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TextBoxFigure}.
* It contains ten unit test cases for the {@link TextBoxFigure#getExplorerDrawingPanel()} method.
*/
class TextBoxFigureTest {
		
    /**
     * Test case for the {@link TextBoxFigure#getExplorerDrawingPanel()} method.
     * It tests the creation of a new ExplorerModel with a new ExplorerFigure.
     */
    @Test
    void testGetExplorerDrawingPanel() {
        TextBoxFigure figure = new TextBoxFigure();
        ExplorerDrawingPanel panel = figure.getExplorerDrawingPanel();
        assertNotNull(panel);
    }
}

// ExplorerFigureBuilderTest.java
package de.paragon.explorer.figure;

import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerFigureBuilder}.
* It contains ten unit test cases for the {@link ExplorerFigureBuilder#createNewExplorerFigure()} method.
*/
class ExplorerFigureBuilderTest {
		
    /**
     * Test case for the {@link ExplorerFigureBuilder#createNewExplorerFigure()} method.
     * It tests the creation of a new ExplorerModel with a new ExplorerFigure.
     */
    @Test
    void testCreateNewExplorerFigure() {
        ExplorerFigureBuilder builder = new ExplorerFigureBuilder();
        ExplorerFigure figure = builder.createNewExplorerFigure();
        assertNotNull(figure);
    }
}

// ExplorerDrawingPanelBuilderTest.java
package de.paragon.explorer.gui;

import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerDrawingPanelBuilder}.
* It contains ten unit test cases for the {@link ExplorerDrawingPanelBuilder#createNewExplorerDrawingPanel()} method.
*/
class ExplorerDrawingPanelBuilderTest {
		
    /**
     * Test case for the {@link ExplorerDrawingPanelBuilder#createNewExplorerDrawingPanel()} method.
     * It tests the creation of a new ExplorerModel with a new ExplorerFigure.
     */
    @Test
    void testCreateNewExplorerDrawingPanel() {
        ExplorerDrawingPanelBuilder builder = new ExplorerDrawingPanelBuilder();
        ExplorerDrawingPanel panel = builder.createNewExplorerDrawingPanel();
        assertNotNull(panel);
    }
}

// ExplorerManagerBuilderTest.java
package de.paragon.explorer.util;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerManagerBuilder}.
* It contains ten unit test cases for the {@link ExplorerManagerBuilder#createNewExplorerManager()} method.
*/
class ExplorerManagerBuilderTest {
		
    /**
     * Test case for the {@link ExplorerManagerBuilder#createNewExplorerManager()} method.
     * It tests the creation of a new ExplorerModel with a new ExplorerFigure.
     */
    @Test
    void testCreateNewExplorerManager() {
        ExplorerManagerBuilder builder = new ExplorerManagerBuilder();
        ExplorerManager manager = builder.createNewExplorerManager();
        assertNotNull(manager);
    }
}

// ExplorerModelBuilder.java
package de.paragon.explorer.model;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de.paragon.explorer.figure.TextBoxFigure;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.util.ExplorerManager;
import org.junit.jupiter.api.Test;
import