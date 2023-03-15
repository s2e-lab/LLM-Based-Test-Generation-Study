// ChangeEventGenerator_14Test.java
package macaw.persistenceLayer;

import macaw.businessLayer.*;
import macaw.system.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeEventGenerator}.
* It contains ten unit test cases for the {@link ChangeEventGenerator#deleteUsersChanges(User, ArrayList)} method.
*/
class ChangeEventGenerator_14Test {

	/**
	* Test case for {@link ChangeEventGenerator#deleteUsersChanges(User, ArrayList)}.
	* It tests the case that the user is null and expects an IllegalArgumentException.
	*/
	@Test
	void testDeleteUsersChanges_1() {
		User admin = null;
		ArrayList<User> usersToDelete = new ArrayList<User>();
		
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteUsersChanges(admin, usersToDelete);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteUsersChanges(User, ArrayList)}.
	* It tests the case that the usersToDelete is null and expects an IllegalArgumentException.
	*/
	@Test
	void testDeleteUsersChanges_2() {
		User admin = new User("admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin", "admin