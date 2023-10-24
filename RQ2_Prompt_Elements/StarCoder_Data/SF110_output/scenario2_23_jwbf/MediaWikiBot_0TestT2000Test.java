// MediaWikiBot_0Test.java
package net.sourceforge.jwbf.mediawiki.bots;

import java.net.URL;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import javax.annotation.Nonnull;
import javax.inject.Inject;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.editing.GetRevision;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostDelete;
import net.sourceforge.jwbf.mediawiki.actions.editing.PostModifyContent;
import net.sourceforge.jwbf.mediawiki.actions.login.PostLogin;
import net.sourceforge.jwbf.mediawiki.actions.login.PostLoginOld;
import net.sourceforge.jwbf.mediawiki.actions.meta.GetUserinfo;
import net.sourceforge.jwbf.mediawiki.actions.meta.GetVersion;
import net.sourceforge.jwbf.mediawiki.actions.meta.Siteinfo;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.contentRep.LoginData;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MediaWikiBot}.
* It contains ten unit test cases for the {@link MediaWikiBot#getArticle(String, int)} method.
*/
class MediaWikiBot_0Test {

    private static final String WIKI_URL = "http://www.mediawiki.org/w/";
    private static final String USERNAME = "JohnDoe";
    private static final String PASSWORD = "<PASSWORD>";
    private static final String MAIN_PAGE = "Main Page";
    private static final String MAIN_PAGE_TEXT = "This is the main page.";
    private static final String MAIN_PAGE_TEXT_EDITED = "This is the main page. It has been edited.";
    private static final String MAIN_PAGE_TEXT_EDITED_2 = "This is the main page. It has been edited. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_3 = "This is the main page. It has been edited. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_4 = "This is the main page. It has been edited. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_5 = "This is the main page. It has been edited. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_6 = "This is the main page. It has been edited. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_7 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_8 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_9 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_10 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_11 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_12 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_13 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_14 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_15 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_16 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_17 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_18 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_19 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_20 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_21 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_22 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_23 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_24 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_25 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_26 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_27 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_28 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_29 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_30 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_31 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again.";
    private static final String MAIN_PAGE_TEXT_EDITED_32 = "This is the main page. It has been edited. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again. Again