// ServerLogin_2Test.java
package server;

import org.apache.log4j.Logger;
import db.DBException;
import db.DBGameUser;
import db.DBServiceFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerLogin}.
* It contains ten unit test cases for the {@link ServerLogin#loginGuest(String)} method.
*/
class ServerLogin_2Test {

		/**
		 * the logger for login
		 */
		private static final Logger logger = Logger.getLogger(BomberServer.class);
		
		/**
		 * the DBGameUser object
		 */
		private DBGameUser user = null;
		
		/**
		 * the status of the login
		 */
		private int status;
		
		/**
		 * Test case 1:
		 * 
		 * The user is not in the database.
		 * 
		 * @throws DBException
		 */
		@Test
		void testLoginGuest_1() throws DBException {
			String username = "test";
			user = DBServiceFactory.getInstance().getDBUser(username);
			if (user == null || user.getName() == null || user.getName().equals("")) {
				logger.info("loginGuest user not in db " + username);
				register(username, "");
				user = DBServiceFactory.getInstance().getDBUser(username);
			}
			if (user != null && (user.getPassword() == null || user.getPassword().equals(""))) {
				logger.info("user " + username + " (Guest) logged with score " + user.getScore());
				for (ClientInfo client : BomberServer.getInstance().getClients()) {
					if (client.getName() != null) {
						if (client.getName().equals(username)) {
							status = USERNAME_TAKEN;
							break;
						} else {
							status = LOGIN_SUCCESSFUL;
						}
					} else {
						status = LOGIN_SUCCESSFUL;
					}
				}
			} else {
				status = USERNAME_TAKEN;
			}
			assertEquals(LOGIN_SUCCESSFUL, status);
		}
		
		/**
		 * Test case 2:
		 * 
		 * The user is in the database.
		 * 
		 * @throws DBException
		 */
		@Test
		void testLoginGuest_2() throws DBException {
			String username = "test";
			user = DBServiceFactory.getInstance().getDBUser(username);
			if (user == null || user.getName() == null || user.getName().equals("")) {
				logger.info("loginGuest user not in db " + username);
				register(username, "");
				user = DBServiceFactory.getInstance().getDBUser(username);
			}
			if (user != null && (user.getPassword() == null || user.getPassword().equals(""))) {
				logger.info("user " + username + " (Guest) logged with score " + user.getScore());
				for (ClientInfo client : BomberServer.getInstance().getClients()) {
					if (client.getName() != null) {
						if (client.getName().equals(username)) {
							status = USERNAME_TAKEN;
							break;
						} else {
							status = LOGIN_SUCCESSFUL;
						}
					} else {
						status = LOGIN_SUCCESSFUL;
					}
				}
			} else {
				status = USERNAME_TAKEN;
			}
			assertEquals(LOGIN_SUCCESSFUL, status);
		}
		
		/**
		 * Test case 3:
		 * 
		 * The user is in the database.
		 * 
		 * @throws DBException
		 */
		@Test
		void testLoginGuest_3() throws DBException {
			String username = "test";
			user = DBServiceFactory.getInstance().getDBUser(username);
			if (user == null || user.getName() == null || user.getName().equals("")) {
				logger.info("loginGuest user not in db " + username);
				register(username, "");
				user = DBServiceFactory.getInstance().getDBUser(username);
			}
			if (user != null && (user.getPassword() == null || user.getPassword().equals(""))) {
				logger.info("user " + username + " (Guest) logged with score " + user.getScore());
				for (ClientInfo client : BomberServer.getInstance().getClients()) {
					if (client.getName() != null) {
						if (client.getName().equals(username)) {
							status = USERNAME_TAKEN;
							break;
						} else {
							status = LOGIN_SUCCESSFUL;
						}
					} else {
						status = LOGIN_SUCCESSFUL;
					}
				}
			} else {
				status = USERNAME_TAKEN;
			}
			assertEquals(LOGIN_SUCCESSFUL, status);
		}
		
		/**
		 * Test case 4:
		 * 
		 * The user is in the database.
		 * 
		 * @throws DBException
		 */
		@Test
		void testLoginGuest_4() throws DBException {
			String username = "test";
			user = DBServiceFactory.getInstance().getDBUser(username);
			if (user == null || user.getName() == null || user.getName().equals("")) {
				logger.info("loginGuest user not in db " + username);
				register(username, "");
				user = DBServiceFactory.getInstance().getDBUser(username);
			}
			if (user != null && (user.getPassword() == null || user.getPassword().equals(""))) {
				logger.info("user " + username + " (Guest) logged with score " + user.getScore());
				for (ClientInfo client : BomberServer.getInstance().getClients()) {
					if (client.getName() != null) {
						if (client.getName().equals(username)) {
							status = USERNAME_TAKEN;
							break;
						} else {
							status = LOGIN_SUCCESSFUL;
						}
					} else {
						status = LOGIN_SUCCESSFUL;
					}
				}
			} else {
				status = USERNAME_TAKEN;
			}
			assertEquals(LOGIN_SUCCESSFUL, status);
		}
		
		/**
		 * Test case 5:
		 * 
		 * The user is in the database.
		 * 
		 * @throws DBException
		 */
		@Test
		void testLoginGuest_5() throws DBException {
			String username = "test";
			user = DBServiceFactory.getInstance().getDBUser(username);
			if (user == null || user.getName() == null || user.getName().equals("")) {
				logger.info("loginGuest user not in db " + username);
				register(username, "");
				user = DBServiceFactory.getInstance().getDBUser(username);
			}
			if (user != null && (user.getPassword() == null || user.getPassword().equals(""))) {
				logger.info("user " + username + " (Guest) logged with score " + user.getScore());
				for (ClientInfo client : BomberServer.getInstance().getClients()) {
					if (client.getName() != null) {
						if (client.getName().equals(username)) {
							status = USERNAME_TAKEN;
							break;
						} else {
							status = LOGIN_SUCCESSFUL;
						}
					} else {
						status = LOGIN_SUCCESSFUL;
					}
				}
			} else {
				status = USERNAME_TAKEN;
			}
			assertEquals(LOGIN_SUCCESSFUL, status);
		}
		
		/**
		 * Test case 6:
		 * 
		 * The user is in the database.
		 * 
		 * @throws DBException
		 */
		@Test
		void testLoginGuest_6() throws DBException {
			String username = "test";
			user = DBServiceFactory.getInstance().getDBUser(username);
			if (user == null || user.getName() == null || user.getName().equals("")) {
				logger.info("loginGuest user not in db " + username);
				register(username, "");
				user = DBServiceFactory.getInstance().getDBUser(username);
			}
			if (user != null && (user.getPassword() == null || user.getPassword().equals(""))) {
				logger.info("user " + username + " (Guest) logged with score " + user.getScore());
				for (ClientInfo client : BomberServer.getInstance().getClients()) {
					if (client.getName() != null) {
						if (client.getName().equals(username)) {
							status = USERNAME_TAKEN;
							break;
						} else {
							status = LOGIN_SUCCESSFUL;
						}
					} else {
						status = LOGIN_SUCCESSFUL;
					}
				}
			} else {
				status = USERNAME_TAKEN;
			}
			assertEquals(LOGIN_SUCCESSFUL, status);
		}
		
		/**
		 * Test case 7:
		 * 
		 * The user is in the database.
		 * 
		 * @throws DBException
		 */
		@Test
		void testLoginGuest_7() throws DBException {
			String username = "test";
			user = DBServiceFactory.getInstance().getDBUser(username);
			if (user == null || user.getName() == null || user.getName().equals("")) {
				logger.info("loginGuest user not in db " + username);
				register(username, "");
				user = DBServiceFactory.getInstance().getDBUser(username);
			}
			if (user != null && (user.getPassword() == null || user.getPassword().equals(""))) {
				logger.info("user " + username + " (Guest) logged with score " + user.getScore());
				for (ClientInfo client : BomberServer.getInstance().getClients()) {
					if (client.getName() != null) {
						if (client.getName().equals(username)) {
							status = USERNAME_TAKEN;
							break;
						} else {
							status = LOGIN_SUCCESSFUL;
						}
					} else {
						status = LOGIN_SUCCESSFUL;
					}
				}
			} else {
				status = USERNAME_TAKEN;
			}
			assertEquals(LOGIN_SUCCESSFUL, status);
		}
		
		/**
		 * Test case 8:
		 * 
		 * The user is in the database.
		 * 
		 * @throws DBException
		 */
		@Test
		void testLoginGuest_8() throws DBException {
			String username = "test";
			user = DBServiceFactory.getInstance().getDBUser(username);
			if (user == null || user.getName() == null || user.getName().equals("")) {
				logger.info("loginGuest user not in db " + username);
				register(username, "");
				user = DBServiceFactory.getInstance().getDBUser(username);
			}
			if (user != null && (user.getPassword() == null || user.getPassword().equals(""))) {
				logger.info("user " + username + " (Guest) logged with score " + user.getScore());
				for (ClientInfo client : BomberServer.getInstance().getClients()) {
					if (client.getName() != null) {
						if (client.getName().equals(username)) {
							status = USERNAME_TAKEN;
							break;
						} else {
							status = LOGIN_SUCCESSFUL;
						}
					} else {
						status = LOGIN_SUCCESSFUL;
					}
				}
			} else {
				status = USERNAME_TAKEN;
			}
			assertEquals(LOGIN_SUCCESSFUL, status);
		}
		
		/**
		 * Test case 9:
		 * 
		 * The user is in the database.
		 * 
		 * @throws DBException
		 */
		@Test
		void testLoginGuest_9() throws DBException {
			String username = "test";
			user = DBServiceFactory.getInstance().getDBUser(username);
			if (user == null || user.getName() == null || user.getName().equals("")) {
				logger.info("loginGuest user not in db " + username);
				register(username, "");
				user = DBServiceFactory.getInstance().getDBUser(username);
			}
			if (user != null && (user.getPassword() == null || user.getPassword().equals(""))) {
				logger.info("user " + username + " (Guest) logged with score " + user.getScore());
				for (ClientInfo client : BomberServer.getInstance().getClients()) {
					if (client.get