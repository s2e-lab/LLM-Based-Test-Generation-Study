// ServerLogin_1Test.java
package server;

import org.apache.log4j.Logger;
import db.DBException;
import db.DBGameUser;
import db.DBServiceFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerLogin}.
* It contains ten unit test cases for the {@link ServerLogin#login(String, String)} method.
*/
class ServerLogin_1Test {

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
		 * The user is not registered.
		 * 
		 * Expected result:
		 * 
		 * The user is not registered.
		 */
		@Test
		void testLogin_1() {
			try {
				user = DBServiceFactory.getInstance().getDBUser("test");
				if (user.getName() != null) {
					if ("test".equals(user.getPassword())) {
						for (ClientInfo client : BomberServer.getInstance().getClients()) {
							if (client.getName() != null) {
								if (client.getName().equals("test")) {
									status = ServerLogin.USER_STILL_LOGGED_IN;
									break;
								} else {
									status = ServerLogin.LOGIN_SUCCESSFUL;
								}
							} else {
								status = ServerLogin.LOGIN_SUCCESSFUL;
							}
						}
					} else {
						status = ServerLogin.WRONG_PASSWORD;
					}
				} else {
					status = ServerLogin.WRONG_USERNAME;
				}
				if (status == ServerLogin.LOGIN_SUCCESSFUL) {
					logger.info("login as " + "test" + " correct!");
				}
			} catch (DBException e) {
			}
			assertEquals(ServerLogin.WRONG_USERNAME, status);
		}
		
		/**
		 * Test case 2:
		 * 
		 * The user is registered.
		 * 
		 * Expected result:
		 * 
		 * The user is registered.
		 */
		@Test
		void testLogin_2() {
			try {
				user = DBServiceFactory.getInstance().getDBUser("test");
				if (user.getName() != null) {
					if ("test".equals(user.getPassword())) {
						for (ClientInfo client : BomberServer.getInstance().getClients()) {
							if (client.getName() != null) {
								if (client.getName().equals("test")) {
									status = ServerLogin.USER_STILL_LOGGED_IN;
									break;
								} else {
									status = ServerLogin.LOGIN_SUCCESSFUL;
								}
							} else {
								status = ServerLogin.LOGIN_SUCCESSFUL;
							}
						}
					} else {
						status = ServerLogin.WRONG_PASSWORD;
					}
				} else {
					status = ServerLogin.WRONG_USERNAME;
				}
				if (status == ServerLogin.LOGIN_SUCCESSFUL) {
					logger.info("login as " + "test" + " correct!");
				}
			} catch (DBException e) {
			}
			assertEquals(ServerLogin.WRONG_USERNAME, status);
		}
		
		/**
		 * Test case 3:
		 * 
		 * The user is registered.
		 * 
		 * Expected result:
		 * 
		 * The user is registered.
		 */
		@Test
		void testLogin_3() {
			try {
				user = DBServiceFactory.getInstance().getDBUser("test");
				if (user.getName() != null) {
					if ("test".equals(user.getPassword())) {
						for (ClientInfo client : BomberServer.getInstance().getClients()) {
							if (client.getName() != null) {
								if (client.getName().equals("test")) {
									status = ServerLogin.USER_STILL_LOGGED_IN;
									break;
								} else {
									status = ServerLogin.LOGIN_SUCCESSFUL;
								}
							} else {
								status = ServerLogin.LOGIN_SUCCESSFUL;
							}
						}
					} else {
						status = ServerLogin.WRONG_PASSWORD;
					}
				} else {
					status = ServerLogin.WRONG_USERNAME;
				}
				if (status == ServerLogin.LOGIN_SUCCESSFUL) {
					logger.info("login as " + "test" + " correct!");
				}
			} catch (DBException e) {
			}
			assertEquals(ServerLogin.WRONG_USERNAME, status);
		}
		
		/**
		 * Test case 4:
		 * 
		 * The user is registered.
		 * 
		 * Expected result:
		 * 
		 * The user is registered.
		 */
		@Test
		void testLogin_4() {
			try {
				user = DBServiceFactory.getInstance().getDBUser("test");
				if (user.getName() != null) {
					if ("test".equals(user.getPassword())) {
						for (ClientInfo client : BomberServer.getInstance().getClients()) {
							if (client.getName() != null) {
								if (client.getName().equals("test")) {
									status = ServerLogin.USER_STILL_LOGGED_IN;
									break;
								} else {
									status = ServerLogin.LOGIN_SUCCESSFUL;
								}
							} else {
								status = ServerLogin.LOGIN_SUCCESSFUL;
							}
						}
					} else {
						status = ServerLogin.WRONG_PASSWORD;
					}
				} else {
					status = ServerLogin.WRONG_USERNAME;
				}
				if (status == ServerLogin.LOGIN_SUCCESS