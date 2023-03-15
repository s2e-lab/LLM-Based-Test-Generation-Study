// DotFormatter_1Test.java
package net.sourceforge.schemaspy.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.Revision;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.util.Dot;
import net.sourceforge.schemaspy.util.LineWriter;
import net.sourceforge.schemaspy.view.DotNode.DotNodeConfig;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DotFormatter}.
* It contains ten unit test cases for the {@link DotFormatter#writeRealRelationships(Table, boolean, WriteStats, LineWriter)} method.
*/
class DotFormatter_1Test {

	/**
	 * Test case for {@link DotFormatter#writeRealRelationships(Table, boolean, WriteStats, LineWriter)}
	 * <p>
	 * Test case for the scenario when the table is null.
	 * Expected {@link NullPointerException}.
	 */
	@Test
	void testWriteRealRelationships_1() throws IOException {
		DotFormatter dotFormatter = DotFormatter.getInstance();
		Table table = null;
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats();
		LineWriter dot = new LineWriter("testWriteRealRelationships_1.dot");
		assertThrows(NullPointerException.class, () -> {
			dotFormatter.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);
		});
	}
	
	/**
	 * Test case for {@link DotFormatter#writeRealRelationships(Table, boolean, WriteStats, LineWriter)}
	 * <p>
	 * Test case for the scenario when the table is not null.
	 * Expected {@link NullPointerException}.
	 */
	@Test
	void testWriteRealRelationships_2() throws IOException {
		DotFormatter dotFormatter = DotFormatter.getInstance();
		Table table = new Table();
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats();
		LineWriter dot = new LineWriter("testWriteRealRelationships_2.dot");
		assertThrows(NullPointerException.class, () -> {
			dotFormatter.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);
		});
	}
	
	/**
	 * Test case for {@link DotFormatter#writeRealRelationships(Table, boolean, WriteStats, LineWriter)}
	 * <p>
	 * Test case for the scenario when the table is not null and the table has no columns.
	 * Expected {@link NullPointerException}.
	 */
	@Test
	void testWriteRealRelationships_3() throws IOException {
		DotFormatter dotFormatter = DotFormatter.getInstance();
		Table table = new Table();
		table.setColumns(new HashSet<TableColumn>());
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats();
		LineWriter dot = new LineWriter("testWriteRealRelationships_3.dot");
		assertThrows(NullPointerException.class, () -> {
			dotFormatter.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);
		});
	}
	
	/**
	 * Test case for {@link DotFormatter#writeRealRelationships(Table, boolean, WriteStats, LineWriter)}
	 * <p>
	 * Test case for the scenario when the table is not null and the table has columns.
	 * Expected {@link NullPointerException}.
	 */
	@Test
	void testWriteRealRelationships_4() throws IOException {
		DotFormatter dotFormatter = DotFormatter.getInstance();
		Table table = new Table();
		Set<TableColumn> columns = new HashSet<TableColumn>();
		columns.add(new TableColumn());
		table.setColumns(columns);
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats();
		LineWriter dot = new LineWriter("testWriteRealRelationships_4.dot");
		assertThrows(NullPointerException.class, () -> {
			dotFormatter.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);
		});
	}
	
	/**
	 * Test case for {@link DotFormatter#writeRealRelationships(Table, boolean, WriteStats, LineWriter)}
	 * <p>
	 * Test case for the scenario when the table is not null and the table has columns and the table has no database.
	 * Expected {@link NullPointerException}.
	 */
	@Test
	void testWriteRealRelationships_5() throws IOException {
		DotFormatter dotFormatter = DotFormatter.getInstance();
		Table table = new Table();
		Set<TableColumn> columns = new HashSet<TableColumn>();
		columns.add(new TableColumn());
		table.setColumns(columns);
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats();
		LineWriter dot = new LineWriter("testWriteRealRelationships_5.dot");
		assertThrows(NullPointerException.class, () -> {
			dotFormatter.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);
		});
	}
	
	/**
	 * Test case for {@link DotFormatter#writeRealRelationships(Table, boolean, WriteStats, LineWriter)}
	 * <p>
	 * Test case for the scenario when the table is not null and the table has columns and the table has database.
	 * Expected {@link NullPointerException}.
	 */
	@Test
	void testWriteRealRelationships_6() throws IOException {
		DotFormatter dotFormatter = DotFormatter.getInstance();
		Table table = new Table();
		Set<TableColumn> columns = new HashSet<TableColumn>();
		columns.add(new TableColumn());
		table.setColumns(columns);
		table.setDatabase(new Database());
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats();
		LineWriter dot = new LineWriter("testWriteRealRelationships_6.dot");
		assertThrows(NullPointerException.class, () -> {
			dotFormatter.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);
		});
	}
	
	/**
	 * Test case for {@link DotFormatter#writeRealRelationships(Table, boolean, WriteStats, LineWriter)}
	 * <p>
	 * Test case for the scenario when the table is not null and the table has columns and the table has database and the table has no remote tables.
	 * Expected {@link NullPointerException}.
	 */
	@Test
	void testWriteRealRelationships_7() throws IOException {
		DotFormatter dotFormatter = DotFormatter.getInstance();
		Table table = new Table();
		Set<TableColumn> columns = new HashSet<TableColumn>();
		columns.add(new TableColumn());
		table.setColumns(columns);
		Database database = new Database();
		database.setRemoteTables(new HashSet<Table>());
		table.setDatabase(database);
		boolean twoDegreesOfSeparation = false;
		WriteStats stats = new WriteStats();
		LineWriter dot = new LineWriter("testWriteRealRelationships_7.dot");
		assertThrows(NullPointerException.class, () -> {
			dotFormatter.writeRealRelationships(table, twoDegreesOfSeparation, stats, dot);
		});
	}
	
	/**
	 * Test case for {@link DotFormatter#writeRealRelationships(Table, boolean, WriteStats, LineWriter)}
	 * <p>
	 * Test case for the scenario when the table is not null and the table has columns and the table has database and the table has remote tables.
	 * Expected {@link NullPointerException}.
	 */
	@Test
	void testWriteRealRelationships_8() throws IOException {
		DotFormatter dotFormatter = DotFormatter.getInstance();
		Table table = new Table();
		Set<TableColumn> columns = new HashSet<TableColumn>();
		columns.add(new TableColumn());
		table.setColumns(columns);
		Database database = new Database();
		Set<Table> remoteTables = new HashSet<Table>();
		remoteTables.add(new Table());
		database.setRemoteTables(remoteT