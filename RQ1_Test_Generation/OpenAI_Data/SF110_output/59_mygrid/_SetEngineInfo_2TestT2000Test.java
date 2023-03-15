// _SetEngineInfo_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _SetEngineInfo}.
* It contains ten unit test cases for the {@link _SetEngineInfo#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
*/
class _SetEngineInfo_2Test {

	/**
	* Test case for the {@link _SetEngineInfo#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_1() throws Exception {
		String mechType = "";
		Class _javaType = null;
		QName _xmlType = null;
		_SetEngineInfo.getSerializer(mechType, _javaType, _xmlType);
	}
	
	/**
	* Test case for the {@link _SetEngineInfo#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_2() throws Exception {
		String mechType = "";
		Class _javaType = null;
		QName _xmlType = null;
		_SetEngineInfo.getSerializer(mechType, _javaType, _xmlType);
	}
	
	/**
	* Test case for the {@link _SetEngineInfo#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_3() throws Exception {
		String mechType = "";
		Class _javaType = null;
		QName _xmlType = null;
		_SetEngineInfo.getSerializer(mechType, _javaType, _xmlType);
	}
	
	/**
	* Test case for the {@link _SetEngineInfo#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_4() throws Exception {
		String mechType = "";
		Class _javaType = null;
		QName _xmlType = null;
		_SetEngineInfo.getSerializer(mechType, _javaType, _xmlType);
	}
	
	/**
	* Test case for the {@link _SetEngineInfo#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_5() throws Exception {
		String mechType = "";
		Class _javaType = null;
		QName _xmlType = null;
		_SetEngineInfo.getSerializer(mechType, _javaType, _xmlType);
	}
	
	/**
	* Test case for the {@link _SetEngineInfo#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_6() throws Exception {
		String mechType = "";
		Class _javaType = null;
		QName _xmlType = null;
		_SetEngineInfo.getSerializer(mechType, _javaType, _xmlType);
	}
	
	/**
	* Test case for the {@link _SetEngineInfo#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_7() throws Exception {
		String mechType = "";
		Class _javaType = null;
		QName _xmlType = null;
		_SetEngineInfo.getSerializer(mechType, _javaType, _xmlType);
	}
	
	/**
	* Test case for the {@link _SetEngineInfo#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_8() throws Exception {
		String mechType = "";
		Class _javaType = null;
		QName _xmlType = null;
		_SetEngineInfo.getSerializer(mechType, _javaType, _xmlType);
	}
	
	/**
	* Test case for the {@link _SetEngineInfo#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_9() throws Exception {
		String mechType = "";
		Class _javaType = null;
		QName _xmlType = null;
		_SetEngineInfo.getSerializer(mechType, _javaType, _xmlType);
	}
	
	/**
	* Test case for the {@link _SetEngineInfo#getSerializer(java.lang.String, java.lang.Class, javax.xml.namespace.QName)} method.
	* @throws Exception
	*/
	@Test
	void testGetSerializer_10() throws Exception {
		String mechType = "";
		Class _javaType = null;
		QName _xmlType = null;
		_SetEngineInfo.getSerializer(mechType, _javaType, _xmlType);
	}
	
}

// _SetEngineInfo_2.java
/**
 * _SetEngineInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis WSDL2Java emitter.
 */
package mygrid.web;

public class _SetEngineInfo implements java.io.Serializable {

    private java.lang.String name;

    private float cpu;

    private float ram;

    private java.lang.String os;

    public _SetEngineInfo() {
    }

    public java.lang.String getName() {
        return name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }

    public float getCpu() {
        return cpu;
    }

    public void setCpu(float cpu) {
        this.cpu = cpu;
    }

    public float getRam() {
        return ram;
    }

    public void setRam(float ram) {
        this.ram = ram;
    }

    public java.lang.String getOs() {
        return os;
    }

    public void setOs(java.lang.String os) {
        this.os = os;
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof _SetEngineInfo))
            return false;
        _SetEngineInfo other = (_SetEngineInfo) obj;
        if (obj == null)
            return false;
        if (this == obj)
            return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && ((this.name == null && other.getName() == null) || (this.name != null && this.name.equals(other.getName()))) && this.cpu == other.getCpu() && this.ram == other.getRam() && ((this.os == null && other.getOs() == null) || (this.os != null && this.os.equals(other.getOs())));
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
        if (getName() != null) {
            _hashCode += getName().hashCode();
        }
        _hashCode += new Float(getCpu()).hashCode();
        _hashCode += new Float(get