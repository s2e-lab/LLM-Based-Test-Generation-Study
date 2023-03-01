// FizzBuzzTest.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains ten unit test cases for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {

		/**
		* Test case 1.
		* The input is a negative number.
		* The expected result is 0.
		*/
		@Test
		void test1() {
				assertEquals(0, FizzBuzz.fizzBuzz(-1));
		}
		
		/**
		* Test case 2.
		* The input is 0.
		* The expected result is 0.
		*/
		@Test
		void test2() {
				assertEquals(0, FizzBuzz.fizzBuzz(0));
		}
		
		/**
		* Test case 3.
		* The input is 1.
		* The expected result is 0.
		*/
		@Test
		void test3() {
				assertEquals(0, FizzBuzz.fizzBuzz(1));
		}
		
		/**
		* Test case 4.
		* The input is 2.
		* The expected result is 0.
		*/
		@Test
		void test4() {
				assertEquals(0, FizzBuzz.fizzBuzz(2));
		}
		
		/**
		* Test case 5.
		* The input is 3.
		* The expected result is 0.
		*/
		@Test
		void test5() {
				assertEquals(0, FizzBuzz.fizzBuzz(3));
		}
		
		/**
		* Test case 6.
		* The input is 4.
		* The expected result is 0.
		*/
		@Test
		void test6() {
				assertEquals(0, FizzBuzz.fizzBuzz(4));
		}
		
		/**
		* Test case 7.
		* The input is 5.
		* The expected result is 0.
		*/
		@Test
		void test7() {
				assertEquals(0, FizzBuzz.fizzBuzz(5));
		}
		
		/**
		* Test case 8.
		* The input is 6.
		* The expected result is 0.
		*/
		@Test
		void test8() {
				assertEquals(0, FizzBuzz.fizzBuzz(6));
		}
		
		/**
		* Test case 9.
		* The input is 7.
		* The expected result is 0.
		*/
		@Test
		void test9() {
				assertEquals(0, FizzBuzz.fizzBuzz(7));
		}
		
		/**
		* Test case 10.
		* The input is 8.
		* The expected result is 0.
		*/
		@Test
		void test10() {
				assertEquals(0, FizzBuzz.fizzBuzz(8));
		}
}

// FizzBuzzTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains ten unit test cases for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {
		
		/**
		* Test case 1.
		* The input is a negative number.
		* The expected result is 0.
		*/
		@Test
		void test1() {
				assertEquals(0, FizzBuzz.fizzBuzz(-1));
		}
		
		/**
		* Test case 2.
		* The input is 0.
		* The expected result is 0.
		*/
		@Test
		void test2() {
				assertEquals(0, FizzBuzz.fizzBuzz(0));
		}
		
		/**
		* Test case 3.
		* The input is 1.
		* The expected result is 0.
		*/
		@Test
		void test3() {
				assertEquals(0, FizzBuzz.fizzBuzz(1));
		}
		
		/**
		* Test case 4.
		* The input is 2.
		* The expected result is 0.
		*/
		@Test
		void test4() {
				assertEquals(0, FizzBuzz.fizzBuzz(2));
		}
		
		/**
		* Test case 5.
		* The input is 3.
		* The expected result is 0.
		*/
		@Test
		void test5() {
				assertEquals(0, FizzBuzz.fizzBuzz(3));
		}
		
		/**
		* Test case 6.
		* The input is 4.
		* The expected result is 0.
		*/
		@Test
		void test6() {
				assertEquals(0, FizzBuzz.fizzBuzz(4));
		}
		
		/**
		* Test case 7.
		* The input is 5.
		* The expected result is 0.
		*/
		@Test
		void test7() {
				assertEquals(0, FizzBuzz.fizzBuzz(5));
		}
		
		/**
		* Test case 8.
		* The input is 6.
		* The expected result is 0.
		*/
		@Test
		void test8() {
				assertEquals(0, FizzBuzz.fizzBuzz(6));
		}
		
		/**
		* Test case 9.
		* The input is 7.
		* The expected result is 0.
		*/
		@Test
		void test9() {
				assertEquals(0, FizzBuzz.fizzBuzz(7));
		}
		
		/**
		* Test case 10.
		* The input is 8.
		* The expected result is 0.
		*/
		@Test
		void test10() {
				assertEquals(0, FizzBuzz.fizzBuzz(8));
		}
}

// FizzBuzz.java
package scenario2;

class FizzBuzz {

