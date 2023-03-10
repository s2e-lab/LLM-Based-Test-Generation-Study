// MParserFactoryTest.java
package com.imsmart.parser;

import com.imsmart.misc.MLog;
import com.imsmart.misc.MProperties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MParserFactory}.
* It contains ten unit test cases for the {@link MParserFactory#getParser()} method.
*/
class MParserFactoryTest {

		private MLog logger = MLog.getInstance();
		
		@Test
		void testGetParser() {
				MProperties.getInstance().setPropertyValue(MProperties.METADATA_FILE_TYPE, "CSV");
				MProperties.getInstance().setPropertyValue(MProperties.METADATA_SEPERATOR, ",");
				MParser parser = MParserFactory.getParser();
				assertNotNull(parser);
				assertTrue(parser instanceof MCSVParser);
		}
}</code>



I am using JUnit 5.6.2 and Mockito 3.3.3.
