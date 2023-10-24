// SBMLVisualStyleFactoryTest.java
package sbmlreader2;

import cytoscape.*;
import cytoscape.visual.*;
import cytoscape.visual.calculators.*;
import cytoscape.visual.mappings.*;
import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SBMLVisualStyleFactory}.
* It contains ten unit test cases for the {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
*/
class SBMLVisualStyleFactoryTest {

    /**
     * Test case for the {@link SBMLVisualStyleFactory#createVisualStyle(CyNetwork)} method.
     * It tests the creation of a visual style for a network with a single node.
     */
    @Test
    void testCreateVisualStyleSingleNode() {
        CyNetwork network = Cytoscape.createNetwork("test", true);
        CyNode node = Cytoscape.createNode("test", true);
        Cytoscape.addNodeToNetwork(node, network);
        VisualStyle style = SBMLVisualStyleFactory.createVisualStyle(network);
        assertNotNull(style);
        assertEquals("test", style.getTitle());
        assertEquals(1, style.getNodeMappings().size());
        assertEquals(1, style.getEdgeMappings().size());
        assertEquals(1, style.getNetworkMappings().size());
        assertEquals(1, style.getNodeVisualProperties().size());
        assertEquals(1, style.getEdgeVisualProperties().size());
        assertEquals(1, style.getNetworkVisualProperties().size());
        assertEquals(1, style.getNodeLabelMappings().size());
        assertEquals(1, style.getEdgeLabelMappings().size());
        assertEquals(1, style.getNetworkLabelMappings().size());
        assertEquals(1, style.getNodeLabelVisualProperties().size());
        assertEquals(1, style.getEdgeLabelVisualProperties().size());
        assertEquals(1, style.getNetworkLabelVisualProperties().size());
        assertEquals(1, style.getNodeCalculatorMappings().size());
        assertEquals(1, style.getEdgeCalculatorMappings().size());
        assertEquals(1, style.getNetworkCalculatorMappings().size());
        assertEquals(1, style.getNodeCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeLabelCalculatorMappings().size());
        assertEquals(1, style.getEdgeLabelCalculatorMappings().size());
        assertEquals(1, style.getNetworkLabelCalculatorMappings().size());
        assertEquals(1, style.getNodeLabelCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeLabelCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkLabelCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeColorCalculatorMappings().size());
        assertEquals(1, style.getEdgeColorCalculatorMappings().size());
        assertEquals(1, style.getNetworkColorCalculatorMappings().size());
        assertEquals(1, style.getNodeColorCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeColorCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkColorCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeSizeCalculatorMappings().size());
        assertEquals(1, style.getEdgeSizeCalculatorMappings().size());
        assertEquals(1, style.getNetworkSizeCalculatorMappings().size());
        assertEquals(1, style.getNodeSizeCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeSizeCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkSizeCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeShapeCalculatorMappings().size());
        assertEquals(1, style.getEdgeShapeCalculatorMappings().size());
        assertEquals(1, style.getNetworkShapeCalculatorMappings().size());
        assertEquals(1, style.getNodeShapeCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeShapeCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkShapeCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeTransparencyCalculatorMappings().size());
        assertEquals(1, style.getEdgeTransparencyCalculatorMappings().size());
        assertEquals(1, style.getNetworkTransparencyCalculatorMappings().size());
        assertEquals(1, style.getNodeTransparencyCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeTransparencyCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkTransparencyCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeImageCalculatorMappings().size());
        assertEquals(1, style.getEdgeImageCalculatorMappings().size());
        assertEquals(1, style.getNetworkImageCalculatorMappings().size());
        assertEquals(1, style.getNodeImageCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeImageCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkImageCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeFontCalculatorMappings().size());
        assertEquals(1, style.getEdgeFontCalculatorMappings().size());
        assertEquals(1, style.getNetworkFontCalculatorMappings().size());
        assertEquals(1, style.getNodeFontCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeFontCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkFontCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeLabelColorCalculatorMappings().size());
        assertEquals(1, style.getEdgeLabelColorCalculatorMappings().size());
        assertEquals(1, style.getNetworkLabelColorCalculatorMappings().size());
        assertEquals(1, style.getNodeLabelColorCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeLabelColorCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkLabelColorCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeLabelSizeCalculatorMappings().size());
        assertEquals(1, style.getEdgeLabelSizeCalculatorMappings().size());
        assertEquals(1, style.getNetworkLabelSizeCalculatorMappings().size());
        assertEquals(1, style.getNodeLabelSizeCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeLabelSizeCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkLabelSizeCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeLabelFontCalculatorMappings().size());
        assertEquals(1, style.getEdgeLabelFontCalculatorMappings().size());
        assertEquals(1, style.getNetworkLabelFontCalculatorMappings().size());
        assertEquals(1, style.getNodeLabelFontCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeLabelFontCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkLabelFontCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeLabelTransparencyCalculatorMappings().size());
        assertEquals(1, style.getEdgeLabelTransparencyCalculatorMappings().size());
        assertEquals(1, style.getNetworkLabelTransparencyCalculatorMappings().size());
        assertEquals(1, style.getNodeLabelTransparencyCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeLabelTransparencyCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkLabelTransparencyCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeLabelImageCalculatorMappings().size());
        assertEquals(1, style.getEdgeLabelImageCalculatorMappings().size());
        assertEquals(1, style.getNetworkLabelImageCalculatorMappings().size());
        assertEquals(1, style.getNodeLabelImageCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeLabelImageCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkLabelImageCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeLabelShapeCalculatorMappings().size());
        assertEquals(1, style.getEdgeLabelShapeCalculatorMappings().size());
        assertEquals(1, style.getNetworkLabelShapeCalculatorMappings().size());
        assertEquals(1, style.getNodeLabelShapeCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeLabelShapeCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkLabelShapeCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeLabelPositionCalculatorMappings().size());
        assertEquals(1, style.getEdgeLabelPositionCalculatorMappings().size());
        assertEquals(1, style.getNetworkLabelPositionCalculatorMappings().size());
        assertEquals(1, style.getNodeLabelPositionCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeLabelPositionCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkLabelPositionCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeLabelAlignmentCalculatorMappings().size());
        assertEquals(1, style.getEdgeLabelAlignmentCalculatorMappings().size());
        assertEquals(1, style.getNetworkLabelAlignmentCalculatorMappings().size());
        assertEquals(1, style.getNodeLabelAlignmentCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeLabelAlignmentCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkLabelAlignmentCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeLabelLineTypeCalculatorMappings().size());
        assertEquals(1, style.getEdgeLabelLineTypeCalculatorMappings().size());
        assertEquals(1, style.getNetworkLabelLineTypeCalculatorMappings().size());
        assertEquals(1, style.getNodeLabelLineTypeCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeLabelLineTypeCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkLabelLineTypeCalculatorVisualProperties().size());
        assertEquals(1, style.getNodeLabelLineColorCalculatorMappings().size());
        assertEquals(1, style.getEdgeLabelLineColorCalculatorMappings().size());
        assertEquals(1, style.getNetworkLabelLineColorCalculatorMappings().size());
        assertEquals(1, style.getNodeLabelLineColorCalculatorVisualProperties().size());
        assertEquals(1, style.getEdgeLabelLineColorCalculatorVisualProperties().size());
        assertEquals(1, style.getNetworkLabelLineColorCalculatorVisualProperties().size());
        assertEquals