    public static int fizzBuzz(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 11 == 0 || i % 13 == 0) {
                String s = Integer.toString(i);
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '7') {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

// FizzBuzzTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains ten unit test cases for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {
		
		/**
		* Test case 1.
		* The input is a negative number.
		* The expected result is 0.
		*/
		@Test
		void test1() {
				assertEquals(0, FizzBuzz.fizzBuzz(-1));
		}
		
		/**
		* Test case 2.
		* The input is 0.
		* The expected result is 0.
		*/
		@Test
		void test2() {
				assertEquals(0, FizzBuzz.fizzBuzz(0));
		}
		
		/**
		* Test case 3.
		* The input is 1.
		* The expected result is 0.
		*/
		@Test
		void test3() {
				assertEquals(0, FizzBuzz.fizzBuzz(1));
		}
		
		/**
		* Test case 4.
		* The input is 2.
		* The expected result is 0.
		*/
		@Test
		void test4() {
				assertEquals(0, FizzBuzz.fizzBuzz(2));
		}
		
		/**
		* Test case 5.
		* The input is 3.
		* The expected result is 0.
		*/
		@Test
		void test5() {
				assertEquals(0, FizzBuzz.fizzBuzz(3));
		}
		
		/**
		* Test case 6.
		* The input is 4.
		* The expected result is 0.
		*/
		@Test
		void test6() {
				assertEquals(0, FizzBuzz.fizzBuzz(4));
		}
		
		/**
		* Test case 7.
		* The input is 5.
		* The expected result is 0.
		*/
		@Test
		void test7() {
				assertEquals(0, FizzBuzz.fizzBuzz(5));
		}
		
		/**
		* Test case 8.
		* The input is 6.
		* The expected result is 0.
		*/
		@Test
		void test8() {
				assertEquals(0, FizzBuzz.fizzBuzz(6));
		}
		
		/**
		* Test case 9.
		* The input is 7.
		* The expected result is 0.
		*/
		@Test
		void test9() {
				assertEquals(0, FizzBuzz.fizzBuzz(7));
		}
		
		/**
		* Test case 10.
		* The input is 8.
		* The expected result is 0.
		*/
		@Test
		void test10() {
				assertEquals(0, FizzBuzz.fizzBuzz(8));
		}
}

// FizzBuzz.java
package scenario3;

class FizzBuzz {

    public static int fizzBuzz(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 11 == 0 || i % 13 == 0) {
                String s = Integer.toString(i);
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '7') {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

// FizzBuzzTest.java
package scenario4;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains ten unit test cases for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {
		
		/**
		* Test case 1.
		* The input is a negative number.
		* The expected result is 0.
		*/
		@Test
		void test1() {
				assertEquals(0, FizzBuzz.fizzBuzz(-1));
		}
		
		/**
		* Test case 2.
		* The input is 0.
		* The expected result is 0.
		*/
		@Test
		void test2() {
				assertEquals(0, FizzBuzz.fizzBuzz(0));
		}
		
		/**
		* Test case 3.
		* The input is 1.
		* The expected result is 0.
		*/
		@Test
		void test3() {
				assertEquals(0, FizzBuzz.fizzBuzz(1));
		}
		
		/**
		* Test case 4.
		* The input is 2.
		* The expected result is 0.
		*/
		@Test
		void test4() {
				assertEquals(0, FizzBuzz.fizzBuzz(2));
		}
		
		/**
		* Test case 5.
		* The input is 3.
		* The expected result is 0.
		*/
		@Test
		void test5() {
				assertEquals(0, FizzBuzz.fizzBuzz(3));
		}
		
		/**
		* Test case 6.
		* The input is 4.
		* The expected result is 0.
		*/
		@Test
		void test6() {
				assertEquals(0, FizzBuzz.fizzBuzz(4));
		}
		
		/**
		* Test case 7.
		* The input is 5.
		* The expected result is 0.
		*/
		@Test
		void test7() {
				assertEquals(0, FizzBuzz.fizzBuzz(5));
		}
		
		/**
		* Test case 8.
		* The input is 6.
		* The expected result is 0.
		*/
		@Test
		void test8() {
				assertEquals(0, FizzBuzz.fizzBuzz(6));
		}
		
		/**
		* Test case 9.
		* The input is 7.
		* The expected result is 0.
		*/
		@Test
		void test9() {
				assertEquals(0, FizzBuzz.fizzBuzz(7));
		}
		
		/**
		* Test case 10.
		* The input is 8.
		* The expected result is 0.
		*/
		@Test
		void test10() {
				assertEquals(0, FizzBuzz.fizzBuzz(8));
		}
}

// FizzBuzz.java
package scenario4;

class FizzBuzz {

    public static int fizzBuzz(int n) {
        int count = 0;
        for (int i = 1; i < n; i++) {
            if (i % 11 == 0 || i % 13 == 0) {
                String s = Integer.toString(i);
                for (int j = 0; j < s.length(); j++) {
                    if (s.charAt(j) == '7') {
                        count++;
                    }
                }
            }
        }
        return count;
    }
}

// FizzBuzzTest.java
package scenario5;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FizzBuzz}.
* It contains ten unit test cases for the {@link FizzBuzz#fizzBuzz(int)} method.
*/
class FizzBuzzTest {
		
		/**
		* Test case 1.
		* The input is a negative number.
		* The expected result is 0.
		*/
		@Test
		void test1() {
				assertEquals(0, FizzBuzz.fizzBuzz(-1));
		}
		
		/**
		* Test case 2.
		* The input is 0.
		* The expected result is 0.
		*/
		@Test
		void test2()