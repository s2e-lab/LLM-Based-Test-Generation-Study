// BomberServer_0Test.java
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.GlobalServerMsg;
import messages.global.SessionDetailsMsg;
import messages.global.SessionListMsg;
import org.apache.log4j.Logger;
import org.hsqldb.Server;
import org.hsqldb.jdbc.jdbcDataSource;
import common.Constants;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberServer}.
* It contains ten unit test cases for the {@link BomberServer#createSession(String, List, ImageIcon, int, int)} method.
*/
class BomberServer_0Test {

	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 0, totalRounds = 0
	*/
	@Test
	public void testCreateSession_0() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 0;
		int totalRounds = 0;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 0, totalRounds = 1
	*/
	@Test
	public void testCreateSession_1() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 0;
		int totalRounds = 1;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 1, totalRounds = 0
	*/
	@Test
	public void testCreateSession_2() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 1;
		int totalRounds = 0;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 1, totalRounds = 1
	*/
	@Test
	public void testCreateSession_3() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 1;
		int totalRounds = 1;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 2, totalRounds = 0
	*/
	@Test
	public void testCreateSession_4() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 2;
		int totalRounds = 0;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 2, totalRounds = 1
	*/
	@Test
	public void testCreateSession_5() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 2;
		int totalRounds = 1;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 3, totalRounds = 0
	*/
	@Test
	public void testCreateSession_6() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 3;
		int totalRounds = 0;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 3, totalRounds = 1
	*/
	@Test
	public void testCreateSession_7() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 3;
		int totalRounds = 1;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 4, totalRounds = 0
	*/
	@Test
	public void testCreateSession_8() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 4;
		int totalRounds = 0;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 4, totalRounds = 1
	*/
	@Test
	public void testCreateSession_9() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 4;
		int totalRounds = 1;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
}

// BomberServer_1Test.java
package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Vector;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.GlobalServerMsg;
import messages.global.SessionDetailsMsg;
import messages.global.SessionListMsg;
import org.apache.log4j.Logger;
import org.hsqldb.Server;
import org.hsqldb.jdbc.jdbcDataSource;
import common.Constants;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link BomberServer}.
* It contains ten unit test cases for the {@link BomberServer#createSession(String, List, ImageIcon, int, int)} method.
*/
class BomberServer_1Test {
		
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 0, totalRounds = 0
	*/
	@Test
	public void testCreateSession_0() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 0;
		int totalRounds = 0;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 0, totalRounds = 1
	*/
	@Test
	public void testCreateSession_1() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 0;
		int totalRounds = 1;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 1, totalRounds = 0
	*/
	@Test
	public void testCreateSession_2() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 1;
		int totalRounds = 0;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 1, totalRounds = 1
	*/
	@Test
	public void testCreateSession_3() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 1;
		int totalRounds = 1;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 2, totalRounds = 0
	*/
	@Test
	public void testCreateSession_4() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 2;
		int totalRounds = 0;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 2, totalRounds = 1
	*/
	@Test
	public void testCreateSession_5() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 2;
		int totalRounds = 1;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	/**
	* Test case for {@link BomberServer#createSession(String, List, ImageIcon, int, int)}
	* with the following input:
	* name = "test", maps = null, mapPreview = null, nrOfPlayers = 3, totalRounds = 0
	*/
	@Test
	public void testCreateSession_6() {
		// Arrange
		BomberServer bomberServer = BomberServer.getInstance();
		String name = "test";
		List<String> maps = null;
		ImageIcon mapPreview = null;
		int nrOfPlayers = 3;
		int totalRounds = 0;
		
		// Act
		ServerGameSession result = bomberServer.createSession(name, maps, mapPreview, nrOfPlayers, totalRounds);
		
		// Assert
		assertNotNull(result);
	}
	
	