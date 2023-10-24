// ExtBoolArray_1Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_1Test {

    /**
     * Test case for {@link ExtBoolArray#left()}.
     */
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte[0] = true;
        extBoolArray.werte[1] = true;
        extBoolArray.werte[2] = true;
        extBoolArray.werte[3] = true;
        extBoolArray.werte[4] = true;
        extBoolArray.werte[5] = true;
        extBoolArray.werte[6] = true;
        extBoolArray.werte[7] = true;
        extBoolArray.werte[8] = true;
        extBoolArray.werte[9] = true;
        assertEquals(0, extBoolArray.left());
    }
}

// ExtBoolArray_2Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_2Test {
		
    /**
     * Test case for {@link ExtBoolArray#left()}.
     */
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte[0] = true;
        extBoolArray.werte[1] = true;
        extBoolArray.werte[2] = true;
        extBoolArray.werte[3] = true;
        extBoolArray.werte[4] = true;
        extBoolArray.werte[5] = true;
        extBoolArray.werte[6] = true;
        extBoolArray.werte[7] = true;
        extBoolArray.werte[8] = true;
        extBoolArray.werte[9] = false;
        assertEquals(1, extBoolArray.left());
    }
}

// ExtBoolArray_3Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_3Test {
		
    /**
     * Test case for {@link ExtBoolArray#left()}.
     */
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte[0] = true;
        extBoolArray.werte[1] = true;
        extBoolArray.werte[2] = true;
        extBoolArray.werte[3] = true;
        extBoolArray.werte[4] = true;
        extBoolArray.werte[5] = true;
        extBoolArray.werte[6] = true;
        extBoolArray.werte[7] = true;
        extBoolArray.werte[8] = false;
        extBoolArray.werte[9] = false;
        assertEquals(2, extBoolArray.left());
    }
}

// ExtBoolArray_4Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_4Test {
		
    /**
     * Test case for {@link ExtBoolArray#left()}.
     */
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte[0] = true;
        extBoolArray.werte[1] = true;
        extBoolArray.werte[2] = true;
        extBoolArray.werte[3] = true;
        extBoolArray.werte[4] = true;
        extBoolArray.werte[5] = true;
        extBoolArray.werte[6] = true;
        extBoolArray.werte[7] = false;
        extBoolArray.werte[8] = false;
        extBoolArray.werte[9] = false;
        assertEquals(3, extBoolArray.left());
    }
}

// ExtBoolArray_5Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_5Test {
		
    /**
     * Test case for {@link ExtBoolArray#left()}.
     */
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte[0] = true;
        extBoolArray.werte[1] = true;
        extBoolArray.werte[2] = true;
        extBoolArray.werte[3] = true;
        extBoolArray.werte[4] = true;
        extBoolArray.werte[5] = true;
        extBoolArray.werte[6] = false;
        extBoolArray.werte[7] = false;
        extBoolArray.werte[8] = false;
        extBoolArray.werte[9] = false;
        assertEquals(4, extBoolArray.left());
    }
}

// ExtBoolArray_6Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_6Test {
		
    /**
     * Test case for {@link ExtBoolArray#left()}.
     */
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte[0] = true;
        extBoolArray.werte[1] = true;
        extBoolArray.werte[2] = true;
        extBoolArray.werte[3] = true;
        extBoolArray.werte[4] = true;
        extBoolArray.werte[5] = false;
        extBoolArray.werte[6] = false;
        extBoolArray.werte[7] = false;
        extBoolArray.werte[8] = false;
        extBoolArray.werte[9] = false;
        assertEquals(5, extBoolArray.left());
    }
}

// ExtBoolArray_7Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_7Test {
		
    /**
     * Test case for {@link ExtBoolArray#left()}.
     */
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte[0] = true;
        extBoolArray.werte[1] = true;
        extBoolArray.werte[2] = true;
        extBoolArray.werte[3] = true;
        extBoolArray.werte[4] = false;
        extBoolArray.werte[5] = false;
        extBoolArray.werte[6] = false;
        extBoolArray.werte[7] = false;
        extBoolArray.werte[8] = false;
        extBoolArray.werte[9] = false;
        assertEquals(6, extBoolArray.left());
    }
}

// ExtBoolArray_8Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_8Test {
		
    /**
     * Test case for {@link ExtBoolArray#left()}.
     */
    @Test
    void testLeft() {