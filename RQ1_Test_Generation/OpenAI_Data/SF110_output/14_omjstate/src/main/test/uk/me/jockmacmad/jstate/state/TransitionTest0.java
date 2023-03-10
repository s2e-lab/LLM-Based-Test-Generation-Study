// TransitionTest0.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#equals(Object)} method.
*/
class TransitionTest0 {

		/**
		* Test case for the {@link Transition#equals(Object)} method.
		*/
		@Test
		void testEquals0() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				Transition transition1 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				boolean boolean0 = transition0.equals(transition1);
				assertTrue(boolean0);
		}
		
		/**
		* Test case for the {@link Transition#equals(Object)} method.
		*/
		@Test
		void testEquals1() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				boolean boolean0 = transition0.equals(transition0);
				assertTrue(boolean0);
		}
		
		/**
		* Test case for the {@link Transition#equals(Object)} method.
		*/
		@Test
		void testEquals2() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				boolean boolean0 = transition0.equals(null);
				assertFalse(boolean0);
		}
		
		/**
		* Test case for the {@link Transition#equals(Object)} method.
		*/
		@Test
		void testEquals3() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				boolean boolean0 = transition0.equals("");
				assertFalse(boolean0);
		}
		
		/**
		* Test case for the {@link Transition#equals(Object)} method.
		*/
		@Test
		void testEquals4() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				Transition transition1 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				boolean boolean0 = transition0.equals(transition1);
				assertTrue(boolean0);
		}
		
		/**
		* Test case for the {@link Transition#equals(Object)} method.
		*/
		@Test
		void testEquals5() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				Transition transition1 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				boolean boolean0 = transition0.equals(transition1);
				assertTrue(boolean0);
		}
		
		/**
		* Test case for the {@link Transition#equals(Object)} method.
		*/
		@Test
		void testEquals6() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				Transition transition1 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				boolean boolean0 = transition0.equals(transition1);
				assertTrue(boolean0);
		}
		
		/**
		* Test case for the {@link Transition#equals(Object)} method.
		*/
		@Test
		void testEquals7() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				Transition transition1 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				boolean boolean0 = transition0.equals(transition1);
				assertTrue(boolean0);
		}
		
		/**
		* Test case for the {@link Transition#equals(Object)} method.
		*/
		@Test
		void testEquals8() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				Transition transition1 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				boolean boolean0 = transition0.equals(transition1);
				assertTrue(boolean0);
		}
		
		/**
		* Test case for the {@link Transition#equals(Object)} method.
		*/
		@Test
		void testEquals9() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				Transition transition1 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				boolean boolean0 = transition0.equals(transition1);
				assertTrue(boolean0);
		}
}

// TransitionTest1.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Transition}.
* It contains ten unit test cases for the {@link Transition#hashCode()} method.
*/
class TransitionTest1 {
		
		/**
		* Test case for the {@link Transition#hashCode()} method.
		*/
		@Test
		void testHashCode0() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				int int0 = transition0.hashCode();
				assertEquals(0, int0);
		}
		
		/**
		* Test case for the {@link Transition#hashCode()} method.
		*/
		@Test
		void testHashCode1() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				int int0 = transition0.hashCode();
				assertEquals(0, int0);
		}
		
		/**
		* Test case for the {@link Transition#hashCode()} method.
		*/
		@Test
		void testHashCode2() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				int int0 = transition0.hashCode();
				assertEquals(0, int0);
		}
		
		/**
		* Test case for the {@link Transition#hashCode()} method.
		*/
		@Test
		void testHashCode3() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));
				int int0 = transition0.hashCode();
				assertEquals(0, int0);
		}
		
		/**
		* Test case for the {@link Transition#hashCode()} method.
		*/
		@Test
		void testHashCode4() {
				Transition transition0 = new Transition("", new Event("", ""), new State("", ""), new State("", ""));