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
     * Test case for the first structure.
     */
    @Test
    void test1() {
        JniInchiStructure mol = Main.getTestMolecule();
        assertNotNull(mol);
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchiKey());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchiAuxInfo());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi1Key());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi1AuxInfo());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi2Key());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi2AuxInfo());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi3Key());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi3AuxInfo());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi4Key());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi4AuxInfo());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi5Key());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi5AuxInfo());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi6Key());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi6AuxInfo());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi7Key());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi7AuxInfo());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi8Key());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi8AuxInfo());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi9Key());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi9AuxInfo());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi10Key());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi10AuxInfo());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi11Key());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi11AuxInfo());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi12Key());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4-2-1-3-6-10(9)8-5-7/h1-2,4-5,7-8,10H", mol.getInchi12AuxInfo());
        assertEquals("InChI=1S/C10H16O/c1-10-7-4