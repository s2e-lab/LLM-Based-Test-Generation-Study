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
        CyNetwork network = Cytoscape.createNetwork("test", false);
        CyNode node = Cytoscape.createNode("test", false);
        Cytoscape.addNodeToNetwork(node, network);
        VisualStyle vs = SBMLVisualStyleFactory.createVisualStyle(network);
        assertEquals(SBMLVisualStyleFactory.SBMLReader_VS, vs.getTitle());
        assertEquals(1, vs.getNodeMappings().length);
        assertEquals(1, vs.getEdgeMappings().length);
        assertEquals(1, vs.getNodeVisualProperties().length);
        assertEquals(1, vs.getEdgeVisualProperties().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeCalculatorMappings().length);
        assertEquals(1, vs.getEdgeCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals(1, vs.getNodeLabelVisualProperties().length);
        assertEquals(1, vs.getEdgeLabelVisualProperties().length);
        assertEquals(1, vs.getNodeLabelCalculatorMappings().length);
        assertEquals(1, vs.getEdgeLabelCalculatorMappings().length);
        assertEquals(1, vs.getNodeLabelMappings().length);
        assertEquals(1, vs.getEdgeLabelMappings().length);
        assertEquals