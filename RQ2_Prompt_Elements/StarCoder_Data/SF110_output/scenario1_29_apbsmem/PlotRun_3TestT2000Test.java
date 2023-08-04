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
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        run.add(new PlotDatum(3, 3));
        run.add(new PlotDatum(4, 4));
        run.add(new PlotDatum(5, 5));
        run.add(new PlotDatum(6, 6));
        run.add(new PlotDatum(7, 7));
        run.add(new PlotDatum(8, 8));
        run.add(new PlotDatum(9, 9));
        run.add(new PlotDatum(10, 10));
        Iterator it = run.iterator();
        assertTrue(it.hasNext());
        PlotDatum datum = (PlotDatum) it.next();
        assertEquals(1, datum.getX());
        assertEquals(1, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(2, datum.getX());
        assertEquals(2, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(3, datum.getX());
        assertEquals(3, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(4, datum.getX());
        assertEquals(4, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(5, datum.getX());
        assertEquals(5, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(6, datum.getX());
        assertEquals(6, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(7, datum.getX());
        assertEquals(7, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(8, datum.getX());
        assertEquals(8, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(9, datum.getX());
        assertEquals(9, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(10, datum.getX());
        assertEquals(10, datum.getY());
        assertFalse(it.hasNext());
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
* It contains ten unit test cases for the {@link PlotRun#iterator()} method.
*/
class PlotRun_2Test {
		
    /**
    * Test method for {@link PlotRun#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        run.add(new PlotDatum(3, 3));
        run.add(new PlotDatum(4, 4));
        run.add(new PlotDatum(5, 5));
        run.add(new PlotDatum(6, 6));
        run.add(new PlotDatum(7, 7));
        run.add(new PlotDatum(8, 8));
        run.add(new PlotDatum(9, 9));
        run.add(new PlotDatum(10, 10));
        Iterator it = run.iterator();
        assertTrue(it.hasNext());
        PlotDatum datum = (PlotDatum) it.next();
        assertEquals(1, datum.getX());
        assertEquals(1, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(2, datum.getX());
        assertEquals(2, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(3, datum.getX());
        assertEquals(3, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(4, datum.getX());
        assertEquals(4, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(5, datum.getX());
        assertEquals(5, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(6, datum.getX());
        assertEquals(6, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(7, datum.getX());
        assertEquals(7, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(8, datum.getX());
        assertEquals(8, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(9, datum.getX());
        assertEquals(9, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(10, datum.getX());
        assertEquals(10, datum.getY());
        assertFalse(it.hasNext());
    }
}

// PlotRun_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#iterator()} method.
*/
class PlotRun_1Test {
		
    /**
    * Test method for {@link PlotRun#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        run.add(new PlotDatum(3, 3));
        run.add(new PlotDatum(4, 4));
        run.add(new PlotDatum(5, 5));
        run.add(new PlotDatum(6, 6));
        run.add(new PlotDatum(7, 7));
        run.add(new PlotDatum(8, 8));
        run.add(new PlotDatum(9, 9));
        run.add(new PlotDatum(10, 10));
        Iterator it = run.iterator();
        assertTrue(it.hasNext());
        PlotDatum datum = (PlotDatum) it.next();
        assertEquals(1, datum.getX());
        assertEquals(1, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(2, datum.getX());
        assertEquals(2, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(3, datum.getX());
        assertEquals(3, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(4, datum.getX());
        assertEquals(4, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(5, datum.getX());
        assertEquals(5, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(6, datum.getX());
        assertEquals(6, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(7, datum.getX());
        assertEquals(7, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(8, datum.getX());
        assertEquals(8, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(9, datum.getX());
        assertEquals(9, datum.getY());
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(10, datum.getX());
        assertEquals(10, datum.getY());
        assertFalse(it.hasNext());
    }
}

// PlotRun_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#iterator()} method.
*/
class PlotRun_0Test {
		
    /**
    * Test method for {@link PlotRun#iterator()}.