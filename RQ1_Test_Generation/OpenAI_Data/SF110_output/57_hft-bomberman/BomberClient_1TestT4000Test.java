// BomberClient_1Test.java
package client;

import java.io.IOException;
import java.net.Socket;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Observable;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.InfoRequestMsg;
import messages.global.JoinSessionMsg;
import messages.global.MapInfo;
import messages.global.SessionDetailsMsg;
import messages.round.ClientQuitRunningSessionMsg;
import org.apache.log4j.Logger;
import client.gui.StartFrame;
import client.network.ClientMsgReceiver;
import client.network.ClientMsgSender;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberClient}.
* It contains ten unit test cases for the {@link BomberClient#connectToSrv()} method.
*/
class BomberClient_1Test {

		/**
		* Test case 1 for method {@link BomberClient#connectToSrv()}.
		* Test case 1 checks if the method {@link BomberClient#connectToSrv()} returns true if the server is running.
		*/
		@Test
		void testConnectToSrv_1() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6666);
				assertTrue(client.connectToSrv());
		}
		
		/**
		* Test case 2 for method {@link BomberClient#connectToSrv()}.
		* Test case 2 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		void testConnectToSrv_2() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6667);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 3 for method {@link BomberClient#connectToSrv()}.
		* Test case 3 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		void testConnectToSrv_3() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6668);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 4 for method {@link BomberClient#connectToSrv()}.
		* Test case 4 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		void testConnectToSrv_4() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6669);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 5 for method {@link BomberClient#connectToSrv()}.
		* Test case 5 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		void testConnectToSrv_5() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6670);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 6 for method {@link BomberClient#connectToSrv()}.
		* Test case 6 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		void testConnectToSrv_6() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6671);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 7 for method {@link BomberClient#connectToSrv()}.
		* Test case 7 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		void testConnectToSrv_7() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6672);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 8 for method {@link BomberClient#connectToSrv()}.
		* Test case 8 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		void testConnectToSrv_8() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6673);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 9 for method {@link BomberClient#connectToSrv()}.
		* Test case 9 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		void testConnectToSrv_9() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6674);
				assertFalse(client.connectToSrv());
		}
		
		/**
		* Test case 10 for method {@link BomberClient#connectToSrv()}.
		* Test case 10 checks if the method {@link BomberClient#connectToSrv()} returns false if the server is not running.
		*/
		@Test
		void testConnectToSrv_10() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6675);
				assertFalse(client.connectToSrv());
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
<h2 id="Test-Report">Test Report<a class="anchor-link" href="#Test-Report">&#182;</a></h2><p>The test report is generated by the <code>pytest</code> library. The report contains the following information:</p>
<ul>
<li>Test name</li>
<li>Test status (passed or failed)</li>
<li>Test execution time</li>
<li>Test function name</li>
<li>Test file name</li>
<li>Test line number</li>
</ul>
<p>The test report is generated in the <code>html</code> format. The report is generated in the <code>test-reports</code> directory.</p>

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
<h2 id="Test-Coverage">Test Coverage<a class="anchor-link" href="#Test-Coverage">&#182;</a></h2><p>The test coverage is generated by the <code>pytest-cov</code> library. The coverage report contains the following information:</p>
<ul>
<li>Total number of statements</li>
<li>Number of executed statements</li>
<li>Number of missing statements</li>
<li>Code coverage percentage</li>
</ul>
<p>The test coverage report is generated in the <code>html</code> format. The report is generated in the <code>test-reports</code> directory.</p>

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
<h2 id="References">References<a class="anchor-link" href="#References">&#182;</a></h2><ul>
<li><a href="https://docs.python.org/3/library/unittest.html">https://docs.python.org/3/library/unittest.html</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#organizing-test-code">https://docs.python.org/3/library/unittest.html#organizing-test-code</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-discovery">https://docs.python.org/3/library/unittest.html#test-discovery</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#command-line-interface">https://docs.python.org/3/library/unittest.html#command-line-interface</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#basic-example">https://docs.python.org/3/library/unittest.html#basic-example</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-fixtures">https://docs.python.org/3/library/unittest.html#test-fixtures</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-suites">https://docs.python.org/3/library/unittest.html#test-suites</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-cases">https://docs.python.org/3/library/unittest.html#test-cases</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library/unittest.html#test-case-objects">https://docs.python.org/3/library/unittest.html#test-case-objects</a></li>
<li><a href="https://docs.python.org/3/library