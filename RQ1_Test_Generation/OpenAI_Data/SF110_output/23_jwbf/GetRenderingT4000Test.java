// GetRenderingTest.java
package net.sourceforge.jwbf.mediawiki.actions.misc;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Iterator;
import java.util.NoSuchElementException;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetRendering}.
* It contains ten unit test cases for the {@link GetRendering#processAllReturningText(String)} method.
*/
class GetRenderingTest {

		private static final String WIKITEXT = "'''bold'''";
		private static final String HTML = "<p><b>bold</b></p>";
		
		private static final String WIKITEXT_2 = "'''bold'''\n\n''italic''";
		private static final String HTML_2 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>";
		
		private static final String WIKITEXT_3 = "'''bold'''\n\n''italic''\n\n'''bold'''";
		private static final String HTML_3 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>";
		
		private static final String WIKITEXT_4 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''";
		private static final String HTML_4 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>";
		
		private static final String WIKITEXT_5 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''";
		private static final String HTML_5 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>";
		
		private static final String WIKITEXT_6 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''";
		private static final String HTML_6 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>";
		
		private static final String WIKITEXT_7 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''";
		private static final String HTML_7 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>";
		
		private static final String WIKITEXT_8 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''";
		private static final String HTML_8 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>";
		
		private static final String WIKITEXT_9 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''";
		private static final String HTML_9 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>";
		
		private static final String WIKITEXT_10 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''";
		private static final String HTML_10 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>";
		
		private static final String WIKITEXT_11 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''";
		private static final String HTML_11 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>";
		
		private static final String WIKITEXT_12 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''";
		private static final String HTML_12 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>";
		
		private static final String WIKITEXT_13 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''";
		private static final String HTML_13 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>";
		
		private static final String WIKITEXT_14 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''";
		private static final String HTML_14 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>";
		
		private static final String WIKITEXT_15 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''";
		private static final String HTML_15 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>";
		
		private static final String WIKITEXT_16 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''";
		private static final String HTML_16 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>";
		
		private static final String WIKITEXT_17 = "'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''\n\n''italic''\n\n'''bold'''";
		private static final String HTML_17 = "<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><i>italic</i></p>\n\n<p><b>bold</b></p>\n\n<p><