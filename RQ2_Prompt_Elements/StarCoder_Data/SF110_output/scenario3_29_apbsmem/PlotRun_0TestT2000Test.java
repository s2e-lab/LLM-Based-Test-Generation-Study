// PlotRun_0Test.java
package jahuwaldt.plot;

import java.awt.Color;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PlotRun}.
* It contains ten unit test cases for the {@link PlotRun#size()} method.
*/
class PlotRun_0Test {

    /**
     *  Test case for {@link PlotRun#size()} method.
     *  It tests the size of a run with no data.
     */
    @Test
    void testSize_0() {
        PlotRun run = new PlotRun();
        assertEquals(0, run.size());
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
* It contains ten unit test cases for the {@link PlotRun#size()} method.
*/
class PlotRun_1Test {
		
    /**
     *  Test case for {@link PlotRun#size()} method.
     *  It tests the size of a run with one data.
     */
    @Test
    void testSize_1() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        assertEquals(1, run.size());
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
* It contains ten unit test cases for the {@link PlotRun#size()} method.
*/
class PlotRun_2Test {
		
    /**
     *  Test case for {@link PlotRun#size()} method.
     *  It tests the size of a run with two data.
     */
    @Test
    void testSize_2() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        assertEquals(2, run.size());
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
* It contains ten unit test cases for the {@link PlotRun#size()} method.
*/
class PlotRun_3Test {
		
    /**
     *  Test case for {@link PlotRun#size()} method.
     *  It tests the size of a run with three data.
     */
    @Test
    void testSize_3() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        run.add(new PlotDatum(3, 3));
        assertEquals(3, run.size());
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
* It contains ten unit test cases for the {@link PlotRun#size()} method.
*/
class PlotRun_4Test {
		
    /**
     *  Test case for {@link PlotRun#size()} method.
     *  It tests the size of a run with four data.
     */
    @Test
    void testSize_4() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        run.add(new PlotDatum(3, 3));
        run.add(new PlotDatum(4, 4));
        assertEquals(4, run.size());
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
* It contains ten unit test cases for the {@link PlotRun#size()} method.
*/
class PlotRun_5Test {
		
    /**
     *  Test case for {@link PlotRun#size()} method.
     *  It tests the size of a run with five data.
     */
    @Test
    void testSize_5() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        run.add(new PlotDatum(3, 3));
        run.add(new PlotDatum(4, 4));
        run.add(new PlotDatum(5, 5));
        assertEquals(5, run.size());
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
* It contains ten unit test cases for the {@link PlotRun#size()} method.
*/
class PlotRun_6Test {
		
    /**
     *  Test case for {@link PlotRun#size()} method.
     *  It tests the size of a run with six data.
     */
    @Test
    void testSize_6() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        run.add(new PlotDatum(3, 3));
        run.add(new PlotDatum(4, 4));
        run.add(new PlotDatum(5, 5));
        run.add(new PlotDatum(6, 6));
        assertEquals(6, run.size());
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
* It contains ten unit test cases for the {@link PlotRun#size()} method.
*/
class PlotRun_7Test {
		
    /**
     *  Test case for {@link PlotRun#size()} method.
     *  It tests the size of a run with seven data.
     */
    @Test
    void testSize_7() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        run.add(new PlotDatum(3, 3));
        run.add(new PlotDatum(4, 4));
        run.add(new PlotDatum(5, 5));
        run.add(new PlotDatum(6, 6));
        run.add(new PlotDatum(7, 7));
        assertEquals(7, run.size());
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
* It contains ten unit test cases for the {@link PlotRun#size()} method.
*/
class PlotRun_8Test {
		
    /**
     *  Test case for {@link PlotRun#size()} method.
     *  It tests the size of a run with eight data.
     */
    @Test
    void testSize_8() {
        PlotRun run = new PlotRun();
        run.add(new PlotDatum(1, 1));
        run.add(new PlotDatum(2, 2));
        run.add(new PlotDatum(3, 3));
        run.add(new PlotDatum(4, 4));
        run.add(new PlotDatum(5, 5));
        run.add(new PlotDatum(6, 6));
        run.add(new PlotDatum(7, 7));
        run.add(new PlotDatum(8, 8));
        assertEquals(8, run.size());
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
* It contains ten