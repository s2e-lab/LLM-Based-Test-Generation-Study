// ExplorerModelBuilder_1Test.java
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
* It contains ten unit test cases for the {@link ExplorerModelBuilder#add1stModel(Object)} method.
*/
class ExplorerModelBuilder_1Test {

		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)} method.
		* It tests the case when the given object is null.
		*/
		@Test
		void testAdd1stModel_1() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel explDrawPnl = explModlBldr.add1stModel(null);
				assertNotNull(explDrawPnl);
				assertNotNull(explDrawPnl.getModel());
				assertNotNull(explDrawPnl.getModel().getFigure());
				assertTrue(explDrawPnl.getModel().getFigure() instanceof ExplorerFigure);
				assertEquals(0, explDrawPnl.getModel().getObjectModels().size());
				assertEquals(0, explDrawPnl.getModel().getFigure().getChildren().size());
				assertEquals(0, explDrawPnl.getModel().getFigure().getConnections().size());
				assertEquals(0, ExplorerManager.INSTANCE.getExplorerModels().size());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)} method.
		* It tests the case when the given object is a String.
		*/
		@Test
		void testAdd1stModel_2() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel explDrawPnl = explModlBldr.add1stModel("Test");
				assertNotNull(explDrawPnl);
				assertNotNull(explDrawPnl.getModel());
				assertNotNull(explDrawPnl.getModel().getFigure());
				assertTrue(explDrawPnl.getModel().getFigure() instanceof ExplorerFigure);
				assertEquals(1, explDrawPnl.getModel().getObjectModels().size());
				assertEquals(1, explDrawPnl.getModel().getFigure().getChildren().size());
				assertEquals(0, explDrawPnl.getModel().getFigure().getConnections().size());
				assertEquals(1, ExplorerManager.INSTANCE.getExplorerModels().size());
				assertEquals(1, explDrawPnl.getModel().getObjectModels().get(0).getHeaderModel().getAttributeModels().size());
				assertEquals(0, explDrawPnl.getModel().getObjectModels().get(0).getAttributeModels().size());
				assertEquals(0, explDrawPnl.getModel().getObjectModels().get(0).getFigure().getChildren().size());
				assertEquals(0, explDrawPnl.getModel().getObjectModels().get(0).getFigure().getConnections().size());
				assertEquals(1, explDrawPnl.getModel().getObjectModels().get(0).getHeaderModel().getFigure().getChildren().size());
				assertEquals(0, explDrawPnl.getModel().getObjectModels().get(0).getHeaderModel().getFigure().getConnections().size());
				assertTrue(explDrawPnl.getModel().getObjectModels().get(0).getFigure() instanceof ListBoxFigure);
				assertTrue(explDrawPnl.getModel().getObjectModels().get(0).getHeaderModel().getFigure() instanceof ListBoxFigure);
				assertTrue(explDrawPnl.getModel().getObjectModels().get(0).getHeaderModel().getAttributeModels().get(0).getFigure() instanceof TextBoxFigure);
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)} method.
		* It tests the case when the given object is an Integer.
		*/
		@Test
		void testAdd1stModel_3() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel explDrawPnl = explModlBldr.add1stModel(new Integer(1));
				assertNotNull(explDrawPnl);
				assertNotNull(explDrawPnl.getModel());
				assertNotNull(explDrawPnl.getModel().getFigure());
				assertTrue(explDrawPnl.getModel().getFigure() instanceof ExplorerFigure);
				assertEquals(1, explDrawPnl.getModel().getObjectModels().size());
				assertEquals(1, explDrawPnl.getModel().getFigure().getChildren().size());
				assertEquals(0, explDrawPnl.getModel().getFigure().getConnections().size());
				assertEquals(1, ExplorerManager.INSTANCE.getExplorerModels().size());
				assertEquals(1, explDrawPnl.getModel().getObjectModels().get(0).getHeaderModel().getAttributeModels().size());
				assertEquals(0, explDrawPnl.getModel().getObjectModels().get(0).getAttributeModels().size());
				assertEquals(0, explDrawPnl.getModel().getObjectModels().get(0).getFigure().getChildren().size());
				assertEquals(0, explDrawPnl.getModel().getObjectModels().get(0).getFigure().getConnections().size());
				assertEquals(1, explDrawPnl.getModel().getObjectModels().get(0).getHeaderModel().getFigure().getChildren().size());
				assertEquals(0, explDrawPnl.getModel().getObjectModels().get(0).getHeaderModel().getFigure().getConnections().size());
				assertTrue(explDrawPnl.getModel().getObjectModels().get(0).getFigure() instanceof ListBoxFigure);
				assertTrue(explDrawPnl.getModel().getObjectModels().get(0).getHeaderModel().getFigure() instanceof ListBoxFigure);
				assertTrue(explDrawPnl.getModel().getObjectModels().get(0).getHeaderModel().getAttributeModels().get(0).getFigure() instanceof TextBoxFigure);
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)} method.
		* It tests the case when the given object is a Double.
		*/
		@Test
		void testAdd1stModel_4() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel explDrawPnl = explModlBldr.add1stModel(new Double(1.0));
				assertNotNull(explDrawPnl);
				assertNotNull(explDrawPnl.getModel());
				assertNotNull(explDrawPnl.getModel().getFigure());
				assertTrue(explDrawPnl.getModel().getFigure() instanceof ExplorerFigure);
				assertEquals(1, explDrawPnl.getModel().getObjectModels().size());
				assertEquals(1, explDrawPnl.getModel().getFigure().getChildren().size());
				assertEquals(0, explDrawPnl.getModel().getFigure().getConnections().size());
				assertEquals(1, ExplorerManager.INSTANCE.getExplorerModels().size());
				assertEquals(1, explDrawPnl.getModel().getObjectModels().get(0).getHeaderModel().getAttributeModels().size());
				assertEquals(0, explDrawPnl.getModel().getObjectModels().get(0).getAttributeModels().size());
				assertEquals(0, expl