// DiscriminatorTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Discriminator}.
* It contains ten unit test cases for the {@link Discriminator#getTypeDesc()} method.
*/
class DiscriminatorTest {

    /**
    * Test case for the {@link Discriminator#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        Discriminator discriminator = new Discriminator();
        org.apache.axis.description.TypeDesc typeDesc = discriminator.getTypeDesc();
        assertNotNull(typeDesc);
    }
}
