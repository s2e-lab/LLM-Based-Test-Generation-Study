// MapTest1.java
package src;

import java.util.HashMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Map}.
* It contains ten unit test cases for the {@link Map#isNeighbor(String, String)} method.
*/
class MapTest1 {

    /**
     * Test case 1.
     * The origin and destination fiefdoms are neighbors.
     */
    @Test
    void testIsNeighbor1() {
        HashMap<String, Fiefdoms> map = new HashMap<>();
        Fiefdoms fiefdom1 = new Fiefdoms("fiefdom1", "fiefdom2");
        Fiefdoms fiefdom2 = new Fiefdoms("fiefdom2", "fiefdom1");
        map.put("fiefdom1", fiefdom1);
        map.put("fiefdom2", fiefdom2);
        Map.map = map;
        assertEquals(0, Map.isNeighbor("fiefdom1", "fiefdom2"));
    }
    
    /**
     * Test case 2.
     * The origin and destination fiefdoms are neighbors.
     */
    @Test
    void testIsNeighbor2() {
        HashMap<String, Fiefdoms> map = new HashMap<>();
        Fiefdoms fiefdom1 = new Fiefdoms("fiefdom1", "fiefdom2");
        Fiefdoms fiefdom2 = new Fiefdoms("fiefdom2", "fiefdom1");
        map.put("fiefdom1", fiefdom1);
        map.put("fiefdom2", fiefdom2);
        Map.map = map;
        assertEquals(0, Map.isNeighbor("fiefdom2", "fiefdom1"));
    }
    
    /**
     * Test case 3.
     * The origin and destination fiefdoms are neighbors.
     */
    @Test
    void testIsNeighbor3() {
        HashMap<String, Fiefdoms> map = new HashMap<>();
        Fiefdoms fiefdom1 = new Fiefdoms("fiefdom1", "fiefdom2");
        Fiefdoms fiefdom2 = new Fiefdoms("fiefdom2", "fiefdom1");
        map.put("fiefdom1", fiefdom1);
        map.put("fiefdom2", fiefdom2);
        Map.map = map;
        assertEquals(0, Map.isNeighbor("fiefdom1", "fiefdom2"));
    }
    
    /**
     * Test case 4.
     * The origin and destination fiefdoms are neighbors.
     */
    @Test
    void testIsNeighbor4() {
        HashMap<String, Fiefdoms> map = new HashMap<>();
        Fiefdoms fiefdom1 = new Fiefdoms("fiefdom1", "fiefdom2");
        Fiefdoms fiefdom2 = new Fiefdoms("fiefdom2", "fiefdom1");
        map.put("fiefdom1", fiefdom1);
        map.put("fiefdom2", fiefdom2);
        Map.map = map;
        assertEquals(0, Map.isNeighbor("fiefdom2", "fiefdom1"));
    }
    
    /**
     * Test case 5.
     * The origin and destination fiefdoms are neighbors.
     */
    @Test
    void testIsNeighbor5() {
        HashMap<String, Fiefdoms> map = new HashMap<>();
        Fiefdoms fiefdom1 = new Fiefdoms("fiefdom1", "fiefdom2");
        Fiefdoms fiefdom2 = new Fiefdoms("fiefdom2", "fiefdom1");
        map.put("fiefdom1", fiefdom1);
        map.put("fiefdom2", fiefdom2);
        Map.map = map;
        assertEquals(0, Map.isNeighbor("fiefdom1", "fiefdom2"));
    }
    
    /**
     * Test case 6.
     * The origin and destination fiefdoms are neighbors.
     */
    @Test
    void testIsNeighbor6() {
        HashMap<String, Fiefdoms> map = new HashMap<>();
        Fiefdoms fiefdom1 = new Fiefdoms("fiefdom1", "fiefdom2");
        Fiefdoms fiefdom2 = new Fiefdoms("fiefdom2", "fiefdom1");
        map.put("fiefdom1", fiefdom1);
        map.put("fiefdom2", fiefdom2);
        Map.map = map;
        assertEquals(0, Map.isNeighbor("fiefdom2", "fiefdom1"));
    }
    
    /**
     * Test case 7.
     * The origin and destination fiefdoms are neighbors.
     */
    @Test
    void testIsNeighbor7() {
        HashMap<String, Fiefdoms> map = new HashMap<>();
        Fiefdoms fiefdom1 = new Fiefdoms("fiefdom1", "fiefdom2");
        Fiefdoms fiefdom2 = new Fiefdoms("fiefdom2", "fiefdom1");
        map.put("fiefdom1", fiefdom1);
        map.put("fiefdom2", fiefdom2);
        Map.map = map;
        assertEquals(0, Map.isNeighbor("fiefdom1", "fiefdom2"));
    }
    
    /**
     * Test case 8.
     * The origin and destination fiefdoms are neighbors.
     */
    @Test
    void testIsNeighbor8() {
        HashMap<String, Fiefdoms> map = new HashMap<>();
        Fiefdoms fiefdom1 = new Fiefdoms("fiefdom1", "fiefdom2");
        Fiefdoms fiefdom2 = new Fiefdoms("fiefdom2", "fiefdom1");
        map.put("fiefdom1", fiefdom1);
        map.put("fiefdom2", fiefdom2);
        Map.map = map;
        assertEquals(0, Map.isNeighbor("fiefdom2", "fiefdom1"));
    }
    
    /**
     * Test case 9.
     * The origin and destination fiefdoms are neighbors.
     */
    @Test
    void testIsNeighbor9() {
        HashMap<String, Fiefdoms> map = new HashMap<>();
        Fiefdoms fiefdom1 = new Fiefdoms("fiefdom1", "fiefdom2");
        Fiefdoms fiefdom2 = new Fiefdoms("fiefdom2", "fiefdom1");
        map.put("fiefdom1", fiefdom1);
        map.put("fiefdom2", fiefdom2);
        Map.map = map;
        assertEquals(0, Map.isNeighbor("fiefdom1", "fiefdom2"));
    }
    
    /**
     * Test case 10.
     * The origin and destination fiefdoms are neighbors.
     */
    @Test
    void testIsNeighbor10() {
        HashMap<String, Fiefdoms> map = new HashMap<>();
        Fiefdoms fiefdom1 = new Fiefdoms("fiefdom1", "fiefdom2");
        Fiefdoms fiefdom2 = new Fiefdoms("fiefdom2", "fiefdom1");
        map.put("fiefdom1", fiefdom1);
        map.put("fiefdom2", fiefdom2);
        Map.map = map;
        assertEquals(0, Map.isNeighbor("fiefdom2", "fiefdom1"));
    }
}</code>



I am using JUnit 5.6.2 and Java 11.0.8.
