// ArrayOfJobTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfJob}.
* It contains ten unit test cases for the {@link ArrayOfJob#getTypeDesc()} method.
*/
class ArrayOfJobTest {

    /**
    * Test case for {@link ArrayOfJob#getTypeDesc()} method.
    */
    @Test
    void testGetTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = mygrid.web.ArrayOfJob.getTypeDesc();
        assertNotNull(typeDesc);
        assertEquals("ArrayOfJob", typeDesc.getName());
        assertEquals("mygrid.web", typeDesc.getXmlType().getNamespaceURI());
        assertEquals("ArrayOfJob", typeDesc.getXmlType().getLocalPart());
    }
}

// Job.java
package mygrid.web;

public class Job implements java.io.Serializable {

    private java.lang.String id;

    private java.lang.String name;

    private java.lang.String description;

    private java.lang.String owner;

    private java.lang.String status;

    private java.lang.String creationTime;

    private java.lang.String startTime;

    private java.lang.String endTime;

    private java.lang.String lastUpdateTime;

    private java.lang.String lastError;

    private java.lang.String lastErrorTime;

    private java.lang.String lastErrorStackTrace;

    private java.lang.String lastErrorCause;

    private java.lang.String lastErrorCauseTime;

    private java.lang.String lastErrorCauseStackTrace;

    private java.lang.String lastErrorCauseMessage;

    private java.lang.String lastErrorCauseClassName;

    private java.lang.String lastErrorCauseClassSimpleName;

    private java.lang.String lastErrorCauseClassPackageName;

    private java.lang.String lastErrorCauseClassFullName;

    private java.lang.String lastErrorCauseClassMessage;

    private java.lang.String lastErrorCauseClassStackTrace;

    private java.lang.String lastErrorCauseClassCause;

    private java.lang.String lastErrorCauseClassCauseTime;

    private java.lang.String lastErrorCauseClassCauseStackTrace;

    private java.lang.String lastErrorCauseClassCauseMessage;

    private java.lang.String lastErrorCauseClassCauseClassName;

    private java.lang.String lastErrorCauseClassCauseClassSimpleName;

    private java.lang.String lastErrorCauseClassCauseClassPackageName;

    private java.lang.String lastErrorCauseClassCauseClassFullName;

    private java.lang.String lastErrorCauseClassCauseClassMessage;

    private java.lang.String lastErrorCauseClassCauseClassStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCause;

    private java.lang.String lastErrorCauseClassCauseClassCauseTime;

    private java.lang.String lastErrorCauseClassCauseClassCauseStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCauseMessage;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassSimpleName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassPackageName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassFullName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassMessage;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCause;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseTime;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseMessage;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassSimpleName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassPackageName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassFullName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassMessage;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCause;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseTime;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseMessage;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassSimpleName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassPackageName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassFullName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassMessage;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCause;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseTime;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseMessage;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassSimpleName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassPackageName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassFullName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassMessage;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCause;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseTime;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseMessage;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassSimpleName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassPackageName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassFullName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassMessage;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCause;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseTime;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseMessage;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassSimpleName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassPackageName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassFullName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassMessage;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCause;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseTime;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseStackTrace;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseMessage;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassSimpleName;

    private java.lang.String lastErrorCauseClassCauseClassCauseClassCauseClassCauseClassCauseClassCause