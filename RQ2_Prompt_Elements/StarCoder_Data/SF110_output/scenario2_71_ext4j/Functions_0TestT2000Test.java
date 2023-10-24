// Functions_0Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#dateFormat(Date, String)} method.
*/
class Functions_0Test {

    /**
     * Test of dateFormat method, of class Functions.
     */
    @Test
    void testDateFormat() {
        System.out.println("dateFormat");
        Date dateTime = null;
        String pattern = "";
        Functions instance = new Functions();
        String expResult = "";
        String result = instance.dateFormat(dateTime, pattern);
        assertEquals(expResult, result);
    }
}

// Functions_1Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#dateFormat(Date, String)} method.
*/
class Functions_1Test {
		
    /**
     * Test of dateFormat method, of class Functions.
     */
    @Test
    void testDateFormat() {
        System.out.println("dateFormat");
        Date dateTime = new Date();
        String pattern = "yyyy-MM-dd";
        Functions instance = new Functions();
        String expResult = new SimpleDateFormat(pattern).format(dateTime);
        String result = instance.dateFormat(dateTime, pattern);
        assertEquals(expResult, result);
    }
}

// Functions_2Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#dateFormat(Date, String)} method.
*/
class Functions_2Test {
		
    /**
     * Test of dateFormat method, of class Functions.
     */
    @Test
    void testDateFormat() {
        System.out.println("dateFormat");
        Date dateTime = new Date();
        String pattern = "yyyy-MM-dd HH:mm:ss";
        Functions instance = new Functions();
        String expResult = new SimpleDateFormat(pattern).format(dateTime);
        String result = instance.dateFormat(dateTime, pattern);
        assertEquals(expResult, result);
    }
}

// Functions_3Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#dateFormat(Date, String)} method.
*/
class Functions_3Test {
		
    /**
     * Test of dateFormat method, of class Functions.
     */
    @Test
    void testDateFormat() {
        System.out.println("dateFormat");
        Date dateTime = new Date();
        String pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        Functions instance = new Functions();
        String expResult = new SimpleDateFormat(pattern).format(dateTime);
        String result = instance.dateFormat(dateTime, pattern);
        assertEquals(expResult, result);
    }
}

// Functions_4Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#dateFormat(Date, String)} method.
*/
class Functions_4Test {
		
    /**
     * Test of dateFormat method, of class Functions.
     */
    @Test
    void testDateFormat() {
        System.out.println("dateFormat");
        Date dateTime = new Date();
        String pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        Functions instance = new Functions();
        String expResult = new SimpleDateFormat(pattern).format(dateTime);
        String result = instance.dateFormat(dateTime, pattern);
        assertEquals(expResult, result);
    }
}

// Functions_5Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#dateFormat(Date, String)} method.
*/
class Functions_5Test {
		
    /**
     * Test of dateFormat method, of class Functions.
     */
    @Test
    void testDateFormat() {
        System.out.println("dateFormat");
        Date dateTime = new Date();
        String pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        Functions instance = new Functions();
        String expResult = new SimpleDateFormat(pattern).format(dateTime);
        String result = instance.dateFormat(dateTime, pattern);
        assertEquals(expResult, result);
    }
}

// Functions_6Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Functions}.
* It contains ten unit test cases for the {@link Functions#dateFormat(Date, String)} method.
*/
class Functions_6Test {
		
    /**
     * Test of dateFormat method, of class Functions.
     */
    @Test
    void testDateFormat() {
        System.out.println("dateFormat");
        Date dateTime = new Date();
        String pattern = "yyyy-MM-dd HH:mm:ss.SSS";
        Functions instance = new Functions();
        String expResult = new SimpleDateFormat(pattern).format(dateTime);
        String result = instance.dateFormat(dateTime, pattern);
        assertEquals(expResult, result);
    }
}

// Functions_7Test.java
package net.sourceforge.ext4j.taglib.tag;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;
import javax.servlet.jsp.JspTagException;
import net.sourceforge.ext4j.taglib.bo.IRequest;
import org.junit.jupiter.api.Test;
import static org.junit