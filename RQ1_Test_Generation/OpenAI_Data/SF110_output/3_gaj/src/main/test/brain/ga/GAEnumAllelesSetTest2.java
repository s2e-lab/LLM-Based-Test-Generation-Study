// GAEnumAllelesSetTest2.java
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
* It contains ten unit test cases for the {@link GAEnumAllelesSet#size()} method.
*/
class GAEnumAllelesSetTest2 {

		/**
		* Test case for the {@link GAEnumAllelesSet#size()} method.
		* It checks if the size of the alleles set is equal to the number of elements in the vector.
		*/
		@Test
		void testSize() {
				GAEnumAllelesSet allelesSet = new GAEnumAllelesSet();
				Vector alleles = new Vector();
				alleles.add("A");
				alleles.add("B");
				alleles.add("C");
				allelesSet.setAlleles(alleles);
				assertEquals(3, allelesSet.size());
		}
}</code></pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>
</div>

</code>
</pre>
</div>