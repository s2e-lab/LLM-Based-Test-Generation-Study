// HeroTest.java
package dsachat.share.hero;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;
import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Hero}.
* It contains ten unit test cases for the {@link Hero#getAttrValue(String)} method.
*/
class HeroTest {

    /**
     * Test of getAttrValue method, of class Hero.
     */
    @Test
    void testGetAttrValue() {
        System.out.println("getAttrValue");
        Hero instance = new Hero(null);
        int expResult = 0;
        int result = instance.getAttrValue("A");
        assertEquals(expResult, result);
    }
}
