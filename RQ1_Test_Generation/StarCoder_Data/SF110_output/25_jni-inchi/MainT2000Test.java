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
        JniInchiStructure struct = Main.getTestMolecule();
        assertEquals(6, struct.getNumAtoms());
        assertEquals(5, struct.getNumBonds());
        JniInchiAtom a1 = struct.getAtom(0);
        JniInchiAtom a2 = struct.getAtom(1);
        JniInchiAtom a3 = struct.getAtom(2);
        JniInchiAtom a4 = struct.getAtom(3);
        JniInchiAtom a5 = struct.getAtom(4);
        JniInchiAtom a6 = struct.getAtom(5);
        assertEquals(264.0, a1.getX());
        assertEquals(968.0, a1.getY());
        assertEquals(0.0, a1.getZ());
        assertEquals("C", a1.getElement());
        assertEquals(1, a1.getImplicitH());
        assertEquals(295.0, a2.getX());
        assertEquals(985.0, a2.getY());
        assertEquals(0.0, a2.getZ());
        assertEquals("C", a2.getElement());
        assertEquals(0, a2.getImplicitH());
        assertEquals(233.0, a3.getX());
        assertEquals(986.0, a3.getY());
        assertEquals(0.0, a3.getZ());
        assertEquals("N", a3.getElement());
        assertEquals(2, a3.getImplicitH());
        assertEquals(264.0, a4.getX());
        assertEquals(932.0, a4.getY());
        assertEquals(0.0, a4.getZ());
        assertEquals("C", a4.getElement());
        assertEquals(3, a4.getImplicitH());
        assertEquals(326.0, a5.getX());
        assertEquals(967.0, a5.getY());
        assertEquals(0.0, a5.getZ());
        assertEquals("O", a5.getElement());
        assertEquals(1, a5.getImplicitH());
        assertEquals(295.0, a6.getX());
        assertEquals(1021.0, a6.getY());
        assertEquals(0.0, a6.getZ());
        assertEquals("O", a6.getElement());
        assertEquals(0, a6.getImplicitH());
        JniInchiBond b1 = struct.getBond(0);
        JniInchiBond b2 = struct.getBond(1);
        JniInchiBond b3 = struct.getBond(2);
        JniInchiBond b4 = struct.getBond(3);
        JniInchiBond b5 = struct.getBond(4);
        assertEquals(a1, b1.getAtom1());
        assertEquals(a2, b1.getAtom2());
        assertEquals(INCHI_BOND_TYPE.SINGLE, b1.getType());
        assertEquals(INCHI_BOND_STEREO.NONE, b1.getStereo());
        assertEquals(a1, b2.getAtom1());
        assertEquals(a3, b2.getAtom2());
        assertEquals(INCHI_BOND_TYPE.SINGLE, b2.getType());
        assertEquals(INCHI_BOND_STEREO.SINGLE_1DOWN, b2.getStereo());
        assertEquals(a1, b3.getAtom1());
        assertEquals(a4, b3.getAtom2());
        assertEquals(INCHI_BOND_TYPE.SINGLE, b3.getType());
        assertEquals(INCHI_BOND_STEREO.NONE, b3.getStereo());
        assertEquals(a2, b4.getAtom1());
        assertEquals(a5, b4.getAtom2());
        assertEquals(INCHI_BOND_TYPE.SINGLE, b4.getType());
        assertEquals(INCHI_BOND_STEREO.NONE, b4.getStereo());
        assertEquals(a2, b5.getAtom1());
        assertEquals(a6, b5.getAtom2());
        assertEquals(INCHI_BOND_TYPE.DOUBLE, b5.getType());
        assertEquals(INCHI_BOND_STEREO.NONE, b5.getStereo());
    }
}
