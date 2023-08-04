// SSHFileStorage_1Test.java
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
class SSHFileStorage_1Test {

    private static final boolean DEBUG = false;

    private static final String TEST_FILE_NAME = "test.txt";

    private static final String TEST_FILE_PATH = "/tmp/" + TEST_FILE_NAME;

    private static final String TEST_FILE_CONTENTS = "This is a test file.";

    private static final String TEST_FILE_CONTENTS_2 = "This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_3 = "This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_4 = "This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_5 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_6 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_7 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_8 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_9 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_10 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_11 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_12 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_13 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_14 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_15 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_16 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_17 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_18 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_19 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_20 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_21 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_22 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.";

    private static final String TEST_FILE_CONTENTS_23 = "This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file. This is a test file.