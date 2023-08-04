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
    * <p>
    * This test case tests the method with an array of Member objects.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void getData_1() throws Exception {
        // Arrange
        Member[] m = new Member[1];
        m[0] = new Method() {
            public String toString() {
                return "public void com.jstevh.viewer.ClassInfo_5Test.getData_1()";
            }
        };
        String[] expected = new String[1];
        expected[0] = "public void com.jstevh.viewer.ClassInfo_5Test.getData_1()";
        // Act
        String[] actual = ClassInfo.getData(m);
        // Assert
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * <p>
    * This test case tests the method with an array of Member objects.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void getData_2() throws Exception {
        // Arrange
        Member[] m = new Member[1];
        m[0] = new Method() {
            public String toString() {
                return "public void com.jstevh.viewer.ClassInfo_5Test.getData_2()";
            }
        };
        String[] expected = new String[1];
        expected[0] = "public void com.jstevh.viewer.ClassInfo_5Test.getData_2()";
        // Act
        String[] actual = ClassInfo.getData(m);
        // Assert
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * <p>
    * This test case tests the method with an array of Member objects.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void getData_3() throws Exception {
        // Arrange
        Member[] m = new Member[1];
        m[0] = new Method() {
            public String toString() {
                return "public void com.jstevh.viewer.ClassInfo_5Test.getData_3()";
            }
        };
        String[] expected = new String[1];
        expected[0] = "public void com.jstevh.viewer.ClassInfo_5Test.getData_3()";
        // Act
        String[] actual = ClassInfo.getData(m);
        // Assert
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * <p>
    * This test case tests the method with an array of Member objects.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void getData_4() throws Exception {
        // Arrange
        Member[] m = new Member[1];
        m[0] = new Method() {
            public String toString() {
                return "public void com.jstevh.viewer.ClassInfo_5Test.getData_4()";
            }
        };
        String[] expected = new String[1];
        expected[0] = "public void com.jstevh.viewer.ClassInfo_5Test.getData_4()";
        // Act
        String[] actual = ClassInfo.getData(m);
        // Assert
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * <p>
    * This test case tests the method with an array of Member objects.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void getData_5() throws Exception {
        // Arrange
        Member[] m = new Member[1];
        m[0] = new Method() {
            public String toString() {
                return "public void com.jstevh.viewer.ClassInfo_5Test.getData_5()";
            }
        };
        String[] expected = new String[1];
        expected[0] = "public void com.jstevh.viewer.ClassInfo_5Test.getData_5()";
        // Act
        String[] actual = ClassInfo.getData(m);
        // Assert
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * <p>
    * This test case tests the method with an array of Member objects.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void getData_6() throws Exception {
        // Arrange
        Member[] m = new Member[1];
        m[0] = new Method() {
            public String toString() {
                return "public void com.jstevh.viewer.ClassInfo_5Test.getData_6()";
            }
        };
        String[] expected = new String[1];
        expected[0] = "public void com.jstevh.viewer.ClassInfo_5Test.getData_6()";
        // Act
        String[] actual = ClassInfo.getData(m);
        // Assert
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * <p>
    * This test case tests the method with an array of Member objects.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void getData_7() throws Exception {
        // Arrange
        Member[] m = new Member[1];
        m[0] = new Method() {
            public String toString() {
                return "public void com.jstevh.viewer.ClassInfo_5Test.getData_7()";
            }
        };
        String[] expected = new String[1];
        expected[0] = "public void com.jstevh.viewer.ClassInfo_5Test.getData_7()";
        // Act
        String[] actual = ClassInfo.getData(m);
        // Assert
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * <p>
    * This test case tests the method with an array of Member objects.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void getData_8() throws Exception {
        // Arrange
        Member[] m = new Member[1];
        m[0] = new Method() {
            public String toString() {
                return "public void com.jstevh.viewer.ClassInfo_5Test.getData_8()";
            }
        };
        String[] expected = new String[1];
        expected[0] = "public void com.jstevh.viewer.ClassInfo_5Test.getData_8()";
        // Act
        String[] actual = ClassInfo.getData(m);
        // Assert
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * <p>
    * This test case tests the method with an array of Member objects.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void getData_9() throws Exception {
        // Arrange
        Member[] m = new Member[1];
        m[0] = new Method() {
            public String toString() {
                return "public void com.jstevh.viewer.ClassInfo_5Test.getData_9()";
            }
        };
        String[] expected = new String[1];
        expected[0] = "public void com.jstevh.viewer.ClassInfo_5Test.getData_9()";
        // Act
        String[] actual = ClassInfo.getData(m);
        // Assert
        assertArrayEquals(expected, actual);
    }

    /**
    * Test case for {@link ClassInfo#getData(Member[])}.
    * <p>
    * This test case tests the method with an array of Member objects.
    *
    * @throws Exception if an error occurs
    */
    @Test
    void getData_10() throws Exception {
        // Arrange
        Member[] m = new Member[1];
        m[0] = new Method() {
            public String toString() {
                return "public void com.jstevh.viewer.ClassInfo_5Test.getData_10()";
            }
        };
        String[] expected = new String[1];
        expected[0] = "public void com.jstevh.viewer.ClassInfo_5Test.getData_10()";
        // Act
        String[] actual = ClassInfo.getData(m);
        // Assert
        assertArrayEquals(expected, actual);
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
* It contains ten unit test cases for the {@link ClassInfo#getData(Member[])} method.
*/
class ClassInfo_6Test {
		
    /**
    * Test case for {@link