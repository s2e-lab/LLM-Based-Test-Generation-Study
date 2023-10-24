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

    @Test
    void getData_1() {
        Member[] m = new Member[0];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(null, StringData);
    }

    @Test
    void getData_2() {
        Member[] m = new Member[1];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(1, StringData.length);
    }

    @Test
    void getData_3() {
        Member[] m = new Member[2];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(2, StringData.length);
    }

    @Test
    void getData_4() {
        Member[] m = new Member[3];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(3, StringData.length);
    }

    @Test
    void getData_5() {
        Member[] m = new Member[4];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(4, StringData.length);
    }

    @Test
    void getData_6() {
        Member[] m = new Member[5];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(5, StringData.length);
    }

    @Test
    void getData_7() {
        Member[] m = new Member[6];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(6, StringData.length);
    }

    @Test
    void getData_8() {
        Member[] m = new Member[7];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(7, StringData.length);
    }

    @Test
    void getData_9() {
        Member[] m = new Member[8];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(8, StringData.length);
    }

    @Test
    void getData_10() {
        Member[] m = new Member[9];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(9, StringData.length);
    }
}

// ClassInfo_4Test.java
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
class ClassInfo_4Test {
		
    @Test
    void getData_1() {
        Member[] m = new Member[0];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(null, StringData);
    }

    @Test
    void getData_2() {
        Member[] m = new Member[1];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(1, StringData.length);
    }

    @Test
    void getData_3() {
        Member[] m = new Member[2];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(2, StringData.length);
    }

    @Test
    void getData_4() {
        Member[] m = new Member[3];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(3, StringData.length);
    }

    @Test
    void getData_5() {
        Member[] m = new Member[4];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(4, StringData.length);
    }

    @Test
    void getData_6() {
        Member[] m = new Member[5];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(5, StringData.length);
    }

    @Test
    void getData_7() {
        Member[] m = new Member[6];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(6, StringData.length);
    }

    @Test
    void getData_8() {
        Member[] m = new Member[7];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(7, StringData.length);
    }

    @Test
    void getData_9() {
        Member[] m = new Member[8];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(8, StringData.length);
    }

    @Test
    void getData_10() {
        Member[] m = new Member[9];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(9, StringData.length);
    }
}

// ClassInfo_3Test.java
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
class ClassInfo_3Test {
		
    @Test
    void getData_1() {
        Member[] m = new Member[0];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(null, StringData);
    }

    @Test
    void getData_2() {
        Member[] m = new Member[1];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(1, StringData.length);
    }

    @Test
    void getData_3() {
        Member[] m = new Member[2];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(2, StringData.length);
    }

    @Test
    void getData_4() {
        Member[] m = new Member[3];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(3, StringData.length);
    }

    @Test
    void getData_5() {
        Member[] m = new Member[4];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(4, StringData.length);
    }

    @Test
    void getData_6() {
        Member[] m = new Member[5];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(5, StringData.length);
    }

    @Test
    void getData_7() {
        Member[] m = new Member[6];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(6, StringData.length);
    }

    @Test
    void getData_8() {
        Member[] m = new Member[7];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(7, StringData.length);
    }

    @Test
    void getData_9() {
        Member[] m = new Member[8];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(8, StringData.length);
    }

    @Test
    void getData_10() {
        Member[] m = new Member[9];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(9, StringData.length);
    }
}

// ClassInfo_2Test.java
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
class ClassInfo_2Test {
		
    @Test
    void getData_1() {
        Member[] m = new Member[0];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(null, StringData);
    }

    @Test
    void getData_2() {
        Member[] m = new Member[1];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(1, StringData.length);
    }

    @Test
    void getData_3() {
        Member[] m = new Member[2];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(2, StringData.length);
    }

    @Test
    void getData_4() {
        Member[] m = new Member[3];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(3, StringData.length);
    }

    @Test
    void getData_5() {
        Member[] m = new Member[4];
        String[] StringData = ClassInfo.getData(m);
        assertEquals(4, StringData.length);
    }

    @Test
    void getData_6() {
        Member[] m = new