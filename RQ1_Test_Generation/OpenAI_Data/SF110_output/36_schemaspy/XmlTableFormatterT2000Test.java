// XmlTableFormatterTest.java
package net.sourceforge.schemaspy.view;

import java.util.Collection;
import java.util.Comparator;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import java.util.regex.Pattern;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.model.TableIndex;
import net.sourceforge.schemaspy.util.DOMUtil;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link XmlTableFormatter}.
* It contains ten unit test cases for the {@link XmlTableFormatter#getInstance()} method.
*/
class XmlTableFormatterTest {

	/**
	 * Test case for {@link XmlTableFormatter#getInstance()}
	 * 
	 * @see XmlTableFormatter#getInstance()
	 */
	@Test
	void testGetInstance() {
		XmlTableFormatter result = XmlTableFormatter.getInstance();
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link XmlTableFormatter#appendTables(Element, Collection)}
	 * 
	 * @see XmlTableFormatter#appendTables(Element, Collection)
	 */
	@Test
	void testAppendTables() {
		Element schemaNode = null;
		Collection<Table> tables = null;
		XmlTableFormatter.getInstance().appendTables(schemaNode, tables);
	}
	
	/**
	 * Test case for {@link XmlTableFormatter#appendTable(Element, Table)}
	 * 
	 * @see XmlTableFormatter#appendTable(Element, Table)
	 */
	@Test
	void testAppendTable() {
		Element tablesNode = null;
		Table table = null;
		XmlTableFormatter.getInstance().appendTable(tablesNode, table);
	}
	
	/**
	 * Test case for {@link XmlTableFormatter#appendColumns(Element, Table)}
	 * 
	 * @see XmlTableFormatter#appendColumns(Element, Table)
	 */
	@Test
	void testAppendColumns() {
		Element tableNode = null;
		Table table = null;
		XmlTableFormatter.getInstance().appendColumns(tableNode, table);
	}
	
	/**
	 * Test case for {@link XmlTableFormatter#appendColumn(Node, TableColumn)}
	 * 
	 * @see XmlTableFormatter#appendColumn(Node, TableColumn)
	 */
	@Test
	void testAppendColumn() {
		Node tableNode = null;
		TableColumn column = null;
		Node result = XmlTableFormatter.getInstance().appendColumn(tableNode, column);
		assertNotNull(result);
	}
	
	/**
	 * Test case for {@link XmlTableFormatter#appendPrimaryKeys(Element, Table)}
	 * 
	 * @see XmlTableFormatter#appendPrimaryKeys(Element, Table)
	 */
	@Test
	void testAppendPrimaryKeys() {
		Element tableNode = null;
		Table table = null;
		XmlTableFormatter.getInstance().appendPrimaryKeys(tableNode, table);
	}
	
	/**
	 * Test case for {@link XmlTableFormatter#appendCheckConstraints(Element, Table)}
	 * 
	 * @see XmlTableFormatter#appendCheckConstraints(Element, Table)
	 */
	@Test
	void testAppendCheckConstraints() {
		Element tableNode = null;
		Table table = null;
		XmlTableFormatter.getInstance().appendCheckConstraints(tableNode, table);
	}
	
	/**
	 * Test case for {@link XmlTableFormatter#appendIndexes(Node, Table)}
	 * 
	 * @see XmlTableFormatter#appendIndexes(Node, Table)
	 */
	@Test
	void testAppendIndexes() {
		Node tableNode = null;
		Table table = null;
		XmlTableFormatter.getInstance().appendIndexes(tableNode, table);
	}
	
	/**
	 * Test case for {@link XmlTableFormatter#appendView(Element, Table)}
	 * 
	 * @see XmlTableFormatter#appendView(Element, Table)
	 */
	@Test
	void testAppendView() {
		Element tableNode = null;
		Table table = null;
		XmlTableFormatter.getInstance().appendView(tableNode, table);
	}
	
	/**
	 * Test case for {@link XmlTableFormatter#isBinary(String)}
	 * 
	 * @see XmlTableFormatter#isBinary(String)
	 */
	@Test
	void testIsBinary() {
		String str = "";
		boolean result = XmlTableFormatter.isBinary(str);
		assertFalse(result);
	}
	
	/**
	 * Test case for {@link XmlTableFormatter#asBinary(String)}
	 * 
	 * @see XmlTableFormatter#asBinary(String)
	 */
	@Test
	void testAsBinary() {
		String str = "";
		String result = XmlTableFormatter.getInstance().asBinary(str);
		assertNotNull(result);
	}
}