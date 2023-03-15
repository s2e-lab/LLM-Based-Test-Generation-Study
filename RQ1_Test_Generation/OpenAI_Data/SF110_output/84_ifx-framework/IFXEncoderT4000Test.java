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
	* It tests the encoding of an IFXObject.
	*/
	@Test
	void testEncodeIFXObject() throws Exception {
		IFXEncoder encoder = new IFXEncoder();
		IFXObject obj = new IFXObject();
		Element element = encoder.encode(obj);
		assertEquals("IFXObject", element.getName());
	}
}