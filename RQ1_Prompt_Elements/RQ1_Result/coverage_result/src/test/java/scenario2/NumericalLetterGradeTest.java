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
     * Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case when the input list is empty.
     */
    @Test
    void testEmptyList() {
        List<Number> grades = new ArrayList<Number>();
        List<String> expected = new ArrayList<String>();
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case when the input list contains only one element.
     */
    @Test
    void testOneElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case when the input list contains only two elements.
     */
    @Test
    void testTwoElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.7);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("A");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case when the input list contains only three elements.
     */
    @Test
    void testThreeElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.7);
        grades.add(3.3);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("A");
        expected.add("A-");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case when the input list contains only four elements.
     */
    @Test
    void testFourElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.7);
        grades.add(3.3);
        grades.add(3.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("A");
        expected.add("A-");
        expected.add("B+");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case when the input list contains only five elements.
     */
    @Test
    void testFiveElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.7);
        grades.add(3.3);
        grades.add(3.0);
        grades.add(2.7);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("A");
        expected.add("A-");
        expected.add("B+");
        expected.add("B");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case when the input list contains only six elements.
     */
    @Test
    void testSixElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.7);
        grades.add(3.3);
        grades.add(3.0);
        grades.add(2.7);
        grades.add(2.3);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("A");
        expected.add("A-");
        expected.add("B+");
        expected.add("B");
        expected.add("B-");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case when the input list contains only seven elements.
     */
    @Test
    void testSevenElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.7);
        grades.add(3.3);
        grades.add(3.0);
        grades.add(2.7);
        grades.add(2.3);
        grades.add(2.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("A");
        expected.add("A-");
        expected.add("B+");
        expected.add("B");
        expected.add("B-");
        expected.add("C+");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case when the input list contains only eight elements.
     */
    @Test
    void testEightElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.7);
        grades.add(3.3);
        grades.add(3.0);
        grades.add(2.7);
        grades.add(2.3);
        grades.add(2.0);
        grades.add(1.7);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("A");
        expected.add("A-");
        expected.add("B+");
        expected.add("B");
        expected.add("B-");
        expected.add("C+");
        expected.add("C");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case when the input list contains only nine elements.
     */
    @Test
    void testNineElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.7);
        grades.add(3.3);
        grades.add(3.0);
        grades.add(2.7);
        grades.add(2.3);
        grades.add(2.0);
        grades.add(1.7);
        grades.add(1.3);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("A");
        expected.add("A-");
        expected.add("B+");
        expected.add("B");
        expected.add("B-");
        expected.add("C+");
        expected.add("C");
        expected.add("C-");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }

    /**
     * Test case for {@link NumericalLetterGrade#numericalLetterGrade(List)} method.
     * It tests the case when the input list contains only ten elements.
     */
    @Test
    void testTenElementList() {
        List<Number> grades = new ArrayList<Number>();
        grades.add(4.0);
        grades.add(3.7);
        grades.add(3.3);
        grades.add(3.0);
        grades.add(2.7);
        grades.add(2.3);
        grades.add(2.0);
        grades.add(1.7);
        grades.add(1.3);
        grades.add(1.0);
        List<String> expected = new ArrayList<String>();
        expected.add("A+");
        expected.add("A");
        expected.add("A-");
        expected.add("B+");
        expected.add("B");
        expected.add("B-");
        expected.add("C+");
        expected.add("C");
        expected.add("C-");
        expected.add("D+");
        List<String> actual = NumericalLetterGrade.numericalLetterGrade(grades);
        assertEquals(expected, actual);
    }
}
