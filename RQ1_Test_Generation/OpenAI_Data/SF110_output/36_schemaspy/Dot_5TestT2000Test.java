// Dot_5Test.java
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
* It contains ten unit test cases for the {@link Dot#generateDiagram(File, File)} method.
*/
class Dot_5Test {

		private static final String DOT_EXE = "dot";
		
		private static final String DOT_VERSION = "2.2.1";
		
		private static final String DOT_FORMAT = "png";
		
		private static final String DOT_RENDERER = "";
		
		private static final String DOT_FILE_NAME = "test.dot";
		
		private static final String DOT_FILE_CONTENT = "digraph G {Hello->World}";
		
		private static final String DIAGRAM_FILE_NAME = "test.png";
		
		private static final String DIAGRAM_FILE_CONTENT = "";
		
		private static final String MAP_FILE_CONTENT = "";
		
		private static final String DOT_COMMAND = "dot -Tpng: test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_RENDERER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_RENDERER_AND_FORMATTER = "dot -Tpng:cairo:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_RENDERER = "dot -Tpng:cairo:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_RENDERER_AND_FORMATTER = "dot -Tpng:cairo:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_RENDERER_AND_FORMATTER_AND_FORMATTER = "dot -Tpng:cairo:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_RENDERER_AND_FORMATTER_AND_RENDERER = "dot -Tpng:cairo:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_RENDERER_AND_RENDERER = "dot -Tpng:cairo:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_RENDERER_AND_FORMATTER_AND_FORMATTER_AND_RENDERER = "dot -Tpng:cairo:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_RENDERER_AND_FORMATTER_AND_RENDERER = "dot -Tpng:cairo:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_RENDERER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_RENDERER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_RENDERER_AND_FORMATTER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_RENDERER_AND_FORMATTER_AND_RENDERER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_RENDERER_AND_RENDERER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_RENDERER_AND_FORMATTER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_RENDERER_AND_FORMATTER_AND_RENDERER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_RENDERER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_RENDERER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_RENDERER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_FORMATTER_AND_RENDERER = "dot -Tpng:gd test.dot -o test.png -Tcmapx";
		
		private static final String DOT_COMMAND_WITH_FORMATTER_AND_FORMATTER_AND_FORMATTER_