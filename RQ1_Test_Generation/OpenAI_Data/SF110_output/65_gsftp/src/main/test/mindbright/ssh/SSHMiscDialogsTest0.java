// SSHMiscDialogsTest0.java
package mindbright.ssh;

import java.awt.*;
import java.awt.event.*;
import mindbright.util.AWTConvenience;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SSHMiscDialogs}.
* It contains ten unit test cases for the {@link SSHMiscDialogs#password(String, String, Frame)} method.
*/
class SSHMiscDialogsTest0 {

		/**
		* Test case for the {@link SSHMiscDialogs#password(String, String, Frame)} method.
		* It tests the case that the title is null and the message is null and the parent is null and the echo is '*' and the defaultValue is "" and the textBoxLabel is "Password:".
		* Expected result: {@link IllegalArgumentException} is thrown.
		*/
		@Test
		public void testPassword_0() {
				try {
						SSHMiscDialogs.password(null, null, null, '*', "", "Password:");
						fail("Expected IllegalArgumentException to be thrown");
				} catch (IllegalArgumentException e) {
						assertEquals("title cannot be null", e.getMessage());
				}
		}
		
		/**
		* Test case for the {@link SSHMiscDialogs#password(String, String, Frame)} method.
		* It tests the case that the title is "" and the message is "" and the parent is null and the echo is '*' and the defaultValue is "" and the textBoxLabel is "Password:".
		* Expected result: {@link IllegalArgumentException} is thrown.
		*/
		@Test
		public void testPassword_1() {
				try {
						SSHMiscDialogs.password("", "", null, '*', "", "Password:");
						fail("Expected IllegalArgumentException to be thrown");
				} catch (IllegalArgumentException e) {
						assertEquals("title cannot be empty", e.getMessage());
				}
		}
		
		/**
		* Test case for the {@link SSHMiscDialogs#password(String, String, Frame)} method.
		* It tests the case that the title is "title" and the message is null and the parent is null and the echo is '*' and the defaultValue is "" and the textBoxLabel is "Password:".
		* Expected result: {@link IllegalArgumentException} is thrown.
		*/
		@Test
		public void testPassword_2() {
				try {
						SSHMiscDialogs.password("title", null, null, '*', "", "Password:");
						fail("Expected IllegalArgumentException to be thrown");
				} catch (IllegalArgumentException e) {
						assertEquals("message cannot be null", e.getMessage());
				}
		}
		
		/**
		* Test case for the {@link SSHMiscDialogs#password(String, String, Frame)} method.
		* It tests the case that the title is "title" and the message is "" and the parent is null and the echo is '*' and the defaultValue is "" and the textBoxLabel is "Password:".
		* Expected result: {@link IllegalArgumentException} is thrown.
		*/
		@Test
		public void testPassword_3() {
				try {
						SSHMiscDialogs.password("title", "", null, '*', "", "Password:");
						fail("Expected IllegalArgumentException to be thrown");
				} catch (IllegalArgumentException e) {
						assertEquals("message cannot be empty", e.getMessage());
				}
		}
		
		/**
		* Test case for the {@link SSHMiscDialogs#password(String, String, Frame)} method.
		* It tests the case that the title is "title" and the message is "message" and the parent is null and the echo is '*' and the defaultValue is "" and the textBoxLabel is "Password:".
		* Expected result: {@link IllegalArgumentException} is thrown.
		*/
		@Test
		public void testPassword_4() {
				try {
						SSHMiscDialogs.password("title", "message", null, '*', "", "Password:");
						fail("Expected IllegalArgumentException to be thrown");
				} catch (IllegalArgumentException e) {
						assertEquals("parent cannot be null", e.getMessage());
				}
		}
		
		/**
		* Test case for the {@link SSHMiscDialogs#password(String, String, Frame)} method.
		* It tests the case that the title is "title" and the message is "message" and the parent is new Frame() and the echo is '*' and the defaultValue is "" and the textBoxLabel is "Password:".
		* Expected result: {@link IllegalArgumentException} is thrown.
		*/
		@Test
		public void testPassword_5() {
				try {
						SSHMiscDialogs.password("title", "message", new Frame(), '*', "", "Password:");
						fail("Expected IllegalArgumentException to be thrown");
				} catch (IllegalArgumentException e) {
						assertEquals("parent cannot be null", e.getMessage());
				}
		}
		
		/**
		* Test case for the {@link SSHMiscDialogs#password(String, String, Frame)} method.
		* It tests the case that the title is "title" and the message is "message" and the parent is new Frame() and the echo is '*' and the defaultValue is "" and the textBoxLabel is "Password:".
		* Expected result: {@link IllegalArgumentException} is thrown.
		*/
		@Test
		public void testPassword_6() {
				try {
						SSHMiscDialogs.password("title", "message", new Frame(), '*', "", "Password:");
						fail("Expected IllegalArgumentException to be thrown");
				} catch (IllegalArgumentException e) {
						assertEquals("parent cannot be null", e.getMessage());
				}
		}
		
		/**
		* Test case for the {@link SSHMiscDialogs#password(String, String, Frame)} method.
		* It tests the case that the title is "title" and the message is "message" and the parent is new Frame() and the echo is '*' and the defaultValue is "" and the textBoxLabel is "Password:".
		* Expected result: {@link IllegalArgumentException} is thrown.
		*/
		@Test
		public void testPassword_7() {
				try {
						SSHMiscDialogs.password("title", "message", new Frame(), '*', "", "Password:");
						fail("Expected IllegalArgumentException to be thrown");
				} catch (IllegalArgumentException e) {
						assertEquals("parent cannot be null", e.getMessage());
				}
		}
		
		/**
		* Test case for the {@link SSHMiscDialogs#password(String, String, Frame)} method.
		* It tests the case that the title is "title" and the message is "message" and the parent is new Frame() and the echo is '*' and the defaultValue is "" and the textBoxLabel is "Password:".
		* Expected result: {@link IllegalArgumentException} is thrown.
		*/
		@Test
		public void testPassword_8() {
				try {
						SSHMiscDialogs.password("title", "message", new Frame(), '*', "", "Password:");
						fail("Expected IllegalArgumentException to be thrown");
				} catch (IllegalArgumentException e) {
						assertEquals("parent cannot be null", e.getMessage());
				}
		}
		
		/**
		* Test case