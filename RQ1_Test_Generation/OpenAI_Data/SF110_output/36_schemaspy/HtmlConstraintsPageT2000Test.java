// HtmlConstraintsPageTest.java
package net.sourceforge.schemaspy.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import net.sourceforge.schemaspy.DbAnalyzer;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.util.HtmlEncoder;
import net.sourceforge.schemaspy.util.LineWriter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlConstraintsPage}.
* It contains ten unit test cases for the {@link HtmlConstraintsPage#getInstance()} method.
*/
class HtmlConstraintsPageTest {

	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull2() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull3() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull4() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull5() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull6() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull7() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull8() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull9() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull10() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
}

// HtmlConstraintsPageTest.java
package net.sourceforge.schemaspy.view;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;
import net.sourceforge.schemaspy.DbAnalyzer;
import net.sourceforge.schemaspy.model.Database;
import net.sourceforge.schemaspy.model.ForeignKeyConstraint;
import net.sourceforge.schemaspy.model.Table;
import net.sourceforge.schemaspy.model.TableColumn;
import net.sourceforge.schemaspy.util.HtmlEncoder;
import net.sourceforge.schemaspy.util.LineWriter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HtmlConstraintsPage}.
* It contains ten unit test cases for the {@link HtmlConstraintsPage#getInstance()} method.
*/
class HtmlConstraintsPageTest {
		
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull2() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull3() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull4() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull5() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull6() {
		assertThrows(NullPointerException.class, () -> {
			HtmlConstraintsPage.getInstance();
		});
	}
	
	/**
	* Test case for {@link HtmlConstraintsPage#getInstance()} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testGetInstanceNull7() {
	