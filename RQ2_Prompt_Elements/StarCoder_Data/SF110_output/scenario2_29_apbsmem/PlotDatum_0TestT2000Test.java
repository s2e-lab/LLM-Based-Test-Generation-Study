// PlotDatum_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_0Test {

    /**
     *  Test case for {@link PlotDatum#hasErrorBar()} method.
     */
    @Test
    void testHasErrorBar() {
        PlotDatum pd = new PlotDatum(1.0, 2.0, 3.0, 4.0, Color.RED);
        assertTrue(pd.hasErrorBar());
    }
}

// PlotDatum_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_1Test {
		
    /**
     *  Test case for {@link PlotDatum#hasErrorBar()} method.
     */
    @Test
    void testHasErrorBar() {
        PlotDatum pd = new PlotDatum(1.0, 2.0, 3.0, Color.RED);
        assertFalse(pd.hasErrorBar());
    }
}

// PlotDatum_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_2Test {
		
    /**
     *  Test case for {@link PlotDatum#hasErrorBar()} method.
     */
    @Test
    void testHasErrorBar() {
        PlotDatum pd = new PlotDatum(1.0, 2.0, Color.RED);
        assertFalse(pd.hasErrorBar());
    }
}

// PlotDatum_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_3Test {
		
    /**
     *  Test case for {@link PlotDatum#hasErrorBar()} method.
     */
    @Test
    void testHasErrorBar() {
        PlotDatum pd = new PlotDatum(1.0, Color.RED);
        assertFalse(pd.hasErrorBar());
    }
}

// PlotDatum_4Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_4Test {
		
    /**
     *  Test case for {@link PlotDatum#hasErrorBar()} method.
     */
    @Test
    void testHasErrorBar() {
        PlotDatum pd = new PlotDatum(Color.RED);
        assertFalse(pd.hasErrorBar());
    }
}

// PlotDatum_5Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_5Test {
		
    /**
     *  Test case for {@link PlotDatum#hasErrorBar()} method.
     */
    @Test
    void testHasErrorBar() {
        PlotDatum pd = new PlotDatum();
        assertFalse(pd.hasErrorBar());
    }
}

// PlotDatum_6Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_6Test {
		
    /**
     *  Test case for {@link PlotDatum#hasErrorBar()} method.
     */
    @Test
    void testHasErrorBar() {
        PlotDatum pd = new PlotDatum(1.0, 2.0, 3.0, 4.0, Color.RED, true);
        assertTrue(pd.hasErrorBar());
    }
}

// PlotDatum_7Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_7Test {
		
    /**
     *  Test case for {@link PlotDatum#hasErrorBar()} method.
     */
    @Test
    void testHasErrorBar() {
        PlotDatum pd = new PlotDatum(1.0, 2.0, 3.0, Color.RED, true);
        assertTrue(pd.hasErrorBar());
    }
}

// PlotDatum_8Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_8Test {
		
    /**
     *  Test case for {@link PlotDatum#hasErrorBar()} method.
     */
    @Test
    void testHasErrorBar() {
        PlotDatum pd = new PlotDatum(1.0, 2.0, Color.RED, true);
        assertTrue(pd.hasErrorBar());
    }
}

// PlotDatum_9Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_9Test {
		
    /**
     *  Test case for {@link PlotDatum#hasErrorBar()} method.
     */
    @Test
    void testHasErrorBar() {
        PlotDatum pd = new PlotDatum(1.0, Color.RED, true);
        assertTrue(pd.hasErrorBar());
    }
}

// PlotDatum_10Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_10Test {
		
    /**
     *  Test case for {@link PlotDatum#hasErrorBar()} method.
     */
    @Test
    void testHasErrorBar() {
        PlotDatum pd = new PlotDatum(Color.RED, true);
        assertTrue(pd.hasErrorBar());
    }
}

// PlotDatum_11Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_11Test {
		
    /**
     *  Test case for {@link PlotDatum#hasErrorBar()} method.
     */
    @Test
    void testHasErrorBar() {
        PlotDatum pd = new PlotDatum(true);
        assertTrue(pd.hasErrorBar());
    }
}

// PlotDatum_12Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#hasErrorBar()} method.
*/
class PlotDatum_12Test {
		
    /**
     *  Test case for {@link PlotDatum#has