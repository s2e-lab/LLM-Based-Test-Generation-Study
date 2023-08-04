// JavaSource_1Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_1Test {

    /**
     * Test case for {@link JavaSource#hasSuperClass()} method.
     *
     * @throws Exception if any error occurs.
     */
    @Test
    void testHasSuperClass() throws Exception {
        JavaSource javaSource = new JavaSource_1();
        assertTrue(javaSource.hasSuperClass());
    }
}

// JavaSource_2Test.java
package org.sourceforge.ifx.tools;

import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JavaSource}.
* It contains ten unit test cases for the {@link JavaSource#hasSuperClass()} method.
*/
class JavaSource_2Test {
		
    /**
     * Test case for {@link JavaSource#hasSuperClass()} method.
     *
     * @throws Exception if any error occurs.
     */
    @Test
    void testHasSuperClass() throws Exception {
        JavaSource javaSource = new JavaSource_2();
        assertFalse(javaSource.hasSuperClass());
    }
}

// JavaSource_1.java
package org.sourceforge.ifx.tools;

public class JavaSource_1 extends JavaSource {

    public boolean hasSuperClass() {
        return true;
    }
}

// JavaSource_2.java
package org.sourceforge.ifx.tools;

public class JavaSource_2 extends JavaSource {

    public boolean hasSuperClass() {
        return false;
    }
}
