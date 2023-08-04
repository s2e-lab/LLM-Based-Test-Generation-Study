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

    /**
     * Test of {@link JniInchiStructure#addAtom(JniInchiAtom)} method, of class {@link JniInchiStructure}.
     */
    @Test
    void testAddAtom() {
        System.out.println("addAtom");
        JniInchiAtom atom = new JniInchiAtom();
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom expResult = atom;
        JniInchiAtom result = instance.addAtom(atom);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JniInchiStructure#addAtom(JniInchiAtom)} method, of class {@link JniInchiStructure}.
     */
    @Test
    void testAddAtom_0args() {
        System.out.println("addAtom");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom expResult = new JniInchiAtom();
        JniInchiAtom result = instance.addAtom();
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JniInchiStructure#addAtom(JniInchiAtom)} method, of class {@link JniInchiStructure}.
     */
    @Test
    void testAddAtom_3args() {
        System.out.println("addAtom");
        int atomicNumber = 0;
        int isotopeNumber = 0;
        int charge = 0;
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom expResult = new JniInchiAtom(atomicNumber, isotopeNumber, charge);
        JniInchiAtom result = instance.addAtom(atomicNumber, isotopeNumber, charge);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JniInchiStructure#addAtom(JniInchiAtom)} method, of class {@link JniInchiStructure}.
     */
    @Test
    void testAddAtom_4args() {
        System.out.println("addAtom");
        int atomicNumber = 0;
        int isotopeNumber = 0;
        int charge = 0;
        int radical = 0;
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom expResult = new JniInchiAtom(atomicNumber, isotopeNumber, charge, radical);
        JniInchiAtom result = instance.addAtom(atomicNumber, isotopeNumber, charge, radical);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JniInchiStructure#addAtom(JniInchiAtom)} method, of class {@link JniInchiStructure}.
     */
    @Test
    void testAddAtom_5args() {
        System.out.println("addAtom");
        int atomicNumber = 0;
        int isotopeNumber = 0;
        int charge = 0;
        int radical = 0;
        int valence = 0;
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom expResult = new JniInchiAtom(atomicNumber, isotopeNumber, charge, radical, valence);
        JniInchiAtom result = instance.addAtom(atomicNumber, isotopeNumber, charge, radical, valence);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JniInchiStructure#addAtom(JniInchiAtom)} method, of class {@link JniInchiStructure}.
     */
    @Test
    void testAddAtom_6args() {
        System.out.println("addAtom");
        int atomicNumber = 0;
        int isotopeNumber = 0;
        int charge = 0;
        int radical = 0;
        int valence = 0;
        int h0designator = 0;
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom expResult = new JniInchiAtom(atomicNumber, isotopeNumber, charge, radical, valence, h0designator);
        JniInchiAtom result = instance.addAtom(atomicNumber, isotopeNumber, charge, radical, valence, h0designator);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JniInchiStructure#addAtom(JniInchiAtom)} method, of class {@link JniInchiStructure}.
     */
    @Test
    void testAddAtom_7args() {
        System.out.println("addAtom");
        int atomicNumber = 0;
        int isotopeNumber = 0;
        int charge = 0;
        int radical = 0;
        int valence = 0;
        int h0designator = 0;
        int num_iso_H = 0;
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom expResult = new JniInchiAtom(atomicNumber, isotopeNumber, charge, radical, valence, h0designator, num_iso_H);
        JniInchiAtom result = instance.addAtom(atomicNumber, isotopeNumber, charge, radical, valence, h0designator, num_iso_H);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JniInchiStructure#addAtom(JniInchiAtom)} method, of class {@link JniInchiStructure}.
     */
    @Test
    void testAddAtom_8args() {
        System.out.println("addAtom");
        int atomicNumber = 0;
        int isotopeNumber = 0;
        int charge = 0;
        int radical = 0;
        int valence = 0;
        int h0designator = 0;
        int num_iso_H = 0;
        int num_H = 0;
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom expResult = new JniInchiAtom(atomicNumber, isotopeNumber, charge, radical, valence, h0designator, num_iso_H, num_H);
        JniInchiAtom result = instance.addAtom(atomicNumber, isotopeNumber, charge, radical, valence, h0designator, num_iso_H, num_H);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JniInchiStructure#addAtom(JniInchiAtom)} method, of class {@link JniInchiStructure}.
     */
    @Test
    void testAddAtom_9args() {
        System.out.println("addAtom");
        int atomicNumber = 0;
        int isotopeNumber = 0;
        int charge = 0;
        int radical = 0;
        int valence = 0;
        int h0designator = 0;
        int num_iso_H = 0;
        int num_H = 0;
        int num_iso_H_fixed = 0;
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom expResult = new JniInchiAtom(atomicNumber, isotopeNumber, charge, radical, valence, h0designator, num_iso_H, num_H, num_iso_H_fixed);
        JniInchiAtom result = instance.addAtom(atomicNumber, isotopeNumber, charge, radical, valence, h0designator, num_iso_H, num_H, num_iso_H_fixed);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link JniInchiStructure#addAtom(JniInchiAtom)} method, of class {@link JniInchiStructure}.
     */
    @Test
    void testAddAtom_10args() {
        System.out.println("addAtom");
        int atomicNumber = 0;
        int isotopeNumber = 0;
        int charge = 0;
        int radical = 0;
        int valence = 0;
        int h0designator = 0;
        int num_iso_H = 0;
        int num_H = 0;
        int num_iso_H_fixed = 0;
        int num_H_fixed = 0;
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom expResult = new JniInchiAtom(atomicNumber, isotopeNumber, charge, radical, valence, h0designator, num_iso_H, num_H, num_iso_H_fixed, num_H_fixed);
        JniInchiAtom result = instance.addAtom(atomicNumber, isotopeNumber, charge, radical, valence, h0designator, num_iso_H, num_H, num_iso_H_fixed, num_H_fixed);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link