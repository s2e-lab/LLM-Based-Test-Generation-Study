// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {

    /**
    * Test of {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
    */
    @Test
    void testCreateNewTetrahedralStereo0D_1() {
        System.out.println("createNewTetrahedralStereo0D_1");
        JniInchiAtom atC = new JniInchiAtom("C");
        JniInchiAtom at0 = new JniInchiAtom("C");
        JniInchiAtom at1 = new JniInchiAtom("C");
        JniInchiAtom at2 = new JniInchiAtom("C");
        JniInchiAtom at3 = new JniInchiAtom("C");
        JniInchiStereo0D instance = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.EVEN);
        assertEquals(atC, instance.getCentralAtom());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
        assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, instance.getStereoType());
        assertEquals(INCHI_PARITY.EVEN, instance.getParity());
    }

    /**
    * Test of {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
    */
    @Test
    void testCreateNewTetrahedralStereo0D_2() {
        System.out.println("createNewTetrahedralStereo0D_2");
        JniInchiAtom atC = new JniInchiAtom("C");
        JniInchiAtom at0 = new JniInchiAtom("C");
        JniInchiAtom at1 = new JniInchiAtom("C");
        JniInchiAtom at2 = new JniInchiAtom("C");
        JniInchiAtom at3 = new JniInchiAtom("C");
        JniInchiStereo0D instance = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.ODD);
        assertEquals(atC, instance.getCentralAtom());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
        assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, instance.getStereoType());
        assertEquals(INCHI_PARITY.ODD, instance.getParity());
    }

    /**
    * Test of {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
    */
    @Test
    void testCreateNewTetrahedralStereo0D_3() {
        System.out.println("createNewTetrahedralStereo0D_3");
        JniInchiAtom atC = new JniInchiAtom("C");
        JniInchiAtom at0 = new JniInchiAtom("C");
        JniInchiAtom at1 = new JniInchiAtom("C");
        JniInchiAtom at2 = new JniInchiAtom("C");
        JniInchiAtom at3 = new JniInchiAtom("C");
        JniInchiStereo0D instance = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.UNKNOWN);
        assertEquals(atC, instance.getCentralAtom());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
        assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, instance.getStereoType());
        assertEquals(INCHI_PARITY.UNKNOWN, instance.getParity());
    }

    /**
    * Test of {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
    */
    @Test
    void testCreateNewTetrahedralStereo0D_4() {
        System.out.println("createNewTetrahedralStereo0D_4");
        JniInchiAtom atC = new JniInchiAtom("C");
        JniInchiAtom at0 = new JniInchiAtom("C");
        JniInchiAtom at1 = new JniInchiAtom("C");
        JniInchiAtom at2 = new JniInchiAtom("C");
        JniInchiAtom at3 = new JniInchiAtom("C");
        JniInchiStereo0D instance = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.UNDEFINED);
        assertEquals(atC, instance.getCentralAtom());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
        assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, instance.getStereoType());
        assertEquals(INCHI_PARITY.UNDEFINED, instance.getParity());
    }

    /**
    * Test of {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
    */
    @Test
    void testCreateNewTetrahedralStereo0D_5() {
        System.out.println("createNewTetrahedralStereo0D_5");
        JniInchiAtom atC = new JniInchiAtom("C");
        JniInchiAtom at0 = new JniInchiAtom("C");
        JniInchiAtom at1 = new JniInchiAtom("C");
        JniInchiAtom at2 = new JniInchiAtom("C");
        JniInchiAtom at3 = new JniInchiAtom("C");
        JniInchiStereo0D instance = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.UNDEFINED);
        assertEquals(atC, instance.getCentralAtom());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
        assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, instance.getStereoType());
        assertEquals(INCHI_PARITY.UNDEFINED, instance.getParity());
    }

    /**
    * Test of {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
    */
    @Test
    void testCreateNewTetrahedralStereo0D_6() {
        System.out.println("createNewTetrahedralStereo0D_6");
        JniInchiAtom