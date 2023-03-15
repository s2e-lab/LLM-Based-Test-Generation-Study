// PlotDatum_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#clone()} method.
*/
class PlotDatum_2Test {

	/**
	* Test case for {@link PlotDatum#clone()}.
	*/
	@Test
	void testClone() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, true);
		PlotDatum clone = (PlotDatum) datum.clone();
		assertEquals(datum.getX(), clone.getX());
		assertEquals(datum.getY(), clone.getY());
		assertEquals(datum.connected(), clone.connected());
		assertEquals(datum.getLineColor(), clone.getLineColor());
		assertEquals(datum.getPlotSymbol(), clone.getPlotSymbol());
		assertEquals(datum.getYError(), clone.getYError());
		assertEquals(datum.hasErrorBar(), clone.hasErrorBar());
	}
	
	/**
	* Test case for {@link PlotDatum#clone()}.
	*/
	@Test
	void testClone2() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLUE, 10));
		PlotDatum clone = (PlotDatum) datum.clone();
		assertEquals(datum.getX(), clone.getX());
		assertEquals(datum.getY(), clone.getY());
		assertEquals(datum.connected(), clone.connected());
		assertEquals(datum.getLineColor(), clone.getLineColor());
		assertEquals(datum.getPlotSymbol(), clone.getPlotSymbol());
		assertEquals(datum.getYError(), clone.getYError());
		assertEquals(datum.hasErrorBar(), clone.hasErrorBar());
	}
	
	/**
	* Test case for {@link PlotDatum#clone()}.
	*/
	@Test
	void testClone3() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLUE, 10));
		datum.setYError(3.0);
		PlotDatum clone = (PlotDatum) datum.clone();
		assertEquals(datum.getX(), clone.getX());
		assertEquals(datum.getY(), clone.getY());
		assertEquals(datum.connected(), clone.connected());
		assertEquals(datum.getLineColor(), clone.getLineColor());
		assertEquals(datum.getPlotSymbol(), clone.getPlotSymbol());
		assertEquals(datum.getYError(), clone.getYError());
		assertEquals(datum.hasErrorBar(), clone.hasErrorBar());
	}
	
	/**
	* Test case for {@link PlotDatum#clone()}.
	*/
	@Test
	void testClone4() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLUE, 10));
		datum.setYError(3.0);
		datum.setConnected(false);
		PlotDatum clone = (PlotDatum) datum.clone();
		assertEquals(datum.getX(), clone.getX());
		assertEquals(datum.getY(), clone.getY());
		assertEquals(datum.connected(), clone.connected());
		assertEquals(datum.getLineColor(), clone.getLineColor());
		assertEquals(datum.getPlotSymbol(), clone.getPlotSymbol());
		assertEquals(datum.getYError(), clone.getYError());
		assertEquals(datum.hasErrorBar(), clone.hasErrorBar());
	}
	
	/**
	* Test case for {@link PlotDatum#clone()}.
	*/
	@Test
	void testClone5() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLUE, 10));
		datum.setYError(3.0);
		datum.setConnected(false);
		datum.setLineColor(Color.RED);
		PlotDatum clone = (PlotDatum) datum.clone();
		assertEquals(datum.getX(), clone.getX());
		assertEquals(datum.getY(), clone.getY());
		assertEquals(datum.connected(), clone.connected());
		assertEquals(datum.getLineColor(), clone.getLineColor());
		assertEquals(datum.getPlotSymbol(), clone.getPlotSymbol());
		assertEquals(datum.getYError(), clone.getYError());
		assertEquals(datum.hasErrorBar(), clone.hasErrorBar());
	}
	
	/**
	* Test case for {@link PlotDatum#clone()}.
	*/
	@Test
	void testClone6() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLUE, 10));
		datum.setYError(3.0);
		datum.setConnected(false);
		datum.setLineColor(Color.RED);
		datum.setX(4.0);
		PlotDatum clone = (PlotDatum) datum.clone();
		assertEquals(datum.getX(), clone.getX());
		assertEquals(datum.getY(), clone.getY());
		assertEquals(datum.connected(), clone.connected());
		assertEquals(datum.getLineColor(), clone.getLineColor());
		assertEquals(datum.getPlotSymbol(), clone.getPlotSymbol());
		assertEquals(datum.getYError(), clone.getYError());
		assertEquals(datum.hasErrorBar(), clone.hasErrorBar());
	}
	
	/**
	* Test case for {@link PlotDatum#clone()}.
	*/
	@Test
	void testClone7() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLUE, 10));
		datum.setYError(3.0);
		datum.setConnected(false);
		datum.setLineColor(Color.RED);
		datum.setX(4.0);
		datum.setY(5.0);
		PlotDatum clone = (PlotDatum) datum.clone();
		assertEquals(datum.getX(), clone.getX());
		assertEquals(datum.getY(), clone.getY());
		assertEquals(datum.connected(), clone.connected());
		assertEquals(datum.getLineColor(), clone.getLineColor());
		assertEquals(datum.getPlotSymbol(), clone.getPlotSymbol());
		assertEquals(datum.getYError(), clone.getYError());
		assertEquals(datum.hasErrorBar(), clone.hasErrorBar());
	}
	
	/**
	* Test case for {@link PlotDatum#clone()}.
	*/
	@Test
	void testClone8() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLUE, 10));
		datum.setYError(3.0);
		datum.setConnected(false);
		datum.setLineColor(Color.RED);
		datum.setX(4.0);
		datum.setY(5.0);
		datum.setPlotSymbol(new PlotSymbol(PlotSymbol.SQUARE, Color.GREEN, 20));
		PlotDatum clone = (PlotDatum) datum.clone();
		assertEquals(datum.getX(), clone.getX());
		assertEquals(datum.getY(), clone.getY());
		assertEquals(datum.connected(), clone.connected());
		assertEquals(datum.getLineColor(), clone.getLineColor());
		assertEquals(datum.getPlotSymbol(), clone.getPlotSymbol());
		assertEquals(datum.getYError(), clone.getYError());
		assertEquals(datum.hasErrorBar(), clone.hasErrorBar());
	}
	
	/**
	* Test case for {@link PlotDatum#clone()}.
	*/
	@Test
	void testClone9() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLUE, 10));
		datum.setYError(3.0);
		datum.setConnected(false);
		datum.setLineColor(Color.RED);
		datum.setX(4.0);
		datum.setY(5.0);
		datum.setPlotSymbol(new PlotSymbol(PlotSymbol.SQUARE, Color.GREEN, 20));
		datum.setYError(6.0);
		PlotDatum clone = (PlotDatum) datum.clone();
		assertEquals(datum.getX(), clone.getX());
		assertEquals(datum.getY(), clone.getY());
		assertEquals(datum.connected(), clone.connected());
		assertEquals(datum.getLineColor(), clone.getLineColor());
		assertEquals(datum.getPlotSymbol(), clone.getPlotSymbol());
		assertEquals(datum.getYError(), clone.getYError());
		assertEquals(datum.hasErrorBar(), clone.hasErrorBar());
	}
	
	/**
	* Test case for {@link PlotDatum#clone()}.
	*/
	@Test
	void testClone10() {
		PlotDatum datum = new PlotDatum(1.0, 2.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLUE, 10));
		datum.setYError(3.0);
		datum.setConnected(false);
		datum.setLineColor(Color.RED);
		datum.setX(4.0);
		datum.setY(5.0);
		datum.setPlotSymbol(new PlotSymbol(PlotSymbol.SQUARE, Color.GREEN, 20));
		datum.setYError(6.0);
		datum.setConnected(true);
		PlotDatum clone = (PlotDatum) datum.clone();
		assertEquals(datum.getX(), clone.getX());
		assertEquals(datum.getY(), clone.getY());
		assertEquals(datum.connected(), clone.connected());
		assertEquals(datum.getLineColor(), clone.getLineColor());
		assertEquals(datum.getPlotSymbol(), clone.getPlotSymbol());
		assertEquals(datum.getYError(), clone.getYError());
		assertEquals(datum.hasErrorBar(), clone.hasErrorBar());
	}
	
}