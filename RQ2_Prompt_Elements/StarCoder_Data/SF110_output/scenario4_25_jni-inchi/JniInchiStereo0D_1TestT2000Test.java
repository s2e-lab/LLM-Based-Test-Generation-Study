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
        assertEquals(INCHI_STEREOTYPE.INCHI_StereoType_DoubleBond, instance.getStereoType());
        assertEquals(INCHI_PARITY.EVEN, instance.getParity());
        assertEquals(JniInchiStereo0D.NO_ATOM, instance.getCentralAtom().getIndex());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
    }
}

// JniInchiStereo0D_2Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_2Test {
		
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
        assertEquals(INCHI_STEREOTYPE.INCHI_StereoType_DoubleBond, instance.getStereoType());
        assertEquals(INCHI_PARITY.ODD, instance.getParity());
        assertEquals(JniInchiStereo0D.NO_ATOM, instance.getCentralAtom().getIndex());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
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
        JniInchiStereo0D instance = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.UNKNOWN);
        assertEquals(INCHI_STEREOTYPE.INCHI_StereoType_DoubleBond, instance.getStereoType());
        assertEquals(INCHI_PARITY.UNKNOWN, instance.getParity());
        assertEquals(JniInchiStereo0D.NO_ATOM, instance.getCentralAtom().getIndex());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
    }
}

// JniInchiStereo0D_4Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_4Test {
		
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
        JniInchiStereo0D instance = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.NONE);
        assertEquals(INCHI_STEREOTYPE.INCHI_StereoType_DoubleBond, instance.getStereoType());
        assertEquals(INCHI_PARITY.NONE, instance.getParity());
        assertEquals(JniInchiStereo0D.NO_ATOM, instance.getCentralAtom().getIndex());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
    }
}

// JniInchiStereo0D_5Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_5Test {
		
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
        JniInchiStereo0D instance = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.UNDEFINED);
        assertEquals(INCHI_STEREOTYPE.INCHI_StereoType_