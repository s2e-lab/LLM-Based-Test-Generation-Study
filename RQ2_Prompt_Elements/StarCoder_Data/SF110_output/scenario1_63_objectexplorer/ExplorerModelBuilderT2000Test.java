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

    @Test
    void testCreateNewExplorerModelWithFigure() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        this.connect(explModl, explFig);
    }

    @Test
    void testCreateNewExplorerModelWithFigure2() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        this.connect(explModl, explFig);
    }

    @Test
    void testCreateNewExplorerModelWithFigure3() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        this.connect(explModl, explFig);
    }

    @Test
    void testCreateNewExplorerModelWithFigure4() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        this.connect(explModl, explFig);
    }

    @Test
    void testCreateNewExplorerModelWithFigure5() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        this.connect(explModl, explFig);
    }

    @Test
    void testCreateNewExplorerModelWithFigure6() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        this.connect(explModl, explFig);
    }

    @Test
    void testCreateNewExplorerModelWithFigure7() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        this.connect(explModl, explFig);
    }

    @Test
    void testCreateNewExplorerModelWithFigure8() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        this.connect(explModl, explFig);
    }

    @Test
    void testCreateNewExplorerModelWithFigure9() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        this.connect(explModl, explFig);
    }

    @Test
    void testCreateNewExplorerModelWithFigure10() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        this.connect(explModl, explFig);
    }

    private ExplorerFigureBuilder getExplorerFigureBuilder() {
        return new ExplorerFigureBuilder();
    }

    private void connect(ExplorerModel explModl, ExplorerFigure explFig) {
        explModl.setExplorerFigure(explFig);
        explFig.setExplorerModel(explModl);
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
* It contains ten unit test cases for the {@link ExplorerModel#setExplorerFigure(ExplorerFigure)} and {@link ExplorerModel#getExplorerFigure()} methods.
*/
class ExplorerModelTest {
		
    @Test
    void testSetExplorerFigure() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        explModl.setExplorerFigure(explFig);
    }

    @Test
    void testGetExplorerFigure() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        explModl.setExplorerFigure(explFig);
        assertEquals(explFig, explModl.getExplorerFigure());
    }

    @Test
    void testGetExplorerFigure2() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        explModl.setExplorerFigure(explFig);
        assertEquals(explFig, explModl.getExplorerFigure());
    }

    @Test
    void testGetExplorerFigure3() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        explModl.setExplorerFigure(explFig);
        assertEquals(explFig, explModl.getExplorerFigure());
    }

    @Test
    void testGetExplorerFigure4() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        explModl.setExplorerFigure(explFig);
        assertEquals(explFig, explModl.getExplorerFigure());
    }

    @Test
    void testGetExplorerFigure5() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        explModl.setExplorerFigure(explFig);
        assertEquals(explFig, explModl.getExplorerFigure());
    }

    @Test
    void testGetExplorerFigure6() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        explModl.setExplorerFigure(explFig);
        assertEquals(explFig, explModl.getExplorerFigure());
    }

    @Test
    void testGetExplorerFigure7() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        explModl.setExplorerFigure(explFig);
        assertEquals(explFig, explModl.getExplorerFigure());
    }

    @Test
    void testGetExplorerFigure8() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        explModl.setExplorerFigure(explFig);
        assertEquals(explFig, explModl.getExplorerFigure());
    }

    @Test
    void testGetExplorerFigure9() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        explModl.setExplorerFigure(explFig);
        assertEquals(explFig, explModl.getExplorerFigure());
    }

    @Test
    void testGetExplorerFigure10() {
        ExplorerModel explModl;
        ExplorerFigure explFig;
        explModl = new ExplorerModel();
        explFig = this.getExplorerFigureBuilder().createNewExplorerFigure();
        explModl.setExplorerFigure(explFig);
        assertEquals(explFig, explModl.getExplorerFigure());
    }

    private ExplorerFigureBuilder getExplorerFigureBuilder() {
        return new ExplorerFigureBuilder();
    }
}

// ExplorerFigureBuilder.java
package de.paragon.explorer.figure;

import de.paragon.explorer.util.ExplorerManager;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.awt.geom.AffineTransform;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;
import java