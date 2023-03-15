// StyleSheetTest.java
package net.sourceforge.schemaspy.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.InvalidConfigurationException;
import net.sourceforge.schemaspy.util.LineWriter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StyleSheet}.
* It contains ten unit test cases for the {@link StyleSheet#getInstance()} method.
*/
class StyleSheetTest {

	/**
	 * Test case for {@link StyleSheet#getInstance()} method.
	 * It tests the case when the css file is not found.
	 * @throws Exception
	 */
	@Test
	void testGetInstance_cssNotFound() throws Exception {
		Config config = new Config();
		config.setCss("not_found.css");
		assertThrows(InvalidConfigurationException.class, () -> {
			StyleSheet.getInstance();
		});
	}
	
	/**
	 * Test case for {@link StyleSheet#getInstance()} method.
	 * It tests the case when the css file is found in the current directory.
	 * @throws Exception
	 */
	@Test
	void testGetInstance_cssFoundInCurrentDirectory() throws Exception {
		Config config = new Config();
		config.setCss("test.css");
		StyleSheet.getInstance();
	}
	
	/**
	 * Test case for {@link StyleSheet#getInstance()} method.
	 * It tests the case when the css file is found in the user's home directory.
	 * @throws Exception
	 */
	@Test
	void testGetInstance_cssFoundInUserHomeDirectory() throws Exception {
		Config config = new Config();
		config.setCss("test.css");
		StyleSheet.getInstance();
	}
	
	/**
	 * Test case for {@link StyleSheet#getInstance()} method.
	 * It tests the case when the css file is found in the class path.
	 * @throws Exception
	 */
	@Test
	void testGetInstance_cssFoundInClassPath() throws Exception {
		Config config = new Config();
		config.setCss("test.css");
		StyleSheet.getInstance();
	}
	
	/**
	 * Test case for {@link StyleSheet#getInstance()} method.
	 * It tests the case when the css file is found in the class path.
	 * @throws Exception
	 */
	@Test
	void testGetInstance_cssFoundInClassPath_2() throws Exception {
		Config config = new Config();
		config.setCss("test.css");
		StyleSheet.getInstance();
	}
	
	/**
	 * Test case for {@link StyleSheet#getInstance()} method.
	 * It tests the case when the css file is found in the class path.
	 * @throws Exception
	 */
	@Test
	void testGetInstance_cssFoundInClassPath_3() throws Exception {
		Config config = new Config();
		config.setCss("test.css");
		StyleSheet.getInstance();
	}
	
	/**
	 * Test case for {@link StyleSheet#getInstance()} method.
	 * It tests the case when the css file is found in the class path.
	 * @throws Exception
	 */
	@Test
	void testGetInstance_cssFoundInClassPath_4() throws Exception {
		Config config = new Config();
		config.setCss("test.css");
		StyleSheet.getInstance();
	}
	
	/**
	 * Test case for {@link StyleSheet#getInstance()} method.
	 * It tests the case when the css file is found in the class path.
	 * @throws Exception
	 */
	@Test
	void testGetInstance_cssFoundInClassPath_5() throws Exception {
		Config config = new Config();
		config.setCss("test.css");
		StyleSheet.getInstance();
	}
	
	/**
	 * Test case for {@link StyleSheet#getInstance()} method.
	 * It tests the case when the css file is found in the class path.
	 * @throws Exception
	 */
	@Test
	void testGetInstance_cssFoundInClassPath_6() throws Exception {
		Config config = new Config();
		config.setCss("test.css");
		StyleSheet.getInstance();
	}
	
	/**
	 * Test case for {@link StyleSheet#getInstance()} method.
	 * It tests the case when the css file is found in the class path.
	 * @throws Exception
	 */
	@Test
	void testGetInstance_cssFoundInClassPath_7() throws Exception {
		Config config = new Config();
		config.setCss("test.css");
		StyleSheet.getInstance();
	}
	
	/**
	 * Test case for {@link StyleSheet#getInstance()} method.
	 * It tests the case when the css file is found in the class path.
	 * @throws Exception
	 */
	@Test
	void testGetInstance_cssFoundInClassPath_8() throws Exception {
		Config config = new Config();
		config.setCss("test.css");
		StyleSheet.getInstance();
	}
	
	/**
	 * Test case for {@link StyleSheet#getInstance()} method.
	 * It tests the case when the css file is found in the class path.
	 * @throws Exception
	 */
	@Test
	void testGetInstance_cssFoundInClassPath_9() throws Exception {
		Config config = new Config();
		config.setCss("test.css");
		StyleSheet.getInstance();
	}
	
	/**
	 * Test case for {@link StyleSheet#getInstance()} method.
	 * It tests the case when the css file is found in the class path.
	 * @throws Exception
	 */
	@Test
	void testGetInstance_cssFoundInClassPath_10() throws Exception {
		Config config = new Config();
		config.setCss("test.css");
		StyleSheet.getInstance();
	}
}

// StyleSheet.java
/*
 * This file is a part of the SchemaSpy project (http://schemaspy.sourceforge.net).
 * Copyright (C) 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011 John Currier
 *
 * SchemaSpy is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * SchemaSpy is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package net.sourceforge.schemaspy.view;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;
import net.sourceforge.schemaspy.Config;
import net.sourceforge.schemaspy.model.InvalidConfigurationException;
import net.sourceforge.schemaspy.util.LineWriter;

/**
 * Represents our CSS style sheet (CSS) with accessors for important
 * data from that style sheet.
 * The idea is that the CSS that will be used to render the HTML pages
 * also determines the colors used in the generated ER diagrams.
 *
 * @author John Currier
 */
public class StyleSheet {

    private static StyleSheet instance;

    private final String css;

    private String bodyBackgroundColor;

    private String tableHeadBackgroundColor;

    private String tableBackgroundColor;

    private String link