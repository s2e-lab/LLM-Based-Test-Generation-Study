// MediaWikiBot_1Test.java
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
* It contains ten unit test cases for the {@link MediaWikiBot#getArticle(String)} method.
*/
class MediaWikiBot_1Test {

    private static final String URL = "http://www.mediawiki.org/w/";

    private static final String USERNAME = "JohnDoe";

    private static final String PASSWORD = "<PASSWORD>";

    private static final String DOMAIN = "domain";

    private static final String TITLE = "Main Page";

    private static final String CONTENT = "This is the content of the main page.";

    private static final String COMMENT = "This is a comment.";

    private static final String USER = "JohnDoe";

    private static final String TIMESTAMP = "2008-01-01T00:00:00Z";

    private static final String ID = "123456789";

    private static final String FLAGS = "123456789";

    private static final String VERSION = "1.16.0-wmf.10";

    private static final String WIKI_TYPE = "mediawiki";

    private static final String HOST_URL = "http://www.mediawiki.org/w/";

    private static final String INVALID_TITLE = "Main Page[";

    private static final String INVALID_TITLE_2 = "Main Page] ";

    private static final String INVALID_TITLE_3 = "Main Page {";

    private static final String INVALID_TITLE_4 = "Main Page }";

    private static final String INVALID_TITLE_5 = "Main Page <";

    private static final String INVALID_TITLE_6 = "Main Page >";

    private static final String INVALID_TITLE_7 = "Main Page [";

    private static final String INVALID_TITLE_8 = "Main Page ]";

    private static final String INVALID_TITLE_9 = "Main Page {";

    private static final String INVALID_TITLE_10 = "Main Page }";

    private static final String INVALID_TITLE_11 = "Main Page |";

    private static final String INVALID_TITLE_12 = "Main Page <";

    private static final String INVALID_TITLE_13 = "Main Page >";

    private static final String INVALID_TITLE_14 = "Main Page [";

    private static final String INVALID_TITLE_15 = "Main Page ]";

    private static final String INVALID_TITLE_16 = "Main Page {";

    private static final String INVALID_TITLE_17 = "Main Page }";

    private static final String INVALID_TITLE_18 = "Main Page |";

    private static final String INVALID_TITLE_19 = "Main Page <";

    private static final String INVALID_TITLE_20 = "Main Page >";

    private static final String INVALID_TITLE_21 = "Main Page [";

    private static final String INVALID_TITLE_22 = "Main Page ]";

    private static final String INVALID_TITLE_23 = "Main Page {";

    private static final String INVALID_TITLE_24 = "Main Page }";

    private static final String INVALID_TITLE_25 = "Main Page |";

    private static final String INVALID_TITLE_26 = "Main Page <";

    private static final String INVALID_TITLE_27 = "Main Page >";

    private static final String INVALID_TITLE_28 = "Main Page [";

    private static final String INVALID_TITLE_29 = "Main Page ]";

    private static final String INVALID_TITLE_30 = "Main Page {";

    private static final String INVALID_TITLE_31 = "Main Page }";

    private static final String INVALID_TITLE_32 = "Main Page |";

    private static final String INVALID_TITLE_33 = "Main Page <";

    private static final String INVALID_TITLE_34 = "Main Page >";

    private static final String INVALID_TITLE_35 = "Main Page [";

    private static final String INVALID_TITLE_36 = "Main Page ]";

    private static final String INVALID_TITLE_37 = "Main Page {";

    private static final String INVALID_TITLE_38 = "Main Page }";

    private static final String INVALID_TITLE_39 = "Main Page |";

    private static final String INVALID_TITLE_40 = "Main Page <";

    private static final String INVALID_TITLE_41 = "Main Page >";

    private static final String INVALID_TITLE_42 = "Main Page [";

    private static final String INVALID_TITLE_43 = "Main Page ]";

    private static final String INVALID_TITLE_44 = "Main Page {";

    private static final String INVALID_TITLE_45 = "Main Page }";

    private static final String INVALID_TITLE_46 = "Main Page |";

    private static final String INVALID_TITLE_47 = "Main Page <";

    private static final String INVALID_TITLE_48 = "Main Page >";

    private static final String INVALID_TITLE_49 = "Main Page [";

    private static final String INVALID_TITLE_50 = "Main Page ]";

    private static final String INVALID_TITLE_51 = "Main Page {";

    private static final String INVALID_TITLE_52 = "Main Page }";

    private static final String INVALID_TITLE_53 = "Main Page |";

    private static final String INVALID_TITLE_54 = "Main Page <";

    private static final String INVALID_TITLE_55 = "Main Page >";

    private static final String INVALID_TITLE_56 = "Main Page [";

    private static final String INVALID_TITLE_57 = "Main Page ]";

    private static final String INVALID_TITLE_58 = "Main Page {";

    private static final String INVALID_TITLE_59 = "Main Page }";

    private static final String INVALID_TITLE_60 = "Main Page |";

    private static final String INVALID_TITLE_61 = "Main Page <";

    private static final String INVALID_TITLE_62 = "Main Page >";

    private static final String INVALID_TITLE_63 = "Main Page [";

    private static final String INVALID_TITLE_64 = "Main Page ]";

    private static final String INVALID_TITLE_65 = "Main Page {";

    private static final String INVALID_TITLE_66 = "Main Page }";

    private static final String INVALID_TITLE_67 = "Main Page |";

    private static final String INVALID_TITLE_68 = "Main Page <";

    private static final String INVALID_TITLE_69 = "Main Page >";

    private static final String INVALID_TITLE_70 = "Main Page [";

    private static final String INVALID_TITLE_71 = "Main Page ]";

    private static final String INVALID_TITLE_72 = "Main Page {";

    private static final String INVALID_TITLE_73 = "Main Page }";

    private static final String INVALID_TITLE_74 = "Main Page |";

    private static final String INVALID_TITLE_75 = "Main Page <";

    private static final String INVALID_TITLE_76 = "Main Page >";

    private static final String INVALID_TITLE_77 = "Main Page [";

    private static final String INVALID_TITLE_78 = "Main Page ]";

    private static final String INVALID_TITLE_79 = "Main Page {";

    private static final String INVALID_TITLE_80 = "Main Page }";

    private static final String INVALID_TITLE_81 = "Main Page |";

    private static final String INVALID_TITLE_82 = "Main Page <";

    private static final String INVALID_TITLE_83 = "Main Page >";

    private static final String INVALID_TITLE_84 = "Main Page [";

    private static final String INVALID_TITLE_85 = "Main Page ]";

    private static final String INVALID_TITLE_86 = "Main Page {";

    private static final String INVALID_TITLE_87 = "Main Page }";

    private static final String INVALID_TITLE_88 = "Main Page |";

    private static final String INVALID_TITLE_89 = "Main Page <";

    private static final String INVALID_TITLE_90 = "Main Page >";

    private static final String INVALID_TITLE_91 = "Main Page [";

    private static final String INVALID_TITLE_92 = "Main Page ]";

    private static final String INVALID_TITLE_93 = "Main Page {";

    private static final String INVALID_TITLE_94 = "Main Page }";

    private static final String INVALID_TITLE_95 = "Main Page |";

    private static final String INVALID_TITLE_96 = "Main Page <";

    private static final String INVALID_TITLE_97 = "Main Page >";

    private static final String INVALID_TITLE_98 = "Main Page [";

    private static final String INVALID_TITLE_99 = "Main Page ]";

    private static final String INVALID_TITLE_100 = "Main Page {";

    private static final String INVALID_TITLE_101 = "Main Page }";

    private static final String INVALID_TITLE_102 = "Main Page |";

    private static final String INVALID_TITLE_103 = "Main Page <";

    private static final String INVALID_TITLE_104 = "Main Page >";

    private static final String INVALID_