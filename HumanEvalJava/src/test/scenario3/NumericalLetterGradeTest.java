package scenario3;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumericalLetterGradeTest {

    @Test
    public void test() throws Exception {

        assertEquals(Arrays.asList("A+", "B", "C-", "C", "A-"), scenario3.NumericalLetterGrade.numericalLetterGrade(Arrays.asList(4.0, 3, 1.7, 2, 3.5)));
        assertEquals(Arrays.asList("D+"), scenario3.NumericalLetterGrade.numericalLetterGrade(Arrays.asList(1.2)));
        assertEquals(Arrays.asList("D-"), scenario3.NumericalLetterGrade.numericalLetterGrade(Arrays.asList(0.5)));
        assertEquals(Arrays.asList("E"), scenario3.NumericalLetterGrade.numericalLetterGrade(Arrays.asList(0.0)));
        assertEquals(Arrays.asList("D", "D-", "C-", "B", "B+"), scenario3.NumericalLetterGrade.numericalLetterGrade(Arrays.asList(1, 0.3, 1.5, 2.8, 3.3)));
        assertEquals(Arrays.asList("E", "D-"), scenario3.NumericalLetterGrade.numericalLetterGrade(Arrays.asList(0, 0.7)));

    }

}