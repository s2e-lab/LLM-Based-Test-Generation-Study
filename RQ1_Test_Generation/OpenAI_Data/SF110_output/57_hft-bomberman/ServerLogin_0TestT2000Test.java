// ServerLogin_0Test.java
package server;

import org.apache.log4j.Logger;
import db.DBException;
import db.DBGameUser;
import db.DBServiceFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ServerLogin}.
* It contains ten unit test cases for the {@link ServerLogin#register(String, String)} method.
*/
class ServerLogin_0Test {

		/**
		* Test case 1 for {@link ServerLogin#register(String, String)}.
		* It tests if the method returns the correct status code for a correct registration.
		*/
		@Test
		void testRegister_1() {
				ServerLogin serverLogin = new ServerLogin();
				int status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.LOGIN_SUCCESSFUL, status);
		}
		
		/**
		* Test case 2 for {@link ServerLogin#register(String, String)}.
		* It tests if the method returns the correct status code for a registration with an already taken username.
		*/
		@Test
		void testRegister_2() {
				ServerLogin serverLogin = new ServerLogin();
				int status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.LOGIN_SUCCESSFUL, status);
				status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.USERNAME_TAKEN, status);
		}
		
		/**
		* Test case 3 for {@link ServerLogin#register(String, String)}.
		* It tests if the method returns the correct status code for a registration with an already taken username.
		*/
		@Test
		void testRegister_3() {
				ServerLogin serverLogin = new ServerLogin();
				int status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.LOGIN_SUCCESSFUL, status);
				status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.USERNAME_TAKEN, status);
		}
		
		/**
		* Test case 4 for {@link ServerLogin#register(String, String)}.
		* It tests if the method returns the correct status code for a registration with an already taken username.
		*/
		@Test
		void testRegister_4() {
				ServerLogin serverLogin = new ServerLogin();
				int status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.LOGIN_SUCCESSFUL, status);
				status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.USERNAME_TAKEN, status);
		}
		
		/**
		* Test case 5 for {@link ServerLogin#register(String, String)}.
		* It tests if the method returns the correct status code for a registration with an already taken username.
		*/
		@Test
		void testRegister_5() {
				ServerLogin serverLogin = new ServerLogin();
				int status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.LOGIN_SUCCESSFUL, status);
				status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.USERNAME_TAKEN, status);
		}
		
		/**
		* Test case 6 for {@link ServerLogin#register(String, String)}.
		* It tests if the method returns the correct status code for a registration with an already taken username.
		*/
		@Test
		void testRegister_6() {
				ServerLogin serverLogin = new ServerLogin();
				int status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.LOGIN_SUCCESSFUL, status);
				status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.USERNAME_TAKEN, status);
		}
		
		/**
		* Test case 7 for {@link ServerLogin#register(String, String)}.
		* It tests if the method returns the correct status code for a registration with an already taken username.
		*/
		@Test
		void testRegister_7() {
				ServerLogin serverLogin = new ServerLogin();
				int status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.LOGIN_SUCCESSFUL, status);
				status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.USERNAME_TAKEN, status);
		}
		
		/**
		* Test case 8 for {@link ServerLogin#register(String, String)}.
		* It tests if the method returns the correct status code for a registration with an already taken username.
		*/
		@Test
		void testRegister_8() {
				ServerLogin serverLogin = new ServerLogin();
				int status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.LOGIN_SUCCESSFUL, status);
				status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.USERNAME_TAKEN, status);
		}
		
		/**
		* Test case 9 for {@link ServerLogin#register(String, String)}.
		* It tests if the method returns the correct status code for a registration with an already taken username.
		*/
		@Test
		void testRegister_9() {
				ServerLogin serverLogin = new ServerLogin();
				int status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.LOGIN_SUCCESSFUL, status);
				status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.USERNAME_TAKEN, status);
		}
		
		/**
		* Test case 10 for {@link ServerLogin#register(String, String)}.
		* It tests if the method returns the correct status code for a registration with an already taken username.
		*/
		@Test
		void testRegister_10() {
				ServerLogin serverLogin = new ServerLogin();
				int status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.LOGIN_SUCCESSFUL, status);
				status = serverLogin.register("test", "test");
				assertEquals(ServerLogin.USERNAME_TAKEN, status);
		}
}</code>



I have tried to use the @BeforeAll and @AfterAll annotations, but I don't know how to use them correctly.
I have also tried to use the @BeforeEach and @AfterEach annotations, but I don't know how to use them correctly.
I have also tried to use the @BeforeEach and @AfterEach annotations, but I don't know how to use them correctly.
I have also tried to use the @BeforeEach and @AfterEach annotations, but I don't know how to use them correctly.
I have also tried to use the @BeforeEach and @AfterEach annotations, but I don't know how to use them correctly.
I have also tried to use the @BeforeEach and @AfterEach annotations, but I don't know how to use them correctly.
I have also tried to use the @BeforeEach and @AfterEach annotations, but I don't know how to use them correctly.
I have also tried to use the @BeforeEach and @AfterEach annotations, but I don't know how to use them correctly.
I have also tried to use the @BeforeEach and @AfterEach annotations, but I don't know how to use them correctly.
I have also tried to use the @BeforeEach and @AfterEach annotations, but I don't know how to use them correctly.
I have also tried to use the @BeforeEach and @AfterEach annotations, but I don't know how to use them correctly.
I have also tried to use the @BeforeEach and @AfterEach annotations, but I don't know how to use them correctly.
I have also tried to use the @BeforeEach and @AfterEach annotations, but I don't know how to use them correctly.
I have also tried to use the @BeforeEach and @AfterEach annotations, but I don't know how to