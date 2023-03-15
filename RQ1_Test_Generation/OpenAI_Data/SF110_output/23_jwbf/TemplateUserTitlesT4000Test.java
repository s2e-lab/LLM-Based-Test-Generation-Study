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
		 * <li>{@link TemplateUserTitles#processAllReturningText(String)}</li>
		 * <li>{@link TemplateUserTitles#processAllReturningText(String)}</li>
		 * <li>{@link TemplateUserTitles#processAllReturningText(String)}</li>
		 * <li>{@link TemplateUserTitles#processAllReturningText(String)}</li>
		 * <li>{@link TemplateUserTitles#processAllReturningText(String)}</li>
		 * <li>{@link TemplateUserTitles#processAllReturningText(String)}</li>
		 * <li>{@link TemplateUserTitles#processAllReturningText(String)}</li>
		 * <li>{@link TemplateUserTitles#processAllReturningText(String)}</li>
		 * <li>{@link TemplateUserTitles#processAllReturningText(String)}</li>
		 * </ul>
		 */
		@Test
		void testProcessAllReturningText() {
				// TODO: implement this test
		}
		
		/**
		 * Test case for {@link TemplateUserTitles#parseArticleTitles(String)}
		 * with the following parameters:
		 * <ul>
		 * <li>{@link TemplateUserTitles#parseArticleTitles(String)}</li>
		 * <li>{@link TemplateUserTitles#parseArticleTitles(String)}</li>
		 * <li>{@link TemplateUserTitles#parseArticleTitles(String)}</li>
		 * <li>{@link TemplateUserTitles#parseArticleTitles(String)}</li>
		 * <li>{@link TemplateUserTitles#parseArticleTitles(String)}</li>
		 * <li>{@link TemplateUserTitles#parseArticleTitles(String)}</li>
		 * <li>{@link TemplateUserTitles#parseArticleTitles(String)}</li>
		 * <li>{@link TemplateUserTitles#parseArticleTitles(String)}</li>
		 * <li>{@link TemplateUserTitles#parseArticleTitles(String)}</li>
		 * <li>{@link TemplateUserTitles#parseArticleTitles(String)}</li>
		 * </ul>
		 */
		@Test
		void testParseArticleTitles() {
				// TODO: implement this test
		}
		
		/**
		 * Test case for {@link TemplateUserTitles#parseHasMore(String)}
		 * with the following parameters:
		 * <ul>
		 * <li>{@link TemplateUserTitles#parseHasMore(String)}</li>
		 * <li>{@link TemplateUserTitles#parseHasMore(String)}</li>
		 * <li>{@link TemplateUserTitles#parseHasMore(String)}</li>
		 * <li>{@link TemplateUserTitles#parseHasMore(String)}</li>
		 * <li>{@link TemplateUserTitles#parseHasMore(String)}</li>
		 * <li>{@link TemplateUserTitles#parseHasMore(String)}</li>
		 * <li>{@link TemplateUserTitles#parseHasMore(String)}</li>
		 * <li>{@link TemplateUserTitles#parseHasMore(String)}</li>
		 * <li>{@link TemplateUserTitles#parseHasMore(String)}</li>
		 * <li>{@link TemplateUserTitles#parseHasMore(String)}</li>
		 * </ul>
		 */
		@Test
		void testParseHasMore() {
				// TODO: implement this test
		}
		
		/**
		 * Test case for {@link TemplateUserTitles#generateRequest(String, String, String)}
		 * with the following parameters:
		 * <ul>
		 * <li>{@link TemplateUserTitles#generateRequest(String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#generateRequest(String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#generateRequest(String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#generateRequest(String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#generateRequest(String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#generateRequest(String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#generateRequest(String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#generateRequest(String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#generateRequest(String, String, String)}</li>
		 * <li>{@link TemplateUserTitles#generateRequest(String, String, String)}</li>
		 * </ul>
		 */
		@Test
		void testGenerateRequest() {
				// TODO: implement this test
		}
		
		/**
		 * Test case for {@link TemplateUserTitles#prepareCollection()}
		 * with the following parameters:
		 * <ul>
		 * <li>{@link TemplateUserTitles#prepareCollection()}</li>
		 * <li>{@link TemplateUserTitles#prepareCollection()}</li>
		 * <li>{@link TemplateUserTitles#prepareCollection()}</li>
		 * <li>{@link TemplateUserTitles#prepareCollection()}</li>
		 * <li>{@link TemplateUserTitles#prepareCollection()}</li>
		 * <li>{@link TemplateUserTitles#prepareCollection()}</li>
		 * <li>{@link TemplateUserTitles#prepareCollection()}</li>
		 * <li>{@link TemplateUserTitles#prepareCollection()}</li>
		 * <li>{@link TemplateUserTitles#prepareCollection()}</li>
		 * <li>{@link TemplateUserTitles#prepareCollection()}</li>
		 * </ul>
		 */
		@Test
		void testPrepareCollection() {
				// TODO: implement this test
		}
		
		/**
		 * Test case for {@link TemplateUserTitles#clone()}
		 * with the following parameters:
		 * <ul>
		 * <li>{@link TemplateUserTitles#clone()}</li>
		 * <li>{@link TemplateUserTitles#clone()}</li>
		 * <li>{@link TemplateUserTitles#clone()}</li>
		 * <li>{@link TemplateUserTitles#clone()}</li>
		 * <li>{@link TemplateUserTitles#clone()}</li>
		 * <li>{@link TemplateUserTitles#clone()}</li>
		 * <li>{@link TemplateUserTitles#clone()}</li>
		 * <li>{@link TemplateUserTitles#clone()}</li>
		 * <li>{@link TemplateUserTitles#clone()}</li>
		 * <li>{@link TemplateUserTitles#clone()}</li>
		 * </ul>
		 */
		@Test
		void testClone() {
				// TODO: implement this test
		}
		
}

// TitleQuery.java
/*
 * Copyright 2007 Tobias Knerr.
 * 
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 * 
 * http://www.apache.org/licenses/LICENSE-2.0
 * 
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 * 
 * Contributors:
 * Tobias Knerr
 * 
 */
package net.sourceforge.jwbf.mediawiki.actions.queries;

import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Vector;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;

/**
 * abstract superclass for all classes that use the MediaWiki-api's "list="-feature
 * to receive a number of article titles.
 *
 * @author Tobias Knerr
 * @author Thomas Stock
 * @since MediaWiki 1.9.0
 */
@Slf4j
@SupportedBy({ MW1_09, MW1_10, MW1_11, MW1_12, MW1_13, MW1_14, MW1_15, MW1_16, MW1_17 })
public abstract class TitleQuery<T> extends BaseQuery<T> {
    /**
     * constant value for the alimit-parameter. *
     */
    private static final int LIMIT = 50;

    private final MediaWikiBot bot;

    /**
     * Collection that will contain the result (titles of articles using the
     * template) after performing the action has finished.
     */
    private Collection<String> titleCollection = new ArrayList<String>();

    /**
     * Iterator that will be used to return the result (titles of articles using
     * the template) one by one.
     */
    private Iterator<String> titleIterator = titleCollection.iterator();

    /**
     * The public constructor. It will have an MediaWiki-request generated, which
     * is then added to msgs. When it is answered, the method
     * processAllReturningText will be called (from outside this class).
     */
    public TitleQuery(MediaWikiBot bot) throws VersionException {
        super(bot);
        this.bot = bot;
    }

    /**
     * generates the next MediaWiki-request (GetMethod) and adds it to msgs.
     *
     * @param title
     *          the title of the article, not null
     * @param namespace
     *          the namespace(s) that will be searched for links, as a string of
     *          numbers separated by '|'; if null, this parameter is omitted
     * @param acontinue
     *          the value for the acontinue parameter, null for the generation of
     *          the initial request
     */
    private HttpAction generateRequest(String title, String namespace, String acontinue) {
        String uS = "";
        if (acontinue == null) {
            uS = "/api.php?action=query&list=allpages&apnamespace=" + MediaWiki.encode(namespace) + "&apprefix=" + MediaWiki.encode(title) + "&aplimit=" + LIMIT + "&format=xml";
        } else {
            uS = "/api.php?action=query&list=allpages&apnamespace=" + MediaWiki.encode(namespace) + "&apprefix=" + MediaWiki.encode(title) + "&aplimit=" + LIMIT + "&apcontinue=" + MediaWiki.encode(acontinue) + "&format=xml";
        }
        return new Get(uS);
    }

    /**
     * deals with the MediaWiki api's response by parsing the provided text.
     *
     * @param s
     *          the answer to the most recently generated MediaWiki-request
     *
     * @return empty string
     */
    public String processAllReturningText(final String s) {
        // System.out.println(s);
        parseArticleTitles(s);
        parseHasMore(s);
        titleIterator = titleCollection.iterator();
        return "";
    }

    /**
     * gets the information about a follow-up page from a provided api response.
     * If there is one, a new request is added to msgs by calling generateRequest.
     *
     * @param s
     *          text for parsing
     */
    @Override
    protected String parseHasMore(final String s) {
        // get the acontinue-value
        Pattern p = Pattern.compile("<query-continue>.*?" + "<allpages *acontinue=\"([^\"]*)\" */>" + ".*?</query-continue>", Pattern.DOTALL | Pattern.MULTILINE);
        Matcher m = p.matcher(s);
        if (m.find()) {
            return m.group(1);
        } else {
            return "";
        }
    }

    /**
     * picks the article name from a MediaWiki api response.
     *
     * @param s
     *          text for parsing
     */
    @Override
    protected Collection<String> parseArticleTitles(String s) {
        // get the backlink titles and add them all to the titleCollection
        Pattern p = Pattern.compile("<p pageid=\".*?\" ns=\".*?\" title=\"(.*?)\" />");
        Matcher m = p.matcher(s);
        while (m.find()) {
            titleCollection.add(m.group(1));
        }
        return titleCollection;
    }

    /**
     * @return the next title in the collection, or null if there are no more
     */
    public String getNextTitle() {
        if (titleIterator.hasNext()) {
            return titleIterator.next();
        } else {
            return null;
        }
    }

    /**
     * @return the next title in the collection, or null if there are no more
     */
    public String getNext() {
        return getNextTitle();
    }

    /**
     * @return the next title in the collection, or null if there are no more
     */
    public String next() {
        return getNextTitle();
    }

    /**
     * @return the next title in the collection, or null if there are no more
     */
    public String nextTitle() {
        return getNextTitle();
    }

    /**
     * @return the next title in the collection, or null if there are no more
     */
    public String nextArticle() {
        return getNextTitle();
    }

    /**
     * @return the next title in the collection, or null if there are no more
     */
    public String nextPage() {
        return getNextTitle();
    }

    /**
     * @return the next title in the collection, or null if there are no more
     */
    public String nextPageTitle() {
        return getNextTitle();
    }

    /**
     * @return the next title in the collection, or null if there are no more
     */
    public String nextPageName() {
        return getNextTitle();
    }

    /**
     * @return the next title in the collection, or null if there are no more
     */
   