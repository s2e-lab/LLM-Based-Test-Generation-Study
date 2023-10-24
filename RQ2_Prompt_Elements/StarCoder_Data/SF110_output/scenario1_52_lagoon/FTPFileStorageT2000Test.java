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
    private static final String TEST_FILE_CONTENTS_2 = "This is a test file 2.";
    private static final String TEST_FILE_CONTENTS_3 = "This is a test file 3.";
    private static final String TEST_FILE_CONTENTS_4 = "This is a test file 4.";
    private static final String TEST_FILE_CONTENTS_5 = "This is a test file 5.";
    private static final String TEST_FILE_CONTENTS_6 = "This is a test file 6.";
    private static final String TEST_FILE_CONTENTS_7 = "This is a test file 7.";
    private static final String TEST_FILE_CONTENTS_8 = "This is a test file 8.";
    private static final String TEST_FILE_CONTENTS_9 = "This is a test file 9.";
    private static final String TEST_FILE_CONTENTS_10 = "This is a test file 10.";
    private static final String TEST_FILE_CONTENTS_11 = "This is a test file 11.";
    private static final String TEST_FILE_CONTENTS_12 = "This is a test file 12.";
    private static final String TEST_FILE_CONTENTS_13 = "This is a test file 13.";
    private static final String TEST_FILE_CONTENTS_14 = "This is a test file 14.";
    private static final String TEST_FILE_CONTENTS_15 = "This is a test file 15.";
    private static final String TEST_FILE_CONTENTS_16 = "This is a test file 16.";
    private static final String TEST_FILE_CONTENTS_17 = "This is a test file 17.";
    private static final String TEST_FILE_CONTENTS_18 = "This is a test file 18.";
    private static final String TEST_FILE_CONTENTS_19 = "This is a test file 19.";
    private static final String TEST_FILE_CONTENTS_20 = "This is a test file 20.";
    private static final String TEST_FILE_CONTENTS_21 = "This is a test file 21.";
    private static final String TEST_FILE_CONTENTS_22 = "This is a test file 22.";
    private static final String TEST_FILE_CONTENTS_23 = "This is a test file 23.";
    private static final String TEST_FILE_CONTENTS_24 = "This is a test file 24.";
    private static final String TEST_FILE_CONTENTS_25 = "This is a test file 25.";
    private static final String TEST_FILE_CONTENTS_26 = "This is a test file 26.";
    private static final String TEST_FILE_CONTENTS_27 = "This is a test file 27.";
    private static final String TEST_FILE_CONTENTS_28 = "This is a test file 28.";
    private static final String TEST_FILE_CONTENTS_29 = "This is a test file 29.";
    private static final String TEST_FILE_CONTENTS_30 = "This is a test file 30.";
    private static final String TEST_FILE_CONTENTS_31 = "This is a test file 31.";
    private static final String TEST_FILE_CONTENTS_32 = "This is a test file 32.";
    private static final String TEST_FILE_CONTENTS_33 = "This is a test file 33.";
    private static final String TEST_FILE_CONTENTS_34 = "This is a test file 34.";
    private static final String TEST_FILE_CONTENTS_35 = "This is a test file 35.";
    private static final String TEST_FILE_CONTENTS_36 = "This is a test file 36.";
    private static final String TEST_FILE_CONTENTS_37 = "This is a test file 37.";
    private static final String TEST_FILE_CONTENTS_38 = "This is a test file 38.";
    private static final String TEST_FILE_CONTENTS_39 = "This is a test file 39.";
    private static final String TEST_FILE_CONTENTS_40 = "This is a test file 40.";
    private static final String TEST_FILE_CONTENTS_41 = "This is a test file 41.";
    private static final String TEST_FILE_CONTENTS_42 = "This is a test file 42.";
    private static final String TEST_FILE_CONTENTS_43 = "This is a test file 43.";
    private static final String TEST_FILE_CONTENTS_44 = "This is a test file 44.";
    private static final String TEST_FILE_CONTENTS_45 = "This is a test file 45.";
    private static final String TEST_FILE_CONTENTS_46 = "This is a test file 46.";
    private static final String TEST_FILE_CONTENTS_47 = "This is a test file 47.";
    private static final String TEST_FILE_CONTENTS_48 = "This is a test file 48.";
    private static final String TEST_FILE_CONTENTS_49 = "This is a test file 49.";
    private static final String TEST_FILE_CONTENTS_50 = "This is a test file 50.";
    private static final String TEST_FILE_CONTENTS_51 = "This is a test file 51.";
    private static final String TEST_FILE_CONTENTS_52 = "This is a test file 52.";
    private static final String TEST_FILE_CONTENTS_53 = "This is a test file 53.";
    private static final String TEST_FILE_CONTENTS_54 = "This is a test file 54.";
    private static final String TEST_FILE_CONTENTS_55 = "This is a test file 55.";
    private static final String TEST_FILE_CONTENTS_56 = "This is a test file 56.";
    private static final String TEST_FILE_CONTENTS_57 = "This is a test file 57.";
    private static final String TEST_FILE_CONTENTS_58 = "This is a test file 58.";
    private static final String TEST_FILE_CONTENTS_59 = "This is a test file 59.";
    private static final String TEST_FILE_CONTENTS_60 = "This is a test file 60.";
    private static final String TEST_FILE_CONTENTS_61 = "This is a test file 61.";
    private static final String TEST_FILE_CONTENTS_62 = "This is a test file 62.";
    private static final String TEST_FILE_CONTENTS_63 = "This is a test file 63.";
    private static final String TEST_FILE_CONTENTS_64 = "This is a test file 64.";
    private static final String TEST_FILE_CONTENTS_65 = "This is a test file 65.";
    private static final String TEST_FILE_CONTENTS_66 = "This is a test file 66.";
    private static final String TEST_FILE_CONTENTS_67 = "This is a test file 67.";
    private static final String TEST_FILE_CONTENTS_68 = "This is a test file 68.";
    private static final String TEST_FILE_CONTENTS_69 = "This is a test file 69.";
    private static final String TEST_FILE_CONTENTS_70 = "This is a test file 70.";
    private static final String TEST_FILE_CONTENTS_71 = "This is a test file 71.";
    private static final String TEST_FILE_CONTENTS_72 = "This is a test file 72.";
    private static final String TEST_FILE_CONTENTS_73 = "This is a test file 73.";
    private static final String TEST_FILE_CONTENTS_74 = "This is a test file 74.";
    private static final String TEST_FILE_CONTENTS_75 = "This is a test file 75.";
    private static final String TEST_FILE_CONTENTS_76 = "This is a test file 76.";
    private static final String TEST_FILE_CONTENTS_77 = "This is a test file 77.";
    private static final String TEST_FILE_CONTENTS_78 = "This is a test file 78.";
    private static final String TEST_FILE_CONTENTS_79 = "This is a test file 79.";
    private static final String TEST_FILE_CONTENTS_80 = "This is a test file 80.";
    private static final String TEST_FILE_CONTENTS_81 = "This is a test file 81.";
    private static final String TEST_FILE_CONTENTS_82 = "This is a test file 82.";
    private static final String TEST_FILE_CONTENTS_83 = "This is a test file 83.";
    private static final String TEST_FILE_CONTENTS_84 =