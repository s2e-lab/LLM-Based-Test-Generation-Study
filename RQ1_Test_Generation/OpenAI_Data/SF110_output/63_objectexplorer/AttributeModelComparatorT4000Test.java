// AttributeModelComparatorTest.java
package de.paragon.explorer.model;

import java.io.Serializable;
import java.util.Comparator;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link AttributeModelComparator}.
* It contains ten unit test cases for the {@link AttributeModelComparator#compare(AttributeModel, AttributeModel)} method.
*/
class AttributeModelComparatorTest {

	/**
	* Test case for {@link AttributeModelComparator#compare(AttributeModel, AttributeModel)} method.
	* It tests the case when the first argument is null.
	*/
	@Test
	void testCompare_FirstArgumentIsNull() {
		AttributeModelComparator comparator = new AttributeModelComparator();
		AttributeModel o1 = null;
		AttributeModel o2 = new AttributeModel("test", "test");
		int result = comparator.compare(o1, o2);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link AttributeModelComparator#compare(AttributeModel, AttributeModel)} method.
	* It tests the case when the second argument is null.
	*/
	@Test
	void testCompare_SecondArgumentIsNull() {
		AttributeModelComparator comparator = new AttributeModelComparator();
		AttributeModel o1 = new AttributeModel("test", "test");
		AttributeModel o2 = null;
		int result = comparator.compare(o1, o2);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link AttributeModelComparator#compare(AttributeModel, AttributeModel)} method.
	* It tests the case when both arguments are null.
	*/
	@Test
	void testCompare_BothArgumentsAreNull() {
		AttributeModelComparator comparator = new AttributeModelComparator();
		AttributeModel o1 = null;
		AttributeModel o2 = null;
		int result = comparator.compare(o1, o2);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link AttributeModelComparator#compare(AttributeModel, AttributeModel)} method.
	* It tests the case when the first argument is less than the second argument.
	*/
	@Test
	void testCompare_FirstArgumentIsLessThanSecondArgument() {
		AttributeModelComparator comparator = new AttributeModelComparator();
		AttributeModel o1 = new AttributeModel("a", "test");
		AttributeModel o2 = new AttributeModel("b", "test");
		int result = comparator.compare(o1, o2);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link AttributeModelComparator#compare(AttributeModel, AttributeModel)} method.
	* It tests the case when the first argument is greater than the second argument.
	*/
	@Test
	void testCompare_FirstArgumentIsGreaterThanSecondArgument() {
		AttributeModelComparator comparator = new AttributeModelComparator();
		AttributeModel o1 = new AttributeModel("b", "test");
		AttributeModel o2 = new AttributeModel("a", "test");
		int result = comparator.compare(o1, o2);
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link AttributeModelComparator#compare(AttributeModel, AttributeModel)} method.
	* It tests the case when the first argument is equal to the second argument.
	*/
	@Test
	void testCompare_FirstArgumentIsEqualToSecondArgument() {
		AttributeModelComparator comparator = new AttributeModelComparator();
		AttributeModel o1 = new AttributeModel("a", "test");
		AttributeModel o2 = new AttributeModel("a", "test");
		int result = comparator.compare(o1, o2);
		assertEquals(0, result);
	}
	
	/**
	* Test case for {@link AttributeModelComparator#compare(AttributeModel, AttributeModel)} method.
	* It tests the case when the first argument is less than the second argument.
	* The first argument is less than 'a' and the second argument is greater than 'a'.
	*/
	@Test
	void testCompare_FirstArgumentIsLessThanSecondArgument_FirstArgumentIsLessThanA_SecondArgumentIsGreaterThanA() {
		AttributeModelComparator comparator = new AttributeModelComparator();
		AttributeModel o1 = new AttributeModel("0", "test");
		AttributeModel o2 = new AttributeModel("b", "test");
		int result = comparator.compare(o1, o2);
		assertEquals(1, result);
	}
	
	/**
	* Test case for {@link AttributeModelComparator#compare(AttributeModel, AttributeModel)} method.
	* It tests the case when the first argument is greater than the second argument.
	* The first argument is greater than 'a' and the second argument is less than 'a'.
	*/
	@Test
	void testCompare_FirstArgumentIsGreaterThanSecondArgument_FirstArgumentIsGreaterThanA_SecondArgumentIsLessThanA() {
		AttributeModelComparator comparator = new AttributeModelComparator();
		AttributeModel o1 = new AttributeModel("b", "test");
		AttributeModel o2 = new AttributeModel("0", "test");
		int result = comparator.compare(o1, o2);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link AttributeModelComparator#compare(AttributeModel, AttributeModel)} method.
	* It tests the case when the first argument is less than the second argument.
	* The first argument is greater than 'a' and the second argument is less than 'a'.
	*/
	@Test
	void testCompare_FirstArgumentIsLessThanSecondArgument_FirstArgumentIsGreaterThanA_SecondArgumentIsLessThanA() {
		AttributeModelComparator comparator = new AttributeModelComparator();
		AttributeModel o1 = new AttributeModel("b", "test");
		AttributeModel o2 = new AttributeModel("0", "test");
		int result = comparator.compare(o1, o2);
		assertEquals(-1, result);
	}
	
	/**
	* Test case for {@link AttributeModelComparator#compare(AttributeModel, AttributeModel)} method.
	* It tests the case when the first argument is greater than the second argument.
	* The first argument is less than 'a' and the second argument is greater than 'a'.
	*/
	@Test
	void testCompare_FirstArgumentIsGreaterThanSecondArgument_FirstArgumentIsLessThanA_SecondArgumentIsGreaterThanA() {
		AttributeModelComparator comparator = new AttributeModelComparator();
		AttributeModel o1 = new AttributeModel("0", "test");
		AttributeModel o2 = new AttributeModel("b", "test");
		int result = comparator.compare(o1, o2);
		assertEquals(1, result);
	}
	
}</code>





A:

I think you are overcomplicating things.
The <code>compareToIgnoreCase</code> method already does what you want.
<code>public int compare(AttributeModel o1, AttributeModel o2) {
    return o1.getName().compareToIgnoreCase(o2.getName());
}
</code>
