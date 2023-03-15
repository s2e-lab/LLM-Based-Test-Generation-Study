// Dot_4Test.java
package net.sourceforge.schemaspy.util;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import net.sourceforge.schemaspy.Config;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Dot}.
* It contains ten unit test cases for the {@link Dot#supportsRenderer(String)} method.
*/
class Dot_4Test {

		private static final String DOT_EXE = "dot";
		
		private static final String DOT_VERSION = "2.8";
		
		private static final String DOT_VERSION_LINE = "dot version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_2 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_3 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_4 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_5 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_6 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_7 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_8 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_9 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_10 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_11 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_12 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_13 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_14 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_15 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_16 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_17 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_18 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_19 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_20 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_21 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_22 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_23 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_24 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_25 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_26 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_27 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_28 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_29 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_30 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_31 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_32 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_33 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_34 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_35 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_36 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_37 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_38 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_39 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_40 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_41 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_42 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_43 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_44 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_45 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_46 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_47 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_48 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_49 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_50 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_51 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_52 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_53 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_54 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_55 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_56 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_57 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_58 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_59 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_60 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_61 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_62 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_63 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_64 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_65 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_66 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_67 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_68 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_69 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_70 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_71 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_72 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_73 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_74 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_75 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_76 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_77 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_78 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_79 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_80 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_81 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_82 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_83 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_84 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_85 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_86 = "dot - Graphviz version " + DOT_VERSION + " (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String DOT_VERSION_LINE_