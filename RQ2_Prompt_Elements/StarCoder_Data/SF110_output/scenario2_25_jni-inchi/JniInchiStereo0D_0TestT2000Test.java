// JniInchiStereo0D_0Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_0Test {

    /**
     * Test of {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
     */
    @Test
    void testCreateNewTetrahedralStereo0D_001() {
        System.out.println("createNewTetrahedralStereo0D");
        JniInchiAtom atC = new JniInchiAtom("C");
        JniInchiAtom at0 = new JniInchiAtom("C");
        JniInchiAtom at1 = new JniInchiAtom("C");
        JniInchiAtom at2 = new JniInchiAtom("C");
        JniInchiAtom at3 = new JniInchiAtom("C");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.EVEN);
        assertEquals(stereo.getCentralAtom(), atC);
        assertEquals(stereo.getNeighbor(0), at0);
        assertEquals(stereo.getNeighbor(1), at1);
        assertEquals(stereo.getNeighbor(2), at2);
        assertEquals(stereo.getNeighbor(3), at3);
        assertEquals(stereo.getType(), INCHI_STEREOTYPE.TETRAHEDRAL);
        assertEquals(stereo.getParity(), INCHI_PARITY.EVEN);
    }

    /**
     * Test of {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
     */
    @Test
    void testCreateNewTetrahedralStereo0D_002() {
        System.out.println("createNewTetrahedralStereo0D");
        JniInchiAtom atC = new JniInchiAtom("C");
        JniInchiAtom at0 = new JniInchiAtom("C");
        JniInchiAtom at1 = new JniInchiAtom("C");
        JniInchiAtom at2 = new JniInchiAtom("C");
        JniInchiAtom at3 = new JniInchiAtom("C");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.ODD);
        assertEquals(stereo.getCentralAtom(), atC);
        assertEquals(stereo.getNeighbor(0), at0);
        assertEquals(stereo.getNeighbor(1), at1);
        assertEquals(stereo.getNeighbor(2), at2);
        assertEquals(stereo.getNeighbor(3), at3);
        assertEquals(stereo.getType(), INCHI_STEREOTYPE.TETRAHEDRAL);
        assertEquals(stereo.getParity(), INCHI_PARITY.ODD);
    }

    /**
     * Test of {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
     */
    @Test
    void testCreateNewTetrahedralStereo0D_003() {
        System.out.println("createNewTetrahedralStereo0D");
        JniInchiAtom atC = new JniInchiAtom("C");
        JniInchiAtom at0 = new JniInchiAtom("C");
        JniInchiAtom at1 = new JniInchiAtom("C");
        JniInchiAtom at2 = new JniInchiAtom("C");
        JniInchiAtom at3 = new JniInchiAtom("C");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.UNKNOWN);
        assertEquals(stereo.getCentralAtom(), atC);
        assertEquals(stereo.getNeighbor(0), at0);
        assertEquals(stereo.getNeighbor(1), at1);
        assertEquals(stereo.getNeighbor(2), at2);
        assertEquals(stereo.getNeighbor(3), at3);
        assertEquals(stereo.getType(), INCHI_STEREOTYPE.TETRAHEDRAL);
        assertEquals(stereo.getParity(), INCHI_PARITY.UNKNOWN);
    }

    /**
     * Test of {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
     */
    @Test
    void testCreateNewTetrahedralStereo0D_004() {
        System.out.println("createNewTetrahedralStereo0D");
        JniInchiAtom atC = new JniInchiAtom("C");
        JniInchiAtom at0 = new JniInchiAtom("C");
        JniInchiAtom at1 = new JniInchiAtom("C");
        JniInchiAtom at2 = new JniInchiAtom("C");
        JniInchiAtom at3 = new JniInchiAtom("C");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.UNDEFINED);
        assertEquals(stereo.getCentralAtom(), atC);
        assertEquals(stereo.getNeighbor(0), at0);
        assertEquals(stereo.getNeighbor(1), at1);
        assertEquals(stereo.getNeighbor(2), at2);
        assertEquals(stereo.getNeighbor(3), at3);
        assertEquals(stereo.getType(), INCHI_STEREOTYPE.TETRAHEDRAL);
        assertEquals(stereo.getParity(), INCHI_PARITY.UNDEFINED);
    }

    /**
     * Test of {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
     */
    @Test
    void testCreateNewTetrahedralStereo0D_005() {
        System.out.println("createNewTetrahedralStereo0D");
        JniInchiAtom atC = new JniInchiAtom("C");
        JniInchiAtom at0 = new JniInchiAtom("C");
        JniInchiAtom at1 = new JniInchiAtom("C");
        JniInchiAtom at2 = new JniInchiAtom("C");
        JniInchiAtom at3 = new JniInchiAtom("C");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.UNDEFINED);
        assertEquals(stereo.getCentralAtom(), atC);
        assertEquals(stereo.getNeighbor(0), at0);
        assertEquals(stereo.getNeighbor(1), at1);
        assertEquals(stereo.getNeighbor(2), at2);
        assertEquals(stereo.getNeighbor(3), at3);
        assertEquals(stereo.getType(), INCHI_STEREOTYPE.TETRAHEDRAL);
        assertEquals(stereo.getParity(), INCHI_PARITY.UNDEFINED);
    }

    /**
     * Test of {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
     */
    @Test
    void testCreateNewTetrahedralStereo0D_006() {
        System.