// NumericalLetterGradeTest.java
package scenario3;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link NumericalLetterGrade}.
* It contains ten unit test cases for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
*/
class NumericalLetterGradeTest {

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list is empty.
     */
    @Test
    void testNumericalLetterGradeEmpty() {
        List<Number> grades = List.of();
        List<String> expected = List.of();
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains only one element.
     */
    @Test
    void testNumericalLetterGradeOneElement() {
        List<Number> grades = List.of(1.2);
        List<String> expected = List.of("D+");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains only one element.
     */
    @Test
    void testNumericalLetterGradeOneElement2() {
        List<Number> grades = List.of(0.5);
        List<String> expected = List.of("D-");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains only one element.
     */
    @Test
    void testNumericalLetterGradeOneElement3() {
        List<Number> grades = List.of(0.0);
        List<String> expected = List.of("E");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains two elements.
     */
    @Test
    void testNumericalLetterGradeTwoElements() {
        List<Number> grades = List.of(1, 0.3);
        List<String> expected = List.of("D", "D-");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains two elements.
     */
    @Test
    void testNumericalLetterGradeTwoElements2() {
        List<Number> grades = List.of(0, 0.7);
        List<String> expected = List.of("E", "D-");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains five elements.
     */
    @Test
    void testNumericalLetterGradeFiveElements() {
        List<Number> grades = List.of(4.0, 3, 1.7, 2, 3.5);
        List<String> expected = List.of("A+", "B", "C-", "C", "A-");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains five elements.
     */
    @Test
    void testNumericalLetterGradeFiveElements2() {
        List<Number> grades = List.of(1, 0.3, 1.5, 2.8, 3.3);
        List<String> expected = List.of("D", "D-", "C-", "B", "B+");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }
}
