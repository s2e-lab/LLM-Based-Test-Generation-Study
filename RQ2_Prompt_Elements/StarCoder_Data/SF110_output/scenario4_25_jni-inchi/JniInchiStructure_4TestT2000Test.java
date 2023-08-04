// JniInchiStructure_4Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getBond(int)} method.
*/
class JniInchiStructure_4Test {

    /**
     * Test of getBond method, of class JniInchiStructure.
     */
    @Test
    void testGetBond() {
        System.out.println("getBond");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiBond bond = new JniInchiBond();
        instance.addBond(bond);
        JniInchiBond result = instance.getBond(0);
        assertEquals(bond, result);
    }
}

// JniInchiStructure_5Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getStereo0D(int)} method.
*/
class JniInchiStructure_5Test {
		
    /**
     * Test of getStereo0D method, of class JniInchiStructure.
     */
    @Test
    void testGetStereo0D() {
        System.out.println("getStereo0D");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiStereo0D stereo = new JniInchiStereo0D();
        instance.addStereo0D(stereo);
        JniInchiStereo0D result = instance.getStereo0D(0);
        assertEquals(stereo, result);
    }
}

// JniInchiStructure_6Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructure_6Test {
		
    /**
     * Test of getAtom method, of class JniInchiStructure.
     */
    @Test
    void testGetAtom() {
        System.out.println("getAtom");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom atom = new JniInchiAtom();
        instance.addAtom(atom);
        JniInchiAtom result = instance.getAtom(0);
        assertEquals(atom, result);
    }
}

// JniInchiStructure_7Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getStereo0DIndex(JniInchiStereo0D)} method.
*/
class JniInchiStructure_7Test {
		
    /**
     * Test of getStereo0DIndex method, of class JniInchiStructure.
     */
    @Test
    void testGetStereo0DIndex() {
        System.out.println("getStereo0DIndex");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiStereo0D stereo = new JniInchiStereo0D();
        instance.addStereo0D(stereo);
        int result = instance.getStereo0DIndex(stereo);
        assertEquals(0, result);
    }
}

// JniInchiStructure_8Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getAtomIndex(JniInchiAtom)} method.
*/
class JniInchiStructure_8Test {
		
    /**
     * Test of getAtomIndex method, of class JniInchiStructure.
     */
    @Test
    void testGetAtomIndex() {
        System.out.println("getAtomIndex");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom atom = new JniInchiAtom();
        instance.addAtom(atom);
        int result = instance.getAtomIndex(atom);
        assertEquals(0, result);
    }
}

// JniInchiStructure_9Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#setStructure(JniInchiStructure)} method.
*/
class JniInchiStructure_9Test {
		
    /**
     * Test of setStructure method, of class JniInchiStructure.
     */
    @Test
    void testSetStructure() {
        System.out.println("setStructure");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiStructure structure = new JniInchiStructure();
        instance.setStructure(structure);
    }
}

// JniInchiStructure_10Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getNumAtoms()} method.
*/
class JniInchiStructure_10Test {
		
    /**
     * Test of getNumAtoms method, of class JniInchiStructure.
     */
    @Test
    void testGetNumAtoms() {
        System.out.println("getNumAtoms");
        JniInchiStructure instance = new JniInchiStructure();
        int expResult = 0;
        int result = instance.getNumAtoms();
        assertEquals(expResult, result);
    }
}

// JniInchiStructure_11Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getNumBonds()} method.
*/
class JniInchiStructure_11Test {
		
    /**
     * Test of getNumBonds method, of class JniInchiStructure.
     */
    @Test
    void testGetNumBonds() {
        System.out.println("getNumBonds");
        JniInchiStructure instance = new JniInchiStructure();
        int expResult = 0;
        int result = instance.getNumBonds();
        assertEquals(expResult, result);
    }
}

// JniInchiStructure_12Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getNumStereo0D()} method.
*/
class JniInchiStructure_12Test {
		
    /**
     * Test of getNumStereo0D method, of class JniInchiStructure.
     */
    @Test
    void testGetNumStereo0D() {
        System.out.println("getNumStereo0D");
        JniInchiStructure instance = new JniInchiStructure();
        int expResult = 0;
        int result = instance.getNumStereo0D();
        assertEquals(expResult, result);
    }
}

// JniInchiStructure_13Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link