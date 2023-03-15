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
		
		private static final String renderer = ":gd";
		
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
		
		private static final String versionLine40 = "dot - Graphviz version 2.49.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine41 = "dot - Graphviz version 2.50.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine42 = "dot - Graphviz version 2.51.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine43 = "dot - Graphviz version 2.52.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine44 = "dot - Graphviz version 2.53.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine45 = "dot - Graphviz version 2.54.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine46 = "dot - Graphviz version 2.55.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine47 = "dot - Graphviz version 2.56.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine48 = "dot - Graphviz version 2.57.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine49 = "dot - Graphviz version 2.58.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine50 = "dot - Graphviz version 2.59.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine51 = "dot - Graphviz version 2.60.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine52 = "dot - Graphviz version 2.61.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine53 = "dot - Graphviz version 2.62.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine54 = "dot - Graphviz version 2.63.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine55 = "dot - Graphviz version 2.64.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine56 = "dot - Graphviz version 2.65.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine57 = "dot - Graphviz version 2.66.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine58 = "dot - Graphviz version 2.67.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine59 = "dot - Graphviz version 2.68.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine60 = "dot - Graphviz version 2.69.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine61 = "dot - Graphviz version 2.70.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine62 = "dot - Graphviz version 2.71.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine63 = "dot - Graphviz version 2.72.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine64 = "dot - Graphviz version 2.73.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine65 = "dot - Graphviz version 2.74.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine66 = "dot - Graphviz version 2.75.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine67 = "dot - Graphviz version 2.76.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine68 = "dot - Graphviz version 2.77.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine69 = "dot - Graphviz version 2.78.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine70 = "dot - Graphviz version 2.79.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine71 = "dot - Graphviz version 2.80.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine72 = "dot - Graphviz version 2.81.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine73 = "dot - Graphviz version 2.82.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine74 = "dot - Graphviz version 2.83.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine75 = "dot - Graphviz version 2.84.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine76 = "dot - Graphviz version 2.85.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine77 = "dot - Graphviz version 2.86.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine78 = "dot - Graphviz version 2.87.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine79 = "dot - Graphviz version 2.88.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine80 = "dot - Graphviz version 2.89.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine81 = "dot - Graphviz version 2.90.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine82 = "dot - Graphviz version 2.91.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine83 = "dot - Graphviz version 2.92.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine84 = "dot - Graphviz version 2.93.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";
		
		private static final String versionLine85 = "dot - Graphviz version 2.94.20061004.0440 (Wed Oct 4 21:01:52 GMT 2006)";