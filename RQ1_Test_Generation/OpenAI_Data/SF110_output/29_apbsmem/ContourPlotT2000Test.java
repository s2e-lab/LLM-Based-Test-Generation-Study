// ContourPlotTest.java
package jahuwaldt.plot;

import java.awt.*;
import javax.swing.*;
import java.util.*;
import java.text.NumberFormat;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ContourPlot}.
* It contains ten unit test cases for the {@link ContourPlot#clone()} method.
*/
class ContourPlotTest {

	/**
	* Test method for {@link ContourPlot#clone()}.
	*/
	@Test
	public void testClone() {
		ContourPlot plot = new ContourPlot();
		ContourPlot clone = (ContourPlot) plot.clone();
		assertNotSame(plot, clone);
		assertEquals(plot.getTitle(), clone.getTitle());
		assertEquals(plot.getHorizontalAxis().getLabel(), clone.getHorizontalAxis().getLabel());
		assertEquals(plot.getVerticalAxis().getLabel(), clone.getVerticalAxis().getLabel());
		assertEquals(plot.getRuns().size(), clone.getRuns().size());
		assertEquals(plot.getRuns().get(0).getLineColor(), clone.getRuns().get(0).getLineColor());
		assertEquals(plot.getRuns().get(0).getLineStyle(), clone.getRuns().get(0).getLineStyle());
		assertEquals(plot.getRuns().get(0).getLineWidth(), clone.getRuns().get(0).getLineWidth());
		assertEquals(plot.getRuns().get(0).getMarker(), clone.getRuns().get(0).getMarker());
		assertEquals(plot.getRuns().get(0).getMarkerColor(), clone.getRuns().get(0).getMarkerColor());
		assertEquals(plot.getRuns().get(0).getMarkerSize(), clone.getRuns().get(0).getMarkerSize());
		assertEquals(plot.getRuns().get(0).getMarkerStyle(), clone.getRuns().get(0).getMarkerStyle());
		assertEquals(plot.getRuns().get(0).getMarkerLineWidth(), clone.getRuns().get(0).getMarkerLineWidth());
		assertEquals(plot.getRuns().get(0).getMarkerLineColor(), clone.getRuns().get(0).getMarkerLineColor());
		assertEquals(plot.getRuns().get(0).getMarkerFillColor(), clone.getRuns().get(0).getMarkerFillColor());
		assertEquals(plot.getRuns().get(0).getMarkerFillStyle(), clone.getRuns().get(0).getMarkerFillStyle());
		assertEquals(plot.getRuns().get(0).getMarkerString(), clone.getRuns().get(0).getMarkerString());
		assertEquals(plot.getRuns().get(0).getMarkerStringColor(), clone.getRuns().get(0).getMarkerStringColor());
		assertEquals(plot.getRuns().get(0).getMarkerStringFont(), clone.getRuns().get(0).getMarkerStringFont());
		assertEquals(plot.getRuns().get(0).getMarkerStringJustify(), clone.getRuns().get(0).getMarkerStringJustify());
		assertEquals(plot.getRuns().get(0).getMarkerStringOffset(), clone.getRuns().get(0).getMarkerStringOffset());
		assertEquals(plot.getRuns().get(0).getMarkerStringRotation(), clone.getRuns().get(0).getMarkerStringRotation());
		assertEquals(plot.getRuns().get(0).getMarkerStringSize(), clone.getRuns().get(0).getMarkerStringSize());
		assertEquals(plot.getRuns().get(0).getMarkerStringStyle(), clone.getRuns().get(0).getMarkerStringStyle());
		assertEquals(plot.getRuns().get(0).getMarkerStringWeight(), clone.getRuns().get(0).getMarkerStringWeight());
		assertEquals(plot.getRuns().get(0).getMarkerStringXOffset(), clone.getRuns().get(0).getMarkerStringXOffset());
		assertEquals(plot.getRuns().get(0).getMarkerStringYOffset(), clone.getRuns().get(0).getMarkerStringYOffset());
		assertEquals(plot.getRuns().get(0).getMarkerStringXScale(), clone.getRuns().get(0).getMarkerStringXScale());
		assertEquals(plot.getRuns().get(0).getMarkerStringYScale(), clone.getRuns().get(0).getMarkerStringYScale());
		assertEquals(plot.getRuns().get(0).getMarkerStringXShear(), clone.getRuns().get(0).getMarkerStringXShear());
		assertEquals(plot.getRuns().get(0).getMarkerStringYShear(), clone.getRuns().get(0).getMarkerStringYShear());
		assertEquals(plot.getRuns().get(0).getMarkerStringXRotate(), clone.getRuns().get(0).getMarkerStringXRotate());
		assertEquals(plot.getRuns().get(0).getMarkerStringYRotate(), clone.getRuns().get(0).getMarkerStringYRotate());
		assertEquals(plot.getRuns().get(0).getMarkerStringXTranslate(), clone.getRuns().get(0).getMarkerStringXTranslate());
		assertEquals(plot.getRuns().get(0).getMarkerStringYTranslate(), clone.getRuns().get(0).getMarkerStringYTranslate());
		assertEquals(plot.getRuns().get(0).getMarkerStringXSkew(), clone.getRuns().get(0).getMarkerStringXSkew());
		assertEquals(plot.getRuns().get(0).getMarkerStringYSkew(), clone.getRuns().get(0).getMarkerStringYSkew());
		assertEquals(plot.getRuns().get(0).getMarkerStringXStretch(), clone.getRuns().get(0).getMarkerStringXStretch());
		assertEquals(plot.getRuns().get(0).getMarkerStringYStretch(), clone.getRuns().get(0).getMarkerStringYStretch());
		assertEquals(plot.getRuns().get(0).getMarkerStringXScale(), clone.getRuns().get(0).getMarkerStringXScale());
		assertEquals(plot.getRuns().get(0).getMarkerStringYScale(), clone.getRuns().get(0).getMarkerStringYScale());
		assertEquals(plot.getRuns().get(0).getMarkerStringXShear(), clone.getRuns().get(0).getMarkerStringXShear());
		assertEquals(plot.getRuns().get(0).getMarkerStringYShear(), clone.getRuns().get(0).getMarkerStringYShear());
		assertEquals(plot.getRuns().get(0).getMarkerStringXRotate(), clone.getRuns().get(0).getMarkerStringXRotate());
		assertEquals(plot.getRuns().get(0).getMarkerStringYRotate(), clone.getRuns().get(0).getMarkerStringYRotate());
		assertEquals(plot.getRuns().get(0).getMarkerStringXTranslate(), clone.getRuns().get(0).getMarkerStringXTranslate());
		assertEquals(plot.getRuns().get(0).getMarkerStringYTranslate(), clone.getRuns().get(0).getMarkerStringYTranslate());
		assertEquals(plot.getRuns().get(0).getMarkerStringXSkew(), clone.getRuns().get(0).getMarkerStringXSkew());
		assertEquals(plot.getRuns().get(0).getMarkerStringYSkew(), clone.getRuns().get(0).getMarkerStringYSkew());
		assertEquals(plot.getRuns().get(0).getMarkerStringXStretch(), clone.getRuns().get(0).getMarkerStringXStretch());
		assertEqu