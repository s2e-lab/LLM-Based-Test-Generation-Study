// ComponentInfo_1Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ComponentInfo}.
* It contains ten unit test cases for the {@link ComponentInfo#getField(String)} method.
*/
class ComponentInfo_1Test {

		/**
		 * Test case 1.
		 * 
		 * <p>
		 * This test case checks the {@link ComponentInfo#getField(String)} method
		 * when the fieldsByName map is null.
		 * </p>
		 */
		@Test
		void testGetField_1() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.fieldsByName = null;
				assertNull(componentInfo.getField(""));
		}
		
		/**
		 * Test case 2.
		 * 
		 * <p>
		 * This test case checks the {@link ComponentInfo#getField(String)} method
		 * when the fieldsByName map is empty.
		 * </p>
		 */
		@Test
		void testGetField_2() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.fieldsByName = new TreeMap<String, FieldInfo>();
				assertNull(componentInfo.getField(""));
		}
		
		/**
		 * Test case 3.
		 * 
		 * <p>
		 * This test case checks the {@link ComponentInfo#getField(String)} method
		 * when the fieldsByName map contains one element.
		 * </p>
		 */
		@Test
		void testGetField_3() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.fieldsByName = new TreeMap<String, FieldInfo>();
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setName("");
				componentInfo.fieldsByName.put("", fieldInfo);
				assertEquals(fieldInfo, componentInfo.getField(""));
		}
		
		/**
		 * Test case 4.
		 * 
		 * <p>
		 * This test case checks the {@link ComponentInfo#getField(String)} method
		 * when the fieldsByName map contains two elements.
		 * </p>
		 */
		@Test
		void testGetField_4() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.fieldsByName = new TreeMap<String, FieldInfo>();
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setName("");
				componentInfo.fieldsByName.put("", fieldInfo);
				FieldInfo fieldInfo2 = new FieldInfo();
				fieldInfo2.setName("");
				componentInfo.fieldsByName.put("", fieldInfo2);
				assertEquals(fieldInfo, componentInfo.getField(""));
		}
		
		/**
		 * Test case 5.
		 * 
		 * <p>
		 * This test case checks the {@link ComponentInfo#getField(String)} method
		 * when the fieldsByName map contains three elements.
		 * </p>
		 */
		@Test
		void testGetField_5() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.fieldsByName = new TreeMap<String, FieldInfo>();
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setName("");
				componentInfo.fieldsByName.put("", fieldInfo);
				FieldInfo fieldInfo2 = new FieldInfo();
				fieldInfo2.setName("");
				componentInfo.fieldsByName.put("", fieldInfo2);
				FieldInfo fieldInfo3 = new FieldInfo();
				fieldInfo3.setName("");
				componentInfo.fieldsByName.put("", fieldInfo3);
				assertEquals(fieldInfo, componentInfo.getField(""));
		}
		
		/**
		 * Test case 6.
		 * 
		 * <p>
		 * This test case checks the {@link ComponentInfo#getField(String)} method
		 * when the fieldsByName map contains four elements.
		 * </p>
		 */
		@Test
		void testGetField_6() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.fieldsByName = new TreeMap<String, FieldInfo>();
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setName("");
				componentInfo.fieldsByName.put("", fieldInfo);
				FieldInfo fieldInfo2 = new FieldInfo();
				fieldInfo2.setName("");
				componentInfo.fieldsByName.put("", fieldInfo2);
				FieldInfo fieldInfo3 = new FieldInfo();
				fieldInfo3.setName("");
				componentInfo.fieldsByName.put("", fieldInfo3);
				FieldInfo fieldInfo4 = new FieldInfo();
				fieldInfo4.setName("");
				componentInfo.fieldsByName.put("", fieldInfo4);
				assertEquals(fieldInfo, componentInfo.getField(""));
		}
		
		/**
		 * Test case 7.
		 * 
		 * <p>
		 * This test case checks the {@link ComponentInfo#getField(String)} method
		 * when the fieldsByName map contains five elements.
		 * </p>
		 */
		@Test
		void testGetField_7() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.fieldsByName = new TreeMap<String, FieldInfo>();
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setName("");
				componentInfo.fieldsByName.put("", fieldInfo);
				FieldInfo fieldInfo2 = new FieldInfo();
				fieldInfo2.setName("");
				componentInfo.fieldsByName.put("", fieldInfo2);
				FieldInfo fieldInfo3 = new FieldInfo();
				fieldInfo3.setName("");
				componentInfo.fieldsByName.put("", fieldInfo3);
				FieldInfo fieldInfo4 = new FieldInfo();
				fieldInfo4.setName("");
				componentInfo.fieldsByName.put("", fieldInfo4);
				FieldInfo fieldInfo5 = new FieldInfo();
				fieldInfo5.setName("");
				componentInfo.fieldsByName.put("", fieldInfo5);
				assertEquals(fieldInfo, componentInfo.getField(""));
		}
		
		/**
		 * Test case 8.
		 * 
		 * <p>
		 * This test case checks the {@link ComponentInfo#getField(String)} method
		 * when the fieldsByName map contains six elements.
		 * </p>
		 */
		@Test
		void testGetField_8() {
				ComponentInfo componentInfo = new ComponentInfo();
				componentInfo.fieldsByName = new TreeMap<String, FieldInfo>();
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setName("");
				componentInfo.fieldsByName.put("", fieldInfo);
				FieldInfo fieldInfo2 = new FieldInfo();
				fieldInfo2.setName("");
				componentInfo.fieldsByName.put("", fieldInfo2);
				FieldInfo fieldInfo3 = new FieldInfo();
				fieldInfo3.setName("");
				componentInfo.fieldsByName.put("", fieldInfo3);
				FieldInfo fieldInfo4 = new FieldInfo();
				fieldInfo4.set