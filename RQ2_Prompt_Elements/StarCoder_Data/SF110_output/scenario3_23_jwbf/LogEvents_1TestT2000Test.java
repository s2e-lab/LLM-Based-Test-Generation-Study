// LogEvents_1Test.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.Collection;
import java.util.Iterator;
import java.util.Vector;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import net.sourceforge.jwbf.mediawiki.contentRep.LogItem;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogEvents}.
* It contains ten unit test cases for the {@link LogEvents#next()} method.
*/
class LogEvents_1Test {

    /**
    * Test method for {@link LogEvents#next()}.
    * @throws IOException if the connection fails
    * @throws ActionException if the action fails
    * @throws ProcessException if the process fails
    * @throws VersionException if the version is wrong
    * @throws JDOMException if the parsing fails
    */
    @Test
    void testNext() throws IOException, ActionException, ProcessException, VersionException, JDOMException {
        // Arrange
        MediaWikiBot bot = new MediaWikiBot("http://localhost:8181/w");
        LogEvents logEvents = new LogEvents(bot, MW1_16);
        logEvents.setParams("lelimit=1");
        logEvents.setParams("letype=delete");
        logEvents.setParams("leuser=1");
        logEvents.setParams("letitle=Test");
        logEvents.setParams("lefrom=2010-01-01T00:00:00Z");
        logEvents.setParams("leto=2010-01-01T00:00:00Z");
        logEvents.setParams("ledir=newer");
        logEvents.setParams("leprop=ids|title|timestamp|type|user|comment");
        logEvents.setParams("lelimit=1");
        logEvents.setParams("letype=delete");
        logEvents.setParams("leuser=1");
        logEvents.setParams("letitle=Test");
        logEvents.setParams("lefrom=2010-01-01T00:00:00Z");
        logEvents.setParams("leto=2010-01-01T00:00:00Z");
        logEvents.setParams("ledir=newer");
        logEvents.setParams("leprop=ids|title|timestamp|type|user|comment");
        logEvents.setParams("lelimit=1");
        logEvents.setParams("letype=delete");
        logEvents.setParams("leuser=1");
        logEvents.setParams("letitle=Test");
        logEvents.setParams("lefrom=2010-01-01T00:00:00Z");
        logEvents.setParams("leto=2010-01-01T00:00:00Z");
        logEvents.setParams("ledir=newer");
        logEvents.setParams("leprop=ids|title|timestamp|type|user|comment");
        logEvents.setParams("lelimit=1");
        logEvents.setParams("letype=delete");
        logEvents.setParams("leuser=1");
        logEvents.setParams("letitle=Test");
        logEvents.setParams("lefrom=2010-01-01T00:00:00Z");
        logEvents.setParams("leto=2010-01-01T00:00:00Z");
        logEvents.setParams("ledir=newer");
        logEvents.setParams("leprop=ids|title|timestamp|type|user|comment");
        logEvents.setParams("lelimit=1");
        logEvents.setParams("letype=delete");
        logEvents.setParams("leuser=1");
        logEvents.setParams("letitle=Test");
        logEvents.setParams("lefrom=2010-01-01T00:00:00Z");
        logEvents.setParams("leto=2010-01-01T00:00:00Z");
        logEvents.setParams("ledir=newer");
        logEvents.setParams("leprop=ids|title|timestamp|type|user|comment");
        logEvents.setParams("lelimit=1");
        logEvents.setParams("letype=delete");
        logEvents.setParams("leuser=1");
        logEvents.setParams("letitle=Test");
        logEvents.setParams("lefrom=2010-01-01T00:00:00Z");
        logEvents.setParams("leto=2010-01-01T00:00:00Z");
        logEvents.setParams("ledir=newer");
        logEvents.setParams("leprop=ids|title|timestamp|type|user|comment");
        logEvents.setParams("lelimit=1");
        logEvents.setParams("letype=delete");
        logEvents.setParams("leuser=1");
        logEvents.setParams("letitle=Test");
        logEvents.setParams("lefrom=2010-01-01T00:00:00Z");
        logEvents.setParams("leto=2010-01-01T00:00:00Z");
        logEvents.setParams("ledir=newer");
        logEvents.setParams("leprop=ids|title|timestamp|type|user|comment");
        logEvents.setParams("lelimit=1");
        logEvents.setParams("letype=delete");
        logEvents.setParams("leuser=1");
        logEvents.setParams("letitle=Test");
        logEvents.setParams("lefrom=2010-01-01T00:00:00Z");
        logEvents.setParams("leto=2010-01-01T00:00:00Z");
        logEvents.setParams("ledir=newer");
        logEvents.setParams("leprop=ids|title|timestamp|type|user|comment");
        logEvents.setParams("lelimit=1");
        logEvents.setParams("letype=delete");
        logEvents.setParams("leuser=1");
        logEvents.setParams("letitle=Test");
        logEvents.setParams("lefrom=2010-01-01T00:00:00Z");
        logEvents.setParams("leto=2010-01-01T00:00:00Z");
        logEvents.setParams("ledir=newer");
        logEvents.setParams("leprop=ids|title|timestamp|type|user|comment");
        logEvents.setParams("lelimit=1");
        logEvents.setParams("letype=delete");
        logEvents.setParams("leuser=1");
        logEvents.setParams("letitle=Test");
        logEvents.setParams("lefrom=2010-01-01T00:00:00Z");
        logEvents.setParams("leto=2010-01-01T00:00:00Z");
        logEvents.setParams("ledir=newer");
        logEvents.setParams("leprop=ids|title|timestamp|type|user|comment");
        logEvents.setParams("lelimit=1");
        logEvents.setParams("letype=delete");
        logEvents.setParams("leuser=1");
        logEvents.setParams("letitle=Test");
        logEvents.setParams("lefrom=2010-01-01T00:00:00Z");
        logEvents.setParams("leto=2010-01-01T00:00:00Z");
        logEvents.setParams("ledir=newer");
        logEvents.setParams("leprop=ids|title|timestamp|type|user|comment");
        logEvents.setParams("lelimit=1");
        logEvents.setParams("letype=delete");
        logEvents.setParams("leuser=1");
        logEvents.setParams("letitle=Test");
        logEvents.setParams("lefrom=2010-01-01T00:00:00Z");
        logEvents.setParams("leto=2010-01-01T00:00:00Z");
        logEvents.setParams("ledir=newer");
        logEvents.setParams("leprop=ids|title|timestamp|type|user|comment");
        logEvents.setParams("lelimit=1");
        logEvents.setParams("letype=delete");
        logEvents.setParams("leuser=1");
        logEvents.setParams("letitle=Test");
        logEvents.setParams("lefrom=2010-01-01T00:00:00Z");
        logEvents.setParams("leto=2010-01-01T00:00:00Z");
        logEvents.setParams("ledir=newer");
        logEvents.setParams("leprop=ids|title|timestamp|