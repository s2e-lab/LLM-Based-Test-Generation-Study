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
        JniInchiStereo0D expResult = null;
        JniInchiStereo0D result = instance.getStereo0D(0);
        assertEquals(expResult, result);
    }
}

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
        JniInchiBond expResult = null;
        JniInchiBond result = instance.getBond(0);
        assertEquals(expResult, result);
    }
}

// JniInchiStructure_3Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getAtom(int)} method.
*/
class JniInchiStructure_3Test {
		
    /**
     * Test of getAtom method, of class JniInchiStructure.
     */
    @Test
    void testGetAtom() {
        System.out.println("getAtom");
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom expResult = null;
        JniInchiAtom result = instance.getAtom(0);
        assertEquals(expResult, result);
    }
}

// JniInchiStructure_2Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getNumStereo0D()} method.
*/
class JniInchiStructure_2Test {
		
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

// JniInchiStructure_1Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getNumBonds()} method.
*/
class JniInchiStructure_1Test {
		
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

// JniInchiStructure_0Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#getNumAtoms()} method.
*/
class JniInchiStructure_0Test {
		
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

// JniInchiStructure_6Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
*/
class JniInchiStructure_6Test {
		
    /**
     * Test of addStereo0D method, of class JniInchiStructure.
     */
    @Test
    void testAddStereo0D() {
        System.out.println("addStereo0D");
        JniInchiStereo0D stereo = null;
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiStereo0D expResult = null;
        JniInchiStereo0D result = instance.addStereo0D(stereo);
        assertEquals(expResult, result);
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
* It contains ten unit test cases for the {@link JniInchiStructure#addBond(JniInchiBond)} method.
*/
class JniInchiStructure_7Test {
		
    /**
     * Test of addBond method, of class JniInchiStructure.
     */
    @Test
    void testAddBond() {
        System.out.println("addBond");
        JniInchiBond bond = null;
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiBond expResult = null;
        JniInchiBond result = instance.addBond(bond);
        assertEquals(expResult, result);
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
* It contains ten unit test cases for the {@link JniInchiStructure#addAtom(JniInchiAtom)} method.
*/
class JniInchiStructure_8Test {
		
    /**
     * Test of addAtom method, of class JniInchiStructure.
     */
    @Test
    void testAddAtom() {
        System.out.println("addAtom");
        JniInchiAtom atom = null;
        JniInchiStructure instance = new JniInchiStructure();
        JniInchiAtom expResult = null;
        JniInchiAtom result = instance.addAtom(atom);
        assertEquals(expResult, result);
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
		