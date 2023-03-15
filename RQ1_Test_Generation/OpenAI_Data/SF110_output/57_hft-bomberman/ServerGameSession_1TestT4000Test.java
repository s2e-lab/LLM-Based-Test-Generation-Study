// ServerGameSession_1Test.java
package server;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.Vector;
import java.util.Map.Entry;
import javax.swing.ImageIcon;
import messages.Message;
import messages.global.ParticipantInfo;
import messages.round.RoundScoreMsg;
import messages.session.InitializeRoundMsg;
import messages.session.SessionScoreMsg;
import org.apache.log4j.Logger;
import common.GameSession;
import db.DBException;
import db.DBGameUser;
import db.DBServiceFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerGameSession}.
* It contains ten unit test cases for the {@link ServerGameSession#addParticipant(ClientInfo)} method.
*/
class ServerGameSession_1Test {

		/**
		* Test case 1 for method addParticipant.
		* Test case 1.1: The session is full.
		* Test case 1.2: The session is not full.
		*/
		@Test
		void testAddParticipant_1() {
				// Test case 1.1: The session is full.
				// Arrange
				String name = "session1";
				List<String> maps = new ArrayList<String>();
				maps.add("map1");
				ImageIcon mapPreview = new ImageIcon();
				int totalNrOfPlayers = 2;
				int totalRounds = 2;
				ServerGameSession serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				ClientInfo clientInfo1 = new ClientInfo("client1", null);
				ClientInfo clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				serverGameSession.addParticipant(clientInfo2);
				// Act
				int result = serverGameSession.addParticipant(clientInfo1);
				// Assert
				assertEquals(-1, result);
				// Test case 1.2: The session is not full.
				// Arrange
				name = "session2";
				maps = new ArrayList<String>();
				maps.add("map1");
				mapPreview = new ImageIcon();
				totalNrOfPlayers = 2;
				totalRounds = 2;
				serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				clientInfo1 = new ClientInfo("client1", null);
				clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				// Act
				result = serverGameSession.addParticipant(clientInfo2);
				// Assert
				assertEquals(1000000, result);
		}
		
		/**
		* Test case 2 for method addParticipant.
		* Test case 2.1: The session is full.
		* Test case 2.2: The session is not full.
		*/
		@Test
		void testAddParticipant_2() {
				// Test case 2.1: The session is full.
				// Arrange
				String name = "session1";
				List<String> maps = new ArrayList<String>();
				maps.add("map1");
				ImageIcon mapPreview = new ImageIcon();
				int totalNrOfPlayers = 2;
				int totalRounds = 2;
				ServerGameSession serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				ClientInfo clientInfo1 = new ClientInfo("client1", null);
				ClientInfo clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				serverGameSession.addParticipant(clientInfo2);
				// Act
				int result = serverGameSession.addParticipant(clientInfo1);
				// Assert
				assertEquals(-1, result);
				// Test case 2.2: The session is not full.
				// Arrange
				name = "session2";
				maps = new ArrayList<String>();
				maps.add("map1");
				mapPreview = new ImageIcon();
				totalNrOfPlayers = 2;
				totalRounds = 2;
				serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				clientInfo1 = new ClientInfo("client1", null);
				clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				// Act
				result = serverGameSession.addParticipant(clientInfo2);
				// Assert
				assertEquals(1000000, result);
		}
		
		/**
		* Test case 3 for method addParticipant.
		* Test case 3.1: The session is full.
		* Test case 3.2: The session is not full.
		*/
		@Test
		void testAddParticipant_3() {
				// Test case 3.1: The session is full.
				// Arrange
				String name = "session1";
				List<String> maps = new ArrayList<String>();
				maps.add("map1");
				ImageIcon mapPreview = new ImageIcon();
				int totalNrOfPlayers = 2;
				int totalRounds = 2;
				ServerGameSession serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				ClientInfo clientInfo1 = new ClientInfo("client1", null);
				ClientInfo clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				serverGameSession.addParticipant(clientInfo2);
				// Act
				int result = serverGameSession.addParticipant(clientInfo1);
				// Assert
				assertEquals(-1, result);
				// Test case 3.2: The session is not full.
				// Arrange
				name = "session2";
				maps = new ArrayList<String>();
				maps.add("map1");
				mapPreview = new ImageIcon();
				totalNrOfPlayers = 2;
				totalRounds = 2;
				serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				clientInfo1 = new ClientInfo("client1", null);
				clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				// Act
				result = serverGameSession.addParticipant(clientInfo2);
				// Assert
				assertEquals(1000000, result);
		}
		
		/**
		* Test case 4 for method addParticipant.
		* Test case 4.1: The session is full.
		* Test case 4.2: The session is not full.
		*/
		@Test
		void testAddParticipant_4() {
				// Test case 4.1: The session is full.
				// Arrange
				String name = "session1";
				List<String> maps = new ArrayList<String>();
				maps.add("map1");
				ImageIcon mapPreview = new ImageIcon();
				int totalNrOfPlayers = 2;
				int totalRounds = 2;
				ServerGameSession serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				ClientInfo clientInfo1 = new ClientInfo("client1", null);
				ClientInfo clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				serverGameSession.addParticipant(clientInfo2);
				// Act
				int result = serverGameSession.addParticipant(clientInfo1);
				// Assert
				assertEquals(-1, result);
				// Test case 4.2: The session is not full.
				// Arrange
				name = "session2";
				maps = new ArrayList<String>();
				maps.add("map1");
				mapPreview = new ImageIcon();
				totalNrOfPlayers = 2;
				totalRounds = 2;
				serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				clientInfo1 = new ClientInfo("client1", null);
				clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				// Act
				result = serverGameSession.addParticipant(clientInfo2);
				// Assert
				assertEquals(1000000, result);
		}
		
		/**
		* Test case 5 for method addParticipant.
		* Test case 5.1: The session is full.
		* Test case 5.2: The session is not full.
		*/
		@Test
		void testAddParticipant_5() {
				// Test case 5.1: The session is full.
				// Arrange
				String name = "session1";
				List<String> maps = new ArrayList<String>();
				maps.add("map1");
				ImageIcon mapPreview = new ImageIcon();
				int totalNrOfPlayers = 2;
				int totalRounds = 2;
				ServerGameSession serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				ClientInfo clientInfo1 = new ClientInfo("client1", null);
				ClientInfo clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				serverGameSession.addParticipant(clientInfo2);
				// Act
				int result = serverGameSession.addParticipant(clientInfo1);
				// Assert
				assertEquals(-1, result);
				// Test case 5.2: The session is not full.
				// Arrange
				name = "session2";
				maps = new ArrayList<String>();
				maps.add("map1");
				mapPreview = new ImageIcon();
				totalNrOfPlayers = 2;
				totalRounds = 2;
				serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				clientInfo1 = new ClientInfo("client1", null);
				clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				// Act
				result = serverGameSession.addParticipant(clientInfo2);
				// Assert
				assertEquals(1000000, result);
		}
		
		/**
		* Test case 6 for method addParticipant.
		* Test case 6.1: The session is full.
		* Test case 6.2: The session is not full.
		*/
		@Test
		void testAddParticipant_6() {
				// Test case 6.1: The session is full.
				// Arrange
				String name = "session1";
				List<String> maps = new ArrayList<String>();
				maps.add("map1");
				ImageIcon mapPreview = new ImageIcon();
				int totalNrOfPlayers = 2;
				int totalRounds = 2;
				ServerGameSession serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				ClientInfo clientInfo1 = new ClientInfo("client1", null);
				ClientInfo clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				serverGameSession.addParticipant(clientInfo2);
				// Act
				int result = serverGameSession.addParticipant(clientInfo1);
				// Assert
				assertEquals(-1, result);
				// Test case 6.2: The session is not full.
				// Arrange
				name = "session2";
				maps = new ArrayList<String>();
				maps.add("map1");
				mapPreview = new ImageIcon();
				totalNrOfPlayers = 2;
				totalRounds = 2;
				serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				clientInfo1 = new ClientInfo("client1", null);
				clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				// Act
				result = serverGameSession.addParticipant(clientInfo2);
				// Assert
				assertEquals(1000000, result);
		}
		
		/**
		* Test case 7 for method addParticipant.
		* Test case 7.1: The session is full.
		* Test case 7.2: The session is not full.
		*/
		@Test
		void testAddParticipant_7() {
				// Test case 7.1: The session is full.
				// Arrange
				String name = "session1";
				List<String> maps = new ArrayList<String>();
				maps.add("map1");
				ImageIcon mapPreview = new ImageIcon();
				int totalNrOfPlayers = 2;
				int totalRounds = 2;
				ServerGameSession serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				ClientInfo clientInfo1 = new ClientInfo("client1", null);
				ClientInfo clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				serverGameSession.addParticipant(clientInfo2);
				// Act
				int result = serverGameSession.addParticipant(clientInfo1);
				// Assert
				assertEquals(-1, result);
				// Test case 7.2: The session is not full.
				// Arrange
				name = "session2";
				maps = new ArrayList<String>();
				maps.add("map1");
				mapPreview = new ImageIcon();
				totalNrOfPlayers = 2;
				totalRounds = 2;
				serverGameSession = new ServerGameSession(name, maps, mapPreview, totalNrOfPlayers, totalRounds);
				clientInfo1 = new ClientInfo("client1", null);
				clientInfo2 = new ClientInfo("client2", null);
				serverGameSession.addParticipant(clientInfo1);
				// Act
				result = serverGameSession.addParticipant(clientInfo2);
				// Assert
				assertEquals(1000000, result);
		}
		
		/**
		* Test case