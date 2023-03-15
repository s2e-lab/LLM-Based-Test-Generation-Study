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
		
		run = new PlotRun(new double[] { 1.0, 2.0 }, new double[] { 3.0, 4.0 }, true, PlotSymbol.CIRCLE);
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		
		run = new PlotRun(Arrays.asList(new PlotDatum[] { new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE) }));
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		
		run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		
		run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		
		run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		
		run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		
		run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		
		run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE));
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		
		run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE));
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		
		run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(15.0, 16.0, true, PlotSymbol.CIRCLE));
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		
		run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(15.0, 16.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(17.0, 18.0, true, PlotSymbol.CIRCLE));
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
		
		run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(11.0, 12.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(13.0, 14.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(15.0, 16.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(17.0, 18.0, true, PlotSymbol.CIRCLE));
		run.add(new PlotDatum(19.0, 20.0, true, PlotSymbol.CIRCLE));
		clone = (PlotRun) run.clone();
		assertEquals(run.size(), clone.size());
	}
}