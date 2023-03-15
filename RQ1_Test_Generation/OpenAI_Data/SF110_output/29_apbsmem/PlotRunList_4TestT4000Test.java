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
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[13], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[13]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[14], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[14]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[15], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[15]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[16], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[16]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[17], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[17]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[18], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[18]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[19], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[19]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[20], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[20]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[21], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[21]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[22], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[22]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[23], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[23]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[24], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[24]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[25], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[25]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[26], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[26]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[27], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[27]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[28], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[28]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[29], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[29]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[30], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[30]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[31], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[31]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[32], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[32]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[33], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[33]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[34], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[34]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[35], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[35]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[36], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[36]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[37], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[37]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[38], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[38]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[39], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[39]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[40], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[40]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[41], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[41]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[42], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[42]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[43], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[43]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[44], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[44]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[45], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[45]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[46], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[46]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[47], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[47]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[48], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[48]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[49], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[49]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[50], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[50]);
		assertEquals(runList.get(0).getPlotSymbol().getFillPatternLineDashLengths()[51], clone.get(0).getPlotSymbol().getFillPatternLineDashLengths()[51]);
		assertEquals(runList.get(0).