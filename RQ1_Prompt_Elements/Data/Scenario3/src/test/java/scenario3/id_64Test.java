package scenario3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
class VowelsCountTest {
    @Test
    void testVowelsCount() {
        assertEquals(2, VowelsCount.vowelsCount("abcde"));
        assertEquals(3, VowelsCount.vowelsCount("Alone"));
        assertEquals(2, VowelsCount.vowelsCount("key"));
        assertEquals(1, VowelsCount.vowelsCount("bye"));
        assertEquals(2, VowelsCount.vowelsCount("keY"));
        assertEquals(1, VowelsCount.vowelsCount("bYe"));
        assertEquals(3, VowelsCount.vowelsCount("ACEDY"));
        assertEquals(0, VowelsCount.vowelsCount(""));
        assertEquals(0, VowelsCount.vowelsCount("b"));
        assertEquals(1, VowelsCount.vowelsCount("bY"));
    }
}