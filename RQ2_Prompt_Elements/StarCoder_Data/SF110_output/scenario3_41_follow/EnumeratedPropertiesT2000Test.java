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
        List<String> expected = new ArrayList<>();
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToSingleString() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value");
        List<String> expected = new ArrayList<>();
        expected.add("value");
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleString() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1,value2,value3");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleStringWithSpaces() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1, value2, value3");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleStringWithSpacesAndTabs() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1, value2, value3");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleStringWithSpacesAndTabsAndNewlines() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1, value2, value3");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleStringWithSpacesAndTabsAndNewlinesAndCommas() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1, value2, value3");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleStringWithSpacesAndTabsAndNewlinesAndCommasAndSemicolons() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1, value2, value3");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleStringWithSpacesAndTabsAndNewlinesAndCommasAndSemicolonsAndColons() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1, value2, value3");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleStringWithSpacesAndTabsAndNewlinesAndCommasAndSemicolonsAndColonsAndBrackets() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1, value2, value3");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleStringWithSpacesAndTabsAndNewlinesAndCommasAndSemicolonsAndColonsAndBracketsAndBraces() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1, value2, value3");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleStringWithSpacesAndTabsAndNewlinesAndCommasAndSemicolonsAndColonsAndBracketsAndBracesAndParens() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1, value2, value3");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleStringWithSpacesAndTabsAndNewlinesAndCommasAndSemicolonsAndColonsAndBracketsAndBracesAndParensAndBrackets() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1, value2, value3");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleStringWithSpacesAndTabsAndNewlinesAndCommasAndSemicolonsAndColonsAndBracketsAndBracesAndParensAndBracketsAndBraces() {
        EnumeratedProperties properties = new EnumeratedProperties();
        properties.setProperty("key", "value1, value2, value3");
        List<String> expected = new ArrayList<>();
        expected.add("value1");
        expected.add("value2");
        expected.add("value3");
        assertEquals(expected, properties.getEnumeratedProperty("key"));
    }

    /**
     * Test case for {@link EnumeratedProperties#getEnumeratedProperty(String)}
     * when the property is set to a single String value.
     */
    @Test
    void testGetEnumeratedPropertyWhenPropertyIsSetToMultipleStringWithSpacesAndTabsAndNewlinesAndCommasAndSemicolons