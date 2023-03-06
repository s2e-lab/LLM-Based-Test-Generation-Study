// FiefdomsTest.java
package src;

import java.io.Serializable;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fiefdoms}.
* It contains ten unit test cases for the {@link Fiefdoms#isKingdom()} method.
*/
class FiefdomsTest {

		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns true when the fiefdom is a kingdom.
		*/
		@Test
		void testIsKingdomTrue() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(true);
				assertTrue(fiefdom.isKingdom());
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns false when the fiefdom is not a kingdom.
		*/
		@Test
		void testIsKingdomFalse() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(false);
				assertFalse(fiefdom.isKingdom());
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns false when the fiefdom is a kingdom.
		*/
		@Test
		void testIsKingdomFalse2() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(true);
				assertFalse(!fiefdom.isKingdom());
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns true when the fiefdom is not a kingdom.
		*/
		@Test
		void testIsKingdomTrue2() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(false);
				assertTrue(!fiefdom.isKingdom());
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns true when the fiefdom is a kingdom.
		*/
		@Test
		void testIsKingdomTrue3() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(true);
				assertTrue(fiefdom.isKingdom() == true);
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns false when the fiefdom is not a kingdom.
		*/
		@Test
		void testIsKingdomFalse3() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(false);
				assertFalse(fiefdom.isKingdom() == false);
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns false when the fiefdom is a kingdom.
		*/
		@Test
		void testIsKingdomFalse4() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(true);
				assertFalse(fiefdom.isKingdom() == false);
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns true when the fiefdom is not a kingdom.
		*/
		@Test
		void testIsKingdomTrue4() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(false);
				assertTrue(fiefdom.isKingdom() == true);
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns true when the fiefdom is a kingdom.
		*/
		@Test
		void testIsKingdomTrue5() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(true);
				assertTrue(fiefdom.isKingdom() != false);
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns false when the fiefdom is not a kingdom.
		*/
		@Test
		void testIsKingdomFalse5() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(false);
				assertFalse(fiefdom.isKingdom() != true);
		}
}

// FiefdomsTest.java
package src;

import java.io.Serializable;
import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Fiefdoms}.
* It contains ten unit test cases for the {@link Fiefdoms#isKingdom()} method.
*/
class FiefdomsTest {
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns true when the fiefdom is a kingdom.
		*/
		@Test
		void testIsKingdomTrue() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(true);
				assertTrue(fiefdom.isKingdom());
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns false when the fiefdom is not a kingdom.
		*/
		@Test
		void testIsKingdomFalse() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(false);
				assertFalse(fiefdom.isKingdom());
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns false when the fiefdom is a kingdom.
		*/
		@Test
		void testIsKingdomFalse2() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(true);
				assertFalse(!fiefdom.isKingdom());
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns true when the fiefdom is not a kingdom.
		*/
		@Test
		void testIsKingdomTrue2() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(false);
				assertTrue(!fiefdom.isKingdom());
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns true when the fiefdom is a kingdom.
		*/
		@Test
		void testIsKingdomTrue3() {
				Fiefdoms fiefdom = new Fiefdoms();
				fiefdom.setKingdom(true);
				assertTrue(fiefdom.isKingdom() == true);
		}
		
		/**
		* Test case for {@link Fiefdoms#isKingdom()} method.
		* It tests if the method returns false when the fiefdom is not a kingdom.
		*/
		@Test
		void testIsKingdomFalse3() {
				Fiefdoms fiefdom = new Fiefdoms();
				fief