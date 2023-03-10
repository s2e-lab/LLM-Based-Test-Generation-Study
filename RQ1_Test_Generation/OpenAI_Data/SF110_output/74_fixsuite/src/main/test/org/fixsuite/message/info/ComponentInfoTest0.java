// ComponentInfoTest0.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ComponentInfo}.
* It contains ten unit test cases for the {@link ComponentInfo#isNotRequiredXml()} method.
*/
class ComponentInfoTest0 {

		private ComponentInfo componentInfo;
		
		@Test
		void testIsNotRequiredXml0() {
				componentInfo = new ComponentInfo();
				componentInfo.setNotRequiredXml(true);
				assertTrue(componentInfo.isNotRequiredXml());
		}
		
		@Test
		void testIsNotRequiredXml1() {
				componentInfo = new ComponentInfo();
				componentInfo.setNotRequiredXml(false);
				assertFalse(componentInfo.isNotRequiredXml());
		}
		
		@Test
		void testIsNotRequiredXml2() {
				componentInfo = new ComponentInfo();
				componentInfo.setNotRequiredXml(true);
				assertTrue(componentInfo.isNotRequiredXml());
		}
		
		@Test
		void testIsNotRequiredXml3() {
				componentInfo = new ComponentInfo();
				componentInfo.setNotRequiredXml(false);
				assertFalse(componentInfo.isNotRequiredXml());
		}
		
		@Test
		void testIsNotRequiredXml4() {
				componentInfo = new ComponentInfo();
				componentInfo.setNotRequiredXml(true);
				assertTrue(componentInfo.isNotRequiredXml());
		}
		
		@Test
		void testIsNotRequiredXml5() {
				componentInfo = new ComponentInfo();
				componentInfo.setNotRequiredXml(false);
				assertFalse(componentInfo.isNotRequiredXml());
		}
		
		@Test
		void testIsNotRequiredXml6() {
				componentInfo = new ComponentInfo();
				componentInfo.setNotRequiredXml(true);
				assertTrue(componentInfo.isNotRequiredXml());
		}
		
		@Test
		void testIsNotRequiredXml7() {
				componentInfo = new ComponentInfo();
				componentInfo.setNotRequiredXml(false);
				assertFalse(componentInfo.isNotRequiredXml());
		}
		
		@Test
		void testIsNotRequiredXml8() {
				componentInfo = new ComponentInfo();
				componentInfo.setNotRequiredXml(true);
				assertTrue(componentInfo.isNotRequiredXml());
		}
		
		@Test
		void testIsNotRequiredXml9() {
				componentInfo = new ComponentInfo();
				componentInfo.setNotRequiredXml(false);
				assertFalse(componentInfo.isNotRequiredXml());
		}
}

// ComponentInfoTest1.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ComponentInfo}.
* It contains ten unit test cases for the {@link ComponentInfo#isRequired()} method.
*/
class ComponentInfoTest1 {
		
		private ComponentInfo componentInfo;
		
		@Test
		void testIsRequired0() {
				componentInfo = new ComponentInfo();
				componentInfo.setRequired(true);
				assertTrue(componentInfo.isRequired());
		}
		
		@Test
		void testIsRequired1() {
				componentInfo = new ComponentInfo();
				componentInfo.setRequired(false);
				assertFalse(componentInfo.isRequired());
		}
		
		@Test
		void testIsRequired2() {
				componentInfo = new ComponentInfo();
				componentInfo.setRequired(true);
				assertTrue(componentInfo.isRequired());
		}
		
		@Test
		void testIsRequired3() {
				componentInfo = new ComponentInfo();
				componentInfo.setRequired(false);
				assertFalse(componentInfo.isRequired());
		}
		
		@Test
		void testIsRequired4() {
				componentInfo = new ComponentInfo();
				componentInfo.setRequired(true);
				assertTrue(componentInfo.isRequired());
		}
		
		@Test
		void testIsRequired5() {
				componentInfo = new ComponentInfo();
				componentInfo.setRequired(false);
				assertFalse(componentInfo.isRequired());
		}
		
		@Test
		void testIsRequired6() {
				componentInfo = new ComponentInfo();
				componentInfo.setRequired(true);
				assertTrue(componentInfo.isRequired());
		}
		
		@Test
		void testIsRequired7() {
				componentInfo = new ComponentInfo();
				componentInfo.setRequired(false);
				assertFalse(componentInfo.isRequired());
		}
		
		@Test
		void testIsRequired8() {
				componentInfo = new ComponentInfo();
				componentInfo.setRequired(true);
				assertTrue(componentInfo.isRequired());
		}
		
		@Test
		void testIsRequired9() {
				componentInfo = new ComponentInfo();
				componentInfo.setRequired(false);
				assertFalse(componentInfo.isRequired());
		}
}

// ComponentInfoTest2.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ComponentInfo}.
* It contains ten unit test cases for the {@link ComponentInfo#getItems()} method.
*/
class ComponentInfoTest2 {
		
		private ComponentInfo componentInfo;
		
		@Test
		void testGetItems0() {
				componentInfo = new ComponentInfo();
				List<FixInfo> items = new ArrayList<FixInfo>();
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items.add(new FieldInfo());
				items