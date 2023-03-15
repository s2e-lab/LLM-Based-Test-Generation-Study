// Dot_3Test.java
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
* It contains ten unit test cases for the {@link Dot#requiresGdRenderer()} method.
*/
class Dot_3Test {

		private static final Logger logger = Logger.getLogger(Dot_3Test.class.getName());
		
		private static final String lineSeparator = System.getProperty("line.separator");
		
		private static final String dotExe = "dot";
		
		private static final String format = "png";
		
		private static final String renderer = "";
		
		private static final Set<String> validatedRenderers = Collections.synchronizedSet(new HashSet<String>());
		
		private static final Set<String> invalidatedRenderers = Collections.synchronizedSet(new HashSet<String>());
		
		private static final String versionText = "2.8";
		
		private static final Version version = new Version(versionText);
		
		private static final Version supportedVersion = new Version("2.2.1");
		
		private static final Version badVersion = new Version("2.4");
		
		private static final String[] dotCommand = new String[] { dotExe, "-V" };
		
		private static final String versionLine = "dot version 2.8 (Fri Feb  3 22:38:53 UTC 2006)";
		
		private static final String versionLine2 = "dot - Graphviz version 2.9.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine3 = "dot - Graphviz version 2.12.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine4 = "dot - Graphviz version 2.13.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine5 = "dot - Graphviz version 2.14.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine6 = "dot - Graphviz version 2.15.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine7 = "dot - Graphviz version 2.16.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine8 = "dot - Graphviz version 2.17.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine9 = "dot - Graphviz version 2.18.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine10 = "dot - Graphviz version 2.19.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine11 = "dot - Graphviz version 2.20.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine12 = "dot - Graphviz version 2.21.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine13 = "dot - Graphviz version 2.22.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine14 = "dot - Graphviz version 2.23.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine15 = "dot - Graphviz version 2.24.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine16 = "dot - Graphviz version 2.25.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine17 = "dot - Graphviz version 2.26.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine18 = "dot - Graphviz version 2.27.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine19 = "dot - Graphviz version 2.28.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine20 = "dot - Graphviz version 2.29.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine21 = "dot - Graphviz version 2.30.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine22 = "dot - Graphviz version 2.31.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine23 = "dot - Graphviz version 2.32.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine24 = "dot - Graphviz version 2.33.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine25 = "dot - Graphviz version 2.34.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine26 = "dot - Graphviz version 2.35.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine27 = "dot - Graphviz version 2.36.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine28 = "dot - Graphviz version 2.37.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine29 = "dot - Graphviz version 2.38.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine30 = "dot - Graphviz version 2.39.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine31 = "dot - Graphviz version 2.40.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine32 = "dot - Graphviz version 2.41.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine33 = "dot - Graphviz version 2.42.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine34 = "dot - Graphviz version 2.43.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine35 = "dot - Graphviz version 2.44.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine36 = "dot - Graphviz version 2.45.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine37 = "dot - Graphviz version 2.46.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine38 = "dot - Graphviz version 2.47.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine39 = "dot - Graphviz version 2.48.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine40 = "dot - Graphviz version 2.49.2006