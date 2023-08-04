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
     *  It tests the iterator method of the PlotRun class.
     */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        PlotDatum datum = new PlotDatum(1, 2, Color.RED);
        run.add(datum);
        Iterator iter = run.iterator();
        assertTrue(iter.hasNext());
        assertEquals(datum, iter.next());
        assertFalse(iter.hasNext());
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
     *  It tests the iterator method of the PlotRun class.
     */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        PlotDatum datum = new PlotDatum(1, 2, Color.RED);
        run.add(datum);
        Iterator iter = run.iterator();
        assertTrue(iter.hasNext());
        assertEquals(datum, iter.next());
        assertFalse(iter.hasNext());
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
     *  It tests the iterator method of the PlotRun class.
     */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        PlotDatum datum = new PlotDatum(1, 2, Color.RED);
        run.add(datum);
        Iterator iter = run.iterator();
        assertTrue(iter.hasNext());
        assertEquals(datum, iter.next());
        assertFalse(iter.hasNext());
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
     *  It tests the iterator method of the PlotRun class.
     */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        PlotDatum datum = new PlotDatum(1, 2, Color.RED);
        run.add(datum);
        Iterator iter = run.iterator();
        assertTrue(iter.hasNext());
        assertEquals(datum, iter.next());
        assertFalse(iter.hasNext());
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
        return data.iterator();
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
     *  It tests the iterator method of the PlotRun class.
     */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        PlotDatum datum = new PlotDatum(1, 2, Color.RED);
        run.add(datum);
        Iterator iter = run.iterator();
        assertTrue(iter.hasNext());
        assertEquals(datum, iter.next());
        assertFalse(iter.hasNext());
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
     *  It tests the iterator method of the PlotRun class.
     */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        PlotDatum datum = new PlotDatum(1, 2, Color.RED);
        run.add(datum);
        Iterator iter = run.iterator();
        assertTrue(iter.hasNext());
        assertEquals(datum, iter.next());
        assertFalse(iter.hasNext());
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
        return data.iterator();
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
     *  It tests the iterator method of the PlotRun class.
     */
    @Test
    void testIterator() {
        PlotRun run = new PlotRun();
        PlotDatum datum = new PlotDatum(1, 2, Color.RED);
        run.add(datum);
        Iterator iter = run.iterator();
        assertTrue(iter.hasNext());
        assertEquals(datum, iter.next());
        assertFalse(iter.hasNext());
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
     * @return An inter