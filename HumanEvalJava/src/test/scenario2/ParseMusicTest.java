package scenario2;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ParseMusicTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4), scenario2.ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o"));
        assertEquals(Arrays.asList(), scenario2.ParseMusic.parseMusic(""));
        assertEquals(Arrays.asList(4, 4, 4, 4), scenario2.ParseMusic.parseMusic("o o o o"));
        assertEquals(Arrays.asList(1, 1, 1, 1), scenario2.ParseMusic.parseMusic(".| .| .| .|"));
        assertEquals(Arrays.asList(2, 2, 1, 1, 4, 4, 4, 4), scenario2.ParseMusic.parseMusic("o| o| .| .| o o o o"));
        assertEquals(Arrays.asList(2, 1, 2, 1, 4, 2, 4, 2), scenario2.ParseMusic.parseMusic("o| .| o| .| o o| o o|"));

    }

}