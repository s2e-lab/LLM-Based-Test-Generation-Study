// FieldInfoTest2.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isValidValue(String)} method.
*/
class FieldInfoTest2 {

		/**
		 * Test case for {@link FieldInfo#isValidValue(String)} method.
		 * It tests the case when the validValues map is null.
		 */
		@Test
		void testIsValidValue_1() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setValidValues(null);
				assertFalse(fieldInfo.isValidValue(""));
		}
		
		/**
		 * Test case for {@link FieldInfo#isValidValue(String)} method.
		 * It tests the case when the validValues map is empty.
		 */
		@Test
		void testIsValidValue_2() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
				assertFalse(fieldInfo.isValidValue(""));
		}
		
		/**
		 * Test case for {@link FieldInfo#isValidValue(String)} method.
		 * It tests the case when the validValues map contains one value.
		 */
		@Test
		void testIsValidValue_3() {
				FieldInfo fieldInfo = new FieldInfo();
				TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
				validValues.put("1", new ValueInfo());
				fieldInfo.setValidValues(validValues);
				assertTrue(fieldInfo.isValidValue("1"));
		}
		
		/**
		 * Test case for {@link FieldInfo#isValidValue(String)} method.
		 * It tests the case when the validValues map contains two values.
		 */
		@Test
		void testIsValidValue_4() {
				FieldInfo fieldInfo = new FieldInfo();
				TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
				validValues.put("1", new ValueInfo());
				validValues.put("2", new ValueInfo());
				fieldInfo.setValidValues(validValues);
				assertTrue(fieldInfo.isValidValue("1"));
				assertTrue(fieldInfo.isValidValue("2"));
		}
		
		/**
		 * Test case for {@link FieldInfo#isValidValue(String)} method.
		 * It tests the case when the validValues map contains three values.
		 */
		@Test
		void testIsValidValue_5() {
				FieldInfo fieldInfo = new FieldInfo();
				TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
				validValues.put("1", new ValueInfo());
				validValues.put("2", new ValueInfo());
				validValues.put("3", new ValueInfo());
				fieldInfo.setValidValues(validValues);
				assertTrue(fieldInfo.isValidValue("1"));
				assertTrue(fieldInfo.isValidValue("2"));
				assertTrue(fieldInfo.isValidValue("3"));
		}
		
		/**
		 * Test case for {@link FieldInfo#isValidValue(String)} method.
		 * It tests the case when the validValues map contains four values.
		 */
		@Test
		void testIsValidValue_6() {
				FieldInfo fieldInfo = new FieldInfo();
				TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
				validValues.put("1", new ValueInfo());
				validValues.put("2", new ValueInfo());
				validValues.put("3", new ValueInfo());
				validValues.put("4", new ValueInfo());
				fieldInfo.setValidValues(validValues);
				assertTrue(fieldInfo.isValidValue("1"));
				assertTrue(fieldInfo.isValidValue("2"));
				assertTrue(fieldInfo.isValidValue("3"));
				assertTrue(fieldInfo.isValidValue("4"));
		}
		
		/**
		 * Test case for {@link FieldInfo#isValidValue(String)} method.
		 * It tests the case when the validValues map contains five values.
		 */
		@Test
		void testIsValidValue_7() {
				FieldInfo fieldInfo = new FieldInfo();
				TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
				validValues.put("1", new ValueInfo());
				validValues.put("2", new ValueInfo());
				validValues.put("3", new ValueInfo());
				validValues.put("4", new ValueInfo());
				validValues.put("5", new ValueInfo());
				fieldInfo.setValidValues(validValues);
				assertTrue(fieldInfo.isValidValue("1"));
				assertTrue(fieldInfo.isValidValue("2"));
				assertTrue(fieldInfo.isValidValue("3"));
				assertTrue(fieldInfo.isValidValue("4"));
				assertTrue(fieldInfo.isValidValue("5"));
		}
		
		/**
		 * Test case for {@link FieldInfo#isValidValue(String)} method.
		 * It tests the case when the validValues map contains six values.
		 */
		@Test
		void testIsValidValue_8() {
				FieldInfo fieldInfo = new FieldInfo();
				TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
				validValues.put("1", new ValueInfo());
				validValues.put("2", new ValueInfo());
				validValues.put("3", new ValueInfo());
				validValues.put("4", new ValueInfo());
				validValues.put("5", new ValueInfo());
				validValues.put("6", new ValueInfo());
				fieldInfo.setValidValues(validValues);
				assertTrue(fieldInfo.isValidValue("1"));
				assertTrue(fieldInfo.isValidValue("2"));
				assertTrue(fieldInfo.isValidValue("3"));
				assertTrue(fieldInfo.isValidValue("4"));
				assertTrue(fieldInfo.isValidValue("5"));
				assertTrue(fieldInfo.isValidValue("6"));
		}
		
		/**
		 * Test case for {@link FieldInfo#isValidValue(String)} method.
		 * It tests the case when the validValues map contains seven values.
		 */
		@Test
		void testIsValidValue_9() {
				FieldInfo fieldInfo = new FieldInfo();
				TreeMap<String, ValueInfo> validValues = new TreeMap<String, ValueInfo>();
				validValues.put("1", new ValueInfo());
				validValues.put("2", new ValueInfo());
				validValues.put("3", new ValueInfo());
				validValues.put("4", new ValueInfo());
				validValues.put("5", new ValueInfo());
				validValues.put("6", new ValueInfo());
				validValues.put("7", new ValueInfo());
				fieldInfo.setValidValues(validValues);
				assertTrue(fieldInfo.isValidValue("1"));
				assertTrue(fieldInfo.isValidValue("2"));
				assertTrue(fieldInfo.isValidValue("3"));
				assertTrue(fieldInfo.isValidValue("4"));
				assertTrue(fieldInfo.isValidValue("5"));
				assertTrue(fieldInfo.isValidValue("6"));
				assertTrue(fieldInfo