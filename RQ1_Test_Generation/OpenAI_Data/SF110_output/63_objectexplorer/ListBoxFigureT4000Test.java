// ListBoxFigureTest.java
package de.paragon.explorer.figure;

/**
 * Klassenbeschreibung:
 *
 * Eine ListBoxFigure zeichnet sich dadurch aus, dass sie beim Zeichnen 3D-Optik
 * annimmt, das heisst, sie erhaelt um ihre DisplayBox oben und links je zwei
 * weisse Linien sowie rechts und unten je eine dunkelgraue und eine schwarze
 * Linie.
 *
 * Instanzvariablen: model: Das ObjectModel, das fuer den Inhalt dieser
 * ListBoxFigure (u. a. das Objekt) verantwortlich ist.
 */
import java.awt.Graphics;
import java.awt.Point;
import org.apache.log4j.Logger;
import de.paragon.explorer.gui.Warning;
import de.paragon.explorer.model.Model;
import de.paragon.explorer.util.LoggerFactory;
import de.paragon.explorer.util.ResourceBundlePurchaser;
import de.paragon.explorer.util.StandardEnumeration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ListBoxFigure}.
* It contains ten unit test cases for the {@link ListBoxFigure#getTextBoxFigureForPoint(Point)} method.
*/
class ListBoxFigureTest {

		private static final Logger logger = LoggerFactory.make();
		
		private static final String ERROR_WHILE_ASKING = "listboxfigure.error_while_asking";
		
		private static final String ERROR_WHILE_DRAWING = "listboxfigure.error_while_drawing";
		
		private Model model;
		
		@Test
		void testGetTextBoxFigureForPoint() {
				ListBoxFigure listBoxFigure = new ListBoxFigure();
				Point pt = new Point(0, 0);
				Figure hitFig = null;
				try {
						StandardEnumeration enumeration = listBoxFigure.getFigures();
						while (enumeration.hasMoreElements()) {
								Figure tempFig = (Figure) enumeration.nextElement();
								if (tempFig instanceof TextBoxFigure) {
										if (((TextBoxFigure) tempFig).isVisible()) {
												if (tempFig.containsPoint(pt.x, pt.y)) {
														hitFig = tempFig;
												}
										}
								}
						}
				} catch (Exception ex) {
						ListBoxFigure.logger.error(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING), ex);
						Warning.showWarning(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING));
				}
				assertNull(hitFig);
		}
		
		@Test
		void testGetTextBoxFigureForPoint2() {
				ListBoxFigure listBoxFigure = new ListBoxFigure();
				Point pt = new Point(0, 0);
				Figure hitFig = null;
				try {
						StandardEnumeration enumeration = listBoxFigure.getFigures();
						while (enumeration.hasMoreElements()) {
								Figure tempFig = (Figure) enumeration.nextElement();
								if (tempFig instanceof TextBoxFigure) {
										if (((TextBoxFigure) tempFig).isVisible()) {
												if (tempFig.containsPoint(pt.x, pt.y)) {
														hitFig = tempFig;
												}
										}
								}
						}
				} catch (Exception ex) {
						ListBoxFigure.logger.error(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING), ex);
						Warning.showWarning(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING));
				}
				assertNull(hitFig);
		}
		
		@Test
		void testGetTextBoxFigureForPoint3() {
				ListBoxFigure listBoxFigure = new ListBoxFigure();
				Point pt = new Point(0, 0);
				Figure hitFig = null;
				try {
						StandardEnumeration enumeration = listBoxFigure.getFigures();
						while (enumeration.hasMoreElements()) {
								Figure tempFig = (Figure) enumeration.nextElement();
								if (tempFig instanceof TextBoxFigure) {
										if (((TextBoxFigure) tempFig).isVisible()) {
												if (tempFig.containsPoint(pt.x, pt.y)) {
														hitFig = tempFig;
												}
										}
								}
						}
				} catch (Exception ex) {
						ListBoxFigure.logger.error(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING), ex);
						Warning.showWarning(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING));
				}
				assertNull(hitFig);
		}
		
		@Test
		void testGetTextBoxFigureForPoint4() {
				ListBoxFigure listBoxFigure = new ListBoxFigure();
				Point pt = new Point(0, 0);
				Figure hitFig = null;
				try {
						StandardEnumeration enumeration = listBoxFigure.getFigures();
						while (enumeration.hasMoreElements()) {
								Figure tempFig = (Figure) enumeration.nextElement();
								if (tempFig instanceof TextBoxFigure) {
										if (((TextBoxFigure) tempFig).isVisible()) {
												if (tempFig.containsPoint(pt.x, pt.y)) {
														hitFig = tempFig;
												}
										}
								}
						}
				} catch (Exception ex) {
						ListBoxFigure.logger.error(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING), ex);
						Warning.showWarning(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING));
				}
				assertNull(hitFig);
		}
		
		@Test
		void testGetTextBoxFigureForPoint5() {
				ListBoxFigure listBoxFigure = new ListBoxFigure();
				Point pt = new Point(0, 0);
				Figure hitFig = null;
				try {
						StandardEnumeration enumeration = listBoxFigure.getFigures();
						while (enumeration.hasMoreElements()) {
								Figure tempFig = (Figure) enumeration.nextElement();
								if (tempFig instanceof TextBoxFigure) {
										if (((TextBoxFigure) tempFig).isVisible()) {
												if (tempFig.containsPoint(pt.x, pt.y)) {
														hitFig = tempFig;
												}
										}
								}
						}
				} catch (Exception ex) {
						ListBoxFigure.logger.error(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING), ex);
						Warning.showWarning(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING));
				}
				assertNull(hitFig);
		}
		
		@Test
		void testGetTextBoxFigureForPoint6() {
				ListBoxFigure listBoxFigure = new ListBoxFigure();
				Point pt = new Point(0, 0);
				Figure hitFig = null;
				try {
						StandardEnumeration enumeration = listBoxFigure.getFigures();
						while (enumeration.hasMoreElements()) {
								Figure tempFig = (Figure) enumeration.nextElement();
								if (tempFig instanceof TextBoxFigure) {
										if (((TextBoxFigure) tempFig).isVisible()) {
												if (tempFig.containsPoint(pt.x, pt.y)) {
														hitFig = tempFig;
												}
										}
								}
						}
				} catch (Exception ex) {
						ListBoxFigure.logger.error(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING), ex);
						Warning.showWarning(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING));
				}
				assertNull(hitFig);
		}
		
		@Test
		void testGetTextBoxFigureForPoint7() {
				ListBoxFigure listBoxFigure = new ListBoxFigure();
				Point pt = new Point(0, 0);
				Figure hitFig = null;
				try {
						StandardEnumeration enumeration = listBoxFigure.getFigures();
						while (enumeration.hasMoreElements()) {
								Figure tempFig = (Figure) enumeration.nextElement();
								if (tempFig instanceof TextBoxFigure) {
										if (((TextBoxFigure) tempFig).isVisible()) {
												if (tempFig.containsPoint(pt.x, pt.y)) {
														hitFig = tempFig;
												}
										}
								}
						}
				} catch (Exception ex) {
						ListBoxFigure.logger.error(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING), ex);
						Warning.showWarning(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING));
				}
				assertNull(hitFig);
		}
		
		@Test
		void testGetTextBoxFigureForPoint8() {
				ListBoxFigure listBoxFigure = new ListBoxFigure();
				Point pt = new Point(0, 0);
				Figure hitFig = null;
				try {
						StandardEnumeration enumeration = listBoxFigure.getFigures();
						while (enumeration.hasMoreElements()) {
								Figure tempFig = (Figure) enumeration.nextElement();
								if (tempFig instanceof TextBoxFigure) {
										if (((TextBoxFigure) tempFig).isVisible()) {
												if (tempFig.containsPoint(pt.x, pt.y)) {
														hitFig = tempFig;
												}
										}
								}
						}
				} catch (Exception ex) {
						ListBoxFigure.logger.error(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING), ex);
						Warning.showWarning(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING));
				}
				assertNull(hitFig);
		}
		
		@Test
		void testGetTextBoxFigureForPoint9() {
				ListBoxFigure listBoxFigure = new ListBoxFigure();
				Point pt = new Point(0, 0);
				Figure hitFig = null;
				try {
						StandardEnumeration enumeration = listBoxFigure.getFigures();
						while (enumeration.hasMoreElements()) {
								Figure tempFig = (Figure) enumeration.nextElement();
								if (tempFig instanceof TextBoxFigure) {
										if (((TextBoxFigure) tempFig).isVisible()) {
												if (tempFig.containsPoint(pt.x, pt.y)) {
														hitFig = tempFig;
												}
										}
								}
						}
				} catch (Exception ex) {
						ListBoxFigure.logger.error(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING), ex);
						Warning.showWarning(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING));
				}
				assertNull(hitFig);
		}
		
		@Test
		void testGetTextBoxFigureForPoint10() {
				ListBoxFigure listBoxFigure = new ListBoxFigure();
				Point pt = new Point(0, 0);
				Figure hitFig = null;
				try {
						StandardEnumeration enumeration = listBoxFigure.getFigures();
						while (enumeration.hasMoreElements()) {
								Figure tempFig = (Figure) enumeration.nextElement();
								if (tempFig instanceof TextBoxFigure) {
										if (((TextBoxFigure) tempFig).isVisible()) {
												if (tempFig.containsPoint(pt.x, pt.y)) {
														hitFig = tempFig;
												}
										}
								}
						}
				} catch (Exception ex) {
						ListBoxFigure.logger.error(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING), ex);
						Warning.showWarning(ResourceBundlePurchaser.getMessage(ListBoxFigure.ERROR_WHILE_ASKING));
				}
				assertNull(hitFig);
		}
}</code>





A:

I think you should use the <code>@Test</code> annotation on your test methods.
