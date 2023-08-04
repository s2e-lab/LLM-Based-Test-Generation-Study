// Loader_0Test.java
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
class Loader_0Test {

    /**
    * Test case number: 1
    * Test case values:
    * sqlpath: /test/test.xml
    * sort: id
    * dir: desc
    * start: 0
    * limit: 10
    * querySql: null
    * queryValue: null
    * 
    * Test case expectations:
    * The result is not null.
    */
    @Test
    void testLoadDataWithSql_1() {
        Loader loader = new Loader();
        BasePara basePara = new BasePara();
        basePara.setSqlpath("/test/test.xml");
        basePara.setSort("id");
        basePara.setDir("desc");
        basePara.setStart(0);
        basePara.setLimit(10);
        basePara.setQuerySql(null);
        basePara.setQueryValue(null);
        loader.run(basePara);
        assertNotNull(loader.getRs());
    }

    /**
    * Test case number: 2
    * Test case values:
    * sqlpath: /test/test.xml
    * sort: id
    * dir: desc
    * start: 0
    * limit: 10
    * querySql: null
    * queryValue: null
    * 
    * Test case expectations:
    * The result is not null.
    */
    @Test
    void testLoadDataWithSql_2() {
        Loader loader = new Loader();
        BasePara basePara = new BasePara();
        basePara.setSqlpath("/test/test.xml");
        basePara.setSort("id");
        basePara.setDir("desc");
        basePara.setStart(0);
        basePara.setLimit(10);
        basePara.setQuerySql(null);
        basePara.setQueryValue(null);
        loader.run(basePara);
        assertNotNull(loader.getRs());
    }

    /**
    * Test case number: 3
    * Test case values:
    * sqlpath: /test/test.xml
    * sort: id
    * dir: desc
    * start: 0
    * limit: 10
    * querySql: null
    * queryValue: null
    * 
    * Test case expectations:
    * The result is not null.
    */
    @Test
    void testLoadDataWithSql_3() {
        Loader loader = new Loader();
        BasePara basePara = new BasePara();
        basePara.setSqlpath("/test/test.xml");
        basePara.setSort("id");
        basePara.setDir("desc");
        basePara.setStart(0);
        basePara.setLimit(10);
        basePara.setQuerySql(null);
        basePara.setQueryValue(null);
        loader.run(basePara);
        assertNotNull(loader.getRs());
    }

    /**
    * Test case number: 4
    * Test case values:
    * sqlpath: /test/test.xml
    * sort: id
    * dir: desc
    * start: 0
    * limit: 10
    * querySql: null
    * queryValue: null
    * 
    * Test case expectations:
    * The result is not null.
    */
    @Test
    void testLoadDataWithSql_4() {
        Loader loader = new Loader();
        BasePara basePara = new BasePara();
        basePara.setSqlpath("/test/test.xml");
        basePara.setSort("id");
        basePara.setDir("desc");
        basePara.setStart(0);
        basePara.setLimit(10);
        basePara.setQuerySql(null);
        basePara.setQueryValue(null);
        loader.run(basePara);
        assertNotNull(loader.getRs());
    }

    /**
    * Test case number: 5
    * Test case values:
    * sqlpath: /test/test.xml
    * sort: id
    * dir: desc
    * start: 0
    * limit: 10
    * querySql: null
    * queryValue: null
    * 
    * Test case expectations:
    * The result is not null.
    */
    @Test
    void testLoadDataWithSql_5() {
        Loader loader = new Loader();
        BasePara basePara = new BasePara();
        basePara.setSqlpath("/test/test.xml");
        basePara.setSort("id");
        basePara.setDir("desc");
        basePara.setStart(0);
        basePara.setLimit(10);
        basePara.setQuerySql(null);
        basePara.setQueryValue(null);
        loader.run(basePara);
        assertNotNull(loader.getRs());
    }

    /**
    * Test case number: 6
    * Test case values:
    * sqlpath: /test/test.xml
    * sort: id
    * dir: desc
    * start: 0
    * limit: 10
    * querySql: null
    * queryValue: null
    * 
    * Test case expectations:
    * The result is not null.
    */
    @Test
    void testLoadDataWithSql_6() {
        Loader loader = new Loader();
        BasePara basePara = new BasePara();
        basePara.setSqlpath("/test/test.xml");
        basePara.setSort("id");
        basePara.setDir("desc");
        basePara.setStart(0);
        basePara.setLimit(10);
        basePara.setQuerySql(null);
        basePara.setQueryValue(null);
        loader.run(basePara);
        assertNotNull(loader.getRs());
    }

    /**
    * Test case number: 7
    * Test case values:
    * sqlpath: /test/test.xml
    * sort: id
    * dir: desc
    * start: 0
    * limit: 10
    * querySql: null
    * queryValue: null
    * 
    * Test case expectations:
    * The result is not null.
    */
    @Test
    void testLoadDataWithSql_7() {
        Loader loader = new Loader();
        BasePara basePara = new BasePara();
        basePara.setSqlpath("/test/test.xml");
        basePara.setSort("id");
        basePara.setDir("desc");
        basePara.setStart(0);
        basePara.setLimit(10);
        basePara.setQuerySql(null);
        basePara.setQueryValue(null);
        loader.run(basePara);
        assertNotNull(loader.getRs());
    }

    /**
    * Test case number: 8
    * Test case values:
    * sqlpath: /test/test.xml
    * sort: id
    * dir: desc
    * start: 0
    * limit: 10
    * querySql: null
    * queryValue: null
    * 
    * Test case expectations:
    * The result is not null.
    */
    @Test
    void testLoadDataWithSql_8() {
        Loader loader = new Loader();
        BasePara basePara = new BasePara();
        basePara.setSqlpath("/test/test.xml");
        basePara.setSort("id");
        basePara.setDir("desc");
        basePara.setStart(0);
        basePara.setLimit(10);
        basePara.setQuerySql(null);
        basePara.setQueryValue(null);
        loader.run(basePara);
        assertNotNull(loader.getRs());
    }

    /**
    * Test case number: 9
    * Test case values:
    * sqlpath: /test/test.xml
    * sort: id
    * dir: desc
    * start: 0
    * limit: 10
    * querySql: null
    * queryValue: null
    * 
    * Test case expectations:
    * The result is not null.
    */
    @Test
    void testLoadDataWithSql_9() {
        Loader loader = new Loader();
        BasePara basePara = new BasePara();
        basePara.setSqlpath("/test/test.xml");
        basePara.setSort("id");
        basePara.setDir("desc");
        basePara.setStart(0);
        basePara.setLimit(10);
        basePara.setQuerySql(null);
        basePara.setQueryValue(null);
        loader.run(basePara);
        assertNotNull(loader.getRs());
    }

    /**
    * Test case number: 10
    * Test case values:
    * sqlpath: /test/test.xml
    * sort: id
    * dir: desc
    * start: 0
    * limit: 10
    * querySql: null
    * queryValue: null
    * 
    * Test case expectations:
    * The result is not null.
    */
    @Test
    void testLoadDataWithSql_10() {
        Loader loader = new Loader();
        BasePara basePara = new BasePara();
        basePara.setSqlpath("/test/test.xml");
        basePara.setSort("id");
        basePara.setDir("desc");
        basePara.setStart(0);
        basePara.setLimit(10);
        basePara.setQuerySql(null);
        basePara.setQueryValue(null);
        loader.run(basePara);
        assertNotNull(loader.getRs());