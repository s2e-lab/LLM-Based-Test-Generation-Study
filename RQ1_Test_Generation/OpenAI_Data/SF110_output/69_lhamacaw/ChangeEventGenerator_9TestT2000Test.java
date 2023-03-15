// ChangeEventGenerator_9Test.java
package macaw.persistenceLayer;

import macaw.businessLayer.*;
import macaw.system.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeEventGenerator}.
* It contains ten unit test cases for the {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)} method.
*/
class ChangeEventGenerator_9Test {

	/**
	* Test case for the {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* This test case tests the scenario where the user is null.
	* Expected output: {@link MacawException} with the message "user is null".
	* @throws MacawException 
	*/
	@Test
	void testAssociateSourceVariablesChanges_1() throws MacawException {
		User user = null;
		DerivedVariable derivedVariable = new DerivedVariable();
		ArrayList<Variable> sourceVariablesToAdd = new ArrayList<Variable>();
		
		MacawException expectedException = new MacawException("user is null");
		MacawException actualException = null;
		
		try {
			ChangeEventGenerator.associateSourceVariablesChanges(user, derivedVariable, sourceVariablesToAdd);
		} catch (MacawException e) {
			actualException = e;
		}
		
		assertEquals(expectedException.getMessage(), actualException.getMessage());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* This test case tests the scenario where the derived variable is null.
	* Expected output: {@link MacawException} with the message "derivedVariable is null".
	* @throws MacawException 
	*/
	@Test
	void testAssociateSourceVariablesChanges_2() throws MacawException {
		User user = new User();
		DerivedVariable derivedVariable = null;
		ArrayList<Variable> sourceVariablesToAdd = new ArrayList<Variable>();
		
		MacawException expectedException = new MacawException("derivedVariable is null");
		MacawException actualException = null;
		
		try {
			ChangeEventGenerator.associateSourceVariablesChanges(user, derivedVariable, sourceVariablesToAdd);
		} catch (MacawException e) {
			actualException = e;
		}
		
		assertEquals(expectedException.getMessage(), actualException.getMessage());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* This test case tests the scenario where the source variables to add is null.
	* Expected output: {@link MacawException} with the message "sourceVariablesToAdd is null".
	* @throws MacawException 
	*/
	@Test
	void testAssociateSourceVariablesChanges_3() throws MacawException {
		User user = new User();
		DerivedVariable derivedVariable = new DerivedVariable();
		ArrayList<Variable> sourceVariablesToAdd = null;
		
		MacawException expectedException = new MacawException("sourceVariablesToAdd is null");
		MacawException actualException = null;
		
		try {
			ChangeEventGenerator.associateSourceVariablesChanges(user, derivedVariable, sourceVariablesToAdd);
		} catch (MacawException e) {
			actualException = e;
		}
		
		assertEquals(expectedException.getMessage(), actualException.getMessage());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* This test case tests the scenario where the source variables to add is empty.
	* Expected output: {@link MacawException} with the message "sourceVariablesToAdd is empty".
	* @throws MacawException 
	*/
	@Test
	void testAssociateSourceVariablesChanges_4() throws MacawException {
		User user = new User();
		DerivedVariable derivedVariable = new DerivedVariable();
		ArrayList<Variable> sourceVariablesToAdd = new ArrayList<Variable>();
		
		MacawException expectedException = new MacawException("sourceVariablesToAdd is empty");
		MacawException actualException = null;
		
		try {
			ChangeEventGenerator.associateSourceVariablesChanges(user, derivedVariable, sourceVariablesToAdd);
		} catch (MacawException e) {
			actualException = e;
		}
		
		assertEquals(expectedException.getMessage(), actualException.getMessage());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* This test case tests the scenario where the source variables to add contains a null element.
	* Expected output: {@link MacawException} with the message "sourceVariablesToAdd contains a null element".
	* @throws MacawException 
	*/
	@Test
	void testAssociateSourceVariablesChanges_5() throws MacawException {
		User user = new User();
		DerivedVariable derivedVariable = new DerivedVariable();
		ArrayList<Variable> sourceVariablesToAdd = new ArrayList<Variable>();
		sourceVariablesToAdd.add(null);
		
		MacawException expectedException = new MacawException("sourceVariablesToAdd contains a null element");
		MacawException actualException = null;
		
		try {
			ChangeEventGenerator.associateSourceVariablesChanges(user, derivedVariable, sourceVariablesToAdd);
		} catch (MacawException e) {
			actualException = e;
		}
		
		assertEquals(expectedException.getMessage(), actualException.getMessage());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* This test case tests the scenario where the source variables to add contains a duplicate element.
	* Expected output: {@link MacawException} with the message "sourceVariablesToAdd contains a duplicate element".
	* @throws MacawException 
	*/
	@Test
	void testAssociateSourceVariablesChanges_6() throws MacawException {
		User user = new User();
		DerivedVariable derivedVariable = new DerivedVariable();
		ArrayList<Variable> sourceVariablesToAdd = new ArrayList<Variable>();
		Variable variable = new Variable();
		sourceVariablesToAdd.add(variable);
		sourceVariablesToAdd.add(variable);
		
		MacawException expectedException = new MacawException("sourceVariablesToAdd contains a duplicate element");
		MacawException actualException = null;
		
		try {
			ChangeEventGenerator.associateSourceVariablesChanges(user, derivedVariable, sourceVariablesToAdd);
		} catch (MacawException e) {
			actualException = e;
		}
		
		assertEquals(expectedException.getMessage(), actualException.getMessage());
	}
	
	/**
	* Test case for the {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)} method.
	* Tested method: {@link ChangeEventGenerator#associateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* This test case tests the scenario where the source variables to add contains