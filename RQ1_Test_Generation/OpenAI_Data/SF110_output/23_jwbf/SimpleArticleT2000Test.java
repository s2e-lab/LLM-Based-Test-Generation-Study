// SimpleArticleTest.java
package net.sourceforge.jwbf.core.contentRep;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleArticle}.
* It contains ten unit test cases for the {@link SimpleArticle#clone()} method.
*/
class SimpleArticleTest {

		/**
		 * Test method for {@link SimpleArticle#clone()}.
		 * @throws CloneNotSupportedException 
		 */
		@Test
		void testClone() throws CloneNotSupportedException {
				SimpleArticle sa = new SimpleArticle();
				SimpleArticle sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setText("text");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setTitle("title");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setEditSummary("editSummary");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setEditor("editor");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setMinorEdit(true);
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setEditTimestamp("01/01/01 00:00:00");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setRevisionId("revId");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
		}
}

// SimpleArticleTest.java
package net.sourceforge.jwbf.core.contentRep;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleArticle}.
* It contains ten unit test cases for the {@link SimpleArticle#clone()} method.
*/
class SimpleArticleTest {
		
		/**
		 * Test method for {@link SimpleArticle#clone()}.
		 * @throws CloneNotSupportedException 
		 */
		@Test
		void testClone() throws CloneNotSupportedException {
				SimpleArticle sa = new SimpleArticle();
				SimpleArticle sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setText("text");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setTitle("title");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setEditSummary("editSummary");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setEditor("editor");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setMinorEdit(true);
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setEditTimestamp("01/01/01 00:00:00");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setRevisionId("revId");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
		}
}

// SimpleArticleTest.java
package net.sourceforge.jwbf.core.contentRep;

import java.io.Serializable;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.regex.Pattern;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleArticle}.
* It contains ten unit test cases for the {@link SimpleArticle#clone()} method.
*/
class SimpleArticleTest {
		
		/**
		 * Test method for {@link SimpleArticle#clone()}.
		 * @throws CloneNotSupportedException 
		 */
		@Test
		void testClone() throws CloneNotSupportedException {
				SimpleArticle sa = new SimpleArticle();
				SimpleArticle sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setText("text");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setTitle("title");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setEditSummary("editSummary");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setEditor("editor");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setMinorEdit(true);
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setEditTimestamp("01/01/01 00:00:00");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
				
				sa.setRevisionId("revId");
				sa2 = (SimpleArticle) sa.clone();
				assertEquals(sa, sa2);
				assertNotSame(sa, sa2);
		}
}

// SimpleArticleTest