// PasswordField_1Test.java
package org.quickserver.util.io;

import java.io.*;
import java.util.*;
import java.util.logging.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PasswordField}.
* It contains ten unit test cases for the {@link PasswordField#getPassword(InputStream, String)} method.
*/
class PasswordField_1Test {

    @Test
    void test1() throws IOException {
        char[] password = PasswordField.getPassword("Enter password: ");
        assertNotNull(password);
        assertEquals(0, password.length);
    }

    @Test
    void test2() throws IOException {
        char[] password = PasswordField.getPassword("Enter password: ", new ByteArrayInputStream("password".getBytes()));
        assertNotNull(password);
        assertEquals(8, password.length);
        assertEquals('p', password[0]);
        assertEquals('a', password[1]);
        assertEquals('s', password[2]);
        assertEquals('s', password[3]);
        assertEquals('w', password[4]);
        assertEquals('o', password[5]);
        assertEquals('r', password[6]);
        assertEquals('d', password[7]);
    }

    @Test
    void test3() throws IOException {
        char[] password = PasswordField.getPassword("Enter password: ", new ByteArrayInputStream("password\n".getBytes()));
        assertNotNull(password);
        assertEquals(8, password.length);
        assertEquals('p', password[0]);
        assertEquals('a', password[1]);
        assertEquals('s', password[2]);
        assertEquals('s', password[3]);
        assertEquals('w', password[4]);
        assertEquals('o', password[5]);
        assertEquals('r', password[6]);
        assertEquals('d', password[7]);
    }

    @Test
    void test4() throws IOException {
        char[] password = PasswordField.getPassword("Enter password: ", new ByteArrayInputStream("password\r\n".getBytes()));
        assertNotNull(password);
        assertEquals(8, password.length);
        assertEquals('p', password[0]);
        assertEquals('a', password[1]);
        assertEquals('s', password[2]);
        assertEquals('s', password[3]);
        assertEquals('w', password[4]);
        assertEquals('o', password[5]);
        assertEquals('r', password[6]);
        assertEquals('d', password[7]);
    }

    @Test
    void test5() throws IOException {
        char[] password = PasswordField.getPassword("Enter password: ", new ByteArrayInputStream("password\r".getBytes()));
        assertNotNull(password);
        assertEquals(8, password.length);
        assertEquals('p', password[0]);
        assertEquals('a', password[1]);
        assertEquals('s', password[2]);
        assertEquals('s', password[3]);
        assertEquals('w', password[4]);
        assertEquals('o', password[5]);
        assertEquals('r', password[6]);
        assertEquals('d', password[7]);
    }

    @Test
    void test6() throws IOException {
        char[] password = PasswordField.getPassword("Enter password: ", new ByteArrayInputStream("password\n\r".getBytes()));
        assertNotNull(password);
        assertEquals(8, password.length);
        assertEquals('p', password[0]);
        assertEquals('a', password[1]);
        assertEquals('s', password[2]);
        assertEquals('s', password[3]);
        assertEquals('w', password[4]);
        assertEquals('o', password[5]);
        assertEquals('r', password[6]);
        assertEquals('d', password[7]);
    }

    @Test
    void test7() throws IOException {
        char[] password = PasswordField.getPassword("Enter password: ", new ByteArrayInputStream("password\n\r\n".getBytes()));
        assertNotNull(password);
        assertEquals(8, password.length);
        assertEquals('p', password[0]);
        assertEquals('a', password[1]);
        assertEquals('s', password[2]);
        assertEquals('s', password[3]);
        assertEquals('w', password[4]);
        assertEquals('o', password[5]);
        assertEquals('r', password[6]);
        assertEquals('d', password[7]);
    }

    @Test
    void test8() throws IOException {
        char[] password = PasswordField.getPassword("Enter password: ", new ByteArrayInputStream("password\r\n\r".getBytes()));
        assertNotNull(password);
        assertEquals(8, password.length);
        assertEquals('p', password[0]);
        assertEquals('a', password[1]);
        assertEquals('s', password[2]);
        assertEquals('s', password[3]);
        assertEquals('w', password[4]);
        assertEquals('o', password[5]);
        assertEquals('r', password[6]);
        assertEquals('d', password[7]);
    }

    @Test
    void test9() throws IOException {
        char[] password = PasswordField.getPassword("Enter password: ", new ByteArrayInputStream("password\r\n\n".getBytes()));
        assertNotNull(password);
        assertEquals(8, password.length);
        assertEquals('p', password[0]);
        assertEquals('a', password[1]);
        assertEquals('s', password[2]);
        assertEquals('s', password[3]);
        assertEquals('w', password[4]);
        assertEquals('o', password[5]);
        assertEquals('r', password[6]);
        assertEquals('d', password[7]);
    }

    @Test
    void test10() throws IOException {
        char[] password = PasswordField.getPassword("Enter password: ", new ByteArrayInputStream("password\r\n\r\n".getBytes()));
        assertNotNull(password);
        assertEquals(8, password.length);
        assertEquals('p', password[0]);
        assertEquals('a', password[1]);
        assertEquals('s', password[2]);
        assertEquals('s', password[3]);
        assertEquals('w', password[4]);
        assertEquals('o', password[5]);
        assertEquals('r', password[6]);
        assertEquals('d', password[7]);
    }
}
