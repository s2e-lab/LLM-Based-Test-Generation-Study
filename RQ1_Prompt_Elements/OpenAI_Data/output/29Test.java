// FilterByPrefixTest.java
package scenario1;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
/**
* Unit tests of {@link FilterByPrefix}.
* It contains ten test cases for the {@link FilterByPrefix#filterByPrefix()} method.
*/
class FilterByPrefixTest {


    @Test
    void testFilterByPrefix() {
        List<Object> strings = new ArrayList<Object>();
        strings.add("abc");
        strings.add("bcd");
        strings.add("cde");
        strings.add("def");
        strings.add("efg");
        strings.add("fgh");
        strings.add("ghi");
        strings.add("hij");
        strings.add("ijk");
        strings.add("jkl");
        strings.add("klm");
        strings.add("lmn");
        strings.add("mno");
        strings.add("nop");
        strings.add("opq");
        strings.add("pqr");
        strings.add("qrs");
        strings.add("rst");
        strings.add("stu");
        strings.add("tuv");
        strings.add("uvw");
        strings.add("vwx");
        strings.add("wxy");
        strings.add("xyz");
        List<Object> result = FilterByPrefix.filterByPrefix(strings, "a");
        assertEquals(1, result.size());
        assertEquals("abc", result.get(0));
        result = FilterByPrefix.filterByPrefix(strings, "b");
        assertEquals(2, result.size());
        assertEquals("bcd", result.get(0));
        assertEquals("abc", result.get(1));
        result = FilterByPrefix.filterByPrefix(strings, "c");
        assertEquals(3, result.size());
        assertEquals("cde", result.get(0));
        assertEquals("bcd", result.get(1));
        assertEquals("abc", result.get(2));
        result = FilterByPrefix.filterByPrefix(strings, "d");
        assertEquals(4, result.size());
        assertEquals("def", result.get(0));
        assertEquals("cde", result.get(1));
        assertEquals("bcd", result.get(2));
        assertEquals("abc", result.get(3));
        result = FilterByPrefix.filterByPrefix(strings, "e");
        assertEquals(5, result.size());
        assertEquals("efg", result.get(0));
        assertEquals("def", result.get(1));
        assertEquals("cde", result.get(2));
        assertEquals("bcd", result.get(3));
        assertEquals("abc", result.get(4));
        result = FilterByPrefix.filterByPrefix(strings, "f");
        assertEquals(6, result.size());
        assertEquals("fgh", result.get(0));
        assertEquals("efg", result.get(1));
        assertEquals("def", result.get(2));
        assertEquals("cde", result.get(3));
        assertEquals("bcd", result.get(4));
        assertEquals("abc", result.get(5));
        result = FilterByPrefix.filterByPrefix(strings, "g");
        assertEquals(7, result.size());
        assertEquals("ghi", result.get(0));
        assertEquals("fgh", result.get(1));
        assertEquals("efg", result.get(2));
        assertEquals("def", result.get(3));
        assertEquals("cde", result.get(4));
        assertEquals("bcd", result.get(5));
        assertEquals("abc", result.get(6));
        result = FilterByPrefix.filterByPrefix(strings, "h");
        assertEquals(8, result.size());
        assertEquals("hij", result.get(0));
        assertEquals("ghi", result.get(1));
        assertEquals("fgh", result.get(2));
        assertEquals("efg", result.get(3));
        assertEquals("def", result.get(4));
        assertEquals("cde", result.get(5));
        assertEquals("bcd", result.get(6));
        assertEquals("abc", result.get(7));
