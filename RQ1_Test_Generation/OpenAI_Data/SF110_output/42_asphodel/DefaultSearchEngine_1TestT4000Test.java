// DefaultSearchEngine_1Test.java
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
class DefaultSearchEngine_1Test {
private static final Log log = LogFactory.getLog(DefaultSearchEngine_1Test.class);
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
		private static final Document document = ftrRecord.getDocument();
		private static final java.util.List<Field> fields = document.getFields();
		private static final Field field = fields.get(0);
		private static final String name = field.name();
		private static final String stringValue = field.stringValue();
		private static final float boost = field.getBoost();
		private static final boolean isStored = field.isStored();
		private static final boolean isIndexed = field.isIndexed();
		private static final boolean isTokenized = field.isTokenized();
		private static final boolean isBinary = field.isBinary();
		private static final boolean isCompressed = field.isCompressed();
		private static final boolean isLazy = field.isLazy();
		private static final boolean isOmitNorms = field.isOmitNorms();
		private static final boolean isOmitTermFreqAndPositions = field.isOmitTermFreqAndPositions();
		private static final boolean isStoreOffsetWithTermVector = field.isStoreOffsetWithTermVector();
		private static final boolean isStorePositionWithTermVector = field.isStorePositionWithTermVector();
		private static final boolean isStoreTermVector = field.isStoreTermVector();
		private static final boolean isBinaryOffsetWithTermVector = field.isBinaryOffsetWithTermVector();
		private static final boolean isBinaryPositionWithTermVector = field.isBinaryPositionWithTermVector();
		private static final boolean isBinaryTermVector = field.isBinaryTermVector();
		private static final boolean isLazyWithTermVector = field.isLazyWithTermVector();
		private static final boolean isOmitNormsWithTermVector = field.isOmitNormsWithTermVector();
		private static final boolean isOmitTermFreqAndPositionsWithTermVector = field.isOmitTermFreqAndPositionsWithTermVector();
		private static final boolean isStoreOffsetWithTermVectorWithTermVector = field.isStoreOffsetWithTermVectorWithTermVector();
		private static final boolean isStorePositionWithTermVectorWithTermVector = field.isStorePositionWithTermVectorWithTermVector();
		private static final boolean isStoreTermVectorWithTermVector = field.isStoreTermVectorWithTermVector();
		private static final boolean isBinaryOffsetWithTermVectorWithTermVector = field.isBinaryOffsetWithTermVectorWithTermVector();
		private static final boolean isBinaryPositionWithTermVectorWithTermVector = field.isBinaryPositionWithTermVectorWithTermVector();
		private static final boolean isBinaryTermVectorWithTermVector = field.isBinaryTermVectorWithTermVector();
		private static final boolean isLazyWithTermVectorWithTermVector = field.isLazyWithTermVectorWithTermVector();
		private static final boolean isOmitNormsWithTermVectorWithTermVector = field.isOmitNormsWithTermVectorWithTermVector();
		private static final boolean isOmitTermFreqAndPositionsWithTermVectorWithTermVector = field.isOmitTermFreqAndPositionsWithTermVectorWithTermVector();
		private static final boolean isStoreOffsetWithTermVectorWithTermVectorWithTermVector = field.isStoreOffsetWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStorePositionWithTermVectorWithTermVectorWithTermVector = field.isStorePositionWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStoreTermVectorWithTermVectorWithTermVector = field.isStoreTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryOffsetWithTermVectorWithTermVectorWithTermVector = field.isBinaryOffsetWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryPositionWithTermVectorWithTermVectorWithTermVector = field.isBinaryPositionWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryTermVectorWithTermVectorWithTermVector = field.isBinaryTermVectorWithTermVectorWithTermVector();
		private static final boolean isLazyWithTermVectorWithTermVectorWithTermVector = field.isLazyWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isOmitNormsWithTermVectorWithTermVectorWithTermVector = field.isOmitNormsWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isOmitTermFreqAndPositionsWithTermVectorWithTermVectorWithTermVector = field.isOmitTermFreqAndPositionsWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStoreOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStoreOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStorePositionWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStorePositionWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStoreTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStoreTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryPositionWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryPositionWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isLazyWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isLazyWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isOmitNormsWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isOmitNormsWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isOmitTermFreqAndPositionsWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isOmitTermFreqAndPositionsWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStoreOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStoreOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStorePositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStorePositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStoreTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStoreTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryPositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryPositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isLazyWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isLazyWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isOmitNormsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isOmitNormsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isOmitTermFreqAndPositionsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isOmitTermFreqAndPositionsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStoreOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStoreOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStorePositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStorePositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStoreTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStoreTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryPositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryPositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isLazyWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isLazyWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isOmitNormsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isOmitNormsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isOmitTermFreqAndPositionsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isOmitTermFreqAndPositionsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStoreOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStoreOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStorePositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStorePositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStoreTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStoreTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryPositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryPositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isLazyWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isLazyWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isOmitNormsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isOmitNormsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isOmitTermFreqAndPositionsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isOmitTermFreqAndPositionsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStoreOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStoreOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStorePositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStorePositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStoreTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStoreTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryPositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryPositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isBinaryTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isBinaryTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isLazyWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isLazyWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isOmitNormsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isOmitNormsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isOmitTermFreqAndPositionsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isOmitTermFreqAndPositionsWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStoreOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStoreOffsetWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStorePositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStorePositionWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector();
		private static final boolean isStoreTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVectorWithTermVector = field.isStoreTermVectorWithTermVectorWith