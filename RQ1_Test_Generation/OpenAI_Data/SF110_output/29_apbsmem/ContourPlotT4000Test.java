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
		assertEquals(plot.getRuns().get(0).getMarkerStroke(), clone.getRuns().get(0).getMarkerStroke());
		assertEquals(plot.getRuns().get(0).getMarkerStrokeColor(), clone.getRuns().get(0).getMarkerStrokeColor());
		assertEquals(plot.getRuns().get(0).getMarkerStrokeWidth(), clone.getRuns().get(0).getMarkerStrokeWidth());
		assertEquals(plot.getRuns().get(0).getMarkerStrokeDash(), clone.getRuns().get(0).getMarkerStrokeDash());
		assertEquals(plot.getRuns().get(0).getMarkerStrokeDashPhase(), clone.getRuns().get(0).getMarkerStrokeDashPhase());
		assertEquals(plot.getRuns().get(0).getMarkerFill(), clone.getRuns().get(0).getMarkerFill());
		assertEquals(plot.getRuns().get(0).getMarkerFillColor(), clone.getRuns().get(0).getMarkerFillColor());
		assertEquals(plot.getRuns().get(0).getMarkerFillGradient(), clone.getRuns().get(0).getMarkerFillGradient());
		assertEquals(plot.getRuns().get(0).getMarkerFillGradientColor(), clone.getRuns().get(0).getMarkerFillGradientColor());
		assertEquals(plot.getRuns().get(0).getMarkerFillGradientOffset(), clone.getRuns().get(0).getMarkerFillGradientOffset());
		assertEquals(plot.getRuns().get(0).getMarkerFillGradientFractions(), clone.getRuns().get(0).getMarkerFillGradientFractions());
		assertEquals(plot.getRuns().get(0).getMarkerFillGradientCycleMethod(), clone.getRuns().get(0).getMarkerFillGradientCycleMethod());
		assertEquals(plot.getRuns().get(0).getMarkerFillGradientTransform(), clone.getRuns().get(0).getMarkerFillGradientTransform());
		assertEquals(plot.getRuns().get(0).getMarkerFillImage(), clone.getRuns().get(0).getMarkerFillImage());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageOpacity(), clone.getRuns().get(0).getMarkerFillImageOpacity());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageTransform(), clone.getRuns().get(0).getMarkerFillImageTransform());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageAnchor(), clone.getRuns().get(0).getMarkerFillImageAnchor());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageRotation(), clone.getRuns().get(0).getMarkerFillImageRotation());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageScale(), clone.getRuns().get(0).getMarkerFillImageScale());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageOffset(), clone.getRuns().get(0).getMarkerFillImageOffset());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageCycleMethod(), clone.getRuns().get(0).getMarkerFillImageCycleMethod());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColor(), clone.getRuns().get(0).getMarkerFillImageColor());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorOpacity(), clone.getRuns().get(0).getMarkerFillImageColorOpacity());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorTransform(), clone.getRuns().get(0).getMarkerFillImageColorTransform());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorAnchor(), clone.getRuns().get(0).getMarkerFillImageColorAnchor());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorRotation(), clone.getRuns().get(0).getMarkerFillImageColorRotation());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorScale(), clone.getRuns().get(0).getMarkerFillImageColorScale());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorOffset(), clone.getRuns().get(0).getMarkerFillImageColorOffset());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorCycleMethod(), clone.getRuns().get(0).getMarkerFillImageColorCycleMethod());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImage(), clone.getRuns().get(0).getMarkerFillImageColorImage());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageOpacity(), clone.getRuns().get(0).getMarkerFillImageColorImageOpacity());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageTransform(), clone.getRuns().get(0).getMarkerFillImageColorImageTransform());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageAnchor(), clone.getRuns().get(0).getMarkerFillImageColorImageAnchor());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageRotation(), clone.getRuns().get(0).getMarkerFillImageColorImageRotation());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageScale(), clone.getRuns().get(0).getMarkerFillImageColorImageScale());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageOffset(), clone.getRuns().get(0).getMarkerFillImageColorImageOffset());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageCycleMethod(), clone.getRuns().get(0).getMarkerFillImageColorImageCycleMethod());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColor(), clone.getRuns().get(0).getMarkerFillImageColorImageColor());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorOpacity(), clone.getRuns().get(0).getMarkerFillImageColorImageColorOpacity());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorTransform(), clone.getRuns().get(0).getMarkerFillImageColorImageColorTransform());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorAnchor(), clone.getRuns().get(0).getMarkerFillImageColorImageColorAnchor());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorRotation(), clone.getRuns().get(0).getMarkerFillImageColorImageColorRotation());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorScale(), clone.getRuns().get(0).getMarkerFillImageColorImageColorScale());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorOffset(), clone.getRuns().get(0).getMarkerFillImageColorImageColorOffset());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorCycleMethod(), clone.getRuns().get(0).getMarkerFillImageColorImageColorCycleMethod());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImage(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImage());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageOpacity(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageOpacity());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageTransform(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageTransform());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageAnchor(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageAnchor());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageRotation(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageRotation());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageScale(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageScale());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageOffset(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageOffset());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageCycleMethod(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageCycleMethod());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColor(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColor());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorOpacity(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorOpacity());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorTransform(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorTransform());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorAnchor(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorAnchor());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorRotation(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorRotation());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorScale(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorScale());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorOffset(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorOffset());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorCycleMethod(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorCycleMethod());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImage(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImage());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageOpacity(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageOpacity());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageTransform(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageTransform());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageAnchor(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageAnchor());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageRotation(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageRotation());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageScale(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageScale());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageOffset(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageOffset());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageCycleMethod(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageCycleMethod());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageColor(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageColor());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageColorOpacity(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageColorOpacity());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageColorTransform(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageColorTransform());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageColorAnchor(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageColorAnchor());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageColorRotation(), clone.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageColorRotation());
		assertEquals(plot.getRuns().get(0).getMarkerFillImageColorImageColorImageColorImageColorScale(), clone.getRuns().get(