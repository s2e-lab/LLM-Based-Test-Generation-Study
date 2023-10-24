// NumericalLetterGradeTest.java
package scenario2;

import java.util.ArrayList;
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
    void testNumericalLetterGradeEmptyList() {
        List<Number> grades = new ArrayList<Number>();
        List<String> expected = new ArrayList<String>();
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains only one element.
     */
    @Test
    void testNumericalLetterGradeSingleElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains two elements.
     */
    @Test
    void testNumericalLetterGradeTwoElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("B+");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains three elements.
     */
    @Test
    void testNumericalLetterGradeThreeElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.0);
        grades.add(2.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("B+");
        expected.add("C+");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains four elements.
     */
    @Test
    void testNumericalLetterGradeFourElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.0);
        grades.add(2.0);
        grades.add(1.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("B+");
        expected.add("C+");
        expected.add("D+");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains five elements.
     */
    @Test
    void testNumericalLetterGradeFiveElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.0);
        grades.add(2.0);
        grades.add(1.0);
        grades.add(0.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("B+");
        expected.add("C+");
        expected.add("D+");
        expected.add("E");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains six elements.
     */
    @Test
    void testNumericalLetterGradeSixElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.0);
        grades.add(2.0);
        grades.add(1.0);
        grades.add(0.0);
        grades.add(0.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("B+");
        expected.add("C+");
        expected.add("D+");
        expected.add("E");
        expected.add("E");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains seven elements.
     */
    @Test
    void testNumericalLetterGradeSevenElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.0);
        grades.add(2.0);
        grades.add(1.0);
        grades.add(0.0);
        grades.add(0.0);
        grades.add(0.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("B+");
        expected.add("C+");
        expected.add("D+");
        expected.add("E");
        expected.add("E");
        expected.add("E");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains eight elements.
     */
    @Test
    void testNumericalLetterGradeEightElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.0);
        grades.add(2.0);
        grades.add(1.0);
        grades.add(0.0);
        grades.add(0.0);
        grades.add(0.0);
        grades.add(0.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("B+");
        expected.add("C+");
        expected.add("D+");
        expected.add("E");
        expected.add("E");
        expected.add("E");
        expected.add("E");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains nine elements.
     */
    @Test
    void testNumericalLetterGradeNineElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.0);
        grades.add(2.0);
        grades.add(1.0);
        grades.add(0.0);
        grades.add(0.0);
        grades.add(0.0);
        grades.add(0.0);
        grades.add(0.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("B+");
        expected.add("C+");
        expected.add("D+");
        expected.add("E");
        expected.add("E");
        expected.add("E");
        expected.add("E");
        expected.add("E");
        assertEquals(expected, NumericalLetterGrade.numericalLetterGrade(grades));
    }

    /**
     * Test case for the {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case where the input list contains ten elements.
     */
    @Test
    void testNumericalLetterGradeTenElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.0);
        grades.add(2.0);
        grades.add(1.0);
        grades.add(0.0);
        grades.add(0.0);
        grades.add(0.0);
        grades.add(0.0);
        grades.add(0.0);
        grades.add(0.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("B+");
        expected.add("C