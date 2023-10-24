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
    * Test method for {@link PlotDatum#hasErrorBar()}.
    */
    @Test
    void testHasErrorBar() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        assertFalse(plotDatum.hasErrorBar());
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
    * Test method for {@link PlotDatum#hasErrorBar()}.
    */
    @Test
    void testHasErrorBar() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setYError(1);
        assertTrue(plotDatum.hasErrorBar());
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
    * Test method for {@link PlotDatum#hasErrorBar()}.
    */
    @Test
    void testHasErrorBar() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setYError(0);
        assertFalse(plotDatum.hasErrorBar());
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
    * Test method for {@link PlotDatum#hasErrorBar()}.
    */
    @Test
    void testHasErrorBar() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setYError(-1);
        assertFalse(plotDatum.hasErrorBar());
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
    * Test method for {@link PlotDatum#hasErrorBar()}.
    */
    @Test
    void testHasErrorBar() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setYError(Double.POSITIVE_INFINITY);
        assertFalse(plotDatum.hasErrorBar());
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
    * Test method for {@link PlotDatum#hasErrorBar()}.
    */
    @Test
    void testHasErrorBar() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setYError(Double.NEGATIVE_INFINITY);
        assertFalse(plotDatum.hasErrorBar());
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
    * Test method for {@link PlotDatum#hasErrorBar()}.
    */
    @Test
    void testHasErrorBar() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setYError(Double.NaN);
        assertFalse(plotDatum.hasErrorBar());
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
    * Test method for {@link PlotDatum#hasErrorBar()}.
    */
    @Test
    void testHasErrorBar() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setYError(Double.MAX_VALUE);
        assertTrue(plotDatum.hasErrorBar());
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
    * Test method for {@link PlotDatum#hasErrorBar()}.
    */
    @Test
    void testHasErrorBar() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setYError(Double.MIN_VALUE);
        assertTrue(plotDatum.hasErrorBar());
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
    * Test method for {@link PlotDatum#hasErrorBar()}.
    */
    @Test
    void testHasErrorBar() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setYError(Double.MIN_NORMAL);
        assertTrue(plotDatum.hasErrorBar());
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
    * Test method for {@link PlotDatum#hasErrorBar()}.
    */
    @Test
    void testHasErrorBar() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setYError(Double.MIN_NORMAL);
        assertTrue(plotDatum.hasErrorBar());
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
    * Test method for {@link PlotDatum#hasErrorBar()}.
    */
    @Test
    void testHasErrorBar() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
        plotDatum.setYError(Double.MIN_NORMAL);
        assertTrue(plotDatum.hasErrorBar());
    }
}

// PlotDatum_12Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.