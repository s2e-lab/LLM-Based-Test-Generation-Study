// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
* It contains ten unit test cases for the {@link ArrayOfString#getTypeDesc()} method.
*/
class ArrayOfStringTest {

    /**
    * Test case for the {@link ArrayOfString#getTypeDesc()} method.
    */
    @Test
    void getTypeDesc() {
        org.apache.axis.description.TypeDesc typeDesc = ArrayOfString.getTypeDesc();
        assertNotNull(typeDesc);
    }
}

// ArrayOfString.java
package mygrid.web;

public class ArrayOfString implements java.io.Serializable {

    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }
}

// ArrayOfStringTest.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ArrayOfString}.
