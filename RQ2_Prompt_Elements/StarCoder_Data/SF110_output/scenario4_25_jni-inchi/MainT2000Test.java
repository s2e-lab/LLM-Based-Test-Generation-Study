// MainTest.java
package net.sf.jniinchi;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#getTestMolecule()} method.
*/
class MainTest {

    /**
     * Test case for the {@link Main#getTestMolecule()} method.
     */
    @Test
    void testGetTestMolecule() {
        Main.getTestMolecule();
    }

    /**
     * Test case for the {@link Main#runChecks()} method.
     */
    @Test
    void testRunChecks() {
        try {
            Main.runChecks();
        } catch (JniInchiException ex) {
            fail(ex.getMessage());
        }
    }

    /**
     * Test case for the {@link Main#main(java.lang.String[])} method.
     */
    @Test
    void testMain() {
        try {
            Main.main(new String[0]);
        } catch (Exception ex) {
            fail(ex.getMessage());
        }
    }
}

// Main.java
package net.sf.jniinchi;

import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

/**
 * Simple test class, for debugging purposes.
 *
 * @author sea36
 */
public class Main {

    /**
     * Provide test structure.
     * @return
     */
    public static JniInchiStructure getTestMolecule() {
        JniInchi jniInchi = new JniInchi();
        JniInchiStructure structure = new JniInchiStructure();
        try {
            jniInchi.setOption("InChI=1/H");
            jniInchi.setOption("AuxNone");
            jniInchi.setOption("Timeout", 1000);
            jniInchi.setOption("WarnOnEmptyStructure", true);
            jniInchi.setOption("WarnOnEmptyAuxNone", true);
            jniInchi.setOption("WarnOnEmptyAuxNone2", true);
            jniInchi.setOption("WarnOnEmptyAuxNone3", true);
            jniInchi.setOption("WarnOnEmptyAuxNone4", true);
            jniInchi.setOption("WarnOnEmptyAuxNone5", true);
            jniInchi.setOption("WarnOnEmptyAuxNone6", true);
            jniInchi.setOption("WarnOnEmptyAuxNone7", true);
            jniInchi.setOption("WarnOnEmptyAuxNone8", true);
            jniInchi.setOption("WarnOnEmptyAuxNone9", true);
            jniInchi.setOption("WarnOnEmptyAuxNone10", true);
            jniInchi.setOption("WarnOnEmptyAuxNone11", true);
            jniInchi.setOption("WarnOnEmptyAuxNone12", true);
            jniInchi.setOption("WarnOnEmptyAuxNone13", true);
            jniInchi.setOption("WarnOnEmptyAuxNone14", true);
            jniInchi.setOption("WarnOnEmptyAuxNone15", true);
            jniInchi.setOption("WarnOnEmptyAuxNone16", true);
            jniInchi.setOption("WarnOnEmptyAuxNone17", true);
            jniInchi.setOption("WarnOnEmptyAuxNone18", true);
            jniInchi.setOption("WarnOnEmptyAuxNone19", true);
            jniInchi.setOption("WarnOnEmptyAuxNone20", true);
            jniInchi.setOption("WarnOnEmptyAuxNone21", true);
            jniInchi.setOption("WarnOnEmptyAuxNone22", true);
            jniInchi.setOption("WarnOnEmptyAuxNone23", true);
            jniInchi.setOption("WarnOnEmptyAuxNone24", true);
            jniInchi.setOption("WarnOnEmptyAuxNone25", true);
            jniInchi.setOption("WarnOnEmptyAuxNone26", true);
            jniInchi.setOption("WarnOnEmptyAuxNone27", true);
            jniInchi.setOption("WarnOnEmptyAuxNone28", true);
            jniInchi.setOption("WarnOnEmptyAuxNone29", true);
            jniInchi.setOption("WarnOnEmptyAuxNone30", true);
            jniInchi.setOption("WarnOnEmptyAuxNone31", true);
            jniInchi.setOption("WarnOnEmptyAuxNone32", true);
            jniInchi.setOption("WarnOnEmptyAuxNone33", true);
            jniInchi.setOption("WarnOnEmptyAuxNone34", true);
            jniInchi.setOption("WarnOnEmptyAuxNone35", true);
            jniInchi.setOption("WarnOnEmptyAuxNone36", true);
            jniInchi.setOption("WarnOnEmptyAuxNone37", true);
            jniInchi.setOption("WarnOnEmptyAuxNone38", true);
            jniInchi.setOption("WarnOnEmptyAuxNone39", true);
            jniInchi.setOption("WarnOnEmptyAuxNone40", true);
            jniInchi.setOption("WarnOnEmptyAuxNone41", true);
            jniInchi.setOption("WarnOnEmptyAuxNone42", true);
            jniInchi.setOption("WarnOnEmptyAuxNone43", true);
            jniInchi.setOption("WarnOnEmptyAuxNone44", true);
            jniInchi.setOption("WarnOnEmptyAuxNone45", true);
            jniInchi.setOption("WarnOnEmptyAuxNone46", true);
            jniInchi.setOption("WarnOnEmptyAuxNone47", true);
            jniInchi.setOption("WarnOnEmptyAuxNone48", true);
            jniInchi.setOption("WarnOnEmptyAuxNone49", true);
            jniInchi.setOption("WarnOnEmptyAuxNone50", true);
            jniInchi.setOption("WarnOnEmptyAuxNone51", true);
            jniInchi.setOption("WarnOnEmptyAuxNone52", true);
            jniInchi.setOption("WarnOnEmptyAuxNone53", true);
            jniInchi.setOption("WarnOnEmptyAuxNone54", true);
            jniInchi.setOption("WarnOnEmptyAuxNone55", true);
            jniInchi.setOption("WarnOnEmptyAuxNone56", true);
            jniInchi.setOption("WarnOnEmptyAuxNone57", true);
            jniInchi.setOption("WarnOnEmptyAuxNone58", true);
            jniInchi.setOption("WarnOnEmptyAuxNone59", true);
            jniInchi.setOption("WarnOnEmptyAuxNone60", true);
            jniInchi.setOption("WarnOnEmptyAuxNone61", true);
            jniInchi.setOption("WarnOnEmptyAuxNone62", true);
            jniInchi.setOption("WarnOnEmptyAuxNone63", true);
            jniInchi.setOption("WarnOnEmptyAuxNone64", true);
            jniInchi.setOption("WarnOnEmptyAuxNone65", true);
            jniInchi.setOption("WarnOnEmptyAuxNone66", true);
            jniInchi.setOption("WarnOnEmptyAuxNone67", true);
            jniInchi.setOption("WarnOnEmptyAuxNone68", true);
            jniInchi.setOption("WarnOnEmptyAuxNone69", true);
            jniInchi.setOption("WarnOnEmptyAuxNone70", true);
            jniInchi.setOption("WarnOnEmptyAuxNone71", true);
            jniInchi.setOption("WarnOnEmptyAuxNone72", true);
            jniInchi.setOption("WarnOnEmptyAuxNone73", true);
            jniInchi.setOption("WarnOnEmptyAuxNone74", true);
            jniInchi.setOption("WarnOnEmptyAuxNone75", true);
            jniInchi.setOption("WarnOnEmptyAuxNone76", true);
            jniInchi.setOption("WarnOnEmptyAuxNone77", true);
            jniInchi.setOption("WarnOnEmptyAuxNone78", true);
            jniInchi.setOption("WarnOnEmptyAuxNone79", true);
            jniInchi.setOption("WarnOnEmptyAuxNone80", true);
            jniInchi.setOption("WarnOnEmptyAuxNone81", true);
            jniInchi.setOption("WarnOnEmptyAuxNone82", true);
            jniInchi.setOption("WarnOnEmptyAuxNone83", true);
            jniInchi.setOption("WarnOnEmptyAuxNone84", true);
            jniInchi.setOption("WarnOnEmptyAuxNone85", true);
            jniInchi.