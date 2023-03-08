package scenario3;


import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TruncateNumberTest {

    @Test
    public void test() throws Exception {

        assertEquals(0.5, scenario3.TruncateNumber.truncateNumber(3.5));
        assertEquals(0.33, scenario3.TruncateNumber.truncateNumber(1.33));
        assertEquals(0.456, scenario3.TruncateNumber.truncateNumber(123.456));

    }

}