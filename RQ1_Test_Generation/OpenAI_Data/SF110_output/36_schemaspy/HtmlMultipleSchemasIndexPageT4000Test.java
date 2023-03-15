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
					throw new IOException();
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
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is null.
	*/
	@Test
	void testWriteWithNullString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write(null, null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is empty.
	*/
	@Test
	void testWriteWithEmptyString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is blank.
	*/
	@Test
	void testWriteWithBlankString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write(" ", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a tab.
	*/
	@Test
	void testWriteWithTabString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\t", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a new line.
	*/
	@Test
	void testWriteWithNewLineString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\n", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a carriage return.
	*/
	@Test
	void testWriteWithCarriageReturnString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\r", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a form feed.
	*/
	@Test
	void testWriteWithFormFeedString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\f", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a carriage return new line.
	*/
	@Test
	void testWriteWithCarriageReturnNewLineString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\r\n", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a next line.
	*/
	@Test
	void testWriteWithNextLineString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\u0085", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a next line.
	*/
	@Test
	void testWriteWithLineSeparatorString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\u2028", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a paragraph separator.
	*/
	@Test
	void testWriteWithParagraphSeparatorString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\u2029", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a space.
	*/
	@Test
	void testWriteWithSpaceString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write(" ", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a non-breaking space.
	*/
	@Test
	void testWriteWithNonBreakingSpaceString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\u00A0", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a non-breaking space.
	*/
	@Test
	void testWriteWithOghamSpaceMarkString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\u1680", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a non-breaking space.
	*/
	@Test
	void testWriteWithEnQuadString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\u2000", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a non-breaking space.
	*/
	@Test
	void testWriteWithEmQuadString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\u2001", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a non-breaking space.
	*/
	@Test
	void testWriteWithEnSpaceString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\u2002", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a non-breaking space.
	*/
	@Test
	void testWriteWithEmSpaceString() {
		assertThrows(IOException.class, () -> {
			HtmlMultipleSchemasIndexPage.getInstance().write("\u2003", null, null, new LineWriter() {
				@Override
				public void writeln(String line) throws IOException {
					throw new IOException();
				}
			});
		});
	}
	
	/**
	* Test case for {@link HtmlMultipleSchemasIndexPage#write(String, List, DatabaseMetaData, LineWriter)} method.
	* This test case checks if the method throws an {@link IOException} when the {@link String} is a non-breaking space.
	*/
	@Test
	void testWriteWithThreePerEmSpaceString() {
		assertThrows(IOException.class, () ->