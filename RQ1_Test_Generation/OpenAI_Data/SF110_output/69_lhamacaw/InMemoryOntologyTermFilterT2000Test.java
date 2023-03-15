// InMemoryOntologyTermFilterTest.java
package macaw.persistenceLayer.demo;

import macaw.businessLayer.*;
import macaw.system.*;
import macaw.util.SearchUtility;
import macaw.util.ValidationUtility;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InMemoryOntologyTermFilter}.
* It contains ten unit test cases for the {@link InMemoryOntologyTermFilter#filterOntologyTerms(User, String, String)} method.
*/
class InMemoryOntologyTermFilterTest {

	/**
	* Test case for {@link InMemoryOntologyTermFilter#filterOntologyTerms(User, String, String)} method.
	* It tests the case when the ontologyTermFilter is null and the ontologyDescriptionFilter is null.
	* It should throw a MacawException.
	*/
	@Test
	void testFilterOntologyTerms_1() throws MacawException {
		InMemoryOntologyTermFilter inMemoryOntologyTermFilter = new InMemoryOntologyTermFilter();
		User user = new User();
		String ontologyTermFilter = null;
		String ontologyDescriptionFilter = null;
		MacawException exception = assertThrows(MacawException.class, () -> {
			inMemoryOntologyTermFilter.filterOntologyTerms(user, ontologyTermFilter, ontologyDescriptionFilter);
		});
		assertEquals(MacawErrorType.NO_ONTOLOGY_TERM_FILTER, exception.getErrorType());
	}
	
	/**
	* Test case for {@link InMemoryOntologyTermFilter#filterOntologyTerms(User, String, String)} method.
	* It tests the case when the ontologyTermFilter is empty and the ontologyDescriptionFilter is empty.
	* It should throw a MacawException.
	*/
	@Test
	void testFilterOntologyTerms_2() throws MacawException {
		InMemoryOntologyTermFilter inMemoryOntologyTermFilter = new InMemoryOntologyTermFilter();
		User user = new User();
		String ontologyTermFilter = "";
		String ontologyDescriptionFilter = "";
		MacawException exception = assertThrows(MacawException.class, () -> {
			inMemoryOntologyTermFilter.filterOntologyTerms(user, ontologyTermFilter, ontologyDescriptionFilter);
		});
		assertEquals(MacawErrorType.NO_ONTOLOGY_TERM_FILTER, exception.getErrorType());
	}
	
	/**
	* Test case for {@link InMemoryOntologyTermFilter#filterOntologyTerms(User, String, String)} method.
	* It tests the case when the ontologyTermFilter is null and the ontologyDescriptionFilter is empty.
	* It should throw a MacawException.
	*/
	@Test
	void testFilterOntologyTerms_3() throws MacawException {
		InMemoryOntologyTermFilter inMemoryOntologyTermFilter = new InMemoryOntologyTermFilter();
		User user = new User();
		String ontologyTermFilter = null;
		String ontologyDescriptionFilter = "";
		MacawException exception = assertThrows(MacawException.class, () -> {
			inMemoryOntologyTermFilter.filterOntologyTerms(user, ontologyTermFilter, ontologyDescriptionFilter);
		});
		assertEquals(MacawErrorType.NO_ONTOLOGY_TERM_FILTER, exception.getErrorType());
	}
	
	/**
	* Test case for {@link InMemoryOntologyTermFilter#filterOntologyTerms(User, String, String)} method.
	* It tests the case when the ontologyTermFilter is empty and the ontologyDescriptionFilter is null.
	* It should throw a MacawException.
	*/
	@Test
	void testFilterOntologyTerms_4() throws MacawException {
		InMemoryOntologyTermFilter inMemoryOntologyTermFilter = new InMemoryOntologyTermFilter();
		User user = new User();
		String ontologyTermFilter = "";
		String ontologyDescriptionFilter = null;
		MacawException exception = assertThrows(MacawException.class, () -> {
			inMemoryOntologyTermFilter.filterOntologyTerms(user, ontologyTermFilter, ontologyDescriptionFilter);
		});
		assertEquals(MacawErrorType.NO_ONTOLOGY_TERM_FILTER, exception.getErrorType());
	}
	
	/**
	* Test case for {@link InMemoryOntologyTermFilter#filterOntologyTerms(User, String, String)} method.
	* It tests the case when the ontologyTermFilter is null and the ontologyDescriptionFilter is not null.
	* It should return an empty list.
	*/
	@Test
	void testFilterOntologyTerms_5() throws MacawException {
		InMemoryOntologyTermFilter inMemoryOntologyTermFilter = new InMemoryOntologyTermFilter();
		User user = new User();
		String ontologyTermFilter = null;
		String ontologyDescriptionFilter = "description";
		ArrayList<OntologyTerm> ontologyTerms = new ArrayList<OntologyTerm>();
		OntologyTerm ontologyTerm = new OntologyTerm();
		ontologyTerm.setTerm("term");
		ontologyTerm.setDescription("description");
		ontologyTerms.add(ontologyTerm);
		inMemoryOntologyTermFilter.setOntologyTerms(ontologyTerms);
		ArrayList<OntologyTerm> result = inMemoryOntologyTermFilter.filterOntologyTerms(user, ontologyTermFilter, ontologyDescriptionFilter);
		assertEquals(0, result.size());
	}
	
	/**
	* Test case for {@link InMemoryOntologyTermFilter#filterOntologyTerms(User, String, String)} method.
	* It tests the case when the ontologyTermFilter is empty and the ontologyDescriptionFilter is not null.
	* It should return an empty list.
	*/
	@Test
	void testFilterOntologyTerms_6() throws MacawException {
		InMemoryOntologyTermFilter inMemoryOntologyTermFilter = new InMemoryOntologyTermFilter();
		User user = new User();
		String ontologyTermFilter = "";
		String ontologyDescriptionFilter = "description";
		ArrayList<OntologyTerm> ontologyTerms = new ArrayList<OntologyTerm>();
		OntologyTerm ontologyTerm = new OntologyTerm();
		ontologyTerm.setTerm("term");
		ontologyTerm.setDescription("description");
		ontologyTerms.add(ontologyTerm);
		inMemoryOntologyTermFilter.setOntologyTerms(ontologyTerms);
		ArrayList<OntologyTerm> result = inMemoryOntologyTermFilter.filterOntologyTerms(user, ontologyTermFilter, ontologyDescriptionFilter);
		assertEquals(0, result.size());
	}
	
	/**
	* Test case for {@link InMemoryOntologyTermFilter#filterOntologyTerms(User, String, String)} method.
	* It tests the case when the ontologyTermFilter is not null and the ontologyDescriptionFilter is null.
	* It should return an empty list.
	*/
	@Test
	void testFilterOntologyTerms_7() throws MacawException {
		InMemoryOntologyTermFilter inMemoryOntologyTermFilter = new InMemoryOntologyTermFilter();
		User user = new User();
		String ontologyTermFilter = "term";
		String ontologyDescriptionFilter = null;
		ArrayList<OntologyTerm> ontologyTerms = new ArrayList<OntologyTerm>();
		OntologyTerm ontologyTerm = new OntologyTerm();
		ontologyTerm.setTerm("term");
		ontologyTerm.setDescription("description");
		ontologyTerms.add(ontologyTerm);
		inMemoryOntologyTermFilter.setOntologyTerms(ontologyTerms);
		ArrayList<OntologyTerm> result = inMemoryOntologyTermFilter.filterOntologyTerms(user, ontologyTermFilter, ontologyDescriptionFilter);
		assertEquals(0, result.size());
	}
	
	/**
	* Test case for {@link InMemoryOntologyTermFilter#filterOntologyTerms(User, String, String)} method.
	* It tests the case when the ontologyTermFilter is not null and the ontologyDescriptionFilter is empty.
	* It should return an empty list.
	*/
	@Test
	void testFilterOntologyTerms_8() throws MacawException {
		InMemoryOntologyTermFilter inMemoryOntologyTermFilter = new InMemoryOntologyTermFilter();
		User user = new User();
		String ontologyTermFilter = "term";
		String ontologyDescriptionFilter = "";
		ArrayList<OntologyTerm