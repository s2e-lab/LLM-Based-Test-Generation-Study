// GetApiTokenTest.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.StringReader;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetApiToken}.
* It contains ten unit test cases for the {@link GetApiToken#hasMoreMessages()} method.
*/
class GetApiTokenTest {

    /**
    * Test method for {@link GetApiToken#hasMoreMessages()}.
    * @throws VersionException if the version is not supported
    * @throws ProcessException if the process fails
    * @throws IOException if the connection fails
    * @throws JDOMException if the parsing fails
    */
    @Test
    @SupportedBy({ MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
    void testHasMoreMessages() throws VersionException, ProcessException, IOException, JDOMException {
        GetApiToken getApiToken = new GetApiToken();
        getApiToken.setVersion(Version.of("1.16"));
        getApiToken.setToken("");
        getApiToken.setFirst(true);
        getApiToken.setLast(false);
        getApiToken.setContinue("");
        getApiToken.setFormat(MediaWiki.Format.XML);
        getApiToken.setWiki("test.wikipedia.org");
        getApiToken.setApi("api");
        getApiToken.setFormatversion(MediaWiki.FormatVersion.getLatest());
        getApiToken.setGenerator("MediaWiki 1.16.0-wmf.10");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmnamespace("gcmnamespace");
        getApiToken.setGcmtitle("gcmtitle");
        getApiToken.setGcmtype("gcmtype");
        getApiToken.setGcmuser("gcmuser");
        getApiToken.setGcmwikisource("gcmwikisource");
        getApiToken.setGcmwikisourceversion("gcmwikisourceversion");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit("gcmlimit");
        getApiToken.setGcmcontinue("gcmcontinue");
        getApiToken.setGcmsearch("gcmsearch");
        getApiToken.setGcmlimit