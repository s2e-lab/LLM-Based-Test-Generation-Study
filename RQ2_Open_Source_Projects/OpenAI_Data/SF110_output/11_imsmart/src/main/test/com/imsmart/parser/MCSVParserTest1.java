// MCSVParserTest1.java
package com.imsmart.parser;

import com.imsmart.misc.MLog;
import com.imsmart.misc.MProperties;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MCSVParser}.
* It contains ten unit test cases for the {@link MCSVParser#parseAsMap(String)} method.
*/
class MCSVParserTest1 {

		private static final String FILE_NAME_WITH_PATH = "C:\\Users\\Saurabh\\Desktop\\test.csv";
		private static final String FILE_NAME_WITH_PATH_1 = "C:\\Users\\Saurabh\\Desktop\\test1.csv";
		private static final String FILE_NAME_WITH_PATH_2 = "C:\\Users\\Saurabh\\Desktop\\test2.csv";
		private static final String FILE_NAME_WITH_PATH_3 = "C:\\Users\\Saurabh\\Desktop\\test3.csv";
		private static final String FILE_NAME_WITH_PATH_4 = "C:\\Users\\Saurabh\\Desktop\\test4.csv";
		private static final String FILE_NAME_WITH_PATH_5 = "C:\\Users\\Saurabh\\Desktop\\test5.csv";
		private static final String FILE_NAME_WITH_PATH_6 = "C:\\Users\\Saurabh\\Desktop\\test6.csv";
		private static final String FILE_NAME_WITH_PATH_7 = "C:\\Users\\Saurabh\\Desktop\\test7.csv";
		private static final String FILE_NAME_WITH_PATH_8 = "C:\\Users\\Saurabh\\Desktop\\test8.csv";
		private static final String FILE_NAME_WITH_PATH_9 = "C:\\Users\\Saurabh\\Desktop\\test9.csv";
		private static final String FILE_NAME_WITH_PATH_10 = "C:\\Users\\Saurabh\\Desktop\\test10.csv";
		
		private static final String FILE_NAME_WITH_PATH_11 = "C:\\Users\\Saurabh\\Desktop\\test11.csv";
		private static final String FILE_NAME_WITH_PATH_12 = "C:\\Users\\Saurabh\\Desktop\\test12.csv";
		private static final String FILE_NAME_WITH_PATH_13 = "C:\\Users\\Saurabh\\Desktop\\test13.csv";
		private static final String FILE_NAME_WITH_PATH_14 = "C:\\Users\\Saurabh\\Desktop\\test14.csv";
		private static final String FILE_NAME_WITH_PATH_15 = "C:\\Users\\Saurabh\\Desktop\\test15.csv";
		private static final String FILE_NAME_WITH_PATH_16 = "C:\\Users\\Saurabh\\Desktop\\test16.csv";
		private static final String FILE_NAME_WITH_PATH_17 = "C:\\Users\\Saurabh\\Desktop\\test17.csv";
		private static final String FILE_NAME_WITH_PATH_18 = "C:\\Users\\Saurabh\\Desktop\\test18.csv";
		private static final String FILE_NAME_WITH_PATH_19 = "C:\\Users\\Saurabh\\Desktop\\test19.csv";
		private static final String FILE_NAME_WITH_PATH_20 = "C:\\Users\\Saurabh\\Desktop\\test20.csv";
		
		private static final String FILE_NAME_WITH_PATH_21 = "C:\\Users\\Saurabh\\Desktop\\test21.csv";
		private static final String FILE_NAME_WITH_PATH_22 = "C:\\Users\\Saurabh\\Desktop\\test22.csv";
		private static final String FILE_NAME_WITH_PATH_23 = "C:\\Users\\Saurabh\\Desktop\\test23.csv";
		private static final String FILE_NAME_WITH_PATH_24 = "C:\\Users\\Saurabh\\Desktop\\test24.csv";
		private static final String FILE_NAME_WITH_PATH_25 = "C:\\Users\\Saurabh\\Desktop\\test25.csv";
		private static final String FILE_NAME_WITH_PATH_26 = "C:\\Users\\Saurabh\\Desktop\\test26.csv";
		private static final String FILE_NAME_WITH_PATH_27 = "C:\\Users\\Saurabh\\Desktop\\test27.csv";
		private static final String FILE_NAME_WITH_PATH_28 = "C:\\Users\\Saurabh\\Desktop\\test28.csv";
		private static final String FILE_NAME_WITH_PATH_29 = "C:\\Users\\Saurabh\\Desktop\\test29.csv";
		private static final String FILE_NAME_WITH_PATH_30 = "C:\\Users\\Saurabh\\Desktop\\test30.csv";
		
		private static final String FILE_NAME_WITH_PATH_31 = "C:\\Users\\Saurabh\\Desktop\\test31.csv";
		private static final String FILE_NAME_WITH_PATH_32 = "C:\\Users\\Saurabh\\Desktop\\test32.csv";
		private static final String FILE_NAME_WITH_PATH_33 = "C:\\Users\\Saurabh\\Desktop\\test33.csv";
		private static final String FILE_NAME_WITH_PATH_34 = "C:\\Users\\Saurabh\\Desktop\\test34.csv";
		private static final String FILE_NAME_WITH_PATH_35 = "C:\\Users\\Saurabh\\Desktop\\test35.csv";
		private static final String FILE_NAME_WITH_PATH_36 = "C:\\Users\\Saurabh\\Desktop\\test36.csv";
		private static final String FILE_NAME_WITH_PATH_37 = "C:\\Users\\Saurabh\\Desktop\\test37.csv";
		private static final String FILE_NAME_WITH_PATH_38 = "C:\\Users\\Saurabh\\Desktop\\test38.csv";
		private static final String FILE_NAME_WITH_PATH_39 = "C:\\Users\\Saurabh\\Desktop\\test39.csv";
		private static final String FILE_NAME_WITH_PATH_40 = "C:\\Users\\Saurabh\\Desktop\\test40.csv";
		
		private static final String FILE_NAME_WITH_PATH_41 = "C:\\Users\\Saurabh\\Desktop\\test41.csv";
		private static final String FILE_NAME_WITH_PATH_42 = "C:\\Users\\Saurabh\\Desktop\\test42.csv";
		private static final String FILE_NAME_WITH_PATH_43 = "C:\\Users\\Saurabh\\Desktop\\test43.csv";
		private static final String FILE_NAME_WITH_PATH_44 = "C:\\Users\\Saurabh\\Desktop\\test44.csv";
		private static final String FILE_NAME_WITH_PATH_45 = "C:\\Users\\Saurabh\\Desktop\\test45.csv";
		private static final String FILE_NAME_WITH_PATH_46 = "C:\\Users\\Saurabh\\Desktop\\test46.csv";
		private static final String FILE_NAME_WITH_PATH_47 = "C:\\Users\\Saurabh\\Desktop\\test47.csv";
		private static final String FILE_NAME_WITH_PATH_48 = "C:\\Users\\Saurabh\\Desktop\\test48.csv";
		private static final String FILE_NAME_WITH_PATH_49 = "C:\\Users\\Saurabh\\Desktop\\test49.csv";
		private static final String FILE_NAME_WITH_PATH_50 = "C:\\Users\\Saurabh\\Desktop\\test50.csv";
		
		private static final String FILE_NAME_WITH_PATH_51 = "C:\\Users\\Saurabh\\Desktop\\test51.csv";
		private static final String FILE_NAME_WITH_PATH_52 = "C:\\Users\\Saurabh\\Desktop\\test52.csv";
		private static final String FILE_NAME_WITH_PATH_53 = "C:\\Users\\Saurabh\\Desktop\\test53.csv";
		private static final String FILE_NAME_WITH_PATH_54 = "C:\\Users\\Saurabh\\Desktop\\test54.csv";
		private static final String FILE_NAME_WITH_PATH_55 = "C:\\Users\\Saurabh\\Desktop\\test55.csv";
	