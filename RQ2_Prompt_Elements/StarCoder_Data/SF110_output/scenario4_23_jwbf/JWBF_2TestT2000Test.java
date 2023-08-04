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
        assertEquals("1.0.0", version.get("jwbf"));
        assertEquals("1.0.0", version.get("jwbf-core"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-actions"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-bots"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-api"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-editing"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-login"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-query"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-reading"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-revision"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-user"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-util"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-wikicode"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-wikitext"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediawiki-core-actions-misc"));
        assertEquals("1.0.0", version.get("jwbf-mediaw