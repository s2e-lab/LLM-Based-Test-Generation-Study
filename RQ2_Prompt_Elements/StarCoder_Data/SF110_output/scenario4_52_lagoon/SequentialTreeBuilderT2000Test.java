// SequentialTreeBuilderTest.java
package nu.staldal.xtree;

import java.util.*;
import java.io.*;
import java.net.URL;
import javax.xml.parsers.*;
import org.xml.sax.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SequentialTreeBuilder}.
* It contains ten unit test cases for the {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)} method.
*/
class SequentialTreeBuilderTest {

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the method with a valid XML document.
    */
    @Test
    void testParseXMLSequential() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a/><b/><c/></root>")), false, new ElementHandler() {
                public void startElement(Element element) {
                    System.out.println("startElement: " + element.getName());
                }
                public void endElement(Element element) {
                    System.out.println("endElement: " + element.getName());
                }
            });
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the method with a valid XML document.
    */
    @Test
    void testParseXMLSequentialWithBase() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a/><b/><c/></root>")), false, new ElementHandler() {
                public void startElement(Element element) {
                    System.out.println("startElement: " + element.getName());
                }
                public void endElement(Element element) {
                    System.out.println("endElement: " + element.getName());
                }
            }, new URL("http://www.example.com/"));
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the method with a valid XML document.
    */
    @Test
    void testParseXMLSequentialWithDTD() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a/><b/><c/></root>")), true, new ElementHandler() {
                public void startElement(Element element) {
                    System.out.println("startElement: " + element.getName());
                }
                public void endElement(Element element) {
                    System.out.println("endElement: " + element.getName());
                }
            });
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the method with a valid XML document.
    */
    @Test
    void testParseXMLSequentialWithDTDAndBase() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a/><b/><c/></root>")), true, new ElementHandler() {
                public void startElement(Element element) {
                    System.out.println("startElement: " + element.getName());
                }
                public void endElement(Element element) {
                    System.out.println("endElement: " + element.getName());
                }
            }, new URL("http://www.example.com/"));
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the method with an invalid XML document.
    */
    @Test
    void testParseXMLSequentialWithInvalidXML() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a/><b/><c/></root>")), false, new ElementHandler() {
                public void startElement(Element element) {
                    System.out.println("startElement: " + element.getName());
                }
                public void endElement(Element element) {
                    System.out.println("endElement: " + element.getName());
                }
            });
            fail("Expected SAXParseException");
        } catch (SAXParseException e) {
            // expected
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the method with an invalid XML document.
    */
    @Test
    void testParseXMLSequentialWithInvalidXMLAndBase() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a/><b/><c/></root>")), false, new ElementHandler() {
                public void startElement(Element element) {
                    System.out.println("startElement: " + element.getName());
                }
                public void endElement(Element element) {
                    System.out.println("endElement: " + element.getName());
                }
            }, new URL("http://www.example.com/"));
            fail("Expected SAXParseException");
        } catch (SAXParseException e) {
            // expected
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the method with an invalid XML document.
    */
    @Test
    void testParseXMLSequentialWithInvalidDTD() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a/><b/><c/></root>")), true, new ElementHandler() {
                public void startElement(Element element) {
                    System.out.println("startElement: " + element.getName());
                }
                public void endElement(Element element) {
                    System.out.println("endElement: " + element.getName());
                }
            });
            fail("Expected SAXParseException");
        } catch (SAXParseException e) {
            // expected
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the method with an invalid XML document.
    */
    @Test
    void testParseXMLSequentialWithInvalidDTDAndBase() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a/><b/><c/></root>")), true, new ElementHandler() {
                public void startElement(Element element) {
                    System.out.println("startElement: " + element.getName());
                }
                public void endElement(Element element) {
                    System.out.println("endElement: " + element.getName());
                }
            }, new URL("http://www.example.com/"));
            fail("Expected SAXParseException");
        } catch (SAXParseException e) {
            // expected
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the method with an invalid XML document.
    */
    @Test
    void testParseXMLSequentialWithInvalidXMLAndDTD() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a/><b/><c/></root>")), false, new ElementHandler() {
                public void startElement(Element element) {
                    System.out.println("startElement: " + element.getName());
                }
                public void endElement(Element element) {
                    System.out.println("endElement: " + element.getName());
                }
            });
            fail("Expected SAXParseException");
        } catch (SAXParseException e) {
            // expected
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the method with an invalid XML document.
    */
    @Test
    void testParseXMLSequentialWithInvalidXMLAndDTDAndBase() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a/><b/><c/></root>")), false, new ElementHandler() {
                public void startElement(Element element) {
                    System.out.println("startElement: " + element.getName());
                }
                public void endElement(Element element) {
                    System.out.println("endElement: " + element.getName());
                }
            }, new URL("http://www.example.com/"));
            fail("Expected SAXParseException");
        } catch (SAXParseException e) {
            // expected
        } catch (Exception e) {
            fail("Unexpected exception: " + e);
        }
    }

    /**
    * Test case for {@link SequentialTreeBuilder#parseXMLSequential(InputSource, boolean, ElementHandler)}.
    * It tests the method with an invalid XML document.
    */
    @Test
    void testParseXMLSequentialWithInvalidDTDAndXML() {
        try {
            SequentialTreeBuilder.parseXMLSequential(new InputSource(new StringReader("<root><a/><b/><c/></root>")), true, new ElementHandler() {
                public void startElement(Element element) {
                    System.out.println("