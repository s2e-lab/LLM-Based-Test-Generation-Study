package scenario2;

import java.util.ArrayList;
import java.util.List;
import original.NumericalLetterGrade;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class NumericalLetterGradeTest {
    @Test
	public void test1() throws Exception {
		assertEquals(Arrays.asList("A+", "B", "C-", "C", "A-"), scenario2.NumericalLetterGrade.numericalLetterGrade(Arrays.asList(4.0, 3, 1.7, 2, 3.5)));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(Arrays.asList("D+"), scenario2.NumericalLetterGrade.numericalLetterGrade(Arrays.asList(1.2)));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(Arrays.asList("D-"), scenario2.NumericalLetterGrade.numericalLetterGrade(Arrays.asList(0.5)));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(Arrays.asList("E"), scenario2.NumericalLetterGrade.numericalLetterGrade(Arrays.asList(0.0)));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(Arrays.asList("D", "D-", "C-", "B", "B+"), scenario2.NumericalLetterGrade.numericalLetterGrade(Arrays.asList(1, 0.3, 1.5, 2.8, 3.3)));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(Arrays.asList("E", "D-"), scenario2.NumericalLetterGrade.numericalLetterGrade(Arrays.asList(0, 0.7)));
	}

	
}