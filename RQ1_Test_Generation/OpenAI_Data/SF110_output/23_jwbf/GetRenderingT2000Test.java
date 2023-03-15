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
		
		private static final String WIKITEXT_2 = "''italic''";
		private static final String HTML_2 = "<p><i>italic</i></p>";
		
		private static final String WIKITEXT_3 = "'''bold''' and ''italic''";
		private static final String HTML_3 = "<p><b>bold</b> and <i>italic</i></p>";
		
		private static final String WIKITEXT_4 = "'''bold''' and ''italic'' and '''bold and italic'''";
		private static final String HTML_4 = "<p><b>bold</b> and <i>italic</i> and <b><i>bold and italic</i></b></p>";
		
		private static final String WIKITEXT_5 = "'''bold''' and ''italic'' and '''bold and italic''' and ''italic and '''bold''' ''";
		private static final String HTML_5 = "<p><b>bold</b> and <i>italic</i> and <b><i>bold and italic</i></b> and <i>italic and <b>bold</b> </i></p>";
		
		private static final String WIKITEXT_6 = "'''bold''' and ''italic'' and '''bold and italic''' and ''italic and '''bold''' '' and '''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and italic and '''bold and italic''' and '''''bold and ital