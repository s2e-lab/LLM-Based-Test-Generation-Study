// DbConnectionAttributes_0Test.java
package bible.util;

import java.sql.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DbConnectionAttributes}.
* It contains ten unit test cases for the {@link DbConnectionAttributes#toShortString()} method.
*/
class DbConnectionAttributes_0Test {

	/**
	* Test case for {@link DbConnectionAttributes#toShortString()}.
	* @author James Stauffer
	*/
	@Test
	void testToShortString_0() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(0);
		assertEquals("bible.util.DbConnectionAttributes:[0 null]", dbConnectionAttributes.toShortString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toShortString()}.
	* @author James Stauffer
	*/
	@Test
	void testToShortString_1() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(1);
		assertEquals("bible.util.DbConnectionAttributes:[1 null]", dbConnectionAttributes.toShortString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toShortString()}.
	* @author James Stauffer
	*/
	@Test
	void testToShortString_2() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(2);
		assertEquals("bible.util.DbConnectionAttributes:[2 null]", dbConnectionAttributes.toShortString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toShortString()}.
	* @author James Stauffer
	*/
	@Test
	void testToShortString_3() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(3);
		assertEquals("bible.util.DbConnectionAttributes:[3 null]", dbConnectionAttributes.toShortString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toShortString()}.
	* @author James Stauffer
	*/
	@Test
	void testToShortString_4() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(4);
		assertEquals("bible.util.DbConnectionAttributes:[4 null]", dbConnectionAttributes.toShortString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toShortString()}.
	* @author James Stauffer
	*/
	@Test
	void testToShortString_5() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(5);
		assertEquals("bible.util.DbConnectionAttributes:[5 null]", dbConnectionAttributes.toShortString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toShortString()}.
	* @author James Stauffer
	*/
	@Test
	void testToShortString_6() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(6);
		assertEquals("bible.util.DbConnectionAttributes:[6 null]", dbConnectionAttributes.toShortString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toShortString()}.
	* @author James Stauffer
	*/
	@Test
	void testToShortString_7() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(7);
		assertEquals("bible.util.DbConnectionAttributes:[7 null]", dbConnectionAttributes.toShortString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toShortString()}.
	* @author James Stauffer
	*/
	@Test
	void testToShortString_8() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(8);
		assertEquals("bible.util.DbConnectionAttributes:[8 null]", dbConnectionAttributes.toShortString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toShortString()}.
	* @author James Stauffer
	*/
	@Test
	void testToShortString_9() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(9);
		assertEquals("bible.util.DbConnectionAttributes:[9 null]", dbConnectionAttributes.toShortString());
	}
}

// DbConnectionAttributes_1Test.java
package bible.util;

import java.sql.*;
import java.util.Date;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link DbConnectionAttributes}.
* It contains ten unit test cases for the {@link DbConnectionAttributes#toString()} method.
*/
class DbConnectionAttributes_1Test {
		
	/**
	* Test case for {@link DbConnectionAttributes#toString()}.
	* @author James Stauffer
	*/
	@Test
	void testToString_0() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(0);
		assertEquals("bible.util.DbConnectionAttributes:[index=0, status=NotUsed (Not Connected), query=null, creationDate=Thu Jan 01 00:00:00 CST 1970, e=null]", dbConnectionAttributes.toString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toString()}.
	* @author James Stauffer
	*/
	@Test
	void testToString_1() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(1);
		assertEquals("bible.util.DbConnectionAttributes:[index=1, status=NotUsed (Not Connected), query=null, creationDate=Thu Jan 01 00:00:00 CST 1970, e=null]", dbConnectionAttributes.toString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toString()}.
	* @author James Stauffer
	*/
	@Test
	void testToString_2() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(2);
		assertEquals("bible.util.DbConnectionAttributes:[index=2, status=NotUsed (Not Connected), query=null, creationDate=Thu Jan 01 00:00:00 CST 1970, e=null]", dbConnectionAttributes.toString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toString()}.
	* @author James Stauffer
	*/
	@Test
	void testToString_3() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(3);
		assertEquals("bible.util.DbConnectionAttributes:[index=3, status=NotUsed (Not Connected), query=null, creationDate=Thu Jan 01 00:00:00 CST 1970, e=null]", dbConnectionAttributes.toString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toString()}.
	* @author James Stauffer
	*/
	@Test
	void testToString_4() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(4);
		assertEquals("bible.util.DbConnectionAttributes:[index=4, status=NotUsed (Not Connected), query=null, creationDate=Thu Jan 01 00:00:00 CST 1970, e=null]", dbConnectionAttributes.toString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toString()}.
	* @author James Stauffer
	*/
	@Test
	void testToString_5() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(5);
		assertEquals("bible.util.DbConnectionAttributes:[index=5, status=NotUsed (Not Connected), query=null, creationDate=Thu Jan 01 00:00:00 CST 1970, e=null]", dbConnectionAttributes.toString());
	}
	
	/**
	* Test case for {@link DbConnectionAttributes#toString()}.
	* @author James Stauffer
	*/
	@Test
	void testToString_6() {
		DbConnectionAttributes dbConnectionAttributes = new DbConnectionAttributes(6);
		assertEquals("bible.util.DbConnectionAttributes:[index=6, status=NotUsed (Not Connected), query=null, creationDate=Thu Jan 01 00