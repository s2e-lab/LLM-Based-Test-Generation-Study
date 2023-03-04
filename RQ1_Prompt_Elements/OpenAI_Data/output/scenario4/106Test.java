// FTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link F}.
* It contains ten unit test cases for the {@link F#f(int)} method.
*/
class FTest {

	@Test
	void testF() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		assertEquals(expected, F.f(5));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		expected.add(720);
		expected.add(28);
		assertEquals(expected, F.f(7));
		
		expected = new ArrayList<>();
		expected.add(1);
		assertEquals(expected, F.f(1));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		assertEquals(expected, F.f(3));
	}
}

// G.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class G {

    /**
     * Implement the function g that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     * Example:
     * g(5) == [1, 2, 6, 24, 15]
     *
     * > g(5)
     * [1, 2, 6, 24, 15]
     * > g(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > g(1)
     * [1]
     * > g(3)
     * [1, 2, 6]
     */
    public static List<Integer> g(int n) {
    }
}

// GTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link G}.
* It contains ten unit test cases for the {@link G#g(int)} method.
*/
class GTest {
		
	@Test
	void testG() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		assertEquals(expected, G.g(5));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		expected.add(720);
		expected.add(28);
		assertEquals(expected, G.g(7));
		
		expected = new ArrayList<>();
		expected.add(1);
		assertEquals(expected, G.g(1));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		assertEquals(expected, G.g(3));
	}
}

// H.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class H {

    /**
     * Implement the function h that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     * Example:
     * h(5) == [1, 2, 6, 24, 15]
     *
     * > h(5)
     * [1, 2, 6, 24, 15]
     * > h(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > h(1)
     * [1]
     * > h(3)
     * [1, 2, 6]
     */
    public static List<Integer> h(int n) {
    }
}

// HTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link H}.
* It contains ten unit test cases for the {@link H#h(int)} method.
*/
class HTest {
		
	@Test
	void testH() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		assertEquals(expected, H.h(5));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		expected.add(720);
		expected.add(28);
		assertEquals(expected, H.h(7));
		
		expected = new ArrayList<>();
		expected.add(1);
		assertEquals(expected, H.h(1));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		assertEquals(expected, H.h(3));
	}
}

// I.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class I {

    /**
     * Implement the function i that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     * Example:
     * i(5) == [1, 2, 6, 24, 15]
     *
     * > i(5)
     * [1, 2, 6, 24, 15]
     * > i(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > i(1)
     * [1]
     * > i(3)
     * [1, 2, 6]
     */
    public static List<Integer> i(int n) {
    }
}

// ITest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link I}.
* It contains ten unit test cases for the {@link I#i(int)} method.
*/
class ITest {
		
	@Test
	void testI() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		assertEquals(expected, I.i(5));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		expected.add(720);
		expected.add(28);
		assertEquals(expected, I.i(7));
		
		expected = new ArrayList<>();
		expected.add(1);
		assertEquals(expected, I.i(1));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		assertEquals(expected, I.i(3));
	}
}

// J.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class J {

    /**
     * Implement the function j that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     * Example:
     * j(5) == [1, 2, 6, 24, 15]
     *
     * > j(5)
     * [1, 2, 6, 24, 15]
     * > j(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > j(1)
     * [1]
     * > j(3)
     * [1, 2, 6]
     */
    public static List<Integer> j(int n) {
    }
}

// JTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link J}.
* It contains ten unit test cases for the {@link J#j(int)} method.
*/
class JTest {
		
	@Test
	void testJ() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		assertEquals(expected, J.j(5));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		expected.add(720);
		expected.add(28);
		assertEquals(expected, J.j(7));
		
		expected = new ArrayList<>();
		expected.add(1);
		assertEquals(expected, J.j(1));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		assertEquals(expected, J.j(3));
	}
}

// K.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class K {

    /**
     * Implement the function k that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     * Example:
     * k(5) == [1, 2, 6, 24, 15]
     *
     * > k(5)
     * [1, 2, 6, 24, 15]
     * > k(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > k(1)
     * [1]
     * > k(3)
     * [1, 2, 6]
     */
    public static List<Integer> k(int n) {
    }
}

// KTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link K}.
* It contains ten unit test cases for the {@link K#k(int)} method.
*/
class KTest {
		
	@Test
	void testK() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		assertEquals(expected, K.k(5));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		expected.add(720);
		expected.add(28);
		assertEquals(expected, K.k(7));
		
		expected = new ArrayList<>();
		expected.add(1);
		assertEquals(expected, K.k(1));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		assertEquals(expected, K.k(3));
	}
}

// L.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class L {

    /**
     * Implement the function l that takes n as a parameter,
     * and returns a list of size n, such that the value of the element at index i is the factorial of i if i is even
     * or the sum of numbers from 1 to i otherwise.
     * i starts from 1.
     * the factorial of i is the multiplication of the numbers from 1 to i (1 * 2 * ... * i).
     * Example:
     * l(5) == [1, 2, 6, 24, 15]
     *
     * > l(5)
     * [1, 2, 6, 24, 15]
     * > l(7)
     * [1, 2, 6, 24, 15, 720, 28]
     * > l(1)
     * [1]
     * > l(3)
     * [1, 2, 6]
     */
    public static List<Integer> l(int n) {
    }
}

// LTest.java
package scenario3;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link L}.
* It contains ten unit test cases for the {@link L#l(int)} method.
*/
class LTest {
		
	@Test
	void testL() {
		List<Integer> expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add(15);
		assertEquals(expected, L.l(5));
		
		expected = new ArrayList<>();
		expected.add(1);
		expected.add(2);
		expected.add(6);
		expected.add(24);
		expected.add