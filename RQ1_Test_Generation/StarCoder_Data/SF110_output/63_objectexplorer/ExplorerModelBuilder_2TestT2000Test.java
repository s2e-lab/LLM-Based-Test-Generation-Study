// ExplorerModelBuilder_2Test.java
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
class ExplorerModelBuilder_2Test {

    private ExplorerModelBuilder builder = ExplorerModelBuilder.getInstance();
    private ExplorerFigureBuilder figureBuilder = ExplorerFigureBuilder.getInstance();
    private ExplorerManager manager = ExplorerManager.INSTANCE;
    private ExplorerDrawingPanel panel = new ExplorerDrawingPanel();

    /**
    * Test case for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
    */
    @Test
    void testCreateNewExplorerModelWithFigure() {
        ExplorerModel model = this.builder.createNewExplorerModelWithFigure();
        assertNotNull(model);
        assertNotNull(model.getFigure());
        assertNotNull(model.getFigure().getPanel());
        assertEquals(this.panel, model.getFigure().getPanel());
        assertEquals(model, model.getFigure().getModel());
        assertEquals(model, model.getFigure().getPanel().getModel());
        assertEquals(model, this.manager.getExplorerModel(model.getFigure()));
    }

    /**
    * Test case for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
    */
    @Test
    void testCreateNewExplorerModelWithFigure_2() {
        ExplorerModel model = this.builder.createNewExplorerModelWithFigure();
        assertNotNull(model);
        assertNotNull(model.getFigure());
        assertNotNull(model.getFigure().getPanel());
        assertEquals(this.panel, model.getFigure().getPanel());
        assertEquals(model, model.getFigure().getModel());
        assertEquals(model, model.getFigure().getPanel().getModel());
        assertEquals(model, this.manager.getExplorerModel(model.getFigure()));
    }

    /**
    * Test case for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
    */
    @Test
    void testCreateNewExplorerModelWithFigure_3() {
        ExplorerModel model = this.builder.createNewExplorerModelWithFigure();
        assertNotNull(model);
        assertNotNull(model.getFigure());
        assertNotNull(model.getFigure().getPanel());
        assertEquals(this.panel, model.getFigure().getPanel());
        assertEquals(model, model.getFigure().getModel());
        assertEquals(model, model.getFigure().getPanel().getModel());
        assertEquals(model, this.manager.getExplorerModel(model.getFigure()));
    }

    /**
    * Test case for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
    */
    @Test
    void testCreateNewExplorerModelWithFigure_4() {
        ExplorerModel model = this.builder.createNewExplorerModelWithFigure();
        assertNotNull(model);
        assertNotNull(model.getFigure());
        assertNotNull(model.getFigure().getPanel());
        assertEquals(this.panel, model.getFigure().getPanel());
        assertEquals(model, model.getFigure().getModel());
        assertEquals(model, model.getFigure().getPanel().getModel());
        assertEquals(model, this.manager.getExplorerModel(model.getFigure()));
    }

    /**
    * Test case for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
    */
    @Test
    void testCreateNewExplorerModelWithFigure_5() {
        ExplorerModel model = this.builder.createNewExplorerModelWithFigure();
        assertNotNull(model);
        assertNotNull(model.getFigure());
        assertNotNull(model.getFigure().getPanel());
        assertEquals(this.panel, model.getFigure().getPanel());
        assertEquals(model, model.getFigure().getModel());
        assertEquals(model, model.getFigure().getPanel().getModel());
        assertEquals(model, this.manager.getExplorerModel(model.getFigure()));
    }

    /**
    * Test case for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
    */
    @Test
    void testCreateNewExplorerModelWithFigure_6() {
        ExplorerModel model = this.builder.createNewExplorerModelWithFigure();
        assertNotNull(model);
        assertNotNull(model.getFigure());
        assertNotNull(model.getFigure().getPanel());
        assertEquals(this.panel, model.getFigure().getPanel());
        assertEquals(model, model.getFigure().getModel());
        assertEquals(model, model.getFigure().getPanel().getModel());
        assertEquals(model, this.manager.getExplorerModel(model.getFigure()));
    }

    /**
    * Test case for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
    */
    @Test
    void testCreateNewExplorerModelWithFigure_7() {
        ExplorerModel model = this.builder.createNewExplorerModelWithFigure();
        assertNotNull(model);
        assertNotNull(model.getFigure());
        assertNotNull(model.getFigure().getPanel());
        assertEquals(this.panel, model.getFigure().getPanel());
        assertEquals(model, model.getFigure().getModel());
        assertEquals(model, model.getFigure().getPanel().getModel());
        assertEquals(model, this.manager.getExplorerModel(model.getFigure()));
    }

    /**
    * Test case for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
    */
    @Test
    void testCreateNewExplorerModelWithFigure_8() {
        ExplorerModel model = this.builder.createNewExplorerModelWithFigure();
        assertNotNull(model);
        assertNotNull(model.getFigure());
        assertNotNull(model.getFigure().getPanel());
        assertEquals(this.panel, model.getFigure().getPanel());
        assertEquals(model, model.getFigure().getModel());
        assertEquals(model, model.getFigure().getPanel().getModel());
        assertEquals(model, this.manager.getExplorerModel(model.getFigure()));
    }

    /**
    * Test case for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
    */
    @Test
    void testCreateNewExplorerModelWithFigure_9() {
        ExplorerModel model = this.builder.createNewExplorerModelWithFigure();
        assertNotNull(model);
        assertNotNull(model.getFigure());
        assertNotNull(model.getFigure().getPanel());
        assertEquals(this.panel, model.getFigure().getPanel());
        assertEquals(model, model.getFigure().getModel());
        assertEquals(model, model.getFigure().getPanel().getModel());
        assertEquals(model, this.manager.getExplorerModel(model.getFigure()));
    }

    /**
    * Test case for the {@link ExplorerModelBuilder#createNewExplorerModelWithFigure()} method.
    */
    @Test
    void testCreateNewExplorerModelWithFigure_10() {
        ExplorerModel model = this.builder.createNewExplorerModelWithFigure();
        assertNotNull(model);
        assertNotNull(model.getFigure());
        assertNotNull(model.getFigure().getPanel());
        assertEquals(this.panel, model.getFigure().getPanel());
        assertEquals(model, model.getFigure().getModel());
        assertEquals(model, model.getFigure().getPanel().getModel());
        assertEquals(model, this.manager.getExplorerModel(model.getFigure()));
    }
}
