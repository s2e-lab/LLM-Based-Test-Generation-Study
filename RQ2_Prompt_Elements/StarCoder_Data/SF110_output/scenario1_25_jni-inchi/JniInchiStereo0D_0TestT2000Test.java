// JniInchiStereo0D_0Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_0Test {

    @Test
    void testCreateNewTetrahedralStereo0D() {
        JniInchiAtom atC = JniInchiAtom.createAtom("C");
        JniInchiAtom at0 = JniInchiAtom.createAtom("C");
        JniInchiAtom at1 = JniInchiAtom.createAtom("C");
        JniInchiAtom at2 = JniInchiAtom.createAtom("C");
        JniInchiAtom at3 = JniInchiAtom.createAtom("C");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_1);
        assertEquals(stereo.getAtC(), atC);
        assertEquals(stereo.getAt0(), at0);
        assertEquals(stereo.getAt1(), at1);
        assertEquals(stereo.getAt2(), at2);
        assertEquals(stereo.getAt3(), at3);
        assertEquals(stereo.getType(), INCHI_STEREOTYPE.TETRAHEDRAL);
        assertEquals(stereo.getParity(), INCHI_PARITY.INCHI_PARITY_1);
    }
}

// JniInchiStereo0D_1Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_1Test {
		
    @Test
    void testCreateNewTetrahedralStereo0D() {
        JniInchiAtom atC = JniInchiAtom.createAtom("C");
        JniInchiAtom at0 = JniInchiAtom.createAtom("C");
        JniInchiAtom at1 = JniInchiAtom.createAtom("C");
        JniInchiAtom at2 = JniInchiAtom.createAtom("C");
        JniInchiAtom at3 = JniInchiAtom.createAtom("C");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_2);
        assertEquals(stereo.getAtC(), atC);
        assertEquals(stereo.getAt0(), at0);
        assertEquals(stereo.getAt1(), at1);
        assertEquals(stereo.getAt2(), at2);
        assertEquals(stereo.getAt3(), at3);
        assertEquals(stereo.getType(), INCHI_STEREOTYPE.TETRAHEDRAL);
        assertEquals(stereo.getParity(), INCHI_PARITY.INCHI_PARITY_2);
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
		
    @Test
    void testCreateNewTetrahedralStereo0D() {
        JniInchiAtom atC = JniInchiAtom.createAtom("C");
        JniInchiAtom at0 = JniInchiAtom.createAtom("C");
        JniInchiAtom at1 = JniInchiAtom.createAtom("C");
        JniInchiAtom at2 = JniInchiAtom.createAtom("C");
        JniInchiAtom at3 = JniInchiAtom.createAtom("C");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_UNDEFINED);
        assertEquals(stereo.getAtC(), atC);
        assertEquals(stereo.getAt0(), at0);
        assertEquals(stereo.getAt1(), at1);
        assertEquals(stereo.getAt2(), at2);
        assertEquals(stereo.getAt3(), at3);
        assertEquals(stereo.getType(), INCHI_STEREOTYPE.TETRAHEDRAL);
        assertEquals(stereo.getParity(), INCHI_PARITY.INCHI_PARITY_UNDEFINED);
    }
}

// JniInchiStereo0D_3Test.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0D_3Test {
		
    @Test
    void testCreateNewTetrahedralStereo0D() {
        JniInchiAtom atC = JniInchiAtom.createAtom("C");
        JniInchiAtom at0 = JniInchiAtom.createAtom("C");
        JniInchiAtom at1 = JniInchiAtom.createAtom("C");
        JniInchiAtom at2 = JniInchiAtom.createAtom("C");
        JniInchiAtom at3 = JniInchiAtom.createAtom("C");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.INCHI_PARITY_NONE);
        assertEquals(stereo.getAtC(), atC);
        assertEquals(stereo.getAt0(), at0);
        assertEquals(stereo.getAt1(), at1);
        assertEquals(stereo.getAt2(), at2);
        assertEquals(stereo.getAt3(), at3);
        assertEquals(stereo.getType(), INCHI_STEREOTYPE.TETRAHEDRAL);
        assertEquals(stereo.getParity(), INCHI_PARITY.INCHI_PARITY_NONE);
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
		
    @Test
    void testCreateNewTetrahedralStereo0D() {
        JniInchiAtom atC = JniInchiAtom.createAtom("C");
        JniInchiAtom at0 = JniInchiAtom.createAtom("C");
        JniInchiAtom at1 = JniInchiAtom.createAtom("C");
        JniInchiAtom at2 = JniInchiAtom.createAtom("C");
        JniInchiAtom at3 = JniInchiAtom.createAtom("C");
        JniInchiStereo0D stereo = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, INCHI_PARITY.INCHI_PAR