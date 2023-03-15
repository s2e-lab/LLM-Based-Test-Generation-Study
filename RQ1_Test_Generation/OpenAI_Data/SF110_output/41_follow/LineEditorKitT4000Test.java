// LineEditorKitTest.java
package ghm.follow.gui;

import javax.swing.text.Element;
import javax.swing.text.StyledEditorKit;
import javax.swing.text.View;
import javax.swing.text.ViewFactory;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LineEditorKit}.
* It contains ten unit test cases for the {@link LineEditorKit#create(Element)} method.
*/
class LineEditorKitTest {

	/**
	* Test case for {@link LineEditorKit#create(Element)} method.
	* Test data: null.
	* Expected result: NullPointerException.
	*/
	@Test
	void testCreate_Null() {
		LineEditorKit lineEditorKit = new LineEditorKit();
		assertThrows(NullPointerException.class, () -> lineEditorKit.create(null));
	}
	
	/**
	* Test case for {@link LineEditorKit#create(Element)} method.
	* Test data: {@link Element} with name "content".
	* Expected result: {@link LineView}.
	*/
	@Test
	void testCreate_Content() {
		LineEditorKit lineEditorKit = new LineEditorKit();
		Element element = new Element() {
			public String getName() {
				return "content";
			}
		};
		View view = lineEditorKit.create(element);
		assertTrue(view instanceof LineView);
	}
	
	/**
	* Test case for {@link LineEditorKit#create(Element)} method.
	* Test data: {@link Element} with name "paragraph".
	* Expected result: {@link LineView}.
	*/
	@Test
	void testCreate_Paragraph() {
		LineEditorKit lineEditorKit = new LineEditorKit();
		Element element = new Element() {
			public String getName() {
				return "paragraph";
			}
		};
		View view = lineEditorKit.create(element);
		assertTrue(view instanceof LineView);
	}
	
	/**
	* Test case for {@link LineEditorKit#create(Element)} method.
	* Test data: {@link Element} with name "section".
	* Expected result: {@link LineView}.
	*/
	@Test
	void testCreate_Section() {
		LineEditorKit lineEditorKit = new LineEditorKit();
		Element element = new Element() {
			public String getName() {
				return "section";
			}
		};
		View view = lineEditorKit.create(element);
		assertTrue(view instanceof LineView);
	}
	
	/**
	* Test case for {@link LineEditorKit#create(Element)} method.
	* Test data: {@link Element} with name "component".
	* Expected result: {@link LineView}.
	*/
	@Test
	void testCreate_Component() {
		LineEditorKit lineEditorKit = new LineEditorKit();
		Element element = new Element() {
			public String getName() {
				return "component";
			}
		};
		View view = lineEditorKit.create(element);
		assertTrue(view instanceof LineView);
	}
	
	/**
	* Test case for {@link LineEditorKit#create(Element)} method.
	* Test data: {@link Element} with name "icon".
	* Expected result: {@link LineView}.
	*/
	@Test
	void testCreate_Icon() {
		LineEditorKit lineEditorKit = new LineEditorKit();
		Element element = new Element() {
			public String getName() {
				return "icon";
			}
		};
		View view = lineEditorKit.create(element);
		assertTrue(view instanceof LineView);
	}
	
	/**
	* Test case for {@link LineEditorKit#create(Element)} method.
	* Test data: {@link Element} with name "leaf".
	* Expected result: {@link LineView}.
	*/
	@Test
	void testCreate_Leaf() {
		LineEditorKit lineEditorKit = new LineEditorKit();
		Element element = new Element() {
			public String getName() {
				return "leaf";
			}
		};
		View view = lineEditorKit.create(element);
		assertTrue(view instanceof LineView);
	}
	
	/**
	* Test case for {@link LineEditorKit#create(Element)} method.
	* Test data: {@link Element} with name "branch".
	* Expected result: {@link LineView}.
	*/
	@Test
	void testCreate_Branch() {
		LineEditorKit lineEditorKit = new LineEditorKit();
		Element element = new Element() {
			public String getName() {
				return "branch";
			}
		};
		View view = lineEditorKit.create(element);
		assertTrue(view instanceof LineView);
	}
	
	/**
	* Test case for {@link LineEditorKit#create(Element)} method.
	* Test data: {@link Element} with name "unknown".
	* Expected result: {@link LineView}.
	*/
	@Test
	void testCreate_Unknown() {
		LineEditorKit lineEditorKit = new LineEditorKit();
		Element element = new Element() {
			public String getName() {
				return "unknown";
			}
		};
		View view = lineEditorKit.create(element);
		assertTrue(view instanceof LineView);
	}
	
	/**
	* Test case for {@link LineEditorKit#create(Element)} method.
	* Test data: {@link Element} with name "".
	* Expected result: {@link LineView}.
	*/
	@Test
	void testCreate_Empty() {
		LineEditorKit lineEditorKit = new LineEditorKit();
		Element element = new Element() {
			public String getName() {
				return "";
			}
		};
		View view = lineEditorKit.create(element);
		assertTrue(view instanceof LineView);
	}
}