// PrimeFibTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains ten unit test cases for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {

	@Test
	void testPrimeFib1() {
		assertEquals(2, PrimeFib.primeFib(1));
	}
	
	@Test
	void testPrimeFib2() {
		assertEquals(3, PrimeFib.primeFib(2));
	}
	
	@Test
	void testPrimeFib3() {
		assertEquals(5, PrimeFib.primeFib(3));
	}
	
	@Test
	void testPrimeFib4() {
		assertEquals(13, PrimeFib.primeFib(4));
	}
	
	@Test
	void testPrimeFib5() {
		assertEquals(89, PrimeFib.primeFib(5));
	}
	
	@Test
	void testPrimeFib6() {
		assertEquals(233, PrimeFib.primeFib(6));
	}
	
	@Test
	void testPrimeFib7() {
		assertEquals(1597, PrimeFib.primeFib(7));
	}
	
	@Test
	void testPrimeFib8() {
		assertEquals(28657, PrimeFib.primeFib(8));
	}
	
	@Test
	void testPrimeFib9() {
		assertEquals(514229, PrimeFib.primeFib(9));
	}
	
	@Test
	void testPrimeFib10() {
		assertEquals(433494437, PrimeFib.primeFib(10));
	}
}

// PrimeFibTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains ten unit test cases for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {
		
	@Test
	void testPrimeFib1() {
		assertEquals(2, PrimeFib.primeFib(1));
	}
	
	@Test
	void testPrimeFib2() {
		assertEquals(3, PrimeFib.primeFib(2));
	}
	
	@Test
	void testPrimeFib3() {
		assertEquals(5, PrimeFib.primeFib(3));
	}
	
	@Test
	void testPrimeFib4() {
		assertEquals(13, PrimeFib.primeFib(4));
	}
	
	@Test
	void testPrimeFib5() {
		assertEquals(89, PrimeFib.primeFib(5));
	}
	
	@Test
	void testPrimeFib6() {
		assertEquals(233, PrimeFib.primeFib(6));
	}
	
	@Test
	void testPrimeFib7() {
		assertEquals(1597, PrimeFib.primeFib(7));
	}
	
	@Test
	void testPrimeFib8() {
		assertEquals(28657, PrimeFib.primeFib(8));
	}
	
	@Test
	void testPrimeFib9() {
		assertEquals(514229, PrimeFib.primeFib(9));
	}
	
	@Test
	void testPrimeFib10() {
		assertEquals(433494437, PrimeFib.primeFib(10));
	}
}

// PrimeFib.java
package scenario3;

class PrimeFib {

    /**
     * Returns n-th number that is a Fibonacci number and it's also prime.
     *
     * > primeFib(1)
     * 2
     * > primeFib(2)
     * 3
     * > primeFib(3)
     * 5
     * > primeFib(4)
     * 13
     * > primeFib(5)
     * 89
     * > primeFib(1)
     * 2
     * > primeFib(2)
     * 3
     * > primeFib(3)
     * 5
     * > primeFib(4)
     * 13
     * > primeFib(5)
     * 89
     * > primeFib(6)
     * 233
     * > primeFib(7)
     * 1597
     * > primeFib(8)
     * 28657
     * > primeFib(9)
     * 514229
     * > primeFib(10)
     * 433494437
     */
    public static int primeFib(int n) {
        int a = 1;
        int b = 1;
        int c = 2;
        int i = 3;
        while (i < n) {
            a = b;
            b = c;
            c = a + b;
            i++;
        }
        return c;
    }
}

// PrimeFibTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains ten unit test cases for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {
		
	@Test
	void testPrimeFib1() {
		assertEquals(2, PrimeFib.primeFib(1));
	}
	
	@Test
	void testPrimeFib2() {
		assertEquals(3, PrimeFib.primeFib(2));
	}
	
	@Test
	void testPrimeFib3() {
		assertEquals(5, PrimeFib.primeFib(3));
	}
	
	@Test
	void testPrimeFib4() {
		assertEquals(13, PrimeFib.primeFib(4));
	}
	
	@Test
	void testPrimeFib5() {
		assertEquals(89, PrimeFib.primeFib(5));
	}
	
	@Test
	void testPrimeFib6() {
		assertEquals(233, PrimeFib.primeFib(6));
	}
	
	@Test
	void testPrimeFib7() {
		assertEquals(1597, PrimeFib.primeFib(7));
	}
	
	@Test
	void testPrimeFib8() {
		assertEquals(28657, PrimeFib.primeFib(8));
	}
	
	@Test
	void testPrimeFib9() {
		assertEquals(514229, PrimeFib.primeFib(9));
	}
	
	@Test
	void testPrimeFib10() {
		assertEquals(433494437, PrimeFib.primeFib(10));
	}
}

// PrimeFib.java
package scenario3;

class PrimeFib {

    /**
     * Returns n-th number that is a Fibonacci number and it's also prime.
     *
     * > primeFib(1)
     * 2
     * > primeFib(2)
     * 3
     * > primeFib(3)
     * 5
     * > primeFib(4)
     * 13
     * > primeFib(5)
     * 89
     * > primeFib(1)
     * 2
     * > primeFib(2)
     * 3
     * > primeFib(3)
     * 5
     * > primeFib(4)
     * 13
     * > primeFib(5)
     * 89
     * > primeFib(6)
     * 233
     * > primeFib(7)
     * 1597
     * > primeFib(8)
     * 28657
     * > primeFib(9)
     * 514229
     * > primeFib(10)
     * 433494437
     */
    public static int primeFib(int n) {
        int a = 1;
        int b = 1;
        int c = 2;
        int i = 3;
        while (i < n) {
            a = b;
            b = c;
            c = a + b;
            i++;
        }
        return c;
    }
}

// PrimeFibTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains ten unit test cases for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {
		
	@Test
	void testPrimeFib1() {
		assertEquals(2, PrimeFib.primeFib(1));
	}
	
	@Test
	void testPrimeFib2() {
		assertEquals(3, PrimeFib.primeFib(2));
	}
	
	@Test
	void testPrimeFib3() {
		assertEquals(5, PrimeFib.primeFib(3));
	}
	
	@Test
	void testPrimeFib4() {
		assertEquals(13, PrimeFib.primeFib(4));
	}
	
	@Test
	void testPrimeFib5() {
		assertEquals(89, PrimeFib.primeFib(5));
	}
	
	@Test
	void testPrimeFib6() {
		assertEquals(233, PrimeFib.primeFib(6));
	}
	
	@Test
	void testPrimeFib7() {
		assertEquals(1597, PrimeFib.primeFib(7));
	}
	
	@Test
	void testPrimeFib8() {
		assertEquals(28657, PrimeFib.primeFib(8));
	}
	
	@Test
	void testPrimeFib9() {
		assertEquals(514229, PrimeFib.primeFib(9));
	}
	
	@Test
	void testPrimeFib10() {
		assertEquals(433494437, PrimeFib.primeFib(10));
	}
}

// PrimeFib.java
package scenario3;

class PrimeFib {

    /**
     * Returns n-th number that is a Fibonacci number and it's also prime.
     *
     * > primeFib(1)
     * 2
     * > primeFib(2)
     * 3
     * > primeFib(3)
     * 5
     * > primeFib(4)
     * 13
     * > primeFib(5)
     * 89
     * > primeFib(1)
     * 2
     * > primeFib(2)
     * 3
     * > primeFib(3)
     * 5
     * > primeFib(4)
     * 13
     * > primeFib(5)
     * 89
     * > primeFib(6)
     * 233
     * > primeFib(7)
     * 1597
     * > primeFib(8)
     * 28657
     * > primeFib(9)
     * 514229
     * > primeFib(10)
     * 433494437
     */
    public static int primeFib(int n) {
        int a = 1;
        int b = 1;
        int c = 2;
        int i = 3;
        while (i < n) {
            a = b;
            b = c;
            c = a + b;
            i++;
        }
        return c;
    }
}

// PrimeFibTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains ten unit test cases for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {
		
	@Test
	void testPrimeFib1() {
		assertEquals(2, PrimeFib.primeFib(1));
	}
	
	@Test
	void testPrimeFib2() {
		assertEquals(3, PrimeFib.primeFib(2));
	}
	
	@Test
	void testPrimeFib3() {
		assertEquals(5, PrimeFib.primeFib(3));
	}
	
	@Test
	void testPrimeFib4() {
		assertEquals(13, PrimeFib.primeFib(4));
	}
	
	@Test
	void testPrimeFib5() {
		assertEquals(89, PrimeFib.primeFib(5));
	}
	
	@Test
	void testPrimeFib6() {
		assertEquals(233, PrimeFib.primeFib(6));
	}
	
	@Test
	void testPrimeFib7() {
		assertEquals(1597, PrimeFib.primeFib(7));
	}
	
	@Test
	void testPrimeFib8() {
		assertEquals(28657, PrimeFib.primeFib(8));
	}
	
	@Test
	void testPrimeFib9() {
		assertEquals(514229, PrimeFib.primeFib(9));
	}
	
	@Test
	void testPrimeFib10() {
		assertEquals(433494437, PrimeFib.primeFib(10));
	}
}

// PrimeFib.java
package scenario3;

class PrimeFib {

    /**
     * Returns n-th number that is a Fibonacci number and it's also prime.
     *
     * > primeFib(1)
     * 2
     * > primeFib(2)
     * 3
     * > primeFib(3)
     * 5
     * > primeFib(4)
     * 13
     * > primeFib(5)
     * 89
     * > primeFib(1)
     * 2
     * > primeFib(2)
     * 3
     * > primeFib(3)
     * 5
     * > primeFib(4)
     * 13
     * > primeFib(5)
     * 89
     * > primeFib(6)
     * 233
     * > primeFib(7)
     * 1597
     * > primeFib(8)
     * 28657
     * > primeFib(9)
     * 514229
     * > primeFib(10)
     * 433494437
     */
    public static int primeFib(int n) {
        int a = 1;
        int b = 1;
        int c = 2;
        int i = 3;
        while (i < n) {
            a = b;
            b = c;
            c = a + b;
            i++;
        }
        return c;
    }
}

// PrimeFibTest.java
package scenario3;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link PrimeFib}.
* It contains ten unit test cases for the {@link PrimeFib#primeFib(int)} method.
*/
class PrimeFibTest {
		
	@Test
	void testPrimeFib1() {
		assertEquals(2, PrimeFib.primeFib(1));
	}
	
	@Test
	void testPrimeFib2() {
		assertEquals(3, PrimeFib.primeFib(2));
	}
	
	@Test
	void testPrimeFib3() {
		assertEquals(5, PrimeFib.primeFib(3));
	}
	
	@Test
	void testPrimeFib4() {
		assertEquals(13, PrimeFib.primeFib(4));
	}
	
	@Test
	void