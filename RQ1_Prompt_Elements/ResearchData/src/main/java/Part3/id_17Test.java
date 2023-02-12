package Part3;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
class ParseMusicTest {
    @Test
    void testParseMusic() {
        assertEquals(ParseMusic.parseMusic("o o| .| o| o| .| .| .| .| o o"), Arrays.asList(4, 2, 1, 2, 2, 1, 1, 1, 1, 4, 4));
        assertEquals(ParseMusic.parseMusic(""), Arrays.asList());
        assertEquals(ParseMusic.parseMusic("o o o o"), Arrays.asList(4, 4, 4, 4));
        assertEquals(ParseMusic.parseMusic(".| .| .| .|"), Arrays.asList(1, 1, 1, 1));
        assertEquals(ParseMusic.parseMusic("o| o| .| .| o o o o"), Arrays.asList(2, 2, 1, 1, 4, 4, 4, 4));
        assertEquals(ParseMusic.parseMusic("o| .| o| .| o o| o o|"), Arrays.asList(2, 1, 2, 1, 4, 2, 4, 2));
        assertEquals(ParseMusic.parseMusic("o| .| o| .| o o| o o| o| .| o| .| o o| o o|"), Arrays.asList(2, 1, 2, 1, 4, 2, 4, 2, 2, 1, 2, 1, 4, 2, 4, 2));
        assertEquals(ParseMusic.parseMusic("o| .| o| .| o o| o o| o| .| o| .| o o| o o| o| .| o| .| o o| o o|"), Arrays.asList(2, 1, 2, 1, 4, 2, 4, 2, 2, 1, 2, 1, 4, 2, 4, 2, 2, 1, 2, 1, 4, 2, 4, 2));
        assertEquals(ParseMusic.parseMusic("o| .| o| .| o o| o o| o| .| o| .| o o| o o| o| .| o| .| o o| o o| o| .| o| .| o o| o o|"), Arrays.asList(2, 1, 2, 1, 4, 2, 4, 2, 2, 1, 2, 1, 4, 2, 4, 2, 2, 1, 2, 1, 4, 2, 4, 2, 2, 1, 2, 1, 4, 2, 4, 2));
        assertEquals(ParseMusic.parseMusic("o| .| o| .| o o| o o| o| .| o| .| o o| o o| o| .| o| .| o o| o o| o| .| o| .| o o| o o| o| .| o| .| o o| o o|"), Arrays.asList(2, 1, 2, 1, 4, 2, 4, 2, 2, 1, 2, 1, 4, 2, 4, 2, 2, 1, 2, 1, 4, 2, 4, 2, 2, 1, 2, 1, 4, 2, 4, 2, 2, 1, 2, 1, 4, 2, 4, 2));
    }
}