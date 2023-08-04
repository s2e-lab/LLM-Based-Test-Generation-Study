// JniInchiStructure_0Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
*/
class JniInchiStructure_0Test {

    @Test
    void test_001() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom = new JniInchiAtom();
        atom.setAtomicNumber(1);
        atom.setCharge(0);
        atom.setRadical(0);
        atom.setX(0.0);
        atom.setY(0.0);
        atom.setZ(0.0);
        structure.addAtom(atom);
        assertEquals(1, structure.getAtomCount());
    }

    @Test
    void test_002() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom = new JniInchiAtom();
        atom.setAtomicNumber(1);
        atom.setCharge(0);
        atom.setRadical(0);
        atom.setX(0.0);
        atom.setY(0.0);
        atom.setZ(0.0);
        structure.addAtom(atom);
        JniInchiAtom atom2 = new JniInchiAtom();
        atom2.setAtomicNumber(1);
        atom2.setCharge(0);
        atom2.setRadical(0);
        atom2.setX(0.0);
        atom2.setY(0.0);
        atom2.setZ(0.0);
        structure.addAtom(atom2);
        assertEquals(2, structure.getAtomCount());
    }

    @Test
    void test_003() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom = new JniInchiAtom();
        atom.setAtomicNumber(1);
        atom.setCharge(0);
        atom.setRadical(0);
        atom.setX(0.0);
        atom.setY(0.0);
        atom.setZ(0.0);
        structure.addAtom(atom);
        JniInchiAtom atom2 = new JniInchiAtom();
        atom2.setAtomicNumber(1);
        atom2.setCharge(0);
        atom2.setRadical(0);
        atom2.setX(0.0);
        atom2.setY(0.0);
        atom2.setZ(0.0);
        structure.addAtom(atom2);
        JniInchiAtom atom3 = new JniInchiAtom();
        atom3.setAtomicNumber(1);
        atom3.setCharge(0);
        atom3.setRadical(0);
        atom3.setX(0.0);
        atom3.setY(0.0);
        atom3.setZ(0.0);
        structure.addAtom(atom3);
        assertEquals(3, structure.getAtomCount());
    }

    @Test
    void test_004() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom = new JniInchiAtom();
        atom.setAtomicNumber(1);
        atom.setCharge(0);
        atom.setRadical(0);
        atom.setX(0.0);
        atom.setY(0.0);
        atom.setZ(0.0);
        structure.addAtom(atom);
        JniInchiAtom atom2 = new JniInchiAtom();
        atom2.setAtomicNumber(1);
        atom2.setCharge(0);
        atom2.setRadical(0);
        atom2.setX(0.0);
        atom2.setY(0.0);
        atom2.setZ(0.0);
        structure.addAtom(atom2);
        JniInchiAtom atom3 = new JniInchiAtom();
        atom3.setAtomicNumber(1);
        atom3.setCharge(0);
        atom3.setRadical(0);
        atom3.setX(0.0);
        atom3.setY(0.0);
        atom3.setZ(0.0);
        structure.addAtom(atom3);
        JniInchiAtom atom4 = new JniInchiAtom();
        atom4.setAtomicNumber(1);
        atom4.setCharge(0);
        atom4.setRadical(0);
        atom4.setX(0.0);
        atom4.setY(0.0);
        atom4.setZ(0.0);
        structure.addAtom(atom4);
        assertEquals(4, structure.getAtomCount());
    }

    @Test
    void test_005() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom = new JniInchiAtom();
        atom.setAtomicNumber(1);
        atom.setCharge(0);
        atom.setRadical(0);
        atom.setX(0.0);
        atom.setY(0.0);
        atom.setZ(0.0);
        structure.addAtom(atom);
        JniInchiAtom atom2 = new JniInchiAtom();
        atom2.setAtomicNumber(1);
        atom2.setCharge(0);
        atom2.setRadical(0);
        atom2.setX(0.0);
        atom2.setY(0.0);
        atom2.setZ(0.0);
        structure.addAtom(atom2);
        JniInchiAtom atom3 = new JniInchiAtom();
        atom3.setAtomicNumber(1);
        atom3.setCharge(0);
        atom3.setRadical(0);
        atom3.setX(0.0);
        atom3.setY(0.0);
        atom3.setZ(0.0);
        structure.addAtom(atom3);
        JniInchiAtom atom4 = new JniInchiAtom();
        atom4.setAtomicNumber(1);
        atom4.setCharge(0);
        atom4.setRadical(0);
        atom4.setX(0.0);
        atom4.setY(0.0);
        atom4.setZ(0.0);
        structure.addAtom(atom4);
        JniInchiAtom atom5 = new JniInchiAtom();
        atom5.setAtomicNumber(1);
        atom5.setCharge(0);
        atom5.setRadical(0);
        atom5.setX(0.0);
        atom5.setY(0.0);
        atom5.setZ(0.0);
        structure.addAtom(atom5);
        assertEquals(5, structure.getAtomCount());
    }

    @Test
    void test_006() {
        JniInchiStructure structure = new JniInchiStructure();
        JniInchiAtom atom = new JniInchiAtom();
        atom.setAtomicNumber(1);
        atom.setCharge(0);
        atom.setRadical(0);
        atom.setX(0.0);
        atom.setY(0.0);
        atom.setZ(0.0);
        structure.addAtom(atom);
        JniInchiAtom atom2 = new JniInchiAtom();
        atom2.setAtomicNumber(1);
        atom2.setCharge(0);
        atom2.setRadical(0);
        atom2.setX(0.0);
        atom2.setY(0.0);
        atom2.setZ(0.0);
        structure.addAtom(atom2);
        JniInchiAtom atom3 = new JniInchiAtom();
        atom3.setAtomicNumber(1);
        atom3.setCharge(0);
        atom3.setRadical(0);
        atom3.setX(0.0);
        atom3.setY(0.0);
        atom3.setZ(0.0);
        structure.addAtom(atom3);
        JniInchiAtom atom4 = new JniInchiAtom();
        atom4.setAtomicNumber(1);
        atom4.setCharge(0);
        atom4.setRadical(0);
        atom4.setX(0.0);
        atom4.setY(0.0);
        atom4.setZ(0.0);
        structure.addAtom(atom4);
        JniInchiAtom atom5 = new JniInchiAtom();
        atom5.setAtomicNumber(1);
        atom5.setCharge(0);
        atom5.setRadical(0);
        atom5.setX(0.0);
        atom5.setY(0.0);
        atom5.setZ(0.0);
        structure.addAtom(atom5);
        JniInchiAtom atom6 = new JniInchiAtom();
        atom6.setAtomicNumber(1);
        atom6.setCharge(0);
        atom6.setRadical(0);
        atom6.setX(0.0);
        atom6.setY(0.0);
        atom6.setZ(0.0);
        structure.