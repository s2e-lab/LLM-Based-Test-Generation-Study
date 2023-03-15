// ChangeEventGenerator_6Test.java
package macaw.persistenceLayer;

import macaw.businessLayer.*;
import macaw.system.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeEventGenerator}.
* It contains ten unit test cases for the {@link ChangeEventGenerator#deleteVariableChanges(User, Variable)} method.
*/
class ChangeEventGenerator_6Test {

	/**
	* Test case for {@link ChangeEventGenerator#deleteVariableChanges(User, Variable)} method.
	* It tests the case when the variable is a raw variable.
	*/
	@Test
	void testDeleteVariableChanges_1() throws MacawException {
		User user = new User("userID", "userName", "userPassword", "userEmail");
		RawVariable rawVariable = new RawVariable("rawVariableName", "rawVariableDescription", "rawVariableType");
		MacawChangeEvent changeEvent = ChangeEventGenerator.deleteVariableChanges(user, rawVariable);
		assertEquals(ChangeEventType.VARIABLE, changeEvent.getChangeEventType());
		assertEquals(MacawMessages.getMessage("rawVariable.saveChanges.deleteRecord", rawVariable.getDisplayName()), changeEvent.getChangeMessage());
		assertEquals(user.getUserID(), changeEvent.getUserID());
		assertEquals(rawVariable.getIdentifier(), changeEvent.getChangedObjectIdentifier());
		assertEquals(rawVariable.getIdentifier(), changeEvent.getVariableOwnerID());
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteVariableChanges(User, Variable)} method.
	* It tests the case when the variable is a derived variable.
	*/
	@Test
	void testDeleteVariableChanges_2() throws MacawException {
		User user = new User("userID", "userName", "userPassword", "userEmail");
		DerivedVariable derivedVariable = new DerivedVariable("derivedVariableName", "derivedVariableDescription", "derivedVariableType");
		MacawChangeEvent changeEvent = ChangeEventGenerator.deleteVariableChanges(user, derivedVariable);
		assertEquals(ChangeEventType.VARIABLE, changeEvent.getChangeEventType());
		assertEquals(MacawMessages.getMessage("derivedVariable.saveChanges.deleteRecord", derivedVariable.getDisplayName()), changeEvent.getChangeMessage());
		assertEquals(user.getUserID(), changeEvent.getUserID());
		assertEquals(derivedVariable.getIdentifier(), changeEvent.getChangedObjectIdentifier());
		assertEquals(derivedVariable.getIdentifier(), changeEvent.getVariableOwnerID());
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteVariableChanges(User, Variable)} method.
	* It tests the case when the variable is null.
	*/
	@Test
	void testDeleteVariableChanges_3() throws MacawException {
		User user = new User("userID", "userName", "userPassword", "userEmail");
		Variable variable = null;
		MacawChangeEvent changeEvent = ChangeEventGenerator.deleteVariableChanges(user, variable);
		assertNull(changeEvent);
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteVariableChanges(User, Variable)} method.
	* It tests the case when the user is null.
	*/
	@Test
	void testDeleteVariableChanges_4() throws MacawException {
		User user = null;
		RawVariable rawVariable = new RawVariable("rawVariableName", "rawVariableDescription", "rawVariableType");
		MacawChangeEvent changeEvent = ChangeEventGenerator.deleteVariableChanges(user, rawVariable);
		assertNull(changeEvent);
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteVariableChanges(User, Variable)} method.
	* It tests the case when the user is null and the variable is null.
	*/
	@Test
	void testDeleteVariableChanges_5() throws MacawException {
		User user = null;
		Variable variable = null;
		MacawChangeEvent changeEvent = ChangeEventGenerator.deleteVariableChanges(user, variable);
		assertNull(changeEvent);
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteVariableChanges(User, Variable)} method.
	* It tests the case when the user is not null and the variable is null.
	*/
	@Test
	void testDeleteVariableChanges_6() throws MacawException {
		User user = new User("userID", "userName", "userPassword", "userEmail");
		Variable variable = null;
		MacawChangeEvent changeEvent = ChangeEventGenerator.deleteVariableChanges(user, variable);
		assertNull(changeEvent);
	}
	
}

// ChangeEventGenerator_7Test.java
package macaw.persistenceLayer;

import macaw.businessLayer.*;
import macaw.system.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeEventGenerator}.
* It contains ten unit test cases for the {@link ChangeEventGenerator#deleteRawVariablesChanges(User, ArrayList)} method.
*/
class ChangeEventGenerator_7Test {
		
	/**
	* Test case for {@link ChangeEventGenerator#deleteRawVariablesChanges(User, ArrayList)} method.
	* It tests the case when the raw variables list is not empty.
	*/
	@Test
	void testDeleteRawVariablesChanges_1() throws MacawException {
		User user = new User("userID", "userName", "userPassword", "userEmail");
		ArrayList<RawVariable> rawVariables = new ArrayList<RawVariable>();
		RawVariable rawVariable1 = new RawVariable("rawVariableName1", "rawVariableDescription1", "rawVariableType1");
		RawVariable rawVariable2 = new RawVariable("rawVariableName2", "rawVariableDescription2", "rawVariableType2");
		rawVariables.add(rawVariable1);
		rawVariables.add(rawVariable2);
		ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.deleteRawVariablesChanges(user, rawVariables);
		assertEquals(2, changeEvents.size());
		MacawChangeEvent changeEvent1 = changeEvents.get(0);
		assertEquals(ChangeEventType.VARIABLE, changeEvent1.getChangeEventType());
		assertEquals(MacawMessages.getMessage("rawVariable.saveChanges.deleteRecord", rawVariable1.getDisplayName()), changeEvent1.getChangeMessage());
		assertEquals(user.getUserID(), changeEvent1.getUserID());
		assertEquals(rawVariable1.getIdentifier(), changeEvent1.getChangedObjectIdentifier());
		assertEquals(rawVariable1.getIdentifier(), changeEvent1.getVariableOwnerID());
		MacawChangeEvent changeEvent2 = changeEvents.get(1);
		assertEquals(ChangeEventType.VARIABLE, changeEvent2.getChangeEventType());
		assertEquals(MacawMessages.getMessage("rawVariable.saveChanges.deleteRecord", rawVariable2.getDisplayName()), changeEvent2.getChangeMessage());
		assertEquals(user.getUserID(), changeEvent2.getUserID());
		assertEquals(rawVariable2.getIdentifier(), changeEvent2.getChangedObjectIdentifier());
		assertEquals(rawVariable2.getIdentifier(), changeEvent2.getVariableOwnerID());
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteRawVariablesChanges(User, ArrayList)} method.
	* It tests the case when the raw variables list is empty.
	*/
	@Test
	void testDeleteRawVariablesChanges_2() throws MacawException {
		User user = new User("userID", "userName", "userPassword", "userEmail");
		ArrayList<RawVariable> rawVariables = new ArrayList<RawVariable>();
		ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.deleteRawVariablesChanges(user, rawVariables);
		assertEquals(0, changeEvents.size());
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteRawVariablesChanges(User, ArrayList)} method.
	* It tests the case when the raw variables list is null.
	*/
	@Test
	void testDeleteRawVariablesChanges_3() throws Macaw