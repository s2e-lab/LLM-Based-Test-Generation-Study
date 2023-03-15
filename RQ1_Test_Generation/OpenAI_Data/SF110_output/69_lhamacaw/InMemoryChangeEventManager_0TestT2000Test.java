// InMemoryChangeEventManager_0Test.java
package macaw.persistenceLayer.demo;

import macaw.system.*;
import macaw.businessLayer.*;
import java.util.ArrayList;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InMemoryChangeEventManager}.
* It contains ten unit test cases for the {@link InMemoryChangeEventManager#getChangeHistoryForVariable(User, Variable)} method.
*/
class InMemoryChangeEventManager_0Test {

	/**
	* Test case 1:
	* This test case checks if the method returns an empty list when there are no change events.
	*/
	@Test
	void testCase1() {
		InMemoryChangeEventManager changeEventManager = new InMemoryChangeEventManager();
		User user = new User("userID", "userName", "userPassword", "userEmail", "userOrganisation");
		Variable variable = new Variable("variableName", "variableDescription", "variableType", "variableUnit", "variableFormat", "variableMissingValue", "variableSource", "variableDerivation", "variableNotes", "variableCategory", "variableAvailability", "variableCleaning", "variableAliasFilePath", "variableAliasFileName", "variableAliasFileFormat", "variableAliasFileNotes", "variableAliasFileCleaning", "variableAliasFileAvailability");
		ArrayList<MacawChangeEvent> changeEvents = changeEventManager.getChangeHistoryForVariable(user, variable);
		assertEquals(0, changeEvents.size());
	}
	
	/**
	* Test case 2:
	* This test case checks if the method returns an empty list when there are no change events for the given variable.
	*/
	@Test
	void testCase2() {
		InMemoryChangeEventManager changeEventManager = new InMemoryChangeEventManager();
		User user = new User("userID", "userName", "userPassword", "userEmail", "userOrganisation");
		Variable variable = new Variable("variableName", "variableDescription", "variableType", "variableUnit", "variableFormat", "variableMissingValue", "variableSource", "variableDerivation", "variableNotes", "variableCategory", "variableAvailability", "variableCleaning", "variableAliasFilePath", "variableAliasFileName", "variableAliasFileFormat", "variableAliasFileNotes", "variableAliasFileCleaning", "variableAliasFileAvailability");
		Variable variable2 = new Variable("variableName2", "variableDescription2", "variableType2", "variableUnit2", "variableFormat2", "variableMissingValue2", "variableSource2", "variableDerivation2", "variableNotes2", "variableCategory2", "variableAvailability2", "variableCleaning2", "variableAliasFilePath2", "variableAliasFileName2", "variableAliasFileFormat2", "variableAliasFileNotes2", "variableAliasFileCleaning2", "variableAliasFileAvailability2");
		MacawChangeEvent changeEvent = new MacawChangeEvent(user, variable2, ChangeEventType.VARIABLE, "changeDescription");
		changeEventManager.registerChangeEvent(changeEvent);
		ArrayList<MacawChangeEvent> changeEvents = changeEventManager.getChangeHistoryForVariable(user, variable);
		assertEquals(0, changeEvents.size());
	}
	
	/**
	* Test case 3:
	* This test case checks if the method returns a list with one change event when there is one change event for the given variable.
	*/
	@Test
	void testCase3() {
		InMemoryChangeEventManager changeEventManager = new InMemoryChangeEventManager();
		User user = new User("userID", "userName", "userPassword", "userEmail", "userOrganisation");
		Variable variable = new Variable("variableName", "variableDescription", "variableType", "variableUnit", "variableFormat", "variableMissingValue", "variableSource", "variableDerivation", "variableNotes", "variableCategory", "variableAvailability", "variableCleaning", "variableAliasFilePath", "variableAliasFileName", "variableAliasFileFormat", "variableAliasFileNotes", "variableAliasFileCleaning", "variableAliasFileAvailability");
		MacawChangeEvent changeEvent = new MacawChangeEvent(user, variable, ChangeEventType.VARIABLE, "changeDescription");
		changeEventManager.registerChangeEvent(changeEvent);
		ArrayList<MacawChangeEvent> changeEvents = changeEventManager.getChangeHistoryForVariable(user, variable);
		assertEquals(1, changeEvents.size());
	}
	
	/**
	* Test case 4:
	* This test case checks if the method returns a list with two change events when there are two change events for the given variable.
	*/
	@Test
	void testCase4() {
		InMemoryChangeEventManager changeEventManager = new InMemoryChangeEventManager();
		User user = new User("userID", "userName", "userPassword", "userEmail", "userOrganisation");
		Variable variable = new Variable("variableName", "variableDescription", "variableType", "variableUnit", "variableFormat", "variableMissingValue", "variableSource", "variableDerivation", "variableNotes", "variableCategory", "variableAvailability", "variableCleaning", "variableAliasFilePath", "variableAliasFileName", "variableAliasFileFormat", "variableAliasFileNotes", "variableAliasFileCleaning", "variableAliasFileAvailability");
		MacawChangeEvent changeEvent = new MacawChangeEvent(user, variable, ChangeEventType.VARIABLE, "changeDescription");
		MacawChangeEvent changeEvent2 = new MacawChangeEvent(user, variable, ChangeEventType.VARIABLE, "changeDescription2");
		changeEventManager.registerChangeEvent(changeEvent);
		changeEventManager.registerChangeEvent(changeEvent2);
		ArrayList<MacawChangeEvent> changeEvents = changeEventManager.getChangeHistoryForVariable(user, variable);
		assertEquals(2, changeEvents.size());
	}
	
	/**
	* Test case 5:
	* This test case checks if the method returns a list with three change events when there are three change events for the given variable.
	*/
	@Test
	void testCase5() {
		InMemoryChangeEventManager changeEventManager = new InMemoryChangeEventManager();
		User user = new User("userID", "userName", "userPassword", "userEmail", "userOrganisation");
		Variable variable = new Variable("variableName", "variableDescription", "variableType", "variableUnit", "variableFormat", "variableMissingValue", "variableSource", "variableDerivation", "variableNotes", "variableCategory", "variableAvailability", "variableCleaning", "variableAliasFilePath", "variableAliasFileName", "variableAliasFileFormat", "variableAliasFileNotes", "variableAliasFileCleaning", "variableAliasFileAvailability");
		MacawChangeEvent changeEvent = new MacawChangeEvent(user, variable, ChangeEventType.VARIABLE, "changeDescription");
		MacawChangeEvent changeEvent2 = new MacawChangeEvent(user, variable, ChangeEventType.VARIABLE, "changeDescription2");
		MacawChangeEvent changeEvent3 = new MacawChangeEvent(user, variable, ChangeEventType.VARIABLE, "changeDescription3");
		changeEventManager.registerChangeEvent(changeEvent);
		changeEventManager.registerChangeEvent(changeEvent2);
		changeEventManager.registerChangeEvent(changeEvent3);
		ArrayList<MacawChangeEvent> changeEvents = changeEventManager.getChangeHistoryForVariable(user, variable);
		assertEquals(3, changeEvents.size());
	}
	
	/**
	* Test case 6:
	* This test case checks if the method returns a list with four change events when there are four change events for the given variable.
	*/
	@Test
	void testCase6() {
		InMemoryChangeEventManager changeEventManager = new InMemoryChangeEventManager();
		User user = new User("userID", "userName", "userPassword", "userEmail", "userOrganisation");
		Variable variable = new Variable("variableName", "variableDescription", "variableType", "variableUnit", "variableFormat", "variableMissingValue", "variableSource", "variableDerivation", "variableNotes", "variableCategory", "variableAvailability", "variableCleaning", "variableAliasFilePath", "variableAliasFileName", "variableAliasFileFormat", "variableAliasFileNotes", "variableAliasFileCleaning", "variableAliasFileAvailability");
		MacawChangeEvent changeEvent = new MacawChangeEvent(user, variable, ChangeEventType.VARIABLE, "changeDescription");
		MacawChangeEvent changeEvent2 = new MacawChangeEvent(user, variable, ChangeEventType.VARIABLE, "changeDescription2");
		MacawChangeEvent changeEvent3 = new MacawChangeEvent(user, variable, ChangeEventType.VARIABLE, "changeDescription3");
		MacawChangeEvent changeEvent4 = new MacawChangeEvent(user, variable, ChangeEventType.VARIABLE, "changeDescription4");
