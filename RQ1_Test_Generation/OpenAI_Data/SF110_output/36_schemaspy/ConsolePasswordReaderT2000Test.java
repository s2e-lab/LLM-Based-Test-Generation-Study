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
	 * Test case for {@link ConsolePasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the {@link ConsolePasswordReader#readPassword(String, Object[])} method is called with a null value for the fmt parameter.
	 * It expects an {@link IllegalArgumentException} to be thrown.
	 */
	@Test
	void testReadPasswordWithNullFmt() {
		ConsolePasswordReader consolePasswordReader = new ConsolePasswordReader();
		assertThrows(IllegalArgumentException.class, () -> {
			consolePasswordReader.readPassword(null);
		});
	}
	
	/**
	 * Test case for {@link ConsolePasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the {@link ConsolePasswordReader#readPassword(String, Object[])} method is called with a null value for the args parameter.
	 * It expects an {@link IllegalArgumentException} to be thrown.
	 */
	@Test
	void testReadPasswordWithNullArgs() {
		ConsolePasswordReader consolePasswordReader = new ConsolePasswordReader();
		assertThrows(IllegalArgumentException.class, () -> {
			consolePasswordReader.readPassword("%s", null);
		});
	}
	
	/**
	 * Test case for {@link ConsolePasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the {@link ConsolePasswordReader#readPassword(String, Object[])} method is called with a null value for the console parameter.
	 * It expects an {@link IllegalArgumentException} to be thrown.
	 */
	@Test
	void testReadPasswordWithNullConsole() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		ConsolePasswordReader consolePasswordReader = new ConsolePasswordReader();
		Method readPassword = consolePasswordReader.getClass().getDeclaredMethod("readPassword", String.class, Object[].class);
		readPassword.setAccessible(true);
		assertThrows(IllegalArgumentException.class, () -> {
			readPassword.invoke(consolePasswordReader, "%s", new Object[] { "test" });
		});
	}
	
	/**
	 * Test case for {@link ConsolePasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the {@link ConsolePasswordReader#readPassword(String, Object[])} method is called with a null value for the readPassword parameter.
	 * It expects an {@link IllegalArgumentException} to be thrown.
	 */
	@Test
	void testReadPasswordWithNullReadPassword() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		ConsolePasswordReader consolePasswordReader = new ConsolePasswordReader();
		Method readPassword = consolePasswordReader.getClass().getDeclaredMethod("readPassword", String.class, Object[].class);
		readPassword.setAccessible(true);
		assertThrows(IllegalArgumentException.class, () -> {
			readPassword.invoke(consolePasswordReader, "%s", new Object[] { "test" });
		});
	}
	
	/**
	 * Test case for {@link ConsolePasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the {@link ConsolePasswordReader#readPassword(String, Object[])} method is called with a null value for the paramTypes parameter.
	 * It expects an {@link IllegalArgumentException} to be thrown.
	 */
	@Test
	void testReadPasswordWithNullParamTypes() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		ConsolePasswordReader consolePasswordReader = new ConsolePasswordReader();
		Method readPassword = consolePasswordReader.getClass().getDeclaredMethod("readPassword", String.class, Object[].class);
		readPassword.setAccessible(true);
		assertThrows(IllegalArgumentException.class, () -> {
			readPassword.invoke(consolePasswordReader, "%s", new Object[] { "test" });
		});
	}
	
	/**
	 * Test case for {@link ConsolePasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the {@link ConsolePasswordReader#readPassword(String, Object[])} method is called with a null value for the consoleGetter parameter.
	 * It expects an {@link IllegalArgumentException} to be thrown.
	 */
	@Test
	void testReadPasswordWithNullConsoleGetter() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		ConsolePasswordReader consolePasswordReader = new ConsolePasswordReader();
		Method readPassword = consolePasswordReader.getClass().getDeclaredMethod("readPassword", String.class, Object[].class);
		readPassword.setAccessible(true);
		assertThrows(IllegalArgumentException.class, () -> {
			readPassword.invoke(consolePasswordReader, "%s", new Object[] { "test" });
		});
	}
	
	/**
	 * Test case for {@link ConsolePasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the {@link ConsolePasswordReader#readPassword(String, Object[])} method is called with a null value for the consoleGetter parameter.
	 * It expects an {@link IllegalArgumentException} to be thrown.
	 */
	@Test
	void testReadPasswordWithNullConsoleGetterParamTypes() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		ConsolePasswordReader consolePasswordReader = new ConsolePasswordReader();
		Method readPassword = consolePasswordReader.getClass().getDeclaredMethod("readPassword", String.class, Object[].class);
		readPassword.setAccessible(true);
		assertThrows(IllegalArgumentException.class, () -> {
			readPassword.invoke(consolePasswordReader, "%s", new Object[] { "test" });
		});
	}
	
	/**
	 * Test case for {@link ConsolePasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the {@link ConsolePasswordReader#readPassword(String, Object[])} method is called with a null value for the consoleGetter parameter.
	 * It expects an {@link IllegalArgumentException} to be thrown.
	 */
	@Test
	void testReadPasswordWithNullConsoleGetterParamTypesNull() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		ConsolePasswordReader consolePasswordReader = new ConsolePasswordReader();
		Method readPassword = consolePasswordReader.getClass().getDeclaredMethod("readPassword", String.class, Object[].class);
		readPassword.setAccessible(true);
		assertThrows(IllegalArgumentException.class, () -> {
			readPassword.invoke(consolePasswordReader, "%s", new Object[] { "test" });
		});
	}
	
	/**
	 * Test case for {@link ConsolePasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the {@link ConsolePasswordReader#readPassword(String, Object[])} method is called with a null value for the consoleGetter parameter.
	 * It expects an {@link IllegalArgumentException} to be thrown.
	 */
	@Test
	void testReadPasswordWithNullConsoleGetterParamTypesNullNull() throws SecurityException, NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException {
		ConsolePasswordReader consolePasswordReader = new ConsolePasswordReader();
		Method readPassword = consolePasswordReader.getClass().getDeclaredMethod("readPassword", String.class, Object[].class);
		readPassword.setAccessible(true);
		assertThrows(IllegalArgumentException.class, () -> {
			readPassword.invoke(consolePasswordReader, "%s", new Object[] { "test" });
		});
	}
	
	/**
	 * Test case for {@link ConsolePasswordReader#readPassword(String, Object[])} method.
	 * It tests the case when the {@link Console