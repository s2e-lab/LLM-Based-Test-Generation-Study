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
     * Test case for {@link DownloadQueueBean#clearPackageFileSettings()}
     * when the package file is not set.
     */
    @Test
    void test_clearPackageFileSettings_when_packageFileNotSet() {
        DownloadQueueBean bean = new DownloadQueueBean();
        bean.clearPackageFileSettings();
        assertNull(bean.getPackageFile());
        assertNull(bean.getPackageFileLastModified());
        assertNull(bean.getPackageFileLocation());
        assertNull(bean.getPackageFileUrl());
    }

    /**
     * Test case for {@link DownloadQueueBean#clearPackageFileSettings()}
     * when the package file is set.
     */
    @Test
    void test_clearPackageFileSettings_when_packageFileIsSet() {
        DownloadQueueBean bean = new DownloadQueueBean();
        bean.setPackageFile(new File("test.zip"));
        bean.setPackageFileLastModified(1234567890L);
        bean.setPackageFileLocation("test/location");
        bean.setPackageFileUrl("http://test.com/test.zip");
        bean.clearPackageFileSettings();
        assertNull(bean.getPackageFile());
        assertNull(bean.getPackageFileLastModified());
        assertNull(bean.getPackageFileLocation());
        assertNull(bean.getPackageFileUrl());
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
* It contains ten unit test cases for the {@link DownloadQueueBean#clearPackageFileSettings()} method.
*/
class DownloadQueueBean_2Test {
		
    /**
     * Test case for {@link DownloadQueueBean#clearPackageFileSettings()}
     * when the package file is not set.
     */
    @Test
    void test_clearPackageFileSettings_when_packageFileNotSet() {
        DownloadQueueBean bean = new DownloadQueueBean();
        bean.clearPackageFileSettings();
        assertNull(bean.getPackageFile());
        assertNull(bean.getPackageFileLastModified());
        assertNull(bean.getPackageFileLocation());
        assertNull(bean.getPackageFileUrl());
    }

    /**
     * Test case for {@link DownloadQueueBean#clearPackageFileSettings()}
     * when the package file is set.
     */
    @Test
    void test_clearPackageFileSettings_when_packageFileIsSet() {
        DownloadQueueBean bean = new DownloadQueueBean();
        bean.setPackageFile(new File("test.zip"));
        bean.setPackageFileLastModified(1234567890L);
        bean.setPackageFileLocation("test/location");
        bean.setPackageFileUrl("http://test.com/test.zip");
        bean.clearPackageFileSettings();
        assertNull(bean.getPackageFile());
        assertNull(bean.getPackageFileLastModified());
        assertNull(bean.getPackageFileLocation());
        assertNull(bean.getPackageFileUrl());
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
* It contains ten unit test cases for the {@link DownloadQueueBean#clearPackageFileSettings()} method.
*/
class DownloadQueueBean_3Test {
		
    /**
     * Test case for {@link DownloadQueueBean#clearPackageFileSettings()}
     * when the package file is not set.
     */
    @Test
    void test_clearPackageFileSettings_when_packageFileNotSet() {
        DownloadQueueBean bean = new DownloadQueueBean();
        bean.clearPackageFileSettings();
        assertNull(bean.getPackageFile());
        assertNull(bean.getPackageFileLastModified());
        assertNull(bean.getPackageFileLocation());
        assertNull(bean.getPackageFileUrl());
    }

    /**
     * Test case for {@link DownloadQueueBean#clearPackageFileSettings()}
     * when the package file is set.
     */
    @Test
    void test_clearPackageFileSettings_when_packageFileIsSet() {
        DownloadQueueBean bean = new DownloadQueueBean();
        bean.setPackageFile(new File("test.zip"));
        bean.setPackageFileLastModified(1234567890L);
        bean.setPackageFileLocation("test/location");
        bean.setPackageFileUrl("http://test.com/test.zip");
        bean.clearPackageFileSettings();
        assertNull(bean.getPackageFile());
        assertNull(bean.getPackageFileLastModified());
        assertNull(bean.getPackageFileLocation());
        assertNull(bean.getPackageFileUrl());
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
* It contains ten unit test cases for the {@link DownloadQueueBean#clearPackageFileSettings()} method.
*/
class DownloadQueueBean_4Test {
		
    /**
     * Test case for {@link DownloadQueueBean#clearPackageFileSettings()}
     * when the package file is not set.
     */
    @Test
    void test_clearPackageFileSettings_when_packageFileNotSet() {
        DownloadQueueBean bean = new DownloadQueueBean();
        bean.clearPackageFileSettings();
        assertNull(bean.getPackageFile());
        assertNull(bean.getPackageFileLastModified());
        assertNull(bean.getPackageFileLocation());
        assertNull(bean.getPackageFileUrl());
    }

    /**
     * Test case for {@link DownloadQueueBean#clearPackageFileSettings()}
     * when the package file is set.
     */
    @Test
    void test_clearPackageFileSettings_when_packageFileIsSet() {
        DownloadQueueBean bean = new DownloadQueueBean();
        bean.setPackageFile(new File("test.zip"));
        bean.setPackageFileLastModified(1234567890L);
        bean.setPackageFileLocation("test/location");
        bean.setPackageFileUrl("http://test.com/test.zip");
        bean.clearPackageFileSettings();
        assertNull(bean.getPackageFile());
        assertNull(bean.getPackageFileLastModified());
        assertNull(bean.getPackageFileLocation());
        assertNull(bean.getPackageFileUrl());
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
* It contains ten unit test cases for the {@link DownloadQueueBean#clearPackageFileSettings()} method.
*/
class DownloadQueueBean_5Test {
		
    /**
     * Test case for {@link DownloadQueueBean#clearPackageFileSettings()}
     * when the package file is not set.
     */
    @Test
    void test_clearPackageFileSettings_when_packageFileNotSet() {
        DownloadQueueBean bean = new DownloadQueueBean();
        bean.clearPackageFileSettings();
        assertNull(bean.getPackageFile());
        assertNull(bean.getPackageFileLastModified());
        assertNull(bean.getPackageFileLocation());
        assertNull(bean.getPackageFileUrl());
    }

    /**
     * Test case for {@link DownloadQueueBean#clearPackageFileSettings()}
     * when the package file is set.
     */
    @Test
    void test_clearPackageFileSettings_when_packageFileIsSet() {
        DownloadQueueBean bean = new DownloadQueueBean();
        bean.setPackageFile(new File("test.zip"));
        bean.setPackageFileLastModified(1234567890L);
        bean.setPackageFileLocation("test/location");
        bean.setPackageFileUrl("http://test.com/test.zip");
        bean.clearPackageFileSettings();
        assertNull(bean.getPackageFile());
        assertNull(bean.getPackageFileLastModified());
        assertNull(bean.getPackageFileLocation());
        assertNull(bean.getPackageFileUrl());
    }
}

// DownloadQueueBean_6Test.java
package org.heal.module.download;

import java.io.File;
import java.io.Serializable;
import java.util.Collection;
import java.util.TreeSet;
import org.