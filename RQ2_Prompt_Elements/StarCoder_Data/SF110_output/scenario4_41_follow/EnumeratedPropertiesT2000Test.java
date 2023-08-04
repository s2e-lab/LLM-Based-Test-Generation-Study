// EnumeratedPropertiesTest.java
package ghm.follow.config;

import java.util.ArrayList;
import java.util.List;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EnumeratedProperties}.
* It contains ten unit test cases for the {@link EnumeratedProperties#getEnumeratedProperty(String)} method.
*/
class EnumeratedPropertiesTest {

    /**
     * Test method for {@link EnumeratedProperties#getEnumeratedProperty(String)}.
     */
    @Test
    void testGetEnumeratedProperty() {
        EnumeratedProperties ep = new EnumeratedProperties();
        ep.setEnumeratedProperty("a", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0", new ArrayList<String>());
        ep.setEnumeratedProperty("a.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0.0