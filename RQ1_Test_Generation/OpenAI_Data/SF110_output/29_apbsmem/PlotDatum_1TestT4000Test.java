// PlotDatum_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_1Test {

	/**
	* Test case for {@link PlotDatum#connected()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testConnected() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true);
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testConnected2() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false);
		assertFalse(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testConnected3() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testConnected4() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		assertFalse(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testConnected5() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setConnected(false);
		assertFalse(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testConnected6() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setConnected(true);
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testConnected7() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setConnected(true);
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testConnected8() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setConnected(false);
		assertFalse(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testConnected9() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setConnected(false);
		plotDatum.setConnected(true);
		assertTrue(plotDatum.connected());
	}
	
	/**
	* Test case for {@link PlotDatum#connected()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testConnected10() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setConnected(true);
		plotDatum.setConnected(false);
		assertFalse(plotDatum.connected());
	}
	
}

// PlotDatum_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#getLineColor()} method.
*/
class PlotDatum_2Test {
		
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetLineColor() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true);
		assertEquals(Color.BLACK, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetLineColor2() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false);
		assertEquals(Color.BLACK, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetLineColor3() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		assertEquals(Color.BLACK, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetLineColor4() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		assertEquals(Color.BLACK, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetLineColor5() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setLineColor(Color.RED);
		assertEquals(Color.RED, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetLineColor6() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setLineColor(Color.RED);
		assertEquals(Color.RED, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetLineColor7() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setLineColor(Color.RED);
		plotDatum.setLineColor(Color.BLACK);
		assertEquals(Color.BLACK, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetLineColor8() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setLineColor(Color.RED);
		plotDatum.setLineColor(Color.BLACK);
		assertEquals(Color.BLACK, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetLineColor9() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setLineColor(Color.RED);
		plotDatum.setLineColor(Color.BLACK);
		plotDatum.setLineColor(Color.RED);
		assertEquals(Color.RED, plotDatum.getLineColor());
	}
	
	/**
	* Test case for {@link PlotDatum#getLineColor()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetLineColor10() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setLineColor(Color.RED);
		plotDatum.setLineColor(Color.BLACK);
		plotDatum.setLineColor(Color.RED);
		assertEquals(Color.RED, plotDatum.getLineColor());
	}
	
}

// PlotDatum_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#getPlotSymbol()} method.
*/
class PlotDatum_3Test {
		
	/**
	* Test case for {@link PlotDatum#getPlotSymbol()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetPlotSymbol() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true);
		assertNull(plotDatum.getPlotSymbol());
	}
	
	/**
	* Test case for {@link PlotDatum#getPlotSymbol()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetPlotSymbol2() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false);
		assertNull(plotDatum.getPlotSymbol());
	}
	
	/**
	* Test case for {@link PlotDatum#getPlotSymbol()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetPlotSymbol3() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		assertEquals(new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0), plotDatum.getPlotSymbol());
	}
	
	/**
	* Test case for {@link PlotDatum#getPlotSymbol()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetPlotSymbol4() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		assertEquals(new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0), plotDatum.getPlotSymbol());
	}
	
	/**
	* Test case for {@link PlotDatum#getPlotSymbol()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetPlotSymbol5() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setPlotSymbol(new PlotSymbol(PlotSymbol.SQUARE, Color.RED, 1.0));
		assertEquals(new PlotSymbol(PlotSymbol.SQUARE, Color.RED, 1.0), plotDatum.getPlotSymbol());
	}
	
	/**
	* Test case for {@link PlotDatum#getPlotSymbol()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetPlotSymbol6() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setPlotSymbol(new PlotSymbol(PlotSymbol.SQUARE, Color.RED, 1.0));
		assertEquals(new PlotSymbol(PlotSymbol.SQUARE, Color.RED, 1.0), plotDatum.getPlotSymbol());
	}
	
	/**
	* Test case for {@link PlotDatum#getPlotSymbol()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetPlotSymbol7() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, true, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setPlotSymbol(new PlotSymbol(PlotSymbol.SQUARE, Color.RED, 1.0));
		plotDatum.setPlotSymbol(new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		assertEquals(new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0), plotDatum.getPlotSymbol());
	}
	
	/**
	* Test case for {@link PlotDatum#getPlotSymbol()} method.
	* Test if the method returns the correct value.
	*/
	@Test
	void testGetPlotSymbol8() {
		PlotDatum plotDatum = new PlotDatum(1.0, 1.0, false, new PlotSymbol(PlotSymbol.CIRCLE, Color.BLACK, 1.0));
		plotDatum.setPlotSymbol(new PlotSymbol(PlotSymbol.SQUARE, Color.RED, 1.0));
		plotDatum.setPlotSymbol(new PlotSymbol(PlotSy