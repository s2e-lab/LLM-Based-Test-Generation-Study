// HTMLOutputStreamTest.java
package bible.servlet;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import java.net.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HTMLOutputStream}.
* It contains ten unit test cases for the {@link HTMLOutputStream#reset()} method.
*/
class HTMLOutputStreamTest {

    /**
    * Test case for {@link HTMLOutputStream#reset()}.
    * It tests the reset method for a binary output stream.
    */
    @Test
    void testResetBinary() {
        HTMLOutputStream hos = null;
        try {
            hos = new HTMLOutputStream(new MockHttpServletResponse());
            hos.binary = true;
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            assertEquals("Hello World!", hos.reset());
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
    * Test case for {@link HTMLOutputStream#reset()}.
    * It tests the reset method for a character output stream.
    */
    @Test
    void testResetCharacter() {
        HTMLOutputStream hos = null;
        try {
            hos = new HTMLOutputStream(new MockHttpServletResponse());
            hos.binary = false;
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            assertEquals("Hello World!", hos.reset());
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
    * Test case for {@link HTMLOutputStream#reset()}.
    * It tests the reset method for a binary output stream.
    */
    @Test
    void testResetBinary2() {
        HTMLOutputStream hos = null;
        try {
            hos = new HTMLOutputStream(new MockHttpServletResponse());
            hos.binary = true;
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            assertEquals("Hello World!Hello World!", hos.reset());
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
    * Test case for {@link HTMLOutputStream#reset()}.
    * It tests the reset method for a character output stream.
    */
    @Test
    void testResetCharacter2() {
        HTMLOutputStream hos = null;
        try {
            hos = new HTMLOutputStream(new MockHttpServletResponse());
            hos.binary = false;
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            assertEquals("Hello World!Hello World!", hos.reset());
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
    * Test case for {@link HTMLOutputStream#reset()}.
    * It tests the reset method for a binary output stream.
    */
    @Test
    void testResetBinary3() {
        HTMLOutputStream hos = null;
        try {
            hos = new HTMLOutputStream(new MockHttpServletResponse());
            hos.binary = true;
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            assertEquals("Hello World!Hello World!Hello World!", hos.reset());
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
    * Test case for {@link HTMLOutputStream#reset()}.
    * It tests the reset method for a character output stream.
    */
    @Test
    void testResetCharacter3() {
        HTMLOutputStream hos = null;
        try {
            hos = new HTMLOutputStream(new MockHttpServletResponse());
            hos.binary = false;
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            assertEquals("Hello World!Hello World!Hello World!", hos.reset());
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
    * Test case for {@link HTMLOutputStream#reset()}.
    * It tests the reset method for a binary output stream.
    */
    @Test
    void testResetBinary4() {
        HTMLOutputStream hos = null;
        try {
            hos = new HTMLOutputStream(new MockHttpServletResponse());
            hos.binary = true;
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            assertEquals("Hello World!Hello World!Hello World!Hello World!", hos.reset());
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
    * Test case for {@link HTMLOutputStream#reset()}.
    * It tests the reset method for a character output stream.
    */
    @Test
    void testResetCharacter4() {
        HTMLOutputStream hos = null;
        try {
            hos = new HTMLOutputStream(new MockHttpServletResponse());
            hos.binary = false;
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            assertEquals("Hello World!Hello World!Hello World!Hello World!", hos.reset());
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
    * Test case for {@link HTMLOutputStream#reset()}.
    * It tests the reset method for a binary output stream.
    */
    @Test
    void testResetBinary5() {
        HTMLOutputStream hos = null;
        try {
            hos = new HTMLOutputStream(new MockHttpServletResponse());
            hos.binary = true;
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            hos.print("Hello");
            hos.print(" ");
            hos.print("World");
            hos.println("!");
            hos.flush();
            assertEquals("Hello World!Hello World!Hello World!Hello World!Hello World!", hos.reset());
        } catch (IOException e) {
            fail("IOException");
        }
    }

    /**
    * Test case for {@link HTMLOutputStream#reset()}.
    * It tests the reset method for a character output stream.
    */
    @Test
    void testResetCharacter5() {
        HTMLOutputStream hos = null