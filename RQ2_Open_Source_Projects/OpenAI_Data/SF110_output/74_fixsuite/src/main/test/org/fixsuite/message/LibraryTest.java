// LibraryTest.java
package org.fixsuite.message;

import java.io.File;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import org.fixsuite.message.info.DictionaryInfo;
import org.fixsuite.message.parsers.fpl.MainParser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Library}.
* It contains ten unit test cases for the {@link Library#loadFromDirectory(String)} method.
*/
class LibraryTest {

	private static Logger logger = LoggerFactory.getLogger(LibraryTest.class);
	
	private static final String FIELDS_FILE_NAME = "Fields.xml";
	
	private static final String ENUMS_FILE_NAME = "Enums.xml";
	
	private static final String COMPONENTS_FILE_NAME = "Components.xml";
	
	private static final String MSG_TYPE_FILE_NAME = "MsgType.xml";
	
	private static final String MSG_CONTENTS_FILE_NAME = "MsgContents.xml";
	
	private static final int FIELDS_FILE_KEY = 1;
	
	private static final int ENUMS_FILE_KEY = 2;
	
	private static final int COMPONENTS_FILE_KEY = 3;
	
	private static final int MSG_TYPE_FILE_KEY = 4;
	
	private static final int MSG_CONTENTS_FILE_KEY = 5;
	
	private Map<String, DictionaryInfo> dictionaries;
	
	public LibraryTest() {
		dictionaries = new TreeMap<String, DictionaryInfo>();
	}
	
	@Test
	void testLoadFromDirectory() {
		boolean result = true;
		long startTime = System.currentTimeMillis();
		if (!dictionaries.isEmpty()) {
			logger.debug("Unloading previous dictionaries");
			dictionaries.clear();
		}
		// Cleanup JVM before loading
		System.gc();
		long startMemory = Runtime.getRuntime().freeMemory();
		File path = new File("C:\\Users\\jramoyo\\Desktop\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\FIXSuite\\