// ClientProperties_1Test.java
package client;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import org.apache.log4j.Logger;
import common.Constants;
import common.XmlFunctions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClientProperties}.
* It contains ten unit test cases for the {@link ClientProperties#fileCopy(InputStream, File)} method.
*/
class ClientProperties_1Test {

    private static final Logger logger = Logger.getLogger(ClientProperties_1Test.class);

    /**
    * Test of {@link ClientProperties#fileCopy(InputStream, File)} method, of class {@link ClientProperties}.
    */
    @Test
    void testFileCopy() {
        logger.info("fileCopy");
        InputStream sourceFile = common.ResourceService.getInputStream(Constants.PROPERTIES_DEFAULTFILE);
        File destFile = new File("fubarman_properties.xml");
        boolean expResult = true;
        boolean result = ClientProperties.fileCopy(sourceFile, destFile);
        assertEquals(expResult, result);
        destFile.delete();
    }

    /**
    * Test of {@link ClientProperties#fileCopy(InputStream, File)} method, of class {@link ClientProperties}.
    */
    @Test
    void testFileCopy_1() {
        logger.info("fileCopy");
        InputStream sourceFile = common.ResourceService.getInputStream(Constants.PROPERTIES_DEFAULTFILE);
        File destFile = new File("fubarman_properties.xml");
        boolean expResult = true;
        boolean result = ClientProperties.fileCopy(sourceFile, destFile);
        assertEquals(expResult, result);
        destFile.delete();
    }

    /**
    * Test of {@link ClientProperties#fileCopy(InputStream, File)} method, of class {@link ClientProperties}.
    */
    @Test
    void testFileCopy_2() {
        logger.info("fileCopy");
        InputStream sourceFile = common.ResourceService.getInputStream(Constants.PROPERTIES_DEFAULTFILE);
        File destFile = new File("fubarman_properties.xml");
        boolean expResult = true;
        boolean result = ClientProperties.fileCopy(sourceFile, destFile);
        assertEquals(expResult, result);
        destFile.delete();
    }

    /**
    * Test of {@link ClientProperties#fileCopy(InputStream, File)} method, of class {@link ClientProperties}.
    */
    @Test
    void testFileCopy_3() {
        logger.info("fileCopy");
        InputStream sourceFile = common.ResourceService.getInputStream(Constants.PROPERTIES_DEFAULTFILE);
        File destFile = new File("fubarman_properties.xml");
        boolean expResult = true;
        boolean result = ClientProperties.fileCopy(sourceFile, destFile);
        assertEquals(expResult, result);
        destFile.delete();
    }

    /**
    * Test of {@link ClientProperties#fileCopy(InputStream, File)} method, of class {@link ClientProperties}.
    */
    @Test
    void testFileCopy_4() {
        logger.info("fileCopy");
        InputStream sourceFile = common.ResourceService.getInputStream(Constants.PROPERTIES_DEFAULTFILE);
        File destFile = new File("fubarman_properties.xml");
        boolean expResult = true;
        boolean result = ClientProperties.fileCopy(sourceFile, destFile);
        assertEquals(expResult, result);
        destFile.delete();
    }

    /**
    * Test of {@link ClientProperties#fileCopy(InputStream, File)} method, of class {@link ClientProperties}.
    */
    @Test
    void testFileCopy_5() {
        logger.info("fileCopy");
        InputStream sourceFile = common.ResourceService.getInputStream(Constants.PROPERTIES_DEFAULTFILE);
        File destFile = new File("fubarman_properties.xml");
        boolean expResult = true;
        boolean result = ClientProperties.fileCopy(sourceFile, destFile);
        assertEquals(expResult, result);
        destFile.delete();
    }

    /**
    * Test of {@link ClientProperties#fileCopy(InputStream, File)} method, of class {@link ClientProperties}.
    */
    @Test
    void testFileCopy_6() {
        logger.info("fileCopy");
        InputStream sourceFile = common.ResourceService.getInputStream(Constants.PROPERTIES_DEFAULTFILE);
        File destFile = new File("fubarman_properties.xml");
        boolean expResult = true;
        boolean result = ClientProperties.fileCopy(sourceFile, destFile);
        assertEquals(expResult, result);
        destFile.delete();
    }

    /**
    * Test of {@link ClientProperties#fileCopy(InputStream, File)} method, of class {@link ClientProperties}.
    */
    @Test
    void testFileCopy_7() {
        logger.info("fileCopy");
        InputStream sourceFile = common.ResourceService.getInputStream(Constants.PROPERTIES_DEFAULTFILE);
        File destFile = new File("fubarman_properties.xml");
        boolean expResult = true;
        boolean result = ClientProperties.fileCopy(sourceFile, destFile);
        assertEquals(expResult, result);
        destFile.delete();
    }

    /**
    * Test of {@link ClientProperties#fileCopy(InputStream, File)} method, of class {@link ClientProperties}.
    */
    @Test
    void testFileCopy_8() {
        logger.info("fileCopy");
        InputStream sourceFile = common.ResourceService.getInputStream(Constants.PROPERTIES_DEFAULTFILE);
        File destFile = new File("fubarman_properties.xml");
        boolean expResult = true;
        boolean result = ClientProperties.fileCopy(sourceFile, destFile);
        assertEquals(expResult, result);
        destFile.delete();
    }

    /**
    * Test of {@link ClientProperties#fileCopy(InputStream, File)} method, of class {@link ClientProperties}.
    */
    @Test
    void testFileCopy_9() {
        logger.info("fileCopy");
        InputStream sourceFile = common.ResourceService.getInputStream(Constants.PROPERTIES_DEFAULTFILE);
        File destFile = new File("fubarman_properties.xml");
        boolean expResult = true;
        boolean result = ClientProperties.fileCopy(sourceFile, destFile);
        assertEquals(expResult, result);
        destFile.delete();
    }

    /**
    * Test of {@link ClientProperties#fileCopy(InputStream, File)} method, of class {@link ClientProperties}.
    */
    @Test
    void testFileCopy_10() {
        logger.info("fileCopy");
        InputStream sourceFile = common.ResourceService.getInputStream(Constants.PROPERTIES_DEFAULTFILE);
        File destFile = new File("fubarman_properties.xml");
        boolean expResult = true;
        boolean result = ClientProperties.fileCopy(sourceFile, destFile);
        assertEquals(expResult, result);
        destFile.delete();
    }
}
