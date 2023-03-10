// HtmlContentParserTest3.java
package org.asphodel.parser;

import au.id.jericho.lib.html.Source;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import java.io.IOException;
import java.io.InputStream;
import java.io.Reader;
import java.net.URL;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlContentParser}.
* It contains ten unit test cases for the {@link HtmlContentParser#extractText(URL)} method.
*/
class HtmlContentParserTest3 {
private static Log log = LogFactory.getLog(HtmlContentParserTest3.class);
		private static final String TEST_URL = "http://www.google.com";
		private static final String TEST_URL_2 = "http://www.google.com/search?q=test";
		private static final String TEST_URL_3 = "http://www.google.com/search?q=test&hl=en";
		private static final String TEST_URL_4 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search";
		private static final String TEST_URL_5 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=";
		private static final String TEST_URL_6 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=";
		private static final String TEST_URL_7 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=g10";
		private static final String TEST_URL_8 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=g10&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0l0l0l0ll0l0";
		private static final String TEST_URL_9 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=g10&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.&fp=d9b9b9b9b9b9b9b9&biw=1280&bih=854";
		private static final String TEST_URL_10 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=g10&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.&fp=d9b9b9b9b9b9b9b9&biw=1280&bih=854&cad=b";
		private static final String TEST_URL_11 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=g10&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.&fp=d9b9b9b9b9b9b9b9&biw=1280&bih=854&cad=b&sei=XQQeTZ_6J4L48Aa-6_3zDQ";
		private static final String TEST_URL_12 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=g10&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.&fp=d9b9b9b9b9b9b9b9&biw=1280&bih=854&cad=b&sei=XQQeTZ_6J4L48Aa-6_3zDQ&pws=0";
		private static final String TEST_URL_13 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=g10&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.&fp=d9b9b9b9b9b9b9b9&biw=1280&bih=854&cad=b&sei=XQQeTZ_6J4L48Aa-6_3zDQ&pws=0&dclid=CK_N1Y_6J4L48QG-6_3zDQ";
		private static final String TEST_URL_14 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=g10&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.&fp=d9b9b9b9b9b9b9b9&biw=1280&bih=854&cad=b&sei=XQQeTZ_6J4L48Aa-6_3zDQ&pws=0&dclid=CK_N1Y_6J4L48QG-6_3zDQ&ei=XQQeTZ_6J4L48Aa-6_3zDQ";
		private static final String TEST_URL_15 = "http://www.google.com/search?q=test&hl=en&btnG=Google+Search&aq=f&oq=&aqi=g10&aql=&gs_sm=e&gs_upl=0l0l0l0l0l0l0l0l0l0l0l0l0l0l0ll0l0&bav=on.2,or.r_gc.r_pw.&fp=d9b9b9b9b9b9b9b9&biw=1280&bih=854&cad=b&sei=XQQeTZ_6J4L48Aa-6_3zDQ&pws=0&dclid=CK_N1Y_6J4L48QG-6_3zDQ&ei=XQQeTZ_6J4L48Aa-6_3zDQ&sa=X&oi=spell&resnum=0&ct=result&cd=1&ved=0CBUQBSgA&usg=AFQjCNG-_QQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQQ