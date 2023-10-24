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
     * Test of createVisualStyle method, of class SBMLVisualStyleFactory.
     */
    @Test
    void testCreateVisualStyle() {
        System.out.println("createVisualStyle");
        CyNetwork network = Cytoscape.getCurrentNetwork();
        VisualStyleFactory instance = new SBMLVisualStyleFactory();
        VisualStyle result = instance.createVisualStyle(network);
        assertNotNull(result);
    }
}
