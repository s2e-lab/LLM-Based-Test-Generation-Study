// ParameterListTest1.java
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
* It contains ten unit test cases for the {@link ParameterList#asOauthBaseString()} method.
*/
class ParameterListTest1 {

		/**
		* Test case 1 for {@link ParameterList#asOauthBaseString()}.
		* This test case checks the functionality of the method when the parameter list is empty.
		*/
		@Test
		public void testAsOauthBaseString1() {
				ParameterList parameterList = new ParameterList();
				assertEquals("", parameterList.asOauthBaseString());
		}
		
		/**
		* Test case 2 for {@link ParameterList#asOauthBaseString()}.
		* This test case checks the functionality of the method when the parameter list contains one parameter.
		*/
		@Test
		public void testAsOauthBaseString2() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key", "value");
				assertEquals("key%3Dvalue", parameterList.asOauthBaseString());
		}
		
		/**
		* Test case 3 for {@link ParameterList#asOauthBaseString()}.
		* This test case checks the functionality of the method when the parameter list contains two parameters.
		*/
		@Test
		public void testAsOauthBaseString3() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				assertEquals("key1%3Dvalue1%26key2%3Dvalue2", parameterList.asOauthBaseString());
		}
		
		/**
		* Test case 4 for {@link ParameterList#asOauthBaseString()}.
		* This test case checks the functionality of the method when the parameter list contains three parameters.
		*/
		@Test
		public void testAsOauthBaseString4() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				assertEquals("key1%3Dvalue1%26key2%3Dvalue2%26key3%3Dvalue3", parameterList.asOauthBaseString());
		}
		
		/**
		* Test case 5 for {@link ParameterList#asOauthBaseString()}.
		* This test case checks the functionality of the method when the parameter list contains four parameters.
		*/
		@Test
		public void testAsOauthBaseString5() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				assertEquals("key1%3Dvalue1%26key2%3Dvalue2%26key3%3Dvalue3%26key4%3Dvalue4", parameterList.asOauthBaseString());
		}
		
		/**
		* Test case 6 for {@link ParameterList#asOauthBaseString()}.
		* This test case checks the functionality of the method when the parameter list contains five parameters.
		*/
		@Test
		public void testAsOauthBaseString6() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				assertEquals("key1%3Dvalue1%26key2%3Dvalue2%26key3%3Dvalue3%26key4%3Dvalue4%26key5%3Dvalue5", parameterList.asOauthBaseString());
		}
		
		/**
		* Test case 7 for {@link ParameterList#asOauthBaseString()}.
		* This test case checks the functionality of the method when the parameter list contains six parameters.
		*/
		@Test
		public void testAsOauthBaseString7() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				assertEquals("key1%3Dvalue1%26key2%3Dvalue2%26key3%3Dvalue3%26key4%3Dvalue4%26key5%3Dvalue5%26key6%3Dvalue6", parameterList.asOauthBaseString());
		}
		
		/**
		* Test case 8 for {@link ParameterList#asOauthBaseString()}.
		* This test case checks the functionality of the method when the parameter list contains seven parameters.
		*/
		@Test
		public void testAsOauthBaseString8() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				parameterList.add("key7", "value7");
				assertEquals("key1%3Dvalue1%26key2%3Dvalue2%26key3%3Dvalue3%26key4%3Dvalue4%26key5%3Dvalue5%26key6%3Dvalue6%26key7%3Dvalue7", parameterList.asOauthBaseString());
		}
		
		/**
		* Test case 9 for {@link ParameterList#asOauthBaseString()}.
		* This test case checks the functionality of the method when the parameter list contains eight parameters.
		*/
		@Test
		public void testAsOauthBaseString9() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				parameterList.add("key3", "value3");
				parameterList.add("key4", "value4");
				parameterList.add("key5", "value5");
				parameterList.add("key6", "value6");
				parameterList.add("key7", "value7");
				parameterList.add("key8", "value8");
				assertEquals("key1%3Dvalue1%26key2%3Dvalue2%26key3%3Dvalue3%26key4%3Dvalue4%26key5%3Dvalue5%26key6%3Dvalue6%26key7%3Dvalue7%26key8%3Dvalue8", parameterList.asOauthBaseString());
		}
		
		/**
		* Test case 10 for {@link ParameterList#asOauthBaseString()}.
		* This test case checks the functionality of the method when the parameter list contains nine parameters.
		*/
		@Test
		public void testAsOauthBaseString10() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1