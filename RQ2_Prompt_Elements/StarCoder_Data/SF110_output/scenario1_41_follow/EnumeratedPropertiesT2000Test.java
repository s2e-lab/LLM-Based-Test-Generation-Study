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

    @Test
    void testGetEnumeratedProperty() {
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");
        properties.setProperty("key3", "value3");
        properties.setProperty("key4", "value4");
        properties.setProperty("key5", "value5");
        properties.setProperty("key6", "value6");
        properties.setProperty("key7", "value7");
        properties.setProperty("key8", "value8");
        properties.setProperty("key9", "value9");
        properties.setProperty("key10", "value10");
        EnumeratedProperties enumeratedProperties = new EnumeratedProperties(properties);
        List<String> values = enumeratedProperties.getEnumeratedProperty("key1");
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key2");
        assertEquals(1, values.size());
        assertEquals("value2", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key3");
        assertEquals(1, values.size());
        assertEquals("value3", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key4");
        assertEquals(1, values.size());
        assertEquals("value4", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key5");
        assertEquals(1, values.size());
        assertEquals("value5", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key6");
        assertEquals(1, values.size());
        assertEquals("value6", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key7");
        assertEquals(1, values.size());
        assertEquals("value7", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key8");
        assertEquals(1, values.size());
        assertEquals("value8", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key9");
        assertEquals(1, values.size());
        assertEquals("value9", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key10");
        assertEquals(1, values.size());
        assertEquals("value10", values.get(0));
    }

    @Test
    void testGetEnumeratedPropertyWithMultipleValues() {
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");
        properties.setProperty("key3", "value3");
        properties.setProperty("key4", "value4");
        properties.setProperty("key5", "value5");
        properties.setProperty("key6", "value6");
        properties.setProperty("key7", "value7");
        properties.setProperty("key8", "value8");
        properties.setProperty("key9", "value9");
        properties.setProperty("key10", "value10");
        properties.setProperty("key11", "value11");
        properties.setProperty("key12", "value12");
        properties.setProperty("key13", "value13");
        properties.setProperty("key14", "value14");
        properties.setProperty("key15", "value15");
        properties.setProperty("key16", "value16");
        properties.setProperty("key17", "value17");
        properties.setProperty("key18", "value18");
        properties.setProperty("key19", "value19");
        properties.setProperty("key20", "value20");
        EnumeratedProperties enumeratedProperties = new EnumeratedProperties(properties);
        List<String> values = enumeratedProperties.getEnumeratedProperty("key1");
        assertEquals(1, values.size());
        assertEquals("value1", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key2");
        assertEquals(1, values.size());
        assertEquals("value2", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key3");
        assertEquals(1, values.size());
        assertEquals("value3", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key4");
        assertEquals(1, values.size());
        assertEquals("value4", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key5");
        assertEquals(1, values.size());
        assertEquals("value5", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key6");
        assertEquals(1, values.size());
        assertEquals("value6", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key7");
        assertEquals(1, values.size());
        assertEquals("value7", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key8");
        assertEquals(1, values.size());
        assertEquals("value8", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key9");
        assertEquals(1, values.size());
        assertEquals("value9", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key10");
        assertEquals(1, values.size());
        assertEquals("value10", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key11");
        assertEquals(1, values.size());
        assertEquals("value11", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key12");
        assertEquals(1, values.size());
        assertEquals("value12", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key13");
        assertEquals(1, values.size());
        assertEquals("value13", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key14");
        assertEquals(1, values.size());
        assertEquals("value14", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key15");
        assertEquals(1, values.size());
        assertEquals("value15", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key16");
        assertEquals(1, values.size());
        assertEquals("value16", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key17");
        assertEquals(1, values.size());
        assertEquals("value17", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key18");
        assertEquals(1, values.size());
        assertEquals("value18", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key19");
        assertEquals(1, values.size());
        assertEquals("value19", values.get(0));
        values = enumeratedProperties.getEnumeratedProperty("key20");
        assertEquals(1, values.size());
        assertEquals("value20", values.get(0));
    }

    @Test
    void testGetEnumeratedPropertyWithMultipleEnumeratedValues() {
        Properties properties = new Properties();
        properties.setProperty("key1", "value1");
        properties.setProperty("key2", "value2");
        properties.setProperty("key3", "value3");
        properties.setProperty("key4", "value4");
        properties.setProperty("key5", "value5");
        properties.setProperty("key6", "value6");
        properties.setProperty("key7", "value7");
        properties.setProperty("key8", "value8");
        properties.setProperty("key9", "value9");
        properties.setProperty("key10", "value10");
        properties.setProperty("key11", "value11");
        properties.setProperty("key12", "value12");
        properties.setProperty("key13", "value13");
        properties.setProperty("key14", "value14");
        properties.setProperty("key15", "value15");
        properties.setProperty("key16", "value16");
        properties.setProperty("key17", "value17");
        properties.setProperty("key18", "value18");
        properties.setProperty("key19", "value19");
        properties.setProperty("key20", "value20");
        properties.setProperty("key21", "value21");
        properties.setProperty("key22", "value22");
        properties.setProperty("key23", "value23");
        properties.setProperty("key24", "value24");
        properties.setProperty("key25", "value25");
        properties.setProperty("key26", "value26");
        properties.setProperty("key27", "value27");
        properties.setProperty("key28", "value28");
        properties.setProperty("key29", "value29");
        properties.setProperty("key30", "value30");
        EnumeratedProperties enumerated