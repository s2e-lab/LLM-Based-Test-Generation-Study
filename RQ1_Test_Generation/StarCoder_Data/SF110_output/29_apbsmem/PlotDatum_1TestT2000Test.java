// PlotDatum_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_1Test {

    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
        assertTrue(plotDatum.connected());
    }
}

// PlotDatum_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_2Test {
		
    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, false);
        assertFalse(plotDatum.connected());
    }
}

// PlotDatum_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_3Test {
		
    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
        plotDatum.setConnected(false);
        assertFalse(plotDatum.connected());
    }
}

// PlotDatum_4Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_4Test {
		
    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, false);
        plotDatum.setConnected(true);
        assertTrue(plotDatum.connected());
    }
}

// PlotDatum_5Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_5Test {
		
    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
        plotDatum.setConnected(false);
        plotDatum.setConnected(true);
        assertTrue(plotDatum.connected());
    }
}

// PlotDatum_6Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_6Test {
		
    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, false);
        plotDatum.setConnected(true);
        plotDatum.setConnected(false);
        assertFalse(plotDatum.connected());
    }
}

// PlotDatum_7Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_7Test {
		
    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
        plotDatum.setConnected(false);
        plotDatum.setConnected(true);
        plotDatum.setConnected(false);
        assertFalse(plotDatum.connected());
    }
}

// PlotDatum_8Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_8Test {
		
    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, false);
        plotDatum.setConnected(true);
        plotDatum.setConnected(false);
        plotDatum.setConnected(true);
        assertTrue(plotDatum.connected());
    }
}

// PlotDatum_9Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_9Test {
		
    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
        plotDatum.setConnected(false);
        plotDatum.setConnected(true);
        plotDatum.setConnected(false);
        plotDatum.setConnected(true);
        assertTrue(plotDatum.connected());
    }
}

// PlotDatum_10Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_10Test {
		
    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, false);
        plotDatum.setConnected(true);
        plotDatum.setConnected(false);
        plotDatum.setConnected(true);
        plotDatum.setConnected(false);
        plotDatum.setConnected(true);
        assertTrue(plotDatum.connected());
    }
}

// PlotDatum_11Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_11Test {
		
    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, true);
        plotDatum.setConnected(false);
        plotDatum.setConnected(true);
        plotDatum.setConnected(false);
        plotDatum.setConnected(true);
        plotDatum.setConnected(false);
        assertFalse(plotDatum.connected());
    }
}

// PlotDatum_12Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_12Test {
		
    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1.0, 2.0, false);
        plotDatum.setConnected(true);