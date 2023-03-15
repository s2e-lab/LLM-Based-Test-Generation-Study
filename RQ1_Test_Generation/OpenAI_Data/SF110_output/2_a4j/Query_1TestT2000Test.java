// Query_1Test.java
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
* It contains ten unit test cases for the {@link Query#sendRequest(String)} method.
*/
class Query_1Test {
/**
		 * Test case for {@link Query#sendRequest(String)}
		 *
		 * @throws Exception
		 */
		@Test
		void testSendRequest() throws Exception {
				Query query = new Query();
				String result = query.sendRequest("http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY&type=lite&f=xml");
				assertTrue(result.contains("<Asin>B00005JKJY</Asin>"));
		}

		/**
		 * Test case for {@link Query#sendRequest(String)}
		 *
		 * @throws Exception
		 */
		@Test
		void testSendRequest2() throws Exception {
				Query query = new Query();
				String result = query.sendRequest("http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY&type=lite&f=xml");
				assertTrue(result.contains("<Asin>B00005JKJY</Asin>"));
		}

		/**
		 * Test case for {@link Query#sendRequest(String)}
		 *
		 * @throws Exception
		 */
		@Test
		void testSendRequest3() throws Exception {
				Query query = new Query();
				String result = query.sendRequest("http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY&type=lite&f=xml");
				assertTrue(result.contains("<Asin>B00005JKJY</Asin>"));
		}

		/**
		 * Test case for {@link Query#sendRequest(String)}
		 *
		 * @throws Exception
		 */
		@Test
		void testSendRequest4() throws Exception {
				Query query = new Query();
				String result = query.sendRequest("http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY&type=lite&f=xml");
				assertTrue(result.contains("<Asin>B00005JKJY</Asin>"));
		}

		/**
		 * Test case for {@link Query#sendRequest(String)}
		 *
		 * @throws Exception
		 */
		@Test
		void testSendRequest5() throws Exception {
				Query query = new Query();
				String result = query.sendRequest("http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY&type=lite&f=xml");
				assertTrue(result.contains("<Asin>B00005JKJY</Asin>"));
		}

		/**
		 * Test case for {@link Query#sendRequest(String)}
		 *
		 * @throws Exception
		 */
		@Test
		void testSendRequest6() throws Exception {
				Query query = new Query();
				String result = query.sendRequest("http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY&type=lite&f=xml");
				assertTrue(result.contains("<Asin>B00005JKJY</Asin>"));
		}

		/**
		 * Test case for {@link Query#sendRequest(String)}
		 *
		 * @throws Exception
		 */
		@Test
		void testSendRequest7() throws Exception {
				Query query = new Query();
				String result = query.sendRequest("http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY&type=lite&f=xml");
				assertTrue(result.contains("<Asin>B00005JKJY</Asin>"));
		}

		/**
		 * Test case for {@link Query#sendRequest(String)}
		 *
		 * @throws Exception
		 */
		@Test
		void testSendRequest8() throws Exception {
				Query query = new Query();
				String result = query.sendRequest("http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY&type=lite&f=xml");
				assertTrue(result.contains("<Asin>B00005JKJY</Asin>"));
		}

		/**
		 * Test case for {@link Query#sendRequest(String)}
		 *
		 * @throws Exception
		 */
		@Test
		void testSendRequest9() throws Exception {
				Query query = new Query();
				String result = query.sendRequest("http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY&type=lite&f=xml");
				assertTrue(result.contains("<Asin>B00005JKJY</Asin>"));
		}

		/**
		 * Test case for {@link Query#sendRequest(String)}
		 *
		 * @throws Exception
		 */
		@Test
		void testSendRequest10() throws Exception {
				Query query = new Query();
				String result = query.sendRequest("http://xml.amazon.com/onca/xml3?t=kencochrane-20&dev-t=DSB0XDDW1GQ3S&AsinSearch=B00005JKJY&type=lite&f=xml");
				assertTrue(result.contains("<Asin>B00005JKJY</Asin>"));
		}
}

// Query_2Test.java
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
class Query_2Test {
