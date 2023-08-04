// LogEvents_1Test.java
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
* It contains ten unit test cases for the {@link LogEvents#hasNext()} method.
*/
class LogEvents_1Test {
	/**
			* Test method for {@link LogEvents#hasNext()}.
			* @throws VersionException if the version is not supported
			* @throws ActionException if the action fails
			* @throws ProcessException if the process fails
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext() throws VersionException, ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost");
				LogEvents le = new LogEvents(bot, "upload");
				assertTrue(le.hasNext());
			}

			/**
			* Test method for {@link LogEvents#hasNext()}.
			* @throws VersionException if the version is not supported
			* @throws ActionException if the action fails
			* @throws ProcessException if the process fails
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_0() throws VersionException, ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost");
				LogEvents le = new LogEvents(bot, "upload");
				le.next();
				assertTrue(le.hasNext());
			}

			/**
			* Test method for {@link LogEvents#hasNext()}.
			* @throws VersionException if the version is not supported
			* @throws ActionException if the action fails
			* @throws ProcessException if the process fails
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_1() throws VersionException, ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost");
				LogEvents le = new LogEvents(bot, "upload");
				le.next();
				le.next();
				assertTrue(le.hasNext());
			}

			/**
			* Test method for {@link LogEvents#hasNext()}.
			* @throws VersionException if the version is not supported
			* @throws ActionException if the action fails
			* @throws ProcessException if the process fails
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_2() throws VersionException, ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost");
				LogEvents le = new LogEvents(bot, "upload");
				le.next();
				le.next();
				le.next();
				assertTrue(le.hasNext());
			}

			/**
			* Test method for {@link LogEvents#hasNext()}.
			* @throws VersionException if the version is not supported
			* @throws ActionException if the action fails
			* @throws ProcessException if the process fails
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_3() throws VersionException, ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost");
				LogEvents le = new LogEvents(bot, "upload");
				le.next();
				le.next();
				le.next();
				le.next();
				assertTrue(le.hasNext());
			}

			/**
			* Test method for {@link LogEvents#hasNext()}.
			* @throws VersionException if the version is not supported
			* @throws ActionException if the action fails
			* @throws ProcessException if the process fails
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_4() throws VersionException, ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost");
				LogEvents le = new LogEvents(bot, "upload");
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				assertTrue(le.hasNext());
			}

			/**
			* Test method for {@link LogEvents#hasNext()}.
			* @throws VersionException if the version is not supported
			* @throws ActionException if the action fails
			* @throws ProcessException if the process fails
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_5() throws VersionException, ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost");
				LogEvents le = new LogEvents(bot, "upload");
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				assertTrue(le.hasNext());
			}

			/**
			* Test method for {@link LogEvents#hasNext()}.
			* @throws VersionException if the version is not supported
			* @throws ActionException if the action fails
			* @throws ProcessException if the process fails
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_6() throws VersionException, ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost");
				LogEvents le = new LogEvents(bot, "upload");
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				assertTrue(le.hasNext());
			}

			/**
			* Test method for {@link LogEvents#hasNext()}.
			* @throws VersionException if the version is not supported
			* @throws ActionException if the action fails
			* @throws ProcessException if the process fails
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_7() throws VersionException, ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost");
				LogEvents le = new LogEvents(bot, "upload");
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				assertTrue(le.hasNext());
			}

			/**
			* Test method for {@link LogEvents#hasNext()}.
			* @throws VersionException if the version is not supported
			* @throws ActionException if the action fails
			* @throws ProcessException if the process fails
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_8() throws VersionException, ActionException, ProcessException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost");
				LogEvents le = new LogEvents(bot, "upload");
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				le.next();
				assertTrue(le.hasNext());
			}

			/**
			* Test method for {@link LogEvents#hasNext()}.
			* @throws VersionException if the version is not supported
			* @throws ActionException if the action fails
			* @throws ProcessException if the process fails
			*/
			@Test
			@SupportedBy({ MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
			void testHasNext_9() throws VersionException, ActionException, ProcessException {
				MediaWiki