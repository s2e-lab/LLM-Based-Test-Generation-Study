// Test class of NumericalLetterGrade
package scenario2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumericalLetterGradeTest {

    @Test
    void testNumericalLetterGrade() {
        List<Number> grades = new ArrayList<>(Arrays.asList(4.0, 3.8, 3.5, 3.2, 2.9, 2.6, 2.3, 2.0, 1.7, 1.4, 1.1, 0.8, 0.5, 0.0));
        List<String> expected = new ArrayList<>(Arrays.asList("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-", "E", "E"));
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeEmptyList() {
        List<Number> grades = new ArrayList<>();
        List<String> expected = new ArrayList<>();
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeSingleGrade() {
        List<Number> grades = new ArrayList<>(Arrays.asList(3.5));
        List<String> expected = new ArrayList<>(Arrays.asList("A-"));
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeAllGradesSame() {
        List<Number> grades = new ArrayList<>(Arrays.asList(2.5, 2.5, 2.5, 2.5, 2.5));
        List<String> expected = new ArrayList<>(Arrays.asList("C", "C", "C", "C", "C"));
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeAllGradesDifferent() {
        List<Number> grades = new ArrayList<>(Arrays.asList(4.0, 3.0, 2.0, 1.0, 0.0));
        List<String> expected = new ArrayList<>(Arrays.asList("A+", "B+", "C+", "D+", "E"));
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeNegativeGrades() {
        List<Number> grades = new ArrayList<>(Arrays.asList(-1.0, -2.0, -3.0, -4.0));
        List<String> expected = new ArrayList<>(Arrays.asList("E", "E", "E", "E"));
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeMixedGrades() {
        List<Number> grades = new ArrayList<>(Arrays.asList(3.5, 2.0, 1.3, 4.0, 0.7, 2.7));
        List<String> expected = new ArrayList<>(Arrays.asList("A-", "C+", "C-", "A+", "D", "B"));
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeDecimalGrades() {
        List<Number> grades = new ArrayList<>(Arrays.asList(3.75, 2.25, 1.5, 3.0, 0.9, 2.6));
        List<String> expected = new ArrayList<>(Arrays.asList("A", "C", "D+", "B", "D-", "B-"));
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeBoundaryGrades() {
        List<Number> grades = new ArrayList<>(Arrays.asList(4.0, 3.7, 3.3, 3.0, 2.7, 2.3, 2.0, 1.7, 1.3, 1.0, 0.7, 0.0));
        List<String> expected = new ArrayList<>(Arrays.asList("A+", "A", "A-", "B+", "B", "B-", "C+", "C", "C-", "D+", "D", "D-"));
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    @Test
    void testNumericalLetterGradeNullList() {
        List<Number> grades = null;
        assertThrows(NullPointerException.class, () -> NumericalLetterGrade.numericalLetterGrade(grades));
    }
}