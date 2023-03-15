// ChangeEventGenerator_5Test.java
package macaw.persistenceLayer;

import macaw.businessLayer.*;
import macaw.system.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeEventGenerator}.
* It contains ten unit test cases for the {@link ChangeEventGenerator#deleteOntologyTermsChange(User, ArrayList)} method.
*/
class ChangeEventGenerator_5Test {

	/**
	* Test case for {@link ChangeEventGenerator#deleteOntologyTermsChange(User, ArrayList)}.
	* It tests the case that the user is null and expects an IllegalArgumentException.
	*/
	@Test
	void testDeleteOntologyTermsChange_1() {
		User user = null;
		ArrayList<OntologyTerm> ontologyTerms = new ArrayList<OntologyTerm>();
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteOntologyTermsChange(user, ontologyTerms);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteOntologyTermsChange(User, ArrayList)}.
	* It tests the case that the ontologyTerms is null and expects an IllegalArgumentException.
	*/
	@Test
	void testDeleteOntologyTermsChange_2() {
		User user = new User("userID", "password", "firstName", "lastName", "emailAddress", "organization", "department", "city", "state", "country", "postalCode", "phoneNumber", "faxNumber", "webPage", "address");
		ArrayList<OntologyTerm> ontologyTerms = null;
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteOntologyTermsChange(user, ontologyTerms);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteOntologyTermsChange(User, ArrayList)}.
	* It tests the case that the ontologyTerms is empty and expects an IllegalArgumentException.
	*/
	@Test
	void testDeleteOntologyTermsChange_3() {
		User user = new User("userID", "password", "firstName", "lastName", "emailAddress", "organization", "department", "city", "state", "country", "postalCode", "phoneNumber", "faxNumber", "webPage", "address");
		ArrayList<OntologyTerm> ontologyTerms = new ArrayList<OntologyTerm>();
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteOntologyTermsChange(user, ontologyTerms);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteOntologyTermsChange(User, ArrayList)}.
	* It tests the case that the ontologyTerms contains null and expects an IllegalArgumentException.
	*/
	@Test
	void testDeleteOntologyTermsChange_4() {
		User user = new User("userID", "password", "firstName", "lastName", "emailAddress", "organization", "department", "city", "state", "country", "postalCode", "phoneNumber", "faxNumber", "webPage", "address");
		ArrayList<OntologyTerm> ontologyTerms = new ArrayList<OntologyTerm>();
		ontologyTerms.add(null);
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteOntologyTermsChange(user, ontologyTerms);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteOntologyTermsChange(User, ArrayList)}.
	* It tests the case that the ontologyTerms contains an ontologyTerm with null identifier and expects an IllegalArgumentException.
	*/
	@Test
	void testDeleteOntologyTermsChange_5() {
		User user = new User("userID", "password", "firstName", "lastName", "emailAddress", "organization", "department", "city", "state", "country", "postalCode", "phoneNumber", "faxNumber", "webPage", "address");
		ArrayList<OntologyTerm> ontologyTerms = new ArrayList<OntologyTerm>();
		OntologyTerm ontologyTerm = new OntologyTerm(null, "ontologyTermName", "ontologyTermDefinition", "ontologyTermComment");
		ontologyTerms.add(ontologyTerm);
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteOntologyTermsChange(user, ontologyTerms);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteOntologyTermsChange(User, ArrayList)}.
	* It tests the case that the ontologyTerms contains an ontologyTerm with empty identifier and expects an IllegalArgumentException.
	*/
	@Test
	void testDeleteOntologyTermsChange_6() {
		User user = new User("userID", "password", "firstName", "lastName", "emailAddress", "organization", "department", "city", "state", "country", "postalCode", "phoneNumber", "faxNumber", "webPage", "address");
		ArrayList<OntologyTerm> ontologyTerms = new ArrayList<OntologyTerm>();
		OntologyTerm ontologyTerm = new OntologyTerm("", "ontologyTermName", "ontologyTermDefinition", "ontologyTermComment");
		ontologyTerms.add(ontologyTerm);
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteOntologyTermsChange(user, ontologyTerms);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteOntologyTermsChange(User, ArrayList)}.
	* It tests the case that the ontologyTerms contains an ontologyTerm with null name and expects an IllegalArgumentException.
	*/
	@Test
	void testDeleteOntologyTermsChange_7() {
		User user = new User("userID", "password", "firstName", "lastName", "emailAddress", "organization", "department", "city", "state", "country", "postalCode", "phoneNumber", "faxNumber", "webPage", "address");
		ArrayList<OntologyTerm> ontologyTerms = new ArrayList<OntologyTerm>();
		OntologyTerm ontologyTerm = new OntologyTerm("ontologyTermID", null, "ontologyTermDefinition", "ontologyTermComment");
		ontologyTerms.add(ontologyTerm);
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteOntologyTermsChange(user, ontologyTerms);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteOntologyTermsChange(User, ArrayList)}.
	* It tests the case that the ontologyTerms contains an ontologyTerm with empty name and expects an IllegalArgumentException.
	*/
	@Test
	void testDeleteOntologyTermsChange_8() {
		User user = new User("userID", "password", "firstName", "lastName", "emailAddress", "organization", "department", "city", "state", "country", "postalCode", "phoneNumber", "faxNumber", "webPage", "address");
		ArrayList<OntologyTerm> ontologyTerms = new ArrayList<OntologyTerm>();
		OntologyTerm ontologyTerm = new OntologyTerm("ontologyTermID", "", "ontologyTermDefinition", "ontologyTermComment");
		ontologyTerms.add(ontologyTerm);
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteOntologyTermsChange(user, ontologyTerms);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteOntologyTermsChange(User, ArrayList)}.
	* It tests the case that the ontologyTerms contains an ontologyTerm with null definition and expects an IllegalArgumentException.
	*/
	@Test
	void testDeleteOntologyTermsChange_9() {
		User user = new User("userID", "password", "firstName", "lastName", "emailAddress", "organization", "department", "city", "state", "country", "postalCode", "phoneNumber", "faxNumber", "webPage",