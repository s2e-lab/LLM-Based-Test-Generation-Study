// ChangeEventGenerator_1Test.java
package macaw.persistenceLayer;

import macaw.businessLayer.*;
import macaw.system.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeEventGenerator}.
* It contains ten unit test cases for the {@link ChangeEventGenerator#deleteSupportingDocumentsChange(User, ArrayList)} method.
*/
class ChangeEventGenerator_1Test {

	/**
	* Test case for the {@link ChangeEventGenerator#deleteSupportingDocumentsChange(User, ArrayList)} method.
	* Test data: empty list of supporting documents.
	* Expected result: empty list of change events.
	*/
	@Test
	void testDeleteSupportingDocumentsChange_1() {
		User user = new User("userID", "userName", "userPassword", "userEmail");
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.deleteSupportingDocumentsChange(user, supportingDocumentsToDelete);
		assertEquals(0, changeEvents.size());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#deleteSupportingDocumentsChange(User, ArrayList)} method.
	* Test data: list of supporting documents with one element.
	* Expected result: list of change events with one element.
	*/
	@Test
	void testDeleteSupportingDocumentsChange_2() {
		User user = new User("userID", "userName", "userPassword", "userEmail");
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		SupportingDocument supportingDocument = new SupportingDocument("supportingDocumentID", "supportingDocumentName");
		supportingDocumentsToDelete.add(supportingDocument);
		ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.deleteSupportingDocumentsChange(user, supportingDocumentsToDelete);
		assertEquals(1, changeEvents.size());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#deleteSupportingDocumentsChange(User, ArrayList)} method.
	* Test data: list of supporting documents with two elements.
	* Expected result: list of change events with two elements.
	*/
	@Test
	void testDeleteSupportingDocumentsChange_3() {
		User user = new User("userID", "userName", "userPassword", "userEmail");
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		SupportingDocument supportingDocument1 = new SupportingDocument("supportingDocumentID1", "supportingDocumentName1");
		SupportingDocument supportingDocument2 = new SupportingDocument("supportingDocumentID2", "supportingDocumentName2");
		supportingDocumentsToDelete.add(supportingDocument1);
		supportingDocumentsToDelete.add(supportingDocument2);
		ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.deleteSupportingDocumentsChange(user, supportingDocumentsToDelete);
		assertEquals(2, changeEvents.size());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#deleteSupportingDocumentsChange(User, ArrayList)} method.
	* Test data: list of supporting documents with three elements.
	* Expected result: list of change events with three elements.
	*/
	@Test
	void testDeleteSupportingDocumentsChange_4() {
		User user = new User("userID", "userName", "userPassword", "userEmail");
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		SupportingDocument supportingDocument1 = new SupportingDocument("supportingDocumentID1", "supportingDocumentName1");
		SupportingDocument supportingDocument2 = new SupportingDocument("supportingDocumentID2", "supportingDocumentName2");
		SupportingDocument supportingDocument3 = new SupportingDocument("supportingDocumentID3", "supportingDocumentName3");
		supportingDocumentsToDelete.add(supportingDocument1);
		supportingDocumentsToDelete.add(supportingDocument2);
		supportingDocumentsToDelete.add(supportingDocument3);
		ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.deleteSupportingDocumentsChange(user, supportingDocumentsToDelete);
		assertEquals(3, changeEvents.size());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#deleteSupportingDocumentsChange(User, ArrayList)} method.
	* Test data: list of supporting documents with four elements.
	* Expected result: list of change events with four elements.
	*/
	@Test
	void testDeleteSupportingDocumentsChange_5() {
		User user = new User("userID", "userName", "userPassword", "userEmail");
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		SupportingDocument supportingDocument1 = new SupportingDocument("supportingDocumentID1", "supportingDocumentName1");
		SupportingDocument supportingDocument2 = new SupportingDocument("supportingDocumentID2", "supportingDocumentName2");
		SupportingDocument supportingDocument3 = new SupportingDocument("supportingDocumentID3", "supportingDocumentName3");
		SupportingDocument supportingDocument4 = new SupportingDocument("supportingDocumentID4", "supportingDocumentName4");
		supportingDocumentsToDelete.add(supportingDocument1);
		supportingDocumentsToDelete.add(supportingDocument2);
		supportingDocumentsToDelete.add(supportingDocument3);
		supportingDocumentsToDelete.add(supportingDocument4);
		ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.deleteSupportingDocumentsChange(user, supportingDocumentsToDelete);
		assertEquals(4, changeEvents.size());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#deleteSupportingDocumentsChange(User, ArrayList)} method.
	* Test data: list of supporting documents with five elements.
	* Expected result: list of change events with five elements.
	*/
	@Test
	void testDeleteSupportingDocumentsChange_6() {
		User user = new User("userID", "userName", "userPassword", "userEmail");
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		SupportingDocument supportingDocument1 = new SupportingDocument("supportingDocumentID1", "supportingDocumentName1");
		SupportingDocument supportingDocument2 = new SupportingDocument("supportingDocumentID2", "supportingDocumentName2");
		SupportingDocument supportingDocument3 = new SupportingDocument("supportingDocumentID3", "supportingDocumentName3");
		SupportingDocument supportingDocument4 = new SupportingDocument("supportingDocumentID4", "supportingDocumentName4");
		SupportingDocument supportingDocument5 = new SupportingDocument("supportingDocumentID5", "supportingDocumentName5");
		supportingDocumentsToDelete.add(supportingDocument1);
		supportingDocumentsToDelete.add(supportingDocument2);
		supportingDocumentsToDelete.add(supportingDocument3);
		supportingDocumentsToDelete.add(supportingDocument4);
		supportingDocumentsToDelete.add(supportingDocument5);
		ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.deleteSupportingDocumentsChange(user, supportingDocumentsToDelete);
		assertEquals(5, changeEvents.size());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#deleteSupportingDocumentsChange(User, ArrayList)} method.
	* Test data: list of supporting documents with six elements.
	* Expected result: list of change events with six elements.
	*/
	@Test
	void testDeleteSupportingDocumentsChange_7() {
		User user = new User("userID", "userName", "userPassword", "userEmail");
		ArrayList<SupportingDocument> supportingDocumentsToDelete = new ArrayList<SupportingDocument>();
		SupportingDocument supportingDocument1 = new SupportingDocument("supportingDocumentID1", "supportingDocumentName1");
		SupportingDocument supportingDocument2 = new SupportingDocument("supportingDocumentID2", "supportingDocumentName2");
		SupportingDocument supportingDocument3 = new SupportingDocument("supportingDocumentID3", "supportingDocumentName3");
		SupportingDocument supportingDocument4 = new SupportingDocument("supportingDocumentID4", "supportingDocumentName4");
		SupportingDocument supportingDocument5 = new SupportingDocument("supportingDocumentID5", "supportingDocumentName5");
		SupportingDocument supportingDocument6 = new SupportingDocument("supportingDocumentID6", "supportingDocumentName6