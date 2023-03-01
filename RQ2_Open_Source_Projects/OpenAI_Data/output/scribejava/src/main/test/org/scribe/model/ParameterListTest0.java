// ParameterListTest0.java
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
* It contains ten unit test cases for the {@link ParameterList#appendTo(String)} method.
*/
class ParameterListTest0 {

		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the scenario when the parameter list is empty.
		*/
		@Test
		public void testAppendTo0() {
				ParameterList parameterList = new ParameterList();
				String url = "http://www.google.com";
				String result = parameterList.appendTo(url);
				assertEquals(url, result);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the scenario when the parameter list is not empty.
		*/
		@Test
		public void testAppendTo1() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				String url = "http://www.google.com";
				String result = parameterList.appendTo(url);
				assertEquals(url + "?key1=value1&key2=value2", result);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the scenario when the parameter list is not empty and the url already contains a query string.
		*/
		@Test
		public void testAppendTo2() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				String url = "http://www.google.com?key3=value3";
				String result = parameterList.appendTo(url);
				assertEquals(url + "&key1=value1&key2=value2", result);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the scenario when the parameter list is not empty and the url already contains a query string.
		*/
		@Test
		public void testAppendTo3() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				String url = "http://www.google.com?key3=value3&key4=value4";
				String result = parameterList.appendTo(url);
				assertEquals(url + "&key1=value1&key2=value2", result);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the scenario when the parameter list is not empty and the url already contains a query string.
		*/
		@Test
		public void testAppendTo4() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				String url = "http://www.google.com?key3=value3&key4=value4&key5=value5";
				String result = parameterList.appendTo(url);
				assertEquals(url + "&key1=value1&key2=value2", result);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the scenario when the parameter list is not empty and the url already contains a query string.
		*/
		@Test
		public void testAppendTo5() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				String url = "http://www.google.com?key3=value3&key4=value4&key5=value5&key6=value6";
				String result = parameterList.appendTo(url);
				assertEquals(url + "&key1=value1&key2=value2", result);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the scenario when the parameter list is not empty and the url already contains a query string.
		*/
		@Test
		public void testAppendTo6() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				String url = "http://www.google.com?key3=value3&key4=value4&key5=value5&key6=value6&key7=value7";
				String result = parameterList.appendTo(url);
				assertEquals(url + "&key1=value1&key2=value2", result);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the scenario when the parameter list is not empty and the url already contains a query string.
		*/
		@Test
		public void testAppendTo7() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				String url = "http://www.google.com?key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8";
				String result = parameterList.appendTo(url);
				assertEquals(url + "&key1=value1&key2=value2", result);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the scenario when the parameter list is not empty and the url already contains a query string.
		*/
		@Test
		public void testAppendTo8() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				String url = "http://www.google.com?key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9";
				String result = parameterList.appendTo(url);
				assertEquals(url + "&key1=value1&key2=value2", result);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the scenario when the parameter list is not empty and the url already contains a query string.
		*/
		@Test
		public void testAppendTo9() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("key1", "value1");
				parameterList.add("key2", "value2");
				String url = "http://www.google.com?key3=value3&key4=value4&key5=value5&key6=value6&key7=value7&key8=value8&key9=value9&key10=value10";
				String result = parameterList.appendTo(url);
				assertEquals(url + "&key1=value1&key2=value2", result);
		}
		
}

// ParameterListTest