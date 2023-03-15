// PostModifyContent_0Test.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.util.HashSet;
import java.util.Hashtable;
import java.util.Set;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.util.JwbfException;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PostModifyContent}.
* It contains ten unit test cases for the {@link PostModifyContent#hasMoreMessages()} method.
*/
class PostModifyContent_0Test {

		private static final String TEST_TEXT = "test text";
		private static final String TEST_TITLE = "test title";
		private static final String TEST_SUMMARY = "test summary";
		private static final String TEST_URL = "http://localhost/wiki/index.php?title=test_title&action=edit&dontcountme=s";
		private static final String TEST_URL_API = "http://localhost/wiki/api.php?action=edit&title=test_title";
		private static final String TEST_URL_API_TOKEN = "http://localhost/wiki/api.php?action=tokens&type=edit";
		private static final String TEST_URL_API_LOGIN = "http://localhost/wiki/api.php?action=login";
		private static final String TEST_URL_API_LOGOUT = "http://localhost/wiki/api.php?action=logout";
		private static final String TEST_URL_API_USERINFO = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights";
		private static final String TEST_URL_API_USERINFO_LOGIN = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password";
		private static final String TEST_URL_API_USERINFO_LOGOUT = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_password&lgtoken=test_token";
		private static final String TEST_URL_API_USERINFO_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT_LOGIN_LOGOUT = "http://localhost/wiki/api.php?action=query&meta=userinfo&uiprop=rights&lgname=test_user&lgpassword=test_