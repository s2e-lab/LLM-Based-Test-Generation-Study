// RelativeStringTest0.java
package de.beiri22.stringincrementor.relativestring;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RelativeString}.
* It contains ten unit test cases for the {@link RelativeString#linksCount()} method.
*/
class RelativeStringTest0 {

		/**
		* Test case for the {@link RelativeString#linksCount()} method.
		*/
		@Test
		void testLinksCount() {
				RelativeString r = new RelativeString();
				assertEquals(0, r.linksCount());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals(1, r.linksCount());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals(2, r.linksCount());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals(3, r.linksCount());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals(4, r.linksCount());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals(5, r.linksCount());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals(6, r.linksCount());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals(7, r.linksCount());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals(8, r.linksCount());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals(9, r.linksCount());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals(10, r.linksCount());
		}
}

// RelativeStringTest1.java
package de.beiri22.stringincrementor.relativestring;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RelativeString}.
* It contains ten unit test cases for the {@link RelativeString#getLink(int)} method.
*/
class RelativeStringTest1 {
		
		/**
		* Test case for the {@link RelativeString#getLink(int)} method.
		*/
		@Test
		void testGetLink() {
				RelativeString r = new RelativeString();
				r.addLink(new StringLink(0, 0, 0));
				r.addLink(new StringLink(0, 0, 0));
				r.addLink(new StringLink(0, 0, 0));
				r.addLink(new StringLink(0, 0, 0));
				r.addLink(new StringLink(0, 0, 0));
				r.addLink(new StringLink(0, 0, 0));
				r.addLink(new StringLink(0, 0, 0));
				r.addLink(new StringLink(0, 0, 0));
				r.addLink(new StringLink(0, 0, 0));
				r.addLink(new StringLink(0, 0, 0));
				assertEquals(new StringLink(0, 0, 0), r.getLink(0));
				assertEquals(new StringLink(0, 0, 0), r.getLink(1));
				assertEquals(new StringLink(0, 0, 0), r.getLink(2));
				assertEquals(new StringLink(0, 0, 0), r.getLink(3));
				assertEquals(new StringLink(0, 0, 0), r.getLink(4));
				assertEquals(new StringLink(0, 0, 0), r.getLink(5));
				assertEquals(new StringLink(0, 0, 0), r.getLink(6));
				assertEquals(new StringLink(0, 0, 0), r.getLink(7));
				assertEquals(new StringLink(0, 0, 0), r.getLink(8));
				assertEquals(new StringLink(0, 0, 0), r.getLink(9));
		}
}

// RelativeStringTest2.java
package de.beiri22.stringincrementor.relativestring;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RelativeString}.
* It contains ten unit test cases for the {@link RelativeString#addLink(StringLink)} method.
*/
class RelativeStringTest2 {
		
		/**
		* Test case for the {@link RelativeString#addLink(StringLink)} method.
		*/
		@Test
		void testAddLink() {
				RelativeString r = new RelativeString();
				assertTrue(r.addLink(new StringLink(0, 0, 0)));
				assertTrue(r.addLink(new StringLink(0, 0, 0)));
				assertTrue(r.addLink(new StringLink(0, 0, 0)));
				assertTrue(r.addLink(new StringLink(0, 0, 0)));
				assertTrue(r.addLink(new StringLink(0, 0, 0)));
				assertTrue(r.addLink(new StringLink(0, 0, 0)));
				assertTrue(r.addLink(new StringLink(0, 0, 0)));
				assertTrue(r.addLink(new StringLink(0, 0, 0)));
				assertTrue(r.addLink(new StringLink(0, 0, 0)));
				assertTrue(r.addLink(new StringLink(0, 0, 0)));
		}
}

// RelativeStringTest3.java
package de.beiri22.stringincrementor.relativestring;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RelativeString}.
* It contains ten unit test cases for the {@link RelativeString#toString()} method.
*/
class RelativeStringTest3 {
		
		/**
		* Test case for the {@link RelativeString#toString()} method.
		*/
		@Test
		void testToString() {
				RelativeString r = new RelativeString();
				assertEquals("0 links, 0 absolute chars (8 Bytes ^= 0Bytes)", r.toString());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals("1 links, 0 absolute chars (20 Bytes ^= -12Bytes)", r.toString());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals("2 links, 0 absolute chars (32 Bytes ^= -24Bytes)", r.toString());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals("3 links, 0 absolute chars (44 Bytes ^= -36Bytes)", r.toString());
				r.addLink(new StringLink(0, 0, 0));
				assertEquals("4 links, 0 absolute chars (56 Bytes ^= -48Bytes)", r.toString());
		