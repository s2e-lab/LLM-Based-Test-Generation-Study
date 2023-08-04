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
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is not set.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyNotSet() {
        EnumeratedProperties properties = new EnumeratedProperties();
        List<String> values = properties.getEnumeratedProperty("key");
        assertTrue(values.isEmpty());
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToSingleValue() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value");
        List<String> values = properties.getEnumeratedProperty("key");
        assertEquals(1, values.size());
        assertEquals("value", values.get(0));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to multiple values.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleValues() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1");
        properties.setProperty("key", "value2");
        List<String> values = properties.getEnumeratedProperty("key");
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to multiple values, some of which are empty.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleValuesWithEmptyValues() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1");
        properties.setProperty("key", "");
        properties.setProperty("key", "value2");
        List<String> values = properties.getEnumeratedProperty("key");
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to multiple values, some of which are empty.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleValuesWithEmptyValuesAndDelimiter() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1");
        properties.setProperty("key", "");
        properties.setProperty("key", "value2");
        properties.setProperty("key", "");
        List<String> values = properties.getEnumeratedProperty("key");
        assertEquals(2, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to multiple values, some of which are empty.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleValuesWithEmptyValuesAndDelimiterAndNonEmptyValues() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1");
        properties.setProperty("key", "");
        properties.setProperty("key", "value2");
        properties.setProperty("key", "");
        properties.setProperty("key", "value3");
        List<String> values = properties.getEnumeratedProperty("key");
        assertEquals(3, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
        assertEquals("value3", values.get(2));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to multiple values, some of which are empty.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleValuesWithEmptyValuesAndDelimiterAndNonEmptyValuesAndNonEmptyValues() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1");
        properties.setProperty("key", "");
        properties.setProperty("key", "value2");
        properties.setProperty("key", "");
        properties.setProperty("key", "value3");
        properties.setProperty("key", "value4");
        List<String> values = properties.getEnumeratedProperty("key");
        assertEquals(4, values.size());
        assertEquals("value1", values.get(0));
        assertEquals("value2", values.get(1));
        assertEquals("value3", values.get(2));
        assertEquals("value4", values.get(3));
    }
}
