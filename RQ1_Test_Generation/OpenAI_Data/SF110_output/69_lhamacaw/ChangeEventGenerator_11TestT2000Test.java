// ChangeEventGenerator_11Test.java
package macaw.persistenceLayer;

import macaw.businessLayer.*;
import macaw.system.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeEventGenerator}.
* It contains ten unit test cases for the {@link ChangeEventGenerator#associateSupportingDocumentChanges(User, Variable, ArrayList)} method.
*/
class ChangeEventGenerator_11Test {

	/**
	* Test case for the {@link ChangeEventGenerator#associateSupportingDocumentChanges(User, Variable, ArrayList)} method.
	* It tests the case when the user is null.
	*/
	@Test
	void testAssociateSupportingDocumentChanges_1() {
		User user = null;
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToAdd = new ArrayList<SupportingDocument>();
		
		assertThrows(MacawException.class, () -> {
			ChangeEventGenerator.associateSupportingDocumentChanges(user, variable, supportingDocumentsToAdd);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSupportingDocumentChanges(User, Variable, ArrayList)} method.
	* It tests the case when the variable is null.
	*/
	@Test
	void testAssociateSupportingDocumentChanges_2() {
		User user = new User();
		Variable variable = null;
		ArrayList<SupportingDocument> supportingDocumentsToAdd = new ArrayList<SupportingDocument>();
		
		assertThrows(MacawException.class, () -> {
			ChangeEventGenerator.associateSupportingDocumentChanges(user, variable, supportingDocumentsToAdd);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSupportingDocumentChanges(User, Variable, ArrayList)} method.
	* It tests the case when the supportingDocumentsToAdd is null.
	*/
	@Test
	void testAssociateSupportingDocumentChanges_3() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToAdd = null;
		
		assertThrows(MacawException.class, () -> {
			ChangeEventGenerator.associateSupportingDocumentChanges(user, variable, supportingDocumentsToAdd);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSupportingDocumentChanges(User, Variable, ArrayList)} method.
	* It tests the case when the supportingDocumentsToAdd is empty.
	*/
	@Test
	void testAssociateSupportingDocumentChanges_4() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToAdd = new ArrayList<SupportingDocument>();
		
		assertThrows(MacawException.class, () -> {
			ChangeEventGenerator.associateSupportingDocumentChanges(user, variable, supportingDocumentsToAdd);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSupportingDocumentChanges(User, Variable, ArrayList)} method.
	* It tests the case when the supportingDocumentsToAdd contains a null element.
	*/
	@Test
	void testAssociateSupportingDocumentChanges_5() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToAdd = new ArrayList<SupportingDocument>();
		supportingDocumentsToAdd.add(null);
		
		assertThrows(MacawException.class, () -> {
			ChangeEventGenerator.associateSupportingDocumentChanges(user, variable, supportingDocumentsToAdd);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSupportingDocumentChanges(User, Variable, ArrayList)} method.
	* It tests the case when the supportingDocumentsToAdd contains a duplicate element.
	*/
	@Test
	void testAssociateSupportingDocumentChanges_6() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToAdd = new ArrayList<SupportingDocument>();
		SupportingDocument supportingDocument = new SupportingDocument();
		supportingDocumentsToAdd.add(supportingDocument);
		supportingDocumentsToAdd.add(supportingDocument);
		
		assertThrows(MacawException.class, () -> {
			ChangeEventGenerator.associateSupportingDocumentChanges(user, variable, supportingDocumentsToAdd);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSupportingDocumentChanges(User, Variable, ArrayList)} method.
	* It tests the case when the variable already contains the supporting document.
	*/
	@Test
	void testAssociateSupportingDocumentChanges_7() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToAdd = new ArrayList<SupportingDocument>();
		SupportingDocument supportingDocument = new SupportingDocument();
		supportingDocumentsToAdd.add(supportingDocument);
		variable.addSupportingDocument(supportingDocument);
		
		assertThrows(MacawException.class, () -> {
			ChangeEventGenerator.associateSupportingDocumentChanges(user, variable, supportingDocumentsToAdd);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSupportingDocumentChanges(User, Variable, ArrayList)} method.
	* It tests the case when the variable already contains the supporting document.
	*/
	@Test
	void testAssociateSupportingDocumentChanges_8() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToAdd = new ArrayList<SupportingDocument>();
		SupportingDocument supportingDocument = new SupportingDocument();
		supportingDocumentsToAdd.add(supportingDocument);
		variable.addSupportingDocument(supportingDocument);
		
		assertThrows(MacawException.class, () -> {
			ChangeEventGenerator.associateSupportingDocumentChanges(user, variable, supportingDocumentsToAdd);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSupportingDocumentChanges(User, Variable, ArrayList)} method.
	* It tests the case when the variable already contains the supporting document.
	*/
	@Test
	void testAssociateSupportingDocumentChanges_9() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToAdd = new ArrayList<SupportingDocument>();
		SupportingDocument supportingDocument = new SupportingDocument();
		supportingDocumentsToAdd.add(supportingDocument);
		variable.addSupportingDocument(supportingDocument);
		
		assertThrows(MacawException.class, () -> {
			ChangeEventGenerator.associateSupportingDocumentChanges(user, variable, supportingDocumentsToAdd);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSupportingDocumentChanges(User, Variable, ArrayList)} method.
	* It tests the case when the variable already contains the supporting document.
	*/
	@Test
	void testAssociateSupportingDocumentChanges_10() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToAdd = new ArrayList<SupportingDocument>();
		SupportingDocument supportingDocument = new SupportingDocument();
		supportingDocumentsToAdd.add(supportingDocument);
		variable.addSupportingDocument(supportingDocument);
		
		assertThrows(MacawException.class, () -> {
			ChangeEventGenerator.associateSupportingDocumentChanges(user, variable, supportingDocumentsToAdd);
		});
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSupportingDocumentChanges(User, Variable, ArrayList)} method.
	* It tests the case when the variable already contains the supporting document.
	*/
	@Test
	void testAssociateSupportingDocumentChanges_11() {
		User user = new User();
		Variable variable = new RawVariable();
		ArrayList<SupportingDocument> supportingDocumentsToAdd = new ArrayList<SupportingDocument>();
		Support