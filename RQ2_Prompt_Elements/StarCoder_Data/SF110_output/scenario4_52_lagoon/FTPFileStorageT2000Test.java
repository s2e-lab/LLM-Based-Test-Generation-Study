// FTPFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.*;
import nu.staldal.lagoon.core.*;
import nu.staldal.ftp.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFileStorage}.
* It contains ten unit test cases for the {@link FTPFileStorage#createFile(String)} method.
*/
class FTPFileStorageTest {

    private static final String TEST_FILE_NAME = "test.txt";

    private static final String TEST_FILE_CONTENTS = "This is a test file.";

    private static final String TEST_FILE_CONTENTS_MODIFIED = "This is a modified test file.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_2 = "This is a modified test file, again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_3 = "This is a modified test file, again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_4 = "This is a modified test file, again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_5 = "This is a modified test file, again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_6 = "This is a modified test file, again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_7 = "This is a modified test file, again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_8 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_9 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_10 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_11 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_12 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_13 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_14 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_15 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_16 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_17 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_18 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_19 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_20 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_21 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_22 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_23 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_24 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_25 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_26 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_27 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_28 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_29 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String TEST_FILE_CONTENTS_MODIFIED_30 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again