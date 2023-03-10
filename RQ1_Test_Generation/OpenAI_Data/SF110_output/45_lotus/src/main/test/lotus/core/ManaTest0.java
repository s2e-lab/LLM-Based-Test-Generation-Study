// ManaTest0.java
package lotus.core;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Mana}.
* It contains ten unit test cases for the {@link Mana#containsColor(Color)} method.
*/
class ManaTest0 {

		/**
		* Test case for {@link Mana#containsColor(Color)} method.
		* It checks if the method returns true when the mana pool contains the color.
		*/
		@Test
		void testContainsColor_True() {
				Mana mana = new Mana(1, 1, 1, 1, 1, 1);
				assertTrue(mana.containsColor(Mana.Color.WHITE));
				assertTrue(mana.containsColor(Mana.Color.BLUE));
				assertTrue(mana.containsColor(Mana.Color.BLACK));
				assertTrue(mana.containsColor(Mana.Color.RED));
				assertTrue(mana.containsColor(Mana.Color.GREEN));
				assertTrue(mana.containsColor(Mana.Color.COLORLESS));
		}
		
		/**
		* Test case for {@link Mana#containsColor(Color)} method.
		* It checks if the method returns false when the mana pool does not contain the color.
		*/
		@Test
		void testContainsColor_False() {
				Mana mana = new Mana(0, 0, 0, 0, 0, 0);
				assertFalse(mana.containsColor(Mana.Color.WHITE));
				assertFalse(mana.containsColor(Mana.Color.BLUE));
				assertFalse(mana.containsColor(Mana.Color.BLACK));
				assertFalse(mana.containsColor(Mana.Color.RED));
				assertFalse(mana.containsColor(Mana.Color.GREEN));
				assertFalse(mana.containsColor(Mana.Color.COLORLESS));
		}
		
		/**
		* Test case for {@link Mana#containsColor(Color)} method.
		* It checks if the method returns false when the mana pool contains the color but the amount is zero.
		*/
		@Test
		void testContainsColor_Zero() {
				Mana mana = new Mana(0, 0, 0, 0, 0, 0);
				assertFalse(mana.containsColor(Mana.Color.WHITE));
				assertFalse(mana.containsColor(Mana.Color.BLUE));
				assertFalse(mana.containsColor(Mana.Color.BLACK));
				assertFalse(mana.containsColor(Mana.Color.RED));
				assertFalse(mana.containsColor(Mana.Color.GREEN));
				assertFalse(mana.containsColor(Mana.Color.COLORLESS));
		}
		
		/**
		* Test case for {@link Mana#containsColor(Color)} method.
		* It checks if the method returns true when the mana pool contains the color and the amount is zero.
		*/
		@Test
		void testContainsColor_Zero_True() {
				Mana mana = new Mana(0, 0, 0, 0, 0, 1);
				assertTrue(mana.containsColor(Mana.Color.COLORLESS));
		}
		
		/**
		* Test case for {@link Mana#containsColor(Color)} method.
		* It checks if the method returns false when the mana pool contains the color but the amount is negative.
		*/
		@Test
		void testContainsColor_Negative() {
				Mana mana = new Mana(-1, -1, -1, -1, -1, -1);
				assertFalse(mana.containsColor(Mana.Color.WHITE));
				assertFalse(mana.containsColor(Mana.Color.BLUE));
				assertFalse(mana.containsColor(Mana.Color.BLACK));
				assertFalse(mana.containsColor(Mana.Color.RED));
				assertFalse(mana.containsColor(Mana.Color.GREEN));
				assertFalse(mana.containsColor(Mana.Color.COLORLESS));
		}
		
		/**
		* Test case for {@link Mana#containsColor(Color)} method.
		* It checks if the method returns true when the mana pool contains the color and the amount is negative.
		*/
		@Test
		void testContainsColor_Negative_True() {
				Mana mana = new Mana(-1, -1, -1, -1, -1, -1);
				assertTrue(mana.containsColor(Mana.Color.WHITE));
				assertTrue(mana.containsColor(Mana.Color.BLUE));
				assertTrue(mana.containsColor(Mana.Color.BLACK));
				assertTrue(mana.containsColor(Mana.Color.RED));
				assertTrue(mana.containsColor(Mana.Color.GREEN));
				assertTrue(mana.containsColor(Mana.Color.COLORLESS));
		}
		
		/**
		* Test case for {@link Mana#containsColor(Color)} method.
		* It checks if the method returns true when the mana pool contains the color and the amount is negative.
		*/
		@Test
		void testContainsColor_Negative_Zero() {
				Mana mana = new Mana(-1, -1, -1, -1, -1, 0);
				assertFalse(mana.containsColor(Mana.Color.WHITE));
				assertFalse(mana.containsColor(Mana.Color.BLUE));
				assertFalse(mana.containsColor(Mana.Color.BLACK));
				assertFalse(mana.containsColor(Mana.Color.RED));
				assertFalse(mana.containsColor(Mana.Color.GREEN));
				assertFalse(mana.containsColor(Mana.Color.COLORLESS));
		}
		
		/**
		* Test case for {@link Mana#containsColor(Color)} method.
		* It checks if the method returns true when the mana pool contains the color and the amount is negative.
		*/
		@Test
		void testContainsColor_Negative_Zero_True() {
				Mana mana = new Mana(-1, -1, -1, -1, -1, 0);
				assertTrue(mana.containsColor(Mana.Color.WHITE));
				assertTrue(mana.containsColor(Mana.Color.BLUE));
				assertTrue(mana.containsColor(Mana.Color.BLACK));
				assertTrue(mana.containsColor(Mana.Color.RED));
				assertTrue(mana.containsColor(Mana.Color.GREEN));
		}
		
		/**
		* Test case for {@link Mana#containsColor(Color)} method.
		* It checks if the method returns true when the mana pool contains the color and the amount is negative.
		*/
		@Test
		void testContainsColor_Negative_Zero_False() {
				Mana mana = new Mana(-1, -1, -1, -1, -1, 0);
				assertFalse(mana.containsColor(Mana.Color.COLORLESS));
		}
		
}

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
		* Test case for {@link Mana#canPay(Mana)} method.
		* It checks if the method returns true when the mana pool can pay the cost