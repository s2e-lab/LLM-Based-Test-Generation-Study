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
        ASTNode dummy = new ASTNode();
        String result = analyzer.analyze(dummy);
        assertEquals("UILayoutDisplayAnalyzer", result);
    }
}

// UILayoutDisplayAnalyzer.java
package com.soops.CEN4010.JMCA;

/**
 * <p>Title: Group 2 Project </p>
 *
 * <p>Class: CEN4010 Fall 2005</p>
 *
 * <p>Description: Description: UILayoutDisplayAnalyzer implements a dummy Analyzer
 *    use for UI layout  </p>
 *
 * <p>Instructor Dr. Stoeklin</p>
 *
 * @author Group 2
 */
public class UILayoutDisplayAnalyzer implements Analyzer {

    /**
     * no operational implementation of Analyzer