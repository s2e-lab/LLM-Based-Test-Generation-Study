// SSHSCPPanelTest0.java
/**
 * This class has been completely rewritten from the original.  Its design
 * is based on the LayoutManager tutorial at Sun's Java web site available at
 * http://developer.java.sun.com/developer/onlineTraining/GUI/AWTLayoutMgr/shortcourse.html
 *
 * It implements a WS-FTP-like interface for browsing, manipulating, and transferring
 * files in a secure way over SSH.  It logs into the remote machine using the same
 * account and authentication method as the user used to log in.
 * Unfortunately, that means if you need root file access you'll need to log in as
 * root through SSH
 */
package mindbright.ssh;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import com.gotoservers.ftp.LoginParam;
import com.gotoservers.ftp.RemoteFileBrowser;
import com.isnetworks.ssh.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SSHSCPPanel}.
* It contains ten unit test cases for the {@link SSHSCPPanel#getThreadGroup()} method.
*/
class SSHSCPPanelTest0 {

	/**
	* Test case for the {@link SSHSCPPanel#getThreadGroup()} method.
	* @throws Exception
	*/
	@Test
	void testGetThreadGroup0() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		ThreadGroup result = sshscpPanel.getThreadGroup();
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SSHSCPPanel#getThreadGroup()} method.
	* @throws Exception
	*/
	@Test
	void testGetThreadGroup1() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		ThreadGroup result = sshscpPanel.getThreadGroup();
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SSHSCPPanel#getThreadGroup()} method.
	* @throws Exception
	*/
	@Test
	void testGetThreadGroup2() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		ThreadGroup result = sshscpPanel.getThreadGroup();
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SSHSCPPanel#getThreadGroup()} method.
	* @throws Exception
	*/
	@Test
	void testGetThreadGroup3() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		ThreadGroup result = sshscpPanel.getThreadGroup();
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SSHSCPPanel#getThreadGroup()} method.
	* @throws Exception
	*/
	@Test
	void testGetThreadGroup4() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		ThreadGroup result = sshscpPanel.getThreadGroup();
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SSHSCPPanel#getThreadGroup()} method.
	* @throws Exception
	*/
	@Test
	void testGetThreadGroup5() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		ThreadGroup result = sshscpPanel.getThreadGroup();
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SSHSCPPanel#getThreadGroup()} method.
	* @throws Exception
	*/
	@Test
	void testGetThreadGroup6() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		ThreadGroup result = sshscpPanel.getThreadGroup();
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SSHSCPPanel#getThreadGroup()} method.
	* @throws Exception
	*/
	@Test
	void testGetThreadGroup7() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		ThreadGroup result = sshscpPanel.getThreadGroup();
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SSHSCPPanel#getThreadGroup()} method.
	* @throws Exception
	*/
	@Test
	void testGetThreadGroup8() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		ThreadGroup result = sshscpPanel.getThreadGroup();
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SSHSCPPanel#getThreadGroup()} method.
	* @throws Exception
	*/
	@Test
	void testGetThreadGroup9() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		ThreadGroup result = sshscpPanel.getThreadGroup();
		assertNotNull(result);
	}
	
}

// SSHSCPPanelTest1.java
/**
 * This class has been completely rewritten from the original.  Its design
 * is based on the LayoutManager tutorial at Sun's Java web site available at
 * http://developer.java.sun.com/developer/onlineTraining/GUI/AWTLayoutMgr/shortcourse.html
 *
 * It implements a WS-FTP-like interface for browsing, manipulating, and transferring
 * files in a secure way over SSH.  It logs into the remote machine using the same
 * account and authentication method as the user used to log in.
 * Unfortunately, that means if you need root file access you'll need to log in as
 * root through SSH
 */
package mindbright.ssh;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import com.gotoservers.ftp.LoginParam;
import com.gotoservers.ftp.RemoteFileBrowser;
import com.isnetworks.ssh.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SSHSCPPanel}.
* It contains ten unit test cases for the {@link SSHSCPPanel#createThreadName()} method.
*/
class SSHSCPPanelTest1 {
		
	/**
	* Test case for the {@link SSHSCPPanel#createThreadName()} method.
	* @throws Exception
	*/
	@Test
	void testCreateThreadName0() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		String result = sshscpPanel.createThreadName();
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SSHSCPPanel#createThreadName()} method.
	* @throws Exception
	*/
	@Test
	void testCreateThreadName1() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		String result = sshscpPanel.createThreadName();
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SSHSCPPanel#createThreadName()} method.
	* @throws Exception
	*/
	@Test
	void testCreateThreadName2() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		String result = sshscpPanel.createThreadName();
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link SSHSCPPanel#createThreadName()} method.
	* @throws Exception
	*/
	@Test
	void testCreateThreadName3() throws Exception {
		SSHPropertyHandler propHandler = new SSHPropertyHandler(null);
		SSHSCPPanel sshscpPanel = new SSHSCPPanel(propHandler);
		String result = sshscpPanel.createThreadName();
		assertNotNull(result);
	}
	
	/**
	*