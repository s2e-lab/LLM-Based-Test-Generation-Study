// DisplayBoxComposerTest.java
package de.paragon.explorer.gui;

import org.apache.log4j.Logger;
import de.paragon.explorer.excp.FigureException;
import de.paragon.explorer.figure.CompositeFigure;
import de.paragon.explorer.figure.Figure;
import de.paragon.explorer.util.LoggerFactory;
import de.paragon.explorer.util.ResourceBundlePurchaser;
import de.paragon.explorer.util.StandardEnumeration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DisplayBoxComposer}.
* It contains ten unit test cases for the {@link DisplayBoxComposer#compose(CompositeFigure)} method.
*/
class DisplayBoxComposerTest {

	private static final Logger logger = LoggerFactory.make();
	
	private static final String ERROR_IN_THIS_OBJECT = "displayboxcomposer.error_in_this_object";
	
	/**
	 * Test case 1:
	 * 
	 * Test the {@link DisplayBoxComposer#compose(CompositeFigure)} method with a {@link CompositeFigure}
	 * that contains no {@link Figure}s.
	 * 
	 * Expected result:
	 * 
	 * The {@link DisplayBoxComposer#compose(CompositeFigure)} method returns a {@link NullDisplayBox}.
	 */
	@Test
	void testCompose_NoFigures() {
		CompositeFigure compositeFigure = new CompositeFigure();
		DisplayBoxComposer displayBoxComposer = new DisplayBoxComposer();
		DisplayBox displayBox = displayBoxComposer.compose(compositeFigure);
		assertTrue(displayBox instanceof NullDisplayBox);
	}
	
	/**
	 * Test case 2:
	 * 
	 * Test the {@link DisplayBoxComposer#compose(CompositeFigure)} method with a {@link CompositeFigure}
	 * that contains one {@link Figure} with a {@link DisplayBox} with the following values:
	 * 
	 * x = 0
	 * y = 0
	 * width = 100
	 * height = 100
	 * 
	 * Expected result:
	 * 
	 * The {@link DisplayBoxComposer#compose(CompositeFigure)} method returns a {@link StandardRectangularDisplayBox}
	 * with the following values:
	 * 
	 * x = 0
	 * y = 0
	 * width = 100
	 * height = 100
	 */
	@Test
	void testCompose_OneFigure() {
		CompositeFigure compositeFigure = new CompositeFigure();
		compositeFigure.addFigure(new Figure() {
			@Override
			public DisplayBox getDisplayBox() {
				return new StandardRectangularDisplayBox(0, 0, 100, 100);
			}
			@Override
			public void draw(java.awt.Graphics g) {
			}
			@Override
			public void moveBy(int dx, int dy) {
			}
			@Override
			public StandardEnumeration getFigures() throws FigureException {
				return null;
			}
			@Override
			public void addFigure(Figure figure) {
			}
			@Override
			public void removeFigure(Figure figure) {
			}
			@Override
			public Figure findFigure(int x, int y) {
				return null;
			}
			@Override
			public void release() {
			}
		});
		DisplayBoxComposer displayBoxComposer = new DisplayBoxComposer();
		DisplayBox displayBox = displayBoxComposer.compose(compositeFigure);
		assertTrue(displayBox instanceof StandardRectangularDisplayBox);
		assertEquals(0, displayBox.getRectangle().x);
		assertEquals(0, displayBox.getRectangle().y);
		assertEquals(100, displayBox.getRectangle().width);
		assertEquals(100, displayBox.getRectangle().height);
	}
	
	/**
	 * Test case 3:
	 * 
	 * Test the {@link DisplayBoxComposer#compose(CompositeFigure)} method with a {@link CompositeFigure}
	 * that contains two {@link Figure}s with a {@link DisplayBox} with the following values:
	 * 
	 * Figure 1:
	 * x = 0
	 * y = 0
	 * width = 100
	 * height = 100
	 * 
	 * Figure 2:
	 * x = 0
	 * y = 0
	 * width = 100
	 * height = 100
	 * 
	 * Expected result:
	 * 
	 * The {@link DisplayBoxComposer#compose(CompositeFigure)} method returns a {@link StandardRectangularDisplayBox}
	 * with the following values:
	 * 
	 * x = 0
	 * y = 0
	 * width = 100
	 * height = 100
	 */
	@Test
	void testCompose_TwoFigures() {
		CompositeFigure compositeFigure = new CompositeFigure();
		compositeFigure.addFigure(new Figure() {
			@Override
			public DisplayBox getDisplayBox() {
				return new StandardRectangularDisplayBox(0, 0, 100, 100);
			}
			@Override
			public void draw(java.awt.Graphics g) {
			}
			@Override
			public void moveBy(int dx, int dy) {
			}
			@Override
			public StandardEnumeration getFigures() throws FigureException {
				return null;
			}
			@Override
			public void addFigure(Figure figure) {
			}
			@Override
			public void removeFigure(Figure figure) {
			}
			@Override
			public Figure findFigure(int x, int y) {
				return null;
			}
			@Override
			public void release() {
			}
		});
		compositeFigure.addFigure(new Figure() {
			@Override
			public DisplayBox getDisplayBox() {
				return new StandardRectangularDisplayBox(0, 0, 100, 100);
			}
			@Override
			public void draw(java.awt.Graphics g) {
			}
			@Override
			public void moveBy(int dx, int dy) {
			}
			@Override
			public StandardEnumeration getFigures() throws FigureException {
				return null;
			}
			@Override
			public void addFigure(Figure figure) {
			}
			@Override
			public void removeFigure(Figure figure) {
			}
			@Override
			public Figure findFigure(int x, int y) {
				return null;
			}
			@Override
			public void release() {
			}
		});
		DisplayBoxComposer displayBoxComposer = new DisplayBoxComposer();
		DisplayBox displayBox = displayBoxComposer.compose(compositeFigure);
		assertTrue(displayBox instanceof StandardRectangularDisplayBox);
		assertEquals(0, displayBox.getRectangle().x);
		assertEquals(0, displayBox.getRectangle().y);
		assertEquals(100, displayBox.getRectangle().width);
		assertEquals(100, displayBox.getRectangle().height);
	}
	
	/**
	 * Test case 4:
	 * 
	 * Test the {@link DisplayBoxComposer#compose(CompositeFigure)} method with a {@link CompositeFigure}
	 * that contains two {@link Figure}s with a {@link DisplayBox} with the following values:
	 * 
	 * Figure 1:
	 * x = 0
	 * y = 0
	 * width = 100
	 * height = 100
	 * 
	 * Figure 2:
	 * x = 0
	 * y = 0
	 * width = 200
	 * height = 200
	 * 
	 * Expected result:
	 * 
	 * The {@link DisplayBoxComposer#compose(CompositeFigure)} method returns a {@link StandardRectangularDisplayBox}
	 * with the following values:
	 * 
	 * x = 0
	 * y = 0
	 * width = 200
	 * height = 200
	 */
	@Test
	void testCompose_TwoFigures_OneBigger() {
		CompositeFigure compositeFigure = new CompositeFigure();
		compositeFigure.addFigure(new Figure() {
			@Override
			public DisplayBox getDisplayBox() {
				return new StandardRectangularDisplayBox(0, 0, 100, 100);
			}
			@Override
			public void draw(java.awt.Graphics g) {
			}
			@Override
			public void moveBy(int dx, int dy) {
			}
			@Override
			public StandardEnumeration getFigures() throws FigureException {
				return null;
			}
			@Override
			public void addFigure(Figure figure) {
			}
			@Override
			public void removeFigure(Figure figure) {
			}
			@Override
			public Figure findFigure(int x, int y) {
				return null;
			}
			@Override
			public void release() {
			}
		});
		compositeFigure.addFigure(new Figure() {
			@Override
			public DisplayBox getDisplayBox() {
				return new StandardRectangularDisplayBox(0, 0, 200, 200);
			}
			@Override
			public void draw(java.awt.Graphics g) {
			}
			@Override
			public void moveBy(int dx, int dy) {
			}
			@Override
			public StandardEnumeration getFigures() throws FigureException {
				return null;
			}
			@Override
			public void addFigure(Figure figure) {
			}
			@Override
			public void removeFigure(Figure figure) {
			}
			@Override
			public Figure findFigure(int x, int y) {
				return null;
			}
			@Override
			public void release() {
			}
		});
		DisplayBoxComposer displayBoxComposer = new DisplayBoxComposer();
		DisplayBox displayBox = displayBoxComposer.compose(compositeFigure);
		assertTrue(displayBox instanceof StandardRectangularDisplayBox);
		assertEquals(0, displayBox.getRectangle().x);
		assertEquals(0, displayBox.getRectangle().y);
		assertEquals(200, displayBox.getRectangle().width);
		assertEquals(200, displayBox.getRectangle().height);
	}
	
	/**
	 * Test case 5:
	 * 
	 * Test the {@link DisplayBoxComposer#compose(CompositeFigure)} method with a {@link CompositeFigure}
	 * that contains two {@link Figure}s with a {@link DisplayBox} with the following values:
	 * 
	 * Figure 1:
	 * x = 0
	 * y = 0
	 * width = 100
	 * height = 100
	 * 
	 * Figure 2:
	 * x = 0
	 * y = 0
	 * width = 200
	 * height = 200
	 * 
	 * Expected result:
	 * 
	 * The {@link DisplayBoxComposer#compose(CompositeFigure)} method returns a {@link StandardRectangularDisplayBox}
	 * with the following values:
	 * 
	 * x = 0
	 * y = 0
	 * width = 200
	 * height = 200
	 */
	@Test
	void testCompose_TwoFigures_OneBigger_OneSmaller() {
		CompositeFigure compositeFigure = new CompositeFigure();
		compositeFigure.addFigure(new Figure() {
			@Override
			public DisplayBox getDisplayBox() {
				return new StandardRectangularDisplayBox(0, 0, 100, 100);
			}
			@Override
			public void draw(java.awt.Graphics g) {
			}
			@Override
			public void moveBy(int dx, int dy) {
			}
			@Override
			public StandardEnumeration getFigures() throws FigureException {
				return null;
			}
			@Override
			public void addFigure(Figure figure) {
			}
			@Override
			public void removeFigure(Figure figure) {
			}
			@Override
			public Figure findFigure(int x, int y) {
				return null;
			}
			@Override
			public void release() {
			}
		});
		compositeFigure.addFigure(new Figure() {
			@Override
			public DisplayBox getDisplayBox() {
				return new StandardRectangularDisplayBox(0, 0, 200, 200);
			}
			@Override
			public void draw(java.awt.Graphics g) {
			}
			@Override
			public void moveBy(int dx, int dy) {
			}
			@Override
			public StandardEnumeration getFigures() throws FigureException {
				return null;
			}
			@Override
			public void addFigure(Figure figure) {
			}
			@Override
			public void removeFigure(Figure figure) {
			}
			@Override
			public Figure findFigure(int x, int y) {
				return null;
			}
			@Override
			public void release() {
			}
		});
		DisplayBoxComposer displayBoxComposer = new DisplayBoxComposer();
		DisplayBox displayBox = displayBoxComposer.compose(compositeFigure);
		assertTrue(displayBox instanceof StandardRectangularDisplayBox);
		assertEquals(0, displayBox.getRectangle().x);
		assertEquals(0, displayBox.getRectangle().y);
		assertEquals(200, displayBox.getRectangle().width);
		assertEquals(200, displayBox.getRectangle().height);
	}
	
	/**
	 * Test case 6:
	 * 
	 * Test the {@link DisplayBoxComposer#compose(CompositeFigure)} method with a {@link CompositeFigure}
	 * that contains two {@link Figure}s with a {@link DisplayBox} with the following values:
	 * 
	 * Figure 1:
	 * x = 0
	 * y = 0
	 * width = 100
	 * height = 100
	 * 
	 * Figure 2:
	 * x = 0
	 * y = 0
	 * width = 200
	 * height = 200
	 * 
	 * Expected result:
	 * 
	 * The {@link DisplayBoxComposer#compose(CompositeFigure)} method returns a {@link StandardRectangularDisplayBox}
	 * with the following values:
	 * 
	 * x = 0
	 * y = 0
	 * width = 200
	 * height = 200
	 */
	@Test
	void testCompose_TwoFigures_OneBigger_OneSmaller_OneBigger() {
		CompositeFigure compositeFigure = new CompositeFigure();
		compositeFigure.addFigure(new Figure() {
			@Override
			public DisplayBox getDisplayBox() {
				return new StandardRectangularDisplayBox(0, 0, 100, 100);
			}
			@Override
			public void draw(java.awt.Graphics g) {
			}
			@Override
			public void moveBy(int dx, int dy) {
			}
			@Override
			public StandardEnumeration getFigures() throws FigureException {
				return null;
			}
	