// Verse_4Test.java
package bible.obj;

import java.sql.SQLException;
import java.io.IOException;
import java.util.*;
import bible.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Verse}.
* It contains ten unit test cases for the {@link Verse#GetId(int, int, int, int)} method.
*/
class Verse_4Test {

	@Test
	void testGetId_1() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 1;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(1, id);
	}
	
	@Test
	void testGetId_2() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 2;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(2, id);
	}
	
	@Test
	void testGetId_3() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 3;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(3, id);
	}
	
	@Test
	void testGetId_4() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 4;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(4, id);
	}
	
	@Test
	void testGetId_5() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 5;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(5, id);
	}
	
	@Test
	void testGetId_6() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 6;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(6, id);
	}
	
	@Test
	void testGetId_7() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 7;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(7, id);
	}
	
	@Test
	void testGetId_8() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 8;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(8, id);
	}
	
	@Test
	void testGetId_9() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 9;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(9, id);
	}
	
	@Test
	void testGetId_10() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 10;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(10, id);
	}
}

// Verse_4Test.java
package bible.obj;

import java.sql.SQLException;
import java.io.IOException;
import java.util.*;
import bible.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Verse}.
* It contains ten unit test cases for the {@link Verse#GetId(int, int, int, int)} method.
*/
class Verse_4Test {
		
	@Test
	void testGetId_1() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 1;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(1, id);
	}
	
	@Test
	void testGetId_2() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 2;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(2, id);
	}
	
	@Test
	void testGetId_3() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 3;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(3, id);
	}
	
	@Test
	void testGetId_4() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 4;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(4, id);
	}
	
	@Test
	void testGetId_5() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 5;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(5, id);
	}
	
	@Test
	void testGetId_6() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 6;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(6, id);
	}
	
	@Test
	void testGetId_7() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 7;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(7, id);
	}
	
	@Test
	void testGetId_8() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 8;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(8, id);
	}
	
	@Test
	void testGetId_9() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 9;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(9, id);
	}
	
	@Test
	void testGetId_10() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 10;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(10, id);
	}
}

// Verse_4Test.java
package bible.obj;

import java.sql.SQLException;
import java.io.IOException;
import java.util.*;
import bible.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Verse}.
* It contains ten unit test cases for the {@link Verse#GetId(int, int, int, int)} method.
*/
class Verse_4Test {
		
	@Test
	void testGetId_1() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 1;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(1, id);
	}
	
	@Test
	void testGetId_2() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 2;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(2, id);
	}
	
	@Test
	void testGetId_3() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 3;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(3, id);
	}
	
	@Test
	void testGetId_4() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 4;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(4, id);
	}
	
	@Test
	void testGetId_5() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 5;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(5, id);
	}
	
	@Test
	void testGetId_6() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 6;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(6, id);
	}
	
	@Test
	void testGetId_7() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 7;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(7, id);
	}
	
	@Test
	void testGetId_8() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 8;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(8, id);
	}
	
	@Test
	void testGetId_9() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 9;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(9, id);
	}
	
	@Test
	void testGetId_10() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 10;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(10, id);
	}
}

// Verse_4Test.java
package bible.obj;

import java.sql.SQLException;
import java.io.IOException;
import java.util.*;
import bible.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Verse}.
* It contains ten unit test cases for the {@link Verse#GetId(int, int, int, int)} method.
*/
class Verse_4Test {
		
	@Test
	void testGetId_1() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 1;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(1, id);
	}
	
	@Test
	void testGetId_2() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 2;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(2, id);
	}
	
	@Test
	void testGetId_3() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 3;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assertEquals(3, id);
	}
	
	@Test
	void testGetId_4() {
		int translationId = Translation.Normalize(Translation.KJV);
		int bookId = Book.Normalize(Book.GENESIS);
		int chapterId = 1;
		int verseId = 4;
		int id = Verse.GetId(translationId, bookId, chapterId, verseId);
		assert