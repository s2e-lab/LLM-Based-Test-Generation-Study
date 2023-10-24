// IFXEncoderTest.java
package org.sourceforge.ifx.utils;

import java.lang.reflect.Array;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.io.Writer;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ResourceBundle;
import java.util.MissingResourceException;
import org.sourceforge.ifx.basetypes.IFXObject;
import org.sourceforge.ifx.basetypes.IBaseType;
import org.jdom.Element;
import org.jdom.Namespace;
import org.jdom.output.XMLOutputter;
import org.jdom.input.SAXBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link IFXEncoder}.
* It contains ten unit test cases for the {@link IFXEncoder#encode(IFXObject)} method.
*/
class IFXEncoderTest {

    /**
    * Test case for {@link IFXEncoder#encode(IFXObject)} method.
    * It tests the encoding of an IFXObject with no attributes and no child elements.
    */
    @Test
    void testEncode1() {
        try {
            IFXObject obj = new IFXObject() {
                public String getElementName() {
                    return "TestObject";
                }
            };
            IFXEncoder encoder = new IFXEncoder();
            Element element = encoder.encode(obj);
            assertEquals("TestObject", element.getName());
            assertEquals(0, element.getAttributes().size());
            assertEquals(0, element.getChildren().size());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link IFXEncoder#encode(IFXObject)} method.
    * It tests the encoding of an IFXObject with no attributes and one child element.
    */
    @Test
    void testEncode2() {
        try {
            IFXObject obj = new IFXObject() {
                public String getElementName() {
                    return "TestObject";
                }
                public IFXObject getChild() {
                    return new IFXObject() {
                        public String getElementName() {
                            return "Child";
                        }
                    };
                }
            };
            IFXEncoder encoder = new IFXEncoder();
            Element element = encoder.encode(obj);
            assertEquals("TestObject", element.getName());
            assertEquals(0, element.getAttributes().size());
            assertEquals(1, element.getChildren().size());
            Element childElement = (Element) element.getChildren().get(0);
            assertEquals("Child", childElement.getName());
            assertEquals(0, childElement.getAttributes().size());
            assertEquals(0, childElement.getChildren().size());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link IFXEncoder#encode(IFXObject)} method.
    * It tests the encoding of an IFXObject with no attributes and two child elements.
    */
    @Test
    void testEncode3() {
        try {
            IFXObject obj = new IFXObject() {
                public String getElementName() {
                    return "TestObject";
                }
                public IFXObject getChild1() {
                    return new IFXObject() {
                        public String getElementName() {
                            return "Child1";
                        }
                    };
                }
                public IFXObject getChild2() {
                    return new IFXObject() {
                        public String getElementName() {
                            return "Child2";
                        }
                    };
                }
            };
            IFXEncoder encoder = new IFXEncoder();
            Element element = encoder.encode(obj);
            assertEquals("TestObject", element.getName());
            assertEquals(0, element.getAttributes().size());
            assertEquals(2, element.getChildren().size());
            Element childElement1 = (Element) element.getChildren().get(0);
            assertEquals("Child1", childElement1.getName());
            assertEquals(0, childElement1.getAttributes().size());
            assertEquals(0, childElement1.getChildren().size());
            Element childElement2 = (Element) element.getChildren().get(1);
            assertEquals("Child2", childElement2.getName());
            assertEquals(0, childElement2.getAttributes().size());
            assertEquals(0, childElement2.getChildren().size());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link IFXEncoder#encode(IFXObject)} method.
    * It tests the encoding of an IFXObject with one attribute and no child elements.
    */
    @Test
    void testEncode4() {
        try {
            IFXObject obj = new IFXObject() {
                public String getElementName() {
                    return "TestObject";
                }
                public String getAttribute1() {
                    return "Value1";
                }
            };
            IFXEncoder encoder = new IFXEncoder();
            Element element = encoder.encode(obj);
            assertEquals("TestObject", element.getName());
            assertEquals(1, element.getAttributes().size());
            assertEquals("Value1", element.getAttributeValue("Attribute1"));
            assertEquals(0, element.getChildren().size());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link IFXEncoder#encode(IFXObject)} method.
    * It tests the encoding of an IFXObject with one attribute and one child element.
    */
    @Test
    void testEncode5() {
        try {
            IFXObject obj = new IFXObject() {
                public String getElementName() {
                    return "TestObject";
                }
                public String getAttribute1() {
                    return "Value1";
                }
                public IFXObject getChild() {
                    return new IFXObject() {
                        public String getElementName() {
                            return "Child";
                        }
                    };
                }
            };
            IFXEncoder encoder = new IFXEncoder();
            Element element = encoder.encode(obj);
            assertEquals("TestObject", element.getName());
            assertEquals(1, element.getAttributes().size());
            assertEquals("Value1", element.getAttributeValue("Attribute1"));
            assertEquals(1, element.getChildren().size());
            Element childElement = (Element) element.getChildren().get(0);
            assertEquals("Child", childElement.getName());
            assertEquals(0, childElement.getAttributes().size());
            assertEquals(0, childElement.getChildren().size());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link IFXEncoder#encode(IFXObject)} method.
    * It tests the encoding of an IFXObject with one attribute and two child elements.
    */
    @Test
    void testEncode6() {
        try {
            IFXObject obj = new IFXObject() {
                public String getElementName() {
                    return "TestObject";
                }
                public String getAttribute1() {
                    return "Value1";
                }
                public IFXObject getChild1() {
                    return new IFXObject() {
                        public String getElementName() {
                            return "Child1";
                        }
                    };
                }
                public IFXObject getChild2() {
                    return new IFXObject() {
                        public String getElementName() {
                            return "Child2";
                        }
                    };
                }
            };
            IFXEncoder encoder = new IFXEncoder();
            Element element = encoder.encode(obj);
            assertEquals("TestObject", element.getName());
            assertEquals(1, element.getAttributes().size());
            assertEquals("Value1", element.getAttributeValue("Attribute1"));
            assertEquals(2, element.getChildren().size());
            Element childElement1 = (Element) element.getChildren().get(0);
            assertEquals("Child1", childElement1.getName());
            assertEquals(0, childElement1.getAttributes().size());
            assertEquals(0, childElement1.getChildren().size());
            Element childElement2 = (Element) element.getChildren().get(1);
            assertEquals("Child2", childElement2.getName());
            assertEquals(0, childElement2.getAttributes().size());
            assertEquals(0, childElement2.getChildren().size());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link IFXEncoder#encode(IFXObject)} method.
    * It tests the encoding of an IFXObject with two attributes and no child elements.
    */
    @Test
    void testEncode7() {
        try {
            IFXObject obj = new IFXObject() {
                public String getElementName() {
                    return "TestObject";
                }
                public String getAttribute1() {
                    return "Value1";
                }
                public String getAttribute2() {
                    return "Value2";
                }
            };
            IFXEncoder encoder = new IFXEncoder();
            Element element = encoder.encode(obj);
            assertEquals("TestObject", element.getName());
            assertEquals(2, element.getAttributes().size());
            assertEquals("Value1", element.getAttributeValue("Attribute1"));
            assertEquals("Value2", element.getAttributeValue("Attribute2"));
            assertEquals(0, element.getChildren().size());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }

    /**
    * Test case for {@link IFXEncoder#encode(IFXObject)} method.
    * It tests the encoding of an IFXObject with two attributes and one child element.
    */
    @Test
    void testEncode8() {
        try {
            IFXObject obj = new IFXObject() {
                public String getElementName() {
                    return "TestObject";
                }
                public String getAttribute1() {
                    return "Value1";
                }
                public String getAttribute2() {
                    return "Value2";
                }
                public IFXObject getChild() {
                    return new IFXObject() {
                        public String getElementName() {
                            return "Child";
                        }
                    };
                }
            };
            IFXEncoder encoder = new IFXEncoder();
            Element element = encoder.encode(obj);
            assertEquals("TestObject", element.getName());
            assertEquals(2, element.getAttributes().size());
            assertEquals("Value1", element.getAttributeValue("Attribute1"));
            assertEquals("Value2", element.getAttributeValue("Attribute2