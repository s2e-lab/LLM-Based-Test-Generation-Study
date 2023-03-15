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
				assertNotEquals(7, ds.documentCount());
		}
		
		/**
		* Test case 8 for {@link DocumentSet#documentCount()} method.
		*/
		@Test
		void testDocumentCount_8() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(8, ds.documentCount());
		}
		
		/**
		* Test case 9 for {@link DocumentSet#documentCount()} method.
		*/
		@Test
		void testDocumentCount_9() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(9, ds.documentCount());
		}
		
		/**
		* Test case 10 for {@link DocumentSet#documentCount()} method.
		*/
		@Test
		void testDocumentCount_10() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				assertNotEquals(10, ds.documentCount());
		}
}

// DocumentSet_3Test.java


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
* It contains ten unit test cases for the {@link DocumentSet#characterFrequency()} method.
*/
class DocumentSet_3Test {
		
		/**
		* Test case 1 for {@link DocumentSet#characterFrequency()} method.
		*/
		@Test
		void testCharacterFrequency_1() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				ds.characterFrequency();
				assertEquals(1, ds.frequency.size());
		}
		
		/**
		* Test case 2 for {@link DocumentSet#characterFrequency()} method.
		*/
		@Test
		void testCharacterFrequency_2() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				ds.characterFrequency();
				assertNotEquals(2, ds.frequency.size());
		}
		
		/**
		* Test case 3 for {@link DocumentSet#characterFrequency()} method.
		*/
		@Test
		void testCharacterFrequency_3() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				ds.characterFrequency();
				assertNotEquals(3, ds.frequency.size());
		}
		
		/**
		* Test case 4 for {@link DocumentSet#characterFrequency()} method.
		*/
		@Test
		void testCharacterFrequency_4() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				ds.characterFrequency();
				assertNotEquals(4, ds.frequency.size());
		}
		
		/**
		* Test case 5 for {@link DocumentSet#characterFrequency()} method.
		*/
		@Test
		void testCharacterFrequency_5() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				ds.characterFrequency();
				assertNotEquals(5, ds.frequency.size());
		}
		
		/**
		* Test case 6 for {@link DocumentSet#characterFrequency()} method.
		*/
		@Test
		void testCharacterFrequency_6() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				ds.characterFrequency();
				assertNotEquals(6, ds.frequency.size());
		}
		
		/**
		* Test case 7 for {@link DocumentSet#characterFrequency()} method.
		*/
		@Test
		void testCharacterFrequency_7() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				ds.characterFrequency();
				assertNotEquals(7, ds.frequency.size());
		}
		
		/**
		* Test case 8 for {@link DocumentSet#characterFrequency()} method.
		*/
		@Test
		void testCharacterFrequency_8() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				ds.characterFrequency();
				assertNotEquals(8, ds.frequency.size());
		}
		
		/**
		* Test case 9 for {@link DocumentSet#characterFrequency()} method.
		*/
		@Test
		void testCharacterFrequency_9() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				ds.characterFrequency();
				assertNotEquals(9, ds.frequency.size());
		}
		
		/**
		* Test case 10 for {@link DocumentSet#characterFrequency()} method.
		*/
		@Test
		void testCharacterFrequency_10() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				ds.characterFrequency();
				assertNotEquals(10, ds.frequency.size());
		}
}

// DocumentSet_4Test.java


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
* It contains ten unit test cases for the {@link DocumentSet#wordFrequency()} method.
*/
class DocumentSet_4Test {
		
		/**
		* Test case 1 for {@link DocumentSet#wordFrequency()} method.
		*/
		@Test
		void testWordFrequency_1() {
				DocumentSet ds = new DocumentSet();
				Document d = new Document("test.txt");
				ds.register(d);
				ds.wordFrequency();
				assertEquals(1, ds.frequency.size());
		}
		
		/**
		