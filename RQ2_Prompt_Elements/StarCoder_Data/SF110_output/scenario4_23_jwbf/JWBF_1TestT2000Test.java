// JWBF_1Test.java
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
* It contains ten unit test cases for the {@link JWBF#getPartId(Class)} method.
*/
class JWBF_1Test {

    /**
    * Test method for {@link JWBF#getPartId(Class)}.
    */
    @Test
    void testGetPartId() {
        assertEquals("core", JWBF.getPartId(JWBF.class));
        assertEquals("core", JWBF.getPartId(JWBF_1Test.class));
        assertEquals("core", JWBF.getPartId(JWBF_2Test.class));
        assertEquals("core", JWBF.getPartId(JWBF_3Test.class));
        assertEquals("core", JWBF.getPartId(JWBF_4Test.class));
        assertEquals("core", JWBF.getPartId(JWBF_5Test.class));
        assertEquals("core", JWBF.getPartId(JWBF_6Test.class));
        assertEquals("core", JWBF.getPartId(JWBF_7Test.class));
        assertEquals("core", JWBF.getPartId(JWBF_8Test.class));
        assertEquals("core", JWBF.getPartId(JWBF_9Test.class));
        assertEquals("core", JWBF.getPartId(JWBF_10Test.class));
    }
}

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
* It contains ten unit test cases for the {@link JWBF#getVersion(Class)} method.
*/
class JWBF_2Test {
		
    /**
    * Test method for {@link JWBF#getVersion(Class)}.
    */
    @Test
    void testGetVersion() {
        assertEquals("1.0.0", JWBF.getVersion(JWBF.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_1Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_2Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_3Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_4Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_5Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_6Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_7Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_8Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_9Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_10Test.class));
    }
}

// JWBF_3Test.java
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
* It contains ten unit test cases for the {@link JWBF#getVersion(Class)} method.
*/
class JWBF_3Test {
		
    /**
    * Test method for {@link JWBF#getVersion(Class)}.
    */
    @Test
    void testGetVersion() {
        assertEquals("1.0.0", JWBF.getVersion(JWBF.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_1Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_2Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_3Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_4Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_5Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_6Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_7Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_8Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_9Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_10Test.class));
    }
}

// JWBF_4Test.java
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
* It contains ten unit test cases for the {@link JWBF#getVersion(Class)} method.
*/
class JWBF_4Test {
		
    /**
    * Test method for {@link JWBF#getVersion(Class)}.
    */
    @Test
    void testGetVersion() {
        assertEquals("1.0.0", JWBF.getVersion(JWBF.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_1Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_2Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_3Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_4Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_5Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_6Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_7Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_8Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_9Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_10Test.class));
    }
}

// JWBF_5Test.java
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
* It contains ten unit test cases for the {@link JWBF#getVersion(Class)} method.
*/
class JWBF_5Test {
		
    /**
    * Test method for {@link JWBF#getVersion(Class)}.
    */
    @Test
    void testGetVersion() {
        assertEquals("1.0.0", JWBF.getVersion(JWBF.class));
        assertEquals("1.0.0", JWBF.getVersion(JWBF_1Test.class));
        assertEquals("1.0.0", JWBF.getVersion(JW