// PlotRun_4Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#clone()} method.
*/
class PlotRun_4Test {

	/**
	* Test method for {@link PlotRun#clone()}.
	*/
	@Test
	void testClone() {
		PlotRun run = new PlotRun();
		PlotRun clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		
		run = new PlotRun(new PlotDatum[] { new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE) });
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		assertEquals(run.get(0), clone.get(0));
		
		run = new PlotRun(new PlotDatum[] { new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE) });
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		assertEquals(run.get(0), clone.get(0));
		assertEquals(run.get(1), clone.get(1));
		
		run = new PlotRun(new PlotDatum[] { new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE) });
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		assertEquals(run.get(0), clone.get(0));
		assertEquals(run.get(1), clone.get(1));
		assertEquals(run.get(2), clone.get(2));
		
		run = new PlotRun(new PlotDatum[] { new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE) });
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		assertEquals(run.get(0), clone.get(0));
		assertEquals(run.get(1), clone.get(1));
		assertEquals(run.get(2), clone.get(2));
		assertEquals(run.get(3), clone.get(3));
		
		run = new PlotRun(new PlotDatum[] { new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE) });
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		assertEquals(run.get(0), clone.get(0));
		assertEquals(run.get(1), clone.get(1));
		assertEquals(run.get(2), clone.get(2));
		assertEquals(run.get(3), clone.get(3));
		assertEquals(run.get(4), clone.get(4));
		
		run = new PlotRun(new PlotDatum[] { new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE), new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE) });
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		assertEquals(run.get(0), clone.get(0));
		assertEquals(run.get(1), clone.get(1));
		assertEquals(run.get(2), clone.get(2));
		assertEquals(run.get(3), clone.get(3));
		assertEquals(run.get(4), clone.get(4));
		assertEquals(run.get(5), clone.get(5));
		
		run = new PlotRun(new PlotDatum[] { new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE), new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE), new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE) });
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		assertEquals(run.get(0), clone.get(0));
		assertEquals(run.get(1), clone.get(1));
		assertEquals(run.get(2), clone.get(2));
		assertEquals(run.get(3), clone.get(3));
		assertEquals(run.get(4), clone.get(4));
		assertEquals(run.get(5), clone.get(5));
		assertEquals(run.get(6), clone.get(6));
		
		run = new PlotRun(new PlotDatum[] { new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE), new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE), new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE), new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE), new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE), new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE), new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE), new PlotDatum(15.0, 16.0, true, PlotSymbol.CIRCLE) });
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		assertEquals(run.get(0), clone.get(0));
		assertEquals(run.get(1), clone.get(1));
		assertEquals(run.get(2), clone.get(2));
		assertEquals(run.get(3), clone.get(3));
		assertEquals(run.get(4), clone.get(4));
		assertEquals(run.get(5), clone.get(5));
		assertEquals(run.get(6), clone.get(6));
		assertEquals(run.get(7), clone.get(7));
		
		run = new PlotRun(new PlotDatum[] { new PlotDatum(1.0, 2.0, true, PlotSymbol.C