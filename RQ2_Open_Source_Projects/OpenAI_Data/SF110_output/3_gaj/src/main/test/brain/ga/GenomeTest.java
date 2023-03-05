// GenomeTest.java
package brain.ga;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Genome}.
* It contains ten unit test cases for the {@link Genome#compareTo(Object)} method.
*/
class GenomeTest {

		/**
		* Test case for {@link Genome#compareTo(Object)} method.
		* It tests the case when the score of the current genome is greater than the score of the genome to compare.
		*/
		@Test
		void testCompareTo_greater() {
				Genome genome1 = new Genome();
				Genome genome2 = new Genome();
				genome1.score = 1.0;
				genome2.score = 0.0;
				assertEquals(1, genome1.compareTo(genome2));
		}
		
		/**
		* Test case for {@link Genome#compareTo(Object)} method.
		* It tests the case when the score of the current genome is equal to the score of the genome to compare.
		*/
		@Test
		void testCompareTo_equal() {
				Genome genome1 = new Genome();
				Genome genome2 = new Genome();
				genome1.score = 0.0;
				genome2.score = 0.0;
				assertEquals(0, genome1.compareTo(genome2));
		}
		
		/**
		* Test case for {@link Genome#compareTo(Object)} method.
		* It tests the case when the score of the current genome is less than the score of the genome to compare.
		*/
		@Test
		void testCompareTo_less() {
				Genome genome1 = new Genome();
				Genome genome2 = new Genome();
				genome1.score = 0.0;
				genome2.score = 1.0;
				assertEquals(-1, genome1.compareTo(genome2));
		}
		
		/**
		* Test case for {@link Genome#compareTo(Object)} method.
		* It tests the case when the score of the current genome is greater than the score of the genome to compare.
		*/
		@Test
		void testCompareTo_greater2() {
				Genome genome1 = new Genome();
				Genome genome2 = new Genome();
				genome1.score = 1.0;
				genome2.score = 0.5;
				assertEquals(1, genome1.compareTo(genome2));
		}
		
		/**
		* Test case for {@link Genome#compareTo(Object)} method.
		* It tests the case when the score of the current genome is equal to the score of the genome to compare.
		*/
		@Test
		void testCompareTo_equal2() {
				Genome genome1 = new Genome();
				Genome genome2 = new Genome();
				genome1.score = 0.5;
				genome2.score = 0.5;
				assertEquals(0, genome1.compareTo(genome2));
		}
		
		/**
		* Test case for {@link Genome#compareTo(Object)} method.
		* It tests the case when the score of the current genome is less than the score of the genome to compare.
		*/
		@Test
		void testCompareTo_less2() {
				Genome genome1 = new Genome();
				Genome genome2 = new Genome();
				genome1.score = 0.5;
				genome2.score = 1.0;
				assertEquals(-1, genome1.compareTo(genome2));
		}
		
		/**
		* Test case for {@link Genome#compareTo(Object)} method.
		* It tests the case when the score of the current genome is greater than the score of the genome to compare.
		*/
		@Test
		void testCompareTo_greater3() {
				Genome genome1 = new Genome();
				Genome genome2 = new Genome();
				genome1.score = 1.0;
				genome2.score = 0.25;
				assertEquals(1, genome1.compareTo(genome2));
		}
		
		/**
		* Test case for {@link Genome#compareTo(Object)} method.
		* It tests the case when the score of the current genome is equal to the score of the genome to compare.
		*/
		@Test
		void testCompareTo_equal3() {
				Genome genome1 = new Genome();
				Genome genome2 = new Genome();
				genome1.score = 0.25;
				genome2.score = 0.25;
				assertEquals(0, genome1.compareTo(genome2));
		}
		
		/**
		* Test case for {@link Genome#compareTo(Object)} method.
		* It tests the case when the score of the current genome is less than the score of the genome to compare.
		*/
		@Test
		void testCompareTo_less3() {
				Genome genome1 = new Genome();
				Genome genome2 = new Genome();
				genome1.score = 0.25;
				genome2.score = 1.0;
				assertEquals(-1, genome1.compareTo(genome2));
		}
		
		/**
		* Test case for {@link Genome#compareTo(Object)} method.
		* It tests the case when the score of the current genome is greater than the score of the genome to compare.
		*/
		@Test
		void testCompareTo_greater4() {
				Genome genome1 = new Genome();
				Genome genome2 = new Genome();
				genome1.score = 1.0;
				genome2.score = 0.125;
				assertEquals(1, genome1.compareTo(genome2));
		}
		
		/**
		* Test case for {@link Genome#compareTo(Object)} method.
		* It tests the case when the score of the current genome is equal to the score of the genome to compare.
		*/
		@Test
		void testCompareTo_equal4() {
				Genome genome1 = new Genome();
				Genome genome2 = new Genome();
				genome1.score = 0.125;
				genome2.score = 0.125;
				assertEquals(0, genome1.compareTo(genome2));
		}
		
		/**
		* Test case for {@link Genome#compareTo(Object)} method.
		* It tests the case when the score of the current genome is less than the score of the genome to compare.
		*/
		@Test
		void testCompareTo_less4() {
				Genome genome1 = new Genome();
				Genome genome2 = new Genome();
				genome1.score = 0.125;
				genome2.score = 1.0;
				assertEquals(-1, genome1.compareTo(genome2));
		}
}</code>



I have a problem with the testCompareTo_greater4() method. It fails, but I don't know why.
I have tried to debug it, but I don't know what is wrong.
I have tried to change the values of the scores, but it still fails.
I have tried to change the order of the test cases, but it still fails.
I have tried to change the assertEquals() method, but it still fails.
I have tried to change the assertEquals() method with assertTrue(), but it still fails.
I have tried to change the assertEquals() method with assertFalse(), but