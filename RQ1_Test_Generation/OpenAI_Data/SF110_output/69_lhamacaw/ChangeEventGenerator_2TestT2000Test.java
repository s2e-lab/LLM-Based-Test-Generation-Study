// ChangeEventGenerator_2Test.java
package macaw.persistenceLayer;

import macaw.businessLayer.*;
import macaw.system.*;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ChangeEventGenerator}.
* It contains ten unit test cases for the {@link ChangeEventGenerator#addValueLabelsChange(User, Variable, ArrayList)} method.
*/
class ChangeEventGenerator_2Test {

		@Test
		void testAddValueLabelsChange_1() throws MacawException {
			User user = new User("userID", "userName", "userPassword", "userEmail", "userOrganisation");
			Variable variable = new Variable("variableName", "variableDescription", "variableType", "variableUnit", "variableFormat", "variableMissingValue", "variableSource", "variableDerivation", "variableNotes");
			ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
			ValueLabel valueLabel = new ValueLabel("valueLabelName", "valueLabelDescription", "valueLabelValue", "valueLabelLabel");
			valueLabels.add(valueLabel);
			ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.addValueLabelsChange(user, variable, valueLabels);
			assertEquals(1, changeEvents.size());
			MacawChangeEvent changeEvent = changeEvents.get(0);
			assertEquals(ChangeEventType.VALUE_LABEL, changeEvent.getChangeEventType());
			assertEquals("userID", changeEvent.getUserID());
			assertEquals("variableName", changeEvent.getVariableOwnerID());
			assertEquals("valueLabelName", changeEvent.getChangedObjectIdentifier());
		}
		
		@Test
		void testAddValueLabelsChange_2() throws MacawException {
			User user = new User("userID", "userName", "userPassword", "userEmail", "userOrganisation");
			Variable variable = new Variable("variableName", "variableDescription", "variableType", "variableUnit", "variableFormat", "variableMissingValue", "variableSource", "variableDerivation", "variableNotes");
			ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
			ValueLabel valueLabel = new ValueLabel("valueLabelName", "valueLabelDescription", "valueLabelValue", "valueLabelLabel");
			valueLabels.add(valueLabel);
			ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.addValueLabelsChange(user, variable, valueLabels);
			assertEquals(1, changeEvents.size());
			MacawChangeEvent changeEvent = changeEvents.get(0);
			assertEquals(ChangeEventType.VALUE_LABEL, changeEvent.getChangeEventType());
			assertEquals("userID", changeEvent.getUserID());
			assertEquals("variableName", changeEvent.getVariableOwnerID());
			assertEquals("valueLabelName", changeEvent.getChangedObjectIdentifier());
		}
		
		@Test
		void testAddValueLabelsChange_3() throws MacawException {
			User user = new User("userID", "userName", "userPassword", "userEmail", "userOrganisation");
			Variable variable = new Variable("variableName", "variableDescription", "variableType", "variableUnit", "variableFormat", "variableMissingValue", "variableSource", "variableDerivation", "variableNotes");
			ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
			ValueLabel valueLabel = new ValueLabel("valueLabelName", "valueLabelDescription", "valueLabelValue", "valueLabelLabel");
			valueLabels.add(valueLabel);
			ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.addValueLabelsChange(user, variable, valueLabels);
			assertEquals(1, changeEvents.size());
			MacawChangeEvent changeEvent = changeEvents.get(0);
			assertEquals(ChangeEventType.VALUE_LABEL, changeEvent.getChangeEventType());
			assertEquals("userID", changeEvent.getUserID());
			assertEquals("variableName", changeEvent.getVariableOwnerID());
			assertEquals("valueLabelName", changeEvent.getChangedObjectIdentifier());
		}
		
		@Test
		void testAddValueLabelsChange_4() throws MacawException {
			User user = new User("userID", "userName", "userPassword", "userEmail", "userOrganisation");
			Variable variable = new Variable("variableName", "variableDescription", "variableType", "variableUnit", "variableFormat", "variableMissingValue", "variableSource", "variableDerivation", "variableNotes");
			ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
			ValueLabel valueLabel = new ValueLabel("valueLabelName", "valueLabelDescription", "valueLabelValue", "valueLabelLabel");
			valueLabels.add(valueLabel);
			ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.addValueLabelsChange(user, variable, valueLabels);
			assertEquals(1, changeEvents.size());
			MacawChangeEvent changeEvent = changeEvents.get(0);
			assertEquals(ChangeEventType.VALUE_LABEL, changeEvent.getChangeEventType());
			assertEquals("userID", changeEvent.getUserID());
			assertEquals("variableName", changeEvent.getVariableOwnerID());
			assertEquals("valueLabelName", changeEvent.getChangedObjectIdentifier());
		}
		
		@Test
		void testAddValueLabelsChange_5() throws MacawException {
			User user = new User("userID", "userName", "userPassword", "userEmail", "userOrganisation");
			Variable variable = new Variable("variableName", "variableDescription", "variableType", "variableUnit", "variableFormat", "variableMissingValue", "variableSource", "variableDerivation", "variableNotes");
			ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
			ValueLabel valueLabel = new ValueLabel("valueLabelName", "valueLabelDescription", "valueLabelValue", "valueLabelLabel");
			valueLabels.add(valueLabel);
			ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.addValueLabelsChange(user, variable, valueLabels);
			assertEquals(1, changeEvents.size());
			MacawChangeEvent changeEvent = changeEvents.get(0);
			assertEquals(ChangeEventType.VALUE_LABEL, changeEvent.getChangeEventType());
			assertEquals("userID", changeEvent.getUserID());
			assertEquals("variableName", changeEvent.getVariableOwnerID());
			assertEquals("valueLabelName", changeEvent.getChangedObjectIdentifier());
		}
		
		@Test
		void testAddValueLabelsChange_6() throws MacawException {
			User user = new User("userID", "userName", "userPassword", "userEmail", "userOrganisation");
			Variable variable = new Variable("variableName", "variableDescription", "variableType", "variableUnit", "variableFormat", "variableMissingValue", "variableSource", "variableDerivation", "variableNotes");
			ArrayList<ValueLabel> valueLabels = new ArrayList<ValueLabel>();
			ValueLabel valueLabel = new ValueLabel("valueLabelName", "valueLabelDescription", "valueLabelValue", "valueLabelLabel");
			valueLabels.add(valueLabel);
			ArrayList<MacawChangeEvent> changeEvents = ChangeEventGenerator.addValueLabelsChange(user, variable, valueLabels);
			assertEquals(1, changeEvents.size());
			MacawChangeEvent changeEvent = changeEvents.get(0);
			assertEquals(ChangeEventType.VALUE_LABEL, changeEvent.getChangeEventType());
			assertEquals("userID", changeEvent.getUserID());
			assertEquals("variableName", changeEvent.getVariableOwnerID());
			assertEquals("valueLabelName", changeEvent.getChangedObjectIdentifier());
		}
		
		@Test
		void testAddValueLabelsChange_7() throws MacawException {
			User user = new User("userID", "userName", "userPassword", "userEmail", "userOrganisation");
		