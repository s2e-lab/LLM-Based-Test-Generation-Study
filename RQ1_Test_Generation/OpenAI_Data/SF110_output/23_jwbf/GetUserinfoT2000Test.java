// GetUserinfoTest.java
package net.sourceforge.jwbf.mediawiki.actions.meta;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_11;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.Reader;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
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
* Test class of {@link GetUserinfo}.
* It contains ten unit test cases for the {@link GetUserinfo#processAllReturningText(String)} method.
*/
class GetUserinfoTest {

		/**
		 * Test case for {@link GetUserinfo#processAllReturningText(String)} method.
		 * @throws VersionException 
		 */
		@Test
		void testProcessAllReturningText() throws VersionException {
				GetUserinfo getUserinfo = new GetUserinfo(MW1_11);
				String xml = "<api><query><userinfo name=\"TestUser\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /></query></api>";
				getUserinfo.processAllReturningText(xml);
				assertEquals("TestUser", getUserinfo.getUsername());
				assertEquals(0, getUserinfo.getRights().size());
				assertEquals(0, getUserinfo.getGroups().size());
		}
		
		/**
		 * Test case for {@link GetUserinfo#processAllReturningText(String)} method.
		 * @throws VersionException 
		 */
		@Test
		void testProcessAllReturningText2() throws VersionException {
				GetUserinfo getUserinfo = new GetUserinfo(MW1_11);
				String xml = "<api><query><userinfo name=\"TestUser\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser2\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /></query></api>";
				getUserinfo.processAllReturningText(xml);
				assertEquals("TestUser", getUserinfo.getUsername());
				assertEquals(0, getUserinfo.getRights().size());
				assertEquals(0, getUserinfo.getGroups().size());
		}
		
		/**
		 * Test case for {@link GetUserinfo#processAllReturningText(String)} method.
		 * @throws VersionException 
		 */
		@Test
		void testProcessAllReturningText3() throws VersionException {
				GetUserinfo getUserinfo = new GetUserinfo(MW1_11);
				String xml = "<api><query><userinfo name=\"TestUser\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser2\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser3\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /></query></api>";
				getUserinfo.processAllReturningText(xml);
				assertEquals("TestUser", getUserinfo.getUsername());
				assertEquals(0, getUserinfo.getRights().size());
				assertEquals(0, getUserinfo.getGroups().size());
		}
		
		/**
		 * Test case for {@link GetUserinfo#processAllReturningText(String)} method.
		 * @throws VersionException 
		 */
		@Test
		void testProcessAllReturningText4() throws VersionException {
				GetUserinfo getUserinfo = new GetUserinfo(MW1_11);
				String xml = "<api><query><userinfo name=\"TestUser\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser2\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser3\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser4\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /></query></api>";
				getUserinfo.processAllReturningText(xml);
				assertEquals("TestUser", getUserinfo.getUsername());
				assertEquals(0, getUserinfo.getRights().size());
				assertEquals(0, getUserinfo.getGroups().size());
		}
		
		/**
		 * Test case for {@link GetUserinfo#processAllReturningText(String)} method.
		 * @throws VersionException 
		 */
		@Test
		void testProcessAllReturningText5() throws VersionException {
				GetUserinfo getUserinfo = new GetUserinfo(MW1_11);
				String xml = "<api><query><userinfo name=\"TestUser\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser2\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser3\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser4\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser5\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /></query></api>";
				getUserinfo.processAllReturningText(xml);
				assertEquals("TestUser", getUserinfo.getUsername());
				assertEquals(0, getUserinfo.getRights().size());
				assertEquals(0, getUserinfo.getGroups().size());
		}
		
		/**
		 * Test case for {@link GetUserinfo#processAllReturningText(String)} method.
		 * @throws VersionException 
		 */
		@Test
		void testProcessAllReturningText6() throws VersionException {
				GetUserinfo getUserinfo = new GetUserinfo(MW1_11);
				String xml = "<api><query><userinfo name=\"TestUser\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser2\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser3\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser4\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"TestUser5\" blockid=\"0\" blockedby=\"\" blockedbyid=\"0\" blockedreason=\"\" blockedexpiry=\"infinite\" editcount=\"0\" groups=\"\" rights=\"\" /><userinfo name=\"