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
     * Test of {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
     */
    @Test
    void testCreateNewDoublebondStereo0D() {
        System.out.println("createNewDoublebondStereo0D");
        JniInchiAtom at0 = new JniInchiAtom();
        JniInchiAtom at1 = new JniInchiAtom();
        JniInchiAtom at2 = new JniInchiAtom();
        JniInchiAtom at3 = new JniInchiAtom();
        JniInchiStereo0D instance = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_ODD);
        assertEquals(INCHI_StereoType.INCHI_StereoType_DoubleBond, instance.getType());
        assertEquals(INCHI_PARITY.INCHI_PARITY_ODD, instance.getParity());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
        assertEquals(JniInchiAtom.NO_ATOM, instance.getCentralAtom());
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
     * Test of {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
     */
    @Test
    void testCreateNewDoublebondStereo0D() {
        System.out.println("createNewDoublebondStereo0D");
        JniInchiAtom at0 = new JniInchiAtom();
        JniInchiAtom at1 = new JniInchiAtom();
        JniInchiAtom at2 = new JniInchiAtom();
        JniInchiAtom at3 = new JniInchiAtom();
        JniInchiStereo0D instance = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_EVEN);
        assertEquals(INCHI_StereoType.INCHI_StereoType_DoubleBond, instance.getType());
        assertEquals(INCHI_PARITY.INCHI_PARITY_EVEN, instance.getParity());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
        assertEquals(JniInchiAtom.NO_ATOM, instance.getCentralAtom());
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
     * Test of {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
     */
    @Test
    void testCreateNewDoublebondStereo0D() {
        System.out.println("createNewDoublebondStereo0D");
        JniInchiAtom at0 = new JniInchiAtom();
        JniInchiAtom at1 = new JniInchiAtom();
        JniInchiAtom at2 = new JniInchiAtom();
        JniInchiAtom at3 = new JniInchiAtom();
        JniInchiStereo0D instance = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_UNDEFINED);
        assertEquals(INCHI_StereoType.INCHI_StereoType_DoubleBond, instance.getType());
        assertEquals(INCHI_PARITY.INCHI_PARITY_UNDEFINED, instance.getParity());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
        assertEquals(JniInchiAtom.NO_ATOM, instance.getCentralAtom());
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
     * Test of {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method, of class {@link JniInchiStereo0D}.
     */
    @Test
    void testCreateNewDoublebondStereo0D() {
        System.out.println("createNewDoublebondStereo0D");
        JniInchiAtom at0 = new JniInchiAtom();
        JniInchiAtom at1 = new JniInchiAtom();
        JniInchiAtom at2 = new JniInchiAtom();
        JniInchiAtom at3 = new JniInchiAtom();
        JniInchiStereo0D instance = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_NONE);
        assertEquals(INCHI_StereoType.INCHI_StereoType_DoubleBond, instance.getType());
        assertEquals(INCHI_PARITY.INCHI_PARITY_NONE, instance.getParity());
        assertEquals(at0, instance.getNeighbor(0));
        assertEquals(at1, instance.getNeighbor(1));
        assertEquals(at2, instance.getNeighbor(2));
        assertEquals(at3, instance.getNeighbor(3));
        assertEquals(JniInchiAtom.NO_ATOM, instance.getCentralAtom());
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
class JniInchiSter