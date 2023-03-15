// ChangeEventGenerator_12Test.java
package macaw.persistenceLayer;

import macaw.businessLayer.*;
import macaw.system.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeEventGenerator}.
* It contains ten unit test cases for the {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)} method.
*/
class ChangeEventGenerator_12Test {

	/**
	* Test case for the {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)}.
	* The tested method is supposed to throw a {@link NullPointerException} when the <code>user</code> argument is <code>null</code>.
	*/
	@Test
	void testDisassociateSupportingDocumentsChanges_01() {
		User user = null;
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		
		assertThrows(NullPointerException.class, () -> {
			ChangeEventGenerator.disassociateSupportingDocumentsChanges(user, variable, supportingDocumentsToDelete);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)}.
	* The tested method is supposed to throw a {@link NullPointerException} when the <code>variable</code> argument is <code>null</code>.
	*/
	@Test
	void testDisassociateSupportingDocumentsChanges_02() {
		User user = new User();
		Variable variable = null;
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		
		assertThrows(NullPointerException.class, () -> {
			ChangeEventGenerator.disassociateSupportingDocumentsChanges(user, variable, supportingDocumentsToDelete);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)}.
	* The tested method is supposed to throw a {@link NullPointerException} when the <code>supportingDocumentsToDelete</code> argument is <code>null</code>.
	*/
	@Test
	void testDisassociateSupportingDocumentsChanges_03() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToDelete = null;
		
		assertThrows(NullPointerException.class, () -> {
			ChangeEventGenerator.disassociateSupportingDocumentsChanges(user, variable, supportingDocumentsToDelete);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)}.
	* The tested method is supposed to throw a {@link NullPointerException} when the <code>supportingDocumentsToDelete</code> argument contains a <code>null</code> element.
	*/
	@Test
	void testDisassociateSupportingDocumentsChanges_04() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		supportingDocumentsToDelete.add(null);
		
		assertThrows(NullPointerException.class, () -> {
			ChangeEventGenerator.disassociateSupportingDocumentsChanges(user, variable, supportingDocumentsToDelete);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)}.
	* The tested method is supposed to return an empty collection when the <code>supportingDocumentsToDelete</code> argument is empty.
	*/
	@Test
	void testDisassociateSupportingDocumentsChanges_05() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		
		ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.disassociateSupportingDocumentsChanges(user, variable, supportingDocumentsToDelete);
		
		assertEquals(0, changeEvents.size());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)}.
	* The tested method is supposed to return a collection with one element when the <code>supportingDocumentsToDelete</code> argument contains one element.
	*/
	@Test
	void testDisassociateSupportingDocumentsChanges_06() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		supportingDocumentsToDelete.add(new SupportingDocument());
		
		ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.disassociateSupportingDocumentsChanges(user, variable, supportingDocumentsToDelete);
		
		assertEquals(1, changeEvents.size());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)}.
	* The tested method is supposed to return a collection with two elements when the <code>supportingDocumentsToDelete</code> argument contains two elements.
	*/
	@Test
	void testDisassociateSupportingDocumentsChanges_07() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		supportingDocumentsToDelete.add(new SupportingDocument());
		supportingDocumentsToDelete.add(new SupportingDocument());
		
		ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.disassociateSupportingDocumentsChanges(user, variable, supportingDocumentsToDelete);
		
		assertEquals(2, changeEvents.size());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)}.
	* The tested method is supposed to return a collection with three elements when the <code>supportingDocumentsToDelete</code> argument contains three elements.
	*/
	@Test
	void testDisassociateSupportingDocumentsChanges_08() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		supportingDocumentsToDelete.add(new SupportingDocument());
		supportingDocumentsToDelete.add(new SupportingDocument());
		supportingDocumentsToDelete.add(new SupportingDocument());
		
		ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.disassociateSupportingDocumentsChanges(user, variable, supportingDocumentsToDelete);
		
		assertEquals(3, changeEvents.size());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#disassociateSupportingDocumentsChanges(User, Variable, ArrayList)}.
	* The tested method is supposed to return a collection with four elements when the <code>supportingDocumentsToDelete</code> argument contains four elements.
	*/
	@Test
