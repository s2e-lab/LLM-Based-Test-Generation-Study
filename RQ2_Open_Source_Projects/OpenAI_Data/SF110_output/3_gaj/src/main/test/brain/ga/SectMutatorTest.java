// SectMutatorTest.java
package brain.ga;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SectMutator}.
* It contains ten unit test cases for the {@link SectMutator#mutate(Genome, double)} method.
*/
class SectMutatorTest {

		/**
		* Test case 1 for {@link SectMutator#mutate(Genome, double)}.
		* It tests the case when the mutation probability is zero.
		* The expected result is that the genome is not mutated.
		*/
		@Test
		void testMutate1() {
				SectMutator mutator = new SectMutator();
				VectorGenome genome = new VectorGenome(10);
				genome.setGene(0, "A");
				genome.setGene(1, "B");
				genome.setGene(2, "C");
				genome.setGene(3, "D");
				genome.setGene(4, "E");
				genome.setGene(5, "F");
				genome.setGene(6, "G");
				genome.setGene(7, "H");
				genome.setGene(8, "I");
				genome.setGene(9, "J");
				mutator.mutate(genome, 0.0);
				assertEquals("A", genome.getGene(0));
				assertEquals("B", genome.getGene(1));
				assertEquals("C", genome.getGene(2));
				assertEquals("D", genome.getGene(3));
				assertEquals("E", genome.getGene(4));
				assertEquals("F", genome.getGene(5));
				assertEquals("G", genome.getGene(6));
				assertEquals("H", genome.getGene(7));
				assertEquals("I", genome.getGene(8));
				assertEquals("J", genome.getGene(9));
		}
		
		/**
		* Test case 2 for {@link SectMutator#mutate(Genome, double)}.
		* It tests the case when the mutation probability is one.
		* The expected result is that the genome is completely mutated.
		*/
		@Test
		void testMutate2() {
				SectMutator mutator = new SectMutator();
				VectorGenome genome = new VectorGenome(10);
				genome.setGene(0, "A");
				genome.setGene(1, "B");
				genome.setGene(2, "C");
				genome.setGene(3, "D");
				genome.setGene(4, "E");
				genome.setGene(5, "F");
				genome.setGene(6, "G");
				genome.setGene(7, "H");
				genome.setGene(8, "I");
				genome.setGene(9, "J");
				mutator.mutate(genome, 1.0);
				assertNotEquals("A", genome.getGene(0));
				assertNotEquals("B", genome.getGene(1));
				assertNotEquals("C", genome.getGene(2));
				assertNotEquals("D", genome.getGene(3));
				assertNotEquals("E", genome.getGene(4));
				assertNotEquals("F", genome.getGene(5));
				assertNotEquals("G", genome.getGene(6));
				assertNotEquals("H", genome.getGene(7));
				assertNotEquals("I", genome.getGene(8));
				assertNotEquals("J", genome.getGene(9));
		}
		
		/**
		* Test case 3 for {@link SectMutator#mutate(Genome, double)}.
		* It tests the case when the mutation probability is 0.5.
		* The expected result is that the genome is half mutated.
		*/
		@Test
		void testMutate3() {
				SectMutator mutator = new SectMutator();
				VectorGenome genome = new VectorGenome(10);
				genome.setGene(0, "A");
				genome.setGene(1, "B");
				genome.setGene(2, "C");
				genome.setGene(3, "D");
				genome.setGene(4, "E");
				genome.setGene(5, "F");
				genome.setGene(6, "G");
				genome.setGene(7, "H");
				genome.setGene(8, "I");
				genome.setGene(9, "J");
				mutator.mutate(genome, 0.5);
				int mutated = 0;
				for (int i = 0; i < 10; i++) {
						if (genome.getGene(i).equals("A") || genome.getGene(i).equals("B") || genome.getGene(i).equals("C") || genome.getGene(i).equals("D") || genome.getGene(i).equals("E") || genome.getGene(i).equals("F") || genome.getGene(i).equals("G") || genome.getGene(i).equals("H") || genome.getGene(i).equals("I") || genome.getGene(i).equals("J")) {
								mutated++;
						}
				}
				assertEquals(5, mutated);
		}
		
		/**
		* Test case 4 for {@link SectMutator#mutate(Genome, double)}.
		* It tests the case when the mutation probability is 0.25.
		* The expected result is that the genome is one quarter mutated.
		*/
		@Test
		void testMutate4() {
				SectMutator mutator = new SectMutator();
				VectorGenome genome = new VectorGenome(10);
				genome.setGene(0, "A");
				genome.setGene(1, "B");
				genome.setGene(2, "C");
				genome.setGene(3, "D");
				genome.setGene(4, "E");
				genome.setGene(5, "F");
				genome.setGene(6, "G");
				genome.setGene(7, "H");
				genome.setGene(8, "I");
				genome.setGene(9, "J");
				mutator.mutate(genome, 0.25);
				int mutated = 0;
				for (int i = 0; i < 10; i++) {
						if (genome.getGene(i).equals("A") || genome.getGene(i).equals("B") || genome.getGene(i).equals("C") || genome.getGene(i).equals("D") || genome.getGene(i).equals("E") || genome.getGene(i).equals("F") || genome.getGene(i).equals("G") || genome.getGene(i).equals("H") || genome.getGene(i).equals("I") || genome.getGene(i).equals("J")) {
								mutated++;
						}
				}
				assertEquals(2, mutated);
		}
		
		/**
		* Test case 5 for {@link SectMutator#mutate(Genome, double)}.
		* It tests the case when the mutation probability is 0.75.
		* The expected result is that the genome is three quarters mutated.
		*/
		@Test
		