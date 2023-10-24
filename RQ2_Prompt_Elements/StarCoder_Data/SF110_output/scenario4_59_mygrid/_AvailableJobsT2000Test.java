// _AvailableJobsTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
* It contains ten unit test cases for the {@link _AvailableJobs#getTypeDesc()} method.
*/
class _AvailableJobsTest {

    /**
    * Test case for {@link _AvailableJobs#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// AvailableJobs.java
package mygrid.web;

public class AvailableJobs extends _AvailableJobs implements java.io.Serializable {

    public AvailableJobs() {
    }

    private java.lang.Object __equalsCalc = null;

    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof AvailableJobs)) {
            return false;
        }
        AvailableJobs other = (AvailableJobs) obj;
        if (this == obj) {
            return true;
        }
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true;
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc = new org.apache.axis.description.TypeDesc(AvailableJobs.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://webservice.mygrid.org/", "AvailableJobs"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("job");
        elemField.setXmlName(new javax.xml.namespace.QName("", "job"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://webservice.mygrid.org/", "Job"));
        elemField.setMinOccurs(0);
        elemField.setNillable(true);
        elemField.setMaxOccursUnbounded(true);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanSerializer(_javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(java.lang.String mechType, java.lang.Class _javaType, javax.xml.namespace.QName _xmlType) {
        return new org.apache.axis.encoding.ser.BeanDeserializer(_javaType, _xmlType, typeDesc);
    }
}

// AvailableJobsTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AvailableJobs}.
* It contains ten unit test cases for the {@link AvailableJobs#getTypeDesc()} method.
*/
class AvailableJobsTest {
		
    /**
    * Test case for {@link AvailableJobs#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = AvailableJobs.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// Job.java
package mygrid.web;

public class Job implements java.io.Serializable {

    public Job() {
    }

    private java.lang.String __jobID;

    private java.lang.String __jobName;

    private java.lang.String __jobDescription;

    private java.lang.String __jobType;

    private java.lang.String __jobStatus;

    private java.lang.String __jobOwner;

    private java.lang.String __jobCreationDate;

    private java.lang.String __jobStartDate;

    private java.lang.String __jobEndDate;

    private java.lang.String __jobResult;

    private java.lang.String __jobResultMessage;

    private java.lang.String __jobResultURL;

    private java.lang.String __jobResultFile;

    private java.lang.String __jobResultFileURL;

    private java.lang.String __jobResultFileMimeType;

    private java.lang.String __jobResultFileDescription;

    private java.lang.String __jobResultFileLength;

    private java.lang.String __jobResultFileChecksum;

    private java.lang.String __jobResultFileChecksumType;

    private java.lang.String __jobResultFileChecksumURL;

    private java.lang.String __jobResultFileChecksumDescription;

    private java.lang.String __jobResultFileChecksumLength;

    private java.lang.String __jobResultFileChecksumChecksum;

    private java.lang.String __jobResultFileChecksumChecksumType;

    private java.lang.String __jobResultFileChecksumChecksumURL;

    private java.lang.String __jobResultFileChecksumChecksumDescription;

    private java.lang.String __jobResultFileChecksumChecksumLength;

    private java.lang.String __jobResultFileChecksumChecksumChecksum;

    private java.lang.String __jobResultFileChecksumChecksumChecksumType;

    private java.lang.String __jobResultFileChecksumChecksumChecksumURL;

    private java.lang.String __jobResultFileChecksumChecksumChecksumDescription;

    private java.lang.String __jobResultFileChecksumChecksumChecksumLength;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksum;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumType;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumURL;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumDescription;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumLength;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksum;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumType;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumURL;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumDescription;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumLength;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksum;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumType;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumURL;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumDescription;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumLength;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumChecksum;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumType;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumURL;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumDescription;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumLength;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumChecksum;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumType;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumURL;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumDescription;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumLength;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumChecksum;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumType;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumURL;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumDescription;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumLength;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumChecksum;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumType;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumURL;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumDescription;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumLength;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumChecksum;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumType;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumURL;

    private java.lang.String __jobResultFileChecksumChecksumChecksumChecksumChecksumChecksumDescription;

    private java.