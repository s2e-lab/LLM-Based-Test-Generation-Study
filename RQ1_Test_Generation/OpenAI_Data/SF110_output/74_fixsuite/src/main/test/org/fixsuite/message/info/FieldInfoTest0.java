// FieldInfoTest0.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isNotRequiredXml()} method.
*/
class FieldInfoTest0 {

		/**
		 * Test case 1 for method {@link FieldInfo#isNotRequiredXml()}.
		 * 
		 * @see FieldInfo#isNotRequiredXml()
		 */
		@Test
		void testIsNotRequiredXml1() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setNotRequiredXml(true);
				assertTrue(fieldInfo.isNotRequiredXml());
		}
		
		/**
		 * Test case 2 for method {@link FieldInfo#isNotRequiredXml()}.
		 * 
		 * @see FieldInfo#isNotRequiredXml()
		 */
		@Test
		void testIsNotRequiredXml2() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setNotRequiredXml(false);
				assertFalse(fieldInfo.isNotRequiredXml());
		}
		
		/**
		 * Test case 3 for method {@link FieldInfo#isNotRequiredXml()}.
		 * 
		 * @see FieldInfo#isNotRequiredXml()
		 */
		@Test
		void testIsNotRequiredXml3() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setNotRequiredXml(true);
				assertTrue(fieldInfo.isNotRequiredXml());
		}
		
		/**
		 * Test case 4 for method {@link FieldInfo#isNotRequiredXml()}.
		 * 
		 * @see FieldInfo#isNotRequiredXml()
		 */
		@Test
		void testIsNotRequiredXml4() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setNotRequiredXml(false);
				assertFalse(fieldInfo.isNotRequiredXml());
		}
		
		/**
		 * Test case 5 for method {@link FieldInfo#isNotRequiredXml()}.
		 * 
		 * @see FieldInfo#isNotRequiredXml()
		 */
		@Test
		void testIsNotRequiredXml5() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setNotRequiredXml(true);
				assertTrue(fieldInfo.isNotRequiredXml());
		}
		
		/**
		 * Test case 6 for method {@link FieldInfo#isNotRequiredXml()}.
		 * 
		 * @see FieldInfo#isNotRequiredXml()
		 */
		@Test
		void testIsNotRequiredXml6() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setNotRequiredXml(false);
				assertFalse(fieldInfo.isNotRequiredXml());
		}
		
		/**
		 * Test case 7 for method {@link FieldInfo#isNotRequiredXml()}.
		 * 
		 * @see FieldInfo#isNotRequiredXml()
		 */
		@Test
		void testIsNotRequiredXml7() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setNotRequiredXml(true);
				assertTrue(fieldInfo.isNotRequiredXml());
		}
		
		/**
		 * Test case 8 for method {@link FieldInfo#isNotRequiredXml()}.
		 * 
		 * @see FieldInfo#isNotRequiredXml()
		 */
		@Test
		void testIsNotRequiredXml8() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setNotRequiredXml(false);
				assertFalse(fieldInfo.isNotRequiredXml());
		}
		
		/**
		 * Test case 9 for method {@link FieldInfo#isNotRequiredXml()}.
		 * 
		 * @see FieldInfo#isNotRequiredXml()
		 */
		@Test
		void testIsNotRequiredXml9() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setNotRequiredXml(true);
				assertTrue(fieldInfo.isNotRequiredXml());
		}
		
		/**
		 * Test case 10 for method {@link FieldInfo#isNotRequiredXml()}.
		 * 
		 * @see FieldInfo#isNotRequiredXml()
		 */
		@Test
		void testIsNotRequiredXml10() {
				FieldInfo fieldInfo = new FieldInfo();
				fieldInfo.setNotRequiredXml(false);
				assertFalse(fieldInfo.isNotRequiredXml());
		}
}

// FieldInfoTest1.java
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
class FieldInfoTest1 {
		
		/**
		 * Test case 1 for method {@link FieldInfo#isValidValue(String)}.
		 * 
		 * @see FieldInfo#isValidValue(String)
		 */
		@Test
		void testIsValidValue1() {
				FieldInfo fieldInfo = new FieldInfo();
				ValueInfo valueInfo = new ValueInfo();
				valueInfo.setValue("value");
				fieldInfo.addValidValue(valueInfo);
				assertTrue(fieldInfo.isValidValue("value"));
		}
		
		/**
		 * Test case 2 for method {@link FieldInfo#isValidValue(String)}.
		 * 
		 * @see FieldInfo#isValidValue(String)
		 */
		@Test
		void testIsValidValue2() {
				FieldInfo fieldInfo = new FieldInfo();
				ValueInfo valueInfo = new ValueInfo();
				valueInfo.setValue("value");
				fieldInfo.addValidValue(valueInfo);
				assertFalse(fieldInfo.isValidValue("value1"));
		}
		
		/**
		 * Test case 3 for method {@link FieldInfo#isValidValue(String)}.
		 * 
		 * @see FieldInfo#isValidValue(String)
		 */
		@Test
		void testIsValidValue3() {
				FieldInfo fieldInfo = new FieldInfo();
				ValueInfo valueInfo = new ValueInfo();
				valueInfo.setValue("value");
				fieldInfo.addValidValue(valueInfo);
				assertTrue(fieldInfo.isValidValue("value"));
		}
		
		/**
		 * Test case 4 for method {@link FieldInfo#isValidValue(String)}.
		 * 
		 * @see FieldInfo#isValidValue(String)
		 */
		@Test
		void testIsValidValue4() {
				FieldInfo fieldInfo = new FieldInfo();
				ValueInfo valueInfo = new ValueInfo();
				valueInfo.setValue("value");
				fieldInfo.addValidValue(valueInfo);
				assertFalse(fieldInfo.isValidValue("value1"));
		}
		
		/**
		 * Test case 5 for method {@link FieldInfo#isValidValue(String)}.
		 * 
		 * @see FieldInfo#isValidValue(String)
		 */
		@Test
		void testIsValidValue5() {
				FieldInfo fieldInfo = new FieldInfo();
				ValueInfo valueInfo = new ValueInfo();
				valueInfo.setValue("value");
	