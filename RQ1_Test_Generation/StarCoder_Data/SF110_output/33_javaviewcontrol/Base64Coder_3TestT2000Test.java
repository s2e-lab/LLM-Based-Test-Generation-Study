// Base64Coder_3Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decodeString(String)} method.
*/
class Base64Coder_3Test {

    /**
    * Test case for {@link Base64Coder#decodeString(String)}.
    * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
    */
    @Test
    void testDecodeString() throws IllegalArgumentException {
        String s = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXowMTIzNDU2Nzg5";
        String s2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789+/";
        assertEquals(s2, Base64Coder.decodeString(s));
    }
}
// end class Base64Coder_3Test

// Base64Coder_4Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(String)} method.
*/
class Base64Coder_4Test {
		
    /**
    * Test case for {@link Base64Coder#decode(String)}.
    * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
    */
    @Test
    void testDecode() throws IllegalArgumentException {
        String s = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXowMTIzNDU2Nzg5";
        String s2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789+/";
        assertEquals(s2, new String(Base64Coder.decode(s)));
    }
}
// end class Base64Coder_4Test

// Base64Coder_5Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#decode(char[])} method.
*/
class Base64Coder_5Test {
		
    /**
    * Test case for {@link Base64Coder#decode(char[])}.
    * @throws IllegalArgumentException if the input is not valid Base64 encoded data.
    */
    @Test
    void testDecode() throws IllegalArgumentException {
        String s = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXowMTIzNDU2Nzg5";
        String s2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789+/";
        assertEquals(s2, new String(Base64Coder.decode(s.toCharArray())));
    }
}
// end class Base64Coder_5Test

// Base64Coder_6Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encodeString(String)} method.
*/
class Base64Coder_6Test {
		
    /**
    * Test case for {@link Base64Coder#encodeString(String)}.
    */
    @Test
    void testEncodeString() {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789+/";
        String s2 = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXowMTIzNDU2Nzg5";
        assertEquals(s2, Base64Coder.encodeString(s));
    }
}
// end class Base64Coder_6Test

// Base64Coder_7Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[])} method.
*/
class Base64Coder_7Test {
		
    /**
    * Test case for {@link Base64Coder#encode(byte[])}.
    */
    @Test
    void testEncode() {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789+/";
        String s2 = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXowMTIzNDU2Nzg5";
        assertEquals(s2, new String(Base64Coder.encode(s.getBytes())));
    }
}
// end class Base64Coder_7Test

// Base64Coder_8Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[],int)} method.
*/
class Base64Coder_8Test {
		
    /**
    * Test case for {@link Base64Coder#encode(byte[],int)}.
    */
    @Test
    void testEncode() {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789+/";
        String s2 = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXowMTIzNDU2Nzg5";
        assertEquals(s2, new String(Base64Coder.encode(s.getBytes(), s.length())));
    }
}
// end class Base64Coder_8Test

// Base64Coder_9Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[],int)} method.
*/
class Base64Coder_9Test {
		
    /**
    * Test case for {@link Base64Coder#encode(byte[],int)}.
    */
    @Test
    void testEncode() {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789+/";
        String s2 = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXowMTIzNDU2Nzg5";
        assertEquals(s2, new String(Base64Coder.encode(s.getBytes(), s.length())));
    }
}
// end class Base64Coder_9Test

// Base64Coder_10Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[],int)} method.
*/
class Base64Coder_10Test {
		
    /**
    * Test case for {@link Base64Coder#encode(byte[],int)}.
    */
    @Test
    void testEncode() {
        String s = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789+/";
        String s2 = "YWJjZGVmZ2hpamtsbW5vcHFyc3R1dnd4eXowMTIzNDU2Nzg5";
        assertEquals(s2, new String(Base64Coder.encode(s.getBytes(), s.length())));
    }
}
// end class Base64Coder_10Test

// Base64Coder_11Test.java
package com.pmdesigns.jvc.tools;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Base64Coder}.
* It contains ten unit test cases for the {@link Base64Coder#encode(byte[],int)} method.
*/
class Base64Coder_11Test {
		
   