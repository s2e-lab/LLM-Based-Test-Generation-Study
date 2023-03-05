// KnightTest0.java
package src;

import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Knight}.
* It contains ten unit test cases for the {@link Knight#isFiefdomMine(String)} method.
*/
class KnightTest0 {

		/**
		* Test case for {@link Knight#isFiefdomMine(String)} method.
		* It tests if the method returns true when the fiefdom is owned by the knight.
		*/
		@Test
		void testIsFiefdomMine_True() {
				Knight knight = new Knight("knight", "knight", "password");
				knight.setFiefdoms("Ile-De-France", true);
				assertTrue(knight.isFiefdomMine("Ile-De-France"));
		}
		
		/**
		* Test case for {@link Knight#isFiefdomMine(String)} method.
		* It tests if the method returns false when the fiefdom is not owned by the knight.
		*/
		@Test
		void testIsFiefdomMine_False() {
				Knight knight = new Knight("knight", "knight", "password");
				knight.setFiefdoms("Ile-De-France", true);
				assertFalse(knight.isFiefdomMine("Bretagne"));
		}
		
		/**
		* Test case for {@link Knight#isFiefdomMine(String)} method.
		* It tests if the method returns false when the fiefdom is not owned by the knight.
		*/
		@Test
		void testIsFiefdomMine_False2() {
				Knight knight = new Knight("knight", "knight", "password");
				knight.setFiefdoms("Ile-De-France", true);
				assertFalse(knight.isFiefdomMine("Bourgogne"));
		}
		
		/**
		* Test case for {@link Knight#isFiefdomMine(String)} method.
		* It tests if the method returns false when the fiefdom is not owned by the knight.
		*/
		@Test
		void testIsFiefdomMine_False3() {
				Knight knight = new Knight("knight", "knight", "password");
				knight.setFiefdoms("Ile-De-France", true);
				assertFalse(knight.isFiefdomMine("Normandie"));
		}
		
		/**
		* Test case for {@link Knight#isFiefdomMine(String)} method.
		* It tests if the method returns false when the fiefdom is not owned by the knight.
		*/
		@Test
		void testIsFiefdomMine_False4() {
				Knight knight = new Knight("knight", "knight", "password");
				knight.setFiefdoms("Ile-De-France", true);
				assertFalse(knight.isFiefdomMine("Anjou"));
		}
		
		/**
		* Test case for {@link Knight#isFiefdomMine(String)} method.
		* It tests if the method returns false when the fiefdom is not owned by the knight.
		*/
		@Test
		void testIsFiefdomMine_False5() {
				Knight knight = new Knight("knight", "knight", "password");
				knight.setFiefdoms("Ile-De-France", true);
				assertFalse(knight.isFiefdomMine("Poitou"));
		}
		
		/**
		* Test case for {@link Knight#isFiefdomMine(String)} method.
		* It tests if the method returns false when the fiefdom is not owned by the knight.
		*/
		@Test
		void testIsFiefdomMine_False6() {
				Knight knight = new Knight("knight", "knight", "password");
				knight.setFiefdoms("Ile-De-France", true);
				assertFalse(knight.isFiefdomMine("Aquitaine"));
		}
		
		/**
		* Test case for {@link Knight#isFiefdomMine(String)} method.
		* It tests if the method returns false when the fiefdom is not owned by the knight.
		*/
		@Test
		void testIsFiefdomMine_False7() {
				Knight knight = new Knight("knight", "knight", "password");
				knight.setFiefdoms("Ile-De-France", true);
				assertFalse(knight.isFiefdomMine("Provence"));
		}
		
		/**
		* Test case for {@link Knight#isFiefdomMine(String)} method.
		* It tests if the method returns false when the fiefdom is not owned by the knight.
		*/
		@Test
		void testIsFiefdomMine_False8() {
				Knight knight = new Knight("knight", "knight", "password");
				knight.setFiefdoms("Ile-De-France", true);
				assertFalse(knight.isFiefdomMine("Toulouse"));
		}
		
		/**
		* Test case for {@link Knight#isFiefdomMine(String)} method.
		* It tests if the method returns false when the fiefdom is not owned by the knight.
		*/
		@Test
		void testIsFiefdomMine_False9() {
				Knight knight = new Knight("knight", "knight", "password");
				knight.setFiefdoms("Ile-De-France", true);
				assertFalse(knight.isFiefdomMine("Bar"));
		}
		
		/**
		* Test case for {@link Knight#isFiefdomMine(String)} method.
		* It tests if the method returns false when the fiefdom is not owned by the knight.
		*/
		@Test
		void testIsFiefdomMine_False10() {
				Knight knight = new Knight("knight", "knight", "password");
				knight.setFiefdoms("Ile-De-France", true);
				assertFalse(knight.isFiefdomMine("Flandres"));
		}
}

// KnightTest1.java
package src;

import java.io.Serializable;
import java.net.Socket;
import java.util.ArrayList;
import java.util.Iterator;
import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Knight}.
* It contains ten unit test cases for the {@link Knight#isFiefdomMine(String)} method.
*/
class KnightTest1 {
		
		/**
		* Test case for {@link Knight#isFiefdomMine(String)} method.
		* It tests if the method returns true when the fiefdom is owned by the knight.
		*/
		@Test
		void testIsFiefdomMine_True() {
				Knight knight = new Knight("knight", "knight", "password");
				knight.setFiefdoms("Ile-De-France", true);
				assertTrue(knight.isFiefdomMine("Ile-De-France"));
		}
		
		/**
		* Test case for {@link Knight#isFiefdomMine(String)} method.
		* It tests if the method returns false when the fiefdom is not owned by the knight.
		*/
		@Test
		void testIsFiefdomMine_False() {
				Knight knight = new Knight("knight", "knight", "password");
				knight.setFiefdoms("Ile-De-France", true);
				assertFalse(knight.isFiefdomMine("Bretagne"));
		}
		
		/**
		* Test case for {@link Knight#isFiefdomMine(String