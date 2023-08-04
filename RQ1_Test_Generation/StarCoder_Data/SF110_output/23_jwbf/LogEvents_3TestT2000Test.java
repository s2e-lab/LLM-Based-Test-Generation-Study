// LogEvents_3Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.LogItem;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogEvents}.
* It contains ten unit test cases for the {@link LogEvents#iterator()} method.
*/
class LogEvents_3Test {
	/**
			* Test method for {@link LogEvents#iterator()}.
			* @throws VersionException if the version is not supported
			* @throws ActionException if the action fails
			* @throws ProcessException if the process fails
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testIterator() throws VersionException, ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost");
				LogEvents le = new LogEvents(bot, LogEvents.MOVE);
				Iterator<LogItem> it = le.iterator();
				assertTrue(it.hasNext());
				LogItem li = it.next();
				assertNotNull(li);
				assertNotNull(li.getTitle());
				assertNotNull(li.getType());
				assertNotNull(li.getUser());
				assertTrue(it.hasNext());
				li = it.next();
				assertNotNull(li);
				assertNotNull(li.getTitle());
				assertNotNull(li.getType());
				assertNotNull(li.getUser());
				assertTrue(it.hasNext());
				li = it.next();
				assertNotNull(li);
				assertNotNull(li.getTitle());
				assertNotNull(li.getType());
				assertNotNull(li.getUser());
				assertTrue(it.hasNext());
				li = it.next();
				assertNotNull(li);
				assertNotNull(li.getTitle());
				assertNotNull(li.getType());
				assertNotNull(li.getUser());
				assertTrue(it.hasNext());
				li = it.next();
				assertNotNull(li);
				assertNotNull(li.getTitle());
				assertNotNull(li.getType());
				assertNotNull(li.getUser());
				assertTrue(it.hasNext());
				li = it.next();
				assertNotNull(li);
				assertNotNull(li.getTitle());
				assertNotNull(li.getType());
				assertNotNull(li.getUser());
				assertTrue(it.hasNext());
				li = it.next();
				assertNotNull(li);
				assertNotNull(li.getTitle());
				assertNotNull(li.getType());
				assertNotNull(li.getUser());
				assertTrue(it.hasNext());
				li = it.next();
				assertNotNull(li);
				assertNotNull(li.getTitle());
				assertNotNull(li.getType());
				assertNotNull(li.getUser());
				assertTrue(it.hasNext());
				li = it.next();
				assertNotNull(li);
				assertNotNull(li.getTitle());
				assertNotNull(li.getType());
				assertNotNull(li.getUser());
				assertFalse(it.hasNext());
			}
		}