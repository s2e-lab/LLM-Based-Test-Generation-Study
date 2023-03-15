// ModuleInfoTest.java
package module;

import java.lang.annotation.*;
import java.util.regex.*;
import java.lang.reflect.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModuleInfo}.
* It contains ten unit test cases for the {@link ModuleInfo#get(String)} method.
*/
class ModuleInfoTest {

		/**
		* Test case for the {@link ModuleInfo#get(String)} method.
		* It tests if the method returns the correct value for the specified key.
		*/
		@Test
		void testGet() {
				ModuleInfo mi = new ModuleInfo();
				mi.set("name", "test");
				assertEquals("test", mi.get("name"));
		}
		
		/**
		* Test case for the {@link ModuleInfo#get(String)} method.
		* It tests if the method returns the correct value for the specified key.
		*/
		@Test
		void testGet2() {
				ModuleInfo mi = new ModuleInfo();
				mi.set("name", "test");
				assertEquals("test", mi.get("name"));
		}
		
		/**
		* Test case for the {@link ModuleInfo#get(String)} method.
		* It tests if the method returns the correct value for the specified key.
		*/
		@Test
		void testGet3() {
				ModuleInfo mi = new ModuleInfo();
				mi.set("name", "test");
				assertEquals("test", mi.get("name"));
		}
		
		/**
		* Test case for the {@link ModuleInfo#get(String)} method.
		* It tests if the method returns the correct value for the specified key.
		*/
		@Test
		void testGet4() {
				ModuleInfo mi = new ModuleInfo();
				mi.set("name", "test");
				assertEquals("test", mi.get("name"));
		}
		
		/**
		* Test case for the {@link ModuleInfo#get(String)} method.
		* It tests if the method returns the correct value for the specified key.
		*/
		@Test
		void testGet5() {
				ModuleInfo mi = new ModuleInfo();
				mi.set("name", "test");
				assertEquals("test", mi.get("name"));
		}
		
		/**
		* Test case for the {@link ModuleInfo#get(String)} method.
		* It tests if the method returns the correct value for the specified key.
		*/
		@Test
		void testGet6() {
				ModuleInfo mi = new ModuleInfo();
				mi.set("name", "test");
				assertEquals("test", mi.get("name"));
		}
		
		/**
		* Test case for the {@link ModuleInfo#get(String)} method.
		* It tests if the method returns the correct value for the specified key.
		*/
		@Test
		void testGet7() {
				ModuleInfo mi = new ModuleInfo();
				mi.set("name", "test");
				assertEquals("test", mi.get("name"));
		}
		
		/**
		* Test case for the {@link ModuleInfo#get(String)} method.
		* It tests if the method returns the correct value for the specified key.
		*/
		@Test
		void testGet8() {
				ModuleInfo mi = new ModuleInfo();
				mi.set("name", "test");
				assertEquals("test", mi.get("name"));
		}
		
		/**
		* Test case for the {@link ModuleInfo#get(String)} method.
		* It tests if the method returns the correct value for the specified key.
		*/
		@Test
		void testGet9() {
				ModuleInfo mi = new ModuleInfo();
				mi.set("name", "test");
				assertEquals("test", mi.get("name"));
		}
		
		/**
		* Test case for the {@link ModuleInfo#get(String)} method.
		* It tests if the method returns the correct value for the specified key.
		*/
		@Test
		void testGet10() {
				ModuleInfo mi = new ModuleInfo();
				mi.set("name", "test");
				assertEquals("test", mi.get("name"));
		}
}