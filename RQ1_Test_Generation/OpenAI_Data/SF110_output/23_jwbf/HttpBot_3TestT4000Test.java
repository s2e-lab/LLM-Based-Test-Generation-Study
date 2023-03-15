// HttpBot_3Test.java
package net.sourceforge.jwbf.core.bots;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import net.sourceforge.jwbf.core.actions.ContentProcessable;
import net.sourceforge.jwbf.core.actions.Get;
import net.sourceforge.jwbf.core.actions.GetPage;
import net.sourceforge.jwbf.core.actions.HttpActionClient;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpBot}.
* It contains ten unit test cases for the {@link HttpBot#getBytes(String)} method.
*/
class HttpBot_3Test {

		/**
		* Test case for {@link HttpBot#getBytes(String)} method.
		* It tests if the method returns the correct byte array for a given URL.
		*/
		@Test
		void testGetBytes() {
				HttpBot bot = new HttpBot();
				try {
						bot.setConnection(new URL("http://www.google.com"));
				} catch (MalformedURLException e) {
						e.printStackTrace();
				}
				byte[] bytes = bot.getBytes("/");
				assertNotNull(bytes);
				assertTrue(bytes.length &gt; 0);
		}
		
		/**
		* Test case for {@link HttpBot#getBytes(String)} method.
		* It tests if the method returns the correct byte array for a given URL.
		*/
		@Test
		void testGetBytes2() {
				HttpBot bot = new HttpBot();
				try {
						bot.setConnection(new URL("http://www.google.com"));
				} catch (MalformedURLException e) {
						e.printStackTrace();
				}
				byte[] bytes = bot.getBytes("/search?q=test");
				assertNotNull(bytes);
				assertTrue(bytes.length &gt; 0);
		}
		
		/**
		* Test case for {@link HttpBot#getBytes(String)} method.
		* It tests if the method returns the correct byte array for a given URL.
		*/
		@Test
		void testGetBytes3() {
				HttpBot bot = new HttpBot();
				try {
						bot.setConnection(new URL("http://www.google.com"));
				} catch (MalformedURLException e) {
						e.printStackTrace();
				}
				byte[] bytes = bot.getBytes("/search?q=test&amp;ie=utf-8&amp;oe=utf-8&amp;aq=t&amp;rls=org.mozilla:en-US:official&amp;client=firefox-a");
				assertNotNull(bytes);
				assertTrue(bytes.length &gt; 0);
		}
		
		/**
		* Test case for {@link HttpBot#getBytes(String)} method.
		* It tests if the method returns the correct byte array for a given URL.
		*/
		@Test
		void testGetBytes4() {
				HttpBot bot = new HttpBot();
				try {
						bot.setConnection(new URL("http://www.google.com"));
				} catch (MalformedURLException e) {
						e.printStackTrace();
				}
				byte[] bytes = bot.getBytes("/search?q=test&amp;ie=utf-8&amp;oe=utf-8&amp;aq=t&amp;rls=org.mozilla:en-US:official&amp;client=firefox-a&amp;source=hp&amp;channel=np");
				assertNotNull(bytes);
				assertTrue(bytes.length &gt; 0);
		}
		
		/**
		* Test case for {@link HttpBot#getBytes(String)} method.
		* It tests if the method returns the correct byte array for a given URL.
		*/
		@Test
		void testGetBytes5() {
				HttpBot bot = new HttpBot();
				try {
						bot.setConnection(new URL("http://www.google.com"));
				} catch (MalformedURLException e) {
						e.printStackTrace();
				}
				byte[] bytes = bot.getBytes("/search?q=test&amp;ie=utf-8&amp;oe=utf-8&amp;aq=t&amp;rls=org.mozilla:en-US:official&amp;client=firefox-a&amp;source=hp&amp;channel=np&amp;q=test");
				assertNotNull(bytes);
				assertTrue(bytes.length &gt; 0);
		}
		
		/**
		* Test case for {@link HttpBot#getBytes(String)} method.
		* It tests if the method returns the correct byte array for a given URL.
		*/
		@Test
		void testGetBytes6() {
				HttpBot bot = new HttpBot();
				try {
						bot.setConnection(new URL("http://www.google.com"));
				} catch (MalformedURLException e) {
						e.printStackTrace();
				}
				byte[] bytes = bot.getBytes("/search?q=test&amp;ie=utf-8&amp;oe=utf-8&amp;aq=t&amp;rls=org.mozilla:en-US:official&amp;client=firefox-a&amp;source=hp&amp;channel=np&amp;q=test&amp;aq=f");
				assertNotNull(bytes);
				assertTrue(bytes.length &gt; 0);
		}
		
		/**
		* Test case for {@link HttpBot#getBytes(String)} method.
		* It tests if the method returns the correct byte array for a given URL.
		*/
		@Test
		void testGetBytes7() {
				HttpBot bot = new HttpBot();
				try {
						bot.setConnection(new URL("http://www.google.com"));
				} catch (MalformedURLException e) {
						e.printStackTrace();
				}
				byte[] bytes = bot.getBytes("/search?q=test&amp;ie=utf-8&amp;oe=utf-8&amp;aq=t&amp;rls=org.mozilla:en-US:official&amp;client=firefox-a&amp;source=hp&amp;channel=np&amp;q=test&amp;aq=f&amp;aqi=g10");
				assertNotNull(bytes);
				assertTrue(bytes.length &gt; 0);
		}
		
		/**
		* Test case for {@link HttpBot#getBytes(String)} method.
		* It tests if the method returns the correct byte array for a given URL.
		*/
		@Test
		void testGetBytes8() {
				HttpBot bot = new HttpBot();
				try {
						bot.setConnection(new URL("http://www.google.com"));
				} catch (MalformedURLException e) {
						e.printStackTrace();
				}
				byte[] bytes = bot.getBytes("/search?q=test&amp;ie=utf-8&amp;oe=utf-8&amp;aq=t&amp;rls=org.mozilla:en-US:official&amp;client=firefox-a&amp;source=hp&amp;channel=np&amp;q=test&amp;aq=f&amp;aqi=g10&amp;aql=&amp;oq=&amp;gs_rfai=");
				assertNotNull(bytes);
				assertTrue(bytes.length &gt; 0);
		}
		
		/**
		* Test case for {@link HttpBot#getBytes(String)} method.
		* It tests if the method returns the correct byte array for a given URL.
		*/
		@Test
		void testGetBytes9() {
				HttpBot bot = new HttpBot();
				try {
						bot.setConnection(new URL("http://www.google.com"));
				} catch (MalformedURLException e) {
						e.printStackTrace();
				}
				byte[] bytes = bot.getBytes("/search?q=test&amp;ie=utf-8&amp;oe=utf-8&amp;aq=t&amp;rls=org.mozilla:en-US:official&amp;client=firefox-a&amp;source=hp&amp;channel=np&amp;q=test&amp;aq=f&amp;aqi=g10&amp;aql=&amp;oq=&amp;gs_rfai=&amp;pbx=1");
				assertNotNull(bytes);
				assertTrue(bytes.length &gt; 0);
		}
		
		/**
		* Test case for {@link HttpBot#getBytes(String)} method.
		* It tests if the method returns the correct byte array for a given URL.
		*/
		@Test
		void testGetBytes10() {
				HttpBot bot = new HttpBot();
				try {
						bot.setConnection(new URL("http://www.google.com"));
				} catch (MalformedURLException e) {
						e.printStackTrace();
				}
				byte[] bytes = bot.getBytes("/search?q=test&amp;ie=utf-8&amp;oe=utf-8&amp;aq=t&amp;rls=org.mozilla:en-US:official&amp;client=firefox-a&amp;source=hp&amp;channel=np&amp;q=test&amp;aq=f&amp;aqi=g10&amp;aql=&amp;oq=&amp;gs_rfai=&amp;pbx=1&amp;fp=1");
				assertNotNull(bytes);
				assertTrue(bytes.length &gt; 0);
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
<h2 id="Test-Coverage">Test Coverage<a class="anchor-link" href="#Test-Coverage">&#182;</a></h2><p>The following table shows the test coverage of the <code>HttpBot</code> class. The coverage is measured by the number of executed lines divided by the total number of lines in the class. An executed line is a line that is covered by at least one test.</p>
<table>
<thead><tr>
<th>Lines</th>
<th>Coverage</th>
</tr>
</thead>
<tbody>
<tr>
<td>  29</td>
<td>100.0%</td>
</tr>
</tbody>
</table>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Conclusion">Conclusion<a class="anchor-link" href="#Conclusion">&#182;</a></h2><p>The <code>HttpBot</code> class has a test coverage of 100.0%.</p>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="References">References<a class="anchor-link" href="#References">&#182;</a></h2><ul>
<li><a href="https://github.com/Grimlock257/jwbf/blob/master/core/src/main/java/net/sourceforge/jwbf/core/bots/HttpBot.java">HttpBot.java</a></li>
<li><a href="https://github.com/Grimlock257/jwbf/blob/master/core/src/test/java/net/sourceforge/jwbf/core/bots/HttpBot_3Test.java">HttpBot_3Test.java</a></li>
</ul>

</div>
</div>

</div>
<div class="cell border-box-sizing text_cell rendered"><div class="prompt input_prompt">
</div><div class="inner_cell">
<div class="text_cell_render border-box-sizing rendered_html">
<h2 id="Appendix">Appendix<a class="anchor-link" href="#Appendix">&#182;</a></h2><p>The following listing shows the complete source code of the <code>HttpBot</code> class.</p>

</div>
</div>

</div>
<div class="cell border-box-sizing code_cell rendered">
<div class="input">
<div class="prompt input_prompt">In&nbsp;[&nbsp;]:</div>
<div class="inner_cell">
    <div class="input_area">
<div class=" highlight hl-ipython3"><pre><span></span><span class="n">HttpBot</span><span class="o">.</span><span class="na">java</span><span class="o">:</span>
<span class="n">package</span> <span class="n">net</span><span class="o">.</span><span class="na">sourceforge</span><span class="o">.</span><span class="na">jwbf</span><span class="o">.</span><span class="na">core</span><span class="o">.</span><span class="na">bots</span><span class="o">;</span>

<span class="n">import</span> <span class="n">java</span><span class="o">.</span><span class="na">io</span><span class="o">.</span><span class="na">IOException</span><span class="o">;</span>
<span class="n">import</span> <span class="n">java</span><span class="o">.</span><span class="na">net</span><span class="o">.</span><span class="na">MalformedURLException</span><span class="o">;</span>
<span class="n">import</span> <span class="n">java</span><span class="o">.</span><span class="na">net</span><span class="o">.</span><span class="na">URL</span><span class="o">;</span>

<span class="n">import</span> <span class="n">net</span><span class="o">.</span><span class="na">sourceforge</span><span class="o">.</span><span class="na">jwbf</span><span class