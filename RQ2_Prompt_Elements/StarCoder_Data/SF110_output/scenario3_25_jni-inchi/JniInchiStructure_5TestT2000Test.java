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
        List<JniInchiStereo0D> result = new ArrayList<JniInchiStereo0D>();
        for (int i = 0; i < 5; i++) {
            result.add(instance.getStereo0D(i));
        }
        assertEquals(5, result.size());
        for (int i = 0; i < 5; i++) {
            assertEquals(i, result.get(i).getIndex());
        }
    }
}
