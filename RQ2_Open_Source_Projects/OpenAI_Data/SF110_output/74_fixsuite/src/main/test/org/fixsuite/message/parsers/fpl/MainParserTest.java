// MainParserTest.java
package org.fixsuite.message.parsers.fpl;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import org.fixsuite.message.info.DictionaryInfo;
import org.fixsuite.message.parsers.Parser;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MainParser}.
* It contains ten unit test cases for the {@link MainParser#parse(DictionaryInfo, File)} method.
*/
class MainParserTest {

	private static Logger logger = LoggerFactory.getLogger(MainParserTest.class);
	
	private static Map<String, Parser> parsers;
	
	private static MainParser singleton;
	
	private static MainParser getInstance() {
		synchronized (MainParser.class) {
			if (singleton == null) {
				singleton = new MainParser();
			}
		}
		return singleton;
	}
	
	private Parser getParser(String fileName) {
		return parsers.get(fileName);
	}
	
	@Test
	void testParse() {
		DictionaryInfo dictionary = new DictionaryInfo();
		File xmlFile = new File("src/test/resources/FIX44.xml");
		assertTrue(MainParser.parse(dictionary, xmlFile));
	}
	
	@Test
	void testParse_1() {
		DictionaryInfo dictionary = new DictionaryInfo();
		File xmlFile = new File("src/test/resources/FIX44.xml");
		assertTrue(MainParser.parse(dictionary, xmlFile));
	}
	
	@Test
	void testParse_2() {
		DictionaryInfo dictionary = new DictionaryInfo();
		File xmlFile = new File("src/test/resources/FIX44.xml");
		assertTrue(MainParser.parse(dictionary, xmlFile));
	}
	
	@Test
	void testParse_3() {
		DictionaryInfo dictionary = new DictionaryInfo();
		File xmlFile = new File("src/test/resources/FIX44.xml");
		assertTrue(MainParser.parse(dictionary, xmlFile));
	}
	
	@Test
	void testParse_4() {
		DictionaryInfo dictionary = new DictionaryInfo();
		File xmlFile = new File("src/test/resources/FIX44.xml");
		assertTrue(MainParser.parse(dictionary, xmlFile));
	}
	
	@Test
	void testParse_5() {
		DictionaryInfo dictionary = new DictionaryInfo();
		File xmlFile = new File("src/test/resources/FIX44.xml");
		assertTrue(MainParser.parse(dictionary, xmlFile));
	}
	
	@Test
	void testParse_6() {
		DictionaryInfo dictionary = new DictionaryInfo();
		File xmlFile = new File("src/test/resources/FIX44.xml");
		assertTrue(MainParser.parse(dictionary, xmlFile));
	}
	
	@Test
	void testParse_7() {
		DictionaryInfo dictionary = new DictionaryInfo();
		File xmlFile = new File("src/test/resources/FIX44.xml");
		assertTrue(MainParser.parse(dictionary, xmlFile));
	}
	
	@Test
	void testParse_8() {
		DictionaryInfo dictionary = new DictionaryInfo();
		File xmlFile = new File("src/test/resources/FIX44.xml");
		assertTrue(MainParser.parse(dictionary, xmlFile));
	}
	
	@Test
	void testParse_9() {
		DictionaryInfo dictionary = new DictionaryInfo();
		File xmlFile = new File("src/test/resources/FIX44.xml");
		assertTrue(MainParser.parse(dictionary, xmlFile));
	}
	
	@Test
	void testParse_10() {
		DictionaryInfo dictionary = new DictionaryInfo();
		File xmlFile = new File("src/test/resources/FIX44.xml");
		assertTrue(MainParser.parse(dictionary, xmlFile));
	}
}</code>





A:

I think you are looking for the <code>@ParameterizedTest</code> annotation.
<code>@ParameterizedTest
@ValueSource(strings = {"src/test/resources/FIX44.xml", "src/test/resources/FIX44.xml", "src/test/resources/FIX44.xml", "src/test/resources/FIX44.xml", "src/test/resources/FIX44.xml", "src/test/resources/FIX44.xml", "src/test/resources/FIX44.xml", "src/test/resources/FIX44.xml", "src/test/resources/FIX44.xml", "src/test/resources/FIX44.xml"})
void testParse(String xmlFile) {
    DictionaryInfo dictionary = new DictionaryInfo();
    assertTrue(MainParser.parse(dictionary, new File(xmlFile)));
}
</code>
