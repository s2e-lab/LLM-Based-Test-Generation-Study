package scenario2;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CompareOneTest {

    @Test
    public void test() throws Exception {

        assertEquals(2, scenario2.CompareOne.compareOne(1, 2));
        assertEquals(2.5, scenario2.CompareOne.compareOne(1, 2.5));
        assertEquals(3, scenario2.CompareOne.compareOne(2, 3));
        assertEquals(6, scenario2.CompareOne.compareOne(5, 6));
        assertEquals("2,3", scenario2.CompareOne.compareOne(1, "2,3"));
        assertEquals("6", scenario2.CompareOne.compareOne("5,1", "6"));
        assertEquals("2", scenario2.CompareOne.compareOne("1", "2"));
        assertEquals(null, scenario2.CompareOne.compareOne("1", 1));

    }

}