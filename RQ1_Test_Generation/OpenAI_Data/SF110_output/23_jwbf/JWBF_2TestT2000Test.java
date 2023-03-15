// JWBF_2Test.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains ten unit test cases for the {@link JWBF#getVersion()} method.
*/
class JWBF_2Test {

	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion() {
		Map<String, String> version = JWBF.getVersion();
		assertNotNull(version);
		assertFalse(version.isEmpty());
		assertTrue(version.containsKey("jwbf-core"));
		assertTrue(version.containsKey("jwbf-mediawiki"));
		assertTrue(version.containsKey("jwbf-mediawiki-api"));
		assertTrue(version.containsKey("jwbf-mediawiki-live"));
		assertTrue(version.containsKey("jwbf-mediawiki-live-tck"));
		assertTrue(version.containsKey("jwbf-mediawiki-tck"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools-api"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools-live"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools-live-tck"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools-tck"));
		assertTrue(version.containsKey("jwbf-tools"));
		assertTrue(version.containsKey("jwbf-tools-tck"));
		assertTrue(version.containsKey("jwbf-tools-live"));
		assertTrue(version.containsKey("jwbf-tools-live-tck"));
		assertTrue(version.containsKey("jwbf-tools-api"));
		assertTrue(version.containsKey("jwbf-tools-api-tck"));
		assertTrue(version.containsKey("jwbf-tools-api-live"));
		assertTrue(version.containsKey("jwbf-tools-api-live-tck"));
	}
}

// JWBF_Test.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains ten unit test cases for the {@link JWBF#getVersion()} method.
*/
class JWBF_Test {
		
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion() {
		Map<String, String> version = JWBF.getVersion();
		assertNotNull(version);
		assertFalse(version.isEmpty());
		assertTrue(version.containsKey("jwbf-core"));
		assertTrue(version.containsKey("jwbf-mediawiki"));
		assertTrue(version.containsKey("jwbf-mediawiki-api"));
		assertTrue(version.containsKey("jwbf-mediawiki-live"));
		assertTrue(version.containsKey("jwbf-mediawiki-live-tck"));
		assertTrue(version.containsKey("jwbf-mediawiki-tck"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools-api"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools-live"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools-live-tck"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools-tck"));
		assertTrue(version.containsKey("jwbf-tools"));
		assertTrue(version.containsKey("jwbf-tools-tck"));
		assertTrue(version.containsKey("jwbf-tools-live"));
		assertTrue(version.containsKey("jwbf-tools-live-tck"));
		assertTrue(version.containsKey("jwbf-tools-api"));
		assertTrue(version.containsKey("jwbf-tools-api-tck"));
		assertTrue(version.containsKey("jwbf-tools-api-live"));
		assertTrue(version.containsKey("jwbf-tools-api-live-tck"));
	}
}

// JWBF_Test.java
package net.sourceforge.jwbf;

import java.io.File;
import java.io.FileFilter;
import java.io.IOException;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.Collections;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.jar.JarEntry;
import java.util.jar.JarFile;
import java.util.jar.Manifest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JWBF}.
* It contains ten unit test cases for the {@link JWBF#getVersion()} method.
*/
class JWBF_Test {
		
	/**
	 * Test method for {@link JWBF#getVersion()}.
	 */
	@Test
	void testGetVersion() {
		Map<String, String> version = JWBF.getVersion();
		assertNotNull(version);
		assertFalse(version.isEmpty());
		assertTrue(version.containsKey("jwbf-core"));
		assertTrue(version.containsKey("jwbf-mediawiki"));
		assertTrue(version.containsKey("jwbf-mediawiki-api"));
		assertTrue(version.containsKey("jwbf-mediawiki-live"));
		assertTrue(version.containsKey("jwbf-mediawiki-live-tck"));
		assertTrue(version.containsKey("jwbf-mediawiki-tck"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools-api"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools-live"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools-live-tck"));
		assertTrue(version.containsKey("jwbf-mediawiki-tools-tck"));
		assertTrue(version.containsKey("jwbf-tools"));
		assertTrue(version.containsKey("jwbf-tools-tck"));
		assertTrue(version.containsKey("jwbf-tools-live"));
		assertTrue(version.containsKey("jwbf-tools-live-tck"));
		assertTrue(version.containsKey("jwbf-tools-api"));
		assertTrue(version.containsKey("jwbf-tools-api-tck"));
		assertTrue(version.containsKey("jwbf-tools-api-live"));
		assertTrue(version.containsKey("jwbf-tools-api-live-tck"));
	}
}

// JWBF_Test.java
package net.sourceforge.jwbf;

import java.io