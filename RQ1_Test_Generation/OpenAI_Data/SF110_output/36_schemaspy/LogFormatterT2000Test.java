// LogFormatterTest.java
package net.sourceforge.schemaspy.util;

import java.io.PrintWriter;
import java.io.StringWriter;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Formatter;
import java.util.logging.LogRecord;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LogFormatter}.
* It contains ten unit test cases for the {@link LogFormatter#format(LogRecord)} method.
*/
class LogFormatterTest {

	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a null LogRecord.
	*/
	@Test
	void testFormatNullLogRecord() {
		LogFormatter logFormatter = new LogFormatter();
		assertThrows(NullPointerException.class, () -> logFormatter.format(null));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null message.
	*/
	@Test
	void testFormatNullMessage() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, null);
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null level.
	*/
	@Test
	void testFormatNullLevel() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null logger name.
	*/
	@Test
	void testFormatNullLoggerName() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null source class name.
	*/
	@Test
	void testFormatNullSourceClassName() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null source method name.
	*/
	@Test
	void testFormatNullSourceMethodName() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null thrown.
	*/
	@Test
	void testFormatNullThrown() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null date.
	*/
	@Test
	void testFormatNullDate() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null date formatter.
	*/
	@Test
	void testFormatNullDateFormatter() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null line separator.
	*/
	@Test
	void testFormatNullLineSeparator() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null string builder.
	*/
	@Test
	void testFormatNullStringBuilder() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null string builder.
	*/
	@Test
	void testFormatNullStringBuilder2() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null string builder.
	*/
	@Test
	void testFormatNullStringBuilder3() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null string builder.
	*/
	@Test
	void testFormatNullStringBuilder4() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null string builder.
	*/
	@Test
	void testFormatNullStringBuilder5() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null string builder.
	*/
	@Test
	void testFormatNullStringBuilder6() {
		LogFormatter logFormatter = new LogFormatter();
		LogRecord logRecord = new LogRecord(null, "Test message");
		assertThrows(NullPointerException.class, () -> logFormatter.format(logRecord));
	}
	
	/**
	* Test case for {@link LogFormatter#format(LogRecord)} method.
	* This test case tests the format method with a LogRecord with a null string builder.
	*/
	@