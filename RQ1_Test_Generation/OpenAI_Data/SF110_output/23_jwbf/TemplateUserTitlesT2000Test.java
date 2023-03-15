// TemplateUserTitlesTest.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_17;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TemplateUserTitles}.
* It contains ten unit test cases for the {@link TemplateUserTitles#processAllReturningText(String)} method.
*/
class TemplateUserTitlesTest {

		/**
		 * Test case for {@link TemplateUserTitles#processAllReturningText(String)}
		 * with the following parameters:
		 * <ul>
		 * <li>{@link TemplateUserTitles#processAllReturningText(String)}</li>
		 * <li>{@link TemplateUserTitles#generateRequest(String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#parseArticleTitles(String)}</li>
		 * <li>{@link TemplateUserTitles#parseHasMore(String)}</li>
		 * </ul>
		 *
		 * @throws VersionException
		 */
		@Test
		void testProcessAllReturningText() throws VersionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				TemplateUserTitles test = new TemplateUserTitles(bot, "Test", 0);
				String s = "";
				test.processAllReturningText(s);
				assertEquals(test.getNextPageInfo(), "");
				assertEquals(test.getTitleCollection().size(), 0);
				s = "<?xml version=\"1.0\"?>\n" + "<api>\n" + "  <query>\n" + "    <embeddedin>\n" + "      <ei pageid=\"1\" ns=\"0\" title=\"Test\" />\n" + "      <ei pageid=\"2\" ns=\"0\" title=\"Test2\" />\n" + "    </embeddedin>\n" + "  </query>\n" + "</api>";
				test.processAllReturningText(s);
				assertEquals(test.getNextPageInfo(), "");
				assertEquals(test.getTitleCollection().size(), 2);
				s = "<?xml version=\"1.0\"?>\n" + "<api>\n" + "  <query>\n" + "    <embeddedin>\n" + "      <ei pageid=\"1\" ns=\"0\" title=\"Test\" />\n" + "      <ei pageid=\"2\" ns=\"0\" title=\"Test2\" />\n" + "    </embeddedin>\n" + "  </query>\n" + "  <query-continue>\n" + "    <embeddedin eicontinue=\"Test2\" />\n" + "  </query-continue>\n" + "</api>";
				test.processAllReturningText(s);
				assertEquals(test.getNextPageInfo(), "Test2");
				assertEquals(test.getTitleCollection().size(), 2);
				s = "<?xml version=\"1.0\"?>\n" + "<api>\n" + "  <query>\n" + "    <embeddedin>\n" + "      <ei pageid=\"1\" ns=\"0\" title=\"Test\" />\n" + "      <ei pageid=\"2\" ns=\"0\" title=\"Test2\" />\n" + "    </embeddedin>\n" + "  </query>\n" + "  <query-continue>\n" + "    <embeddedin eicontinue=\"Test2\" />\n" + "  </query-continue>\n" + "</api>";
				test.processAllReturningText(s);
				assertEquals(test.getNextPageInfo(), "Test2");
				assertEquals(test.getTitleCollection().size(), 2);
				s = "<?xml version=\"1.0\"?>\n" + "<api>\n" + "  <query>\n" + "    <embeddedin>\n" + "      <ei pageid=\"1\" ns=\"0\" title=\"Test\" />\n" + "      <ei pageid=\"2\" ns=\"0\" title=\"Test2\" />\n" + "    </embeddedin>\n" + "  </query>\n" + "  <query-continue>\n" + "    <embeddedin eicontinue=\"Test2\" />\n" + "  </query-continue>\n" + "</api>";
				test.processAllReturningText(s);
				assertEquals(test.getNextPageInfo(), "Test2");
				assertEquals(test.getTitleCollection().size(), 2);
				s = "<?xml version=\"1.0\"?>\n" + "<api>\n" + "  <query>\n" + "    <embeddedin>\n" + "      <ei pageid=\"1\" ns=\"0\" title=\"Test\" />\n" + "      <ei pageid=\"2\" ns=\"0\" title=\"Test2\" />\n" + "    </embeddedin>\n" + "  </query>\n" + "  <query-continue>\n" + "    <embeddedin eicontinue=\"Test2\" />\n" + "  </query-continue>\n" + "</api>";
				test.processAllReturningText(s);
				assertEquals(test.getNextPageInfo(), "Test2");
				assertEquals(test.getTitleCollection().size(), 2);
				s = "<?xml version=\"1.0\"?>\n" + "<api>\n" + "  <query>\n" + "    <embeddedin>\n" + "      <ei pageid=\"1\" ns=\"0\" title=\"Test\" />\n" + "      <ei pageid=\"2\" ns=\"0\" title=\"Test2\" />\n" + "    </embeddedin>\n" + "  </query>\n" + "  <query-continue>\n" + "    <embeddedin eicontinue=\"Test2\" />\n" + "  </query-continue>\n" + "</api>";
				test.processAllReturningText(s);
				assertEquals(test.getNextPageInfo(), "Test2");
				assertEquals(test.getTitleCollection().size(), 2);
				s = "<?xml version=\"1.0\"?>\n" + "<api>\n" + "  <query>\n" + "    <embeddedin>\n" + "      <ei pageid=\"1\" ns=\"0\" title=\"Test\" />\n" + "      <ei pageid=\"2\" ns=\"0\" title=\"Test2\" />\n" + "    </embeddedin>\n" + "  </query>\n" + "  <query-continue>\n" + "    <embeddedin eicontinue=\"Test2\" />\n" + "  </query-continue>\n" + "</api>";
				test.processAllReturningText(s);
				assertEquals(test.getNextPageInfo(), "Test2");
				assertEquals(test.getTitleCollection().size(), 2);
				s = "<?xml version=\"1.0\"?>\n" + "<api>\n" + "  <query>\n" + "    <embeddedin>\n" + "      <ei pageid=\"1\" ns=\"0\" title=\"Test\" />\n" + "      <ei pageid=\"2\" ns=\"0\" title=\"Test2\" />\n" + "    </embeddedin>\n" + "  </query>\n" + "  <query-continue>\n" + "    <embeddedin eicontinue=\"Test2\" />\n" + "  </query-continue>\n" + "</api>";
				test.processAllReturningText(s);
				assertEquals(test.getNextPageInfo(), "Test2");
				assertEquals(test.getTitleCollection().size(), 2);
				s = "<?xml version=\"1.0\"?>\n" + "<