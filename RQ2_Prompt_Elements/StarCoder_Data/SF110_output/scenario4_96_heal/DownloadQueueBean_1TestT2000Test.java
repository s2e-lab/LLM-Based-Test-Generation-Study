// DownloadQueueBean_1Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#clearPackageFileSettings()} method.
*/
class DownloadQueueBean_1Test {

    /**
    * Test method for {@link DownloadQueueBean#clearPackageFileSettings()}.
    */
    @Test
    void testClearPackageFileSettings() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.setPackageFileLocation("test");
        instance.setPackageURL("test");
        instance.setPackageFileCreated();
        instance.setPackageFormat(DownloadServicesBean.ZIPFORMAT);
        instance.addToQueue("test");
        instance.clearPackageFileSettings();
        assertEquals(null, instance.getPackageFileLocation());
        assertEquals(null, instance.getPackageURL());
        assertEquals(false, instance.isPackageFileUpToDate(DownloadServicesBean.ZIPFORMAT));
        assertEquals(false, instance.isPackageModified());
        assertEquals(DownloadServicesBean.ZIPFORMAT, instance.getPackageFormat());
        assertEquals(0, instance.getNumEntries());
    }
}

// DownloadQueueBean_2Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#isPackageFileUpToDate(int)} method.
*/
class DownloadQueueBean_2Test {
		
    /**
    * Test method for {@link DownloadQueueBean#isPackageFileUpToDate(int)}.
    */
    @Test
    void testIsPackageFileUpToDate() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.setPackageFileLocation("test");
        instance.setPackageURL("test");
        instance.setPackageFileCreated();
        instance.setPackageFormat(DownloadServicesBean.ZIPFORMAT);
        instance.addToQueue("test");
        assertEquals(true, instance.isPackageFileUpToDate(DownloadServicesBean.ZIPFORMAT));
    }
}

// DownloadQueueBean_3Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#isPackageModified()} method.
*/
class DownloadQueueBean_3Test {
		
    /**
    * Test method for {@link DownloadQueueBean#isPackageModified()}.
    */
    @Test
    void testIsPackageModified() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.setPackageFileLocation("test");
        instance.setPackageURL("test");
        instance.setPackageFileCreated();
        instance.setPackageFormat(DownloadServicesBean.ZIPFORMAT);
        instance.addToQueue("test");
        assertEquals(false, instance.isPackageModified());
    }
}

// DownloadQueueBean_4Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#getPackageFormat()} method.
*/
class DownloadQueueBean_4Test {
		
    /**
    * Test method for {@link DownloadQueueBean#getPackageFormat()}.
    */
    @Test
    void testGetPackageFormat() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.setPackageFileLocation("test");
        instance.setPackageURL("test");
        instance.setPackageFileCreated();
        instance.setPackageFormat(DownloadServicesBean.ZIPFORMAT);
        instance.addToQueue("test");
        assertEquals(DownloadServicesBean.ZIPFORMAT, instance.getPackageFormat());
    }
}

// DownloadQueueBean_5Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#getPackageFileLocation()} method.
*/
class DownloadQueueBean_5Test {
		
    /**
    * Test method for {@link DownloadQueueBean#getPackageFileLocation()}.
    */
    @Test
    void testGetPackageFileLocation() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.setPackageFileLocation("test");
        instance.setPackageURL("test");
        instance.setPackageFileCreated();
        instance.setPackageFormat(DownloadServicesBean.ZIPFORMAT);
        instance.addToQueue("test");
        assertEquals("test", instance.getPackageFileLocation());
    }
}

// DownloadQueueBean_6Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#getPackageURL()} method.
*/
class DownloadQueueBean_6Test {
		
    /**
    * Test method for {@link DownloadQueueBean#getPackageURL()}.
    */
    @Test
    void testGetPackageURL() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.setPackageFileLocation("test");
        instance.setPackageURL("test");
        instance.setPackageFileCreated();
        instance.setPackageFormat(DownloadServicesBean.ZIPFORMAT);
        instance.addToQueue("test");
        assertEquals("test", instance.getPackageURL());
    }
}

// DownloadQueueBean_7Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#setPackageFileCreated()} method.
*/
class DownloadQueueBean_7Test {
		
    /**
    * Test method for {@link DownloadQueueBean#setPackageFileCreated()}.
    */
    @Test
    void testSetPackageFileCreated() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.setPackageFileLocation("test");
        instance.setPackageURL("test");
        instance.setPackageFileCreated();
        instance.setPackageFormat(DownloadServicesBean.ZIPFORMAT);
        instance.addToQueue("test");
        assertEquals(true, instance.isPackageFileUpToDate(DownloadServicesBean.ZIPFORMAT));
    }
}

// DownloadQueueBean_8Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#setPackageFormat(int)} method.
*/
class DownloadQueueBean_8Test {
		
    /**
    * Test method for {@link DownloadQueueBean#setPackageFormat(int)}.
    */
    @Test
    void testSetPackageFormat() {
        DownloadQueueBean instance = new DownloadQueueBean();
        instance.setPackageFileLocation("test");
        instance.setPackageURL("test");
        instance.setPackageFileCreated();
        instance.setPackageFormat(DownloadServicesBean.ZIPFORMAT);
        instance.addToQueue("test");
        assertEquals(DownloadServicesBean.ZIPFORMAT, instance.getPackageFormat());
    }
}

// DownloadQueueBean_9Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadQueueBean}.
* It contains ten unit test cases for the {@link DownloadQueueBean#setPackageFileLocation(String)} method.
*/
class DownloadQueueBean_9Test {
		