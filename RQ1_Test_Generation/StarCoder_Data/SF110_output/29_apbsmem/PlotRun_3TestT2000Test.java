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
        run.add(new PlotDatum(1.0, 2.0, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(2.0, 3.0, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(3.0, 4.0, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(4.0, 5.0, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(5.0, 6.0, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(6.0, 7.0, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(7.0, 8.0, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(8.0, 9.0, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(9.0, 10.0, true, PlotSymbol.CIRCLE));
        run.add(new PlotDatum(10.0, 11.0, true, PlotSymbol.CIRCLE));
        Iterator it = run.iterator();
        assertTrue(it.hasNext());
        PlotDatum datum = (PlotDatum) it.next();
        assertEquals(1.0, datum.x);
        assertEquals(2.0, datum.y);
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(2.0, datum.x);
        assertEquals(3.0, datum.y);
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(3.0, datum.x);
        assertEquals(4.0, datum.y);
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(4.0, datum.x);
        assertEquals(5.0, datum.y);
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(5.0, datum.x);
        assertEquals(6.0, datum.y);
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(6.0, datum.x);
        assertEquals(7.0, datum.y);
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(7.0, datum.x);
        assertEquals(8.0, datum.y);
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(8.0, datum.x);
        assertEquals(9.0, datum.y);
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(9.0, datum.x);
        assertEquals(10.0, datum.y);
        assertTrue(it.hasNext());
        datum = (PlotDatum) it.next();
        assertEquals(10.0, datum.x);
        assertEquals(11.0, datum.y);
        assertFalse(it.hasNext());
    }
}
