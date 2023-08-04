// ClientProperties_0Test.java
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
* It contains ten unit test cases for the {@link ClientProperties#getProperty(String)} method.
*/
class ClientProperties_0Test {

    private static final Logger LOGGER = Logger.getLogger(ClientProperties_0Test.class);
    private static final String PROPERTIES_FILE_NAME = "client.properties";
    private static final String PROPERTIES_FILE_PATH = System.getProperty("user.dir") + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST = System.getProperty("user.dir") + File.separator + "test" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_2 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_3 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_4 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_5 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + "test5" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_6 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + "test5" + File.separator + "test6" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_7 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + "test5" + File.separator + "test6" + File.separator + "test7" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_8 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + "test5" + File.separator + "test6" + File.separator + "test7" + File.separator + "test8" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_9 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + "test5" + File.separator + "test6" + File.separator + "test7" + File.separator + "test8" + File.separator + "test9" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_10 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + "test5" + File.separator + "test6" + File.separator + "test7" + File.separator + "test8" + File.separator + "test9" + File.separator + "test10" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_11 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + "test5" + File.separator + "test6" + File.separator + "test7" + File.separator + "test8" + File.separator + "test9" + File.separator + "test10" + File.separator + "test11" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_12 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + "test5" + File.separator + "test6" + File.separator + "test7" + File.separator + "test8" + File.separator + "test9" + File.separator + "test10" + File.separator + "test11" + File.separator + "test12" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_13 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + "test5" + File.separator + "test6" + File.separator + "test7" + File.separator + "test8" + File.separator + "test9" + File.separator + "test10" + File.separator + "test11" + File.separator + "test12" + File.separator + "test13" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_14 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + "test5" + File.separator + "test6" + File.separator + "test7" + File.separator + "test8" + File.separator + "test9" + File.separator + "test10" + File.separator + "test11" + File.separator + "test12" + File.separator + "test13" + File.separator + "test14" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_15 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + "test5" + File.separator + "test6" + File.separator + "test7" + File.separator + "test8" + File.separator + "test9" + File.separator + "test10" + File.separator + "test11" + File.separator + "test12" + File.separator + "test13" + File.separator + "test14" + File.separator + "test15" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_16 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + "test5" + File.separator + "test6" + File.separator + "test7" + File.separator + "test8" + File.separator + "test9" + File.separator + "test10" + File.separator + "test11" + File.separator + "test12" + File.separator + "test13" + File.separator + "test14" + File.separator + "test15" + File.separator + "test16" + File.separator + PROPERTIES_FILE_NAME;
    private static final String PROPERTIES_FILE_PATH_TEST_17 = System.getProperty("user.dir") + File.separator + "test" + File.separator + "test2" + File.separator + "test3" + File.separator + "test4" + File.separator + "test5" + File.separator + "test6" + File.separator + "test7" + File.separator + "test8" + File.separator + "test9" + File.separator + "test10"