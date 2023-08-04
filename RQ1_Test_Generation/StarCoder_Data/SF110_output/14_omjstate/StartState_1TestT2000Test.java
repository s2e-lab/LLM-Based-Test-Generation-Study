// StartState_1Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#toObject()} method.
*/
class StartState_1Test {

    /**
    * Test case for {@link StartState#toObject()}
    * @since 0.1
    */
    @Test
    void testToObject() {
        StartState startState = StartState.getSingleton();
        assertEquals(startState, startState.toObject());
    }
}

// StartState_2Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#equals(Object)} method.
*/
class StartState_2Test {
		
    /**
    * Test case for {@link StartState#equals(Object)}
    * @since 0.1
    */
    @Test
    void testEquals() {
        StartState startState = StartState.getSingleton();
        assertEquals(startState, startState);
    }
}

// StartState_3Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#hashCode()} method.
*/
class StartState_3Test {
		
    /**
    * Test case for {@link StartState#hashCode()}
    * @since 0.1
    */
    @Test
    void testHashCode() {
        StartState startState = StartState.getSingleton();
        assertEquals(startState.hashCode(), startState.hashCode());
    }
}

// StartState_4Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getName()} method.
*/
class StartState_4Test {
		
    /**
    * Test case for {@link StartState#getName()}
    * @since 0.1
    */
    @Test
    void testGetName() {
        StartState startState = StartState.getSingleton();
        assertEquals(StartState.NAME, startState.getName());
    }
}

// StartState_5Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getSingleton()} method.
*/
class StartState_5Test {
		
    /**
    * Test case for {@link StartState#getSingleton()}
    * @since 0.1
    */
    @Test
    void testGetSingleton() {
        StartState startState = StartState.getSingleton();
        assertEquals(StartState.getSingleton(), startState);
    }
}

// StartState_6Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#toString()} method.
*/
class StartState_6Test {
		
    /**
    * Test case for {@link StartState#toString()}
    * @since 0.1
    */
    @Test
    void testToString() {
        StartState startState = StartState.getSingleton();
        assertEquals(StartState.NAME, startState.toString());
    }
}

// StartState_7Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getClass()} method.
*/
class StartState_7Test {
		
    /**
    * Test case for {@link StartState#getClass()}
    * @since 0.1
    */
    @Test
    void testGetClass() {
        StartState startState = StartState.getSingleton();
        assertEquals(StartState.class, startState.getClass());
    }
}

// StartState_8Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getClass()} method.
*/
class StartState_8Test {
		
    /**
    * Test case for {@link StartState#getClass()}
    * @since 0.1
    */
    @Test
    void testGetClass() {
        StartState startState = StartState.getSingleton();
        assertEquals(StartState.class, startState.getClass());
    }
}

// StartState_9Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getClass()} method.
*/
class StartState_9Test {
		
    /**
    * Test case for {@link StartState#getClass()}
    * @since 0.1
    */
    @Test
    void testGetClass() {
        StartState startState = StartState.getSingleton();
        assertEquals(StartState.class, startState.getClass());
    }
}

// StartState_10Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getClass()} method.
*/
class StartState_10Test {
		
    /**
    * Test case for {@link StartState#getClass()}
    * @since 0.1
    */
    @Test
    void testGetClass() {
        StartState startState = StartState.getSingleton();
        assertEquals(StartState.class, startState.getClass());
    }
}

// StartState_11Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartState}.
* It contains ten unit test cases for the {@link StartState#getClass()} method.
*/
class StartState_11Test {
		
    /**
    * Test case for {@link StartState#getClass()}
    * @since 0.1
    */
    @Test
    void testGetClass() {
        StartState startState = StartState.getSingleton();
        assertEquals(StartState.class, startState.getClass());
    }
}

// StartState_12Test.java
package uk.me.jockmacmad.jstate.state;

import org.apache.commons.lang.builder.EqualsBuilder;
import org.apache.commons.lang.builder.HashCodeBuilder;
import org.junit.jupiter