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
     *  Test case for the {@link PlotRun#iterator()} method.
     *  It tests the iterator for a run with 10 elements.
     */
    @Test
    void testIterator_10() {
        PlotRun run = new PlotRun();
        for (int i = 0; i < 10; i++) {
            run.add(new PlotDatum(i, i));
        }
        Iterator it = run.iterator();
        for (int i = 0; i < 10; i++) {
            assertTrue(it.hasNext());
            PlotDatum datum = (PlotDatum) it.next();
            assertEquals(i, datum.getX());
            assertEquals(i, datum.getY());
        }
        assertFalse(it.hasNext());
    }

    /**
     *  Test case for the {@link PlotRun#iterator()} method.
     *  It tests the iterator for a run with 0 elements.
     */
    @Test
    void testIterator_0() {
        PlotRun run = new PlotRun();
        Iterator it = run.iterator();
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
     *  Test case for the {@link PlotRun#iterator()} method.
     *  It tests the iterator for a run with 10 elements.
     */
    @Test
    void testIterator_10() {
        PlotRun run = new PlotRun();
        for (int i = 0; i < 10; i++) {
            run.add(new PlotDatum(i, i));
        }
        Iterator it = run.iterator();
        for (int i = 0; i < 10; i++) {
            assertTrue(it.hasNext());
            PlotDatum datum = (PlotDatum) it.next();
            assertEquals(i, datum.getX());
            assertEquals(i, datum.getY());
        }
        assertFalse(it.hasNext());
    }

    /**
     *  Test case for the {@link PlotRun#iterator()} method.
     *  It tests the iterator for a run with 0 elements.
     */
    @Test
    void testIterator_0() {
        PlotRun run = new PlotRun();
        Iterator it = run.iterator();
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
     *  Test case for the {@link PlotRun#iterator()} method.
     *  It tests the iterator for a run with 10 elements.
     */
    @Test
    void testIterator_10() {
        PlotRun run = new PlotRun();
        for (int i = 0; i < 10; i++) {
            run.add(new PlotDatum(i, i));
        }
        Iterator it = run.iterator();
        for (int i = 0; i < 10; i++) {
            assertTrue(it.hasNext());
            PlotDatum datum = (PlotDatum) it.next();
            assertEquals(i, datum.getX());
            assertEquals(i, datum.getY());
        }
        assertFalse(it.hasNext());
    }

    /**
     *  Test case for the {@link PlotRun#iterator()} method.
     *  It tests the iterator for a run with 0 elements.
     */
    @Test
    void testIterator_0() {
        PlotRun run = new PlotRun();
        Iterator it = run.iterator();
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
     *  Test case for the {@link PlotRun#iterator()} method.
     *  It tests the iterator for a run with 10 elements.
     */
    @Test
    void testIterator_10() {
        PlotRun run = new PlotRun();
        for (int i = 0; i < 10; i++) {
            run.add(new PlotDatum(i, i));
        }
        Iterator it = run.iterator();
        for (int i = 0; i < 10; i++) {
            assertTrue(it.hasNext());
            PlotDatum datum = (PlotDatum) it.next();
            assertEquals(i, datum.getX());
            assertEquals(i, datum.getY());
        }
        assertFalse(it.hasNext());
    }

    /**
     *  Test case for the {@link PlotRun#iterator()} method.
     *  It tests the iterator for a run with 0 elements.
     */
    @Test
    void testIterator_0() {
        PlotRun run = new PlotRun();
        Iterator it = run.iterator();
        assertFalse(it.hasNext());
    }
}

// PlotRun.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single run of data in a plot.
 *      A run is an array or list of PlotDatum objects.
 *  </p>
 *
 *  <p>  Modified by:  <NAME>  </p>
 *
 * @author <NAME>   Date:  September 13, 2000
 * @version December 12, 2000
 */
public class PlotRun extends AbstractList implements Cloneable, java.io.Serializable {

    /**
     *  Return an enumeration of all the plot data elements in
     *  this run.
     *
     * @return An interation of all the PlotDatum objects in this run.
     */
    public Iterator iterator() {
        return new PlotRunIterator();
    }

    /**
     *  This class implements the iterator for a PlotRun.
     */
    private class PlotRunIterator implements Iterator {

        /**
         *  The index of the next element to return.
         */
        private int nextIndex = 0;

        /**
         *  Return true if there are more elements to return.
         *
         * @return True if there are more elements to return.
         */
        public boolean hasNext() {
            return nextIndex < size();
        }

        /**
         *  Return the next element in the iteration.
         *
         * @return The next element in the iteration.
         */
        public Object next() {
            return get(nextIndex++);
        }

        /**
         *  Remove the current element from the iteration.
         */
        public void remove() {
            throw new UnsupportedOperationException();
        }
    }
}

// PlotRun.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;

/**
 *  <p> This class represents a single run of data in a plot.
 *      A run is an array or list of PlotDatum objects.
 *  </p>
 *
 *  <p>  Modified by:  <NAME>  </p>
 *
 * @author <NAME>   Date:  September 13, 2000
 * @version December 12, 2000
 */
public class PlotRun extends AbstractList implements Cloneable, java.io.Serializable {

    /**
     *  Return an enumeration of all the plot data elements in
     *  this run.
     *
     * @return An interation of all the PlotDatum objects in this run.
     */
    public Iterator iterator() {
        return new PlotRunIterator();
    }

    /**
     *  This class implements the iterator for a PlotRun.
     */
    private class PlotRunIterator implements Iterator {

        /**
         *  The index of the next element to return.
         */
        private int nextIndex = 0;

        /**
         *  Return true if there are more elements to return.
         *
         * @return True if there are more elements to return.
         */
        public boolean hasNext() {
            return nextIndex < size();
        }

        /**
         *  Return the next element in the iteration.
         *
         * @return The next element in the iteration.
         */
        public Object next() {
            return get(nextIndex++);
        }

        /**
        