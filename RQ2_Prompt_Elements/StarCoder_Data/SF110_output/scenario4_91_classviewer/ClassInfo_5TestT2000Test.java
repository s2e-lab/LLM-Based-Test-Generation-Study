// ClassInfo_5Test.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_5Test {

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * It tests the method with a null parameter.
    */
    @Test
    void getData_1() {
        String[] result = ClassInfo.getData(null);
        assertEquals(0, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * It tests the method with an empty array parameter.
    */
    @Test
    void getData_2() {
        String[] result = ClassInfo.getData(new Member[0]);
        assertEquals(0, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * It tests the method with an array of one parameter.
    */
    @Test
    void getData_3() {
        String[] result = ClassInfo.getData(new Member[1]);
        assertEquals(1, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * It tests the method with an array of two parameters.
    */
    @Test
    void getData_4() {
        String[] result = ClassInfo.getData(new Member[2]);
        assertEquals(2, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * It tests the method with an array of three parameters.
    */
    @Test
    void getData_5() {
        String[] result = ClassInfo.getData(new Member[3]);
        assertEquals(3, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * It tests the method with an array of four parameters.
    */
    @Test
    void getData_6() {
        String[] result = ClassInfo.getData(new Member[4]);
        assertEquals(4, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * It tests the method with an array of five parameters.
    */
    @Test
    void getData_7() {
        String[] result = ClassInfo.getData(new Member[5]);
        assertEquals(5, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * It tests the method with an array of six parameters.
    */
    @Test
    void getData_8() {
        String[] result = ClassInfo.getData(new Member[6]);
        assertEquals(6, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * It tests the method with an array of seven parameters.
    */
    @Test
    void getData_9() {
        String[] result = ClassInfo.getData(new Member[7]);
        assertEquals(7, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * It tests the method with an array of eight parameters.
    */
    @Test
    void getData_10() {
        String[] result = ClassInfo.getData(new Member[8]);
        assertEquals(8, result.length);
    }
}

// ClassInfo_6Test.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#getData(Class[])} method.
*/
class ClassInfo_6Test {
		
    /**
    * Test case for {@link ClassInfo#getData(Class[])}.
    * It tests the method with a null parameter.
    */
    @Test
    void getData_1() {
        String[] result = ClassInfo.getData(null);
        assertEquals(0, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Class[])}.
    * It tests the method with an empty array parameter.
    */
    @Test
    void getData_2() {
        String[] result = ClassInfo.getData(new Class[0]);
        assertEquals(0, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Class[])}.
    * It tests the method with an array of one parameter.
    */
    @Test
    void getData_3() {
        String[] result = ClassInfo.getData(new Class[1]);
        assertEquals(1, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Class[])}.
    * It tests the method with an array of two parameters.
    */
    @Test
    void getData_4() {
        String[] result = ClassInfo.getData(new Class[2]);
        assertEquals(2, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Class[])}.
    * It tests the method with an array of three parameters.
    */
    @Test
    void getData_5() {
        String[] result = ClassInfo.getData(new Class[3]);
        assertEquals(3, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Class[])}.
    * It tests the method with an array of four parameters.
    */
    @Test
    void getData_6() {
        String[] result = ClassInfo.getData(new Class[4]);
        assertEquals(4, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Class[])}.
    * It tests the method with an array of five parameters.
    */
    @Test
    void getData_7() {
        String[] result = ClassInfo.getData(new Class[5]);
        assertEquals(5, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Class[])}.
    * It tests the method with an array of six parameters.
    */
    @Test
    void getData_8() {
        String[] result = ClassInfo.getData(new Class[6]);
        assertEquals(6, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Class[])}.
    * It tests the method with an array of seven parameters.
    */
    @Test
    void getData_9() {
        String[] result = ClassInfo.getData(new Class[7]);
        assertEquals(7, result.length);
    }

    /**
    * Test case for {@link ClassInfo#getData(Class[])}.
    * It tests the method with an array of eight parameters.
    */
    @Test
    void getData_10() {
        String[] result = ClassInfo.getData(new Class[8]);
        assertEquals(8, result.length);
    }
}

// ClassInfo_7Test.java
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#srchMethods(String)} method.
*/
class ClassInfo_7Test {
		
    /**
    * Test case for {@link ClassInfo#srchMethods(String)}.
    * It tests the method with a null parameter.
    */
    @Test
    void srchMethods_1() {
        String[] result = ClassInfo.srchMethods(null);
        assertEquals(0, result.length);
    }

    /**
    * Test case for {@link ClassInfo#srchMethods(String)}.
    * It tests the method with an empty string parameter.
    */
    @Test
    void srchMethods_2() {
        String[] result = ClassInfo.srchMethods("");
        assertEquals(0, result.length);
    }

    /**
    * Test case for {@link ClassInfo#srchMethods(String)}.
    * It tests the method with a string parameter.
    */
    @Test
    void srchMethods_3() {
        String[] result = ClassInfo.srchMethods("test");
        assertEquals(0, result.length);
    }

    /**
    * Test case for {@link ClassInfo#srchMethods(String)}.
    * It tests the method with a string parameter.
    */
    @Test
    void srchMethods_4() {
        String[] result = ClassInfo.srchMethods("test");
        assertEquals(0, result.length);
    }

    /**
    * Test case for {@link ClassInfo#srchMethods(String)}.
    * It tests the method with a string parameter.
    */
    @Test
    void srchMethods_5() {
        String[] result = ClassInfo.srchMethods("test");
        assertEquals(0, result.length);
    }

    /**
    * Test case for {@link ClassInfo#srchMethods(String)}.
    * It tests the method with a string parameter.
    */
    @Test