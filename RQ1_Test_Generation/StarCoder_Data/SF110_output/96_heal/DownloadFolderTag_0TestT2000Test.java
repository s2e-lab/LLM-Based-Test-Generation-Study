// DownloadFolderTag_0Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.TagSupport;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DownloadFolderTag}.
* It contains ten unit test cases for the {@link DownloadFolderTag#doStartTag()} method.
*/
class DownloadFolderTag_0Test {

    /**
    * Test method for {@link DownloadFolderTag#doStartTag()}.
    */
    @Test
    void testDoStartTag() {
        DownloadFolderTag tag = new DownloadFolderTag();
        DownloadQueueBean downloadQueue = new DownloadQueueBean();
        ShortMetadataBean shortMetadata = new ShortMetadataBean();
        FileLocator locator = new FileLocator();
        locator.setServerBaseURL("http://localhost:8080/heal/images/");
        tag.setDownloadQueue(downloadQueue);
        tag.setShortMetadata(shortMetadata);
        tag.setPageContext(new MockPageContext(locator));
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.UNAVAILABLE, tag.getDownloadFolderType());
        shortMetadata.setFormat("Image");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.REMOTE_IMAGE, tag.getDownloadFolderType());
        shortMetadata.setLocation("http://localhost:8080/heal/images/test.jpg");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.UNAVAILABLE, tag.getDownloadFolderType());
        shortMetadata.setFormat("Web Page");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.ADD, tag.getDownloadFolderType());
        shortMetadata.setMetadataId("1234567890");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.REMOVE, tag.getDownloadFolderType());
    }
}

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
* It contains ten unit test cases for the {@link DownloadFolderTag#doStartTag()} method.
*/
class DownloadFolderTag_1Test {
		
    /**
    * Test method for {@link DownloadFolderTag#doStartTag()}.
    */
    @Test
    void testDoStartTag() {
        DownloadFolderTag tag = new DownloadFolderTag();
        DownloadQueueBean downloadQueue = new DownloadQueueBean();
        ShortMetadataBean shortMetadata = new ShortMetadataBean();
        FileLocator locator = new FileLocator();
        locator.setServerBaseURL("http://localhost:8080/heal/images/");
        tag.setDownloadQueue(downloadQueue);
        tag.setShortMetadata(shortMetadata);
        tag.setPageContext(new MockPageContext(locator));
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.UNAVAILABLE, tag.getDownloadFolderType());
        shortMetadata.setFormat("Image");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.REMOTE_IMAGE, tag.getDownloadFolderType());
        shortMetadata.setLocation("http://localhost:8080/heal/images/test.jpg");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.UNAVAILABLE, tag.getDownloadFolderType());
        shortMetadata.setFormat("Web Page");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.ADD, tag.getDownloadFolderType());
        shortMetadata.setMetadataId("1234567890");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.REMOVE, tag.getDownloadFolderType());
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
* It contains ten unit test cases for the {@link DownloadFolderTag#doStartTag()} method.
*/
class DownloadFolderTag_2Test {
		
    /**
    * Test method for {@link DownloadFolderTag#doStartTag()}.
    */
    @Test
    void testDoStartTag() {
        DownloadFolderTag tag = new DownloadFolderTag();
        DownloadQueueBean downloadQueue = new DownloadQueueBean();
        ShortMetadataBean shortMetadata = new ShortMetadataBean();
        FileLocator locator = new FileLocator();
        locator.setServerBaseURL("http://localhost:8080/heal/images/");
        tag.setDownloadQueue(downloadQueue);
        tag.setShortMetadata(shortMetadata);
        tag.setPageContext(new MockPageContext(locator));
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.UNAVAILABLE, tag.getDownloadFolderType());
        shortMetadata.setFormat("Image");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.REMOTE_IMAGE, tag.getDownloadFolderType());
        shortMetadata.setLocation("http://localhost:8080/heal/images/test.jpg");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.UNAVAILABLE, tag.getDownloadFolderType());
        shortMetadata.setFormat("Web Page");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.ADD, tag.getDownloadFolderType());
        shortMetadata.setMetadataId("1234567890");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.REMOVE, tag.getDownloadFolderType());
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
* It contains ten unit test cases for the {@link DownloadFolderTag#doStartTag()} method.
*/
class DownloadFolderTag_3Test {
		
    /**
    * Test method for {@link DownloadFolderTag#doStartTag()}.
    */
    @Test
    void testDoStartTag() {
        DownloadFolderTag tag = new DownloadFolderTag();
        DownloadQueueBean downloadQueue = new DownloadQueueBean();
        ShortMetadataBean shortMetadata = new ShortMetadataBean();
        FileLocator locator = new FileLocator();
        locator.setServerBaseURL("http://localhost:8080/heal/images/");
        tag.setDownloadQueue(downloadQueue);
        tag.setShortMetadata(shortMetadata);
        tag.setPageContext(new MockPageContext(locator));
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.UNAVAILABLE, tag.getDownloadFolderType());
        shortMetadata.setFormat("Image");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.REMOTE_IMAGE, tag.getDownloadFolderType());
        shortMetadata.setLocation("http://localhost:8080/heal/images/test.jpg");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.UNAVAILABLE, tag.getDownloadFolderType());
        shortMetadata.setFormat("Web Page");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.ADD, tag.getDownloadFolderType());
        shortMetadata.setMetadataId("1234567890");
        assertEquals(TagSupport.EVAL_BODY_INCLUDE, tag.doStartTag());
        assertEquals(DownloadFolderTag.REMOVE, tag.getDownloadFolderType());
    }
}

// DownloadFolderTag_4Test.java
package org.heal.tag.download;

import org.heal.module.download.DownloadQueueBean;
import org.heal.module.metadata.ShortMetadataBean;
import org.heal.util.FileLocator;
import javax.servlet.jsp.tagext.