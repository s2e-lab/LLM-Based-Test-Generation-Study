// ExtBoolArray_1Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_1Test {

    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte = new boolean[]{true, false, true, false, true, false, true, false, true, false};
        assertEquals(3, extBoolArray.left());
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
		
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte = new boolean[]{false, false, false, false, false, false, false, false, false, false};
        assertEquals(10, extBoolArray.left());
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
		
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte = new boolean[]{true, true, true, true, true, true, true, true, true, true};
        assertEquals(0, extBoolArray.left());
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
		
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte = new boolean[]{true, true, true, true, true, true, true, true, true, false};
        assertEquals(1, extBoolArray.left());
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
		
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte = new boolean[]{true, true, true, true, true, true, true, true, false, false};
        assertEquals(2, extBoolArray.left());
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
		
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte = new boolean[]{true, true, true, true, true, true, true, false, false, false};
        assertEquals(3, extBoolArray.left());
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
		
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte = new boolean[]{true, true, true, true, true, true, false, false, false, false};
        assertEquals(4, extBoolArray.left());
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
		
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte = new boolean[]{true, true, true, true, true, false, false, false, false, false};
        assertEquals(5, extBoolArray.left());
    }
}

// ExtBoolArray_9Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_9Test {
		
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte = new boolean[]{true, true, true, true, false, false, false, false, false, false};
        assertEquals(6, extBoolArray.left());
    }
}

// ExtBoolArray_10Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_10Test {
		
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte = new boolean[]{true, true, true, false, false, false, false, false, false, false};
        assertEquals(7, extBoolArray.left());
    }
}

// ExtBoolArray_11Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_11Test {
		
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte = new boolean[]{true, true, false, false, false, false, false, false, false, false};
        assertEquals(8, extBoolArray.left());
    }
}

// ExtBoolArray_12Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_12Test {
		
    @Test
    void testLeft() {
        ExtBoolArray extBoolArray = new ExtBoolArray();
        extBoolArray.werte = new boolean[]{true, false, false, false, false, false, false, false, false, false};
        assertEquals(9, extBoolArray.left());
    }
}

// ExtBoolArray_13Test.java
package de.beiri22.stringincrementor.helper;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ExtBoolArray}.
* It contains ten unit test cases for the {@link ExtBoolArray#left()} method.
*/
class ExtBoolArray_13Test {