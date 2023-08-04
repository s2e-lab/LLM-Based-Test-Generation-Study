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
        JniInchiAtom atom1 = new JniInchiAtom();
        JniInchiAtom atom2 = new JniInchiAtom();
        JniInchiBond bond = new JniInchiBond(atom1, atom2);
        instance.addAtom(atom1);
        instance.addAtom(atom2);
        instance.addBond(bond);
        int i = 0;
        JniInchiBond result = instance.getBond(i);
        assertEquals(bond, result);
    }
}
