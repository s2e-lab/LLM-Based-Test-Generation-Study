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
		* Test case for the following inputs:
		* {@code url = "http://example.com/"}
		* {@code params = {}}
		* Expected output: {@code "http://example.com/"}
		*/
		@Test
		void testAppendTo0() {
				ParameterList parameterList = new ParameterList();
				String url = "http://example.com/";
				String expected = "http://example.com/";
				String actual = parameterList.appendTo(url);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the following inputs:
		* {@code url = "http://example.com/"}
		* {@code params = {("a", "b")}}
		* Expected output: {@code "http://example.com/?a=b"}
		*/
		@Test
		void testAppendTo1() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("a", "b");
				String url = "http://example.com/";
				String expected = "http://example.com/?a=b";
				String actual = parameterList.appendTo(url);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the following inputs:
		* {@code url = "http://example.com/"}
		* {@code params = {("a", "b"), ("c", "d")}}
		* Expected output: {@code "http://example.com/?a=b&c=d"}
		*/
		@Test
		void testAppendTo2() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("a", "b");
				parameterList.add("c", "d");
				String url = "http://example.com/";
				String expected = "http://example.com/?a=b&c=d";
				String actual = parameterList.appendTo(url);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the following inputs:
		* {@code url = "http://example.com/"}
		* {@code params = {("a", "b"), ("c", "d"), ("e", "f")}}
		* Expected output: {@code "http://example.com/?a=b&c=d&e=f"}
		*/
		@Test
		void testAppendTo3() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("a", "b");
				parameterList.add("c", "d");
				parameterList.add("e", "f");
				String url = "http://example.com/";
				String expected = "http://example.com/?a=b&c=d&e=f";
				String actual = parameterList.appendTo(url);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the following inputs:
		* {@code url = "http://example.com/"}
		* {@code params = {("a", "b"), ("c", "d"), ("e", "f"), ("g", "h")}}
		* Expected output: {@code "http://example.com/?a=b&c=d&e=f&g=h"}
		*/
		@Test
		void testAppendTo4() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("a", "b");
				parameterList.add("c", "d");
				parameterList.add("e", "f");
				parameterList.add("g", "h");
				String url = "http://example.com/";
				String expected = "http://example.com/?a=b&c=d&e=f&g=h";
				String actual = parameterList.appendTo(url);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the following inputs:
		* {@code url = "http://example.com/"}
		* {@code params = {("a", "b"), ("c", "d"), ("e", "f"), ("g", "h"), ("i", "j")}}
		* Expected output: {@code "http://example.com/?a=b&c=d&e=f&g=h&i=j"}
		*/
		@Test
		void testAppendTo5() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("a", "b");
				parameterList.add("c", "d");
				parameterList.add("e", "f");
				parameterList.add("g", "h");
				parameterList.add("i", "j");
				String url = "http://example.com/";
				String expected = "http://example.com/?a=b&c=d&e=f&g=h&i=j";
				String actual = parameterList.appendTo(url);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the following inputs:
		* {@code url = "http://example.com/"}
		* {@code params = {("a", "b"), ("c", "d"), ("e", "f"), ("g", "h"), ("i", "j"), ("k", "l")}}
		* Expected output: {@code "http://example.com/?a=b&c=d&e=f&g=h&i=j&k=l"}
		*/
		@Test
		void testAppendTo6() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("a", "b");
				parameterList.add("c", "d");
				parameterList.add("e", "f");
				parameterList.add("g", "h");
				parameterList.add("i", "j");
				parameterList.add("k", "l");
				String url = "http://example.com/";
				String expected = "http://example.com/?a=b&c=d&e=f&g=h&i=j&k=l";
				String actual = parameterList.appendTo(url);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the following inputs:
		* {@code url = "http://example.com/"}
		* {@code params = {("a", "b"), ("c", "d"), ("e", "f"), ("g", "h"), ("i", "j"), ("k", "l"), ("m", "n")}}
		* Expected output: {@code "http://example.com/?a=b&c=d&e=f&g=h&i=j&k=l&m=n"}
		*/
		@Test
		void testAppendTo7() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("a", "b");
				parameterList.add("c", "d");
				parameterList.add("e", "f");
				parameterList.add("g", "h");
				parameterList.add("i", "j");
				parameterList.add("k", "l");
				parameterList.add("m", "n");
				String url = "http://example.com/";
				String expected = "http://example.com/?a=b&c=d&e=f&g=h&i=j&k=l&m=n";
				String actual = parameterList.appendTo(url);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the following inputs:
		* {@code url = "http://example.com/"}
		* {@code params = {("a", "b"), ("c", "d"), ("e", "f"), ("g", "h"), ("i", "j"), ("k", "l"), ("m", "n"), ("o", "p")}}
		* Expected output: {@code "http://example.com/?a=b&c=d&e=f&g=h&i=j&k=l&m=n&o=p"}
		*/
		@Test
		void testAppendTo8() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("a", "b");
				parameterList.add("c", "d");
				parameterList.add("e", "f");
				parameterList.add("g", "h");
				parameterList.add("i", "j");
				parameterList.add("k", "l");
				parameterList.add("m", "n");
				parameterList.add("o", "p");
				String url = "http://example.com/";
				String expected = "http://example.com/?a=b&c=d&e=f&g=h&i=j&k=l&m=n&o=p";
				String actual = parameterList.appendTo(url);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ParameterList#appendTo(String)} method.
		* Test case for the following inputs:
		* {@code url = "http://example.com/"}
		* {@code params = {("a", "b"), ("c", "d"), ("e", "f"), ("g", "h"), ("i", "j"), ("k", "l"), ("m", "n"), ("o", "p"), ("q", "r")}}
		* Expected output: {@code "http://example.com/?a=b&c=d&e=f&g=h&i=j&k=l&m=n&o=p&q=r"}
		*/
		@Test
		void testAppendTo9() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("a", "b");
				parameterList.add("c", "d");
				parameterList.add("e", "f");
				parameterList.add("g", "h");
				parameterList.add("i", "j");
				parameterList.add("k", "l");
				parameterList.add("m", "n");
				parameterList.add("o", "p");
				parameterList.add("q", "r");
				String url = "http://example.com/";
				String expected = "http://example.com/?a=b&c=d&e=f&g=h&i=j&k=l&m=n&o=p&q=r";
				String actual = parameterList.appendTo(url);
				assertEquals(expected, actual);
		}
		
}

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
* It contains ten unit test cases for the {@link ParameterList#asFormUrlEncodedString()} method.
*/
class ParameterListTest1 {
		
		/**
		* Test case for {@link ParameterList#asFormUrlEncodedString()} method.
		* Test case for the following inputs:
		* {@code params = {}}
		* Expected output: {@code ""}
		*/
		@Test
		void testAsFormUrlEncodedString0() {
				ParameterList parameterList = new ParameterList();
				String expected = "";
				String actual = parameterList.asFormUrlEncodedString();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ParameterList#asFormUrlEncodedString()} method.
		* Test case for the following inputs:
		* {@code params = {("a", "b")}}
		* Expected output: {@code "a=b"}
		*/
		@Test
		void testAsFormUrlEncodedString1() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("a", "b");
				String expected = "a=b";
				String actual = parameterList.asFormUrlEncodedString();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ParameterList#asFormUrlEncodedString()} method.
		* Test case for the following inputs:
		* {@code params = {("a", "b"), ("c", "d")}}
		* Expected output: {@code "a=b&c=d"}
		*/
		@Test
		void testAsFormUrlEncodedString2() {
				ParameterList parameterList = new ParameterList();
				parameterList.add("a", "b");
				parameterList.add("c", "d");
				String expected = "a=b&c=d";
				String actual = parameterList.asFormUrlEncodedString();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link ParameterList#asFormUrlEncodedString()} method.
		* Test case for the following inputs:
		* {@code params = {("a", "b"), ("c", "d"), ("e", "f")}}
		* Expected output: {@code "a=b&c=d&e=f"}
		*/
		@Test
		void testAsForm