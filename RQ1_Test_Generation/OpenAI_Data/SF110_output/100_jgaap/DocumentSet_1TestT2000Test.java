// DocumentSet_1Test.java


/**
 *  DocumentSet.java
 *   Caleb Astey - 2007
 */
import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DocumentSet}.
* It contains ten unit test cases for the {@link DocumentSet#getDocument(int)} method.
*/
class DocumentSet_1Test {

		/**
		* Test case 1 for {@link DocumentSet#getDocument(int)} method.
		*/
		@Test
		void testGetDocument_1() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertEquals(d, ds.getDocument(0));
		}
		
		/**
		* Test case 2 for {@link DocumentSet#getDocument(int)} method.
		*/
		@Test
		void testGetDocument_2() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(d, ds.getDocument(1));
		}
		
		/**
		* Test case 3 for {@link DocumentSet#getDocument(int)} method.
		*/
		@Test
		void testGetDocument_3() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(d, ds.getDocument(2));
		}
		
		/**
		* Test case 4 for {@link DocumentSet#getDocument(int)} method.
		*/
		@Test
		void testGetDocument_4() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(d, ds.getDocument(3));
		}
		
		/**
		* Test case 5 for {@link DocumentSet#getDocument(int)} method.
		*/
		@Test
		void testGetDocument_5() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(d, ds.getDocument(4));
		}
		
		/**
		* Test case 6 for {@link DocumentSet#getDocument(int)} method.
		*/
		@Test
		void testGetDocument_6() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(d, ds.getDocument(5));
		}
		
		/**
		* Test case 7 for {@link DocumentSet#getDocument(int)} method.
		*/
		@Test
		void testGetDocument_7() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(d, ds.getDocument(6));
		}
		
		/**
		* Test case 8 for {@link DocumentSet#getDocument(int)} method.
		*/
		@Test
		void testGetDocument_8() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(d, ds.getDocument(7));
		}
		
		/**
		* Test case 9 for {@link DocumentSet#getDocument(int)} method.
		*/
		@Test
		void testGetDocument_9() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(d, ds.getDocument(8));
		}
		
		/**
		* Test case 10 for {@link DocumentSet#getDocument(int)} method.
		*/
		@Test
		void testGetDocument_10() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(d, ds.getDocument(9));
		}
}

// DocumentSet_2Test.java


/**
 *  DocumentSet.java
 *   Caleb Astey - 2007
 */
import java.util.Vector;
import java.util.Hashtable;
import java.util.StringTokenizer;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DocumentSet}.
* It contains ten unit test cases for the {@link DocumentSet#documentCount()} method.
*/
class DocumentSet_2Test {
		
		/**
		* Test case 1 for {@link DocumentSet#documentCount()} method.
		*/
		@Test
		void testDocumentCount_1() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertEquals(1, ds.documentCount());
		}
		
		/**
		* Test case 2 for {@link DocumentSet#documentCount()} method.
		*/
		@Test
		void testDocumentCount_2() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(2, ds.documentCount());
		}
		
		/**
		* Test case 3 for {@link DocumentSet#documentCount()} method.
		*/
		@Test
		void testDocumentCount_3() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(3, ds.documentCount());
		}
		
		/**
		* Test case 4 for {@link DocumentSet#documentCount()} method.
		*/
		@Test
		void testDocumentCount_4() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(4, ds.documentCount());
		}
		
		/**
		* Test case 5 for {@link DocumentSet#documentCount()} method.
		*/
		@Test
		void testDocumentCount_5() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(5, ds.documentCount());
		}
		
		/**
		* Test case 6 for {@link DocumentSet#documentCount()} method.
		*/
		@Test
		void testDocumentCount_6() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(6, ds.documentCount());
		}
		
		/**
		* Test case 7 for {@link DocumentSet#documentCount()} method.
		*/
		@Test
		void testDocumentCount_7() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);