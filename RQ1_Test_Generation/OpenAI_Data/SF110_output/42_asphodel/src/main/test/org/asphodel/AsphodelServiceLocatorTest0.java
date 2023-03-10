// AsphodelServiceLocatorTest0.java
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
class AsphodelServiceLocatorTest0 {

	@Test
	void testGetAnalyzer() {
		Analyzer analyzer = AsphodelServiceLocator.getAnalyzer();
		assertTrue(analyzer instanceof CJKAnalyzer);
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
		
	@Test
	void testGetIndexEngine() {
		IndexEngine indexEngine = AsphodelServiceLocator.getIndexEngine("/tmp/asphodel");
		assertTrue(indexEngine instanceof DefaultIndexEngine);
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
		
	@Test
	void testGetSearchEngine() {
		SearchEngine searchEngine = AsphodelServiceLocator.getSearchEngine();
		assertTrue(searchEngine instanceof DefaultSearchEngine);
	}
}

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
		
	@Test
	void testGetRepositoryManager() {
		RepositoryManager repositoryManager = AsphodelServiceLocator.getRepositoryManager();
		assertTrue(repositoryManager instanceof DefaultRepositoryManager);
	}
}

// AsphodelServiceLocatorTest4.java
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
* It contains ten unit test cases for the {@link AsphodelServiceLocator#getTimeService()} method.
*/
class AsphodelServiceLocatorTest4 {
		
	@Test
	void testGetTimeService() {
		AsphodelTimeService timeService = AsphodelServiceLocator.getTimeService();
		assertTrue(timeService instanceof DefaultTimeServiceImpl);
	}
}

// AsphodelServiceLocatorTest5.java
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
* It contains ten unit test cases for the {@link AsphodelServiceLocator#getTimeService()} method.
*/
class AsphodelServiceLocatorTest5 {
		
	@Test
	void testGetTimeService() {
		AsphodelTimeService timeService = AsphodelServiceLocator.getTimeService();
		assertTrue(timeService instanceof DefaultTimeServiceImpl);
	}
}

// AsphodelServiceLocatorTest6.java
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
* It contains ten unit test cases for the {@link AsphodelServiceLocator#getTimeService()} method.
*/
class AsphodelServiceLocatorTest6 {
		
	@Test
	void testGetTimeService() {
		AsphodelTimeService timeService = AsphodelServiceLocator.getTimeService();
		assertTrue(timeService instanceof DefaultTimeServiceImpl);
	}
}

// AsphodelServiceLocatorTest7.java
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
* It contains ten unit test cases for the {@link AsphodelServiceLocator#getTimeService()} method.
*/
class AsphodelServiceLocatorTest7 {
		
	@Test
	void testGetTimeService() {
		AsphodelTimeService timeService = AsphodelServiceLocator.getTimeService();
		assertTrue(timeService instanceof DefaultTimeServiceImpl);
	}
}

// AsphodelServiceLocatorTest8.java
package org.asphodel;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.cjk.CJKAnalyzer;
import org.asphodel.index.IndexEngine;
import org.asphodel.index.DefaultIndexEngine;