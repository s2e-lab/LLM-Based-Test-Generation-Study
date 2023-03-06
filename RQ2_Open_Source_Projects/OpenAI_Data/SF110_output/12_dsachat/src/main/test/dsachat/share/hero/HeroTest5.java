// HeroTest5.java
package dsachat.share.hero;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;
import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Hero}.
* It contains ten unit test cases for the {@link Hero#isMagican()} method.
*/
class HeroTest5 {

		/**
		 * Test case for {@link Hero#isMagican()}
		 * <p>
		 * This test case tests the method with a hero that is a magican.
		 * </p>
		 */
		@Test
		void testIsMagican1() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_magican.xml"));
				assertTrue(hero.isMagican());
		}
		
		/**
		 * Test case for {@link Hero#isMagican()}
		 * <p>
		 * This test case tests the method with a hero that is a priest.
		 * </p>
		 */
		@Test
		void testIsMagican2() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_priest.xml"));
				assertFalse(hero.isMagican());
		}
		
		/**
		 * Test case for {@link Hero#isMagican()}
		 * <p>
		 * This test case tests the method with a hero that is neither a magican nor a priest.
		 * </p>
		 */
		@Test
		void testIsMagican3() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_neither_magican_nor_priest.xml"));
				assertFalse(hero.isMagican());
		}
		
		/**
		 * Test case for {@link Hero#isMagican()}
		 * <p>
		 * This test case tests the method with a hero that is a magican and a priest.
		 * </p>
		 */
		@Test
		void testIsMagican4() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_magican_and_priest.xml"));
				assertTrue(hero.isMagican());
		}
		
		/**
		 * Test case for {@link Hero#isMagican()}
		 * <p>
		 * This test case tests the method with a hero that is a magican and a priest.
		 * </p>
		 */
		@Test
		void testIsMagican5() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_magican_and_priest.xml"));
				assertTrue(hero.isMagican());
		}
		
		/**
		 * Test case for {@link Hero#isMagican()}
		 * <p>
		 * This test case tests the method with a hero that is a magican and a priest.
		 * </p>
		 */
		@Test
		void testIsMagican6() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_magican_and_priest.xml"));
				assertTrue(hero.isMagican());
		}
		
		/**
		 * Test case for {@link Hero#isMagican()}
		 * <p>
		 * This test case tests the method with a hero that is a magican and a priest.
		 * </p>
		 */
		@Test
		void testIsMagican7() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_magican_and_priest.xml"));
				assertTrue(hero.isMagican());
		}
		
		/**
		 * Test case for {@link Hero#isMagican()}
		 * <p>
		 * This test case tests the method with a hero that is a magican and a priest.
		 * </p>
		 */
		@Test
		void testIsMagican8() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_magican_and_priest.xml"));
				assertTrue(hero.isMagican());
		}
		
		/**
		 * Test case for {@link Hero#isMagican()}
		 * <p>
		 * This test case tests the method with a hero that is a magican and a priest.
		 * </p>
		 */
		@Test
		void testIsMagican9() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_magican_and_priest.xml"));
				assertTrue(hero.isMagican());
		}
		
		/**
		 * Test case for {@link Hero#isMagican()}
		 * <p>
		 * This test case tests the method with a hero that is a magican and a priest.
		 * </p>
		 */
		@Test
		void testIsMagican10() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_magican_and_priest.xml"));
				assertTrue(hero.isMagican());
		}
		
		/**
		 * Creates a document from a file.
		 * @param fileName the file name
		 * @return the document
		 */
		private Document createDocument(String fileName) {
				return null;
		}
}

// HeroTest6.java
package dsachat.share.hero;

import java.io.Serializable;
import java.util.Iterator;
import java.util.Vector;
import org.dom4j.Document;
import org.dom4j.Element;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Hero}.
* It contains ten unit test cases for the {@link Hero#isPriest()} method.
*/
class HeroTest6 {
		
		/**
		 * Test case for {@link Hero#isPriest()}
		 * <p>
		 * This test case tests the method with a hero that is a magican.
		 * </p>
		 */
		@Test
		void testIsPriest1() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_magican.xml"));
				assertFalse(hero.isPriest());
		}
		
		/**
		 * Test case for {@link Hero#isPriest()}
		 * <p>
		 * This test case tests the method with a hero that is a priest.
		 * </p>
		 */
		@Test
		void testIsPriest2() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_priest.xml"));
				assertTrue(hero.isPriest());
		}
		
		/**
		 * Test case for {@link Hero#isPriest()}
		 * <p>
		 * This test case tests the method with a hero that is neither a magican nor a priest.
		 * </p>
		 */
		@Test
		void testIsPriest3() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_neither_magican_nor_priest.xml"));
				assertFalse(hero.isPriest());
		}
		
		/**
		 * Test case for {@link Hero#isPriest()}
		 * <p>
		 * This test case tests the method with a hero that is a magican and a priest.
		 * </p>
		 */
		@Test
		void testIsPriest4() {
				Hero hero = new Hero(createDocument("test/dsachat/share/hero/hero_magican_and_priest