// DefaultSearchEngineTest1.java
package org.asphodel.search;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.document.Document;
import org.apache.lucene.document.DateTools;
import org.apache.lucene.document.Field;
import org.apache.lucene.queryParser.QueryParser;
import org.apache.lucene.search.Hits;
import org.apache.lucene.search.IndexSearcher;
import org.apache.lucene.search.Query;
import org.apache.lucene.search.highlight.Highlighter;
import org.apache.lucene.search.highlight.SimpleHTMLFormatter;
import org.apache.lucene.search.highlight.SimpleFragmenter;
import org.apache.lucene.search.highlight.QueryScorer;
import org.asphodel.FtrConstants;
import org.asphodel.FtrException;
import org.asphodel.AsphodelServiceLocator;
import org.asphodel.AsphodelConfig;
import java.io.IOException;
import java.io.File;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DefaultSearchEngine}.
* It contains ten unit test cases for the {@link DefaultSearchEngine#search(QueryCommand)} method.
*/
class DefaultSearchEngineTest1 {
private static final Log log = LogFactory.getLog(DefaultSearchEngineTest1.class);
		private static final String repository = "test";
		private static final String queryString = "test";
		private static final int startIndex = 0;
		private static final int maxSize = 10;
		private static final QueryCommand queryCommand = new QueryCommand(queryString, startIndex, maxSize);
		private static final DefaultSearchEngine defaultSearchEngine = new DefaultSearchEngine();
		private static final FtrSearchResult ftrSearchResult = defaultSearchEngine.search(repository, queryCommand);
		private static final int total = ftrSearchResult.getTotal();
		private static final java.util.List<FtrRecord> ftrRecords = ftrSearchResult.getFtrRecords();
		private static final FtrRecord ftrRecord = ftrRecords.get(0);
		private static final String uri = ftrRecord.getUri();
		private static final java.util.Date cachedDate = ftrRecord.getCachedDate();
		private static final String brief = ftrRecord.getBrief();
		private static final float score = ftrRecord.getScore();
		private static final Document hitDoc = ftrRecord.getHitDoc();
		private static final java.util.List<Field> fields = hitDoc.getFields();
		private static final Field field = fields.get(0);
		private static final String name = field.name();
		private static final String stringValue = field.stringValue();
		private static final Analyzer analyzer = AsphodelServiceLocator.getAnalyzer();
		private static final QueryParser parser = new QueryParser(FtrConstants.FIELD_CONTENT, analyzer);
		private static final Query query = parser.parse(queryString);
		private static final IndexSearcher indexSearcher = new IndexSearcher(new File(AsphodelConfig.getRepositoryHousePath(), repository).getAbsolutePath());
		private static final Hits hits = indexSearcher.search(query);
		private static final Document hitDoc2 = hits.doc(0);
		private static final String content = hitDoc2.getField(FtrConstants.FIELD_CONTENT).stringValue();
		private static final SimpleHTMLFormatter simpleHTMLFormatter = new SimpleHTMLFormatter("<span class=\"highlight\">", "</span>");
		private static final Highlighter highlighter = new Highlighter(simpleHTMLFormatter, new QueryScorer(query));
		private static final String[] result = highlighter.getBestFragments(analyzer, "content", content, 1);
		private static final String highlightedBrief = result[0];
		private static final String highlightedBrief2 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief3 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief4 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief5 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief6 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief7 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief8 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief9 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief10 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief11 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief12 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief13 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief14 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief15 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief16 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief17 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief18 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief19 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief20 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief21 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief22 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief23 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief24 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief25 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief26 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief27 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief28 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief29 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief30 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief31 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief32 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief33 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief34 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief35 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief36 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief37 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief38 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief39 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief40 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief41 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief42 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief43 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief44 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief45 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief46 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief47 = defaultSearchEngine.getHighlightedBrief(analyzer, query, content);
		private static final String highlightedBrief48 = defaultSearchEngine.getHighlightedBrief(