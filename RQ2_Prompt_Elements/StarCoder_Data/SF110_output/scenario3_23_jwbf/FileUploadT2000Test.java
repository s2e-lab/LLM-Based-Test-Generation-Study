// FileUploadTest.java
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
class FileUploadTest {

    /**
    * Test method for {@link FileUpload#hasMoreMessages()}.
    * @throws VersionException if the version of MediaWiki is too old
    * @throws ActionException if the upload fails
    * @throws FileNotFoundException if the file is not found
    * @throws ProcessException if the upload fails
    */
    @Test
    void testHasMoreMessages() throws VersionException, ActionException, FileNotFoundException, ProcessException {
        MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/w");
        bot.login("testBot");
        FileUpload fileUpload = new FileUpload(bot, "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "testBot", "