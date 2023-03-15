// TextTest.java
package nu.staldal.xtree;

import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Text}.
* It contains ten unit test cases for the {@link Text#asCharArray()} method.
*/
class TextTest {

	@Test
	void testAsCharArray() {
		char[] data = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
		Text text = new Text(data, 0, data.length, false);
		assertArrayEquals(data, text.asCharArray());
		
		text = new Text(data, 0, data.length, true);
		assertArrayEquals(data, text.asCharArray());
		
		text = new Text(data, 5, data.length - 5, false);
		assertArrayEquals(data, text.asCharArray());
		
		text = new Text(data, 5, data.length - 5, true);
		assertArrayEquals(data, text.asCharArray());
		
		text = new Text(data, 0, data.length - 5, false);
		assertArrayEquals(data, text.asCharArray());
		
		text = new Text(data, 0, data.length - 5, true);
		assertArrayEquals(data, text.asCharArray());
		
		text = new Text(data, 5, data.length - 10, false);
		assertArrayEquals(data, text.asCharArray());
		
		text = new Text(data, 5, data.length - 10, true);
		assertArrayEquals(data, text.asCharArray());
		
		text = new Text(data, 5, data.length - 5, false);
		assertArrayEquals(data, text.asCharArray());
		
		text = new Text(data, 5, data.length - 5, true);
		assertArrayEquals(data, text.asCharArray());
	}
}