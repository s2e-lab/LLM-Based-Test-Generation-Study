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
        List<JniInchiBond> expResult = new ArrayList<JniInchiBond>();
        JniInchiBond result = instance.getBond(0);
        expResult.add(result);
        assertEquals(expResult, instance.getBonds());
    }
}
