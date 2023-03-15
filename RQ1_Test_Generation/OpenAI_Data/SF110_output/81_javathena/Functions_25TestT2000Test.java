// Functions_25Test.java
package org.javathena.core.utiles;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.*;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#config_switch(String)} method.
*/
class Functions_25Test {

		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: "on".
		* Expected result: 1.
		*/
		@Test
		void testConfig_switch_1() {
				int result = Functions.config_switch("on");
				assertEquals(1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: "yes".
		* Expected result: 1.
		*/
		@Test
		void testConfig_switch_2() {
				int result = Functions.config_switch("yes");
				assertEquals(1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: "oui".
		* Expected result: 1.
		*/
		@Test
		void testConfig_switch_3() {
				int result = Functions.config_switch("oui");
				assertEquals(1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: "ja".
		* Expected result: 1.
		*/
		@Test
		void testConfig_switch_4() {
				int result = Functions.config_switch("ja");
				assertEquals(1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: "si".
		* Expected result: 1.
		*/
		@Test
		void testConfig_switch_5() {
				int result = Functions.config_switch("si");
				assertEquals(1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: "1".
		* Expected result: 1.
		*/
		@Test
		void testConfig_switch_6() {
				int result = Functions.config_switch("1");
				assertEquals(1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: "off".
		* Expected result: 0.
		*/
		@Test
		void testConfig_switch_7() {
				int result = Functions.config_switch("off");
				assertEquals(0, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: "no".
		* Expected result: 0.
		*/
		@Test
		void testConfig_switch_8() {
				int result = Functions.config_switch("no");
				assertEquals(0, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: "non".
		* Expected result: 0.
		*/
		@Test
		void testConfig_switch_9() {
				int result = Functions.config_switch("non");
				assertEquals(0, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: "nein".
		* Expected result: 0.
		*/
		@Test
		void testConfig_switch_10() {
				int result = Functions.config_switch("nein");
				assertEquals(0, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: "0".
		* Expected result: 0.
		*/
		@Test
		void testConfig_switch_11() {
				int result = Functions.config_switch("0");
				assertEquals(0, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: "".
		* Expected result: -1.
		*/
		@Test
		void testConfig_switch_12() {
				int result = Functions.config_switch("");
				assertEquals(-1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: " ".
		* Expected result: -1.
		*/
		@Test
		void testConfig_switch_13() {
				int result = Functions.config_switch(" ");
				assertEquals(-1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: ";".
		* Expected result: -1.
		*/
		@Test
		void testConfig_switch_14() {
				int result = Functions.config_switch(";");
				assertEquals(-1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: "on;".
		* Expected result: -1.
		*/
		@Test
		void testConfig_switch_15() {
				int result = Functions.config_switch("on;");
				assertEquals(-1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: ";on".
		* Expected result: -1.
		*/
		@Test
		void testConfig_switch_16() {
				int result = Functions.config_switch(";on");
				assertEquals(-1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: ";on;".
		* Expected result: -1.
		*/
		@Test
		void testConfig_switch_17() {
				int result = Functions.config_switch(";on;");
				assertEquals(-1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: ";on;".
		* Expected result: -1.
		*/
		@Test
		void testConfig_switch_18() {
				int result = Functions.config_switch(";on;");
				assertEquals(-1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: ";on;".
		* Expected result: -1.
		*/
		@Test
		void testConfig_switch_19() {
				int result = Functions.config_switch(";on;");
				assertEquals(-1, result);
		}
		
		/**
		* Test case for {@link Functions#config_switch(String)} method.
		* Test data: ";on;".
		* Expected result: -1.
		*/
		@Test