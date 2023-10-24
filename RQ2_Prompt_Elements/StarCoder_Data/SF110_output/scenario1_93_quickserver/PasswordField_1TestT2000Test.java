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

    private static final Logger logger = Logger.getLogger(PasswordField_1Test.class.getName());

    @Test
    void test1() throws IOException {
        String prompt = "Enter password: ";
        String password = "<PASSWORD>";
        InputStream in = new ByteArrayInputStream(password.getBytes());
        char[] result = PasswordField.getPassword(in, prompt);
        assertEquals(password, new String(result));
    }

    @Test
    void test2() throws IOException {
        String prompt = "Enter password: ";
        String password = "<PASSWORD>";
        InputStream in = new ByteArrayInputStream(password.getBytes());
        char[] result = PasswordField.getPassword(in, prompt);
        assertEquals(password, new String(result));
    }

    @Test
    void test3() throws IOException {
        String prompt = "Enter password: ";
        String password = "<PASSWORD>";
        InputStream in = new ByteArrayInputStream(password.getBytes());
        char[] result = PasswordField.getPassword(in, prompt);
        assertEquals(password, new String(result));
    }

    @Test
    void test4() throws IOException {
        String prompt = "Enter password: ";
        String password = "<PASSWORD>";
        InputStream in = new ByteArrayInputStream(password.getBytes());
        char[] result = PasswordField.getPassword(in, prompt);
        assertEquals(password, new String(result));
    }

    @Test
    void test5() throws IOException {
        String prompt = "Enter password: ";
        String password = "<PASSWORD>";
        InputStream in = new ByteArrayInputStream(password.getBytes());
        char[] result = PasswordField.getPassword(in, prompt);
        assertEquals(password, new String(result));
    }

    @Test
    void test6() throws IOException {
        String prompt = "Enter password: ";
        String password = "<PASSWORD>";
        InputStream in = new ByteArrayInputStream(password.getBytes());
        char[] result = PasswordField.getPassword(in, prompt);
        assertEquals(password, new String(result));
    }

    @Test
    void test7() throws IOException {
        String prompt = "Enter password: ";
        String password = "<PASSWORD>";
        InputStream in = new ByteArrayInputStream(password.getBytes());
        char[] result = PasswordField.getPassword(in, prompt);
        assertEquals(password, new String(result));
    }

    @Test
    void test8() throws IOException {
        String prompt = "Enter password: ";
        String password = "<PASSWORD>";
        InputStream in = new ByteArrayInputStream(password.getBytes());
        char[] result = PasswordField.getPassword(in, prompt);
        assertEquals(password, new String(result));
    }

    @Test
    void test9() throws IOException {
        String prompt = "Enter password: ";
        String password = "<PASSWORD>";
        InputStream in = new ByteArrayInputStream(password.getBytes());
        char[] result = PasswordField.getPassword(in, prompt);
        assertEquals(password, new String(result));
    }

    @Test
    void test10() throws IOException {
        String prompt = "Enter password: ";
        String password = "<PASSWORD>";
        InputStream in = new ByteArrayInputStream(password.getBytes());
        char[] result = PasswordField.getPassword(in, prompt);
        assertEquals(password, new String(result));
    }
}
