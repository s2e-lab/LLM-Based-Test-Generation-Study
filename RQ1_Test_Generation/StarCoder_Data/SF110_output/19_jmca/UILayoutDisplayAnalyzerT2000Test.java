// UILayoutDisplayAnalyzerTest.java
package com.soops.CEN4010.JMCA;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UILayoutDisplayAnalyzer}.
* It contains ten unit test cases for the {@link UILayoutDisplayAnalyzer#analyze(ASTNode)} method.
*/
class UILayoutDisplayAnalyzerTest {

    /**
     * Test method for {@link UILayoutDisplayAnalyzer#analyze(ASTNode)}.
     */
    @Test
    void testAnalyze() {
        UILayoutDisplayAnalyzer analyzer = new UILayoutDisplayAnalyzer();
        analyzer.setFileName("CohesionTest.java");
        String output = analyzer.analyze(null);
        String expected = "\nFile:  CohesionTest.java\n" +
                "Class: CohesionTest\n\n" +
                "Method Name                             Cohesion Level\n" +
                "--------------------------------------------------------------\n" +
                "deposit                                 Functional\n" +
                "withdraw                                Sequential\n" +
                "addCD                                   Communicational\n" +
                "formDet                                 Iterative\n" +
                "checkBookIn                             Conditional\n" +
                "readInput                               Coincidental\n";
        assertEquals(expected, output);
    }
}
