// ZimWikiBot_2Test.java
package net.sourceforge.jwbf.zim.bots;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashSet;
import java.util.Set;
import net.sourceforge.jwbf.core.actions.util.ActionException;
import net.sourceforge.jwbf.core.actions.util.ProcessException;
import net.sourceforge.jwbf.core.bots.WikiBot;
import net.sourceforge.jwbf.core.bots.util.CacheHandler;
import net.sourceforge.jwbf.core.contentRep.Article;
import net.sourceforge.jwbf.core.contentRep.SimpleArticle;
import net.sourceforge.jwbf.core.contentRep.Userinfo;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ZimWikiBot}.
* It contains ten unit test cases for the {@link ZimWikiBot#readData(String, int)} method.
*/
class ZimWikiBot_2Test {

	/**
	 * Test method for {@link ZimWikiBot#readData(String, int)}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testReadData() throws ActionException, ProcessException {
		// create a new ZimWikiBot
		ZimWikiBot zimBot = new ZimWikiBot("/home/martin/Desktop/zim/");
		// create a new SimpleArticle
		SimpleArticle sa = zimBot.readData("Test", 0);
		// create a new File
		File f = new File("/home/martin/Desktop/zim/Test.txt");
		// create a new StringBuffer
		StringBuffer text = new StringBuffer();
		// create a file reader
		BufferedReader myInput = null;
		try {
			myInput = new BufferedReader(new FileReader(f));
			String line = "";
			String cont = "";
			// if we are reading content, than
			while ((line = myInput.readLine()) != null) {
				// omit the headline
				if (line.startsWith("====== Test ======")) {
					// store every line in 'text' and add a newline
					while ((cont = myInput.readLine()) != null) {
						text.append(cont + "\n");
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (myInput != null)
					myInput.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		// compare the content of the SimpleArticle with the content of the file
		assertEquals(sa.getText(), text.toString());
	}
	
	/**
	 * Test method for {@link ZimWikiBot#readData(String, int)}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testReadData2() throws ActionException, ProcessException {
		// create a new ZimWikiBot
		ZimWikiBot zimBot = new ZimWikiBot("/home/martin/Desktop/zim/");
		// create a new SimpleArticle
		SimpleArticle sa = zimBot.readData("Test", 0);
		// create a new File
		File f = new File("/home/martin/Desktop/zim/Test.txt");
		// create a new StringBuffer
		StringBuffer text = new StringBuffer();
		// create a file reader
		BufferedReader myInput = null;
		try {
			myInput = new BufferedReader(new FileReader(f));
			String line = "";
			String cont = "";
			// if we are reading content, than
			while ((line = myInput.readLine()) != null) {
				// omit the headline
				if (line.startsWith("====== Test ======")) {
					// store every line in 'text' and add a newline
					while ((cont = myInput.readLine()) != null) {
						text.append(cont + "\n");
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (myInput != null)
					myInput.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		// compare the content of the SimpleArticle with the content of the file
		assertEquals(sa.getText(), text.toString());
	}
	
	/**
	 * Test method for {@link ZimWikiBot#readData(String, int)}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testReadData3() throws ActionException, ProcessException {
		// create a new ZimWikiBot
		ZimWikiBot zimBot = new ZimWikiBot("/home/martin/Desktop/zim/");
		// create a new SimpleArticle
		SimpleArticle sa = zimBot.readData("Test", 0);
		// create a new File
		File f = new File("/home/martin/Desktop/zim/Test.txt");
		// create a new StringBuffer
		StringBuffer text = new StringBuffer();
		// create a file reader
		BufferedReader myInput = null;
		try {
			myInput = new BufferedReader(new FileReader(f));
			String line = "";
			String cont = "";
			// if we are reading content, than
			while ((line = myInput.readLine()) != null) {
				// omit the headline
				if (line.startsWith("====== Test ======")) {
					// store every line in 'text' and add a newline
					while ((cont = myInput.readLine()) != null) {
						text.append(cont + "\n");
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (myInput != null)
					myInput.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		// compare the content of the SimpleArticle with the content of the file
		assertEquals(sa.getText(), text.toString());
	}
	
	/**
	 * Test method for {@link ZimWikiBot#readData(String, int)}.
	 * @throws ActionException 
	 * @throws ProcessException 
	 */
	@Test
	void testReadData4() throws ActionException, ProcessException {
		// create a new ZimWikiBot
		ZimWikiBot zimBot = new ZimWikiBot("/home/martin/Desktop/zim/");
		// create a new SimpleArticle
		SimpleArticle sa = zimBot.readData("Test", 0);
		// create a new File
		File f = new File("/home/martin/Desktop/zim/Test.txt");
		// create a new StringBuffer
		StringBuffer text = new StringBuffer();
		// create a file reader
		BufferedReader myInput = null;
		try {
			myInput = new BufferedReader(new FileReader(f));
			String line = "";
			String cont = "";
			// if we are reading content, than
			while ((line = myInput.readLine()) != null) {
				// omit the headline
				if (line.startsWith("====== Test ======")) {
					// store every line in 'text' and add a newline
					while ((cont = myInput.readLine()) != null) {
						text.append(cont + "\n");
					}
				}
			}
		} catch (Exception e) {
			throw new RuntimeException(e);
		} finally {
			try {
				if (myInput != null)
					myInput.close();
			} catch (IOException e) {
				throw new RuntimeException(e);
			}
		}
		// compare the content of the SimpleArticle with the content of the file
		assertEquals(sa.getText