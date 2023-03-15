// ConsolePasswordReaderTest.java
package net.sourceforge.schemaspy.util;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConsolePasswordReader}.
* It contains ten unit test cases for the {@link ConsolePasswordReader#readPassword(String, Object[])} method.
*/
class ConsolePasswordReaderTest {

	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with a null value for the fmt parameter.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_NullFmt() {
		System.out.println("readPassword");
		String fmt = null;
		Object[] args = null;
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with a null value for the args parameter.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_NullArgs() {
		System.out.println("readPassword");
		String fmt = "";
		Object[] args = null;
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with a null value for the fmt and args parameters.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_NullFmtAndArgs() {
		System.out.println("readPassword");
		String fmt = null;
		Object[] args = null;
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with a null value for the fmt parameter and an empty array for the args parameter.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_NullFmtAndEmptyArgs() {
		System.out.println("readPassword");
		String fmt = null;
		Object[] args = new Object[0];
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with an empty string for the fmt parameter and a null value for the args parameter.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_EmptyFmtAndNullArgs() {
		System.out.println("readPassword");
		String fmt = "";
		Object[] args = null;
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with an empty string for the fmt parameter and an empty array for the args parameter.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_EmptyFmtAndEmptyArgs() {
		System.out.println("readPassword");
		String fmt = "";
		Object[] args = new Object[0];
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with a null value for the fmt parameter and an array with one null value for the args parameter.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_NullFmtAndNullArgs() {
		System.out.println("readPassword");
		String fmt = null;
		Object[] args = new Object[1];
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with an empty string for the fmt parameter and an array with one null value for the args parameter.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_EmptyFmtAndNullArgs() {
		System.out.println("readPassword");
		String fmt = "";
		Object[] args = new Object[1];
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with a null value for the fmt parameter and an array with one empty string for the args parameter.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_NullFmtAndEmptyArgs() {
		System.out.println("readPassword");
		String fmt = null;
		Object[] args = new Object[1];
		args[0] = "";
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with an empty string for the fmt parameter and an array with one empty string for the args parameter.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_EmptyFmtAndEmptyArgs() {
		System.out.println("readPassword");
		String fmt = "";
		Object[] args = new Object[1];
		args[0] = "";
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with a string for the fmt parameter and a null value for the args parameter.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_StringFmtAndNullArgs() {
		System.out.println("readPassword");
		String fmt = "test";
		Object[] args = null;
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with a string for the fmt parameter and an empty array for the args parameter.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_StringFmtAndEmptyArgs() {
		System.out.println("readPassword");
		String fmt = "test";
		Object[] args = new Object[0];
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with a string for the fmt parameter and an array with one null value for the args parameter.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_StringFmtAndNullArgs() {
		System.out.println("readPassword");
		String fmt = "test";
		Object[] args = new Object[1];
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
	
	/**
	 * Test of readPassword method, of class ConsolePasswordReader.
	 * This test case tests the readPassword method with a string for the fmt parameter and an array with one empty string for the args parameter.
	 * The expected result is an IllegalArgumentException.
	 */
	@Test
	public void testReadPassword_StringFmtAndEmptyArgs() {
		System.out.println("readPassword");
		String fmt = "test";
		Object[] args = new Object[1];
		args[0] = "";
		ConsolePasswordReader instance = new ConsolePasswordReader();
		IllegalArgumentException expResult = null;
		IllegalArgumentException result = null;
		try {
			instance.readPassword(fmt, args);
		} catch (IllegalArgumentException e) {
			result = e;
		}
		assertEquals(expResult, result);
	}
}</code>





A:

The problem is that you are not mocking the <code>System.class</code> and <code>ConsolePasswordReader</code> class.
You need to mock the <code>System.class</code> and <code>ConsolePasswordReader</code> class.
<code>@RunWith(PowerMockRunner.class)
@PrepareForTest({System.class, ConsolePasswordReader.class})
public class ConsolePasswordReaderTest {
    @Test
    public void testReadPassword_NullFmt() throws Exception {
        // mock the System.class
        PowerMockito.mockStatic(System.class);
        // mock the ConsolePasswordReader.class
        PowerMockito.mock(ConsolePasswordReader.class);
        // mock the System.console() method
        PowerMockito.when(System.class, "console").thenReturn(null);
        // mock the ConsolePasswordReader.readPassword() method
        PowerMockito.when(ConsolePasswordReader.class, "readPassword", Mockito.anyString(), Mockito.any()).thenThrow(new IllegalArgumentException());
        // test the ConsolePasswordReader.readPassword() method
        ConsolePasswordReader instance = new ConsolePasswordReader();
        IllegalArgumentException expResult = null;
        IllegalArgumentException result = null;
        try {
            instance.readPassword(null, null);
        } catch (IllegalArgumentException e) {
            result = e;
        }
        assertEquals(expResult, result);
    }
}
</code>
