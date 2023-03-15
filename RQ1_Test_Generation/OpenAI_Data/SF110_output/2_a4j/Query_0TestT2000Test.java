// Query_0Test.java
/**
 * http://www.KenCochrane.net
 * Ken Cochrane
 * Date: May 23, 2003
 * Time: 9:18:23 AM
 *
 *  Some of these methods are from the Amazon.com AWS Java examples that they include when you
 *  download the AWS bundle.
 */
package net.kencochrane.a4j.data;

//import org.apache.log4j.Logger;
import net.kencochrane.a4j.util.LoadProperties;
import net.kencochrane.a4j.util.a4jUtil;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.Properties;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Query}.
* It contains ten unit test cases for the {@link Query#queryGenerator(String, String, String, String, ArrayList)} method.
*/
class Query_0Test {
/**
		 * Test case for {@link Query#queryGenerator(String, String, String, String, ArrayList)}
		 * <p>
		 * Test Data:
		 * <ul>
		 * <li>searchType = "AsinSearch"</li>
		 * <li>type = "lite"</li>
		 * <li>page = "1"</li>
		 * <li>offer = "All"</li>
		 * <li>searchValues = ["B00005JKJY"]</li>
		 * </ul>
		 * <p>
		 * Expected Result:
		 * <ul>
		 * <li>result = "http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY&type=lite&offerpage=1&offer=All&f=xml"</li>
		 * </ul>
		 */
		@Test
		void testQueryGenerator_0() {
				Query query = new Query();
				String searchType = "AsinSearch";
				String type = "lite";
				String page = "1";
				String offer = "All";
				ArrayList searchValues = new ArrayList();
				searchValues.add("B00005JKJY");
				String result = query.queryGenerator(searchType, type, page, offer, searchValues);
				assertEquals("http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY&type=lite&offerpage=1&offer=All&f=xml", result);
		}

		/**
		 * Test case for {@link Query#queryGenerator(String, String, String, String, ArrayList)}
		 * <p>
		 * Test Data:
		 * <ul>
		 * <li>searchType = "AsinSearch"</li>
		 * <li>type = "lite"</li>
		 * <li>page = "1"</li>
		 * <li>offer = "All"</li>
		 * <li>searchValues = ["B00005JKJY", "B00005JKJY"]</li>
		 * </ul>
		 * <p>
		 * Expected Result:
		 * <ul>
		 * <li>result = "http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY,B00005JKJY&type=lite&offerpage=1&offer=All&f=xml"</li>
		 * </ul>
		 */
		@Test
		void testQueryGenerator_1() {
				Query query = new Query();
				String searchType = "AsinSearch";
				String type = "lite";
				String page = "1";
				String offer = "All";
				ArrayList searchValues = new ArrayList();
				searchValues.add("B00005JKJY");
				searchValues.add("B00005JKJY");
				String result = query.queryGenerator(searchType, type, page, offer, searchValues);
				assertEquals("http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY,B00005JKJY&type=lite&offerpage=1&offer=All&f=xml", result);
		}

		/**
		 * Test case for {@link Query#queryGenerator(String, String, String, String, ArrayList)}
		 * <p>
		 * Test Data:
		 * <ul>
		 * <li>searchType = "AsinSearch"</li>
		 * <li>type = "lite"</li>
		 * <li>page = "1"</li>
		 * <li>offer = "All"</li>
		 * <li>searchValues = ["B00005JKJY", "B00005JKJY", "B00005JKJY"]</li>
		 * </ul>
		 * <p>
		 * Expected Result:
		 * <ul>
		 * <li>result = "http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY,B00005JKJY,B00005JKJY&type=lite&offerpage=1&offer=All&f=xml"</li>
		 * </ul>
		 */
		@Test
		void testQueryGenerator_2() {
				Query query = new Query();
				String searchType = "AsinSearch";
				String type = "lite";
				String page = "1";
				String offer = "All";
				ArrayList searchValues = new ArrayList();
				searchValues.add("B00005JKJY");
				searchValues.add("B00005JKJY");
				searchValues.add("B00005JKJY");
				String result = query.queryGenerator(searchType, type, page, offer, searchValues);
				assertEquals("http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY,B00005JKJY,B00005JKJY&type=lite&offerpage=1&offer=All&f=xml", result);
		}

		/**
		 * Test case for {@link Query#queryGenerator(String, String, String, String, ArrayList)}
		 * <p>
		 * Test Data:
		 * <ul>
		 * <li>searchType = "AsinSearch"</li>
		 * <li>type = "lite"</li>
		 * <li>page = "1"</li>
		 * <li>offer = "All"</li>
		 * <li>searchValues = ["B00005JKJY", "B00005JKJY", "B00005JKJY", "B00005JKJY"]</li>
		 * </ul>
		 * <p>
		 * Expected Result:
		 * <ul>
		 * <li>result = "http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY,B00005JKJY,B00005JKJY,B00005JKJY&type=lite&offerpage=1&offer=All&f=xml"</li>
		 * </ul>
		 */
		@Test
		void testQueryGenerator_3() {
				Query query = new Query();
				String searchType = "AsinSearch";
				String type = "lite";
				String page = "1";
				String offer = "All";
				ArrayList searchValues = new ArrayList();
				searchValues.add("B00005JKJY");
				searchValues.add("B00005JKJY");
				searchValues.add("B00005JKJY");