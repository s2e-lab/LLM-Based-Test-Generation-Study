// InMemoryUserManager_0Test.java
package macaw.persistenceLayer.demo;

import macaw.persistenceLayer.ChangeEventGenerator;
import macaw.system.*;
import macaw.util.SearchUtility;
import macaw.businessLayer.MacawSecurityAPI;
import macaw.businessLayer.User;
import java.util.ArrayList;
import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InMemoryUserManager}.
* It contains ten unit test cases for the {@link InMemoryUserManager#getUsers(User)} method.
*/
class InMemoryUserManager_0Test {

		/**
		* Test case 1 for method {@link InMemoryUserManager#getUsers(User)}.
		* Test case 1 checks if the method returns an empty list when there are no users in the system.
		*/
		@Test
		void testGetUsers_1() {
				InMemoryChangeEventManager changeEventManager = new InMemoryChangeEventManager();
				Log log = new Log();
				User admin = new User("admin", "admin", "admin", "admin@admin.com", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "