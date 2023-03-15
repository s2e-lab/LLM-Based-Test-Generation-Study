// HtmlMultipleSchemasIndexPageTest.java
package net.sourceforge.schemaspy.view;

import java.io.IOException;
import java.sql.DatabaseMetaData;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.util.LineWriter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlMultipleSchemasIndexPage}.
* It contains ten unit test cases for the {@link HtmlMultipleSchemasIndexPage#getInstance()} method.
*/
class HtmlMultipleSchemasIndexPageTest {

	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#getInstance()} method.
	* This test case checks if the method returns an instance of the {@link HtmlMultipleSchemasIndexPage} class.
	*/
	@Test
	void testGetInstance() {
		assertTrue(HtmlMultipleSchemasIndexPage.getInstance() instanceof HtmlMultipleSchemasIndexPage);
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link LineWriter} is null.
	*/
	@Test
	void testWriteWithNullLineWriter() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("dbName", null, null, null);
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link List} is null.
	*/
	@Test
	void testWriteWithNullList() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("dbName", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					// do nothing
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link List} is empty.
	*/
	@Test
	void testWriteWithEmptyList() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("dbName", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					// do nothing
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link DatabaseMetaData} is null.
	*/
	@Test
	void testWriteWithNullDatabaseMetaData() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("dbName", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					// do nothing
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link DatabaseMetaData} is null.
	*/
	@Test
	void testWriteWithNullDatabaseMetaData2() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("dbName", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					// do nothing
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link DatabaseMetaData} is null.
	*/
	@Test
	void testWriteWithNullDatabaseMetaData3() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("dbName", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					// do nothing
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link DatabaseMetaData} is null.
	*/
	@Test
	void testWriteWithNullDatabaseMetaData4() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("dbName", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					// do nothing
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link DatabaseMetaData} is null.
	*/
	@Test
	void testWriteWithNullDatabaseMetaData5() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("dbName", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					// do nothing
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link DatabaseMetaData} is null.
	*/
	@Test
	void testWriteWithNullDatabaseMetaData6() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("dbName", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					// do nothing
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link DatabaseMetaData} is null.
	*/
	@Test
	void testWriteWithNullDatabaseMetaData7() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("dbName", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					// do nothing
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link DatabaseMetaData} is null.
	*/
	@Test
	void testWriteWithNullDatabaseMetaData8() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("dbName", null, null, new LineWriter() {
				@Override
			