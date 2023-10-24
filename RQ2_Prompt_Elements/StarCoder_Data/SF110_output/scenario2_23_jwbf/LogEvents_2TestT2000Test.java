// LogEvents_2Test.java
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
* It contains ten unit test cases for the {@link LogEvents#iterator()} method.
*/
class LogEvents_2Test {

    /**
    * Test method for {@link LogEvents#iterator()}.
    */
    @Test
    void testIterator() {
        MediaWikiBot bot = new MediaWikiBot("http://localhost");
        LogEvents logEvents = new LogEvents(bot, MW1_16);
        logEvents.setLimit(10);
        logEvents.setFrom("2010-01-01T00:00:00Z");
        logEvents.setTo("2010-01-02T00:00:00Z");
        logEvents.setDirection("newer");
        logEvents.setLogType("block");
        logEvents.setUserType("all");
        logEvents.setPageTitle("Test");
        Iterator<LogItem> iterator = logEvents.iterator();
        assertTrue(iterator.hasNext());
        LogItem logItem = iterator.next();
        assertEquals("2010-01-01T00:00:00Z", logItem.getTimestamp());
        assertEquals("2010-01-01T00:00:00Z", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getIp());
        assertEquals("127.0.0.1", logItem.getUser());
        assertEquals("block", logItem.getType());
        assertEquals("Test", logItem.getPage());
        assertEquals("127.0.0.1", logItem.getAgent());
        assertEquals("127.0.0.1", logItem.getRevid());
        assertEquals("127.0.0.1", logItem.getOldRevid());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.getComment());
        assertEquals("127.0.0.1", logItem.