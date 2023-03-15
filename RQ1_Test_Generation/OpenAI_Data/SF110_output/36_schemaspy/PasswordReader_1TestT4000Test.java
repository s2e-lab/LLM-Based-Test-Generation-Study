// PasswordReader_1Test.java
package net.sourceforge.schemaspy.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordReader}.
* It contains ten unit test cases for the {@link PasswordReader#readPassword(String, Object[])} method.
*/
class PasswordReader_1Test {

	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_1() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_2() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\r', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return and a line feed.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_3() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\r', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return and a line feed.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_4() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\r', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return and a line feed.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_5() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\r', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return and a line feed.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_6() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\r', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return and a line feed.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_7() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\r', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return and a line feed.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_8() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\r', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return and a line feed.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_9() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\r', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return and a line feed.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_10() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\r', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
}

// PasswordReader_2Test.java
package net.sourceforge.schemaspy.util;

import java.io.IOException;
import java.io.InputStream;
import java.io.PushbackInputStream;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordReader}.
* It contains ten unit test cases for the {@link PasswordReader#readPassword(String, Object[])} method.
*/
class PasswordReader_2Test {
		
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_1() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_2() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\r', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return and a line feed.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_3() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\r', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return and a line feed.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_4() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\r', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return and a line feed.
	 * @throws IOException
	 */
	@Test
	void testReadPassword_5() throws IOException {
		InputStream in = new InputStream() {
			private int[] bytes = {'a', 'b', 'c', '\r', '\n'};
			private int index = 0;
			@Override
			public int read() throws IOException {
				if (index &lt; bytes.length) {
					return bytes[index++];
				}
				return -1;
			}
		};
		System.setIn(in);
		char[] password = PasswordReader.getInstance().readPassword("Enter password: ");
		assertArrayEquals(new char[] {'a', 'b', 'c'}, password);
	}
	
	/**
	 * Test case for {@link PasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the user enters a password with a carriage return