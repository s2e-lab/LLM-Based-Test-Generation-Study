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

    /**
    * Test method for {@link PostModifyContent#hasMoreMessages()}.
    */
    @Test
    void testHasMoreMessages() {
        PostModifyContent_0Test.testHasMoreMessages(MW1_09);
        PostModifyContent_0Test.testHasMoreMessages(MW1_10);
        PostModifyContent_0Test.testHasMoreMessages(MW1_11);
        PostModifyContent_0Test.testHasMoreMessages(MW1_12);
        PostModifyContent_0Test.testHasMoreMessages(MW1_13);
        PostModifyContent_0Test.testHasMoreMessages(MW1_14);
        PostModifyContent_0Test.testHasMoreMessages(MW1_15);
        PostModifyContent_0Test.testHasMoreMessages(MW1_16);
    }

    /**
    * Test method for {@link PostModifyContent#hasMoreMessages()}.
    * @param version a
    */
    private static void testHasMoreMessages(MediaWiki.Version version) {
        PostModifyContent_0Test.testHasMoreMessages(version, true);
        PostModifyContent_0Test.testHasMoreMessages(version, false);
    }

    /**
    * Test method for {@link PostModifyContent#hasMoreMessages()}.
    * @param version a
    * @param apiEdit a
    */
    private static void testHasMoreMessages(MediaWiki.Version version, boolean apiEdit) {
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, true);
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, false);
    }

    /**
    * Test method for {@link PostModifyContent#hasMoreMessages()}.
    * @param version a
    * @param apiEdit a
    * @param minorEdit a
    */
    private static void testHasMoreMessages(MediaWiki.Version version, boolean apiEdit, boolean minorEdit) {
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, true);
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, false);
    }

    /**
    * Test method for {@link PostModifyContent#hasMoreMessages()}.
    * @param version a
    * @param apiEdit a
    * @param minorEdit a
    * @param botEdit a
    */
    private static void testHasMoreMessages(MediaWiki.Version version, boolean apiEdit, boolean minorEdit, boolean botEdit) {
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, true);
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, false);
    }

    /**
    * Test method for {@link PostModifyContent#hasMoreMessages()}.
    * @param version a
    * @param apiEdit a
    * @param minorEdit a
    * @param botEdit a
    * @param editSummary a
    */
    private static void testHasMoreMessages(MediaWiki.Version version, boolean apiEdit, boolean minorEdit, boolean botEdit, boolean editSummary) {
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, true);
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, false);
    }

    /**
    * Test method for {@link PostModifyContent#hasMoreMessages()}.
    * @param version a
    * @param apiEdit a
    * @param minorEdit a
    * @param botEdit a
    * @param editSummary a
    * @param editText a
    */
    private static void testHasMoreMessages(MediaWiki.Version version, boolean apiEdit, boolean minorEdit, boolean botEdit, boolean editSummary, boolean editText) {
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, editText, true);
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, editText, false);
    }

    /**
    * Test method for {@link PostModifyContent#hasMoreMessages()}.
    * @param version a
    * @param apiEdit a
    * @param minorEdit a
    * @param botEdit a
    * @param editSummary a
    * @param editText a
    * @param editTitle a
    */
    private static void testHasMoreMessages(MediaWiki.Version version, boolean apiEdit, boolean minorEdit, boolean botEdit, boolean editSummary, boolean editText, boolean editTitle) {
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, editText, editTitle, true);
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, editText, editTitle, false);
    }

    /**
    * Test method for {@link PostModifyContent#hasMoreMessages()}.
    * @param version a
    * @param apiEdit a
    * @param minorEdit a
    * @param botEdit a
    * @param editSummary a
    * @param editText a
    * @param editTitle a
    * @param editToken a
    */
    private static void testHasMoreMessages(MediaWiki.Version version, boolean apiEdit, boolean minorEdit, boolean botEdit, boolean editSummary, boolean editText, boolean editTitle, boolean editToken) {
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, editText, editTitle, editToken, true);
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, editText, editTitle, editToken, false);
    }

    /**
    * Test method for {@link PostModifyContent#hasMoreMessages()}.
    * @param version a
    * @param apiEdit a
    * @param minorEdit a
    * @param botEdit a
    * @param editSummary a
    * @param editText a
    * @param editTitle a
    * @param editToken a
    * @param editTime a
    */
    private static void testHasMoreMessages(MediaWiki.Version version, boolean apiEdit, boolean minorEdit, boolean botEdit, boolean editSummary, boolean editText, boolean editTitle, boolean editToken, boolean editTime) {
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, editText, editTitle, editToken, editTime, true);
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, editText, editTitle, editToken, editTime, false);
    }

    /**
    * Test method for {@link PostModifyContent#hasMoreMessages()}.
    * @param version a
    * @param apiEdit a
    * @param minorEdit a
    * @param botEdit a
    * @param editSummary a
    * @param editText a
    * @param editTitle a
    * @param editToken a
    * @param editTime a
    * @param editStart a
    */
    private static void testHasMoreMessages(MediaWiki.Version version, boolean apiEdit, boolean minorEdit, boolean botEdit, boolean editSummary, boolean editText, boolean editTitle, boolean editToken, boolean editTime, boolean editStart) {
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, editText, editTitle, editToken, editTime, editStart, true);
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, editText, editTitle, editToken, editTime, editStart, false);
    }

    /**
    * Test method for {@link PostModifyContent#hasMoreMessages()}.
    * @param version a
    * @param apiEdit a
    * @param minorEdit a
    * @param botEdit a
    * @param editSummary a
    * @param editText a
    * @param editTitle a
    * @param editToken a
    * @param editTime a
    * @param editStart a
    * @param editApi a
    */
    private static void testHasMoreMessages(MediaWiki.Version version, boolean apiEdit, boolean minorEdit, boolean botEdit, boolean editSummary, boolean editText, boolean editTitle, boolean editToken, boolean editTime, boolean editStart, boolean editApi) {
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, editText, editTitle, editToken, editTime, editStart, editApi, true);
        PostModifyContent_0Test.testHasMoreMessages(version, apiEdit, minorEdit, botEdit, editSummary, editText, editTitle, editToken, editTime, editStart, editApi, false);
    }

    /**
    * Test method for {@link PostModifyContent#hasMoreMessages()}.
    * @param version a
    * @param apiEdit a
    * @param minorEdit a
    * @param botEdit a
    * @