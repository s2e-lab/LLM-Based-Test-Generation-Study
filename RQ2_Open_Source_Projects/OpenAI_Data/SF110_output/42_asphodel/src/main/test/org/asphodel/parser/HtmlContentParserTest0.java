// HtmlContentParserTest0.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlContentParser}.
* It contains ten unit test cases for the {@link HtmlContentParser#extractPlainText(String)} method.
*/
class HtmlContentParserTest0 {
private static Log log = LogFactory.getLog(HtmlContentParserTest0.class);
		private static final String HTML_CONTENT = "<html><head><title>Test</title></head><body><p>Test</p></body></html>";
		private static final String PLAIN_TEXT = "Test Test";
		private static final String EMPTY_STRING = "";
		private static final String NULL_STRING = null;
		private static final String HTML_CONTENT_WITH_SPACE = " <html><head><title>Test</title></head><body><p>Test</p></body></html> ";
		private static final String HTML_CONTENT_WITH_TAB = "\t<html><head><title>Test</title></head><body><p>Test</p></body></html>\t";
		private static final String HTML_CONTENT_WITH_NEWLINE = "\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\n";
		private static final String HTML_CONTENT_WITH_SPACE_TAB_NEWLINE = " \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n ";
		private static final String HTML_CONTENT_WITH_SPACE_TAB_NEWLINE_AND_OTHER_CHARACTERS = " \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~";
		private static final String HTML_CONTENT_WITH_SPACE_TAB_NEWLINE_AND_OTHER_CHARACTERS_AT_THE_BEGINNING = "!@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n ";
		private static final String HTML_CONTENT_WITH_SPACE_TAB_NEWLINE_AND_OTHER_CHARACTERS_AT_THE_END = " \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~";
		private static final String HTML_CONTENT_WITH_SPACE_TAB_NEWLINE_AND_OTHER_CHARACTERS_AT_THE_BEGINNING_AND_THE_END = "!@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~";
		private static final String HTML_CONTENT_WITH_SPACE_TAB_NEWLINE_AND_OTHER_CHARACTERS_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE = "!@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~";
		private static final String HTML_CONTENT_WITH_SPACE_TAB_NEWLINE_AND_OTHER_CHARACTERS_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE_AND_AT_THE_BEGINNING_AND_THE_END_OF_EACH_LINE = "!@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~";
		private static final String HTML_CONTENT_WITH_SPACE_TAB_NEWLINE_AND_OTHER_CHARACTERS_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE_AND_AT_THE_BEGINNING_AND_THE_END_OF_EACH_LINE_AND_IN_THE_MIDDLE_OF_EACH_LINE = "!@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|;':\",./<>?`~";
		private static final String HTML_CONTENT_WITH_SPACE_TAB_NEWLINE_AND_OTHER_CHARACTERS_AT_THE_BEGINNING_AND_THE_END_AND_IN_THE_MIDDLE_AND_AT_THE_BEGINNING_AND_THE_END_OF_EACH_LINE_AND_IN_THE_MIDDLE_OF_EACH_LINE_AND_AT_THE_BEGINNING_AND_THE_END_OF_EACH_WORD = "!@#$%^&*()_+-=[]{}\\|;':\",./<>?`~ \t\n<html><head><title>Test</title></head><body><p>Test</p></body></html>\t\n !@#$%^&*()_+-=[]{}\\|