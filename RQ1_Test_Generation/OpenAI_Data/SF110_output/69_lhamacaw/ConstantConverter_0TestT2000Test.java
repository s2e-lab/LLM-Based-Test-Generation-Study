// ConstantConverter_0Test.java
package macaw.businessLayer;

import java.util.ArrayList;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ConstantConverter}.
* It contains ten unit test cases for the {@link ConstantConverter#getCategoryChoices(ArrayList)} method.
*/
class ConstantConverter_0Test {

	/**
	* Test case for the {@link ConstantConverter#getCategoryChoices(ArrayList)} method.
	* Test data: empty list.
	* Expected result: empty array.
	*/
	@Test
	void testGetCategoryChoices_0() {
		ArrayList<Category> categories = new ArrayList<Category>();
		String[] result = ConstantConverter.getCategoryChoices(categories);
		assertEquals(0, result.length);
	}
	
	/**
	* Test case for the {@link ConstantConverter#getCategoryChoices(ArrayList)} method.
	* Test data: list with one element.
	* Expected result: array with one element.
	*/
	@Test
	void testGetCategoryChoices_1() {
		ArrayList<Category> categories = new ArrayList<Category>();
		categories.add(new Category("category1"));
		String[] result = ConstantConverter.getCategoryChoices(categories);
		assertEquals(1, result.length);
		assertEquals("category1", result[0]);
	}
	
	/**
	* Test case for the {@link ConstantConverter#getCategoryChoices(ArrayList)} method.
	* Test data: list with two elements.
	* Expected result: array with two elements.
	*/
	@Test
	void testGetCategoryChoices_2() {
		ArrayList<Category> categories = new ArrayList<Category>();
		categories.add(new Category("category1"));
		categories.add(new Category("category2"));
		String[] result = ConstantConverter.getCategoryChoices(categories);
		assertEquals(2, result.length);
		assertEquals("category1", result[0]);
		assertEquals("category2", result[1]);
	}
	
	/**
	* Test case for the {@link ConstantConverter#getCategoryChoices(ArrayList)} method.
	* Test data: list with three elements.
	* Expected result: array with three elements.
	*/
	@Test
	void testGetCategoryChoices_3() {
		ArrayList<Category> categories = new ArrayList<Category>();
		categories.add(new Category("category1"));
		categories.add(new Category("category2"));
		categories.add(new Category("category3"));
		String[] result = ConstantConverter.getCategoryChoices(categories);
		assertEquals(3, result.length);
		assertEquals("category1", result[0]);
		assertEquals("category2", result[1]);
		assertEquals("category3", result[2]);
	}
	
	/**
	* Test case for the {@link ConstantConverter#getCategoryChoices(ArrayList)} method.
	* Test data: list with four elements.
	* Expected result: array with four elements.
	*/
	@Test
	void testGetCategoryChoices_4() {
		ArrayList<Category> categories = new ArrayList<Category>();
		categories.add(new Category("category1"));
		categories.add(new Category("category2"));
		categories.add(new Category("category3"));
		categories.add(new Category("category4"));
		String[] result = ConstantConverter.getCategoryChoices(categories);
		assertEquals(4, result.length);
		assertEquals("category1", result[0]);
		assertEquals("category2", result[1]);
		assertEquals("category3", result[2]);
		assertEquals("category4", result[3]);
	}
	
	/**
	* Test case for the {@link ConstantConverter#getCategoryChoices(ArrayList)} method.
	* Test data: list with five elements.
	* Expected result: array with five elements.
	*/
	@Test
	void testGetCategoryChoices_5() {
		ArrayList<Category> categories = new ArrayList<Category>();
		categories.add(new Category("category1"));
		categories.add(new Category("category2"));
		categories.add(new Category("category3"));
		categories.add(new Category("category4"));
		categories.add(new Category("category5"));
		String[] result = ConstantConverter.getCategoryChoices(categories);
		assertEquals(5, result.length);
		assertEquals("category1", result[0]);
		assertEquals("category2", result[1]);
		assertEquals("category3", result[2]);
		assertEquals("category4", result[3]);
		assertEquals("category5", result[4]);
	}
	
	/**
	* Test case for the {@link ConstantConverter#getCategoryChoices(ArrayList)} method.
	* Test data: list with six elements.
	* Expected result: array with six elements.
	*/
	@Test
	void testGetCategoryChoices_6() {
		ArrayList<Category> categories = new ArrayList<Category>();
		categories.add(new Category("category1"));
		categories.add(new Category("category2"));
		categories.add(new Category("category3"));
		categories.add(new Category("category4"));
		categories.add(new Category("category5"));
		categories.add(new Category("category6"));
		String[] result = ConstantConverter.getCategoryChoices(categories);
		assertEquals(6, result.length);
		assertEquals("category1", result[0]);
		assertEquals("category2", result[1]);
		assertEquals("category3", result[2]);
		assertEquals("category4", result[3]);
		assertEquals("category5", result[4]);
		assertEquals("category6", result[5]);
	}
	
	/**
	* Test case for the {@link ConstantConverter#getCategoryChoices(ArrayList)} method.
	* Test data: list with seven elements.
	* Expected result: array with seven elements.
	*/
	@Test
	void testGetCategoryChoices_7() {
		ArrayList<Category> categories = new ArrayList<Category>();
		categories.add(new Category("category1"));
		categories.add(new Category("category2"));
		categories.add(new Category("category3"));
		categories.add(new Category("category4"));
		categories.add(new Category("category5"));
		categories.add(new Category("category6"));
		categories.add(new Category("category7"));
		String[] result = ConstantConverter.getCategoryChoices(categories);
		assertEquals(7, result.length);
		assertEquals("category1", result[0]);
		assertEquals("category2", result[1]);
		assertEquals("category3", result[2]);
		assertEquals("category4", result[3]);
		assertEquals("category5", result[4]);
		assertEquals("category6", result[5]);
		assertEquals("category7", result[6]);
	}
	
	/**
	* Test case for the {@link ConstantConverter#getCategoryChoices(ArrayList)} method.
	* Test data: list with eight elements.
	* Expected result: array with eight elements.
	*/
	@Test
	void testGetCategoryChoices_8() {
		ArrayList<Category> categories = new ArrayList<Category>();
		categories.add(new Category("category1"));
		categories.add(new Category("category2"));
		categories.add(new Category("category3"));
		categories.add(new Category("category4"));
		categories.add(new Category("category5"));
		categories.add(new Category("category6"));
		categories.add(new Category("category7"));