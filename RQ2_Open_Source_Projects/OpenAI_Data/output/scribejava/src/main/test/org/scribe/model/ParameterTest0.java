// ParameterTest0.java
package org.scribe.model;

import org.scribe.utils.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Parameter}.
* It contains ten unit test cases for the {@link Parameter#asUrlEncodedPair()} method.
*/
class ParameterTest0 {

		@Test
		public void testAsUrlEncodedPair0() throws Throwable {
				Parameter parameter = new Parameter("", "");
				String result = parameter.asUrlEncodedPair();
				assertEquals("=", result);
		}
		
		@Test
		public void testAsUrlEncodedPair1() throws Throwable {
				Parameter parameter = new Parameter("", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair2() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=", result);
		}
		
		@Test
		public void testAsUrlEncodedPair3() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair4() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair5() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair6() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair7() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair8() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
		
		@Test
		public void testAsUrlEncodedPair9() throws Throwable {
				Parameter parameter = new Parameter("testParameterkey", "testParametervalue");
				String result = parameter.asUrlEncodedPair();
				assertEquals("testParameterkey=testParametervalue", result);
		}
}