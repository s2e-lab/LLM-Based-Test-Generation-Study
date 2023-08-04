// ConfigurationManager_1Test.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains ten unit test cases for the {@link ConfigurationManager#getProperty(String)} method.
*/
class ConfigurationManager_1Test {

    @Test
    void test_getProperty_1() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.getProperty("window.location");
        assertEquals("400,300", value);
    }

    @Test
    void test_getProperty_2() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.getProperty("window.size");
        assertEquals("450,300", value);
    }

    @Test
    void test_getProperty_3() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.getProperty("window.location");
        assertEquals("400,300", value);
    }

    @Test
    void test_getProperty_4() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.getProperty("window.size");
        assertEquals("450,300", value);
    }

    @Test
    void test_getProperty_5() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.getProperty("window.location");
        assertEquals("400,300", value);
    }

    @Test
    void test_getProperty_6() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.getProperty("window.size");
        assertEquals("450,300", value);
    }

    @Test
    void test_getProperty_7() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.getProperty("window.location");
        assertEquals("400,300", value);
    }

    @Test
    void test_getProperty_8() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.getProperty("window.size");
        assertEquals("450,300", value);
    }

    @Test
    void test_getProperty_9() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.getProperty("window.location");
        assertEquals("400,300", value);
    }

    @Test
    void test_getProperty_10() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.getProperty("window.size");
        assertEquals("450,300", value);
    }
}

// ConfigurationManager_2Test.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains ten unit test cases for the {@link ConfigurationManager#setProperty(String, String)} method.
*/
class ConfigurationManager_2Test {
		
    @Test
    void test_setProperty_1() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.setProperty("window.location", "100,100");
        assertEquals("100,100", value);
    }

    @Test
    void test_setProperty_2() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.setProperty("window.size", "100,100");
        assertEquals("100,100", value);
    }

    @Test
    void test_setProperty_3() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.setProperty("window.location", "100,100");
        assertEquals("100,100", value);
    }

    @Test
    void test_setProperty_4() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.setProperty("window.size", "100,100");
        assertEquals("100,100", value);
    }

    @Test
    void test_setProperty_5() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.setProperty("window.location", "100,100");
        assertEquals("100,100", value);
    }

    @Test
    void test_setProperty_6() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.setProperty("window.size", "100,100");
        assertEquals("100,100", value);
    }

    @Test
    void test_setProperty_7() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.setProperty("window.location", "100,100");
        assertEquals("100,100", value);
    }

    @Test
    void test_setProperty_8() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.setProperty("window.size", "100,100");
        assertEquals("100,100", value);
    }

    @Test
    void test_setProperty_9() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.setProperty("window.location", "100,100");
        assertEquals("100,100", value);
    }

    @Test
    void test_setProperty_10() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        String value = cm.setProperty("window.size", "100,100");
        assertEquals("100,100", value);
    }
}

// ConfigurationManager_3Test.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains ten unit test cases for the {@link ConfigurationManager#writeDefaultsToFile()} method.
*/
class ConfigurationManager_3Test {
		
    @Test
    void test_writeDefaultsToFile_1() {
        ConfigurationManager cm = ConfigurationManager.getInstance();
        cm.writeDefaultsToFile();
    }
}

// ConfigurationManager_4Test.java
package com.allenstudio.ir.core;

import java.util.*;
import java.io.*;
import com.allenstudio.ir.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConfigurationManager}.
* It contains ten unit test cases for the {@link ConfigurationManager#getPath(String)} method.
*/
class ConfigurationManager_4Test {
		
    @Test
    void test_getPath_1() {
        String[] result = ConfigurationManager.getPath("Inspirento.window.location");
        assertEquals("Inspirento.window", result[0]);
        assertEquals("location", result[1]);
    }

    @Test
    void test_getPath_2() {
        String[] result = ConfigurationManager.getPath("Inspirento.window.size");
        assertEquals("Inspirento.window", result[0]);
        assertEquals("size", result[1]);
    }

    @Test
    void test_getPath_3() {
        String[] result = ConfigurationManager.getPath("Inspirento.window.location");
        assertEquals("Inspirento.window", result[0]);
        assertEquals("location", result[1]);
    }

    @Test
    void test_getPath_4() {
        String[] result = ConfigurationManager.getPath("Inspirento.window.size");
        assertEquals("Inspirento.window", result[0]);
        assertEquals("size", result[1]);
    }

    @Test
    void test_getPath_5() {
        String[] result = ConfigurationManager.getPath("Inspirento.window.location");
        assertEquals("Inspirento.window", result[0]);
        assertEquals("location", result[1]);
    }

    @Test
    void test_getPath_6() {
        String[] result = ConfigurationManager.getPath("Inspirento.window.size");
        assertEquals("Inspirento.window", result[0]);
        assertEquals("size", result[1]);
    }

    @Test
    void test_getPath_7() {
        String[] result = ConfigurationManager.getPath("Inspirento.window.location");
        assertEquals("Inspirento.window", result[0]);
        assertEquals("location", result[1]);
    }

    @Test
    void test_getPath_8() {
        String[] result = ConfigurationManager.getPath("Inspirento.window.size");
        assertEquals("Inspirento.window", result[0]);
        assertEquals("size", result[1]);
    }

    @Test
    void test_getPath_9() {
        String[] result = ConfigurationManager.getPath("Inspirento.window.location");
        assertEquals("Inspirento.window", result[0]);
        assertEquals("location", result[1]);
    }

    @Test
    void test_getPath_10() {
        String[] result = ConfigurationManager