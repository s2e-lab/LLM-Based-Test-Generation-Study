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

    /**
     * Test of {@link ClientProperties#fileCopy(InputStream, File)} method.
     * It tests the method with a valid source and destination file.
     */
    @Test
    void testFileCopy() {
        Logger log = Logger.getLogger(ClientProperties_1Test.class);
        log.info("testFileCopy");
        InputStream sourceFile = null;
        File destFile = null;
        try {
            sourceFile = ClientProperties.class.getResourceAsStream(Constants.CLIENT_PROPERTIES_FILE);
            destFile = new File(System.getProperty("user.home") + File.separator + Constants.CLIENT_PROPERTIES_FILE);
            ClientProperties.fileCopy(sourceFile, destFile);
            assertTrue(destFile.exists());
        } catch (IOException e) {
            log.error(e.getMessage());
        } finally {
            try {
                if (sourceFile != null) {
                    sourceFile.close();
                }
                if (destFile != null) {
                    destFile.delete();
                }
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }
    }
}

// ClientProperties_2Test.java
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
class ClientProperties_2Test {
		
    /**
     * Test of {@link ClientProperties#fileCopy(InputStream, File)} method.
     * It tests the method with a valid source and destination file.
     */
    @Test
    void testFileCopy() {
        Logger log = Logger.getLogger(ClientProperties_2Test.class);
        log.info("testFileCopy");
        InputStream sourceFile = null;
        File destFile = null;
        try {
            sourceFile = ClientProperties.class.getResourceAsStream(Constants.CLIENT_PROPERTIES_FILE);
            destFile = new File(System.getProperty("user.home") + File.separator + Constants.CLIENT_PROPERTIES_FILE);
            ClientProperties.fileCopy(sourceFile, destFile);
            assertTrue(destFile.exists());
        } catch (IOException e) {
            log.error(e.getMessage());
        } finally {
            try {
                if (sourceFile != null) {
                    sourceFile.close();
                }
                if (destFile != null) {
                    destFile.delete();
                }
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }
    }
}

// ClientProperties_3Test.java
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
class ClientProperties_3Test {
		
    /**
     * Test of {@link ClientProperties#fileCopy(InputStream, File)} method.
     * It tests the method with a valid source and destination file.
     */
    @Test
    void testFileCopy() {
        Logger log = Logger.getLogger(ClientProperties_3Test.class);
        log.info("testFileCopy");
        InputStream sourceFile = null;
        File destFile = null;
        try {
            sourceFile = ClientProperties.class.getResourceAsStream(Constants.CLIENT_PROPERTIES_FILE);
            destFile = new File(System.getProperty("user.home") + File.separator + Constants.CLIENT_PROPERTIES_FILE);
            ClientProperties.fileCopy(sourceFile, destFile);
            assertTrue(destFile.exists());
        } catch (IOException e) {
            log.error(e.getMessage());
        } finally {
            try {
                if (sourceFile != null) {
                    sourceFile.close();
                }
                if (destFile != null) {
                    destFile.delete();
                }
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }
    }
}

// ClientProperties_4Test.java
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
class ClientProperties_4Test {
		
    /**
     * Test of {@link ClientProperties#fileCopy(InputStream, File)} method.
     * It tests the method with a valid source and destination file.
     */
    @Test
    void testFileCopy() {
        Logger log = Logger.getLogger(ClientProperties_4Test.class);
        log.info("testFileCopy");
        InputStream sourceFile = null;
        File destFile = null;
        try {
            sourceFile = ClientProperties.class.getResourceAsStream(Constants.CLIENT_PROPERTIES_FILE);
            destFile = new File(System.getProperty("user.home") + File.separator + Constants.CLIENT_PROPERTIES_FILE);
            ClientProperties.fileCopy(sourceFile, destFile);
            assertTrue(destFile.exists());
        } catch (IOException e) {
            log.error(e.getMessage());
        } finally {
            try {
                if (sourceFile != null) {
                    sourceFile.close();
                }
                if (destFile != null) {
                    destFile.delete();
                }
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }
    }
}

// ClientProperties_5Test.java
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
class ClientProperties_5Test {
		
    /**
     * Test of {@link ClientProperties#fileCopy(InputStream, File)} method.
     * It tests the method with a valid source and destination file.
     */
    @Test
    void testFileCopy() {
        Logger log = Logger.getLogger(ClientProperties_5Test.class);
        log.info("testFileCopy");
        InputStream sourceFile = null;
        File destFile = null;
        try {
            sourceFile = ClientProperties.class.getResourceAsStream(Constants.CLIENT_PROPERTIES_FILE);
            destFile = new File(System.getProperty("user.home") + File.separator + Constants.CLIENT_PROPERTIES_FILE);
            ClientProperties.fileCopy(sourceFile, destFile);
            assertTrue(destFile.exists());
        } catch (IOException e) {
            log.error(e.getMessage());
        } finally {
            try {
                if (sourceFile != null) {
                    sourceFile.close();
                }
                if (destFile != null) {
                    destFile.delete();
                }
            } catch (IOException e) {
                log.error(e.getMessage());
            }
        }
    }
}

// ClientProperties_6Test.java
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
class ClientProperties_6Test {
		
    /**
     * Test of {@link ClientProperties#fileCopy(InputStream, File)} method.
     * It tests the method with a valid source and destination file.
     */
    @Test
    void testFileCopy() {
        Logger log = Logger.getLogger(ClientProperties_6Test.class);
        log.info("testFileCopy