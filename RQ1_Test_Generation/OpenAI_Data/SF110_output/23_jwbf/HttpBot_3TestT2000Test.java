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
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("http://localhost/");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_2() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("http://localhost/");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_3() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("http://localhost/");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_4() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("http://localhost/");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_5() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("http://localhost/");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_6() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("http://localhost/");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_7() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("http://localhost/");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_8() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("http://localhost/");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_9() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("http://localhost/");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
	/**
	 * Test method for {@link HttpBot#getBytes(String)}.
	 * @throws IOException 
	 * @throws ProcessException 
	 * @throws ActionException 
	 */
	@Test
	void testGetBytes_10() throws ActionException, ProcessException, IOException {
		HttpBot bot = new HttpBot();
		bot.setConnection(new HttpActionClient(new URL("http://localhost/")));
		byte[] bytes = bot.getBytes("http://localhost/");
		assertNotNull(bytes);
		assertTrue(bytes.length &gt; 0);
	}
	
}</code></pre>
</div>
</div>

</section>
</div>

<div class="row">
<section id="coverage-report" class="col-12">
<div class="page-header">
<h2>Coverage report<small> for <a href="http://localhost:8080/job/JWBF-master/ws/target/site/jacoco/index.html">JWBF-master</a></small></h2>
</div>

<div class="row">
<div class="col-6">
<div class="panel panel-default">
<div class="panel-heading">
<h3 class="panel-title">Classes</h3>
</div>
<div class="panel-body">
<div class="row">
<div class="col-6">
<div class="progress">
<div class="progress-bar progress-bar-success" role="progressbar" style="width: 100.0%;" aria-valuenow="100" aria-valuemin="0" aria-valuemax="100">100.0% (100/100)</div>
</div>
</div>
<div class="col-6">
<div class="progress">
<div class="progress-bar progress-bar-danger" role="progressbar" style="width: 0.0%;" aria-valuenow="0" aria-valuemin="0" aria-valuemax="100">0.0% (0/100)</div>
</div>
</div>
</div>
</div>
</div>
</div>
<div class="col-6">
<div class="panel panel-default">
<div class="panel-heading">
<h3 class="panel-title">Methods</h3>
</div>
<div class="panel-body">
<div class="row