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
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testLoadDataWithSql_0() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.loadDataWithSql();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testLoadDataWithSql_1() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.loadDataWithSql();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testLoadDataWithSql_2() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.loadDataWithSql();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testLoadDataWithSql_3() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.loadDataWithSql();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testLoadDataWithSql_4() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.loadDataWithSql();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testLoadDataWithSql_5() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.loadDataWithSql();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testLoadDataWithSql_6() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.loadDataWithSql();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testLoadDataWithSql_7() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.loadDataWithSql();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testLoadDataWithSql_8() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.loadDataWithSql();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#loadDataWithSql()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testLoadDataWithSql_9() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.loadDataWithSql();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
}

// Loader_1Test.java
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
* It contains ten unit test cases for the {@link Loader#getCount()} method.
*/
class Loader_1Test {
		
		/**
		* Test case for the {@link Loader#getCount()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testGetCount_0() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.getCount();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#getCount()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testGetCount_1() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.getCount();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#getCount()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testGetCount_2() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.getCount();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#getCount()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testGetCount_3() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.getCount();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#getCount()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testGetCount_4() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.getCount();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#getCount()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testGetCount_5() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.getCount();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#getCount()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
		void testGetCount_6() {
				// Arrange:
				Loader loader = new Loader();
				loader.sql = "select * from t_user where user_id=?";
				loader.pas = new String[][] {{"1"},{"String"}};
				// Act:
				loader.getCount();
				// Assert result:
				assertEquals("select * from t_user where user_id=?", loader.sql);
		}
		
		/**
		* Test case for the {@link Loader#getCount()} method.
		* Test data: "select * from t_user where user_id=?"
		* Expected output: "select * from t_user where user_id=?"
		*/
		@Test
	