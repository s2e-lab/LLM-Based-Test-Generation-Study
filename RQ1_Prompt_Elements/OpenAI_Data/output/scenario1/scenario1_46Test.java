// Fib4Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib4}.
* It contains ten unit test cases for the {@link Fib4#fib4(int)} method.
*/
class Fib4Test {

		/**
		* Test case 1 for {@link Fib4#fib4(int)}.
		*/
		@Test
		void testFib4_1() {
				assertEquals(0, Fib4.fib4(1));
		}
		
		/**
		* Test case 2 for {@link Fib4#fib4(int)}.
		*/
		@Test
		void testFib4_2() {
				assertEquals(0, Fib4.fib4(2));
		}
		
		/**
		* Test case 3 for {@link Fib4#fib4(int)}.
		*/
		@Test
		void testFib4_3() {
				assertEquals(2, Fib4.fib4(3));
		}
		
		/**
		* Test case 4 for {@link Fib4#fib4(int)}.
		*/
		@Test
		void testFib4_4() {
				assertEquals(2, Fib4.fib4(4));
		}
		
		/**
		* Test case 5 for {@link Fib4#fib4(int)}.
		*/
		@Test
		void testFib4_5() {
				assertEquals(4, Fib4.fib4(5));
		}
		
		/**
		* Test case 6 for {@link Fib4#fib4(int)}.
		*/
		@Test
		void testFib4_6() {
				assertEquals(6, Fib4.fib4(6));
		}
		
		/**
		* Test case 7 for {@link Fib4#fib4(int)}.
		*/
		@Test
		void testFib4_7() {
				assertEquals(10, Fib4.fib4(7));
		}
		
		/**
		* Test case 8 for {@link Fib4#fib4(int)}.
		*/
		@Test
		void testFib4_8() {
				assertEquals(16, Fib4.fib4(8));
		}
		
		/**
		* Test case 9 for {@link Fib4#fib4(int)}.
		*/
		@Test
		void testFib4_9() {
				assertEquals(26, Fib4.fib4(9));
		}
		
		/**
		* Test case 10 for {@link Fib4#fib4(int)}.
		*/
		@Test
		void testFib4_10() {
				assertEquals(42, Fib4.fib4(10));
		}
}

// Fib5.java
package scenario1;

class Fib5 {

    public static int fib5(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        int a = 0;
        int b = 0;
        int c = 2;
        int d = 0;
        int e = 0;
        for (int i = 4; i <= n; i++) {
            e = a + b + c + d;
            a = b;
            b = c;
            c = d;
            d = e;
        }
        return e;
    }
}

// Fib5Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib5}.
* It contains ten unit test cases for the {@link Fib5#fib5(int)} method.
*/
class Fib5Test {
		
		/**
		* Test case 1 for {@link Fib5#fib5(int)}.
		*/
		@Test
		void testFib5_1() {
				assertEquals(0, Fib5.fib5(1));
		}
		
		/**
		* Test case 2 for {@link Fib5#fib5(int)}.
		*/
		@Test
		void testFib5_2() {
				assertEquals(0, Fib5.fib5(2));
		}
		
		/**
		* Test case 3 for {@link Fib5#fib5(int)}.
		*/
		@Test
		void testFib5_3() {
				assertEquals(2, Fib5.fib5(3));
		}
		
		/**
		* Test case 4 for {@link Fib5#fib5(int)}.
		*/
		@Test
		void testFib5_4() {
				assertEquals(2, Fib5.fib5(4));
		}
		
		/**
		* Test case 5 for {@link Fib5#fib5(int)}.
		*/
		@Test
		void testFib5_5() {
				assertEquals(4, Fib5.fib5(5));
		}
		
		/**
		* Test case 6 for {@link Fib5#fib5(int)}.
		*/
		@Test
		void testFib5_6() {
				assertEquals(6, Fib5.fib5(6));
		}
		
		/**
		* Test case 7 for {@link Fib5#fib5(int)}.
		*/
		@Test
		void testFib5_7() {
				assertEquals(10, Fib5.fib5(7));
		}
		
		/**
		* Test case 8 for {@link Fib5#fib5(int)}.
		*/
		@Test
		void testFib5_8() {
				assertEquals(16, Fib5.fib5(8));
		}
		
		/**
		* Test case 9 for {@link Fib5#fib5(int)}.
		*/
		@Test
		void testFib5_9() {
				assertEquals(26, Fib5.fib5(9));
		}
		
		/**
		* Test case 10 for {@link Fib5#fib5(int)}.
		*/
		@Test
		void testFib5_10() {
				assertEquals(42, Fib5.fib5(10));
		}
}

// Fib6.java
package scenario1;

class Fib6 {

    public static int fib6(int n) {
        if (n < 2) {
            return 0;
        }
        if (n == 2) {
            return 2;
        }
        int a = 0;
        int b = 0;
        int c = 2;
        int d = 0;
        int e = 0;
        for (int i = 4; i <= n; i++) {
            e = a + b + c + d;
            a = b;
            b = c;
            c = d;
            d = e;
        }
        return e;
    }
}

// Fib6Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib6}.
* It contains ten unit test cases for the {@link Fib6#fib6(int)} method.
*/
class Fib6Test {
		
		/**
		* Test case 1 for {@link Fib6#fib6(int)}.
		*/
		@Test
		void testFib6_1() {
				assertEquals(0, Fib6.fib6(1));
		}
	