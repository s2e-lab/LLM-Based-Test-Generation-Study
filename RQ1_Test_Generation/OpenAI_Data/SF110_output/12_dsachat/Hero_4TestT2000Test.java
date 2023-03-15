// Hero_4Test.java
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
* It contains ten unit test cases for the {@link Hero#getAttrValue(String)} method.
*/
class Hero_4Test {

		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute "MU".
		 * </p>
		 */
		@Test
		void testGetAttrValue_MU() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes.addElement(new Attribute("Mut", "MU", 10));
				assertEquals(10, hero.getAttrValue("MU"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute "KL".
		 * </p>
		 */
		@Test
		void testGetAttrValue_KL() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes.addElement(new Attribute("Klugheit", "KL", 10));
				assertEquals(10, hero.getAttrValue("KL"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute "IN".
		 * </p>
		 */
		@Test
		void testGetAttrValue_IN() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes.addElement(new Attribute("Intuition", "IN", 10));
				assertEquals(10, hero.getAttrValue("IN"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute "CH".
		 * </p>
		 */
		@Test
		void testGetAttrValue_CH() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes.addElement(new Attribute("Charisma", "CH", 10));
				assertEquals(10, hero.getAttrValue("CH"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute "FF".
		 * </p>
		 */
		@Test
		void testGetAttrValue_FF() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes.addElement(new Attribute("Fingerfertigkeit", "FF", 10));
				assertEquals(10, hero.getAttrValue("FF"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute "GE".
		 * </p>
		 */
		@Test
		void testGetAttrValue_GE() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes.addElement(new Attribute("Gewandtheit", "GE", 10));
				assertEquals(10, hero.getAttrValue("GE"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute "KO".
		 * </p>
		 */
		@Test
		void testGetAttrValue_KO() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes.addElement(new Attribute("Konstitution", "KO", 10));
				assertEquals(10, hero.getAttrValue("KO"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute "KK".
		 * </p>
		 */
		@Test
		void testGetAttrValue_KK() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes.addElement(new Attribute("K�rperkraft", "KK", 10));
				assertEquals(10, hero.getAttrValue("KK"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute "LEP".
		 * </p>
		 */
		@Test
		void testGetAttrValue_LEP() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes.addElement(new Attribute("Lebensenergie", "LEP", 10));
				assertEquals(10, hero.getAttrValue("LEP"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute "AUP".
		 * </p>
		 */
		@Test
		void testGetAttrValue_AUP() {
				Hero hero = new Hero(new Document(new Element("test")));
				hero.attributes.addElement(new Attribute("Ausdauer", "AUP", 10));
				assertEquals(10, hero.getAttrValue("AUP"));
		}
		
		/**
		 * Test case for {@link Hero#getAttrValue(String)}
		 * <p>
		 * Test method for {@link Hero#getAttrValue(String)}.
		 * </p>
		 * <p>
		 * This test case checks if the method returns the correct value for the attribute "ASP".
		 * </p>
		 */