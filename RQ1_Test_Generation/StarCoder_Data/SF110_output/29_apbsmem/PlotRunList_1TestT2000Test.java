// PlotRunList_1Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#get(int)} method.
*/
class PlotRunList_1Test {

    /**
    * Test method for {@link PlotRunList#get(int)}.
    */
    @Test
    void testGet() {
        PlotRunList runList = new PlotRunList();
        PlotRun run = new PlotRun();
        runList.add(run);
        assertEquals(run, runList.get(0));
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
* It contains ten unit test cases for the {@link PlotRunList#set(int, Object)} method.
*/
class PlotRunList_2Test {
		
    /**
    * Test method for {@link PlotRunList#set(int, Object)}.
    */
    @Test
    void testSet() {
        PlotRunList runList = new PlotRunList();
        PlotRun run = new PlotRun();
        runList.add(run);
        PlotRun run2 = new PlotRun();
        runList.set(0, run2);
        assertEquals(run2, runList.get(0));
    }
}

// PlotRunList_3Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#add(int, Object)} method.
*/
class PlotRunList_3Test {
		
    /**
    * Test method for {@link PlotRunList#add(int, Object)}.
    */
    @Test
    void testAdd() {
        PlotRunList runList = new PlotRunList();
        PlotRun run = new PlotRun();
        runList.add(0, run);
        assertEquals(run, runList.get(0));
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
* It contains ten unit test cases for the {@link PlotRunList#remove(int)} method.
*/
class PlotRunList_4Test {
		
    /**
    * Test method for {@link PlotRunList#remove(int)}.
    */
    @Test
    void testRemove() {
        PlotRunList runList = new PlotRunList();
        PlotRun run = new PlotRun();
        runList.add(run);
        runList.remove(0);
        assertEquals(0, runList.size());
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
* It contains ten unit test cases for the {@link PlotRunList#clear()} method.
*/
class PlotRunList_5Test {
		
    /**
    * Test method for {@link PlotRunList#clear()}.
    */
    @Test
    void testClear() {
        PlotRunList runList = new PlotRunList();
        PlotRun run = new PlotRun();
        runList.add(run);
        runList.clear();
        assertEquals(0, runList.size());
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
* It contains ten unit test cases for the {@link PlotRunList#iterator()} method.
*/
class PlotRunList_6Test {
		
    /**
    * Test method for {@link PlotRunList#iterator()}.
    */
    @Test
    void testIterator() {
        PlotRunList runList = new PlotRunList();
        PlotRun run = new PlotRun();
        runList.add(run);
        Iterator iter = runList.iterator();
        assertTrue(iter.hasNext());
        assertEquals(run, iter.next());
        assertFalse(iter.hasNext());
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
* It contains ten unit test cases for the {@link PlotRunList#clone()} method.
*/
class PlotRunList_7Test {
		
    /**
    * Test method for {@link PlotRunList#clone()}.
    */
    @Test
    void testClone() {
        PlotRunList runList = new PlotRunList();
        PlotRun run = new PlotRun();
        runList.add(run);
        PlotRunList clone = (PlotRunList) runList.clone();
        assertEquals(runList, clone);
    }
}

// PlotRunList_8Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#getMinX()} method.
*/
class PlotRunList_8Test {
		
    /**
    * Test method for {@link PlotRunList#getMinX()}.
    */
    @Test
    void testGetMinX() {
        PlotRunList runList = new PlotRunList();
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        runList.add(run);
        assertEquals(1, runList.getMinX());
    }
}

// PlotRunList_9Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#getMaxX()} method.
*/
class PlotRunList_9Test {
		
    /**
    * Test method for {@link PlotRunList#getMaxX()}.
    */
    @Test
    void testGetMaxX() {
        PlotRunList runList = new PlotRunList();
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        runList.add(run);
        assertEquals(2, runList.getMaxX());
    }
}

// PlotRunList_10Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#getMinY()} method.
*/
class PlotRunList_10Test {
		
    /**
    * Test method for {@link PlotRunList#getMinY()}.
    */
    @Test
    void testGetMinY() {
        PlotRunList runList = new PlotRunList();
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        runList.add(run);
        assertEquals(1, runList.getMinY());
    }
}

// PlotRunList_11Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRunList}.
* It contains ten unit test cases for the {@link PlotRunList#getMaxY()} method.
*/
class PlotRunList_11Test {
		
    /**
    * Test method for {@link PlotRunList#getMaxY()}.
    */
    @Test
    void testGetMaxY() {
        PlotRunList runList = new PlotRun