package scenario1;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class StringSequenceTest {

    @Test
    public void test() throws Exception {

        assertEquals("0", scenario1.StringSequence.stringSequence(0));
        assertEquals("0 1 2 3 4 5", scenario1.StringSequence.stringSequence(5));
        assertEquals("0", scenario1.StringSequence.stringSequence(0));
        assertEquals("0 1 2 3", scenario1.StringSequence.stringSequence(3));
        assertEquals("0 1 2 3 4 5 6 7 8 9 10", scenario1.StringSequence.stringSequence(10));

    }

}