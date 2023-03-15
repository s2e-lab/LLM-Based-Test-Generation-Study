// ChangeEventGenerator_10Test.java
package macaw.persistenceLayer;

import macaw.businessLayer.*;
import macaw.system.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeEventGenerator}.
* It contains ten unit test cases for the {@link ChangeEventGenerator#disassociateSourceVariablesChanges(User, DerivedVariable, ArrayList)} method.
*/
class ChangeEventGenerator_10Test {

	/**
	* Test case for {@link ChangeEventGenerator#disassociateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* It tests the method with the following inputs:
	* 1. user = null
	* 2. derivedVariable = null
	* 3. sourceVariablesToDelete = null
	* It should throw an IllegalArgumentException.
	*/
	@Test
	void testDisassociateSourceVariablesChanges_1() {
		User user = null;
		DerivedVariable derivedVariable = null;
		ArrayList<Variable> sourceVariablesToDelete = null;
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.disassociateSourceVariablesChanges(user, derivedVariable, sourceVariablesToDelete);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#disassociateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* It tests the method with the following inputs:
	* 1. user = null
	* 2. derivedVariable = null
	* 3. sourceVariablesToDelete = empty
	* It should throw an IllegalArgumentException.
	*/
	@Test
	void testDisassociateSourceVariablesChanges_2() {
		User user = null;
		DerivedVariable derivedVariable = null;
		ArrayList<Variable> sourceVariablesToDelete = new ArrayList<Variable>();
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.disassociateSourceVariablesChanges(user, derivedVariable, sourceVariablesToDelete);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#disassociateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* It tests the method with the following inputs:
	* 1. user = null
	* 2. derivedVariable = null
	* 3. sourceVariablesToDelete = not empty
	* It should throw an IllegalArgumentException.
	*/
	@Test
	void testDisassociateSourceVariablesChanges_3() {
		User user = null;
		DerivedVariable derivedVariable = null;
		ArrayList<Variable> sourceVariablesToDelete = new ArrayList<Variable>();
		sourceVariablesToDelete.add(new RawVariable());
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.disassociateSourceVariablesChanges(user, derivedVariable, sourceVariablesToDelete);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#disassociateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* It tests the method with the following inputs:
	* 1. user = null
	* 2. derivedVariable = not null
	* 3. sourceVariablesToDelete = null
	* It should throw an IllegalArgumentException.
	*/
	@Test
	void testDisassociateSourceVariablesChanges_4() {
		User user = null;
		DerivedVariable derivedVariable = new DerivedVariable();
		ArrayList<Variable> sourceVariablesToDelete = null;
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.disassociateSourceVariablesChanges(user, derivedVariable, sourceVariablesToDelete);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#disassociateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* It tests the method with the following inputs:
	* 1. user = null
	* 2. derivedVariable = not null
	* 3. sourceVariablesToDelete = empty
	* It should throw an IllegalArgumentException.
	*/
	@Test
	void testDisassociateSourceVariablesChanges_5() {
		User user = null;
		DerivedVariable derivedVariable = new DerivedVariable();
		ArrayList<Variable> sourceVariablesToDelete = new ArrayList<Variable>();
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.disassociateSourceVariablesChanges(user, derivedVariable, sourceVariablesToDelete);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#disassociateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* It tests the method with the following inputs:
	* 1. user = null
	* 2. derivedVariable = not null
	* 3. sourceVariablesToDelete = not empty
	* It should throw an IllegalArgumentException.
	*/
	@Test
	void testDisassociateSourceVariablesChanges_6() {
		User user = null;
		DerivedVariable derivedVariable = new DerivedVariable();
		ArrayList<Variable> sourceVariablesToDelete = new ArrayList<Variable>();
		sourceVariablesToDelete.add(new RawVariable());
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.disassociateSourceVariablesChanges(user, derivedVariable, sourceVariablesToDelete);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#disassociateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* It tests the method with the following inputs:
	* 1. user = not null
	* 2. derivedVariable = null
	* 3. sourceVariablesToDelete = null
	* It should throw an IllegalArgumentException.
	*/
	@Test
	void testDisassociateSourceVariablesChanges_7() {
		User user = new User();
		DerivedVariable derivedVariable = null;
		ArrayList<Variable> sourceVariablesToDelete = null;
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.disassociateSourceVariablesChanges(user, derivedVariable, sourceVariablesToDelete);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#disassociateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* It tests the method with the following inputs:
	* 1. user = not null
	* 2. derivedVariable = null
	* 3. sourceVariablesToDelete = empty
	* It should throw an IllegalArgumentException.
	*/
	@Test
	void testDisassociateSourceVariablesChanges_8() {
		User user = new User();
		DerivedVariable derivedVariable = null;
		ArrayList<Variable> sourceVariablesToDelete = new ArrayList<Variable>();
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.disassociateSourceVariablesChanges(user, derivedVariable, sourceVariablesToDelete);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#disassociateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* It tests the method with the following inputs:
	* 1. user = not null
	* 2. derivedVariable = null
	* 3. sourceVariablesToDelete = not empty
	* It should throw an IllegalArgumentException.
	*/
	@Test
	void testDisassociateSourceVariablesChanges_9() {
		User user = new User();
		DerivedVariable derivedVariable = null;
		ArrayList<Variable> sourceVariablesToDelete = new ArrayList<Variable>();
		sourceVariablesToDelete.add(new RawVariable());
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.disassociateSourceVariablesChanges(user, derivedVariable, sourceVariablesToDelete);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#disassociateSourceVariablesChanges(User, DerivedVariable, ArrayList)}.
	* It tests the method with the following inputs:
	* 1. user = not null
	* 2. derivedVariable = not null
	* 3. sourceVariablesToDelete = null
	* It should throw an IllegalArgumentException.
	*/
	@Test
	void testDisassociate