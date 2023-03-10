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
		* Test case for {@link Transition#hashCode()}.
		*/
		@Test
		void testHashCode1() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				int expected = HashCodeBuilder.reflectionHashCode(transition);
				int actual = transition.hashCode();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#hashCode()}.
		*/
		@Test
		void testHashCode2() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				int expected = HashCodeBuilder.reflectionHashCode(transition);
				int actual = transition.hashCode();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#hashCode()}.
		*/
		@Test
		void testHashCode3() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				int expected = HashCodeBuilder.reflectionHashCode(transition);
				int actual = transition.hashCode();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#hashCode()}.
		*/
		@Test
		void testHashCode4() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				int expected = HashCodeBuilder.reflectionHashCode(transition);
				int actual = transition.hashCode();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#hashCode()}.
		*/
		@Test
		void testHashCode5() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				int expected = HashCodeBuilder.reflectionHashCode(transition);
				int actual = transition.hashCode();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#hashCode()}.
		*/
		@Test
		void testHashCode6() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				int expected = HashCodeBuilder.reflectionHashCode(transition);
				int actual = transition.hashCode();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#hashCode()}.
		*/
		@Test
		void testHashCode7() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				int expected = HashCodeBuilder.reflectionHashCode(transition);
				int actual = transition.hashCode();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#hashCode()}.
		*/
		@Test
		void testHashCode8() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				int expected = HashCodeBuilder.reflectionHashCode(transition);
				int actual = transition.hashCode();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#hashCode()}.
		*/
		@Test
		void testHashCode9() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				int expected = HashCodeBuilder.reflectionHashCode(transition);
				int actual = transition.hashCode();
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#hashCode()}.
		*/
		@Test
		void testHashCode10() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				int expected = HashCodeBuilder.reflectionHashCode(transition);
				int actual = transition.hashCode();
				assertEquals(expected, actual);
		}
}

// TransitionTest2.java
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
class TransitionTest2 {
		
		/**
		* Test case for {@link Transition#equals(Object)}.
		*/
		@Test
		void testEquals1() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				boolean expected = EqualsBuilder.reflectionEquals(transition, transition);
				boolean actual = transition.equals(transition);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#equals(Object)}.
		*/
		@Test
		void testEquals2() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				boolean expected = EqualsBuilder.reflectionEquals(transition, transition);
				boolean actual = transition.equals(transition);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#equals(Object)}.
		*/
		@Test
		void testEquals3() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				boolean expected = EqualsBuilder.reflectionEquals(transition, transition);
				boolean actual = transition.equals(transition);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#equals(Object)}.
		*/
		@Test
		void testEquals4() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				boolean expected = EqualsBuilder.reflectionEquals(transition, transition);
				boolean actual = transition.equals(transition);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#equals(Object)}.
		*/
		@Test
		void testEquals5() {
				Transition transition = new Transition("name", new Event("event"), new State("state"), new State("state"));
				boolean expected = EqualsBuilder.reflectionEquals(transition, transition);
				boolean actual = transition.equals(transition);
				assertEquals(expected, actual);
		}
		
		/**
		* Test case for {@link Transition#equals(