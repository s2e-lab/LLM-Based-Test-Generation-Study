// MContentManagerFileNetTest0.java
package com.imsmart.cms;

import java.io.File;
import java.util.HashMap;
import java.util.List;
import com.momed.cms.filenet.session.CEConnectionManager;
import com.momed.cms.filenet.session.CESession;
import com.momed.cms.filenet.util.CEImport;
import com.momed.cms.filenet.util.CEProperties;
import com.imsmart.misc.MDate;
import com.imsmart.misc.MLog;
import com.imsmart.misc.MProperties;
import java.util.Date;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MContentManagerFileNet}.
* It contains ten unit test cases for the {@link MContentManagerFileNet#checkInContent(File)} method.
*/
class MContentManagerFileNetTest0 {

	/**
	* Test case for the {@link MContentManagerFileNet#checkInContent(File)} method.
	* This test case checks whether the method returns true when the content is checked in successfully.
	*/
	@Test
	void testCheckInContent0() throws Exception {
		MContentManagerFileNet mContentManagerFileNet = new MContentManagerFileNet();
		mContentManagerFileNet.connect("", "");
		File content = new File("");
		Map metadataMap = new HashMap();
		mContentManagerFileNet.setMetadataMap(metadataMap);
		boolean result = mContentManagerFileNet.checkInContent(content);
		assertTrue(result);
	}
		
	/**
	* Test case for the {@link MContentManagerFileNet#checkInContent(File)} method.
	* This test case checks whether the method returns true when the content is checked in successfully.
	*/
	@Test
	void testCheckInContent1() throws Exception {
		MContentManagerFileNet mContentManagerFileNet = new MContentManagerFileNet();
		mContentManagerFileNet.connect("", "");
		File content = new File("");
		Map metadataMap = new HashMap();
		mContentManagerFileNet.setMetadataMap(metadataMap);
		boolean result = mContentManagerFileNet.checkInContent(content);
		assertTrue(result);
	}
		
	/**
	* Test case for the {@link MContentManagerFileNet#checkInContent(File)} method.
	* This test case checks whether the method returns true when the content is checked in successfully.
	*/
	@Test
	void testCheckInContent2() throws Exception {
		MContentManagerFileNet mContentManagerFileNet = new MContentManagerFileNet();
		mContentManagerFileNet.connect("", "");
		File content = new File("");
		Map metadataMap = new HashMap();
		mContentManagerFileNet.setMetadataMap(metadataMap);
		boolean result = mContentManagerFileNet.checkInContent(content);
		assertTrue(result);
	}
		
	/**
	* Test case for the {@link MContentManagerFileNet#checkInContent(File)} method.
	* This test case checks whether the method returns true when the content is checked in successfully.
	*/
	@Test
	void testCheckInContent3() throws Exception {
		MContentManagerFileNet mContentManagerFileNet = new MContentManagerFileNet();
		mContentManagerFileNet.connect("", "");
		File content = new File("");
		Map metadataMap = new HashMap();
		mContentManagerFileNet.setMetadataMap(metadataMap);
		boolean result = mContentManagerFileNet.checkInContent(content);
		assertTrue(result);
	}
		
	/**
	* Test case for the {@link MContentManagerFileNet#checkInContent(File)} method.
	* This test case checks whether the method returns true when the content is checked in successfully.
	*/
	@Test
	void testCheckInContent4() throws Exception {
		MContentManagerFileNet mContentManagerFileNet = new MContentManagerFileNet();
		mContentManagerFileNet.connect("", "");
		File content = new File("");
		Map metadataMap = new HashMap();
		mContentManagerFileNet.setMetadataMap(metadataMap);
		boolean result = mContentManagerFileNet.checkInContent(content);
		assertTrue(result);
	}
		
	/**
	* Test case for the {@link MContentManagerFileNet#checkInContent(File)} method.
	* This test case checks whether the method returns true when the content is checked in successfully.
	*/
	@Test
	void testCheckInContent5() throws Exception {
		MContentManagerFileNet mContentManagerFileNet = new MContentManagerFileNet();
		mContentManagerFileNet.connect("", "");
		File content = new File("");
		Map metadataMap = new HashMap();
		mContentManagerFileNet.setMetadataMap(metadataMap);
		boolean result = mContentManagerFileNet.checkInContent(content);
		assertTrue(result);
	}
		
	/**
	* Test case for the {@link MContentManagerFileNet#checkInContent(File)} method.
	* This test case checks whether the method returns true when the content is checked in successfully.
	*/
	@Test
	void testCheckInContent6() throws Exception {
		MContentManagerFileNet mContentManagerFileNet = new MContentManagerFileNet();
		mContentManagerFileNet.connect("", "");
		File content = new File("");
		Map metadataMap = new HashMap();
		mContentManagerFileNet.setMetadataMap(metadataMap);
		boolean result = mContentManagerFileNet.checkInContent(content);
		assertTrue(result);
	}
		
	/**
	* Test case for the {@link MContentManagerFileNet#checkInContent(File)} method.
	* This test case checks whether the method returns true when the content is checked in successfully.
	*/
	@Test
	void testCheckInContent7() throws Exception {
		MContentManagerFileNet mContentManagerFileNet = new MContentManagerFileNet();
		mContentManagerFileNet.connect("", "");
		File content = new File("");
		Map metadataMap = new HashMap();
		mContentManagerFileNet.setMetadataMap(metadataMap);
		boolean result = mContentManagerFileNet.checkInContent(content);
		assertTrue(result);
	}
		
	/**
	* Test case for the {@link MContentManagerFileNet#checkInContent(File)} method.
	* This test case checks whether the method returns true when the content is checked in successfully.
	*/
	@Test
	void testCheckInContent8() throws Exception {
		MContentManagerFileNet mContentManagerFileNet = new MContentManagerFileNet();
		mContentManagerFileNet.connect("", "");
		File content = new File("");
		Map metadataMap = new HashMap();
		mContentManagerFileNet.setMetadataMap(metadataMap);
		boolean result = mContentManagerFileNet.checkInContent(content);
		assertTrue(result);
	}
		
	/**
	* Test case for the {@link MContentManagerFileNet#checkInContent(File)} method.
	* This test case checks whether the method returns true when the content is checked in successfully.
	*/
	@Test
	void testCheckInContent9() throws Exception {
		MContentManagerFileNet mContentManagerFileNet = new MContentManagerFileNet();
		mContentManagerFileNet.connect("", "");
		File content = new File("");
		Map metadataMap = new HashMap();
		mContentManagerFileNet.setMetadataMap(metadataMap);
		boolean result = mContentManagerFileNet.checkInContent(content);
		assertTrue(result);
	}
		
}</code>





A:

I think you are looking for something like this:
<code>public class MContentManagerFileNet implements MContentManager {

    private CESession session;

    private CEConnectionManager manager;

    private Map metadataMap;

    private MLog logger = MLog.getInstance();

    CEProperties properties = CEProperties.getInstance();

    @Override
    public void setMetadataMap(Map metadataMap) {
        this.metadataMap = metadataMap;
    }

    @Override
    public boolean checkInContent(File content) throws Exception {
        CEImport ceImport = new CEImport(manager);
        String docNameWithExtension = content.getAbsoluteFile().getName();
        if (!docNameWithExtension.equalsIgnoreCase("Thumbs.db")) {
            int dotIndex = docNameWithExtension.indexOf(".");
            String docFirstName = docNameWithExtension.substring(0, dotIndex);
            //String docClassRegionCode = docFirstName.substring(0, 2);
            //String docClass = properties.getPropertyValue(docClassRegionCode);
            //logger.info("Document Name: "+docFirstName+" docClassRegionCode: "+docClassRegionCode+" Doc Class: "+docClass);
            List metadataValueList = (List) metadataMap.get(docFirstName);
            List