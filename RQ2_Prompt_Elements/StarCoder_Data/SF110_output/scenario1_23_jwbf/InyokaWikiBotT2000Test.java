// InyokaWikiBotTest.java
package net.sourceforge.jwbf.inyoka.bots;

import java.net.MalformedURLException;
import java.util.Map;
import java.util.Set;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.inyoka.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InyokaWikiBot}.
* It contains ten unit test cases for the {@link InyokaWikiBot#getArticle(String)} method.
*/
class InyokaWikiBotTest {

    private static final String USER = "test";
    private static final String PASS = "<PASSWORD>";
    private static final String URL = "http://localhost:8080/wiki/api.php";
    private static final String NAME = "Test";
    private static final String CONTENT = "TestContent";
    private static final String SUMMARY = "TestSummary";
    private static final String REVISION = "1";
    private static final String TITLE = "TestTitle";
    private static final String USERINFO = "TestUserinfo";
    private static final String USERINFO_EMAIL = "TestUserinfoEmail";
    private static final String USERINFO_ID = "TestUserinfoId";
    private static final String USERINFO_NAME = "TestUserinfoName";
    private static final String USERINFO_REGISTERED = "TestUserinfoRegistered";
    private static final String USERINFO_EDITCOUNT = "TestUserinfoEditcount";
    private static final String USERINFO_GROUPS = "TestUserinfoGroups";
    private static final String USERINFO_RIGHTS = "TestUserinfoRights";
    private static final String USERINFO_BLOCKED = "TestUserinfoBlocked";
    private static final String USERINFO_BLOCKEDBY = "TestUserinfoBlockedby";
    private static final String USERINFO_BLOCKEDBY_EMAIL = "TestUserinfoBlockedbyEmail";
    private static final String USERINFO_BLOCKEDBY_ID = "TestUserinfoBlockedbyId";
    private static final String USERINFO_BLOCKEDBY_NAME = "TestUserinfoBlockedbyName";
    private static final String USERINFO_BLOCKEDBY_REGISTERED = "TestUserinfoBlockedbyRegistered";
    private static final String USERINFO_BLOCKEDBY_EDITCOUNT = "TestUserinfoBlockedbyEditcount";
    private static final String USERINFO_BLOCKEDBY_GROUPS = "TestUserinfoBlockedbyGroups";
    private static final String USERINFO_BLOCKEDBY_RIGHTS = "TestUserinfoBlockedbyRights";
    private static final String USERINFO_BLOCKEDBY_BLOCKED = "TestUserinfoBlockedbyBlocked";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY = "TestUserinfoBlockedbyBlockedby";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_EMAIL = "TestUserinfoBlockedbyBlockedbyEmail";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_ID = "TestUserinfoBlockedbyBlockedbyId";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_NAME = "TestUserinfoBlockedbyBlockedbyName";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_REGISTERED = "TestUserinfoBlockedbyBlockedbyRegistered";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_EDITCOUNT = "TestUserinfoBlockedbyBlockedbyEditcount";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_GROUPS = "TestUserinfoBlockedbyBlockedbyGroups";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_RIGHTS = "TestUserinfoBlockedbyBlockedbyRights";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKED = "TestUserinfoBlockedbyBlockedbyBlocked";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY = "TestUserinfoBlockedbyBlockedbyBlockedby";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_EMAIL = "TestUserinfoBlockedbyBlockedbyBlockedbyEmail";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_ID = "TestUserinfoBlockedbyBlockedbyBlockedbyId";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_NAME = "TestUserinfoBlockedbyBlockedbyBlockedbyName";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_REGISTERED = "TestUserinfoBlockedbyBlockedbyBlockedbyRegistered";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_EDITCOUNT = "TestUserinfoBlockedbyBlockedbyBlockedbyEditcount";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_GROUPS = "TestUserinfoBlockedbyBlockedbyBlockedbyGroups";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_RIGHTS = "TestUserinfoBlockedbyBlockedbyBlockedbyRights";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKED = "TestUserinfoBlockedbyBlockedbyBlockedbyBlocked";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedby";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_EMAIL = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyEmail";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_ID = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyId";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_NAME = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyName";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_REGISTERED = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyRegistered";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_EDITCOUNT = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyEditcount";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_GROUPS = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyGroups";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_RIGHTS = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyRights";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKED = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlocked";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlockedby";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_EMAIL = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyEmail";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_ID = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyId";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_NAME = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyName";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_REGISTERED = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyRegistered";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_EDITCOUNT = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyEditcount";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_GROUPS = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyGroups";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_RIGHTS = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyRights";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKED = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyBlocked";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyBlockedby";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_EMAIL = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyEmail";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_ID = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyId";
    private static final String USERINFO_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_BLOCKEDBY_NAME = "TestUserinfoBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyBlockedbyName";
    private static final String