// _LogonResponse_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _LogonResponse}.
* It contains ten unit test cases for the {@link _LogonResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _LogonResponse_2Test {

	/**
	* Test case for the {@link _LogonResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_1() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _LogonResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _LogonResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_2() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _LogonResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _LogonResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_3() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _LogonResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _LogonResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_4() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _LogonResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _LogonResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_5() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _LogonResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _LogonResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_6() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _LogonResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _LogonResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_7() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _LogonResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _LogonResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_8() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _LogonResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _LogonResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_9() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _LogonResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _LogonResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_10() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _LogonResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
}

// _LogonResponse_2.java
package mygrid.web;


/**
* This class was generated by the JAX-WS RI.
* JAX-WS RI 2.2.9-b130926.1035
* Generated source version: 2.2
* 
*/
@javax.jws.WebService(name = "LogonResponse", targetNamespace = "http://tempuri.org/")
public interface _LogonResponse {


    /**
     * 
     * @param logonResult
     */
    @javax.xml.ws.ResponseWrapper(localName = "LogonResponse", targetNamespace = "http://tempuri.org/", className = "mygrid.web.LogonResponse")
    @javax.xml.ws.RequestWrapper(localName = "Logon", targetNamespace = "http://tempuri.org/", className = "mygrid.web.Logon")
    public void logon(
        @javax.xml.bind.annotation.XmlElement(name = "LogonResult", namespace = "http://tempuri.org/", nillable = true)
        java.lang.Boolean logonResult);

}

// _LogonResponse_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class