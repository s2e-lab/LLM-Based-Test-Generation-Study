// SimplePlotXYTest.java
package jahuwaldt.plot;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.NumberFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimplePlotXY}.
* It contains ten unit test cases for the {@link SimplePlotXY#clone()} method.
*/
class SimplePlotXYTest {

	/**
	* Test method for {@link SimplePlotXY#clone()}.
	*/
	@Test
	public void testClone() {
		SimplePlotXY plot = new SimplePlotXY();
		SimplePlotXY clone = (SimplePlotXY) plot.clone();
		assertNotSame(plot, clone);
		assertEquals(plot.getTitle(), clone.getTitle());
		assertEquals(plot.getRuns(), clone.getRuns());
		assertEquals(plot.getHorizontalAxis(), clone.getHorizontalAxis());
		assertEquals(plot.getVerticalAxis(), clone.getVerticalAxis());
	}
	
	/**
	* Test method for {@link SimplePlotXY#clone()}.
	*/
	@Test
	public void testClone2() {
		SimplePlotXY plot = new SimplePlotXY(new PlotRunList(), "title", "xLabel", "yLabel", NumberFormat.getInstance(), NumberFormat.getInstance());
		SimplePlotXY clone = (SimplePlotXY) plot.clone();
		assertNotSame(plot, clone);
		assertEquals(plot.getTitle(), clone.getTitle());
		assertEquals(plot.getRuns(), clone.getRuns());
		assertEquals(plot.getHorizontalAxis(), clone.getHorizontalAxis());
		assertEquals(plot.getVerticalAxis(), clone.getVerticalAxis());
	}
	
	/**
	* Test method for {@link SimplePlotXY#clone()}.
	*/
	@Test
	public void testClone3() {
		SimplePlotXY plot = new SimplePlotXY(new double[] {1, 2, 3}, new double[] {4, 5, 6}, "title", "xLabel", "yLabel", NumberFormat.getInstance(), NumberFormat.getInstance());
		SimplePlotXY clone = (SimplePlotXY) plot.clone();
		assertNotSame(plot, clone);
		assertEquals(plot.getTitle(), clone.getTitle());
		assertEquals(plot.getRuns(), clone.getRuns());
		assertEquals(plot.getHorizontalAxis(), clone.getHorizontalAxis());
		assertEquals(plot.getVerticalAxis(), clone.getVerticalAxis());
	}
	
	/**
	* Test method for {@link SimplePlotXY#clone()}.
	*/
	@Test
	public void testClone4() {
		SimplePlotXY plot = new SimplePlotXY(new double[] {1, 2, 3}, new double[] {4, 5, 6}, "title", "xLabel", "yLabel", NumberFormat.getInstance(), NumberFormat.getInstance(), new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, Color.BLACK, 1));
		SimplePlotXY clone = (SimplePlotXY) plot.clone();
		assertNotSame(plot, clone);
		assertEquals(plot.getTitle(), clone.getTitle());
		assertEquals(plot.getRuns(), clone.getRuns());
		assertEquals(plot.getHorizontalAxis(), clone.getHorizontalAxis());
		assertEquals(plot.getVerticalAxis(), clone.getVerticalAxis());
	}
	
	/**
	* Test method for {@link SimplePlotXY#clone()}.
	*/
	@Test
	public void testClone5() {
		SimplePlotXY plot = new SimplePlotXY(new double[] {1, 2, 3}, new double[] {4, 5, 6}, "title", "xLabel", "yLabel", NumberFormat.getInstance(), NumberFormat.getInstance(), new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, Color.BLACK, 1));
		SimplePlotXY clone = (SimplePlotXY) plot.clone();
		assertNotSame(plot, clone);
		assertEquals(plot.getTitle(), clone.getTitle());
		assertEquals(plot.getRuns(), clone.getRuns());
		assertEquals(plot.getHorizontalAxis(), clone.getHorizontalAxis());
		assertEquals(plot.getVerticalAxis(), clone.getVerticalAxis());
	}
	
	/**
	* Test method for {@link SimplePlotXY#clone()}.
	*/
	@Test
	public void testClone6() {
		SimplePlotXY plot = new SimplePlotXY(new double[] {1, 2, 3}, new double[] {4, 5, 6}, "title", "xLabel", "yLabel", NumberFormat.getInstance(), NumberFormat.getInstance(), new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, Color.BLACK, 1));
		SimplePlotXY clone = (SimplePlotXY) plot.clone();
		assertNotSame(plot, clone);
		assertEquals(plot.getTitle(), clone.getTitle());
		assertEquals(plot.getRuns(), clone.getRuns());
		assertEquals(plot.getHorizontalAxis(), clone.getHorizontalAxis());
		assertEquals(plot.getVerticalAxis(), clone.getVerticalAxis());
	}
	
	/**
	* Test method for {@link SimplePlotXY#clone()}.
	*/
	@Test
	public void testClone7() {
		SimplePlotXY plot = new SimplePlotXY(new double[] {1, 2, 3}, new double[] {4, 5, 6}, "title", "xLabel", "yLabel", NumberFormat.getInstance(), NumberFormat.getInstance(), new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, Color.BLACK, 1));
		SimplePlotXY clone = (SimplePlotXY) plot.clone();
		assertNotSame(plot, clone);
		assertEquals(plot.getTitle(), clone.getTitle());
		assertEquals(plot.getRuns(), clone.getRuns());
		assertEquals(plot.getHorizontalAxis(), clone.getHorizontalAxis());
		assertEquals(plot.getVerticalAxis(), clone.getVerticalAxis());
	}
	
	/**
	* Test method for {@link SimplePlotXY#clone()}.
	*/
	@Test
	public void testClone8() {
		SimplePlotXY plot = new SimplePlotXY(new double[] {1, 2, 3}, new double[] {4, 5, 6}, "title", "xLabel", "yLabel", NumberFormat.getInstance(), NumberFormat.getInstance(), new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, Color.BLACK, 1));
		SimplePlotXY clone = (SimplePlotXY) plot.clone();
		assertNotSame(plot, clone);
		assertEquals(plot.getTitle(), clone.getTitle());
		assertEquals(plot.getRuns(), clone.getRuns());
		assertEquals(plot.getHorizontalAxis(), clone.getHorizontalAxis());
		assertEquals(plot.getVerticalAxis(), clone.getVerticalAxis());
	}
	
	/**
	* Test method for {@link SimplePlotXY#clone()}.
	*/
	@Test
	public void testClone9() {
		SimplePlotXY plot = new SimplePlotXY(new double[] {1, 2, 3}, new double[] {4, 5, 6}, "title", "xLabel", "yLabel", NumberFormat.getInstance(), NumberFormat.getInstance(), new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, Color.BLACK, 1));
		SimplePlotXY clone = (SimplePlotXY) plot.clone();
		assertNotSame(plot, clone);
		assertEquals(plot.getTitle(), clone.getTitle());
		assertEquals(plot.getRuns(), clone.getRuns());
		assertEquals(plot.getHorizontalAxis(), clone.getHorizontalAxis());
		assertEquals(plot.getVerticalAxis(), clone.getVerticalAxis());
	}
	
	/**
	* Test method for {@link SimplePlotXY#clone()}.
	*/
	@Test
	public void testClone10() {
		SimplePlotXY plot = new Simple