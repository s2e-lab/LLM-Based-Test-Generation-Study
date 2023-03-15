// SSHMiscDialogs_1Test.java
package mindbright.ssh;

import java.awt.*;
import java.awt.event.*;
import mindbright.util.AWTConvenience;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SSHMiscDialogs}.
* It contains ten unit test cases for the {@link SSHMiscDialogs#textfield(String, String, Frame)} method.
*/
class SSHMiscDialogs_1Test {

	/**
	* Test case for the {@link SSHMiscDialogs#textfield(String, String, Frame)} method.
	* It tests the case that the title is null and expects IllegalArgumentException.
	*/
	@Test
	void testTextfield_NullTitle() {
		try {
			SSHMiscDialogs.textfield(null, "message", new Frame());
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected.
		}
	}
	
	/**
	* Test case for the {@link SSHMiscDialogs#textfield(String, String, Frame)} method.
	* It tests the case that the title is empty and expects IllegalArgumentException.
	*/
	@Test
	void testTextfield_EmptyTitle() {
		try {
			SSHMiscDialogs.textfield("", "message", new Frame());
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected.
		}
	}
	
	/**
	* Test case for the {@link SSHMiscDialogs#textfield(String, String, Frame)} method.
	* It tests the case that the message is null and expects IllegalArgumentException.
	*/
	@Test
	void testTextfield_NullMessage() {
		try {
			SSHMiscDialogs.textfield("title", null, new Frame());
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected.
		}
	}
	
	/**
	* Test case for the {@link SSHMiscDialogs#textfield(String, String, Frame)} method.
	* It tests the case that the message is empty and expects IllegalArgumentException.
	*/
	@Test
	void testTextfield_EmptyMessage() {
		try {
			SSHMiscDialogs.textfield("title", "", new Frame());
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected.
		}
	}
	
	/**
	* Test case for the {@link SSHMiscDialogs#textfield(String, String, Frame)} method.
	* It tests the case that the parent is null and expects IllegalArgumentException.
	*/
	@Test
	void testTextfield_NullParent() {
		try {
			SSHMiscDialogs.textfield("title", "message", null);
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected.
		}
	}
	
	/**
	* Test case for the {@link SSHMiscDialogs#textfield(String, String, Frame)} method.
	* It tests the case that the title is null and expects IllegalArgumentException.
	*/
	@Test
	void testTextfield_NullTitle_DefaultValue() {
		try {
			SSHMiscDialogs.textfield(null, "message", new Frame(), "defaultValue");
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected.
		}
	}
	
	/**
	* Test case for the {@link SSHMiscDialogs#textfield(String, String, Frame)} method.
	* It tests the case that the title is empty and expects IllegalArgumentException.
	*/
	@Test
	void testTextfield_EmptyTitle_DefaultValue() {
		try {
			SSHMiscDialogs.textfield("", "message", new Frame(), "defaultValue");
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected.
		}
	}
	
	/**
	* Test case for the {@link SSHMiscDialogs#textfield(String, String, Frame)} method.
	* It tests the case that the message is null and expects IllegalArgumentException.
	*/
	@Test
	void testTextfield_NullMessage_DefaultValue() {
		try {
			SSHMiscDialogs.textfield("title", null, new Frame(), "defaultValue");
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected.
		}
	}
	
	/**
	* Test case for the {@link SSHMiscDialogs#textfield(String, String, Frame)} method.
	* It tests the case that the message is empty and expects IllegalArgumentException.
	*/
	@Test
	void testTextfield_EmptyMessage_DefaultValue() {
		try {
			SSHMiscDialogs.textfield("title", "", new Frame(), "defaultValue");
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected.
		}
	}
	
	/**
	* Test case for the {@link SSHMiscDialogs#textfield(String, String, Frame)} method.
	* It tests the case that the parent is null and expects IllegalArgumentException.
	*/
	@Test
	void testTextfield_NullParent_DefaultValue() {
		try {
			SSHMiscDialogs.textfield("title", "message", null, "defaultValue");
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected.
		}
	}
	
	/**
	* Test case for the {@link SSHMiscDialogs#textfield(String, String, Frame)} method.
	* It tests the case that the default value is null and expects IllegalArgumentException.
	*/
	@Test
	void testTextfield_NullDefaultValue() {
		try {
			SSHMiscDialogs.textfield("title", "message", new Frame(), null);
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected.
		}
	}
	
	/**
	* Test case for the {@link SSHMiscDialogs#textfield(String, String, Frame)} method.
	* It tests the case that the default value is empty and expects IllegalArgumentException.
	*/
	@Test
	void testTextfield_EmptyDefaultValue() {
		try {
			SSHMiscDialogs.textfield("title", "message", new Frame(), "");
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected.
		}
	}
}

// SSHMiscDialogs_2Test.java
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
class SSHMiscDialogs_2Test {
		
	/**
	* Test case for the {@link SSHMiscDialogs#password(String, String, Frame)} method.
	* It tests the case that the title is null and expects IllegalArgumentException.
	*/
	@Test
	void testPassword_NullTitle() {
		try {
			SSHMiscDialogs.password(null, "message", new Frame());
			fail("IllegalArgumentException expected.");
		} catch (IllegalArgumentException e) {
			// As expected.
		}
	}
	
	/**
	* Test case for the {@link SSHMiscDialogs#password(String, String, Frame)} method