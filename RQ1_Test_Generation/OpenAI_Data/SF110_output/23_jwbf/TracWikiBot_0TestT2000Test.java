// TracWikiBot_0Test.java
package net.sourceforge.jwbf.trac.bots;

import java.net.MalformedURLException;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.ContentAccessable;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.trac.actions.GetRevision;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link TracWikiBot}.
* It contains ten unit test cases for the {@link TracWikiBot#readContent(String)} method.
*/
class TracWikiBot_0Test {

		private static final String URL = "http://trac.edgewall.org/wiki/";
		private static final String NAME = "TracWiki";
		private static final String CONTENT = "= Trac Wiki =\n" + 
				"\n" + 
				"This is the Trac Wiki, used for the documentation of Trac.\n" + 
				"\n" + 
				"== Wiki Formatting ==\n" + 
				"\n" + 
				"Trac uses a simple and intuitive [http://trac.edgewall.org/wiki/WikiFormatting WikiFormatting] syntax.\n" + 
				"\n" + 
				"== Wiki Pages ==\n" + 
				"\n" + 
				" * [wiki:WikiStart WikiStart] - starting point for browsing the wiki\n" + 
				" * [wiki:WikiFormatting WikiFormatting] - simple rules for editing pages\n" + 
				" * [wiki:TracLinks TracLinks] - custom wiki links to Trac resources\n" + 
				" * [wiki:InterMapTxt InterMapTxt] - links to other sites based on aliases defined in a text file\n" + 
				"\n" + 
				"== Trac Guides ==\n" + 
				"\n" + 
				" * [wiki:TracGuide TracGuide] - Trac User and Administration Guide\n" + 
				" * [wiki:TracAdmin TracAdmin] - Trac Project Administration\n" + 
				" * [wiki:TracBackup TracBackup] - Backup and Restore\n" + 
				" * [wiki:TracInstall TracInstall] - Installation of Trac\n" + 
				" * [wiki:TracUpgrade TracUpgrade] - Upgrading Trac\n" + 
				" * [wiki:TracIni TracIni] - Trac Configuration File\n" + 
				" * [wiki:TracLogging TracLogging] - Trac Logging Configuration\n" + 
				" * [wiki:TracPermissions TracPermissions] - Trac Permission System\n" + 
				" * [wiki:TracPlugins TracPlugins] - Trac Plugins\n" + 
				" * [wiki:TracQuery TracQuery] - Trac Ticket Query Language\n" + 
				" * [wiki:TracReports TracReports] - Trac Reports\n" + 
				" * [wiki:TracRevisionLog TracRevisionLog] - Trac Revision Log\n" + 
				" * [wiki:TracRoadmap TracRoadmap] - Trac Roadmap\n" + 
				" * [wiki:TracRss TracRss] - Trac RSS Feeds\n" + 
				" * [wiki:TracSearch TracSearch] - Trac Search\n" + 
				" * [wiki:TracStandalone TracStandalone] - Trac Standalone Web Server\n" + 
				" * [wiki:TracSupport TracSupport] - Trac Support\n" + 
				" * [wiki:TracSyntaxColoring TracSyntaxColoring] - Trac Syntax Coloring\n" + 
				" * [wiki:TracTickets TracTickets] - Trac Ticket System\n" + 
				" * [wiki:TracTimeline TracTimeline] - Trac Timeline\n" + 
				" * [wiki:TracUnicode TracUnicode] - Trac Unicode Support\n" + 
				" * [wiki:TracWorkflow TracWorkflow] - Trac Workflow\n" + 
				"\n" + 
				"== Trac Hacks ==\n" + 
				"\n" + 
				" * [wiki:TracDev TracDev] - Trac Developer Guide\n" + 
				" * [wiki:TracDev/ApiChanges TracDev/ApiChanges] - Trac API Changes\n" + 
				" * [wiki:TracDev/ComponentArchitecture TracDev/ComponentArchitecture] - Trac Component Architecture\n" + 
				" * [wiki:TracDev/Debugging TracDev/Debugging] - Trac Debugging Techniques\n" + 
				" * [wiki:TracDev/DevelopmentEnvironment TracDev/DevelopmentEnvironment] - Trac Development Environment\n" + 
				" * [wiki:TracDev/Hacking TracDev/Hacking] - Trac Hacking Guide\n" + 
				" * [wiki:TracDev/HowTo TracDev/HowTo] - Trac HowTo Guides\n" + 
				" * [wiki:TracDev/PluginDevelopment TracDev/PluginDevelopment] - Trac Plugin Development\n" + 
				" * [wiki:TracDev/Proposals TracDev/Proposals] - Trac Development Proposals\n" + 
				" * [wiki:TracDev/ReleaseChecklist TracDev/ReleaseChecklist] - Trac Release Checklist\n" + 
				" * [wiki:TracDev/ReleaseProcess TracDev/ReleaseProcess] - Trac Release Process\n" + 
				" * [wiki:TracDev/SubversionIntegration TracDev/SubversionIntegration] - Trac Subversion Integration\n" + 
				" * [wiki:TracDev/Testing TracDev/Testing] - Trac Testing Guide\n" + 
				" * [wiki:TracDev/TranslationStrings TracDev/TranslationStrings] - Trac Translation Strings\n" + 
				" * [wiki:TracDev/UnitTests TracDev/UnitTests] - Trac Unit Tests\n" + 
				" * [wiki:TracDev/WebAdmin TracDev/WebAdmin] - Trac Web Administration\n" + 
				" * [wiki:TracDev/WebInterface TracDev/WebInterface] - Trac Web Interface\n" + 
				" * [wiki:TracDev/XmlRpc TracDev/XmlRpc] - Trac XML-RPC Interface\n" + 
				"\n" + 
				"== Trac Plugins ==\n" + 
				"\n" + 
				" * [wiki:TracAccountManager TracAccountManager] - AccountManagerPlugin\n" + 
				" * [wiki:TracAnnouncer TracAnnouncer] - AnnouncerPlugin\n" + 
				" * [wiki:TracAuthOpenId TracAuthOpenId] - AuthOpenIdPlugin\n" + 
				" * [wiki:TracAuthzAdmin TracAuthzAdmin] - AuthzAdminPlugin\n" + 
				" * [wiki:TracBatchModify TracBatchModify] - BatchModifyPlugin\n" + 
				" * [wiki:TracBrowserTracLinks TracBrowserTracLinks] - BrowserTracLinksPlugin\n" + 
				" * [wiki:TracChart TracChart] - ChartPlugin\n" + 
				" * [wiki:TracCodeComments TracCodeComments] - CodeCommentsPlugin\n" + 
				" * [wiki:TracCodeReview TracCodeReview] - CodeReviewPlugin\n" + 
				" * [wiki:TracCommitTicketUpdater TracCommitTicketUp