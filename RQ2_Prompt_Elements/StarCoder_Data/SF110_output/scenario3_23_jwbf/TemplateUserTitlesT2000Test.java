// TemplateUserTitlesTest.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_09;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_10;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_17;
import java.util.ArrayList;
import java.util.Collection;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TemplateUserTitles}.
* It contains ten unit test cases for the {@link TemplateUserTitles#processAllReturningText(String)} method.
*/
class TemplateUserTitlesTest {

    /**
    * Test method for {@link TemplateUserTitles#processAllReturningText(String)}.
    */
    @Test
    void testProcessAllReturningText() {
        TemplateUserTitles test = new TemplateUserTitles(new MediaWikiBot("test.wikipedia.org"));
        String testString = "  <page>\n" + "    <title>Template:Test</title>\n" + "    <ns>10</ns>\n"
                + "    <id>1</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test2</title>\n" + "    <ns>10</ns>\n"
                + "    <id>2</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test2</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test3</title>\n" + "    <ns>10</ns>\n"
                + "    <id>3</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test3</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test4</title>\n" + "    <ns>10</ns>\n"
                + "    <id>4</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test4</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test5</title>\n" + "    <ns>10</ns>\n"
                + "    <id>5</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test5</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test6</title>\n" + "    <ns>10</ns>\n"
                + "    <id>6</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test6</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test7</title>\n" + "    <ns>10</ns>\n"
                + "    <id>7</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test7</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test8</title>\n" + "    <ns>10</ns>\n"
                + "    <id>8</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test8</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test9</title>\n" + "    <ns>10</ns>\n"
                + "    <id>9</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test9</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test10</title>\n" + "    <ns>10</ns>\n"
                + "    <id>10</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test10</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test11</title>\n" + "    <ns>10</ns>\n"
                + "    <id>11</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test11</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test12</title>\n" + "    <ns>10</ns>\n"
                + "    <id>12</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test12</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test13</title>\n" + "    <ns>10</ns>\n"
                + "    <id>13</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test13</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test14</title>\n" + "    <ns>10</ns>\n"
                + "    <id>14</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test14</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test15</title>\n" + "    <ns>10</ns>\n"
                + "    <id>15</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test15</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test16</title>\n" + "    <ns>10</ns>\n"
                + "    <id>16</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test16</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test17</title>\n" + "    <ns>10</ns>\n"
                + "    <id>17</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test17</username>\n" + "      </usernames>\n" + "    </restrictions>\n"
                + "  </page>\n" + "  <page>\n" + "    <title>Template:Test18</title>\n" + "    <ns>10</ns>\n"
                + "    <id>18</id>\n" + "    <restrictions>\n" + "      <usernames>\n"
                + "        <username>Test18</