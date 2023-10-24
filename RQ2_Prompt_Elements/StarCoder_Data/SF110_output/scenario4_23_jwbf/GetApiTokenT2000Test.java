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
    * @throws IOException if the connection fails
    * @throws ProcessException if the process fails
    * @throws JDOMException if the xml document could not be parsed
    */
    @Test
    @SupportedBy({ MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
    void testHasMoreMessages() throws VersionException, IOException, ProcessException, JDOMException {
        GetApiToken getApiToken = new GetApiToken(Intoken.DELETE, "Test", Version.MW1_16, new Userinfo("Test", "Test"));
        getApiToken.generateTokenRequest(Intoken.DELETE, "Test");
        getApiToken.process(getApiToken.getNextMessage().getReturningText());
        assertTrue(getApiToken.hasMoreMessages());
    }
}

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
    * @throws IOException if the connection fails
    * @throws ProcessException if the process fails
    * @throws JDOMException if the xml document could not be parsed
    */
    @Test
    @SupportedBy({ MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
    void testHasMoreMessages() throws VersionException, IOException, ProcessException, JDOMException {
        GetApiToken getApiToken = new GetApiToken(Intoken.DELETE, "Test", Version.MW1_16, new Userinfo("Test", "Test"));
        getApiToken.generateTokenRequest(Intoken.DELETE, "Test");
        getApiToken.process(getApiToken.getNextMessage().getReturningText());
        assertTrue(getApiToken.hasMoreMessages());
    }
}

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
    * @throws IOException if the connection fails
    * @throws ProcessException if the process fails
    * @throws JDOMException if the xml document could not be parsed
    */
    @Test
    @SupportedBy({ MW1_12, MW1_13, MW1_14, MW1_15, MW1_16 })
    void testHasMoreMessages() throws VersionException, IOException, ProcessException, JDOMException {
        GetApiToken getApiToken = new GetApiToken(Intoken.DELETE, "Test", Version.MW1_16, new Userinfo("Test", "Test"));
        getApiToken.generateTokenRequest(Intoken.DELETE, "Test");
        getApiToken.process(getApiToken.getNextMessage().getReturningText());
        assertTrue(getApiToken.hasMoreMessages());
    }
}

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
import org.xml.sax.