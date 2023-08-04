// JniInchiStructure_1Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addBond(JniInchiBond)} method.
*/
class JniInchiStructure_1Test {

    /**
    * Test of {@link JniInchiStructure#addBond(JniInchiBond)} method, of class {@link JniInchiStructure}.
    */
    @Test
    void testAddBond() {
        System.out.println("addBond");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond();
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        bond.setAtoms(atom1, atom2);
        instance.addBond(bond);
        assertEquals(1, instance.getNumBonds());
    }

    /**
    * Test of {@link JniInchiStructure#addBond(JniInchiBond)} method, of class {@link JniInchiStructure}.
    */
    @Test
    void testAddBond_1() {
        System.out.println("addBond");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond();
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        bond.setAtoms(atom1, atom2);
        instance.addBond(bond);
        assertEquals(1, instance.getNumBonds());
        JniInchiBond bond2 = new JniInchiBond();
        JniInchiAtom atom3 = new JniInchiAtom();
        JniInchiAtom atom4 = new JniInchiAtom();
        bond2.setAtoms(atom3, atom4);
        instance.addBond(bond2);
        assertEquals(2, instance.getNumBonds());
    }

    /**
    * Test of {@link JniInchiStructure#addBond(JniInchiBond)} method, of class {@link JniInchiStructure}.
    */
    @Test
    void testAddBond_2() {
        System.out.println("addBond");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond();
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        bond.setAtoms(atom1, atom2);
        instance.addBond(bond);
        assertEquals(1, instance.getNumBonds());
        JniInchiBond bond2 = new JniInchiBond();
        JniInchiAtom atom3 = new JniInchiAtom();
        JniInchiAtom atom4 = new JniInchiAtom();
        bond2.setAtoms(atom3, atom4);
        instance.addBond(bond2);
        assertEquals(2, instance.getNumBonds());
        JniInchiBond bond3 = new JniInchiBond();
        JniInchiAtom atom5 = new JniInchiAtom();
        JniInchiAtom atom6 = new JniInchiAtom();
        bond3.setAtoms(atom5, atom6);
        instance.addBond(bond3);
        assertEquals(3, instance.getNumBonds());
    }

    /**
    * Test of {@link JniInchiStructure#addBond(JniInchiBond)} method, of class {@link JniInchiStructure}.
    */
    @Test
    void testAddBond_3() {
        System.out.println("addBond");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond();
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        bond.setAtoms(atom1, atom2);
        instance.addBond(bond);
        assertEquals(1, instance.getNumBonds());
        JniInchiBond bond2 = new JniInchiBond();
        JniInchiAtom atom3 = new JniInchiAtom();
        JniInchiAtom atom4 = new JniInchiAtom();
        bond2.setAtoms(atom3, atom4);
        instance.addBond(bond2);
        assertEquals(2, instance.getNumBonds());
        JniInchiBond bond3 = new JniInchiBond();
        JniInchiAtom atom5 = new JniInchiAtom();
        JniInchiAtom atom6 = new JniInchiAtom();
        bond3.setAtoms(atom5, atom6);
        instance.addBond(bond3);
        assertEquals(3, instance.getNumBonds());
        JniInchiBond bond4 = new JniInchiBond();
        JniInchiAtom atom7 = new JniInchiAtom();
        JniInchiAtom atom8 = new JniInchiAtom();
        bond4.setAtoms(atom7, atom8);
        instance.addBond(bond4);
        assertEquals(4, instance.getNumBonds());
    }

    /**
    * Test of {@link JniInchiStructure#addBond(JniInchiBond)} method, of class {@link JniInchiStructure}.
    */
    @Test
    void testAddBond_4() {
        System.out.println("addBond");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond();
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        bond.setAtoms(atom1, atom2);
        instance.addBond(bond);
        assertEquals(1, instance.getNumBonds());
        JniInchiBond bond2 = new JniInchiBond();
        JniInchiAtom atom3 = new JniInchiAtom();
        JniInchiAtom atom4 = new JniInchiAtom();
        bond2.setAtoms(atom3, atom4);
        instance.addBond(bond2);
        assertEquals(2, instance.getNumBonds());
        JniInchiBond bond3 = new JniInchiBond();
        JniInchiAtom atom5 = new JniInchiAtom();
        JniInchiAtom atom6 = new JniInchiAtom();
        bond3.setAtoms(atom5, atom6);
        instance.addBond(bond3);
        assertEquals(3, instance.getNumBonds());
        JniInchiBond bond4 = new JniInchiBond();
        JniInchiAtom atom7 = new JniInchiAtom();
        JniInchiAtom atom8 = new JniInchiAtom();
        bond4.setAtoms(atom7, atom8);
        instance.addBond(bond4);
        assertEquals(4, instance.getNumBonds());
        JniInchiBond bond5 = new JniInchiBond();
        JniInchiAtom atom9 = new JniInchiAtom();
        JniInchiAtom atom10 = new JniInchiAtom();
        bond5.setAtoms(atom9, atom10);
        instance.addBond(bond5);
        assertEquals(5, instance.getNumBonds());
    }

    /**
    * Test of {@link JniInchiStructure#addBond(JniInchiBond)} method, of class {@link JniInchiStructure}.
    */
    @Test
    void testAddBond_5() {
        System.out.println("addBond");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond();
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        bond.setAtoms(atom1, atom2);
        instance.addBond(bond);
        assertEquals(1, instance.getNumBonds());
        JniInchiBond bond2 = new JniInchiBond();
        JniInchiAtom atom3 = new JniInchiAtom();
        JniInchiAtom atom4 = new JniInchiAtom();
        bond2.setAtoms(atom3, atom4);
        instance.addBond(bond2);
        assertEquals(2, instance.getNumBonds());
        JniInchiBond bond3 = new JniInchiBond();
        JniInchiAtom atom5 = new JniInchiAtom();
        JniInchiAtom atom6 = new JniInchiAtom();
        bond3.setAtoms(atom5, atom6);
        instance.addBond(bond3);
        assertEquals(3, instance.getNumBonds());
        JniInchiBond bond4 = new JniInchiBond();
        JniInchiAtom atom7 = new JniInchiAtom();
        JniInchiAtom atom8 = new JniInchiAtom();
        bond4.setAtoms(atom7, atom8);
       