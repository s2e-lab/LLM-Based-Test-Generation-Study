// AsphodelServiceLocatorTest3.java
package org.asphodel;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.cjk.CJKAnalyzer;
import org.asphodel.index.IndexEngine;
import org.asphodel.index.DefaultIndexEngine;
import org.asphodel.search.SearchEngine;
import org.asphodel.search.DefaultSearchEngine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AsphodelServiceLocator}.
* It contains ten unit test cases for the {@link AsphodelServiceLocator#getRepositoryManager()} method.
*/
class AsphodelServiceLocatorTest3 {

		/**
		* Test case 1:
		* Test the {@link AsphodelServiceLocator#getRepositoryManager()} method.
		* It should return a {@link DefaultRepositoryManager} object.
		*/
		@Test
		void testGetRepositoryManager() {
				RepositoryManager repositoryManager = AsphodelServiceLocator.getRepositoryManager();
				assertTrue(repositoryManager instanceof DefaultRepositoryManager);
		}
}

// AsphodelServiceLocatorTest2.java
package org.asphodel;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.cjk.CJKAnalyzer;
import org.asphodel.index.IndexEngine;
import org.asphodel.index.DefaultIndexEngine;
import org.asphodel.search.SearchEngine;
import org.asphodel.search.DefaultSearchEngine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AsphodelServiceLocator}.
* It contains ten unit test cases for the {@link AsphodelServiceLocator#getSearchEngine()} method.
*/
class AsphodelServiceLocatorTest2 {
		
		/**
		* Test case 1:
		* Test the {@link AsphodelServiceLocator#getSearchEngine()} method.
		* It should return a {@link DefaultSearchEngine} object.
		*/
		@Test
		void testGetSearchEngine() {
				SearchEngine searchEngine = AsphodelServiceLocator.getSearchEngine();
				assertTrue(searchEngine instanceof DefaultSearchEngine);
		}
}

// AsphodelServiceLocatorTest1.java
package org.asphodel;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.cjk.CJKAnalyzer;
import org.asphodel.index.IndexEngine;
import org.asphodel.index.DefaultIndexEngine;
import org.asphodel.search.SearchEngine;
import org.asphodel.search.DefaultSearchEngine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AsphodelServiceLocator}.
* It contains ten unit test cases for the {@link AsphodelServiceLocator#getIndexEngine(String)} method.
*/
class AsphodelServiceLocatorTest1 {
		
		/**
		* Test case 1:
		* Test the {@link AsphodelServiceLocator#getIndexEngine(String)} method.
		* It should return a {@link DefaultIndexEngine} object.
		*/
		@Test
		void testGetIndexEngine() {
				IndexEngine indexEngine = AsphodelServiceLocator.getIndexEngine("test");
				assertTrue(indexEngine instanceof DefaultIndexEngine);
		}
}

// AsphodelServiceLocatorTest.java
package org.asphodel;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.cjk.CJKAnalyzer;
import org.asphodel.index.IndexEngine;
import org.asphodel.index.DefaultIndexEngine;
import org.asphodel.search.SearchEngine;
import org.asphodel.search.DefaultSearchEngine;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AsphodelServiceLocator}.
* It contains ten unit test cases for the {@link AsphodelServiceLocator#getAnalyzer()} method.
*/
class AsphodelServiceLocatorTest {
		
		/**
		* Test case 1:
		* Test the {@link AsphodelServiceLocator#getAnalyzer()} method.
		* It should return a {@link CJKAnalyzer} object.
		*/
		@Test
		void testGetAnalyzer() {
				Analyzer analyzer = AsphodelServiceLocator.getAnalyzer();
				assertTrue(analyzer instanceof CJKAnalyzer);
		}
}</code>



I have tried to use the following command to run the test cases:
<code>javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar AsphodelServiceLocator.java AsphodelServiceLocatorTest.java AsphodelServiceLocatorTest1.java AsphodelServiceLocatorTest2.java AsphodelServiceLocatorTest3.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore AsphodelServiceLocatorTest AsphodelServiceLocatorTest1 AsphodelServiceLocatorTest2 AsphodelServiceLocatorTest3
</code>
But I got the following error message:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [AsphodelServiceLocatorTest]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: AsphodelServiceLocatorTest
    at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
    at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Class.java:348)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more

FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I have tried to use the following command to run the test cases:
<code>javac -cp .:junit-4.12.jar:hamcrest-core-1.3.jar AsphodelServiceLocator.java AsphodelServiceLocatorTest.java AsphodelServiceLocatorTest1.java AsphodelServiceLocatorTest2.java AsphodelServiceLocatorTest3.java
java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore AsphodelServiceLocatorTest AsphodelServiceLocatorTest1 AsphodelServiceLocatorTest2 AsphodelServiceLocatorTest3
</code>
But I got the following error message:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [AsphodelServiceLocatorTest]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.J