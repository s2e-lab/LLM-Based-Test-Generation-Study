// HtmlAnomaliesPageTest.java
package net.sourceforge.schemaspy.view;

import java.io.IOException;
import java.text.NumberFormat;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import net.sourceforge.schemaspy.DbAnalyzer;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.util.LineWriter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlAnomaliesPage}.
* It contains ten unit test cases for the {@link HtmlAnomaliesPage#getInstance()} method.
*/
class HtmlAnomaliesPageTest {

	/**
	* Test case for {@link HtmlAnomaliesPage#getInstance()} method.
	* This test case checks if the method returns the same instance of the class.
	*/
	@Test
	void testGetInstance() {
		HtmlAnomaliesPage instance1 = HtmlAnomaliesPage.getInstance();
		HtmlAnomaliesPage instance2 = HtmlAnomaliesPage.getInstance();
		assertSame(instance1, instance2);
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link LineWriter} is null.
	*/
	@Test
	void testWriteWithNullLineWriter() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, null));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Database} is null.
	*/
	@Test
	void testWriteWithNullDatabase() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Collection} is null.
	*/
	@Test
	void testWriteWithNullCollection() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link List} is null.
	*/
	@Test
	void testWriteWithNullList() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), new HashSet<Table>(), null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link LineWriter} is null.
	*/
	@Test
	void testWriteWithNullLineWriter2() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, null));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Database} is null.
	*/
	@Test
	void testWriteWithNullDatabase2() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Collection} is null.
	*/
	@Test
	void testWriteWithNullCollection2() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link List} is null.
	*/
	@Test
	void testWriteWithNullList2() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), new HashSet<Table>(), null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link LineWriter} is null.
	*/
	@Test
	void testWriteWithNullLineWriter3() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, null));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Database} is null.
	*/
	@Test
	void testWriteWithNullDatabase3() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Collection} is null.
	*/
	@Test
	void testWriteWithNullCollection3() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link List} is null.
	*/
	@Test
	void testWriteWithNullList3() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), new HashSet<Table>(), null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link LineWriter} is null.
	*/
	@Test
	void testWriteWithNullLineWriter4() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, null));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Database} is null.
	*/
	@Test
	void testWriteWithNullDatabase4() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Collection} is null.
	*/
	@Test
	void testWriteWithNullCollection4() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link List} is null.
	*/
	@Test
	void testWriteWithNullList4() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), new HashSet<Table>(), null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link LineWriter} is null.
	*/
	@Test
	void testWriteWithNullLineWriter5() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, null));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Database} is null.
	*/
	@Test
	void testWriteWithNullDatabase5() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Collection} is null.
	*/
	@Test
	void testWriteWithNullCollection5() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link List} is null.
	*/
	@Test
	void testWriteWithNullList5() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), new HashSet<Table>(), null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link LineWriter} is null.
	*/
	@Test
	void testWriteWithNullLineWriter6() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, null));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Database} is null.
	*/
	@Test
	void testWriteWithNullDatabase6() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Collection} is null.
	*/
	@Test
	void testWriteWithNullCollection6() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link List} is null.
	*/
	@Test
	void testWriteWithNullList6() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), new HashSet<Table>(), null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link LineWriter} is null.
	*/
	@Test
	void testWriteWithNullLineWriter7() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, null));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Database} is null.
	*/
	@Test
	void testWriteWithNullDatabase7() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(null, null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link Collection} is null.
	*/
	@Test
	void testWriteWithNullCollection7() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), null, null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link List} is null.
	*/
	@Test
	void testWriteWithNullList7() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(new Database(), new HashSet<Table>(), null, new LineWriter()));
	}
	
	/**
	* Test case for {@link HtmlAnomaliesPage#write(Database, Collection, List, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link LineWriter} is null.
	*/
	@Test
	void testWriteWithNullLineWriter8() {
		HtmlAnomaliesPage instance = HtmlAnomaliesPage.getInstance();
		assertThrows(IOException.class, () -> instance.write(