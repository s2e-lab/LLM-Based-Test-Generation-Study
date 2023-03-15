// PDPadapter_1Test.java
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
* It contains ten unit test cases for the {@link PDPadapter#makeDecision(RequestCtx)} method.
*/
class PDPadapter_1Test {

	/**
	* Test case 1 for {@link PDPadapter#makeDecision(RequestCtx)}.
	* It tests the case where the request is for a patient with a valid patient ID.
	* The expected result is that the request is permitted.
	*/
	@Test
	void testMakeDecision_1() throws IOException, ParsingException {
		// setup the request based on the file
		RequestCtx request = RequestCtx.getInstance(new FileInputStream("src/test/resources/xacml/request_1.xml"));
		// setup the PDP
		PDPadapter pdp = new PDPadapter("src/test/resources/xacml/pdp_1.xml");
		// evaluate the request
		int result = pdp.makeDecision(request);
		// check the result
		assertEquals(result, Result.DECISION_PERMIT);
	}
	
	/**
	* Test case 2 for {@link PDPadapter#makeDecision(RequestCtx)}.
	* It tests the case where the request is for a patient with an invalid patient ID.
	* The expected result is that the request is denied.
	*/
	@Test
	void testMakeDecision_2() throws IOException, ParsingException {
		// setup the request based on the file
		RequestCtx request = RequestCtx.getInstance(new FileInputStream("src/test/resources/xacml/request_2.xml"));
		// setup the PDP
		PDPadapter pdp = new PDPadapter("src/test/resources/xacml/pdp_1.xml");
		// evaluate the request
		int result = pdp.makeDecision(request);
		// check the result
		assertEquals(result, Result.DECISION_DENY);
	}
	
	/**
	* Test case 3 for {@link PDPadapter#makeDecision(RequestCtx)}.
	* It tests the case where the request is for a patient with a valid patient ID.
	* The expected result is that the request is permitted.
	*/
	@Test
	void testMakeDecision_3() throws IOException, ParsingException {
		// setup the request based on the file
		RequestCtx request = RequestCtx.getInstance(new FileInputStream("src/test/resources/xacml/request_3.xml"));
		// setup the PDP
		PDPadapter pdp = new PDPadapter("src/test/resources/xacml/pdp_1.xml");
		// evaluate the request
		int result = pdp.makeDecision(request);
		// check the result
		assertEquals(result, Result.DECISION_PERMIT);
	}
	
	/**
	* Test case 4 for {@link PDPadapter#makeDecision(RequestCtx)}.
	* It tests the case where the request is for a patient with an invalid patient ID.
	* The expected result is that the request is denied.
	*/
	@Test
	void testMakeDecision_4() throws IOException, ParsingException {
		// setup the request based on the file
		RequestCtx request = RequestCtx.getInstance(new FileInputStream("src/test/resources/xacml/request_4.xml"));
		// setup the PDP
		PDPadapter pdp = new PDPadapter("src/test/resources/xacml/pdp_1.xml");
		// evaluate the request
		int result = pdp.makeDecision(request);
		// check the result
		assertEquals(result, Result.DECISION_DENY);
	}
	
	/**
	* Test case 5 for {@link PDPadapter#makeDecision(RequestCtx)}.
	* It tests the case where the request is for a patient with a valid patient ID.
	* The expected result is that the request is permitted.
	*/
	@Test
	void testMakeDecision_5() throws IOException, ParsingException {
		// setup the request based on the file
		RequestCtx request = RequestCtx.getInstance(new FileInputStream("src/test/resources/xacml/request_5.xml"));
		// setup the PDP
		PDPadapter pdp = new PDPadapter("src/test/resources/xacml/pdp_1.xml");
		// evaluate the request
		int result = pdp.makeDecision(request);
		// check the result
		assertEquals(result, Result.DECISION_PERMIT);
	}
	
	/**
	* Test case 6 for {@link PDPadapter#makeDecision(RequestCtx)}.
	* It tests the case where the request is for a patient with an invalid patient ID.
	* The expected result is that the request is denied.
	*/
	@Test
	void testMakeDecision_6() throws IOException, ParsingException {
		// setup the request based on the file
		RequestCtx request = RequestCtx.getInstance(new FileInputStream("src/test/resources/xacml/request_6.xml"));
		// setup the PDP
		PDPadapter pdp = new PDPadapter("src/test/resources/xacml/pdp_1.xml");
		// evaluate the request
		int result = pdp.makeDecision(request);
		// check the result
		assertEquals(result, Result.DECISION_DENY);
	}
	
	/**
	* Test case 7 for {@link PDPadapter#makeDecision(RequestCtx)}.
	* It tests the case where the request is for a patient with a valid patient ID.
	* The expected result is that the request is permitted.
	*/
	@Test
	void testMakeDecision_7() throws IOException, ParsingException {
		// setup the request based on the file
		RequestCtx request = RequestCtx.getInstance(new FileInputStream("src/test/resources/xacml/request_7.xml"));
		// setup the PDP
		PDPadapter pdp = new PDPadapter("src/test/resources/xacml/pdp_1.xml");
		// evaluate the request
		int result = pdp.makeDecision(request);
		// check the result
		assertEquals(result, Result.DECISION_PERMIT);
	}
	
	/**
	* Test case 8 for {@link PDPadapter#makeDecision(RequestCtx)}.
	* It tests the case where the request is for a patient with an invalid patient ID.
	* The expected result is that the request is denied.
	*/
	@Test
	void testMakeDecision_8() throws IOException, ParsingException {
		// setup the request based on the file
		RequestCtx request = RequestCtx.getInstance(new FileInputStream("src/test/resources/xacml/request_8.xml"));
		// setup the PDP
		PDPadapter pdp = new PDPadapter("src/test/resources/xacml/pdp_1.xml");
		// evaluate the request
		int result = pdp.makeDecision(request);
		// check the result
		assertEquals(result, Result.DECISION_DENY);
	}
	
	/**
	* Test case 9 for {@link PDPadapter#makeDecision(RequestCtx)}.
	* It tests the case where the request is for a patient with a valid patient ID.
	* The expected result is that the request is permitted.
	*/
	@Test
	void testMakeDecision_9() throws IOException, ParsingException {
		// setup the request based on the file
		RequestCtx request = RequestCtx.getInstance(new FileInputStream("src/test/resources/xacml/request_9.xml"));
		// setup the PDP
		PDPadapter pdp = new PDPadapter("src/test/resources/xacml/pdp_1.xml");
		// evaluate the request
		int result = pdp.makeDecision(request);
		// check the result
		assertEquals