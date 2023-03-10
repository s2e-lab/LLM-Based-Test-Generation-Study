// DefaultSearchEngineTest0.java
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
* It contains ten unit test cases for the {@link DefaultSearchEngine#search(String, QueryCommand)} method.
*/
class DefaultSearchEngineTest0 {

		private static final Log log = LogFactory.getLog(DefaultSearchEngineTest0.class);
		
		private static final String repository = "test";
		
		private static final String queryString = "test";
		
		private static final String queryString0 = "test0";
		
		private static final String queryString1 = "test1";
		
		private static final String queryString2 = "test2";
		
		private static final String queryString3 = "test3";
		
		private static final String queryString4 = "test4";
		
		private static final String queryString5 = "test5";
		
		private static final String queryString6 = "test6";
		
		private static final String queryString7 = "test7";
		
		private static final String queryString8 = "test8";
		
		private static final String queryString9 = "test9";
		
		private static final String queryString10 = "test10";
		
		private static final String queryString11 = "test11";
		
		private static final String queryString12 = "test12";
		
		private static final String queryString13 = "test13";
		
		private static final String queryString14 = "test14";
		
		private static final String queryString15 = "test15";
		
		private static final String queryString16 = "test16";
		
		private static final String queryString17 = "test17";
		
		private static final String queryString18 = "test18";
		
		private static final String queryString19 = "test19";
		
		private static final String queryString20 = "test20";
		
		private static final String queryString21 = "test21";
		
		private static final String queryString22 = "test22";
		
		private static final String queryString23 = "test23";
		
		private static final String queryString24 = "test24";
		
		private static final String queryString25 = "test25";
		
		private static final String queryString26 = "test26";
		
		private static final String queryString27 = "test27";
		
		private static final String queryString28 = "test28";
		
		private static final String queryString29 = "test29";
		
		private static final String queryString30 = "test30";
		
		private static final String queryString31 = "test31";
		
		private static final String queryString32 = "test32";
		
		private static final String queryString33 = "test33";
		
		private static final String queryString34 = "test34";
		
		private static final String queryString35 = "test35";
		
		private static final String queryString36 = "test36";
		
		private static final String queryString37 = "test37";
		
		private static final String queryString38 = "test38";
		
		private static final String queryString39 = "test39";
		
		private static final String queryString40 = "test40";
		
		private static final String queryString41 = "test41";
		
		private static final String queryString42 = "test42";
		
		private static final String queryString43 = "test43";
		
		private static final String queryString44 = "test44";
		
		private static final String queryString45 = "test45";
		
		private static final String queryString46 = "test46";
		
		private static final String queryString47 = "test47";
		
		private static final String queryString48 = "test48";
		
		private static final String queryString49 = "test49";
		
		private static final String queryString50 = "test50";
		
		private static final String queryString51 = "test51";
		
		private static final String queryString52 = "test52";
		
		private static final String queryString53 = "test53";
		
		private static final String queryString54 = "test54";
		
		private static final String queryString55 = "test55";
		
		private static final String queryString56 = "test56";
		
		private static final String queryString57 = "test57";
		
		private static final String queryString58 = "test58";
		
		private static final String queryString59 = "test59";
		
		private static final String queryString60 = "test60";
		
		private static final String queryString61 = "test61";
		
		private static final String queryString62 = "test62";
		
		private static final String queryString63 = "test63";
		
		private static final String queryString64 = "test64";
		
		private static final String queryString65 = "test65";
		
		private static final String queryString66 = "test66";
		
		private static final String queryString67 = "test67";
		
		private static final String queryString68 = "test68";
		
		private static final String queryString69 = "test69";
		
		private static final String queryString70 = "test70";
		
		private static final String queryString71 = "test71";
		
		private static final String queryString72 = "test72";
		
		private static final String queryString73 = "test73";
		
		private static final String queryString74 = "test74";
		
		private static final String queryString75 = "test75";
		
		private static final String queryString76 = "test76";
		
		private static final String queryString77 = "test77";
		
		private static final String queryString78 = "test78";
		
		private static final String queryString79 = "test79";
		
		private static final String queryString80 = "test80";
		
		private static final String queryString81 = "test81";
		
		private static final String queryString82 = "test82";
		
		private static final String queryString83 = "test83";
		
		private static final String queryString84 = "test84";
		
		private static final String queryString85 = "test85";
		
		private static final String queryString86 = "test86";
		
		private static final String queryString87 = "test87";
		
		private static final String queryString88 = "test88";
		
		private static final String queryString89 = "test89";
		
		private static final String queryString90 = "test90";
		
		private static final String queryString91 = "test91";
		
		private static final String queryString92 = "test92";
		
		private static final String queryString93 = "test93";
		
		private static final String queryString94 = "test94";
		
		private static final String queryString95 = "test95";
		
		private static final String queryString96 = "test96";
		
		private static final String queryString97 = "test97";
		
		private static final String queryString98 = "test98";
		
		private static final String queryString99 = "test99";
		
		private static final String queryString100 = "test100";
		
		private static final String queryString101 = "test101";
		
		private static final String queryString102 = "test102";
		
		private static final String queryString103 = "test103";
		
		private static final String queryString104 = "test104";
		
		private static final String queryString105 = "test105";
		
		private static final String queryString106 = "test106";
		
		private static final String queryString107 = "test107";
		
		private static final String queryString108 = "test108";
		
		private static final String queryString109 = "test109";
		
		private static final String queryString110 =