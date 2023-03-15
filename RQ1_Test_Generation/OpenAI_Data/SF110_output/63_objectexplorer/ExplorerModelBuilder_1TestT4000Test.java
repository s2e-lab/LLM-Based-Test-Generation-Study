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
				assertNotNull(explDrawPnl.getModel().getObjectModels());
				assertTrue(explDrawPnl.getModel().getObjectModels().isEmpty());
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
				assertNotNull(explDrawPnl.getModel().getObjectModels());
				assertTrue(explDrawPnl.getModel().getObjectModels().isEmpty());
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
				assertNotNull(explDrawPnl.getModel().getObjectModels());
				assertTrue(explDrawPnl.getModel().getObjectModels().isEmpty());
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
				assertNotNull(explDrawPnl.getModel().getObjectModels());
				assertTrue(explDrawPnl.getModel().getObjectModels().isEmpty());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)} method.
		* It tests the case when the given object is a Float.
		*/
		@Test
		void testAdd1stModel_5() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel explDrawPnl = explModlBldr.add1stModel(new Float(1.0));
				assertNotNull(explDrawPnl);
				assertNotNull(explDrawPnl.getModel());
				assertNotNull(explDrawPnl.getModel().getFigure());
				assertTrue(explDrawPnl.getModel().getFigure() instanceof ExplorerFigure);
				assertNotNull(explDrawPnl.getModel().getObjectModels());
				assertTrue(explDrawPnl.getModel().getObjectModels().isEmpty());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)} method.
		* It tests the case when the given object is a Boolean.
		*/
		@Test
		void testAdd1stModel_6() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel explDrawPnl = explModlBldr.add1stModel(new Boolean(true));
				assertNotNull(explDrawPnl);
				assertNotNull(explDrawPnl.getModel());
				assertNotNull(explDrawPnl.getModel().getFigure());
				assertTrue(explDrawPnl.getModel().getFigure() instanceof ExplorerFigure);
				assertNotNull(explDrawPnl.getModel().getObjectModels());
				assertTrue(explDrawPnl.getModel().getObjectModels().isEmpty());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)} method.
		* It tests the case when the given object is a Character.
		*/
		@Test
		void testAdd1stModel_7() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel explDrawPnl = explModlBldr.add1stModel(new Character('a'));
				assertNotNull(explDrawPnl);
				assertNotNull(explDrawPnl.getModel());
				assertNotNull(explDrawPnl.getModel().getFigure());
				assertTrue(explDrawPnl.getModel().getFigure() instanceof ExplorerFigure);
				assertNotNull(explDrawPnl.getModel().getObjectModels());
				assertTrue(explDrawPnl.getModel().getObjectModels().isEmpty());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)} method.
		* It tests the case when the given object is a Byte.
		*/
		@Test
		void testAdd1stModel_8() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel explDrawPnl = explModlBldr.add1stModel(new Byte((byte) 1));
				assertNotNull(explDrawPnl);
				assertNotNull(explDrawPnl.getModel());
				assertNotNull(explDrawPnl.getModel().getFigure());
				assertTrue(explDrawPnl.getModel().getFigure() instanceof ExplorerFigure);
				assertNotNull(explDrawPnl.getModel().getObjectModels());
				assertTrue(explDrawPnl.getModel().getObjectModels().isEmpty());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)} method.
		* It tests the case when the given object is a Short.
		*/
		@Test
		void testAdd1stModel_9() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel explDrawPnl = explModlBldr.add1stModel(new Short((short) 1));
				assertNotNull(explDrawPnl);
				assertNotNull(explDrawPnl.getModel());
				assertNotNull(explDrawPnl.getModel().getFigure());
				assertTrue(explDrawPnl.getModel().getFigure() instanceof ExplorerFigure);
				assertNotNull(explDrawPnl.getModel().getObjectModels());
				assertTrue(explDrawPnl.getModel().getObjectModels().isEmpty());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#add1stModel(Object)} method.
		* It tests the case when the given object is a Long.
		*/
		@Test
		void testAdd1stModel_10() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerDrawingPanel explDrawPnl = explModlBldr.add1stModel(new Long(1));
				assertNotNull(explDrawPnl);
				assertNotNull(explDrawPnl.getModel());
				assertNotNull(explDrawPnl.getModel().getFigure());
				assertTrue(explDrawPnl.getModel().getFigure() instanceof ExplorerFigure);
				assertNotNull(explDrawPnl.getModel().getObjectModels());
				assertTrue(explDrawPnl.getModel().getObjectModels().isEmpty());
		}
}

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
* It contains ten unit test cases for the {@link ExplorerModelBuilder#addModel(ExplorerModel, Object)} method.
*/
class ExplorerModelBuilder_2Test {
		
		/**
		* Test case for {@link ExplorerModelBuilder#addModel(ExplorerModel, Object)} method.
		* It tests the case when the given object is null.
		*/
		@Test
		void testAddModel_1() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerModel explModl = new ExplorerModel();
				ExplorerFigure explFig = explModlBldr.getExplorerFigureBuilder().createNewExplorerFigure();
				explModlBldr.connect(explModl, explFig);
				explModlBldr.addModel(explModl, null);
				assertNotNull(explModl);
				assertNotNull(explModl.getFigure());
				assertTrue(explModl.getFigure() instanceof ExplorerFigure);
				assertNotNull(explModl.getObjectModels());
				assertTrue(explModl.getObjectModels().isEmpty());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#addModel(ExplorerModel, Object)} method.
		* It tests the case when the given object is a String.
		*/
		@Test
		void testAddModel_2() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerModel explModl = new ExplorerModel();
				ExplorerFigure explFig = explModlBldr.getExplorerFigureBuilder().createNewExplorerFigure();
				explModlBldr.connect(explModl, explFig);
				explModlBldr.addModel(explModl, "Test");
				assertNotNull(explModl);
				assertNotNull(explModl.getFigure());
				assertTrue(explModl.getFigure() instanceof ExplorerFigure);
				assertNotNull(explModl.getObjectModels());
				assertTrue(explModl.getObjectModels().isEmpty());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#addModel(ExplorerModel, Object)} method.
		* It tests the case when the given object is an Integer.
		*/
		@Test
		void testAddModel_3() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerModel explModl = new ExplorerModel();
				ExplorerFigure explFig = explModlBldr.getExplorerFigureBuilder().createNewExplorerFigure();
				explModlBldr.connect(explModl, explFig);
				explModlBldr.addModel(explModl, new Integer(1));
				assertNotNull(explModl);
				assertNotNull(explModl.getFigure());
				assertTrue(explModl.getFigure() instanceof ExplorerFigure);
				assertNotNull(explModl.getObjectModels());
				assertTrue(explModl.getObjectModels().isEmpty());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#addModel(ExplorerModel, Object)} method.
		* It tests the case when the given object is a Double.
		*/
		@Test
		void testAddModel_4() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerModel explModl = new ExplorerModel();
				ExplorerFigure explFig = explModlBldr.getExplorerFigureBuilder().createNewExplorerFigure();
				explModlBldr.connect(explModl, explFig);
				explModlBldr.addModel(explModl, new Double(1.0));
				assertNotNull(explModl);
				assertNotNull(explModl.getFigure());
				assertTrue(explModl.getFigure() instanceof ExplorerFigure);
				assertNotNull(explModl.getObjectModels());
				assertTrue(explModl.getObjectModels().isEmpty());
		}
		
		/**
		* Test case for {@link ExplorerModelBuilder#addModel(ExplorerModel, Object)} method.
		* It tests the case when the given object is a Float.
		*/
		@Test
		void testAddModel_5() {
				ExplorerModelBuilder explModlBldr = ExplorerModelBuilder.getInstance();
				ExplorerModel explModl = new ExplorerModel();
				ExplorerFigure explFig = explModlBldr.getExplorerFigureBuilder().createNewExplorerFigure();
				explModlBldr.connect(explModl, explFig);
				explModlBldr.addModel(explModl, new Float(1.0));
				assertNotNull(explModl);
				assertNotNull(explModl.getFigure());
				assertTrue(expl