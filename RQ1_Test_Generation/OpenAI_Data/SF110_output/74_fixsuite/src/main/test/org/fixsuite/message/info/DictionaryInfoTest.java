// DictionaryInfoTest.java
package org.fixsuite.message.info;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DictionaryInfo}.
* It contains ten unit test cases for the {@link DictionaryInfo#isLoaded()} method.
*/
class DictionaryInfoTest {

		/**
		 * Test case for {@link DictionaryInfo#isLoaded()} method.
		 * It tests the case when the dictionary is loaded.
		 */
		@Test
		void testIsLoaded() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				assertTrue(dictionaryInfo.isLoaded());
		}
		
		/**
		 * Test case for {@link DictionaryInfo#isLoaded()} method.
		 * It tests the case when the dictionary is not loaded.
		 */
		@Test
		void testIsNotLoaded() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				assertFalse(dictionaryInfo.isLoaded());
		}
		
		/**
		 * Test case for {@link DictionaryInfo#isLoaded()} method.
		 * It tests the case when the dictionary is not loaded.
		 */
		@Test
		void testIsNotLoaded2() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				assertFalse(dictionaryInfo.isLoaded());
		}
		
		/**
		 * Test case for {@link DictionaryInfo#isLoaded()} method.
		 * It tests the case when the dictionary is not loaded.
		 */
		@Test
		void testIsNotLoaded3() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				assertFalse(dictionaryInfo.isLoaded());
		}
		
		/**
		 * Test case for {@link DictionaryInfo#isLoaded()} method.
		 * It tests the case when the dictionary is not loaded.
		 */
		@Test
		void testIsNotLoaded4() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				assertFalse(dictionaryInfo.isLoaded());
		}
		
		/**
		 * Test case for {@link DictionaryInfo#isLoaded()} method.
		 * It tests the case when the dictionary is not loaded.
		 */
		@Test
		void testIsNotLoaded5() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				assertFalse(dictionaryInfo.isLoaded());
		}
		
		/**
		 * Test case for {@link DictionaryInfo#isLoaded()} method.
		 * It tests the case when the dictionary is not loaded.
		 */
		@Test
		void testIsNotLoaded6() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				assertFalse(dictionaryInfo.isLoaded());
		}
		
		/**
		 * Test case for {@link DictionaryInfo#isLoaded()} method.
		 * It tests the case when the dictionary is not loaded.
		 */
		@Test
		void testIsNotLoaded7() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				assertFalse(dictionaryInfo.isLoaded());
		}
		
		/**
		 * Test case for {@link DictionaryInfo#isLoaded()} method.
		 * It tests the case when the dictionary is not loaded.
		 */
		@Test
		void testIsNotLoaded8() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				assertFalse(dictionaryInfo.isLoaded());
		}
		
		/**
		 * Test case for {@link DictionaryInfo#isLoaded()} method.
		 * It tests the case when the dictionary is not loaded.
		 */
		@Test
		void testIsNotLoaded9() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				assertFalse(dictionaryInfo.isLoaded());
		}
		
		/**
		 * Test case for {@link DictionaryInfo#isLoaded()} method.
		 * It tests the case when the dictionary is not loaded.
		 */
		@Test
		void testIsNotLoaded10() {
				DictionaryInfo dictionaryInfo = new DictionaryInfo("FIX.4.2");
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				dictionaryInfo.incrementLoadCount();
				assertFalse(dictionaryInfo.isLoaded());
		}
}

// FieldInfo.java
/**
 * FieldInfo.java 11:33:45 PM Apr 21, 2008
 *
 * <PRE>
 * Copyright (c) 2008, Jan Amoyo
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions are met:
 *
 *     - Redistributions of source code must retain the above copyright
 *       notice, this list of conditions and the following disclaimer.
 *     - Redistributions in binary form must reproduce the above copyright
 *       notice, this list of conditions