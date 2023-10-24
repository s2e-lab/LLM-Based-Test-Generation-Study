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
     * Test of createNewTetrahedralStereo0D method, of class JniInchiStereo0D.
     */
    @Test
    void testCreateNewTetrahedralStereo0D() {
        System.out.println("createNewTetrahedralStereo0D");
        JniInchiAtom atC = new JniInchiAtom();
        JniInchiAtom at0 = new JniInchiAtom();
        JniInchiAtom at1 = new JniInchiAtom();
        JniInchiAtom at2 = new JniInchiAtom();
        JniInchiAtom at3 = new JniInchiAtom();
        JniInchiStereo0D instance = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.EVEN);
        assertEquals(atC, instance.getCentralAtom());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
        assertEquals(INCHI_PARITY.EVEN, instance.getParity());
        assertEquals(INCHI_STEREOTYPE.INCHI_StereoType_Tetrahedral, instance.getStereoType());
    }
}

// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {
		
    /**
     * Test of createNewDoublebondStereo0D method, of class JniInchiStereo0D.
     */
    @Test
    void testCreateNewDoublebondStereo0D() {
        System.out.println("createNewDoublebondStereo0D");
        JniInchiAtom at0 = new JniInchiAtom();
        JniInchiAtom at1 = new JniInchiAtom();
        JniInchiAtom at2 = new JniInchiAtom();
        JniInchiAtom at3 = new JniInchiAtom();
        JniInchiStereo0D instance = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
        assertEquals(INCHI_PARITY.EVEN, instance.getParity());
        assertEquals(INCHI_STEREOTYPE.INCHI_StereoType_DoubleBond, instance.getStereoType());
    }
}

// JniInchiStereo0D_2Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_2Test {
		
    /**
     * Test of createNewTetrahedralStereo0D method, of class JniInchiStereo0D.
     */
    @Test
    void testCreateNewTetrahedralStereo0D() {
        System.out.println("createNewTetrahedralStereo0D");
        JniInchiAtom atC = new JniInchiAtom();
        JniInchiAtom at0 = new JniInchiAtom();
        JniInchiAtom at1 = new JniInchiAtom();
        JniInchiAtom at2 = new JniInchiAtom();
        JniInchiAtom at3 = new JniInchiAtom();
        JniInchiStereo0D instance = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.ODD);
        assertEquals(atC, instance.getCentralAtom());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
        assertEquals(INCHI_PARITY.ODD, instance.getParity());
        assertEquals(INCHI_STEREOTYPE.INCHI_StereoType_Tetrahedral, instance.getStereoType());
    }
}

// JniInchiStereo0D_3Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_3Test {
		
    /**
     * Test of createNewDoublebondStereo0D method, of class JniInchiStereo0D.
     */
    @Test
    void testCreateNewDoublebondStereo0D() {
        System.out.println("createNewDoublebondStereo0D");
        JniInchiAtom at0 = new JniInchiAtom();
        JniInchiAtom at1 = new JniInchiAtom();
        JniInchiAtom at2 = new JniInchiAtom();
        JniInchiAtom at3 = new JniInchiAtom();
        JniInchiStereo0D instance = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.ODD);
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
        assertEquals(INCHI_PARITY.ODD, instance.getParity());
        assertEquals(INCHI_STEREOTYPE.INCHI_StereoType_DoubleBond, instance.getStereoType());
    }
}

// JniInchiStereo0D_4Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_4Test {
		
    /**
     * Test of createNewTetrahedralStereo0D method, of class JniInchiStereo0D.
     */
    @Test
    void testCreateNewTetrahedralStereo0D() {
        System.out.println("createNewTetrahedralStereo0D");
        JniInchiAtom atC = new JniInchiAtom();
        JniInchiAtom at0 = new JniInchiAtom();
        JniInchiAtom at1 = new JniInchiAtom();
        JniInchiAtom at2 = new JniInchiAtom();
        JniInchiAtom at3 = new JniInchiAtom();
        JniInchiStereo0D instance = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2,