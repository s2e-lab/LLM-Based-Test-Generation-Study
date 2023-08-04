// EndState_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#toObject()} method.
*/
class EndState_1Test {
	/**
			* Test case for {@link EndState#toObject()}
			* @since 0.1
			*/
			@Test
			void testToObject() {
					EndState endState = EndState.getSingleton();
					java.lang.Object obj = endState.toObject();
					assertEquals(obj, endState);
			}
}

// EndState_2Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#equals(Object)} method.
*/
class EndState_2Test {
			/**
			* Test case for {@link EndState#equals(Object)}
			* @since 0.1
			*/
			@Test
			void testEquals() {
					EndState endState = EndState.getSingleton();
					java.lang.Object obj = endState.toObject();
					assertTrue(EqualsBuilder.reflectionEquals(endState, obj));
			}
}

// EndState_3Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#hashCode()} method.
*/
class EndState_3Test {
			/**
			* Test case for {@link EndState#hashCode()}
			* @since 0.1
			*/
			@Test
			void testHashCode() {
					EndState endState = EndState.getSingleton();
					java.lang.Object obj = endState.toObject();
					assertEquals(HashCodeBuilder.reflectionHashCode(endState), HashCodeBuilder.reflectionHashCode(obj));
			}
}

// EndState_4Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#getName()} method.
*/
class EndState_4Test {
			/**
			* Test case for {@link EndState#getName()}
			* @since 0.1
			*/
			@Test
			void testGetName() {
					EndState endState = EndState.getSingleton();
					assertEquals(endState.getName(), "com.objectmentors.state.EndState");
			}
}

// EndState_5Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#getSingleton()} method.
*/
class EndState_5Test {
			/**
			* Test case for {@link EndState#getSingleton()}
			* @since 0.1
			*/
			@Test
			void testGetSingleton() {
					EndState endState = EndState.getSingleton();
					assertEquals(endState, EndState.getSingleton());
			}
}

// EndState_6Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#toString()} method.
*/
class EndState_6Test {
			/**
			* Test case for {@link EndState#toString()}
			* @since 0.1
			*/
			@Test
			void testToString() {
					EndState endState = EndState.getSingleton();
					assertEquals(endState.toString(), "com.objectmentors.state.EndState");
			}
}

// EndState_7Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState()} method.
*/
class EndState_7Test {
			/**
			* Test case for {@link EndState#EndState()}
			* @since 0.1
			*/
			@Test
			void testEndState() {
					EndState endState = new EndState();
					assertEquals(endState, EndState.getSingleton());
			}
}

// EndState_8Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState(String)} method.
*/
class EndState_8Test {
			/**
			* Test case for {@link EndState#EndState(String)}
			* @since 0.1
			*/
			@Test
			void testEndStateString() {
					EndState endState = new EndState("EndState");
					assertEquals(endState, EndState.getSingleton());
			}
}

// EndState_9Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState(String, String)} method.
*/
class EndState_9Test {
			/**
			* Test case for {@link EndState#EndState(String, String)}
			* @since 0.1
			*/
			@Test
			void testEndStateStringString() {
					EndState endState = new EndState("EndState", "EndState");
					assertEquals(endState, EndState.getSingleton());
			}
}

// EndState_10Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link EndState}.
* It contains ten unit test cases for the {@link EndState#EndState(String, String, String)} method.
*/
class EndState_10Test {
			/**
			* Test case for {@link EndState#EndState(String, String, String)}
			* @since 0.1
			*/
			@Test
			void testEndStateStringStringString() {
					EndState endState = new EndState("EndState", "EndState", "EndState");
					assertEquals(endState, EndState.getSingleton());
			}
}

// EndState_11Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder