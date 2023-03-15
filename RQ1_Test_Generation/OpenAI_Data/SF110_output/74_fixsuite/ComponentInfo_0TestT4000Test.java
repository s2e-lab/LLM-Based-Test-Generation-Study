// ComponentInfo_0Test.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ComponentInfo}.
* It contains ten unit test cases for the {@link ComponentInfo#getField(int)} method.
*/
class ComponentInfo_0Test {

		/**
		 * Test case 1.
		 * 
		 * <p>
		 * Test case for the {@link ComponentInfo#getField(int)} method.
		 * </p>
		 * 
		 * <p>
		 * Condition:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method is called.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is null.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * Expected:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method returns null.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testCase1() {
			ComponentInfo componentInfo = new ComponentInfo();
			componentInfo.fieldsByTagNumber = null;
			assertNull(componentInfo.getField(0));
		}
		
		/**
		 * Test case 2.
		 * 
		 * <p>
		 * Test case for the {@link ComponentInfo#getField(int)} method.
		 * </p>
		 * 
		 * <p>
		 * Condition:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method is called.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not null.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is empty.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * Expected:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method returns null.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testCase2() {
			ComponentInfo componentInfo = new ComponentInfo();
			componentInfo.fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
			assertNull(componentInfo.getField(0));
		}
		
		/**
		 * Test case 3.
		 * 
		 * <p>
		 * Test case for the {@link ComponentInfo#getField(int)} method.
		 * </p>
		 * 
		 * <p>
		 * Condition:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method is called.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not null.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not empty.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field contains a key-value pair.</li>
		 * <li>The key of the key-value pair is equal to the tag number.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * Expected:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method returns the value of the key-value pair.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testCase3() {
			ComponentInfo componentInfo = new ComponentInfo();
			componentInfo.fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
			FieldInfo fieldInfo = new FieldInfo();
			componentInfo.fieldsByTagNumber.put(0, fieldInfo);
			assertEquals(fieldInfo, componentInfo.getField(0));
		}
		
		/**
		 * Test case 4.
		 * 
		 * <p>
		 * Test case for the {@link ComponentInfo#getField(int)} method.
		 * </p>
		 * 
		 * <p>
		 * Condition:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method is called.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not null.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not empty.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field contains a key-value pair.</li>
		 * <li>The key of the key-value pair is not equal to the tag number.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * Expected:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method returns null.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testCase4() {
			ComponentInfo componentInfo = new ComponentInfo();
			componentInfo.fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
			FieldInfo fieldInfo = new FieldInfo();
			componentInfo.fieldsByTagNumber.put(1, fieldInfo);
			assertNull(componentInfo.getField(0));
		}
		
		/**
		 * Test case 5.
		 * 
		 * <p>
		 * Test case for the {@link ComponentInfo#getField(int)} method.
		 * </p>
		 * 
		 * <p>
		 * Condition:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method is called.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not null.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not empty.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field contains two key-value pairs.</li>
		 * <li>The key of the first key-value pair is not equal to the tag number.</li>
		 * <li>The key of the second key-value pair is equal to the tag number.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * Expected:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method returns the value of the second key-value pair.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testCase5() {
			ComponentInfo componentInfo = new ComponentInfo();
			componentInfo.fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
			FieldInfo fieldInfo1 = new FieldInfo();
			FieldInfo fieldInfo2 = new FieldInfo();
			componentInfo.fieldsByTagNumber.put(1, fieldInfo1);
			componentInfo.fieldsByTagNumber.put(0, fieldInfo2);
			assertEquals(fieldInfo2, componentInfo.getField(0));
		}
		
		/**
		 * Test case 6.
		 * 
		 * <p>
		 * Test case for the {@link ComponentInfo#getField(int)} method.
		 * </p>
		 * 
		 * <p>
		 * Condition:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method is called.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not null.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not empty.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field contains two key-value pairs.</li>
		 * <li>The key of the first key-value pair is equal to the tag number.</li>
		 * <li>The key of the second key-value pair is not equal to the tag number.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * Expected:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method returns the value of the first key-value pair.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testCase6() {
			ComponentInfo componentInfo = new ComponentInfo();
			componentInfo.fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
			FieldInfo fieldInfo1 = new FieldInfo();
			FieldInfo fieldInfo2 = new FieldInfo();
			componentInfo.fieldsByTagNumber.put(0, fieldInfo1);
			componentInfo.fieldsByTagNumber.put(1, fieldInfo2);
			assertEquals(fieldInfo1, componentInfo.getField(0));
		}
		
		/**
		 * Test case 7.
		 * 
		 * <p>
		 * Test case for the {@link ComponentInfo#getField(int)} method.
		 * </p>
		 * 
		 * <p>
		 * Condition:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method is called.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not null.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not empty.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field contains three key-value pairs.</li>
		 * <li>The key of the first key-value pair is not equal to the tag number.</li>
		 * <li>The key of the second key-value pair is equal to the tag number.</li>
		 * <li>The key of the third key-value pair is not equal to the tag number.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * Expected:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method returns the value of the second key-value pair.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testCase7() {
			ComponentInfo componentInfo = new ComponentInfo();
			componentInfo.fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
			FieldInfo fieldInfo1 = new FieldInfo();
			FieldInfo fieldInfo2 = new FieldInfo();
			FieldInfo fieldInfo3 = new FieldInfo();
			componentInfo.fieldsByTagNumber.put(1, fieldInfo1);
			componentInfo.fieldsByTagNumber.put(0, fieldInfo2);
			componentInfo.fieldsByTagNumber.put(2, fieldInfo3);
			assertEquals(fieldInfo2, componentInfo.getField(0));
		}
		
		/**
		 * Test case 8.
		 * 
		 * <p>
		 * Test case for the {@link ComponentInfo#getField(int)} method.
		 * </p>
		 * 
		 * <p>
		 * Condition:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method is called.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not null.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not empty.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field contains three key-value pairs.</li>
		 * <li>The key of the first key-value pair is equal to the tag number.</li>
		 * <li>The key of the second key-value pair is not equal to the tag number.</li>
		 * <li>The key of the third key-value pair is not equal to the tag number.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * Expected:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method returns the value of the first key-value pair.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testCase8() {
			ComponentInfo componentInfo = new ComponentInfo();
			componentInfo.fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
			FieldInfo fieldInfo1 = new FieldInfo();
			FieldInfo fieldInfo2 = new FieldInfo();
			FieldInfo fieldInfo3 = new FieldInfo();
			componentInfo.fieldsByTagNumber.put(0, fieldInfo1);
			componentInfo.fieldsByTagNumber.put(1, fieldInfo2);
			componentInfo.fieldsByTagNumber.put(2, fieldInfo3);
			assertEquals(fieldInfo1, componentInfo.getField(0));
		}
		
		/**
		 * Test case 9.
		 * 
		 * <p>
		 * Test case for the {@link ComponentInfo#getField(int)} method.
		 * </p>
		 * 
		 * <p>
		 * Condition:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method is called.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not null.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field is not empty.</li>
		 * <li>The {@link ComponentInfo#fieldsByTagNumber} field contains three key-value pairs.</li>
		 * <li>The key of the first key-value pair is not equal to the tag number.</li>
		 * <li>The key of the second key-value pair is equal to the tag number.</li>
		 * <li>The key of the third key-value pair is not equal to the tag number.</li>
		 * </ul>
		 * </p>
		 * 
		 * <p>
		 * Expected:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method returns the value of the second key-value pair.</li>
		 * </ul>
		 * </p>
		 */
		@Test
		void testCase9() {
			ComponentInfo componentInfo = new ComponentInfo();
			componentInfo.fieldsByTagNumber = new TreeMap<Integer, FieldInfo>();
			FieldInfo fieldInfo1 = new FieldInfo();
			FieldInfo fieldInfo2 = new FieldInfo();
			FieldInfo fieldInfo3 = new FieldInfo();
			componentInfo.fieldsByTagNumber.put(1, fieldInfo1);
			componentInfo.fieldsByTagNumber.put(0, fieldInfo2);
			componentInfo.fieldsByTagNumber.put(2, fieldInfo3);
			assertEquals(fieldInfo2, componentInfo.getField(0));
		}
		
		/**
		 * Test case 10.
		 * 
		 * <p>
		 * Test case for the {@link ComponentInfo#getField(int)} method.
		 * </p>
		 * 
		 * <p>
		 * Condition:
		 * <ul>
		 * <li>The {@link ComponentInfo#getField(int)} method