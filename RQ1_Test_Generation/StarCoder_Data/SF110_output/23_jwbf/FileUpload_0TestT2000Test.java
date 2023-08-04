// FileUpload_0Test.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.FileNotFoundException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.SimpleFile;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FileUpload}.
* It contains ten unit test cases for the {@link FileUpload#hasMoreMessages()} method.
*/
class FileUpload_0Test {
	@Test
			void test0() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki");
				FileUpload a = new FileUpload(bot, "src/test/resources/test.txt");
				assertTrue(a.hasMoreMessages());
			}

			@Test
			void test1() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki");
				FileUpload a = new FileUpload(bot, "src/test/resources/test.txt");
				a.getNextMessage();
				assertTrue(a.hasMoreMessages());
			}

			@Test
			void test2() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki");
				FileUpload a = new FileUpload(bot, "src/test/resources/test.txt");
				a.getNextMessage();
				a.getNextMessage();
				assertFalse(a.hasMoreMessages());
			}

			@Test
			void test3() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki");
				FileUpload a = new FileUpload(bot, "src/test/resources/test.txt");
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				assertFalse(a.hasMoreMessages());
			}

			@Test
			void test4() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki");
				FileUpload a = new FileUpload(bot, "src/test/resources/test.txt");
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				assertFalse(a.hasMoreMessages());
			}

			@Test
			void test5() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki");
				FileUpload a = new FileUpload(bot, "src/test/resources/test.txt");
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				assertFalse(a.hasMoreMessages());
			}

			@Test
			void test6() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki");
				FileUpload a = new FileUpload(bot, "src/test/resources/test.txt");
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				assertFalse(a.hasMoreMessages());
			}

			@Test
			void test7() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki");
				FileUpload a = new FileUpload(bot, "src/test/resources/test.txt");
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				assertFalse(a.hasMoreMessages());
			}

			@Test
			void test8() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki");
				FileUpload a = new FileUpload(bot, "src/test/resources/test.txt");
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				assertFalse(a.hasMoreMessages());
			}

			@Test
			void test9() {
				MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/mediawiki");
				FileUpload a = new FileUpload(bot, "src/test/resources/test.txt");
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				a.getNextMessage();
				assertFalse(a.hasMoreMessages());
			}
}
