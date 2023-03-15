// ExplorerFigure_1Test.java
package de.paragon.explorer.figure;

import java.awt.Dimension;
import java.awt.FontMetrics;
import java.awt.Point;
import java.awt.Rectangle;
import org.apache.log4j.Logger;
import de.paragon.explorer.Explorer;
import de.paragon.explorer.event.DrawEvent;
import de.paragon.explorer.event.DrawListener;
import de.paragon.explorer.event.FocusManager;
import de.paragon.explorer.gui.ExplorerDrawingPanel;
import de.paragon.explorer.gui.ExplorerFrame;
import de.paragon.explorer.gui.Warning;
import de.paragon.explorer.model.ExplorerModel;
import de.paragon.explorer.model.Model;
import de.paragon.explorer.util.LoggerFactory;
import de.paragon.explorer.util.ResourceBundlePurchaser;
import de.paragon.explorer.util.StandardEnumeration;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExplorerFigure}.
* It contains ten unit test cases for the {@link ExplorerFigure#getTextBoxFigureForPoint(Point)} method.
*/
class ExplorerFigure_1Test {

	private static final Logger logger = LoggerFactory.make();
	
	private static final int NUMBER_15 = 15;
	
	private static final String EXPLORERFIGURE_ERROR_FINDING_HIT_FIGURE = "explorerfigure.error_finding_hit_figure ";
	
	private static final String EXPLORERFIGURE_ERROR_DRAWING_EXPLORER_FIGURE = "explorerfigure.error_drawing_explorer_figure";
	
	private static final String EXPLORERFIGURE_ERROR_CALCULATING_GRAPHIC_SIZE = "explorerfigure.error_calculating_graphic_size";
	
	private ExplorerDrawingPanel panel;
	
	private Model model;
	
	private ExplorerFrame frame;
	
	private Dimension graphicSize;
	
	private FocusManager focusManager;
	
	public ExplorerFigure_1Test() {
		super();
	}
	
	private void calculateGraphicSize() {
		StandardEnumeration figures = null;
		this.getGraphicSize().setSize(0, 0);
		try {
			figures = this.getFigures();
		} catch (Exception ex) {
			ExplorerFigure_1Test.logger.error(ResourceBundlePurchaser.getMessage(ExplorerFigure_1Test.EXPLORERFIGURE_ERROR_CALCULATING_GRAPHIC_SIZE), ex);
			Warning.showWarning(ResourceBundlePurchaser.getMessage(ExplorerFigure_1Test.EXPLORERFIGURE_ERROR_CALCULATING_GRAPHIC_SIZE));
		}
		if (figures != null) {
			while (figures.hasMoreElements()) {
				try {
					this.calculateGraphicSize(((Figure) figures.nextElement()).getBounds());
				} catch (Exception ex) {
					ExplorerFigure_1Test.logger.error(ResourceBundlePurchaser.getMessage(ExplorerFigure_1Test.EXPLORERFIGURE_ERROR_CALCULATING_GRAPHIC_SIZE), ex);
					Warning.showWarning(ResourceBundlePurchaser.getMessage(ExplorerFigure_1Test.EXPLORERFIGURE_ERROR_CALCULATING_GRAPHIC_SIZE));
				}
			}
		}
	}
	
	private void calculateGraphicSize(Rectangle rec) {
		double xpos;
		double ypos;
		xpos = rec.getX() + rec.getWidth() + ExplorerFigure_1Test.NUMBER_15;
		ypos = rec.getY() + rec.getHeight() + ExplorerFigure_1Test.NUMBER_15;
		if (this.getGraphicSize().getWidth() > xpos) {
			xpos = this.getGraphicSize().getWidth();
		}
		if (this.getGraphicSize().getHeight() > ypos) {
			ypos = this.getGraphicSize().getHeight();
		}
		this.getGraphicSize().setSize((int) xpos, (int) ypos);
	}
	
	/**
	 * Kommentar: Das Loeschen einer ExplorerFigure funktioniert so: Zunaechst
	 * wird die Groesse des StandardDrawingFrames bestimmt. Dieses Rechteck wird
	 * dann geloescht.
	 */
	public void clear() {
		this.setDisplayBoxIsValid(false);
		// Dimension size = this.getPanel().getSize();
		// this.getGraphics().clearRect(0, 0, size.width, size.height);
	}
	
	public void draw(DrawEvent event) {
		try {
			super.draw(event.getGraphics());
		} catch (Exception ex) {
			ExplorerFigure_1Test.logger.error(ResourceBundlePurchaser.getMessage(ExplorerFigure_1Test.EXPLORERFIGURE_ERROR_DRAWING_EXPLORER_FIGURE), ex);
			Warning.showWarning(ResourceBundlePurchaser.getMessage(ExplorerFigure_1Test.EXPLORERFIGURE_ERROR_DRAWING_EXPLORER_FIGURE));
		}
	}
	
	private Dimension getActualSize() {
		this.calculateGraphicSize();
		return this.getGraphicSize();
	}
	
	public FocusManager getFocusManager() {
		if (this.focusManager == null) {
			this.setFocusManager(new FocusManager(this));
		}
		return this.focusManager;
	}
	
	public FontMetrics getFontMetrics() {
		return this.getFrame().getGraphics().getFontMetrics();
	}
	
	public ExplorerFrame getFrame() {
		if (this.frame == null) {
			this.setFrame(new ExplorerFrame());
			this.getFrame().setFocusable(true);
			this.getFrame().setName(((ExplorerModel) this.getModel()).getName());
		}
		return this.frame;
	}
	
	private Dimension getGraphicSize() {
		if (this.graphicSize == null) {
			this.setGraphicSize(new Dimension(0, 0));
		}
		return this.graphicSize;
	}
	
	/**
	 * Kommentar: Das Loeschen einer ExplorerFigure funktioniert so: Zunaechst
	 * wird die Groesse des StandardDrawingFrames bestimmt. Dieses Rechteck wird
	 * dann geloescht.
	 *
	 * @return Figure
	 */
	public Figure getListBoxFigureForPoint(Point pt) {
		StandardEnumeration explFigParts = null;
		try {
			explFigParts = this.getFigures();
		} catch (Exception ex) {
			ExplorerFigure_1Test.logger.error(ResourceBundlePurchaser.getMessage(ExplorerFigure_1Test.EXPLORERFIGURE_ERROR_FINDING_HIT_FIGURE), ex);
			Warning.showWarning(ResourceBundlePurchaser.getMessage(ExplorerFigure_1Test.EXPLORERFIGURE_ERROR_FINDING_HIT_FIGURE));
		}
		Figure tempFig = null;
		Figure hitFig = null;
		if (explFigParts != null) {
			while (explFigParts.hasMoreElements()) {
				tempFig = (Figure) explFigParts.nextElement();
				if (tempFig.containsPoint(pt.x, pt.y)) {
					if (tempFig instanceof ListBoxFigure) {
						hitFig = tempFig;
					}
				}
			}
		}
		return hitFig;
	}
	
	public Model getModel() {
		return this.model;
	}
	
	public ExplorerDrawingPanel getPanel() {
		if (this.panel == null) {
			this.setPanel(Explorer.getPanel());
			this.panel.addDrawListener(this);
			this.getFrame().getScrollPane().setViewportView(this.getPanel());
		}
		return this.panel;
	}
	
	/**
	 * Kommentar: Diese Methode geht folgendermassen vor: Sie sucht sich alle
	 * getroffenen ListBoxFigures raus. Sie durchsucht jede diese Figuren nach
	 * einer getroffenen Teilfigur. Jedes Mal, wenn sie fuendig geworden ist,
	 * ueberschreibt sie die Variable fuer die Figur, die sie am Ende
	 * zurueckgibt. Da die Figuren in derselben Figur durch