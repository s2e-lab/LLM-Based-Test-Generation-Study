// DBTriggerTest.java
package org.databene.jdbacl.model;

import org.databene.commons.NullSafeComparator;
import org.databene.commons.anno.Nullable;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DBTrigger}.
* It contains ten unit test cases for the {@link DBTrigger#isIdentical(DBObject)} method.
*/
class DBTriggerTest {

	@Test
	void testIsIdentical_01() {
		DBTrigger trigger1 = new DBTrigger("trigger1", null);
		trigger1.setTriggerType("after statement");
		trigger1.setTriggeringEvent("insert or update or delete");
		trigger1.setTableOwner("owner");
		trigger1.setBaseObjectType("table");
		trigger1.setTableName("table1");
		trigger1.setColumnName("column1");
		trigger1.setReferencingNames("new.column1");
		trigger1.setWhenClause("when (new.column1 = 'value1')");
		trigger1.setStatus("enabled");
		trigger1.setDescription("description1");
		trigger1.setActionType("pl/sql block");
		trigger1.setTriggerBody("begin\n\tnull;\nend;");
		
		DBTrigger trigger2 = new DBTrigger("trigger1", null);
		trigger2.setTriggerType("after statement");
		trigger2.setTriggeringEvent("insert or update or delete");
		trigger2.setTableOwner("owner");
		trigger2.setBaseObjectType("table");
		trigger2.setTableName("table1");
		trigger2.setColumnName("column1");
		trigger2.setReferencingNames("new.column1");
		trigger2.setWhenClause("when (new.column1 = 'value1')");
		trigger2.setStatus("enabled");
		trigger2.setDescription("description2");
		trigger2.setActionType("pl/sql block");
		trigger2.setTriggerBody("begin\n\tnull;\nend;");
		
		assertTrue(trigger1.isIdentical(trigger2));
	}
	
	@Test
	void testIsIdentical_02() {
		DBTrigger trigger1 = new DBTrigger("trigger1", null);
		trigger1.setTriggerType("after statement");
		trigger1.setTriggeringEvent("insert or update or delete");
		trigger1.setTableOwner("owner");
		trigger1.setBaseObjectType("table");
		trigger1.setTableName("table1");
		trigger1.setColumnName("column1");
		trigger1.setReferencingNames("new.column1");
		trigger1.setWhenClause("when (new.column1 = 'value1')");
		trigger1.setStatus("enabled");
		trigger1.setDescription("description1");
		trigger1.setActionType("pl/sql block");
		trigger1.setTriggerBody("begin\n\tnull;\nend;");
		
		DBTrigger trigger2 = new DBTrigger("trigger1", null);
		trigger2.setTriggerType("after statement");
		trigger2.setTriggeringEvent("insert or update or delete");
		trigger2.setTableOwner("owner");
		trigger2.setBaseObjectType("table");
		trigger2.setTableName("table1");
		trigger2.setColumnName("column1");
		trigger2.setReferencingNames("new.column1");
		trigger2.setWhenClause("when (new.column1 = 'value1')");
		trigger2.setStatus("enabled");
		trigger2.setDescription("description1");
		trigger2.setActionType("pl/sql block");
		trigger2.setTriggerBody("begin\n\tnull;\nend;\n");
		
		assertTrue(trigger1.isIdentical(trigger2));
	}
	
	@Test
	void testIsIdentical_03() {
		DBTrigger trigger1 = new DBTrigger("trigger1", null);
		trigger1.setTriggerType("after statement");
		trigger1.setTriggeringEvent("insert or update or delete");
		trigger1.setTableOwner("owner");
		trigger1.setBaseObjectType("table");
		trigger1.setTableName("table1");
		trigger1.setColumnName("column1");
		trigger1.setReferencingNames("new.column1");
		trigger1.setWhenClause("when (new.column1 = 'value1')");
		trigger1.setStatus("enabled");
		trigger1.setDescription("description1");
		trigger1.setActionType("pl/sql block");
		trigger1.setTriggerBody("begin\n\tnull;\nend;");
		
		DBTrigger trigger2 = new DBTrigger("trigger1", null);
		trigger2.setTriggerType("after statement");
		trigger2.setTriggeringEvent("insert or update or delete");
		trigger2.setTableOwner("owner");
		trigger2.setBaseObjectType("table");
		trigger2.setTableName("table1");
		trigger2.setColumnName("column1");
		trigger2.setReferencingNames("new.column1");
		trigger2.setWhenClause("when (new.column1 = 'value1')");
		trigger2.setStatus("enabled");
		trigger2.setDescription("description1");
		trigger2.setActionType("pl/sql block");
		trigger2.setTriggerBody("begin\n\tnull;\nend;\n\n");
		
		assertTrue(trigger1.isIdentical(trigger2));
	}
	
	@Test
	void testIsIdentical_04() {
		DBTrigger trigger1 = new DBTrigger("trigger1", null);
		trigger1.setTriggerType("after statement");
		trigger1.setTriggeringEvent("insert or update or delete");
		trigger1.setTableOwner("owner");
		trigger1.setBaseObjectType("table");
		trigger1.setTableName("table1");
		trigger1.setColumnName("column1");
		trigger1.setReferencingNames("new.column1");
		trigger1.setWhenClause("when (new.column1 = 'value1')");
		trigger1.setStatus("enabled");
		trigger1.setDescription("description1");
		trigger1.setActionType("pl/sql block");
		trigger1.setTriggerBody("begin\n\tnull;\nend;");
		
		DBTrigger trigger2 = new DBTrigger("trigger1", null);
		trigger2.setTriggerType("after statement");
		trigger2.setTriggeringEvent("insert or update or delete");
		trigger2.setTableOwner("owner");
		trigger2.setBaseObjectType("table");
		trigger2.setTableName("table1");
		trigger2.setColumnName("column1");
		trigger2.setReferencingNames("new.column1");
		trigger2.setWhenClause("when (new.column1 = 'value1')");
		trigger2.setStatus("enabled");
		trigger2.setDescription("description1");
		trigger2.setActionType("pl/sql block");
		trigger2.setTriggerBody("begin\n\tnull;\nend;\n\n\n");
		
		assertTrue(trigger1.isIdentical(trigger2));
	}
	
	@Test
	void testIsIdentical_05() {
		DBTrigger trigger1 = new DBTrigger("trigger1", null);
		trigger1.setTriggerType("after statement");
		trigger1.setTriggeringEvent("insert or update or delete");
		trigger1.setTableOwner("owner");
		trigger1.setBaseObjectType("table");
		trigger1.setTableName("table1");
		trigger1.setColumnName("column1");
		trigger1.setReferencingNames("new.column1");
		trigger1.setWhenClause("when (new.column1 = 'value1')");
		trigger1.setStatus("enabled");
		trigger1.setDescription("description1");
		trigger1.setActionType("pl/sql block");
		trigger1.setTriggerBody("begin\n\tnull;\nend;");
		
		DBTrigger trigger2 = new DBTrigger("trigger1", null);
		