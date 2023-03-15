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
		* Test if the connection to the server is established.
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
		* Test if the connection to the server is established.
		*/
		@Test
		void testConnectToSrv_2() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6666);
				assertTrue(client.connectToSrv());
		}
		
		/**
		* Test case 3 for method {@link BomberClient#connectToSrv()}.
		* Test if the connection to the server is established.
		*/
		@Test
		void testConnectToSrv_3() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6666);
				assertTrue(client.connectToSrv());
		}
		
		/**
		* Test case 4 for method {@link BomberClient#connectToSrv()}.
		* Test if the connection to the server is established.
		*/
		@Test
		void testConnectToSrv_4() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6666);
				assertTrue(client.connectToSrv());
		}
		
		/**
		* Test case 5 for method {@link BomberClient#connectToSrv()}.
		* Test if the connection to the server is established.
		*/
		@Test
		void testConnectToSrv_5() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6666);
				assertTrue(client.connectToSrv());
		}
		
		/**
		* Test case 6 for method {@link BomberClient#connectToSrv()}.
		* Test if the connection to the server is established.
		*/
		@Test
		void testConnectToSrv_6() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6666);
				assertTrue(client.connectToSrv());
		}
		
		/**
		* Test case 7 for method {@link BomberClient#connectToSrv()}.
		* Test if the connection to the server is established.
		*/
		@Test
		void testConnectToSrv_7() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6666);
				assertTrue(client.connectToSrv());
		}
		
		/**
		* Test case 8 for method {@link BomberClient#connectToSrv()}.
		* Test if the connection to the server is established.
		*/
		@Test
		void testConnectToSrv_8() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6666);
				assertTrue(client.connectToSrv());
		}
		
		/**
		* Test case 9 for method {@link BomberClient#connectToSrv()}.
		* Test if the connection to the server is established.
		*/
		@Test
		void testConnectToSrv_9() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6666);
				assertTrue(client.connectToSrv());
		}
		
		/**
		* Test case 10 for method {@link BomberClient#connectToSrv()}.
		* Test if the connection to the server is established.
		*/
		@Test
		void testConnectToSrv_10() {
				BomberClient client = new BomberClient("client");
				client.setServerName("localhost");
				client.setServerPort(6666);
				assertTrue(client.connectToSrv());
		}
}</code></pre>
</div>
</div>

</section>
</div>

<div id="outline-container-5.2" class="outline-2">
<h2 id="sec-5.2"><span class="section-number-2">5.2</span> Test case 2 for method <code>connectToSrv</code></h2>
<div class="outline-text-2" id="text-5.2">
<p>
Test if the connection to the server is established.
</p>
</div>
</div>

</div>
</div>
</div>

<div id="outline-container-6" class="outline-3">
<h2 id="sec-6"><span class="section-number-3">6</span> Test case 3 for method <code>connectToSrv</code></h2>
<div class="outline-text-3" id="text-6">
<p>
Test if the connection to the server is established.
</p>
</div>
</div>

<div id="outline-container-7" class="outline-3">
<h2 id="sec-7"><span class="section-number-3">7</span> Test case 4 for method <code>connectToSrv</code></h2>
<div class="outline-text-3" id="text-7">
<p>
Test if the connection to the server is established.
</p>
</div>
</div>

<div id="outline-container-8" class="outline-3">
<h2 id="sec-8"><span class="section-number-3">8</span> Test case 5 for method <code>connectToSrv</code></h2>
<div class="outline-text-3" id="text-8">
<p>
Test if the connection to the server is established.
</p>
</div>
</div>

<div id="outline-container-9" class="outline-3">
<h2 id="sec-9"><span class="section-number-3">9</span> Test case 6 for method <code>connectToSrv</code></h2>
<div class="outline-text-3" id="text-9">
<p>
Test if the connection to the server is established.
</p>
</div>
</div>

<div id="outline-container-10" class="outline-3">
<h2 id="sec-10"><span class="section-number-3">10</span> Test case 7 for method <code>connectToSrv</code></h2>
<div class="outline-text-3" id="text-10">
<p>
Test if the connection to the server is established.
</p>
</div>
</div>

<div id="outline-container-11" class="outline-3">
<h2 id="