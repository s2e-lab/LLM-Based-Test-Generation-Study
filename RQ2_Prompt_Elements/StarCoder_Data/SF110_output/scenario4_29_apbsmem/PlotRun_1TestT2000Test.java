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
        for (int i = 0; i < data.length; i++) {
            data[i] = new PlotDatum(i, i);
        }
        run.addAll(Arrays.asList(data));
        for (int i = 0; i < data.length; i++) {
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
        for (int i = 0; i < data.length; i++) {
            data[i] = new PlotDatum(i, i);
        }
        run.addAll(Arrays.asList(data));
        for (int i = 0; i < data.length; i++) {
            data[i].setX(i + 1);
            data[i].setY(i + 1);
            assertEquals(data[i], run.set(i, data[i]));
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
        for (int i = 0; i < data.length; i++) {
            data[i] = new PlotDatum(i, i);
        }
        run.addAll(Arrays.asList(data));
        for (int i = 0; i < data.length; i++) {
            data[i].setX(i + 1);
            data[i].setY(i + 1);
            run.add(i, data[i]);
            assertEquals(data[i], run.get(i));
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
        for (int i = 0; i < data.length; i++) {
            data[i] = new PlotDatum(i, i);
        }
        run.addAll(Arrays.asList(data));
        for (int i = 0; i < data.length; i++) {
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
        for (int i = 0; i < data.length; i++) {
            data[i] = new PlotDatum(i, i);
        }
        run.addAll(Arrays.asList(data));
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
        for (int i = 0; i < data.length; i++) {
            data[i] = new PlotDatum(i, i);
        }
        run.addAll(Arrays.asList(data));
        Iterator it = run.iterator();
        for (int i = 0; i < data.length; i++) {
            assertTrue(it.hasNext());
            assertEquals(data[i], it.next());
        }
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
        for (int i = 0; i < data.length; i++) {
            data[i] = new PlotDatum(i, i);
        }
        run.addAll(Arrays.asList(data));
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
        for (int i = 0; i < data.length; i++) {
            data[i] = new PlotDatum(i, i);
        }
        run.addAll(Arrays.asList(data));
        assertEquals(0, run.getMinX(), 0.000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000