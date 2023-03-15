// ImageInfoTest.java
package net.sourceforge.jwbf.mediawiki.actions.queries;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import javax.imageio.ImageIO;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionException;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.apache.commons.lang.math.NumberUtils;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ImageInfo}.
* It contains ten unit test cases for the {@link ImageInfo#processAllReturningText(String)} method.
*/
class ImageInfoTest {

		/**
		* Test case for {@link ImageInfo#processAllReturningText(String)} method.
		* @throws ProcessException on
		*/
		@Test
		void testProcessAllReturningText() throws ProcessException {
				String s = "";
				ImageInfo imageInfo = new ImageInfo(new MediaWikiBot(), "Test.gif");
				imageInfo.processAllReturningText(s);
		}
		
		/**
		* Test case for {@link ImageInfo#processAllReturningText(String)} method.
		* @throws ProcessException on
		*/
		@Test
		void testProcessAllReturningText2() throws ProcessException {
				String s = "";
				ImageInfo imageInfo = new ImageInfo(new MediaWikiBot(), "Test.gif", new String[][] {});
				imageInfo.processAllReturningText(s);
		}
		
		/**
		* Test case for {@link ImageInfo#processAllReturningText(String)} method.
		* @throws ProcessException on
		*/
		@Test
		void testProcessAllReturningText3() throws ProcessException {
				String s = "";
				ImageInfo imageInfo = new ImageInfo(new MediaWikiBot(), "Test.gif", new HashMap<String, String>());
				imageInfo.processAllReturningText(s);
		}
		
		/**
		* Test case for {@link ImageInfo#processAllReturningText(String)} method.
		* @throws ProcessException on
		*/
		@Test
		void testProcessAllReturningText4() throws ProcessException {
				String s = "";
				ImageInfo imageInfo = new ImageInfo(new MediaWikiBot(), "Test.gif", new HashMap<String, String>());
				imageInfo.processAllReturningText(s);
		}
		
		/**
		* Test case for {@link ImageInfo#processAllReturningText(String)} method.
		* @throws ProcessException on
		*/
		@Test
		void testProcessAllReturningText5() throws ProcessException {
				String s = "";
				ImageInfo imageInfo = new ImageInfo(new MediaWikiBot(), "Test.gif", new HashMap<String, String>());
				imageInfo.processAllReturningText(s);
		}
		
		/**
		* Test case for {@link ImageInfo#processAllReturningText(String)} method.
		* @throws ProcessException on
		*/
		@Test
		void testProcessAllReturningText6() throws ProcessException {
				String s = "";
				ImageInfo imageInfo = new ImageInfo(new MediaWikiBot(), "Test.gif", new HashMap<String, String>());
				imageInfo.processAllReturningText(s);
		}
		
		/**
		* Test case for {@link ImageInfo#processAllReturningText(String)} method.
		* @throws ProcessException on
		*/
		@Test
		void testProcessAllReturningText7() throws ProcessException {
				String s = "";
				ImageInfo imageInfo = new ImageInfo(new MediaWikiBot(), "Test.gif", new HashMap<String, String>());
				imageInfo.processAllReturningText(s);
		}
		
		/**
		* Test case for {@link ImageInfo#processAllReturningText(String)} method.
		* @throws ProcessException on
		*/
		@Test
		void testProcessAllReturningText8() throws ProcessException {
				String s = "";
				ImageInfo imageInfo = new ImageInfo(new MediaWikiBot(), "Test.gif", new HashMap<String, String>());
				imageInfo.processAllReturningText(s);
		}
		
		/**
		* Test case for {@link ImageInfo#processAllReturningText(String)} method.
		* @throws ProcessException on
		*/
		@Test
		void testProcessAllReturningText9() throws ProcessException {
				String s = "";
				ImageInfo imageInfo = new ImageInfo(new MediaWikiBot(), "Test.gif", new HashMap<String, String>());
				imageInfo.processAllReturningText(s);
		}
		
		/**
		* Test case for {@link ImageInfo#processAllReturningText(String)} method.
		* @throws ProcessException on
		*/
		@Test
		void testProcessAllReturningText10() throws ProcessException {
				String s = "";
				ImageInfo imageInfo = new ImageInfo(new MediaWikiBot(), "Test.gif", new HashMap<String, String>());
				imageInfo.processAllReturningText(s);
		}
}

// MediaWikiBot.java
package net.sourceforge.jwbf.mediawiki.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.RequestBuilder;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.HttpBot;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import net.sourceforge.jwbf.mediawiki.ApiRequestBuilder;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki.VersionException;
import net.sourceforge.jwbf.mediawiki.actions.queries.CategoryMembers;
import net.sourceforge.jwbf.mediawiki.actions.queries.ImageInfo;
import net.sourceforge.jwbf.mediawiki.actions.queries.ImageUsageTitles;
import net.sourceforge.jwbf.mediawiki.actions.queries.LinkTitles;
import net.sourceforge.jwbf.mediawiki.actions.queries.TemplateUserTitles;
import net.sourceforge.jwbf.mediawiki.actions.queries.Userinfo.UserinfoException;
import net.sourceforge.jwbf.mediawiki.actions.util.RedirectFilter;
import net.sourceforge.jwbf.mediawiki.actions.util.VersionExceptionError;
import net.sourceforge.jwbf.mediawiki.bots.util.MWActionException;
import net.sourceforge.jwbf.mediawiki.bots.util.MWActionException.ActionExceptionType;
import net.sourceforge.jwbf.mediawiki.bots.util.MWActionException.ExceptionType;
import net.sourceforge.jwbf.mediawiki.bots.util.MWActionException.ProcessExceptionType;
import net.sourceforge.jwbf.mediawiki.bots.util.MWActionException.VersionExceptionType;
import net.sourceforge.jwbf.mediawiki.contentRep.LoginData;
import net.sourceforge.jwbf.mediawiki.contentRep.SimpleFile;
import net.sourceforge.jwbf.mediawiki.contentRep.SimpleImage;
import net.sourceforge.jwbf.mediawiki.contentRep.SimpleRevision;
import net.sourceforge.jwbf.mediawiki.contentRep.SimpleWikiModel;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPage;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerException;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType.TalkPageContainerTypeExceptionTypeTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType.TalkPageContainerTypeExceptionTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType.TalkPageContainerTypeExceptionTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType.TalkPageContainerTypeExceptionTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType.TalkPageContainerTypeExceptionTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType.TalkPageContainerTypeExceptionTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType.TalkPageContainerTypeExceptionTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType.TalkPageContainerTypeExceptionTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType.TalkPageContainerTypeExceptionTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType.TalkPageContainerTypeExceptionTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType.TalkPageContainerTypeExceptionTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType.TalkPageContainerTypeExceptionTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPageContainerTypeExceptionTypeType.TalkPageContainerTypeExceptionTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeType.TalkPageContainerTypeExceptionTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeTypeType;
import net.sourceforge.jwbf.mediawiki.contentRep.TalkPageContainer.TalkPageContainerTypeException.TalkPageContainerTypeExceptionType.TalkPage