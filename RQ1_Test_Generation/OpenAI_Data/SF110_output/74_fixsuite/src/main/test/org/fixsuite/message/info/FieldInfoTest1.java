// FieldInfoTest1.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FieldInfo}.
* It contains ten unit test cases for the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method.
*/
class FieldInfoTest1 {

		/**
		 * Test case 1.
		 * This test case checks the behavior of the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method
		 * when the field is required in the component.
		 */
		@Test
		void testIsRequiredInComponent1() {
				FieldInfo field = new FieldInfo();
				field.setRequiringComponents(new ArrayList<ComponentInfo>());
				ComponentInfo component = new ComponentInfo();
				field.getRequiringComponents().add(component);
				assertTrue(field.isRequiredInComponent(component));
		}
		
		/**
		 * Test case 2.
		 * This test case checks the behavior of the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method
		 * when the field is not required in the component.
		 */
		@Test
		void testIsRequiredInComponent2() {
				FieldInfo field = new FieldInfo();
				field.setRequiringComponents(new ArrayList<ComponentInfo>());
				ComponentInfo component = new ComponentInfo();
				assertFalse(field.isRequiredInComponent(component));
		}
		
		/**
		 * Test case 3.
		 * This test case checks the behavior of the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method
		 * when the field is required in the component but the component is null.
		 */
		@Test
		void testIsRequiredInComponent3() {
				FieldInfo field = new FieldInfo();
				field.setRequiringComponents(new ArrayList<ComponentInfo>());
				ComponentInfo component = new ComponentInfo();
				field.getRequiringComponents().add(component);
				assertFalse(field.isRequiredInComponent(null));
		}
		
		/**
		 * Test case 4.
		 * This test case checks the behavior of the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method
		 * when the field is not required in the component but the component is null.
		 */
		@Test
		void testIsRequiredInComponent4() {
				FieldInfo field = new FieldInfo();
				field.setRequiringComponents(new ArrayList<ComponentInfo>());
				assertFalse(field.isRequiredInComponent(null));
		}
		
		/**
		 * Test case 5.
		 * This test case checks the behavior of the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method
		 * when the field is required in the component but the field is null.
		 */
		@Test
		void testIsRequiredInComponent5() {
				ComponentInfo component = new ComponentInfo();
				assertFalse(FieldInfo.isRequiredInComponent(null, component));
		}
		
		/**
		 * Test case 6.
		 * This test case checks the behavior of the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method
		 * when the field is not required in the component but the field is null.
		 */
		@Test
		void testIsRequiredInComponent6() {
				ComponentInfo component = new ComponentInfo();
				assertFalse(FieldInfo.isRequiredInComponent(null, component));
		}
		
		/**
		 * Test case 7.
		 * This test case checks the behavior of the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method
		 * when the field is required in the component but the component is null.
		 */
		@Test
		void testIsRequiredInComponent7() {
				FieldInfo field = new FieldInfo();
				field.setRequiringComponents(new ArrayList<ComponentInfo>());
				ComponentInfo component = new ComponentInfo();
				field.getRequiringComponents().add(component);
				assertFalse(FieldInfo.isRequiredInComponent(field, null));
		}
		
		/**
		 * Test case 8.
		 * This test case checks the behavior of the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method
		 * when the field is not required in the component but the component is null.
		 */
		@Test
		void testIsRequiredInComponent8() {
				FieldInfo field = new FieldInfo();
				field.setRequiringComponents(new ArrayList<ComponentInfo>());
				assertFalse(FieldInfo.isRequiredInComponent(field, null));
		}
		
		/**
		 * Test case 9.
		 * This test case checks the behavior of the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method
		 * when the field is required in the component but the field and the component are null.
		 */
		@Test
		void testIsRequiredInComponent9() {
				assertFalse(FieldInfo.isRequiredInComponent(null, null));
		}
		
		/**
		 * Test case 10.
		 * This test case checks the behavior of the {@link FieldInfo#isRequiredInComponent(ComponentInfo)} method
		 * when the field is not required in the component but the field and the component are null.
		 */
		@Test
		void testIsRequiredInComponent10() {
				assertFalse(FieldInfo.isRequiredInComponent(null, null));
		}
}

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
		 * Test case 1.
		 * This test case checks the behavior of the {@link FieldInfo#isValidValue(String)} method
		 * when the field has a valid value.
		 */
		@Test
		void testIsValidValue1() {
				FieldInfo field = new FieldInfo();
				field.setValidValues(new TreeMap<String, ValueInfo>());
				ValueInfo value = new ValueInfo();
				value.setValue("value");
				field.getValidValuesMap().put(value.getValue(), value);
				assertTrue(field.isValidValue(value.getValue()));
		}
		
		/**
		 * Test case 2.
		 * This test case checks the behavior of the {@link FieldInfo#isValidValue(String)} method
		 * when the field has an invalid value.
		 */
		@Test
		void testIsValidValue2() {
				FieldInfo field = new FieldInfo();
				field.setValidValues(new TreeMap<String, ValueInfo>());
				ValueInfo value = new ValueInfo();
				value.setValue("value");
				field.getValidValuesMap().put(value.getValue(), value);
				assertFalse(field.isValidValue("invalid"));
		}
		
		/**
		 * Test case 3.
		 * This test case checks the behavior of the {@link FieldInfo#isValidValue(String)} method
		 * when the field has a valid value but the value is null.
		 */
		@Test
		void testIsValidValue3() {
				FieldInfo field = new FieldInfo();
				field.setValidValues(new TreeMap<String, ValueInfo>());
				ValueInfo value = new ValueInfo();
				value.setValue("value");
				field.getValidValuesMap().put(value.getValue(), value);
				assertFalse(field.isValidValue(null));
		}
		
		/**
		 * Test case 4.
		 * This test case checks