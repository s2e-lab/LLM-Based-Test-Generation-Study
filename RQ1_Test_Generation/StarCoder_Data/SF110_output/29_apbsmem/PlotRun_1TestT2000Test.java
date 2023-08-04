// PlotRun_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#get(int)} method.
*/
class PlotRun_1Test {

    /**
    * Test method for {@link PlotRun#get(int)}.
    */
    @Test
    void testGet() {
        PlotRun run = new PlotRun();
        PlotDatum[] data = new PlotDatum[10];
        for (int i = 0; i < 10; ++i) {
            data[i] = new PlotDatum(i, i, false, PlotSymbol.CIRCLE);
            run.add(data[i]);
        }
        for (int i = 0; i < 10; ++i) {
            assertEquals(data[i], run.get(i));
        }
    }
}

// PlotRun_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#set(int, Object)} method.
*/
class PlotRun_2Test {
		
    /**
    * Test method for {@link PlotRun#set(int, Object)}.
    */
    @Test
    void testSet() {
        PlotRun run = new PlotRun();
        PlotDatum[] data = new PlotDatum[10];
        for (int i = 0; i < 10; ++i) {
            data[i] = new PlotDatum(i, i, false, PlotSymbol.CIRCLE);
            run.add(data[i]);
        }
        for (int i = 0; i < 10; ++i) {
            PlotDatum datum = new PlotDatum(i, i, false, PlotSymbol.SQUARE);
            run.set(i, datum);
            assertEquals(datum, run.get(i));
        }
    }
}

// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#add(int, Object)} method.
*/
class PlotRun_3Test {
		
    /**
    * Test method for {@link PlotRun#add(int, Object)}.
    */
    @Test
    void testAdd() {
        PlotRun run = new PlotRun();
        PlotDatum[] data = new PlotDatum[10];
        for (int i = 0; i < 10; ++i) {
            data[i] = new PlotDatum(i, i, false, PlotSymbol.CIRCLE);
            run.add(data[i]);
        }
        for (int i = 0; i < 10; ++i) {
            PlotDatum datum = new PlotDatum(i, i, false, PlotSymbol.SQUARE);
            run.add(i, datum);
            assertEquals(datum, run.get(i));
        }
    }
}

// PlotRun_4Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#remove(int)} method.
*/
class PlotRun_4Test {
		
    /**
    * Test method for {@link PlotRun#remove(int)}.
    */
    @Test
    void testRemove() {
        PlotRun run = new PlotRun();
        PlotDatum[] data = new PlotDatum[10];
        for (int i = 0; i < 10; ++i) {
            data[i] = new PlotDatum(i, i, false, PlotSymbol.CIRCLE);
            run.add(data[i]);
        }
        for (int i = 0; i < 10; ++i) {
            assertEquals(data[i], run.remove(i));
        }
    }
}

// PlotRun_5Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#clear()} method.
*/
class PlotRun_5Test {
		
    /**
    * Test method for {@link PlotRun#clear()}.
    */
    @Test
    void testClear() {
        PlotRun run = new PlotRun();
        PlotDatum[] data = new PlotDatum[10];
        for (int i = 0; i < 10; ++i) {
            data[i] = new PlotDatum(i, i, false, PlotSymbol.CIRCLE);
            run.add(data[i]);
        }
        run.clear();
        assertEquals(0, run.size());
    }
}

// PlotRun_6Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#iterator()} method.
*/
class PlotRun_6Test {
		
    /**
    * Test method for {@link PlotRun#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        PlotDatum[] data = new PlotDatum[10];
        for (int i = 0; i < 10; ++i) {
            data[i] = new PlotDatum(i, i, false, PlotSymbol.CIRCLE);
            run.add(data[i]);
        }
        Iterator iter = run.iterator();
        for (int i = 0; i < 10; ++i) {
            assertEquals(data[i], iter.next());
        }
    }
}

// PlotRun_7Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#clone()} method.
*/
class PlotRun_7Test {
		
    /**
    * Test method for {@link PlotRun#clone()}.
    */
    @Test
    void testClone() {
        PlotRun run = new PlotRun();
        PlotDatum[] data = new PlotDatum[10];
        for (int i = 0; i < 10; ++i) {
            data[i] = new PlotDatum(i, i, false, PlotSymbol.CIRCLE);
            run.add(data[i]);
        }
        PlotRun clone = (PlotRun) run.clone();
        assertEquals(run, clone);
    }
}

// PlotRun_8Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#getMinX()} method.
*/
class PlotRun_8Test {
		
    /**
    * Test method for {@link PlotRun#getMinX()}.
    */
    @Test
    void testGetMinX() {
        PlotRun run = new PlotRun();
        PlotDatum[] data = new PlotDatum[10];
        for (int i = 0; i < 10; ++i) {
            data[i] = new PlotDatum(i, i, false, PlotSymbol.CIRCLE);
            run.add(data[i]);
        }
        assertEquals(0, run.getMinX());
    }
}

// PlotRun_9Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#getMaxX()} method.
*/
class PlotRun_9Test {
		
    /**
    * Test method for {@link PlotRun#getMaxX()}.
    */
    @Test
    void testGetMaxX() {
        PlotRun run = new PlotRun();
        PlotDatum[] data = new PlotDatum[10];
        for