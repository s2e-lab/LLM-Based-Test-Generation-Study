package scenario1;

import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ParseMusicTest {

    @Test
    public void test() throws Exception{
        assertEquals(Arrays.asList(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4), scenario1.ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o"));
		assertEquals(Arrays.asList(), scenario1.ParseMusic.parseMusic(""));
		assertEquals(Arrays.asList(4, 4, 4, 4), scenario1.ParseMusic.parseMusic("o o o o"));
		assertEquals(Arrays.asList(1, 1, 1, 1), scenario1.ParseMusic.parseMusic(".| .| .| .|"));
		assertEquals(Arrays.asList(2, 2, 1, 1, 4, 4, 4, 4), scenario1.ParseMusic.parseMusic("o| o| .| .| o o o o"));
		assertEquals(Arrays.asList(2, 1, 2, 1, 4, 2, 4, 2), scenario1.ParseMusic.parseMusic("o| .| o| .| o o| o o|"));
		assertEquals(public static List<Object> parseMusic(String musicString) {, scenario1.ParseMusic.*/);
		
    }

}