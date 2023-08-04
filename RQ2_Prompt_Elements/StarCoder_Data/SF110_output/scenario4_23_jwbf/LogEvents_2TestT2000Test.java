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

    private static final String[] types = {LogEvents.MOVE, LogEvents.UPLOAD};
    private static final String[] types2 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT};
    private static final String[] types3 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK};
    private static final String[] types4 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS};
    private static final String[] types5 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE};
    private static final String[] types6 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL};
    private static final String[] types7 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE};
    private static final String[] types8 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT};
    private static final String[] types9 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE};
    private static final String[] types10 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types11 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types12 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types13 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types14 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types15 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types16 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types17 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types18 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types19 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types20 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types21 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types22 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types23 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types24 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE};
    private static final String[] types25 = {LogEvents.MOVE, LogEvents.UPLOAD, LogEvents.PROTECT, LogEvents.BLOCK, LogEvents.RIGHTS, LogEvents.DELETE, LogEvents.PATROL, LogEvents.MERGE, LogEvents.IMPORT, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.MOVE, LogEvents.