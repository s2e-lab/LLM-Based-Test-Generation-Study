// Fib4Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib4}.
* It contains ten unit test cases for the {@link Fib4#fib4(int)} method.
*/
class Fib4Test {

	@Test
	void testFib4() {
		assertEquals(0, Fib4.fib4(1));
		assertEquals(0, Fib4.fib4(2));
		assertEquals(2, Fib4.fib4(3));
		assertEquals(2, Fib4.fib4(4));
		assertEquals(4, Fib4.fib4(5));
		assertEquals(6, Fib4.fib4(6));
		assertEquals(10, Fib4.fib4(7));
		assertEquals(16, Fib4.fib4(8));
		assertEquals(26, Fib4.fib4(9));
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
		
	@Test
	void testFib5() {
		assertEquals(0, Fib5.fib5(1));
		assertEquals(0, Fib5.fib5(2));
		assertEquals(2, Fib5.fib5(3));
		assertEquals(2, Fib5.fib5(4));
		assertEquals(4, Fib5.fib5(5));
		assertEquals(6, Fib5.fib5(6));
		assertEquals(10, Fib5.fib5(7));
		assertEquals(16, Fib5.fib5(8));
		assertEquals(26, Fib5.fib5(9));
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
		
	@Test
	void testFib6() {
		assertEquals(0, Fib6.fib6(1));
		assertEquals(0, Fib6.fib6(2));
		assertEquals(2, Fib6.fib6(3));
		assertEquals(2, Fib6.fib6(4));
		assertEquals(4, Fib6.fib6(5));
		assertEquals(6, Fib6.fib6(6));
		assertEquals(10, Fib6.fib6(7));
		assertEquals(16, Fib6.fib6(8));
		assertEquals(26, Fib6.fib6(9));
		assertEquals(42, Fib6.fib6(10));
	}
}

// Fib7.java
package scenario1;

class Fib7 {

    public static int fib7(int n) {
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

// Fib7Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib7}.
* It contains ten unit test cases for the {@link Fib7#fib7(int)} method.
*/
class Fib7Test {
		
	@Test
	void testFib7() {
		assertEquals(0, Fib7.fib7(1));
		assertEquals(0, Fib7.fib7(2));
		assertEquals(2, Fib7.fib7(3));
		assertEquals(2, Fib7.fib7(4));
		assertEquals(4, Fib7.fib7(5));
		assertEquals(6, Fib7.fib7(6));
		assertEquals(10, Fib7.fib7(7));
		assertEquals(16, Fib7.fib7(8));
		assertEquals(26, Fib7.fib7(9));
		assertEquals(42, Fib7.fib7(10));
	}
}

// Fib8.java
package scenario1;

class Fib8 {

    public static int fib8(int n) {
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

// Fib8Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib8}.
* It contains ten unit test cases for the {@link Fib8#fib8(int)} method.
*/
class Fib8Test {
		
	@Test
	void testFib8() {
		assertEquals(0, Fib8.fib8(1));
		assertEquals(0, Fib8.fib8(2));
		assertEquals(2, Fib8.fib8(3));
		assertEquals(2, Fib8.fib8(4));
		assertEquals(4, Fib8.fib8(5));
		assertEquals(6, Fib8.fib8(6));
		assertEquals(10, Fib8.fib8(7));
		assertEquals(16, Fib8.fib8(8));
		assertEquals(26, Fib8.fib8(9));
		assertEquals(42, Fib8.fib8(10));
	}
}

// Fib9.java
package scenario1;

class Fib9 {

    public static int fib9(int n) {
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

// Fib9Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib9}.
* It contains ten unit test cases for the {@link Fib9#fib9(int)} method.
*/
class Fib9Test {
		
	@Test
	void testFib9() {
		assertEquals(0, Fib9.fib9(1));
		assertEquals(0, Fib9.fib9(2));
		assertEquals(2, Fib9.fib9(3));
		assertEquals(2, Fib9.fib9(4));
		assertEquals(4, Fib9.fib9(5));
		assertEquals(6, Fib9.fib9(6));
		assertEquals(10, Fib9.fib9(7));
		assertEquals(16, Fib9.fib9(8));
		assertEquals(26, Fib9.fib9(9));
		assertEquals(42, Fib9.fib9(10));
	}
}

// Fib10.java
package scenario1;

class Fib10 {

    public static int fib10(int n) {
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

// Fib10Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib10}.
* It contains ten unit test cases for the {@link Fib10#fib10(int)} method.
*/
class Fib10Test {
		
	@Test
	void testFib10() {
		assertEquals(0, Fib10.fib10(1));
		assertEquals(0, Fib10.fib10(2));
		assertEquals(2, Fib10.fib10(3));
		assertEquals(2, Fib10.fib10(4));
		assertEquals(4, Fib10.fib10(5));
		assertEquals(6, Fib10.fib10(6));
		assertEquals(10, Fib10.fib10(7));
		assertEquals(16, Fib10.fib10(8));
		assertEquals(26, Fib10.fib10(9));
		assertEquals(42, Fib10.fib10(10));
	}
}

// Fib11.java
package scenario1;

class Fib11 {

    public static int fib11(int n) {
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

// Fib11Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib11}.
* It contains ten unit test cases for the {@link Fib11#fib11(int)} method.
*/
class Fib11Test {
		
	@Test
	void testFib11() {
		assertEquals(0, Fib11.fib11(1));
		assertEquals(0, Fib11.fib11(2));
		assertEquals(2, Fib11.fib11(3));
		assertEquals(2, Fib11.fib11(4));
		assertEquals(4, Fib11.fib11(5));
		assertEquals(6, Fib11.fib11(6));
		assertEquals(10, Fib11.fib11(7));
		assertEquals(16, Fib11.fib11(8));
		assertEquals(26, Fib11.fib11(9));
		assertEquals(42, Fib11.fib11(10));
	}
}

// Fib12.java
package scenario1;

class Fib12 {

    public static int fib12(int n) {
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

// Fib12Test.java
package scenario1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fib12}.
* It contains ten unit test cases for the {@link Fib12#fib12(int)} method.
*/
class Fib12Test {
		
	@Test
	void testFib12() {
		assertEquals(0, Fib12.fib12(1));
		assertEquals(0, Fib12.fib12(2));
		assertEquals(2, Fib12.fib12(3));
		assertEquals(2, Fib12.fib12(4));
		assertEquals(4, Fib12.fib12(5));
		assertEquals(6, Fib12.fib12(6));
		assertEquals(10, Fib12.fib12(7));
		assertEquals(16, Fib12.fib12(8));
		assertEquals(26, Fib12.fib12(9));
		assertEquals(42, Fib12.fib12(10));
	}
}

// Fib13.java
package scenario1;

class Fib13 {

    public static int fib13(int n) {
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
