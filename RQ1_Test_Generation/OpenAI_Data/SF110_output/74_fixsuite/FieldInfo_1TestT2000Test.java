// FieldInfo_1Test.java
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
class FieldInfo_1Test {

		/**
		 * Test case 1.
		 * 
		 * <p>
		 * Test case for the {@link FieldInfo#isValidValue(String)} method.
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following requirements:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns true if the given value is valid.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testIsValidValue_1() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
				fieldInfo.getValidValuesMap().put("1", new ValueInfo());
				fieldInfo.getValidValuesMap().put("2", new ValueInfo());
				fieldInfo.getValidValuesMap().put("3", new ValueInfo());
				fieldInfo.getValidValuesMap().put("4", new ValueInfo());
				fieldInfo.getValidValuesMap().put("5", new ValueInfo());
				fieldInfo.getValidValuesMap().put("6", new ValueInfo());
				fieldInfo.getValidValuesMap().put("7", new ValueInfo());
				fieldInfo.getValidValuesMap().put("8", new ValueInfo());
				fieldInfo.getValidValuesMap().put("9", new ValueInfo());
				fieldInfo.getValidValuesMap().put("10", new ValueInfo());
				assertTrue(fieldInfo.isValidValue("1"));
				assertTrue(fieldInfo.isValidValue("2"));
				assertTrue(fieldInfo.isValidValue("3"));
				assertTrue(fieldInfo.isValidValue("4"));
				assertTrue(fieldInfo.isValidValue("5"));
				assertTrue(fieldInfo.isValidValue("6"));
				assertTrue(fieldInfo.isValidValue("7"));
				assertTrue(fieldInfo.isValidValue("8"));
				assertTrue(fieldInfo.isValidValue("9"));
				assertTrue(fieldInfo.isValidValue("10"));
		}
		
		/**
		 * Test case 2.
		 * 
		 * <p>
		 * Test case for the {@link FieldInfo#isValidValue(String)} method.
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following requirements:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns false if the given value is not valid.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testIsValidValue_2() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
				fieldInfo.getValidValuesMap().put("1", new ValueInfo());
				fieldInfo.getValidValuesMap().put("2", new ValueInfo());
				fieldInfo.getValidValuesMap().put("3", new ValueInfo());
				fieldInfo.getValidValuesMap().put("4", new ValueInfo());
				fieldInfo.getValidValuesMap().put("5", new ValueInfo());
				fieldInfo.getValidValuesMap().put("6", new ValueInfo());
				fieldInfo.getValidValuesMap().put("7", new ValueInfo());
				fieldInfo.getValidValuesMap().put("8", new ValueInfo());
				fieldInfo.getValidValuesMap().put("9", new ValueInfo());
				fieldInfo.getValidValuesMap().put("10", new ValueInfo());
				assertFalse(fieldInfo.isValidValue("11"));
				assertFalse(fieldInfo.isValidValue("12"));
				assertFalse(fieldInfo.isValidValue("13"));
				assertFalse(fieldInfo.isValidValue("14"));
				assertFalse(fieldInfo.isValidValue("15"));
				assertFalse(fieldInfo.isValidValue("16"));
				assertFalse(fieldInfo.isValidValue("17"));
				assertFalse(fieldInfo.isValidValue("18"));
				assertFalse(fieldInfo.isValidValue("19"));
				assertFalse(fieldInfo.isValidValue("20"));
		}
		
		/**
		 * Test case 3.
		 * 
		 * <p>
		 * Test case for the {@link FieldInfo#isValidValue(String)} method.
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following requirements:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns false if the given value is not valid.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testIsValidValue_3() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
				fieldInfo.getValidValuesMap().put("1", new ValueInfo());
				fieldInfo.getValidValuesMap().put("2", new ValueInfo());
				fieldInfo.getValidValuesMap().put("3", new ValueInfo());
				fieldInfo.getValidValuesMap().put("4", new ValueInfo());
				fieldInfo.getValidValuesMap().put("5", new ValueInfo());
				fieldInfo.getValidValuesMap().put("6", new ValueInfo());
				fieldInfo.getValidValuesMap().put("7", new ValueInfo());
				fieldInfo.getValidValuesMap().put("8", new ValueInfo());
				fieldInfo.getValidValuesMap().put("9", new ValueInfo());
				fieldInfo.getValidValuesMap().put("10", new ValueInfo());
				assertFalse(fieldInfo.isValidValue("11"));
				assertFalse(fieldInfo.isValidValue("12"));
				assertFalse(fieldInfo.isValidValue("13"));
				assertFalse(fieldInfo.isValidValue("14"));
				assertFalse(fieldInfo.isValidValue("15"));
				assertFalse(fieldInfo.isValidValue("16"));
				assertFalse(fieldInfo.isValidValue("17"));
				assertFalse(fieldInfo.isValidValue("18"));
				assertFalse(fieldInfo.isValidValue("19"));
				assertFalse(fieldInfo.isValidValue("20"));
		}
		
		/**
		 * Test case 4.
		 * 
		 * <p>
		 * Test case for the {@link FieldInfo#isValidValue(String)} method.
		 * </p>
		 * 
		 * <p>
		 * This test case is for the following requirements:
		 * <ul>
		 * <li>The {@link FieldInfo#isValidValue(String)} method returns false if the given value is not valid.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testIsValidValue_4() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setValidValues(new TreeMap<String, ValueInfo>());
				fieldInfo.getValidValuesMap().put("1", new ValueInfo());
				fieldInfo.getValidValuesMap().put("2", new ValueInfo());
				fieldInfo.getValidValuesMap