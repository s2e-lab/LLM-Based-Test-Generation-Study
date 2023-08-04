// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_3Test {

    /**
    * Test method for {@link PlotRunList#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        PlotRun run4 = new PlotRun();
        PlotRun run5 = new PlotRun();
        PlotRun run6 = new PlotRun();
        PlotRun run7 = new PlotRun();
        PlotRun run8 = new PlotRun();
        PlotRun run9 = new PlotRun();
        PlotRun run10 = new PlotRun();
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        runList.add(run4);
        runList.add(run5);
        runList.add(run6);
        runList.add(run7);
        runList.add(run8);
        runList.add(run9);
        runList.add(run10);
        Iterator it = runList.iterator();
        assertTrue(it.hasNext());
        assertEquals(run1, it.next());
        assertTrue(it.hasNext());
        assertEquals(run2, it.next());
        assertTrue(it.hasNext());
        assertEquals(run3, it.next());
        assertTrue(it.hasNext());
        assertEquals(run4, it.next());
        assertTrue(it.hasNext());
        assertEquals(run5, it.next());
        assertTrue(it.hasNext());
        assertEquals(run6, it.next());
        assertTrue(it.hasNext());
        assertEquals(run7, it.next());
        assertTrue(it.hasNext());
        assertEquals(run8, it.next());
        assertTrue(it.hasNext());
        assertEquals(run9, it.next());
        assertTrue(it.hasNext());
        assertEquals(run10, it.next());
        assertFalse(it.hasNext());
    }
}

// PlotRunList_2Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_2Test {
		
    /**
    * Test method for {@link PlotRunList#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        PlotRun run4 = new PlotRun();
        PlotRun run5 = new PlotRun();
        PlotRun run6 = new PlotRun();
        PlotRun run7 = new PlotRun();
        PlotRun run8 = new PlotRun();
        PlotRun run9 = new PlotRun();
        PlotRun run10 = new PlotRun();
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        runList.add(run4);
        runList.add(run5);
        runList.add(run6);
        runList.add(run7);
        runList.add(run8);
        runList.add(run9);
        runList.add(run10);
        Iterator it = runList.iterator();
        assertTrue(it.hasNext());
        assertEquals(run1, it.next());
        assertTrue(it.hasNext());
        assertEquals(run2, it.next());
        assertTrue(it.hasNext());
        assertEquals(run3, it.next());
        assertTrue(it.hasNext());
        assertEquals(run4, it.next());
        assertTrue(it.hasNext());
        assertEquals(run5, it.next());
        assertTrue(it.hasNext());
        assertEquals(run6, it.next());
        assertTrue(it.hasNext());
        assertEquals(run7, it.next());
        assertTrue(it.hasNext());
        assertEquals(run8, it.next());
        assertTrue(it.hasNext());
        assertEquals(run9, it.next());
        assertTrue(it.hasNext());
        assertEquals(run10, it.next());
        assertFalse(it.hasNext());
    }
}

// PlotRunList_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_1Test {
		
    /**
    * Test method for {@link PlotRunList#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        PlotRun run4 = new PlotRun();
        PlotRun run5 = new PlotRun();
        PlotRun run6 = new PlotRun();
        PlotRun run7 = new PlotRun();
        PlotRun run8 = new PlotRun();
        PlotRun run9 = new PlotRun();
        PlotRun run10 = new PlotRun();
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        runList.add(run4);
        runList.add(run5);
        runList.add(run6);
        runList.add(run7);
        runList.add(run8);
        runList.add(run9);
        runList.add(run10);
        Iterator it = runList.iterator();
        assertTrue(it.hasNext());
        assertEquals(run1, it.next());
        assertTrue(it.hasNext());
        assertEquals(run2, it.next());
        assertTrue(it.hasNext());
        assertEquals(run3, it.next());
        assertTrue(it.hasNext());
        assertEquals(run4, it.next());
        assertTrue(it.hasNext());
        assertEquals(run5, it.next());
        assertTrue(it.hasNext());
        assertEquals(run6, it.next());
        assertTrue(it.hasNext());
        assertEquals(run7, it.next());
        assertTrue(it.hasNext());
        assertEquals(run8, it.next());
        assertTrue(it.hasNext());
        assertEquals(run9, it.next());
        assertTrue(it.hasNext());
        assertEquals(run10, it.next());
        assertFalse(it.hasNext());
    }
}

// PlotRunList_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_0Test {
		
    /**
    * Test method for {@link PlotRunList#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        PlotRun run4 = new PlotRun();
        PlotRun run5 = new PlotRun();
        PlotRun run6 = new PlotRun();
        PlotRun run7 = new PlotRun();
        PlotRun run8 = new PlotRun();
        PlotRun run9 = new PlotRun();
        PlotRun run10 = new PlotRun();
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        runList.add(run4);
        runList.add(run5);
        runList.add(run6);
        runList.add(run7);
        runList.add(run8);
        runList.add(run9);
        runList.add(run10);
        Iterator it = runList.iterator();
        assertTrue(it.hasNext());
        assertEquals(run1, it.next());
        assertTrue(it.hasNext());
        assertEquals(run2, it.next());
        assertTrue(it.hasNext());
        assertEquals(run3, it.next());
        assertTrue(it.hasNext());
        assertEquals(run4, it.next());
        assertTrue(it.hasNext());
        assertEquals(run5, it.next());
        assertTrue(it.hasNext());
        assertEquals(run6, it.next());
        assertTrue(it.hasNext());
        assertEquals(run7, it.next());
        assertTrue(it.hasNext());
        assertEquals(run8, it.next());
        assertTrue(it.hasNext());
        assertEquals(run9, it.next());
        assertTrue(it.hasNext());
        assertEquals(run10, it.next());
        assertFalse(it.hasNext