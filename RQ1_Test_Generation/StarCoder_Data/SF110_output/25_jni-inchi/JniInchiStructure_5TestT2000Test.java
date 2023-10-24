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
