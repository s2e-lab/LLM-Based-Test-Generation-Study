// DownloadFolderTag_1Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains ten unit test cases for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_1Test {

    /**
    * Test method for {@link DownloadFolderTag#doEndTag()}.
    */
    @Test
    void testDoEndTag() {
        DownloadFolderTag tag = new DownloadFolderTag();
        tag.setDownloadQueue(new DownloadQueueBean());
        tag.setShortMetadata(new ShortMetadataBean());
        tag.setDownloadFolderType(DownloadFolderTag.UNAVAILABLE);
        tag.doEndTag();
        assertEquals(DownloadFolderTag.UNAVAILABLE, tag.getDownloadFolderType());
    }
}

// DownloadFolderTag_2Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains ten unit test cases for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_2Test {
		
    /**
    * Test method for {@link DownloadFolderTag#doEndTag()}.
    */
    @Test
    void testDoEndTag() {
        DownloadFolderTag tag = new DownloadFolderTag();
        tag.setDownloadQueue(new DownloadQueueBean());
        tag.setShortMetadata(new ShortMetadataBean());
        tag.setDownloadFolderType(DownloadFolderTag.ADD);
        tag.doEndTag();
        assertEquals(DownloadFolderTag.ADD, tag.getDownloadFolderType());
    }
}

// DownloadFolderTag_3Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains ten unit test cases for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_3Test {
		
    /**
    * Test method for {@link DownloadFolderTag#doEndTag()}.
    */
    @Test
    void testDoEndTag() {
        DownloadFolderTag tag = new DownloadFolderTag();
        tag.setDownloadQueue(new DownloadQueueBean());
        tag.setShortMetadata(new ShortMetadataBean());
        tag.setDownloadFolderType(DownloadFolderTag.REMOVE);
        tag.doEndTag();
        assertEquals(DownloadFolderTag.REMOVE, tag.getDownloadFolderType());
    }
}

// DownloadFolderTag_4Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains ten unit test cases for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_4Test {
		
    /**
    * Test method for {@link DownloadFolderTag#doEndTag()}.
    */
    @Test
    void testDoEndTag() {
        DownloadFolderTag tag = new DownloadFolderTag();
        tag.setDownloadQueue(new DownloadQueueBean());
        tag.setShortMetadata(new ShortMetadataBean());
        tag.setDownloadFolderType(DownloadFolderTag.REMOTE_IMAGE);
        tag.doEndTag();
        assertEquals(DownloadFolderTag.REMOTE_IMAGE, tag.getDownloadFolderType());
    }
}

// DownloadFolderTag_5Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains ten unit test cases for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_5Test {
		
    /**
    * Test method for {@link DownloadFolderTag#doEndTag()}.
    */
    @Test
    void testDoEndTag() {
        DownloadFolderTag tag = new DownloadFolderTag();
        tag.setDownloadQueue(new DownloadQueueBean());
        tag.setShortMetadata(new ShortMetadataBean());
        tag.setDownloadFolderType(DownloadFolderTag.UNKNOWN);
        tag.doEndTag();
        assertEquals(DownloadFolderTag.UNKNOWN, tag.getDownloadFolderType());
    }
}

// DownloadFolderTag_6Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains ten unit test cases for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_6Test {
		
    /**
    * Test method for {@link DownloadFolderTag#doEndTag()}.
    */
    @Test
    void testDoEndTag() {
        DownloadFolderTag tag = new DownloadFolderTag();
        tag.setDownloadQueue(new DownloadQueueBean());
        tag.setShortMetadata(new ShortMetadataBean());
        tag.setDownloadFolderType(DownloadFolderTag.UNAVAILABLE);
        tag.doEndTag();
        assertEquals(DownloadFolderTag.UNAVAILABLE, tag.getDownloadFolderType());
    }
}

// DownloadFolderTag_7Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains ten unit test cases for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_7Test {
		
    /**
    * Test method for {@link DownloadFolderTag#doEndTag()}.
    */
    @Test
    void testDoEndTag() {
        DownloadFolderTag tag = new DownloadFolderTag();
        tag.setDownloadQueue(new DownloadQueueBean());
        tag.setShortMetadata(new ShortMetadataBean());
        tag.setDownloadFolderType(DownloadFolderTag.ADD);
        tag.doEndTag();
        assertEquals(DownloadFolderTag.ADD, tag.getDownloadFolderType());
    }
}

// DownloadFolderTag_8Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains ten unit test cases for the {@link DownloadFolderTag#doEndTag()} method.
*/
class DownloadFolderTag_8Test {
		
    /**
    * Test method for {@link DownloadFolderTag#doEndTag()}.
    */
    @Test
    void testDoEndTag() {
        DownloadFolderTag tag = new DownloadFolderTag();
        tag.setDownloadQueue(new DownloadQueueBean());
        tag.setShortMetadata(new ShortMetadataBean());
        tag.setDownloadFolderType(DownloadFolderTag.REMOVE);
        tag.doEndTag();
        assertEquals(DownloadFolderTag.REMOVE, tag.getDownloadFolderType());
    }
}

// DownloadFolderTag_9Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api