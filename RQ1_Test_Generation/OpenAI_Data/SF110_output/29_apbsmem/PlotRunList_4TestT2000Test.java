// PlotRunList_4Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#clone()} method.
*/
class PlotRunList_4Test {

	/**
	* Test method for {@link PlotRunList#clone()}.
	*/
	@Test
	void testClone() {
		PlotRunList runList = new PlotRunList();
		PlotRun run = new PlotRun();
		run.add(new PlotDatum(1.0, 2.0));
		run.add(new PlotDatum(3.0, 4.0));
		run.add(new PlotDatum(5.0, 6.0));
		run.setLineColor(Color.RED);
		run.setPlotSymbol(new PlotSymbol(PlotSymbol.CIRCLE, Color.BLUE, 10));
		runList.add(run);
		PlotRunList clone = (PlotRunList) runList.clone();
		assertEquals(runList.size(), clone.size());
		assertEquals(runList.get(0), clone.get(0));
		assertNotSame(runList.get(0), clone.get(0));
		assertEquals(runList.get(0).getClass(), clone.get(0).getClass());
		assertEquals(runList.get(0).hashCode(), clone.get(0).hashCode());
		assertEquals(runList.get(0).toString(), clone.get(0).toString());
		assertEquals(runList.get(0).getMinX(), clone.get(0).getMinX());
		assertEquals(runList.get(0).getMaxX(), clone.get(0).getMaxX());
		assertEquals(runList.get(0).getMinY(), clone.get(0).getMinY());
		assertEquals(runList.get(0).getMaxY(), clone.get(0).getMaxY());
		assertEquals(runList.get(0).getLineColor(), clone.get(0).getLineColor());
		assertEquals(runList.get(0).getPlotSymbol(), clone.get(0).getPlotSymbol());
		assertNotSame(runList.get(0).getPlotSymbol(), clone.get(0).getPlotSymbol());
		assertEquals(runList.get(0).getPlotSymbol().getClass(), clone.get(0).getPlotSymbol().getClass());
		assertEquals(runList.get(0).getPlotSymbol().hashCode(), clone.get(0).getPlotSymbol().hashCode());
		assertEquals(runList.get(0).getPlotSymbol().toString(), clone.get(0).getPlotSymbol().toString());
		assertEquals(runList.get(0).getPlotSymbol().getType(), clone.get(0).getPlotSymbol().getType());
		assertEquals(runList.get(0).getPlotSymbol().getColor(), clone.get(0).getPlotSymbol().getColor());
		assertEquals(runList.get(0).getPlotSymbol().getSize(), clone.get(0).getPlotSymbol().getSize());
		assertEquals(runList.get(0).getPlotSymbol().getLineWidth(), clone.get(0).getPlotSymbol().getLineWidth());
		assertEquals(runList.get(0).getPlotSymbol().getLineColor(), clone.get(0).getPlotSymbol().getLineColor());
		assertEquals(runList.get(0).getPlotSymbol().getFillColor(), clone.get(0).getPlotSymbol().getFillColor());
		assertEquals(runList.get(0).getPlotSymbol().getFillPattern(), clone.get(0).getPlotSymbol().getFillPattern());
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternColor(), clone.get(0).getPlotSymbol().getFillPatternColor());
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternSize(), clone.get(0).getPlotSymbol().getFillPatternSize());
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineWidth(), clone.get(0).getPlotSymbol().getFillPatternLineWidth());
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineColor(), clone.get(0).getPlotSymbol().getFillPatternLineColor());
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDash(), clone.get(0).getPlotSymbol().getFillPatternLineDash());
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashPhase(), clone.get(0).getPlotSymbol().getFillPatternLineDashPhase());
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashOffset(), clone.get(0).getPlotSymbol().getFillPatternLineDashOffset());
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths(), clone.get(0).getPlotSymbol().getFillPatternLineDashLengths());
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths().length, clone.get(0).getPlotSymbol().getFillPatternLineDashLengths().length);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[0], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[0]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[1], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[1]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[2], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[2]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[3], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[3]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[4], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[4]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[5], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[5]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[6], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[6]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[7], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[7]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[8], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[8]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[9], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[9]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[10], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[10]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[11], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[11]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[12], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[12]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[13], clone.get(0).getPlotSymbol().get