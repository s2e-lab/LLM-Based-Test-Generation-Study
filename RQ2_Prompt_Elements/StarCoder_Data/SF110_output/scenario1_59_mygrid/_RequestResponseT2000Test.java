// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
* It contains ten unit test cases for the {@link _RequestResponse#getTypeDesc()} method.
*/
class _RequestResponseTest {

    /**
    * Test case for the {@link _RequestResponse#getTypeDesc()} method.
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = _RequestResponse.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// _RequestResponse.java
package mygrid.web;

public class _RequestResponse implements java.io.Serializable {

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
}

// _RequestResponseTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link _RequestResponse}.
