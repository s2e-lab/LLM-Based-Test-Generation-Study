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
    * Test case for the {@link _AvailableJobs#getTypeDesc()} method.
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _AvailableJobs.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// _AvailableJobs.java
package mygrid.web;

public class _AvailableJobs implements java.io.Serializable {

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
}

// _AvailableJobsTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _AvailableJobs}.
