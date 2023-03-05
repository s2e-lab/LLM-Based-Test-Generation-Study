// UniformCrossoverTest.java
package brain.ga;

import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link UniformCrossover}.
* It contains ten unit test cases for the {@link UniformCrossover#cross(Genome, Genome)} method.
*/
class UniformCrossoverTest {

	/**
	* Test case for {@link UniformCrossover#cross(Genome, Genome)}.
	* It tests if the method returns a {@link Genome} object.
	*/
	@Test
	void testCross() {
		UniformCrossover uc = new UniformCrossover();
		VectorGenome vg1 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		VectorGenome vg2 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		assertTrue(uc.cross(vg1, vg2) instanceof Genome);
	}
	
	/**
	* Test case for {@link UniformCrossover#cross(Genome, Genome)}.
	* It tests if the method returns a {@link VectorGenome} object.
	*/
	@Test
	void testCross2() {
		UniformCrossover uc = new UniformCrossover();
		VectorGenome vg1 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		VectorGenome vg2 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		assertTrue(uc.cross(vg1, vg2) instanceof VectorGenome);
	}
	
	/**
	* Test case for {@link UniformCrossover#cross(Genome, Genome)}.
	* It tests if the method returns a {@link VectorGenome} object with the same number of genes as the parents.
	*/
	@Test
	void testCross3() {
		UniformCrossover uc = new UniformCrossover();
		VectorGenome vg1 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		VectorGenome vg2 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		vg1.addGene(new IntegerGene(0, 10));
		vg1.addGene(new IntegerGene(0, 10));
		vg1.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		assertEquals(vg1.getGenesCount(), uc.cross(vg1, vg2).getGenesCount());
	}
	
	/**
	* Test case for {@link UniformCrossover#cross(Genome, Genome)}.
	* It tests if the method returns a {@link VectorGenome} object with the same number of genes as the parents.
	*/
	@Test
	void testCross4() {
		UniformCrossover uc = new UniformCrossover();
		VectorGenome vg1 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		VectorGenome vg2 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		vg1.addGene(new IntegerGene(0, 10));
		vg1.addGene(new IntegerGene(0, 10));
		vg1.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		assertEquals(vg2.getGenesCount(), uc.cross(vg1, vg2).getGenesCount());
	}
	
	/**
	* Test case for {@link UniformCrossover#cross(Genome, Genome)}.
	* It tests if the method returns a {@link VectorGenome} object with the same number of genes as the parents.
	*/
	@Test
	void testCross5() {
		UniformCrossover uc = new UniformCrossover();
		VectorGenome vg1 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		VectorGenome vg2 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		vg1.addGene(new IntegerGene(0, 10));
		vg1.addGene(new IntegerGene(0, 10));
		vg1.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		assertEquals(vg1.getGenesCount(), uc.cross(vg1, vg2).getGenesCount());
	}
	
	/**
	* Test case for {@link UniformCrossover#cross(Genome, Genome)}.
	* It tests if the method returns a {@link VectorGenome} object with the same number of genes as the parents.
	*/
	@Test
	void testCross6() {
		UniformCrossover uc = new UniformCrossover();
		VectorGenome vg1 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		VectorGenome vg2 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		vg1.addGene(new IntegerGene(0, 10));
		vg1.addGene(new IntegerGene(0, 10));
		vg1.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		assertEquals(vg2.getGenesCount(), uc.cross(vg1, vg2).getGenesCount());
	}
	
	/**
	* Test case for {@link UniformCrossover#cross(Genome, Genome)}.
	* It tests if the method returns a {@link VectorGenome} object with the same number of genes as the parents.
	*/
	@Test
	void testCross7() {
		UniformCrossover uc = new UniformCrossover();
		VectorGenome vg1 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		VectorGenome vg2 = new VectorGenome(new Vector(), new Evaluator() {
			public double evaluate(Genome g) {
				return 0;
			}
		});
		vg1.addGene(new IntegerGene(0, 10));
		vg1.addGene(new IntegerGene(0, 10));
		vg1.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		vg2.addGene(new IntegerGene(0, 10));
		assertEquals(vg1.getGenesCount(), uc.