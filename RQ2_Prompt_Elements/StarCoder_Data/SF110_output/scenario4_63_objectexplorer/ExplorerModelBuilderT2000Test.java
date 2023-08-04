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
    * It tests the creation of a new {@link ExplorerModel} and a new {@link ExplorerFigure}.
    */
    @Test
    void testCreateNewExplorerModelWithFigure() {
        // Arrange
        ExplorerModelBuilder builder = ExplorerModelBuilder.getInstance();
        ExplorerModel expectedModel = new ExplorerModel();
        ExplorerFigure expectedFigure = new ExplorerFigure();
        // Act
        ExplorerModel actualModel = builder.createNewExplorerModelWithFigure();
        ExplorerFigure actualFigure = actualModel.getExplorerFigure();
        // Assert
        assertEquals(expectedModel, actualModel);
        assertEquals(expectedFigure, actualFigure);
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
    * It tests the retrieval of the {@link ExplorerFigure} of an {@link ExplorerModel}.
    */
    @Test
    void testGetExplorerFigure() {
        // Arrange
        ExplorerModel model = new ExplorerModel();
        ExplorerFigure expectedFigure = new ExplorerFigure();
        model.setExplorerFigure(expectedFigure);
        // Act
        ExplorerFigure actualFigure = model.getExplorerFigure();
        // Assert
        assertEquals(expectedFigure, actualFigure);
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
* It contains ten unit test cases for the {@link ExplorerModel#setExplorerFigure(ExplorerFigure)} method.
*/
class ExplorerModelTest {
		
    /**
    * Test case for the {@link ExplorerModel#setExplorerFigure(ExplorerFigure)} method.
    * It tests the setting of the {@link ExplorerFigure} of an {@link ExplorerModel}.
    */
    @Test
    void testSetExplorerFigure() {
        // Arrange
        ExplorerModel model = new ExplorerModel();
        ExplorerFigure expectedFigure = new ExplorerFigure();
        // Act
        model.setExplorerFigure(expectedFigure);
        ExplorerFigure actualFigure = model.getExplorerFigure();
        // Assert
        assertEquals(expectedFigure, actualFigure);
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
* It contains ten unit test cases for the {@link ExplorerModel#getExplorerManager()} method.
*/
class ExplorerModelTest {
		
    /**
    * Test case for the {@link ExplorerModel#getExplorerManager()} method.
    * It tests the retrieval of the {@link ExplorerManager} of an {@link ExplorerModel}.
    */
    @Test
    void testGetExplorerManager() {
        // Arrange
        ExplorerModel model = new ExplorerModel();
        ExplorerManager expectedManager = new ExplorerManager();
        model.setExplorerManager(expectedManager);
        // Act
        ExplorerManager actualManager = model.getExplorerManager();
        // Assert
        assertEquals(expectedManager, actualManager);
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
* It contains ten unit test cases for the {@link ExplorerModel#setExplorerManager(ExplorerManager)} method.
*/
class ExplorerModelTest {
		
    /**
    * Test case for the {@link ExplorerModel#setExplorerManager(ExplorerManager)} method.
    * It tests the setting of the {@link ExplorerManager} of an {@link ExplorerModel}.
    */
    @Test
    void testSetExplorerManager() {
        // Arrange
        ExplorerModel model = new ExplorerModel();
        ExplorerManager expectedManager = new ExplorerManager();
        // Act
        model.setExplorerManager(expectedManager);
        ExplorerManager actualManager = model.getExplorerManager();
        // Assert
        assertEquals(expectedManager, actualManager);
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
* It contains ten unit test cases for the {@link ExplorerModel#getObjectModels()} method.
*/
class ExplorerModelTest {
		
    /**
    * Test case for the {@link ExplorerModel#getObjectModels()} method.
    * It tests the retrieval of the {@link ObjectModel}s of an {@link ExplorerModel}.
    */
    @Test
    void testGetObjectModels() {
        // Arrange
        ExplorerModel model = new ExplorerModel();
        ObjectModel expectedObjectModel = new ObjectModel();
        model.addObjectModel(expectedObjectModel);
        // Act
        ObjectModel[] actualObjectModels = model.getObjectModels();
        // Assert
        assertEquals(1, actualObjectModels.length);
        assertEquals(expectedObjectModel, actualObjectModels[0]);
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
* It contains ten unit test cases for the {@link ExplorerModel#addObjectModel(ObjectModel)} method.
*/
class ExplorerModelTest {
		
    /**
    * Test case for the {@link ExplorerModel#addObjectModel(ObjectModel)} method.
    * It tests the adding of an {@link ObjectModel} to an {@link ExplorerModel}.
    */
    @Test
    void testAddObjectModel() {
        // Arrange
        ExplorerModel model = new ExplorerModel();
        ObjectModel expectedObjectModel = new ObjectModel();
        // Act
        model.addObjectModel(expectedObjectModel);
        ObjectModel[] actualObjectModels = model.getObjectModels();
        // Assert
        assertEquals(1, actualObjectModels.length);
        assertEquals(expectedObjectModel, actualObjectModels[0]);
    }
}

// ExplorerModelTest.java
package de.paragon.explorer.model;

import de.paragon.explorer.figure.ExplorerFigure;
import de.paragon.explorer.figure.ExplorerFigureBuilder;
import de.paragon.explorer.figure.ListBoxFigure;
import de