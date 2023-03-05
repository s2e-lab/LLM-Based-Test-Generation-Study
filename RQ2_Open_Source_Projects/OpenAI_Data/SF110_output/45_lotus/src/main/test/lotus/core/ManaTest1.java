// ManaTest1.java
package lotus.core;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Mana}.
* It contains ten unit test cases for the {@link Mana#canPay(Mana)} method.
*/
class ManaTest1 {

	/**
	* Test case 1.
	* The method {@link Mana#canPay(Mana)} should return true if the mana pool can pay the cost.
	*/
	@Test
	void testCanPay1() {
		Mana cost = new Mana(1, 1, 1, 1, 1, 1);
		Mana pool = new Mana(2, 2, 2, 2, 2, 2);
		assertTrue(pool.canPay(cost));
	}
	
	/**
	* Test case 2.
	* The method {@link Mana#canPay(Mana)} should return true if the mana pool can pay the cost.
	*/
	@Test
	void testCanPay2() {
		Mana cost = new Mana(1, 1, 1, 1, 1, 1);
		Mana pool = new Mana(1, 1, 1, 1, 1, 1);
		assertTrue(pool.canPay(cost));
	}
	
	/**
	* Test case 3.
	* The method {@link Mana#canPay(Mana)} should return true if the mana pool can pay the cost.
	*/
	@Test
	void testCanPay3() {
		Mana cost = new Mana(1, 1, 1, 1, 1, 1);
		Mana pool = new Mana(0, 0, 0, 0, 0, 2);
		assertTrue(pool.canPay(cost));
	}
	
	/**
	* Test case 4.
	* The method {@link Mana#canPay(Mana)} should return true if the mana pool can pay the cost.
	*/
	@Test
	void testCanPay4() {
		Mana cost = new Mana(1, 1, 1, 1, 1, 1);
		Mana pool = new Mana(0, 0, 0, 0, 0, 0);
		assertTrue(pool.canPay(cost));
	}
	
	/**
	* Test case 5.
	* The method {@link Mana#canPay(Mana)} should return false if the mana pool can't pay the cost.
	*/
	@Test
	void testCanPay5() {
		Mana cost = new Mana(1, 1, 1, 1, 1, 1);
		Mana pool = new Mana(0, 0, 0, 0, 0, 1);
		assertFalse(pool.canPay(cost));
	}
	
	/**
	* Test case 6.
	* The method {@link Mana#canPay(Mana)} should return false if the mana pool can't pay the cost.
	*/
	@Test
	void testCanPay6() {
		Mana cost = new Mana(1, 1, 1, 1, 1, 1);
		Mana pool = new Mana(0, 0, 0, 0, 0, 0);
		assertFalse(pool.canPay(cost));
	}
	
	/**
	* Test case 7.
	* The method {@link Mana#canPay(Mana)} should return false if the mana pool can't pay the cost.
	*/
	@Test
	void testCanPay7() {
		Mana cost = new Mana(1, 1, 1, 1, 1, 1);
		Mana pool = new Mana(0, 0, 0, 0, 0, 0);
		assertFalse(pool.canPay(cost));
	}
	
	/**
	* Test case 8.
	* The method {@link Mana#canPay(Mana)} should return false if the mana pool can't pay the cost.
	*/
	@Test
	void testCanPay8() {
		Mana cost = new Mana(1, 1, 1, 1, 1, 1);
		Mana pool = new Mana(0, 0, 0, 0, 0, 0);
		assertFalse(pool.canPay(cost));
	}
	
	/**
	* Test case 9.
	* The method {@link Mana#canPay(Mana)} should return false if the mana pool can't pay the cost.
	*/
	@Test
	void testCanPay9() {
		Mana cost = new Mana(1, 1, 1, 1, 1, 1);
		Mana pool = new Mana(0, 0, 0, 0, 0, 0);
		assertFalse(pool.canPay(cost));
	}
	
	/**
	* Test case 10.
	* The method {@link Mana#canPay(Mana)} should return false if the mana pool can't pay the cost.
	*/
	@Test
	void testCanPay10() {
		Mana cost = new Mana(1, 1, 1, 1, 1, 1);
		Mana pool = new Mana(0, 0, 0, 0, 0, 0);
		assertFalse(pool.canPay(cost));
	}
}

// ManaTest2.java
package lotus.core;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Mana}.
* It contains ten unit test cases for the {@link Mana#containsColor(Mana.Color)} method.
*/
class ManaTest2 {
		
	/**
	* Test case 1.
	* The method {@link Mana#containsColor(Mana.Color)} should return true if the mana pool contains the color.
	*/
	@Test
	void testContainsColor1() {
		Mana pool = new Mana(1, 1, 1, 1, 1, 1);
		assertTrue(pool.containsColor(Mana.Color.WHITE));
	}
	
	/**
	* Test case 2.
	* The method {@link Mana#containsColor(Mana.Color)} should return true if the mana pool contains the color.
	*/
	@Test
	void testContainsColor2() {
		Mana pool = new Mana(1, 1, 1, 1, 1, 1);
		assertTrue(pool.containsColor(Mana.Color.BLUE));
	}
	
	/**
	* Test case 3.
	* The method {@link Mana#containsColor(Mana.Color)} should return true if the mana pool contains the color.
	*/
	@Test
	void testContainsColor3() {
		Mana pool = new Mana(1, 1, 1, 1, 1, 1);
		assertTrue(pool.containsColor(Mana.Color.BLACK));
	}
	
	/**
	* Test case 4.
	* The method {@link Mana#containsColor(Mana.Color)} should return true if the mana pool contains the color.
	*/
	@Test
	void testContainsColor4() {
		Mana pool = new Mana(1, 1, 1, 1, 1, 1);
		assertTrue(pool.containsColor(Mana.Color.RED));
	}
	
	/**
	* Test case 5.
	* The method {@link Mana#containsColor(Mana.Color)} should return true if the mana pool contains the color.
	*/
	@Test
	void testContainsColor5() {
		Mana pool = new Mana(1, 1, 1, 1, 1, 1);
		assertTrue(pool.containsColor(Mana.Color.GREEN));
	}
	
	/**
	* Test case 6.
	* The method {@link Mana#containsColor(Mana.Color)} should return true if the mana pool contains the color.
	*/
	@Test
	void testContainsColor6() {
		Mana pool = new Mana(1, 1, 1, 1, 1, 1);
		assertTrue(pool.containsColor(Mana.Color.COLORLESS));
	}
	
	/**
	* Test case 7.
	* The method {@link Mana#containsColor(Mana.Color)} should return false if the mana pool doesn't contain the color.
	*/
	@Test
	void testContainsColor7() {
		Mana pool = new Mana(0, 0, 0, 0, 0, 0);
		assertFalse(pool.containsColor(Mana.Color.WHITE));
	}
	
	/**
	* Test case 8.
	* The method {@link Mana#containsColor(Mana.Color)} should return false if the mana pool doesn't contain the color.
	*/
	@Test
	void testContainsColor