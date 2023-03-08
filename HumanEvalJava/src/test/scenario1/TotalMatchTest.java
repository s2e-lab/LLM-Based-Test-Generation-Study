package scenario1;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TotalMatchTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(), scenario1.TotalMatch.totalMatch(Arrays.asList(), Arrays.asList()));
        assertEquals(Arrays.asList("hi", "hi"), scenario1.TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hi", "hi")));
        assertEquals(Arrays.asList("hi", "admin"), scenario1.TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hi", "hi", "admin", "project")));
        assertEquals(Arrays.asList("4"), scenario1.TotalMatch.totalMatch(Arrays.asList("4"), Arrays.asList("1", "2", "3", "4", "5")));
        assertEquals(Arrays.asList("hI", "Hi"), scenario1.TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hI", "Hi")));
        assertEquals(Arrays.asList("hI", "hi", "hi"), scenario1.TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hI", "hi", "hi")));
        assertEquals(Arrays.asList("hi", "admin"), scenario1.TotalMatch.totalMatch(Arrays.asList("hi", "admin"), Arrays.asList("hI", "hi", "hii")));
        assertEquals(Arrays.asList(), scenario1.TotalMatch.totalMatch(Arrays.asList(), Arrays.asList("this")));
        assertEquals(Arrays.asList(), scenario1.TotalMatch.totalMatch(Arrays.asList("this"), Arrays.asList()));

    }

}