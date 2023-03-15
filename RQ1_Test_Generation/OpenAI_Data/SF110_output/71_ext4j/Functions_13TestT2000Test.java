// Functions_13Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#addS(String)} method.
*/
class Functions_13Test {

		/**
		 * Test case for {@link Functions#addS(String)} method.
		 * @throws Exception
		 */
		@Test
		public void testAddS_1() throws Exception {
				String oResult = Functions.addS("James");
				assertEquals("James'", oResult);
		}
		
		/**
		 * Test case for {@link Functions#addS(String)} method.
		 * @throws Exception
		 */
		@Test
		public void testAddS_2() throws Exception {
				String oResult = Functions.addS("Daniel");
				assertEquals("Daniel's", oResult);
		}
		
		/**
		 * Test case for {@link Functions#addS(String)} method.
		 * @throws Exception
		 */
		@Test
		public void testAddS_3() throws Exception {
				String oResult = Functions.addS("James'");
				assertEquals("James''", oResult);
		}
		
		/**
		 * Test case for {@link Functions#addS(String)} method.
		 * @throws Exception
		 */
		@Test
		public void testAddS_4() throws Exception {
				String oResult = Functions.addS("Daniel's");
				assertEquals("Daniel''s", oResult);
		}
		
		/**
		 * Test case for {@link Functions#addS(String)} method.
		 * @throws Exception
		 */
		@Test
		public void testAddS_5() throws Exception {
				String oResult = Functions.addS("James's");
				assertEquals("James's'", oResult);
		}
		
		/**
		 * Test case for {@link Functions#addS(String)} method.
		 * @throws Exception
		 */
		@Test
		public void testAddS_6() throws Exception {
				String oResult = Functions.addS("Daniel's'");
				assertEquals("Daniel's''", oResult);
		}
		
		/**
		 * Test case for {@link Functions#addS(String)} method.
		 * @throws Exception
		 */
		@Test
		public void testAddS_7() throws Exception {
				String oResult = Functions.addS("James's'");
				assertEquals("James's''", oResult);
		}
		
		/**
		 * Test case for {@link Functions#addS(String)} method.
		 * @throws Exception
		 */
		@Test
		public void testAddS_8() throws Exception {
				String oResult = Functions.addS("Daniel's's");
				assertEquals("Daniel's's'", oResult);
		}
		
		/**
		 * Test case for {@link Functions#addS(String)} method.
		 * @throws Exception
		 */
		@Test
		public void testAddS_9() throws Exception {
				String oResult = Functions.addS("James's's");
				assertEquals("James's's'", oResult);
		}
		
		/**
		 * Test case for {@link Functions#addS(String)} method.
		 * @throws Exception
		 */
		@Test
		public void testAddS_10() throws Exception {
				String oResult = Functions.addS("Daniel's's'");
				assertEquals("Daniel's's''", oResult);
		}
		
}

// Functions_14Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#ordinal(int)} method.
*/
class Functions_14Test {
		
		/**
		 * Test case for {@link Functions#ordinal(int)} method.
		 * @throws Exception
		 */
		@Test
		public void testOrdinal_1() throws Exception {
				String oResult = Functions.ordinal(1);
				assertEquals("1st", oResult);
		}
		
		/**
		 * Test case for {@link Functions#ordinal(int)} method.
		 * @throws Exception
		 */
		@Test
		public void testOrdinal_2() throws Exception {
				String oResult = Functions.ordinal(2);
				assertEquals("2nd", oResult);
		}
		
		/**
		 * Test case for {@link Functions#ordinal(int)} method.
		 * @throws Exception
		 */
		@Test
		public void testOrdinal_3() throws Exception {
				String oResult = Functions.ordinal(3);
				assertEquals("3rd", oResult);
		}
		
		/**
		 * Test case for {@link Functions#ordinal(int)} method.
		 * @throws Exception
		 */
		@Test
		public void testOrdinal_4() throws Exception {
				String oResult = Functions.ordinal(4);
				assertEquals("4th", oResult);
		}
		
		/**
		 * Test case for {@link Functions#ordinal(int)} method.
		 * @throws Exception
		 */
		@Test
		public void testOrdinal_5() throws Exception {
				String oResult = Functions.ordinal(5);
				assertEquals("5th", oResult);
		}
		
		/**
		 * Test case for {@link Functions#ordinal(int)} method.
		 * @throws Exception
		 */
		@Test
		public void testOrdinal_6() throws Exception {
				String oResult = Functions.ordinal(6);
				assertEquals("6th", oResult);
		}
		
		/**
		 * Test case for {@link Functions#ordinal(int)} method.
		 * @throws Exception
		 */
		@Test
		public void testOrdinal_7() throws Exception {
				String oResult = Functions.ordinal(7);
				assertEquals("7th", oResult);
		}
		
		/**
		 * Test case for {@link Functions#ordinal(int)} method.
		 * @throws Exception
		 */
		@Test
		public void testOrdinal_8() throws Exception {
				String oResult = Functions.ordinal(8);
				assertEquals("8th", oResult);
		}
		
		/**
		 * Test case for {@link Functions#ordinal(int)} method.
		 * @throws Exception
		 */
		@Test
		public void testOrdinal_9() throws Exception {
				String oResult = Functions.ordinal(9);
				assertEquals("9th", oResult);
		}
		
		/**
		 * Test case for {