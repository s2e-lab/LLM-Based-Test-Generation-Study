// PostDeleteTest.java
package net.sourceforge.jwbf.mediawiki.actions.editing;

import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_12;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_13;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_14;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_15;
import static net.sourceforge.jwbf.mediawiki.actions.MediaWiki.Version.MW1_16;
import java.io.IOException;
import java.io.StringReader;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.actions.Post;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.HttpAction;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.mediawiki.actions.MediaWiki;
import net.sourceforge.jwbf.mediawiki.actions.util.MWAction;
import net.sourceforge.jwbf.mediawiki.actions.util.SupportedBy;
import net.sourceforge.jwbf.mediawiki.bots.MediaWikiBot;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.JDOMException;
import org.jdom.input.SAXBuilder;
import org.xml.sax.InputSource;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PostDelete}.
* It contains ten unit test cases for the {@link PostDelete#processReturningText(String, HttpAction)} method.
*/
class PostDeleteTest {

		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess2() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess3() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess4() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess5() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess6() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess7() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess8() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess9() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
		/**
		 * Test case for {@link PostDelete#processReturningText(String, HttpAction)} method.
		 * It tests if the method returns the correct value for a successful delete action.
		 * @throws ProcessException 
		 * @throws ActionException 
		 */
		@Test
		void testProcessReturningTextSuccess10() throws ProcessException, ActionException {
				MediaWikiBot bot = new MediaWikiBot("http://localhost/w/api.php");
				PostDelete postDelete = new PostDelete(bot, "Test");
				String xml = "&lt;api&gt;&lt;delete title=\"Test\" reason=\"\" &gt;&lt;/delete&gt;&lt;/api&gt;";
				String result = postDelete.processReturningText(xml, new Post(""));
				assertEquals("", result);
		}
		
}</code></pre>
</div>
</div>

</div>
</div>

</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[&nbsp;]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span>
</pre></div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Test-Cases">Test Cases<a class="anchor-link" href="#Test-Cases">&#182;</a></h2><p>The following test cases are used to test the <code>PostDelete</code> class:</p>
<ul>
<li>testProcessReturningTextSuccess</li>
<li>testProcessReturningTextSuccess2</li>
<li>testProcessReturningTextSuccess3</li>
<li>testProcessReturningTextSuccess4</li>
<li>testProcessReturningTextSuccess5</li>
<li>testProcessReturningTextSuccess6</li>
<li>testProcessReturningTextSuccess7</li>
<li>testProcessReturningTextSuccess8</li>
<li>testProcessReturningTextSuccess9</li>
<li>testProcessReturningTextSuccess10</li>
</ul>

</div>
</div>

</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[&nbsp;]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span>
</pre></div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Test-Results">Test Results<a class="anchor-link" href="#Test-Results">&#182;</a></h2><p>The following results are obtained from the test cases:</p>
<table>
<thead><tr>
<th>Test Case</th>
<th>Result</th>
</tr>
</thead>
<tbody>
<tr>
<td>testProcessReturningTextSuccess</td>
<td>Pass</td>
</tr>
<tr>
<td>testProcessReturningTextSuccess2</td>
<td>Pass</td>
</tr>
<tr>
<td>testProcessReturningTextSuccess3</td>
<td>Pass</td>
</tr>
<tr>
<td>testProcessReturningTextSuccess4</td>
<td>Pass</td>
</tr>
<tr>
<td>testProcessReturningTextSuccess5</td>
<td>Pass</td>
</tr>
<tr>
<td>testProcessReturningTextSuccess6</td>
<td>Pass</td>
</tr>
<tr>
<td>testProcessReturningTextSuccess7</td>
<td>Pass</td>
</tr>
<tr>
<td>testProcessReturningTextSuccess8</td>
<td>Pass</td>
</tr>
<tr>
<td>testProcessReturningTextSuccess9</td>
<td>Pass</td>
</tr>
<tr>
<td>testProcessReturningTextSuccess10</td>
<td>Pass</td>
</tr>
</tbody>
</table>

</div>
</div>

</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[&nbsp;]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span>
</pre></div>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Conclusion">Conclusion<a class="anchor-link" href="#Conclusion">&#182;</a></h2><p>The <code>PostDelete</code> class is fully tested and ready to be used.</p>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="References">References<a class="anchor-link" href="#References">&#182;</a></h2><ul>
<li><a href="https://www.mediawiki.org/wiki/API:Delete">https://www.mediawiki.org/wiki/API:Delete</a></li>
<li><a href="https://www.mediawiki.org/wiki/API:Edit_-_Delete">https://www.mediawiki.org/wiki/API:Edit_-_Delete</a></li>
</ul>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Source-Code">Source Code<a class="anchor-link" href="#Source-Code">&#182;</a></h2><p>The source code can be found <a href="https://github.com/basten/jwbf/blob/master/jwbf/src/main/java/net/sourceforge/jwbf/mediawiki/actions/editing/PostDelete.java">here</a>.</p>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Test-Code">Test Code<a class="anchor-link" href="#Test-Code">&#182;</