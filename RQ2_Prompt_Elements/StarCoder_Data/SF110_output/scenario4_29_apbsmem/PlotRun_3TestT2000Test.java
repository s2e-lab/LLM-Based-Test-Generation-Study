// PlotRun_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#iterator()} method.
*/
class PlotRun_3Test {

    /**
    * Test method for {@link PlotRun#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        run.add(new PlotDatum(2.0, 3.0));
        run.add(new PlotDatum(3.0, 4.0));
        Iterator it = run.iterator();
        assertTrue(it.hasNext());
        PlotDatum datum = (PlotDatum) it.next();
        assertEquals(1.0, datum.getX());
        assertEquals(2.0, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(2.0, datum.getX());
        assertEquals(3.0, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(3.0, datum.getX());
        assertEquals(4.0, datum.getY());
        assertFalse(it.hasNext());
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
* It contains ten unit test cases for the {@link PlotRun#iterator()} method.
*/
class PlotRun_4Test {
		
    /**
    * Test method for {@link PlotRun#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        run.add(new PlotDatum(2.0, 3.0));
        run.add(new PlotDatum(3.0, 4.0));
        Iterator it = run.iterator();
        assertTrue(it.hasNext());
        PlotDatum datum = (PlotDatum) it.next();
        assertEquals(1.0, datum.getX());
        assertEquals(2.0, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(2.0, datum.getX());
        assertEquals(3.0, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(3.0, datum.getX());
        assertEquals(4.0, datum.getY());
        assertFalse(it.hasNext());
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
* It contains ten unit test cases for the {@link PlotRun#iterator()} method.
*/
class PlotRun_5Test {
		
    /**
    * Test method for {@link PlotRun#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        run.add(new PlotDatum(2.0, 3.0));
        run.add(new PlotDatum(3.0, 4.0));
        Iterator it = run.iterator();
        assertTrue(it.hasNext());
        PlotDatum datum = (PlotDatum) it.next();
        assertEquals(1.0, datum.getX());
        assertEquals(2.0, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(2.0, datum.getX());
        assertEquals(3.0, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(3.0, datum.getX());
        assertEquals(4.0, datum.getY());
        assertFalse(it.hasNext());
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
        run.add(new PlotDatum(1.0, 2.0));
        run.add(new PlotDatum(2.0, 3.0));
        run.add(new PlotDatum(3.0, 4.0));
        Iterator it = run.iterator();
        assertTrue(it.hasNext());
        PlotDatum datum = (PlotDatum) it.next();
        assertEquals(1.0, datum.getX());
        assertEquals(2.0, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(2.0, datum.getX());
        assertEquals(3.0, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(3.0, datum.getX());
        assertEquals(4.0, datum.getY());
        assertFalse(it.hasNext());
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
* It contains ten unit test cases for the {@link PlotRun#iterator()} method.
*/
class PlotRun_7Test {
		
    /**
    * Test method for {@link PlotRun#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        run.add(new PlotDatum(2.0, 3.0));
        run.add(new PlotDatum(3.0, 4.0));
        Iterator it = run.iterator();
        assertTrue(it.hasNext());
        PlotDatum datum = (PlotDatum) it.next();
        assertEquals(1.0, datum.getX());
        assertEquals(2.0, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(2.0, datum.getX());
        assertEquals(3.0, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(3.0, datum.getX());
        assertEquals(4.0, datum.getY());
        assertFalse(it.hasNext());
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
* It contains ten unit test cases for the {@link PlotRun#iterator()} method.
*/
class PlotRun_8Test {
		
    /**
    * Test method for {@link PlotRun#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1.0, 2.0));
        run.add(new PlotDatum(2.0, 3.0));
        run.add(new PlotDatum(3.0, 4.0));
        Iterator it = run.iterator();
        assertTrue(it.hasNext());
        PlotDatum datum = (PlotDatum) it.next();
        assertEquals(1.0, datum.getX());
        assertEquals(2.0, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(2.0, datum.getX());
        assertEquals(3.0, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(3.0, datum.getX());
        assertEquals(4.0, datum.getY());
        assertFalse(it.hasNext());
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
* It contains ten unit test cases for the {@link PlotRun#iterator()} method.
*/
class PlotRun_9Test {
		
    /**
    * Test method for {@