// StartStateTest2.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getSingleton()} method.
*/
class StartStateTest2 {

	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns a non-null object.
	*/
	@Test
	void testGetSingleton() {
		assertNotNull(StartState.getSingleton());
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link StartState}.
	*/
	@Test
	void testGetSingleton2() {
		assertTrue(StartState.getSingleton() instanceof StartState);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link IState}.
	*/
	@Test
	void testGetSingleton3() {
		assertTrue(StartState.getSingleton() instanceof IState);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link uk.me.jockmacmad.jstate.patterns.ISingleton}.
	*/
	@Test
	void testGetSingleton4() {
		assertTrue(StartState.getSingleton() instanceof uk.me.jockmacmad.jstate.patterns.ISingleton);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link Object}.
	*/
	@Test
	void testGetSingleton5() {
		assertTrue(StartState.getSingleton() instanceof Object);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link java.lang.Object}.
	*/
	@Test
	void testGetSingleton6() {
		assertTrue(StartState.getSingleton() instanceof java.lang.Object);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link java.io.Serializable}.
	*/
	@Test
	void testGetSingleton7() {
		assertTrue(StartState.getSingleton() instanceof java.io.Serializable);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link java.lang.Comparable}.
	*/
	@Test
	void testGetSingleton8() {
		assertTrue(StartState.getSingleton() instanceof java.lang.Comparable);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link java.lang.reflect.Type}.
	*/
	@Test
	void testGetSingleton9() {
		assertTrue(StartState.getSingleton() instanceof java.lang.reflect.Type);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link java.lang.reflect.AnnotatedElement}.
	*/
	@Test
	void testGetSingleton10() {
		assertTrue(StartState.getSingleton() instanceof java.lang.reflect.AnnotatedElement);
	}
	
}

// StartStateTest.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getSingleton()} method.
*/
class StartStateTest {
		
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns a non-null object.
	*/
	@Test
	void testGetSingleton() {
		assertNotNull(StartState.getSingleton());
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link StartState}.
	*/
	@Test
	void testGetSingleton2() {
		assertTrue(StartState.getSingleton() instanceof StartState);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link IState}.
	*/
	@Test
	void testGetSingleton3() {
		assertTrue(StartState.getSingleton() instanceof IState);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link uk.me.jockmacmad.jstate.patterns.ISingleton}.
	*/
	@Test
	void testGetSingleton4() {
		assertTrue(StartState.getSingleton() instanceof uk.me.jockmacmad.jstate.patterns.ISingleton);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link Object}.
	*/
	@Test
	void testGetSingleton5() {
		assertTrue(StartState.getSingleton() instanceof Object);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link java.lang.Object}.
	*/
	@Test
	void testGetSingleton6() {
		assertTrue(StartState.getSingleton() instanceof java.lang.Object);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link java.io.Serializable}.
	*/
	@Test
	void testGetSingleton7() {
		assertTrue(StartState.getSingleton() instanceof java.io.Serializable);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>
	* This test case checks that the {@link StartState#getSingleton()} method returns an object of type {@link java.lang.Comparable}.
	*/
	@Test
	void testGetSingleton8() {
		assertTrue(StartState.getSingleton() instanceof java.lang.Comparable);
	}
	
	/**
	* Test case for {@link StartState#getSingleton()}.
	* <p>