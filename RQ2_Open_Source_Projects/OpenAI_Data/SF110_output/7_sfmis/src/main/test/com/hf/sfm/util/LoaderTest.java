// LoaderTest.java
package com.hf.sfm.util;

import java.io.File;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;
import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Loader}.
* It contains ten unit test cases for the {@link Loader#loadDataWithSql()} method.
*/
class LoaderTest {

		/**
		* Test case 1 for {@link Loader#loadDataWithSql()}.
		* Test case 1 for {@link Loader#getCount()}.
		* Test case 1 for {@link Loader#getColsName()}.
		* Test case 1 for {@link Loader#getArrayResults()}.
		* Test case 1 for {@link Loader#collectToMap()}.
		* Test case 1 for {@link Loader#collectToMap(String)}.
		* Test case 1 for {@link Loader#getParams(Query, String[][])}.
		* Test case 1 for {@link Loader#getQuerySql()}.
		* Test case 1 for {@link Loader#parseXML()}.
		* Test case 1 for {@link Loader#run(BasePara)}.
		*/
		@Test
		void testLoadDataWithSql1() {
				Loader loader = new Loader();
				BasePara basePara = new BasePara();
				basePara.setSqlpath("test/test1");
				basePara.setPaging(true);
				basePara.setStart(0);
				basePara.setLimit(10);
				basePara.setSort("id");
				basePara.setDir("asc");
				basePara.setQuerySql("id=?");
				basePara.setQueryValue("1");
				loader.run(basePara);
				assertEquals(10, loader.getTotalCount());
				assertEquals(10, loader.getColNames().length);
				assertEquals(10, loader.getRs().size());
				assertEquals("[{\"id\":\"1\",\"name\":\"name1\",\"age\":\"1\",\"sex\":\"1\",\"birthday\":\"2011-01-01\"},{\"id\":\"2\",\"name\":\"name2\",\"age\":\"2\",\"sex\":\"2\",\"birthday\":\"2012-02-02\"},{\"id\":\"3\",\"name\":\"name3\",\"age\":\"3\",\"sex\":\"3\",\"birthday\":\"2013-03-03\"},{\"id\":\"4\",\"name\":\"name4\",\"age\":\"4\",\"sex\":\"4\",\"birthday\":\"2014-04-04\"},{\"id\":\"5\",\"name\":\"name5\",\"age\":\"5\",\"sex\":\"5\",\"birthday\":\"2015-05-05\"},{\"id\":\"6\",\"name\":\"name6\",\"age\":\"6\",\"sex\":\"6\",\"birthday\":\"2016-06-06\"},{\"id\":\"7\",\"name\":\"name7\",\"age\":\"7\",\"sex\":\"7\",\"birthday\":\"2017-07-07\"},{\"id\":\"8\",\"name\":\"name8\",\"age\":\"8\",\"sex\":\"8\",\"birthday\":\"2018-08-08\"},{\"id\":\"9\",\"name\":\"name9\",\"age\":\"9\",\"sex\":\"9\",\"birthday\":\"2019-09-09\"},{\"id\":\"10\",\"name\":\"name10\",\"age\":\"10\",\"sex\":\"10\",\"birthday\":\"2020-10-10\"}]", loader.getArrayResults());
				assertEquals("[{\"id\":\"1\",\"name\":\"name1\",\"age\":\"1\",\"sex\":\"1\",\"birthday\":\"2011-01-01\"},{\"id\":\"2\",\"name\":\"name2\",\"age\":\"2\",\"sex\":\"2\",\"birthday\":\"2012-02-02\"},{\"id\":\"3\",\"name\":\"name3\",\"age\":\"3\",\"sex\":\"3\",\"birthday\":\"2013-03-03\"},{\"id\":\"4\",\"name\":\"name4\",\"age\":\"4\",\"sex\":\"4\",\"birthday\":\"2014-04-04\"},{\"id\":\"5\",\"name\":\"name5\",\"age\":\"5\",\"sex\":\"5\",\"birthday\":\"2015-05-05\"},{\"id\":\"6\",\"name\":\"name6\",\"age\":\"6\",\"sex\":\"6\",\"birthday\":\"2016-06-06\"},{\"id\":\"7\",\"name\":\"name7\",\"age\":\"7\",\"sex\":\"7\",\"birthday\":\"2017-07-07\"},{\"id\":\"8\",\"name\":\"name8\",\"age\":\"8\",\"sex\":\"8\",\"birthday\":\"2018-08-08\"},{\"id\":\"9\",\"name\":\"name9\",\"age\":\"9\",\"sex\":\"9\",\"birthday\":\"2019-09-09\"},{\"id\":\"10\",\"name\":\"name10\",\"age\":\"10\",\"sex\":\"10\",\"birthday\":\"2020-10-10\"}]", loader.getRange().getData().toString());
				assertEquals(10, loader.getRange().getTotalSize());
				assertEquals("[{\"value\":\"1\",\"text\":\"name1\"},{\"value\":\"2\",\"text\":\"name2\"},{\"value\":\"3\",\"text\":\"name3\"},{\"value\":\"4\",\"text\":\"name4\"},{\"value\":\"5\",\"text\":\"name5\"},{\"value\":\"6\",\"text\":\"name6\"},{\"value\":\"7\",\"text\":\"name7\"},{\"value\":\"8\",\"text\":\"name8\"},{\"value\":\"9\",\"text\":\"name9\"},{\"value\":\"10\",\"text\":\"name10\"}]", loader.getRange().getData().toString());
		}
		
		/**
		* Test case 2 for {@link Loader#loadDataWithSql()}.
		* Test case 2 for {@link Loader#getCount()}.
		* Test case 2 for {@link Loader#getColsName()}.
		* Test case 2 for {@link Loader#getArrayResults()}.
		* Test case 2 for {@link Loader#collectToMap()}.
		* Test case 2 for {@link Loader#collectToMap(String)}.
		* Test case 2 for {@link Loader#getParams(Query, String[][])}.
		* Test case 2 for {@link Loader#getQuerySql()}.
		* Test case 2 for {@link Loader#parseXML()}.
		* Test case 2 for {@link Loader#run(BasePara)}.
		*/
		@Test
		void testLoadDataWithSql2() {
				Loader loader = new Loader();
				BasePara basePara = new BasePara();
				basePara.setSqlpath("test/test2");
				basePara.setPaging(true);
				basePara.setStart(0);
				basePara.setLimit(10);
				basePara.setSort("id");
				basePara.setDir("asc");
				basePara.setQuerySql("id=?");
				basePara.setQueryValue("1");
				loader.run(basePara);
				assertEquals(10, loader.getTotalCount());
				assertEquals(10, loader.getColNames().length);
				assertEquals(10, loader.getRs().size());
				assertEquals("[{\"id\":\"1\",\"name\":\"name1\",\"age\":\"1\",\"sex\":\"1\",\"birthday\":\"2011-01-01\"},{\"id\":\"2\",\"name\":\"name2\",\"age\":\"2\",\"sex\":\"2\",\"birthday\":\"2012-02-02\"},{\"id\":\"3\",\"name\":\"name3\",\"age\":\"3\",\"sex\":\"3\",\"birthday\":\"2013-03-03\"},{\"id\":\"4\",\"name\":\"name4\",\"age\":\"4\",\"sex\":\"4\",\"