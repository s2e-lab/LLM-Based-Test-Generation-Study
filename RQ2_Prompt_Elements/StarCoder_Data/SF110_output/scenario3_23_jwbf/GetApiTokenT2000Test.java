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
        // Arrange
        GetApiToken getApiToken = new GetApiToken(new MediaWiki(Version.MW1_16));
        getApiToken.setToken("token");
        getApiToken.setTokenValue("tokenValue");
        getApiToken.setTokenGen("tokenGen");
        getApiToken.setTokenGenValue("tokenGenValue");
        getApiToken.setTokenGenTimestamp("tokenGenTimestamp");
        getApiToken.setTokenGenExpiry("tokenGenExpiry");
        getApiToken.setTokenGenExpiryValue("tokenGenExpiryValue");
        getApiToken.setTokenGenExpiryTimestamp("tokenGenExpiryTimestamp");
        getApiToken.setTokenGenExpiryLimit("tokenGenExpiryLimit");
        getApiToken.setTokenGenExpiryLimitValue("tokenGenExpiryLimitValue");
        getApiToken.setTokenGenExpiryLimitTimestamp("tokenGenExpiryLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimit("tokenGenExpiryLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitValue("tokenGenExpiryLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitTimestamp("tokenGenExpiryLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimit("tokenGenExpiryLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitValue");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitTimestamp");
        getApiToken.setTokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit("tokenGenExpiryLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimitLimit");
        get