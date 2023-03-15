// AdvancedSettingsTest.java
package org.quickserver.util.xmlreader;

import java.nio.charset.UnsupportedCharsetException;
import java.nio.charset.Charset;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AdvancedSettings}.
* It contains ten unit test cases for the {@link AdvancedSettings#toXML(String)} method.
*/
class AdvancedSettingsTest {

	@Test
	void testToXML() {
		AdvancedSettings advancedSettings = new AdvancedSettings();
		assertEquals("<advanced-settings>\n" +
				"\t<charset>ISO-8859-1</charset>\n" +
				"\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n" +
				"\t<byte-buffer-size>65536</byte-buffer-size>\n" +
				"\t<backlog>0</backlog>\n" +
				"\t<socket-linger>-1</socket-linger>\n" +
				"\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n" +
				"\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n" +
				"\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n" +
				"\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n" +
				"\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n" +
				"\t<performance-preferences-latency>0</performance-preferences-latency>\n" +
				"\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n" +
				"\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n" +
				"</advanced-settings>\n", advancedSettings.toXML(null));
	}
	
	@Test
	void testToXML_charset() {
		AdvancedSettings advancedSettings = new AdvancedSettings();
		advancedSettings.setCharset("UTF-8");
		assertEquals("<advanced-settings>\n" +
				"\t<charset>UTF-8</charset>\n" +
				"\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n" +
				"\t<byte-buffer-size>65536</byte-buffer-size>\n" +
				"\t<backlog>0</backlog>\n" +
				"\t<socket-linger>-1</socket-linger>\n" +
				"\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n" +
				"\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n" +
				"\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n" +
				"\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n" +
				"\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n" +
				"\t<performance-preferences-latency>0</performance-preferences-latency>\n" +
				"\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n" +
				"\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n" +
				"</advanced-settings>\n", advancedSettings.toXML(null));
	}
	
	@Test
	void testToXML_charset_exception() {
		AdvancedSettings advancedSettings = new AdvancedSettings();
		assertThrows(UnsupportedCharsetException.class, () -> {
			advancedSettings.setCharset("UTF-9");
		});
	}
	
	@Test
	void testToXML_byteBufferSize() {
		AdvancedSettings advancedSettings = new AdvancedSettings();
		advancedSettings.setByteBufferSize(1024);
		assertEquals("<advanced-settings>\n" +
				"\t<charset>ISO-8859-1</charset>\n" +
				"\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n" +
				"\t<byte-buffer-size>1024</byte-buffer-size>\n" +
				"\t<backlog>0</backlog>\n" +
				"\t<socket-linger>-1</socket-linger>\n" +
				"\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n" +
				"\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n" +
				"\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n" +
				"\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n" +
				"\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n" +
				"\t<performance-preferences-latency>0</performance-preferences-latency>\n" +
				"\t<performance-preferences-bandwidth>0</performance-preferences-bandwidth>\n" +
				"\t<client-socket-tcp-no-delay>false</client-socket-tcp-no-delay>\n" +
				"</advanced-settings>\n", advancedSettings.toXML(null));
	}
	
	@Test
	void testToXML_byteBufferSize_negative() {
		AdvancedSettings advancedSettings = new AdvancedSettings();
		advancedSettings.setByteBufferSize(-1);
		assertEquals("<advanced-settings>\n" +
				"\t<charset>ISO-8859-1</charset>\n" +
				"\t<use-direct-byte-buffer>true</use-direct-byte-buffer>\n" +
				"\t<byte-buffer-size>65536</byte-buffer-size>\n" +
				"\t<backlog>0</backlog>\n" +
				"\t<socket-linger>-1</socket-linger>\n" +
				"\t<debug-non-blocking-mode>false</debug-non-blocking-mode>\n" +
				"\t<client-identifier>org.quickserver.net.server.impl.OptimisticClientIdentifier</client-identifier>\n" +
				"\t<qsobject-pool-maker>org.quickserver.util.pool.MakeQSObjectPool</qsobject-pool-maker>\n" +
				"\t<max-threads-for-nio-write>10</max-threads-for-nio-write>\n" +
				"\t<performance-preferences-connection-time>0</performance-preferences-connection-time>\n" +
