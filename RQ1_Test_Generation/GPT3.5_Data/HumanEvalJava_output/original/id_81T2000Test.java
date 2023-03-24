// NumericalLetterGradeTest.java
package updated;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Test class of {@link NumericalLetterGrade}.
 * It contains ten unit test cases for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
 */
class NumericalLetterGradeTest {

    @Test
    void testNumericalLetterGrade() {
        List<Number> grades = new ArrayList<>(Arrays.asList(4.0, 3, 1.7, 2, 3.5));
        List<String> expected = new ArrayList<>(Arrays.asList("A+", "B", "C-", "C", "A-"));
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithOneGrade() {
        List<Number> grades = new ArrayList<>(Arrays.asList(1.2));
        List<String> expected = new ArrayList<>(Arrays.asList("D+"));
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithZeroPointFive() {
        List<Number> grades = new ArrayList<>(Arrays.asList(0.5));
        List<String> expected = new ArrayList<>(Arrays.asList("D-"));
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithZero() {
        List<Number> grades = new ArrayList<>(Arrays.asList(0.0));
        List<String> expected = new ArrayList<>(Arrays.asList("E"));
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithMultipleGrades() {
        List<Number> grades = new ArrayList<>(Arrays.asList(1, 0.3, 1.5, 2.8, 3.3));
        List<String> expected = new ArrayList<>(Arrays.asList("D", "D-", "C-", "B", "B+"));
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithZeroAndZeroPointSeven() {
        List<Number> grades = new ArrayList<>(Arrays.asList(0, 0.7));
        List<String> expected = new ArrayList<>(Arrays.asList("E", "D-"));
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithAllGradesAboveFour() {
        List<Number> grades = new ArrayList<>(Arrays.asList(4.0, 4.0, 4.0));
        List<String> expected = new ArrayList<>(Arrays.asList("A+", "A+", "A+"));
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithAllGradesBelowOne() {
        List<Number> grades = new ArrayList<>(Arrays.asList(0.7, 0.3, 0.0));
        List<String> expected = new ArrayList<>(Arrays.asList("D-", "D-", "E"));
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithAllGradesEqualToThree() {
        List<Number> grades = new ArrayList<>(Arrays.asList(3.0, 3.0, 3.0));
        List<String> expected = new ArrayList<>(Arrays.asList("B+", "B+", "B+"));
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithAllGradesEqualToTwo() {
        List<Number> grades = new ArrayList<>(Arrays.asList(2.0, 2.0, 2.0));
        List<String> expected = new ArrayList<>(Arrays.asList("C+", "C+", "C+"));
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    @Test
    void testNumericalLetterGradeWithAllGradesEqualToOne() {
        List<Number> grades = new ArrayList<>(Arrays.asList(1.0, 1.0, 1.0));
        List<String> expected = new ArrayList<>(Arrays.asList("D+", "D+", "D+"));
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }
}