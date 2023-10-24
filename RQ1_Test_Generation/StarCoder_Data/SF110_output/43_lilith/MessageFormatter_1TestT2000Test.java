// MessageFormatter_1Test.java
package de.huxhorn.lilith.data.logging;

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link MessageFormatter}.
* It contains ten unit test cases for the {@link MessageFormatter#countArgumentPlaceholders(String)} method.
*/
class MessageFormatter_1Test {

    /**
    * Test method for {@link MessageFormatter#countArgumentPlaceholders(String)}.
    */
    @Test
    void testCountArgumentPlaceholders() {
        assertEquals(0, MessageFormatter.countArgumentPlaceholders(null));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders(""));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23{11}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23{11}45"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23{11}45{12}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23{11}45{12}67"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23{11}45{12}67{13}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23{11}45{12}67{13}89"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23{11}45{12}67{13}89{14}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23{11}45{12}67{13}89{14}01"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23{11}45{12}67{13}89{14}01{15}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23{11}45{12}67{13}89{14}01{15}23"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23{11}45{12}67{13}89{14}01{15}23{16}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23{11}45{12}67{13}89{14}01{15}23{16}45"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6}stu{7}vwx{8}yz{9}01{10}23{11}45{12}67{13}89{14}01{15}23{16}45{17}"));
        assertEquals(0, MessageFormatter.countArgumentPlaceholders("abc{1}def{2}ghi{3}jkl{4}mno{5}pqr{6