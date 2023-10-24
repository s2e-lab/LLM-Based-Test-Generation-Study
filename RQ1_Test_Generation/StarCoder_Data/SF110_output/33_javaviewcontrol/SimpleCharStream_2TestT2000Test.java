// SimpleCharStream_2Test.java
/* JavaCCOptions:STATIC=false,SUPPORT_CLASS_VISIBILITY_PUBLIC=true */
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SimpleCharStream}.
* It contains ten unit test cases for the {@link SimpleCharStream#GetImage()} method.
*/
class SimpleCharStream_2Test {

    /**
    * Test case for the {@link SimpleCharStream#GetImage()} method.
    * It contains a single unit test case for the {@link SimpleCharStream#GetImage()} method.
    */
    @Test
    void testGetImage() {
        try {
            String input = "1234567890";
            SimpleCharStream stream = new SimpleCharStream(input.toCharArray());
            stream.ReInit(input.toCharArray());
            assertEquals(input, stream.GetImage());
        } catch (Exception e) {
            fail(e.getMessage());
        }
    }
}
