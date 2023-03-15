// _CompleteResponse_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _CompleteResponse}.
* It contains ten unit test cases for the {@link _CompleteResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _CompleteResponse_2Test {

	/**
	* Test case for the {@link _CompleteResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_1() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _CompleteResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _CompleteResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_2() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _CompleteResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _CompleteResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_3() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _CompleteResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _CompleteResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_4() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _CompleteResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _CompleteResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_5() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _CompleteResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _CompleteResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_6() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _CompleteResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _CompleteResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_7() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _CompleteResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _CompleteResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_8() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _CompleteResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _CompleteResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_9() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _CompleteResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
	/**
	* Test case for the {@link _CompleteResponse#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_10() throws Exception {
		String mechType = "";
		Class _javaType = null;
		javax.xml.namespace.QName _xmlType = null;
		org.apache.axis.encoding.Serializer result = _CompleteResponse.getSerializer(mechType, _javaType, _xmlType);
		assertNotNull(result);
	}
	
}

// _CompleteResponse_2.java
/**
 * _CompleteResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */
package mygrid.web;

public class _CompleteResponse implements java.io.Serializable {

    private boolean completeResult;

    public _CompleteResponse() {
    }

    public boolean isCompleteResult() {
        return completeResult;
    }

    public void setCompleteResult(boolean completeResult) {
        this.completeResult = completeResult;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _CompleteResponse))
            return false;
        _CompleteResponse other = (_CompleteResponse) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && this.completeResult == other.isCompleteResult();
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        _hash