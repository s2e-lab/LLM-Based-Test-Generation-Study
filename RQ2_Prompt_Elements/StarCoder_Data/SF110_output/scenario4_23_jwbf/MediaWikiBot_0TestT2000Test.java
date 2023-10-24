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

    private static final String URL = "http://www.mediawiki.org/w/";

    private static final String USER = "JohnDoe";

    private static final String PASSWD = "<PASSWORD>";

    private static final String TITLE = "Main Page";

    private static final String CONTENT = "This is the content of the main page.";

    private static final String COMMENT = "This is a comment.";

    private static final String USER2 = "JohnDoe2";

    private static final String PASSWD2 = "<PASSWORD>";

    private static final String TITLE2 = "Main Page 2";

    private static final String CONTENT2 = "This is the content of the main page 2.";

    private static final String COMMENT2 = "This is a comment 2.";

    private static final String USER3 = "JohnDoe3";

    private static final String PASSWD3 = "<PASSWORD>";

    private static final String TITLE3 = "Main Page 3";

    private static final String CONTENT3 = "This is the content of the main page 3.";

    private static final String COMMENT3 = "This is a comment 3.";

    private static final String USER4 = "JohnDoe4";

    private static final String PASSWD4 = "<PASSWORD>";

    private static final String TITLE4 = "Main Page 4";

    private static final String CONTENT4 = "This is the content of the main page 4.";

    private static final String COMMENT4 = "This is a comment 4.";

    private static final String USER5 = "JohnDoe5";

    private static final String PASSWD5 = "<PASSWORD>";

    private static final String TITLE5 = "Main Page 5";

    private static final String CONTENT5 = "This is the content of the main page 5.";

    private static final String COMMENT5 = "This is a comment 5.";

    private static final String USER6 = "JohnDoe6";

    private static final String PASSWD6 = "<PASSWORD>";

    private static final String TITLE6 = "Main Page 6";

    private static final String CONTENT6 = "This is the content of the main page 6.";

    private static final String COMMENT6 = "This is a comment 6.";

    private static final String USER7 = "JohnDoe7";

    private static final String PASSWD7 = "<PASSWORD>";

    private static final String TITLE7 = "Main Page 7";

    private static final String CONTENT7 = "This is the content of the main page 7.";

    private static final String COMMENT7 = "This is a comment 7.";

    private static final String USER8 = "JohnDoe8";

    private static final String PASSWD8 = "<PASSWORD>";

    private static final String TITLE8 = "Main Page 8";

    private static final String CONTENT8 = "This is the content of the main page 8.";

    private static final String COMMENT8 = "This is a comment 8.";

    private static final String USER9 = "JohnDoe9";

    private static final String PASSWD9 = "<PASSWORD>";

    private static final String TITLE9 = "Main Page 9";

    private static final String CONTENT9 = "This is the content of the main page 9.";

    private static final String COMMENT9 = "This is a comment 9.";

    private static final String USER10 = "JohnDoe10";

    private static final String PASSWD10 = "<PASSWORD>";

    private static final String TITLE10 = "Main Page 10";

    private static final String CONTENT10 = "This is the content of the main page 10.";

    private static final String COMMENT10 = "This is a comment 10.";

    private static final String USER11 = "JohnDoe11";

    private static final String PASSWD11 = "<PASSWORD>";

    private static final String TITLE11 = "Main Page 11";

    private static final String CONTENT11 = "This is the content of the main page 11.";

    private static final String COMMENT11 = "This is a comment 11.";

    private static final String USER12 = "JohnDoe12";

    private static final String PASSWD12 = "<PASSWORD>";

    private static final String TITLE12 = "Main Page 12";

    private static final String CONTENT12 = "This is the content of the main page 12.";

    private static final String COMMENT12 = "This is a comment 12.";

    private static final String USER13 = "JohnDoe13";

    private static final String PASSWD13 = "<PASSWORD>";

    private static final String TITLE13 = "Main Page 13";

    private static final String CONTENT13 = "This is the content of the main page 13.";

    private static final String COMMENT13 = "This is a comment 13.";

    private static final String USER14 = "JohnDoe14";

    private static final String PASSWD14 = "<PASSWORD>";

    private static final String TITLE14 = "Main Page 14";

    private static final String CONTENT14 = "This is the content of the main page 14.";

    private static final String COMMENT14 = "This is a comment 14.";

    private static final String USER15 = "JohnDoe15";

    private static final String PASSWD15 = "<PASSWORD>";

    private static final String TITLE15 = "Main Page 15";

    private static final String CONTENT15 = "This is the content of the main page 15.";

    private static final String COMMENT15 = "This is a comment 15.";

    private static final String USER16 = "JohnDoe16";

    private static final String PASSWD16 = "<PASSWORD>";

    private static final String TITLE16 = "Main Page 16";

    private static final String CONTENT16 = "This is the content of the main page 16.";

    private static final String COMMENT16 = "This is a comment 16.";

    private static final String USER17 = "JohnDoe17";

    private static final String PASSWD17 = "<PASSWORD>";

    private static final String TITLE17 = "Main Page 17";

    private static final String CONTENT17 = "This is the content of the main page 17.";

    private static final String COMMENT17 = "This is a comment 17.";

    private static final String USER18 = "JohnDoe18";

    private static final String PASSWD18 = "<PASSWORD>";

    private static final String TITLE18 = "Main Page 18";

    private static final String CONTENT18 = "This is the content of the main page 18.";

    private static final String COMMENT18 = "This is a comment 18.";

    private static final String USER19 = "JohnDoe19";

    private static final String PASSWD19 = "<PASSWORD>";

    private static final String TITLE19 = "Main Page 19";

    private static final String CONTENT19 = "This is the content of the main page 19.";

    private static final String COMMENT19 = "This is a comment 19.";

    private static final String USER20 = "JohnDoe20";

    private static final String PASSWD20 = "<PASSWORD>";

    private static final String TITLE20 = "Main Page 20";

    private static final String CONTENT20 = "This is the content of the main page 20.";

    private static final String COMMENT20 = "This is a comment 20.";

    private static final String USER21 = "JohnDoe21";

    private static final String PASSWD21 = "<PASSWORD>";

    private static final String TITLE21 = "Main Page 21";

    private static final String CONTENT21 = "This is the content of the main page 21.";

    private static final String COMMENT21 = "This is a comment 21.";

    private static final String USER22 = "JohnDoe22";

    private static final String PASSWD22 = "<PASSWORD>";

    private static final String TITLE22 = "Main Page 22";

    private static final String CONTENT22 = "This is the content of the main page 22.";

    private static final String COMMENT22 = "This is a comment 22.";

    private static final String USER23 = "JohnDoe23";

    private static final String PASSWD23 = "<PASSWORD>";

    private static final String TITLE23 = "Main Page 23";

    private static final String CONTENT23 = "This is the content of the main page 23.";

    private static final String COMMENT23 = "This is a comment 23.";

    private static final String USER24 = "JohnDoe24";

    private static final String PASSWD24 = "<PASSWORD>";

    private static final String TITLE24 = "Main Page 24";

    private static final String CONTENT24 = "This is the content of the main page 24.";

    private static final String COMMENT24 = "This is a comment 24.";

    private static final String USER25 = "JohnDoe25";

    private static final String PASSWD25 = "<PASSWORD>";

    private static final