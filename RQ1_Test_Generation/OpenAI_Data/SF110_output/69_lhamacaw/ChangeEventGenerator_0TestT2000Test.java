// ChangeEventGenerator_0Test.java
package macaw.persistenceLayer;

import macaw.businessLayer.*;
import macaw.system.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeEventGenerator}.
* It contains ten unit test cases for the {@link ChangeEventGenerator#addSupportingDocumentChange(User, SupportingDocument)} method.
*/
class ChangeEventGenerator_0Test {

	/**
	* Test case for the {@link ChangeEventGenerator#addSupportingDocumentChange(User, SupportingDocument)} method.
	* Test data: {@code null} user.
	* Expected result: {@code IllegalArgumentException}.
	* @throws MacawException 
	*/
	@Test
	void testAddSupportingDocumentChange_0() throws MacawException {
		User user = null;
		SupportingDocument supportingDocument = new SupportingDocument();
		supportingDocument.setIdentifier(1);
		supportingDocument.setDisplayName("Test supporting document");
		supportingDocument.setDescription("Test supporting document description");
		supportingDocument.setFileName("Test supporting document file name");
		supportingDocument.setFileType("Test supporting document file type");
		supportingDocument.setFileSize(1);
		supportingDocument.setFilePath("Test supporting document file path");
		supportingDocument.setFileContent("Test supporting document file content".getBytes());
		supportingDocument.setFileChecksum("Test supporting document file checksum");
		supportingDocument.setFileChecksumAlgorithm("Test supporting document file checksum algorithm");
		supportingDocument.setFileChecksumDate("Test supporting document file checksum date");
		supportingDocument.setFileChecksumNotes("Test supporting document file checksum notes");
		supportingDocument.setFileNotes("Test supporting document file notes");
		supportingDocument.setFileDate("Test supporting document file date");
		supportingDocument.setFileAuthor("Test supporting document file author");
		supportingDocument.setFileSource("Test supporting document file source");
		supportingDocument.setFileSourceNotes("Test supporting document file source notes");
		supportingDocument.setFileSourceURL("Test supporting document file source URL");
		supportingDocument.setFileSourceDate("Test supporting document file source date");
		supportingDocument.setFileSourceAuthor("Test supporting document file source author");
		supportingDocument.setFileSourceLicense("Test supporting document file source license");
		supportingDocument.setFileSourceLicenseURL("Test supporting document file source license URL");
		supportingDocument.setFileSourceLicenseNotes("Test supporting document file source license notes");
		supportingDocument.setFileSourceLicenseDate("Test supporting document file source license date");
		supportingDocument.setFileSourceLicenseAuthor("Test supporting document file source license author");
		supportingDocument.setFileSourceLicenseContact("Test supporting document file source license contact");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactEmail("Test supporting document file source license contact email");
		supportingDocument.setFileSourceLicenseContactPhone("Test supporting document file source license contact phone");
		supportingDocument.setFileSourceLicenseContactAddress("Test supporting document file source license contact address");
		supportingDocument.setFileSourceLicenseContactCity("Test supporting document file source license contact city");
		supportingDocument.setFileSourceLicenseContactState("Test supporting document file source license contact state");
		supportingDocument.setFileSourceLicenseContactPostalCode("Test supporting document file source license contact postal code");
		supportingDocument.setFileSourceLicenseContactCountry("Test supporting document file source license contact country");
		supportingDocument.setFileSourceLicenseContactURL("Test supporting document file source license contact URL");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactOrganization("Test supporting document file source license contact organization");
		supportingDocument.setFileSourceLicenseContactDepartment("Test supporting document file source license contact department");
		supportingDocument.setFileSourceLicenseContactPosition("Test supporting document file source license contact position");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license contact date");
		supportingDocument.setFileSourceLicenseContactAuthor("Test supporting document file source license contact author");
		supportingDocument.setFileSourceLicenseContactNotes("Test supporting document file source license contact notes");
		supportingDocument.setFileSourceLicenseContactDate("Test supporting document file source license