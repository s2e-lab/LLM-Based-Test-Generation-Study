// GAEnumAllelesSetTest0.java
package brain.ga;

//The allele set class is a container for the different values that a gene may assume.
//If you call the allele member function with no argument,
//the allele set picks randomly from the alleles it contains
//and returns one of them
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GAEnumAllelesSet}.
* It contains ten unit test cases for the {@link GAEnumAllelesSet#allele()} method.
*/
class GAEnumAllelesSetTest0 {

		/**
		* Test case for the {@link GAEnumAllelesSet#allele()} method.
		*/
		@Test
		void testAllele0() {
				GAEnumAllelesSet gaEnumAllelesSet = new GAEnumAllelesSet();
				Vector<Object> alleles = new Vector<Object>();
				alleles.add(new Integer(0));
				alleles.add(new Integer(1));
				alleles.add(new Integer(2));
				alleles.add(new Integer(3));
				alleles.add(new Integer(4));
				alleles.add(new Integer(5));
				alleles.add(new Integer(6));
				alleles.add(new Integer(7));
				alleles.add(new Integer(8));
				alleles.add(new Integer(9));
				gaEnumAllelesSet.setAlleles(alleles);
				assertEquals(new Integer(0), gaEnumAllelesSet.allele());
		}
		
		/**
		* Test case for the {@link GAEnumAllelesSet#allele()} method.
		*/
		@Test
		void testAllele1() {
				GAEnumAllelesSet gaEnumAllelesSet = new GAEnumAllelesSet();
				Vector<Object> alleles = new Vector<Object>();
				alleles.add(new Integer(0));
				alleles.add(new Integer(1));
				alleles.add(new Integer(2));
				alleles.add(new Integer(3));
				alleles.add(new Integer(4));
				alleles.add(new Integer(5));
				alleles.add(new Integer(6));
				alleles.add(new Integer(7));
				alleles.add(new Integer(8));
				alleles.add(new Integer(9));
				gaEnumAllelesSet.setAlleles(alleles);
				assertEquals(new Integer(1), gaEnumAllelesSet.allele());
		}
		
		/**
		* Test case for the {@link GAEnumAllelesSet#allele()} method.
		*/
		@Test
		void testAllele2() {
				GAEnumAllelesSet gaEnumAllelesSet = new GAEnumAllelesSet();
				Vector<Object> alleles = new Vector<Object>();
				alleles.add(new Integer(0));
				alleles.add(new Integer(1));
				alleles.add(new Integer(2));
				alleles.add(new Integer(3));
				alleles.add(new Integer(4));
				alleles.add(new Integer(5));
				alleles.add(new Integer(6));
				alleles.add(new Integer(7));
				alleles.add(new Integer(8));
				alleles.add(new Integer(9));
				gaEnumAllelesSet.setAlleles(alleles);
				assertEquals(new Integer(2), gaEnumAllelesSet.allele());
		}
		
		/**
		* Test case for the {@link GAEnumAllelesSet#allele()} method.
		*/
		@Test
		void testAllele3() {
				GAEnumAllelesSet gaEnumAllelesSet = new GAEnumAllelesSet();
				Vector<Object> alleles = new Vector<Object>();
				alleles.add(new Integer(0));
				alleles.add(new Integer(1));
				alleles.add(new Integer(2));
				alleles.add(new Integer(3));
				alleles.add(new Integer(4));
				alleles.add(new Integer(5));
				alleles.add(new Integer(6));
				alleles.add(new Integer(7));
				alleles.add(new Integer(8));
				alleles.add(new Integer(9));
				gaEnumAllelesSet.setAlleles(alleles);
				assertEquals(new Integer(3), gaEnumAllelesSet.allele());
		}
		
		/**
		* Test case for the {@link GAEnumAllelesSet#allele()} method.
		*/
		@Test
		void testAllele4() {
				GAEnumAllelesSet gaEnumAllelesSet = new GAEnumAllelesSet();
				Vector<Object> alleles = new Vector<Object>();
				alleles.add(new Integer(0));
				alleles.add(new Integer(1));
				alleles.add(new Integer(2));
				alleles.add(new Integer(3));
				alleles.add(new Integer(4));
				alleles.add(new Integer(5));
				alleles.add(new Integer(6));
				alleles.add(new Integer(7));
				alleles.add(new Integer(8));
				alleles.add(new Integer(9));
				gaEnumAllelesSet.setAlleles(alleles);
				assertEquals(new Integer(4), gaEnumAllelesSet.allele());
		}
		
		/**
		* Test case for the {@link GAEnumAllelesSet#allele()} method.
		*/
		@Test
		void testAllele5() {
				GAEnumAllelesSet gaEnumAllelesSet = new GAEnumAllelesSet();
				Vector<Object> alleles = new Vector<Object>();
				alleles.add(new Integer(0));
				alleles.add(new Integer(1));
				alleles.add(new Integer(2));
				alleles.add(new Integer(3));
				alleles.add(new Integer(4));
				alleles.add(new Integer(5));
				alleles.add(new Integer(6));
				alleles.add(new Integer(7));
				alleles.add(new Integer(8));
				alleles.add(new Integer(9));
				gaEnumAllelesSet.setAlleles(alleles);
				assertEquals(new Integer(5), gaEnumAllelesSet.allele());
		}
		
		/**
		* Test case for the {@link GAEnumAllelesSet#allele()} method.
		*/
		@Test
		void testAllele6() {
				GAEnumAllelesSet gaEnumAllelesSet = new GAEnumAllelesSet();
				Vector<Object> alleles = new Vector<Object>();
				alleles.add(new Integer(0));
				alleles.add(new Integer(1));
				alleles.add(new Integer(2));
				alleles.add(new Integer(3));
				alleles.add(new Integer(4));
				alleles.add(new Integer(5));
				alleles.add(new Integer(6));
				alleles.add(new Integer(7));
				alleles.add(new Integer(8));
				alleles.add(new Integer(9));
				gaEnum