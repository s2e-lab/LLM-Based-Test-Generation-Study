// SSHFileStorageTest.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.MalformedURLException;
import nu.staldal.lagoon.core.FileStorage;
import nu.staldal.lagoon.core.OutputHandler;
import nu.staldal.lagoon.core.RemoteFileStorage;
import nu.staldal.lagoon.core.LagoonContext;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SSHFileStorage}.
* It contains ten unit test cases for the {@link SSHFileStorage#createFile(String)} method.
*/
class SSHFileStorageTest {

    private static final boolean DEBUG = false;

    private static final String HOST = "localhost";

    private static final int PORT = 22;

    private static final String USERNAME = "root";

    private static final String PASSWORD = "<PASSWORD>";

    private static final String ROOT_PATH = "/tmp/";

    private static final String FILE_NAME = "test.txt";

    private static final String FILE_PATH = ROOT_PATH + FILE_NAME;

    private static final String FILE_CONTENTS = "This is a test file.";

    private static final String FILE_CONTENTS_MODIFIED = "This is a modified test file.";

    private static final String FILE_CONTENTS_MODIFIED_2 = "This is a modified test file, again.";

    private static final String FILE_CONTENTS_MODIFIED_3 = "This is a modified test file, again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_4 = "This is a modified test file, again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_5 = "This is a modified test file, again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_6 = "This is a modified test file, again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_7 = "This is a modified test file, again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_8 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_9 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_10 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_11 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_12 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_13 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_14 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_15 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_16 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_17 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_18 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_19 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_20 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_21 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_22 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_23 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_24 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_25 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_26 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_27 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_28 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_29 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again, and again.";

    private static final String FILE_CONTENTS_MODIFIED_30 = "This is a modified test file, again, and again, and again, and again, and again, and again, and again, and