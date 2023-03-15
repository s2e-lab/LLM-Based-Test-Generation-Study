// _GetEngineResponse_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _GetEngineResponse}.
* It contains ten unit test cases for the {@link _GetEngineResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _GetEngineResponse_2Test {

	/**
	* Test case for the {@link _GetEngineResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_1() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _GetEngineResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _GetEngineResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_2() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _GetEngineResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _GetEngineResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_3() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _GetEngineResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _GetEngineResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_4() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _GetEngineResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _GetEngineResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_5() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _GetEngineResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _GetEngineResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_6() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _GetEngineResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _GetEngineResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_7() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _GetEngineResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _GetEngineResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_8() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _GetEngineResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _GetEngineResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_9() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _GetEngineResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _GetEngineResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_10() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _GetEngineResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
}

// _GetEngineResponse_2.java
/**
 * _GetEngineResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */
package mygrid.web;

public class _GetEngineResponse implements java.io.Serializable {

    private mygrid.web.Engine getEngineResult;

    public _GetEngineResponse() {
    }

    public mygrid.web.Engine getGetEngineResult() {
        return getEngineResult;
    }

    public void setGetEngineResult(mygrid.web.Engine getEngineResult) {
        this.getEngineResult = getEngineResult;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _GetEngineResponse))
            return false;
        _GetEngineResponse other = (_GetEngineResponse) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && ((this.getEngineResult == null && other.getGetEngineResult() == null) || (this.getEngineResult != null && this.getEngineResult.equals(other.getGetEngineResult()))