// SimpleCache_1Test.java
package net.sourceforge.jwbf.core.bots.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.CRC32;
import java.util.zip.Checksum;
import lombok.extern.slf4j.Slf4j;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCache}.
* It contains ten unit test cases for the {@link SimpleCache#get(String)} method.
*/
class SimpleCache_1Test {

		private static final String TEST_FOLDER = "test_cache";
		private static final String TEST_FILE = "test_cache/test.txt";
		private static final String TEST_FILE_2 = "test_cache/test2.txt";
		private static final String TEST_FILE_3 = "test_cache/test3.txt";
		private static final String TEST_FILE_4 = "test_cache/test4.txt";
		private static final String TEST_FILE_5 = "test_cache/test5.txt";
		private static final String TEST_FILE_6 = "test_cache/test6.txt";
		private static final String TEST_FILE_7 = "test_cache/test7.txt";
		private static final String TEST_FILE_8 = "test_cache/test8.txt";
		private static final String TEST_FILE_9 = "test_cache/test9.txt";
		private static final String TEST_FILE_10 = "test_cache/test10.txt";
		private static final String TEST_FILE_11 = "test_cache/test11.txt";
		private static final String TEST_FILE_12 = "test_cache/test12.txt";
		private static final String TEST_FILE_13 = "test_cache/test13.txt";
		private static final String TEST_FILE_14 = "test_cache/test14.txt";
		private static final String TEST_FILE_15 = "test_cache/test15.txt";
		private static final String TEST_FILE_16 = "test_cache/test16.txt";
		private static final String TEST_FILE_17 = "test_cache/test17.txt";
		private static final String TEST_FILE_18 = "test_cache/test18.txt";
		private static final String TEST_FILE_19 = "test_cache/test19.txt";
		private static final String TEST_FILE_20 = "test_cache/test20.txt";
		private static final String TEST_FILE_21 = "test_cache/test21.txt";
		private static final String TEST_FILE_22 = "test_cache/test22.txt";
		private static final String TEST_FILE_23 = "test_cache/test23.txt";
		private static final String TEST_FILE_24 = "test_cache/test24.txt";
		private static final String TEST_FILE_25 = "test_cache/test25.txt";
		private static final String TEST_FILE_26 = "test_cache/test26.txt";
		private static final String TEST_FILE_27 = "test_cache/test27.txt";
		private static final String TEST_FILE_28 = "test_cache/test28.txt";
		private static final String TEST_FILE_29 = "test_cache/test29.txt";
		private static final String TEST_FILE_30 = "test_cache/test30.txt";
		private static final String TEST_FILE_31 = "test_cache/test31.txt";
		private static final String TEST_FILE_32 = "test_cache/test32.txt";
		private static final String TEST_FILE_33 = "test_cache/test33.txt";
		private static final String TEST_FILE_34 = "test_cache/test34.txt";
		private static final String TEST_FILE_35 = "test_cache/test35.txt";
		private static final String TEST_FILE_36 = "test_cache/test36.txt";
		private static final String TEST_FILE_37 = "test_cache/test37.txt";
		private static final String TEST_FILE_38 = "test_cache/test38.txt";
		private static final String TEST_FILE_39 = "test_cache/test39.txt";
		private static final String TEST_FILE_40 = "test_cache/test40.txt";
		private static final String TEST_FILE_41 = "test_cache/test41.txt";
		private static final String TEST_FILE_42 = "test_cache/test42.txt";
		private static final String TEST_FILE_43 = "test_cache/test43.txt";
		private static final String TEST_FILE_44 = "test_cache/test44.txt";
		private static final String TEST_FILE_45 = "test_cache/test45.txt";
		private static final String TEST_FILE_46 = "test_cache/test46.txt";
		private static final String TEST_FILE_47 = "test_cache/test47.txt";
		private static final String TEST_FILE_48 = "test_cache/test48.txt";
		private static final String TEST_FILE_49 = "test_cache/test49.txt";
		private static final String TEST_FILE_50 = "test_cache/test50.txt";
		private static final String TEST_FILE_51 = "test_cache/test51.txt";
		private static final String TEST_FILE_52 = "test_cache/test52.txt";
		private static final String TEST_FILE_53 = "test_cache/test53.txt";
		private static final String TEST_FILE_54 = "test_cache/test54.txt";
		private static final String TEST_FILE_55 = "test_cache/test55.txt";
		private static final String TEST_FILE_56 = "test_cache/test56.txt";
		private static final String TEST_FILE_57 = "test_cache/test57.txt";
		private static final String TEST_FILE_58 = "test_cache/test58.txt";
		private static final String TEST_FILE_59 = "test_cache/test59.txt";
		private static final String TEST_FILE_60 = "test_cache/test60.txt";
		private static final String TEST_FILE_61 = "test_cache/test61.txt";
		private static final String TEST_FILE_62 = "test_cache/test62.txt";
		private static final String TEST_FILE_63 = "test_cache/test63.txt";
		private static final String TEST_FILE_64 = "test_cache/test64.txt";
		private static final String TEST_FILE_65 = "test_cache/test65.txt";
		private static final String TEST_FILE_66 = "test_cache/test66.txt";
		private static final String TEST_FILE_67 = "test_cache/test67.txt";
		private static final String TEST_FILE_68 = "test_cache/test68.txt";
		private static final String TEST_FILE_69 = "test_cache/test69.txt";
		private static final String TEST_FILE_70 = "test_cache/test70.txt";
		private static final String TEST_FILE_71 = "test_cache/test71.txt";
		private static final String TEST_FILE_72 = "test_cache/test72.txt";
		private static final String TEST_FILE_73 = "test_cache/test73.txt";
		private static final String TEST_FILE_74 = "test_cache/test74.txt";
		private static final String TEST_FILE_75 = "test_cache/test75.txt";
		private static final String TEST_FILE_76 = "test_cache/test76.txt";
		private static final String TEST_FILE_77 = "test_cache/test77.txt";
		private static final String TEST_FILE_78 = "test_cache/test78.txt";
		private static final String TEST_FILE_79 = "test_cache/test79.txt";
		private static final String TEST_FILE_80 = "test_cache/test80.txt";
		private static final String TEST_FILE_81 = "test_cache/test81.txt";
		private static final String TEST_FILE_82 = "test_cache/test82.txt";
		private static final String TEST_FILE_83 = "test_cache/test83.txt";
		private static final String TEST_FILE_84 = "test_cache/test84.txt";
		private static final String TEST_FILE_85 = "test_cache/test85.txt";
		private static final String TEST_FILE_86 = "test_cache/test86.txt";
		private static final String