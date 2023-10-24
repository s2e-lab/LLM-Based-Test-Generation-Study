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
     * Test case for {@link Main#getTestMolecule()}.
     */
    @Test
    void testGetTestMolecule() {
        Logger.getRootLogger().setLevel(Level.INFO);
        Logger.getRootLogger().addAppender(new ConsoleAppender(new PatternLayout("%-6r [%p] %c - %m%n")));
        JniInchiStructure struct = Main.getTestMolecule();
        String inchi = struct.getInchi();
        String inchiKey = struct.getInchiKey();
        String inchiAuxInfo = struct.getInchiAuxInfo();
        String inchi1 = JniInchi.getInchi(struct);
        String inchiKey1 = JniInchi.getInchiKey(struct);
        String inchiAuxInfo1 = JniInchi.getInchiAuxInfo(struct);
        assertEquals(inchi, inchi1);
        assertEquals(inchiKey, inchiKey1);
        assertEquals(inchiAuxInfo, inchiAuxInfo1);
        assertEquals(inchi, "InChI=1S/C6H12O/c1-2-4-6-5-3-1/h1-6H");
        assertEquals(inchiKey, "<KEY>");
        assertEquals(inchiAuxInfo, "AuxInfo=1/h(H2O)1/p+1/t+1");
    }
}
