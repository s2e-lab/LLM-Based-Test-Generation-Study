// ChangeEventGenerator_3Test.java
package macaw.persistenceLayer;

import macaw.businessLayer.*;
import macaw.system.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeEventGenerator}.
* It contains ten unit test cases for the {@link ChangeEventGenerator#deleteValueLabelsChange(User, Variable, ArrayList)} method.
*/
class ChangeEventGenerator_3Test {

	/**
	* Test case for {@link ChangeEventGenerator#deleteValueLabelsChange(User, Variable, ArrayList)}.
	* It tests the case that the user is null and expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testDeleteValueLabelsChange_1() {
		User user = null;
		Variable variable = new Variable();
		ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
		
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteValueLabelsChange(user, variable, valueLabels);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteValueLabelsChange(User, Variable, ArrayList)}.
	* It tests the case that the variable is null and expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testDeleteValueLabelsChange_2() {
		User user = new User();
		Variable variable = null;
		ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
		
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteValueLabelsChange(user, variable, valueLabels);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteValueLabelsChange(User, Variable, ArrayList)}.
	* It tests the case that the valueLabels is null and expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testDeleteValueLabelsChange_3() {
		User user = new User();
		Variable variable = new Variable();
		ArrayList<ValueLabel> valueLabels = null;
		
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteValueLabelsChange(user, variable, valueLabels);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteValueLabelsChange(User, Variable, ArrayList)}.
	* It tests the case that the valueLabels is empty and expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testDeleteValueLabelsChange_4() {
		User user = new User();
		Variable variable = new Variable();
		ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
		
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteValueLabelsChange(user, variable, valueLabels);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteValueLabelsChange(User, Variable, ArrayList)}.
	* It tests the case that the valueLabels contains a null element and expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testDeleteValueLabelsChange_5() {
		User user = new User();
		Variable variable = new Variable();
		ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
		valueLabels.add(null);
		
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteValueLabelsChange(user, variable, valueLabels);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteValueLabelsChange(User, Variable, ArrayList)}.
	* It tests the case that the valueLabels contains a value label with a null identifier and expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testDeleteValueLabelsChange_6() {
		User user = new User();
		Variable variable = new Variable();
		ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
		ValueLabel valueLabel = new ValueLabel();
		valueLabels.add(valueLabel);
		
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteValueLabelsChange(user, variable, valueLabels);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteValueLabelsChange(User, Variable, ArrayList)}.
	* It tests the case that the valueLabels contains a value label with a blank identifier and expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testDeleteValueLabelsChange_7() {
		User user = new User();
		Variable variable = new Variable();
		ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
		ValueLabel valueLabel = new ValueLabel();
		valueLabel.setIdentifier("");
		valueLabels.add(valueLabel);
		
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteValueLabelsChange(user, variable, valueLabels);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteValueLabelsChange(User, Variable, ArrayList)}.
	* It tests the case that the valueLabels contains a value label with a null display name and expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testDeleteValueLabelsChange_8() {
		User user = new User();
		Variable variable = new Variable();
		ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
		ValueLabel valueLabel = new ValueLabel();
		valueLabel.setIdentifier("1");
		valueLabels.add(valueLabel);
		
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteValueLabelsChange(user, variable, valueLabels);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteValueLabelsChange(User, Variable, ArrayList)}.
	* It tests the case that the valueLabels contains a value label with a blank display name and expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testDeleteValueLabelsChange_9() {
		User user = new User();
		Variable variable = new Variable();
		ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
		ValueLabel valueLabel = new ValueLabel();
		valueLabel.setIdentifier("1");
		valueLabel.setDisplayName("");
		valueLabels.add(valueLabel);
		
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteValueLabelsChange(user, variable, valueLabels);
		});
	}
	
	/**
	* Test case for {@link ChangeEventGenerator#deleteValueLabelsChange(User, Variable, ArrayList)}.
	* It tests the case that the valueLabels contains a value label with a null variable and expects an {@link IllegalArgumentException} to be thrown.
	*/
	@Test
	void testDeleteValueLabelsChange_10() {
		User user = new User();
		Variable variable = new Variable();
		ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
		ValueLabel valueLabel = new ValueLabel();
		valueLabel.setIdentifier("1");
		valueLabel.setDisplayName("1");
		valueLabels.add(valueLabel);
		
		assertThrows(IllegalArgumentException.class, () -> {
			ChangeEventGenerator.deleteValueLabelsChange(user, variable, valueLabels);
		});
	}
	
}

// ChangeEventGenerator_4Test.java
package macaw.persistenceLayer;

import macaw.businessLayer.*;
import macaw.system.*;
import java.util.ArrayList;
import org.junit.