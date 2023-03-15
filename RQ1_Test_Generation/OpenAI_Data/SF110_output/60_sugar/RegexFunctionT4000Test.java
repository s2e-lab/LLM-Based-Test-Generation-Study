// RegexFunctionTest.java
/*
 * RegexFunction.java
 *
 * Created on 23 April 2008, 22:30
 *
 */
package net.sf.sugar.fspath.xpath;

import java.util.List;
import java.util.regex.Pattern;
import java.util.regex.PatternSyntaxException;
import javax.xml.xpath.XPathFunctionException;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RegexFunction}.
* It contains ten unit test cases for the {@link RegexFunction#evaluate(List)} method.
*/
class RegexFunctionTest {

	/**
	 * Test of evaluate method, of class RegexFunction.
	 * This test case tests the evaluation of a String argument.
	 */
	@Test
	void testEvaluate_String() throws Exception {
		System.out.println("evaluate(String)");
		List args = new java.util.ArrayList();
		args.add("abc");
		args.add("[a-z]{3}");
		RegexFunction instance = new RegexFunction();
		Object expResult = new Boolean(true);
		Object result = instance.evaluate(args);
		assertEquals(expResult, result);
	}

	/**
	 * Test of evaluate method, of class RegexFunction.
	 * This test case tests the evaluation of a Boolean argument.
	 */
	@Test
	void testEvaluate_Boolean() throws Exception {
		System.out.println("evaluate(Boolean)");
		List args = new java.util.ArrayList();
		args.add(new Boolean(true));
		args.add("true");
		RegexFunction instance = new RegexFunction();
		Object expResult = new Boolean(true);
		Object result = instance.evaluate(args);
		assertEquals(expResult, result);
	}

	/**
	 * Test of evaluate method, of class RegexFunction.
	 * This test case tests the evaluation of a Double argument.
	 */
	@Test
	void testEvaluate_Double() throws Exception {
		System.out.println("evaluate(Double)");
		List args = new java.util.ArrayList();
		args.add(new Double(1.0));
		args.add("[0-9]\\.[0-9]");
		RegexFunction instance = new RegexFunction();
		Object expResult = new Boolean(true);
		Object result = instance.evaluate(args);
		assertEquals(expResult, result);
	}

	/**
	 * Test of evaluate method, of class RegexFunction.
	 * This test case tests the evaluation of a NodeList argument.
	 */
	@Test
	void testEvaluate_NodeList() throws Exception {
		System.out.println("evaluate(NodeList)");
		List args = new java.util.ArrayList();
		args.add(new org.w3c.dom.NodeList() {
			public org.w3c.dom.Node item(int index) {
				return new org.w3c.dom.Node() {
					public String getTextContent() {
						return "abc";
					}
				};
			}
			public int getLength() {
				return 1;
			}
		});
		args.add("[a-z]{3}");
		RegexFunction instance = new RegexFunction();
		Object expResult = new Boolean(true);
		Object result = instance.evaluate(args);
		assertEquals(expResult, result);
	}

	/**
	 * Test of evaluate method, of class RegexFunction.
	 * This test case tests the evaluation of a NodeList argument.
	 */
	@Test
	void testEvaluate_NodeList_2() throws Exception {
		System.out.println("evaluate(NodeList)");
		List args = new java.util.ArrayList();
		args.add(new org.w3c.dom.NodeList() {
			public org.w3c.dom.Node item(int index) {
				return new org.w3c.dom.Node() {
					public String getTextContent() {
						return "abc";
					}
				};
			}
			public int getLength() {
				return 0;
			}
		});
		args.add("[a-z]{3}");
		RegexFunction instance = new RegexFunction();
		Object expResult = new Boolean(false);
		Object result = instance.evaluate(args);
		assertEquals(expResult, result);
	}

	/**
	 * Test of evaluate method, of class RegexFunction.
	 * This test case tests the evaluation of a NodeList argument.
	 */
	@Test
	void testEvaluate_NodeList_3() throws Exception {
		System.out.println("evaluate(NodeList)");
		List args = new java.util.ArrayList();
		args.add(new org.w3c.dom.NodeList() {
			public org.w3c.dom.Node item(int index) {
				return new org.w3c.dom.Node() {
					public String getTextContent() {
						return "abc";
					}
				};
			}
			public int getLength() {
				return 2;
			}
		});
		args.add("[a-z]{3}");
		RegexFunction instance = new RegexFunction();
		Object expResult = new Boolean(true);
		Object result = instance.evaluate(args);
		assertEquals(expResult, result);
	}

	/**
	 * Test of evaluate method, of class RegexFunction.
	 * This test case tests the evaluation of a NodeList argument.
	 */
	@Test
	void testEvaluate_NodeList_4() throws Exception {
		System.out.println("evaluate(NodeList)");
		List args = new java.util.ArrayList();
		args.add(new org.w3c.dom.NodeList() {
			public org.w3c.dom.Node item(int index) {
				return new org.w3c.dom.Node() {
					public String getTextContent() {
						return "abc";
					}
				};
			}
			public int getLength() {
				return 2;
			}
		});
		args.add("[a-z]{4}");
		RegexFunction instance = new RegexFunction();
		Object expResult = new Boolean(false);
		Object result = instance.evaluate(args);
		assertEquals(expResult, result);
	}

	/**
	 * Test of evaluate method, of class RegexFunction.
	 * This test case tests the evaluation of a NodeList argument.
	 */
	@Test
	void testEvaluate_NodeList_5() throws Exception {
		System.out.println("evaluate(NodeList)");
		List args = new java.util.ArrayList();
		args.add(new org.w3c.dom.NodeList() {
			public org.w3c.dom.Node item(int index) {
				return new org.w3c.dom.Node() {
					public String getTextContent() {
						return "abc";
					}
				};
			}
			public int getLength() {
				return 2;
			}
		});
		args.add("[a-z]{2}");
		RegexFunction instance = new RegexFunction();
		Object expResult = new Boolean(false);
		Object result = instance.evaluate(args);
		assertEquals(expResult, result);
	}

	/**
	 * Test of evaluate method, of class RegexFunction.
	 * This test case tests the evaluation of a NodeList argument.
	 */
	@Test
	void testEvaluate_NodeList_6() throws Exception {
		System.out.println("evaluate(NodeList)");
		List args = new java.util.ArrayList();
		args.add(new org.w3c.dom.NodeList() {
			public org.w3c.dom.Node item(int index) {
				return new org.w3c.dom.Node() {
					public String getTextContent() {
						return "abc";
					}
				};
			}
			public int getLength() {
				return 2;
			}
		});
		args.add("[a-z]{1}");
		RegexFunction instance = new RegexFunction();
		Object expResult = new Boolean(false);
		Object result = instance.evaluate(args);
		assertEquals(expResult, result);
	}

	/**
	 * Test of evaluate method, of class RegexFunction.
	 * This test case tests the evaluation of a NodeList argument.
	 */
	@Test
	void testEvaluate_NodeList_7() throws Exception {
		System.out.println("evaluate(NodeList)");
		List args = new java.util.ArrayList();
		args.add(new org.w3c.dom.NodeList() {
			public org.w3c.dom.Node item(int index) {
				return new org.w3c.dom.Node() {
					public String getTextContent() {
						return "abc";
					}
				};
			}
			public int getLength() {
				return 2;
			}
		});
		args.add("[a-z]{0}");
		RegexFunction instance = new RegexFunction();
		Object expResult = new Boolean(true);
		Object result = instance.evaluate(args);
		assertEquals(expResult, result);
	}

	/**
	 * Test of evaluate method, of class RegexFunction.
	 * This test case tests the evaluation of a NodeList argument.
	 */
	@Test
	void testEvaluate_NodeList_8() throws Exception {
		System.out.println("evaluate(NodeList)");
		List args = new java.util.ArrayList();
		args.add(new org.w3c.dom.NodeList() {
			public org.w3c.dom.Node item(int index) {
				return new org.w3c.dom.Node() {
					public String getTextContent() {
						return "abc";
					}
				};
			}
			public int getLength() {
				return 2;
			}
		});
		args.add("[a-z]{-1}");
		RegexFunction instance = new RegexFunction();
		Object expResult = new Boolean(false);
		Object result = instance.evaluate(args);
		assertEquals(expResult, result);
	}

	/**
	 * Test of evaluate method, of class RegexFunction.
	 * This test case tests the evaluation of a NodeList argument.
	 */
	@Test
	void testEvaluate_NodeList_9() throws Exception {
		System.out.println("evaluate(NodeList)");
		List args = new java.util.ArrayList();
		args.add(new org.w3c.dom.NodeList() {
			public org.w3c.dom.Node item(int index) {
				return new org.w3c.dom.Node() {
					public String getTextContent() {
						return "abc";
					}
				};
			}
			public int getLength() {
				return 2;
			}
		});
		args.add("[a-z]{-1}");
		RegexFunction instance = new RegexFunction();
		Object expResult = new Boolean(false);
		Object result = instance.evaluate(args);
		assertEquals(expResult, result);
	}

	/**
	 * Test of evaluate method, of class RegexFunction.
	 * This test case tests the evaluation of a NodeList argument.
	 */
	@Test
	void testEvaluate_NodeList_10() throws Exception {
		System.out.println("evaluate(NodeList)");
		List args = new java.util.ArrayList();
		args.add(new org.w3c.dom.NodeList() {
			public org.w3c.dom.Node item(int index) {
				return new org.w3c.dom.Node() {
					public String getTextContent() {
						return "abc";
					}
				};
			}
			public int getLength() {
				return 2;
			}
		});
		args.add("[a-z]{-1}");
		RegexFunction instance = new RegexFunction();
		Object expResult = new Boolean(false);
		Object result = instance.evaluate(args);
		assertEquals(expResult, result);
	}
}