// ParameterListTest4.java
package org.scribe.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.scribe.utils.OAuthEncoder;
import org.scribe.utils.Preconditions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterList}.
* It contains ten unit test cases for the {@link ParameterList#size()} method.
*/
class ParameterListTest4 {

		private ParameterList parameterList;
		
		@Test
		void testSize1() {
				parameterList = new ParameterList();
				assertEquals(0, parameterList.size());
		}
		
		@Test
		void testSize2() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				assertEquals(1, parameterList.size());
		}
		
		@Test
		void testSize3() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				assertEquals(2, parameterList.size());
		}
		
		@Test
		void testSize4() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				assertEquals(3, parameterList.size());
		}
		
		@Test
		void testSize5() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				assertEquals(4, parameterList.size());
		}
		
		@Test
		void testSize6() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				assertEquals(5, parameterList.size());
		}
		
		@Test
		void testSize7() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				assertEquals(6, parameterList.size());
		}
		
		@Test
		void testSize8() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				parameterList.add("key7", "value7");
				assertEquals(7, parameterList.size());
		}
		
		@Test
		void testSize9() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				parameterList.add("key7", "value7");
				parameterList.add("key8", "value8");
				assertEquals(8, parameterList.size());
		}
		
		@Test
		void testSize10() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				parameterList.add("key7", "value7");
				parameterList.add("key8", "value8");
				parameterList.add("key9", "value9");
				assertEquals(9, parameterList.size());
		}
		
}

// ParameterListTest5.java
package org.scribe.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.scribe.utils.OAuthEncoder;
import org.scribe.utils.Preconditions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterList}.
* It contains ten unit test cases for the {@link ParameterList#sort()} method.
*/
class ParameterListTest5 {
		
		private ParameterList parameterList;
		
		@Test
		void testSort1() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				parameterList.add("key7", "value7");
				parameterList.add("key8", "value8");
				parameterList.add("key9", "value9");
				parameterList.add("key10", "value10");
				parameterList.sort();
				assertEquals("key1=value1&key10=value10&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9", parameterList.asFormUrlEncodedString());
		}
		
		@Test
		void testSort2() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				parameterList.add("key7", "value7");
				parameterList.add("key8", "value8");
				parameterList.add("key9", "value9");
				parameterList.add("key10", "value10");
				parameterList.sort();
				assertEquals("key1=value1&key10=value10&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9", parameterList.asFormUrlEncodedString());
		}
		
		@Test
		void testSort3() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				parameterList.add("key7", "value7");
				parameterList.add("key8", "value8");
				parameterList.add("key9", "value9");
				parameterList.add("key10", "value10");
				parameterList.sort();
				assertEquals("key1=value1&key10=value10&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9", parameterList.asFormUrlEncodedString());
		}
		
		@Test
		void testSort4() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				parameterList.add("key7", "value7");
				parameterList.add("key8", "value8");
				parameterList.add("key9", "value9");
				parameterList.add("key10", "value10");
				parameterList.sort();
				assertEquals("key1=value1&key10=value10&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9", parameterList.asFormUrlEncodedString());
		}
		
		@Test
		void testSort5() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				parameterList.add("key7", "value7");
				parameterList.add("key8", "value8");
				parameterList.add("key9", "value9");
				parameterList.add("key10", "value10");
				parameterList.sort();
				assertEquals("key1=value1&key10=value10&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9", parameterList.asFormUrlEncodedString());
		}
		
		@Test
		void testSort6() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				parameterList.add("key7", "value7");
				parameterList.add("key8", "value8");
				parameterList.add("key9", "value9");
				parameterList.add("key10", "value10");
				parameterList.sort();
				assertEquals("key1=value1&key10=value10&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9", parameterList.asFormUrlEncodedString());
		}
		
		@Test
		void testSort7() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				parameterList.add("key7", "value7");
				parameterList.add("key8", "value8");
				parameterList.add("key9", "value9");
				parameterList.add("key10", "value10");
				parameterList.sort();
				assertEquals("key1=value1&key10=value10&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9", parameterList.asFormUrlEncodedString());
		}
		
		@Test
		void testSort8() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				parameterList.add("key7", "value7");
				parameterList.add("key8", "value8");
				parameterList.add("key9", "value9");
				parameterList.add("key10", "value10");
				parameterList.sort();
				assertEquals("key1=value1&key10=value10&key2=value2&key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9", parameterList.asFormUrlEncodedString());
		}
		
		@Test
		void testSort9() {
				parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				param