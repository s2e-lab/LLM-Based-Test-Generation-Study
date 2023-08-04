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
        PlotDatum plotDatum = new PlotDatum(1, 2, true);
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
        PlotDatum plotDatum = new PlotDatum(1, 2, false);
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
        PlotDatum plotDatum = new PlotDatum(1, 2, true, null);
        assertTrue(plotDatum.connected());
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
        PlotDatum plotDatum = new PlotDatum(1, 2, false, null);
        assertFalse(plotDatum.connected());
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
        PlotDatum plotDatum = new PlotDatum(1, 2, true, new PlotSymbol());
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
        PlotDatum plotDatum = new PlotDatum(1, 2, false, new PlotSymbol());
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
        PlotDatum plotDatum = new PlotDatum(1, 2, true, new PlotSymbol(Color.black));
        assertTrue(plotDatum.connected());
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
        PlotDatum plotDatum = new PlotDatum(1, 2, false, new PlotSymbol(Color.black));
        assertFalse(plotDatum.connected());
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
        PlotDatum plotDatum = new PlotDatum(1, 2, true, new PlotSymbol(Color.black, 1));
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
        PlotDatum plotDatum = new PlotDatum(1, 2, false, new PlotSymbol(Color.black, 1));
        assertFalse(plotDatum.connected());
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
        PlotDatum plotDatum = new PlotDatum(1, 2, true, new PlotSymbol(Color.black, 1, 1));
        assertTrue(plotDatum.connected());
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
        PlotDatum plotDatum = new PlotDatum(1, 2, false, new PlotSymbol(Color.black, 1, 1));
        assertFalse(plotDatum.connected());
    }
}

// PlotDatum_13Test.java
package jahuwaldt.plot;

import java.awt.Color;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotDatum}.
* It contains ten unit test cases for the {@link PlotDatum#connected()} method.
*/
class PlotDatum_13Test {
		
    /**
    * Test method for {@link PlotDatum#connected()}.
    */
    @Test
    void testConnected() {
        PlotDatum plotDatum = new PlotDatum(1, 2, true, new PlotSymbol(Color.black, 1, 1, 1));
        assertTrue(plotDatum.connected());
    }
}

// PlotDatum_14Test.java
package jahuwaldt.plot;

import java.awt.Color;
