// InspirentoUtilities_1Test.java
package com.allenstudio.ir.util;

import java.util.StringTokenizer;
import java.util.Vector;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InspirentoUtilities}.
* It contains ten unit test cases for the {@link InspirentoUtilities#escapeText(String)} method.
*/
class InspirentoUtilities_1Test {

    /**
     * Test method for {@link InspirentoUtilities#escapeText(String)}.
     */
    @Test
    void testEscapeText() {
        String str = "This is a test string.";
        String expected = "This is a test string.";
        String actual = InspirentoUtilities.escapeText(str);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link InspirentoUtilities#escapeText(String)}.
     */
    @Test
    void testEscapeText_1() {
        String str = "This is a test string. <script>alert('hello');</script>";
        String expected = "This is a test string. &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt;";
        String actual = InspirentoUtilities.escapeText(str);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link InspirentoUtilities#escapeText(String)}.
     */
    @Test
    void testEscapeText_2() {
        String str = "This is a test string. <script>alert('hello');</script> <script>alert('hello');</script>";
        String expected = "This is a test string. &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt;";
        String actual = InspirentoUtilities.escapeText(str);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link InspirentoUtilities#escapeText(String)}.
     */
    @Test
    void testEscapeText_3() {
        String str = "This is a test string. <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script>";
        String expected = "This is a test string. &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt;";
        String actual = InspirentoUtilities.escapeText(str);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link InspirentoUtilities#escapeText(String)}.
     */
    @Test
    void testEscapeText_4() {
        String str = "This is a test string. <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script>";
        String expected = "This is a test string. &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt;";
        String actual = InspirentoUtilities.escapeText(str);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link InspirentoUtilities#escapeText(String)}.
     */
    @Test
    void testEscapeText_5() {
        String str = "This is a test string. <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script>";
        String expected = "This is a test string. &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt;";
        String actual = InspirentoUtilities.escapeText(str);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link InspirentoUtilities#escapeText(String)}.
     */
    @Test
    void testEscapeText_6() {
        String str = "This is a test string. <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script>";
        String expected = "This is a test string. &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt;";
        String actual = InspirentoUtilities.escapeText(str);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link InspirentoUtilities#escapeText(String)}.
     */
    @Test
    void testEscapeText_7() {
        String str = "This is a test string. <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script>";
        String expected = "This is a test string. &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt;";
        String actual = InspirentoUtilities.escapeText(str);
        assertEquals(expected, actual);
    }

    /**
     * Test method for {@link InspirentoUtilities#escapeText(String)}.
     */
    @Test
    void testEscapeText_8() {
        String str = "This is a test string. <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script> <script>alert('hello');</script>";
        String expected = "This is a test string. &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);&lt;/script&gt; &lt;script&gt;alert(&#39;hello&#39;);