// PDPadapter_0Test.java
package com.browsersoft.aacs.xacml;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import com.sun.xacml.ConfigurationStore;
import com.sun.xacml.Indenter;
import com.sun.xacml.PDP;
import com.sun.xacml.ParsingException;
import com.sun.xacml.ctx.RequestCtx;
import com.sun.xacml.ctx.ResponseCtx;
import com.sun.xacml.ctx.Result;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PDPadapter}.
* It contains ten unit test cases for the {@link PDPadapter#evaluate(String)} method.
*/
class PDPadapter_0Test {

	/**
	* Test case for the {@link PDPadapter#evaluate(String)} method.
	* The test case tests the following assertion:
	* <ul>
	* 	<li>The method returns a ResponseCtx object.</li>
	* </ul>
	*/
	@Test
	void testEvaluate_0() throws IOException, ParsingException {
		// create a PDPadapter object
		PDPadapter pdPadapter = new PDPadapter("src/test/resources/xacml/config/pdp-config.xml");
		// evaluate the request
		ResponseCtx response = pdPadapter.evaluate("src/test/resources/xacml/requests/request-1.xml");
		// check that the response is not null
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link PDPadapter#evaluate(String)} method.
	* The test case tests the following assertion:
	* <ul>
	* 	<li>The method returns a ResponseCtx object.</li>
	* </ul>
	*/
	@Test
	void testEvaluate_1() throws IOException, ParsingException {
		// create a PDPadapter object
		PDPadapter pdPadapter = new PDPadapter("src/test/resources/xacml/config/pdp-config.xml");
		// evaluate the request
		ResponseCtx response = pdPadapter.evaluate("src/test/resources/xacml/requests/request-2.xml");
		// check that the response is not null
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link PDPadapter#evaluate(String)} method.
	* The test case tests the following assertion:
	* <ul>
	* 	<li>The method returns a ResponseCtx object.</li>
	* </ul>
	*/
	@Test
	void testEvaluate_2() throws IOException, ParsingException {
		// create a PDPadapter object
		PDPadapter pdPadapter = new PDPadapter("src/test/resources/xacml/config/pdp-config.xml");
		// evaluate the request
		ResponseCtx response = pdPadapter.evaluate("src/test/resources/xacml/requests/request-3.xml");
		// check that the response is not null
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link PDPadapter#evaluate(String)} method.
	* The test case tests the following assertion:
	* <ul>
	* 	<li>The method returns a ResponseCtx object.</li>
	* </ul>
	*/
	@Test
	void testEvaluate_3() throws IOException, ParsingException {
		// create a PDPadapter object
		PDPadapter pdPadapter = new PDPadapter("src/test/resources/xacml/config/pdp-config.xml");
		// evaluate the request
		ResponseCtx response = pdPadapter.evaluate("src/test/resources/xacml/requests/request-4.xml");
		// check that the response is not null
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link PDPadapter#evaluate(String)} method.
	* The test case tests the following assertion:
	* <ul>
	* 	<li>The method returns a ResponseCtx object.</li>
	* </ul>
	*/
	@Test
	void testEvaluate_4() throws IOException, ParsingException {
		// create a PDPadapter object
		PDPadapter pdPadapter = new PDPadapter("src/test/resources/xacml/config/pdp-config.xml");
		// evaluate the request
		ResponseCtx response = pdPadapter.evaluate("src/test/resources/xacml/requests/request-5.xml");
		// check that the response is not null
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link PDPadapter#evaluate(String)} method.
	* The test case tests the following assertion:
	* <ul>
	* 	<li>The method returns a ResponseCtx object.</li>
	* </ul>
	*/
	@Test
	void testEvaluate_5() throws IOException, ParsingException {
		// create a PDPadapter object
		PDPadapter pdPadapter = new PDPadapter("src/test/resources/xacml/config/pdp-config.xml");
		// evaluate the request
		ResponseCtx response = pdPadapter.evaluate("src/test/resources/xacml/requests/request-6.xml");
		// check that the response is not null
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link PDPadapter#evaluate(String)} method.
	* The test case tests the following assertion:
	* <ul>
	* 	<li>The method returns a ResponseCtx object.</li>
	* </ul>
	*/
	@Test
	void testEvaluate_6() throws IOException, ParsingException {
		// create a PDPadapter object
		PDPadapter pdPadapter = new PDPadapter("src/test/resources/xacml/config/pdp-config.xml");
		// evaluate the request
		ResponseCtx response = pdPadapter.evaluate("src/test/resources/xacml/requests/request-7.xml");
		// check that the response is not null
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link PDPadapter#evaluate(String)} method.
	* The test case tests the following assertion:
	* <ul>
	* 	<li>The method returns a ResponseCtx object.</li>
	* </ul>
	*/
	@Test
	void testEvaluate_7() throws IOException, ParsingException {
		// create a PDPadapter object
		PDPadapter pdPadapter = new PDPadapter("src/test/resources/xacml/config/pdp-config.xml");
		// evaluate the request
		ResponseCtx response = pdPadapter.evaluate("src/test/resources/xacml/requests/request-8.xml");
		// check that the response is not null
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link PDPadapter#evaluate(String)} method.
	* The test case tests the following assertion:
	* <ul>
	* 	<li>The method returns a ResponseCtx object.</li>
	* </ul>
	*/
	@Test
	void testEvaluate_8() throws IOException, ParsingException {
		// create a PDPadapter object
		PDPadapter pdPadapter = new PDPadapter("src/test/resources/xacml/config/pdp-config.xml");
		// evaluate the request
		ResponseCtx response = pdPadapter.evaluate("src/test/resources/xacml/requests/request-9.xml");
		// check that the response is not null
		assertNotNull(response);
	}
	
	/**
	* Test case for the {@link PDPadapter#evaluate(String)} method.
	* The test case tests the following assertion:
	* <ul>
	* 	<li>The method returns a ResponseCtx object.</li>
	* </ul>
	*/
	@Test
	void testEvaluate_9() throws IOException, ParsingException {
		// create a PDPadapter object
		PDPadapter pdPadapter = new PDPadapter("src/test/resources/xacml/config/pdp-config.xml");
		// evaluate the request
		ResponseCtx response = pdPadapter.evaluate("src/test/