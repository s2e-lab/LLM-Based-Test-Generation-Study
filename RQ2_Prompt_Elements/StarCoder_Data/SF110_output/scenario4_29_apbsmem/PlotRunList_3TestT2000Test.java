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
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        Iterator it = runList.iterator();
        assertTrue(it.hasNext());
        assertEquals(run1, it.next());
        assertTrue(it.hasNext());
        assertEquals(run2, it.next());
        assertTrue(it.hasNext());
        assertEquals(run3, it.next());
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
* It contains ten unit test cases for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunList_2Test {
		
    /**
    * Test method for {@link PlotRunList#remove(int)}.
    */
    @Test
    void testRemove() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        assertEquals(run3, runList.remove(2));
        assertEquals(2, runList.size());
        assertEquals(run1, runList.get(0));
        assertEquals(run2, runList.get(1));
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
* It contains ten unit test cases for the {@link PlotRunList#add(int, Object)} method.
*/
class PlotRunList_1Test {
		
    /**
    * Test method for {@link PlotRunList#add(int, Object)}.
    */
    @Test
    void testAdd() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        assertEquals(3, runList.size());
        assertEquals(run1, runList.get(0));
        assertEquals(run2, runList.get(1));
        assertEquals(run3, runList.get(2));
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
* It contains ten unit test cases for the {@link PlotRunList#clear()} method.
*/
class PlotRunList_0Test {
		
    /**
    * Test method for {@link PlotRunList#clear()}.
    */
    @Test
    void testClear() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        runList.clear();
        assertEquals(0, runList.size());
    }
}

// PlotRunList_4Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#set(int, Object)} method.
*/
class PlotRunList_4Test {
		
    /**
    * Test method for {@link PlotRunList#set(int, Object)}.
    */
    @Test
    void testSet() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        PlotRun run4 = new PlotRun();
        assertEquals(run3, runList.set(2, run4));
        assertEquals(3, runList.size());
        assertEquals(run1, runList.get(0));
        assertEquals(run2, runList.get(1));
        assertEquals(run4, runList.get(2));
    }
}

// PlotRunList_5Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#size()} method.
*/
class PlotRunList_5Test {
		
    /**
    * Test method for {@link PlotRunList#size()}.
    */
    @Test
    void testSize() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        assertEquals(3, runList.size());
    }
}

// PlotRunList_6Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#get(int)} method.
*/
class PlotRunList_6Test {
		
    /**
    * Test method for {@link PlotRunList#get(int)}.
    */
    @Test
    void testGet() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        assertEquals(run2, runList.get(1));
    }
}

// PlotRunList_7Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#getMinX()} method.
*/
class PlotRunList_7Test {
		
    /**
    * Test method for {@link PlotRunList#getMinX()}.
    */
    @Test
    void testGetMinX() {
        PlotRunList runList = new PlotRunList();
        PlotRun run1 = new PlotRun();
        PlotRun run2 = new PlotRun();
        PlotRun run3 = new PlotRun();
        run1.add(new PlotDatum(1, 1));
        run1.add(new PlotDatum(2, 2));
        run1.add(new PlotDatum(3, 3));
        run2.add(new PlotDatum(1, 1));
        run2.add(new PlotDatum(2, 2));
        run2.add(new PlotDatum(3, 3));
        run3.add(new PlotDatum(1, 1));
        run3.add(new PlotDatum(2, 2));
        run3.add(new PlotDatum(3, 3));
        runList.add(run1);
        runList.add(run2);
        runList.add(run3);
        assertEquals(1, runList.getMinX());
    }
}

// PlotRunList_8