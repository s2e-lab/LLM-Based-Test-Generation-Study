// HeroTest3.java
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
* It contains ten unit test cases for the {@link Hero#use(String, int)} method.
*/
class HeroTest3 {

		/**
		 * Test case for {@link Hero#use(String, int)}.
		 * <p>
		 * This test case tests the use of a talent.
		 * </p>
		 */
		@Test
		void testUseTalent() {
				Hero hero = new Hero(null);
				hero.talents = new Vector<Talent>();
				hero.talents.addElement(new Talent("Talent", 10, "MU"));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Mut", "MU", 10));
				assertEquals("20", hero.use("Talent", 0));
		}
		
		/**
		 * Test case for {@link Hero#use(String, int)}.
		 * <p>
		 * This test case tests the use of a talent with a modifier.
		 * </p>
		 */
		@Test
		void testUseTalentWithModifier() {
				Hero hero = new Hero(null);
				hero.talents = new Vector<Talent>();
				hero.talents.addElement(new Talent("Talent", 10, "MU"));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Mut", "MU", 10));
				assertEquals("30", hero.use("Talent", 10));
		}
		
		/**
		 * Test case for {@link Hero#use(String, int)}.
		 * <p>
		 * This test case tests the use of a talent with a modifier.
		 * </p>
		 */
		@Test
		void testUseTalentWithModifier2() {
				Hero hero = new Hero(null);
				hero.talents = new Vector<Talent>();
				hero.talents.addElement(new Talent("Talent", 10, "MU"));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Mut", "MU", 10));
				assertEquals("10", hero.use("Talent", -10));
		}
		
		/**
		 * Test case for {@link Hero#use(String, int)}.
		 * <p>
		 * This test case tests the use of a talent with a modifier.
		 * </p>
		 */
		@Test
		void testUseTalentWithModifier3() {
				Hero hero = new Hero(null);
				hero.talents = new Vector<Talent>();
				hero.talents.addElement(new Talent("Talent", 10, "MU"));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Mut", "MU", 10));
				assertEquals("20", hero.use("Talent", -10));
		}
		
		/**
		 * Test case for {@link Hero#use(String, int)}.
		 * <p>
		 * This test case tests the use of a talent with a modifier.
		 * </p>
		 */
		@Test
		void testUseTalentWithModifier4() {
				Hero hero = new Hero(null);
				hero.talents = new Vector<Talent>();
				hero.talents.addElement(new Talent("Talent", 10, "MU"));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Mut", "MU", 10));
				assertEquals("20", hero.use("Talent", -10));
		}
		
		/**
		 * Test case for {@link Hero#use(String, int)}.
		 * <p>
		 * This test case tests the use of a talent with a modifier.
		 * </p>
		 */
		@Test
		void testUseTalentWithModifier5() {
				Hero hero = new Hero(null);
				hero.talents = new Vector<Talent>();
				hero.talents.addElement(new Talent("Talent", 10, "MU"));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Mut", "MU", 10));
				assertEquals("20", hero.use("Talent", -10));
		}
		
		/**
		 * Test case for {@link Hero#use(String, int)}.
		 * <p>
		 * This test case tests the use of a talent with a modifier.
		 * </p>
		 */
		@Test
		void testUseTalentWithModifier6() {
				Hero hero = new Hero(null);
				hero.talents = new Vector<Talent>();
				hero.talents.addElement(new Talent("Talent", 10, "MU"));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Mut", "MU", 10));
				assertEquals("20", hero.use("Talent", -10));
		}
		
		/**
		 * Test case for {@link Hero#use(String, int)}.
		 * <p>
		 * This test case tests the use of a talent with a modifier.
		 * </p>
		 */
		@Test
		void testUseTalentWithModifier7() {
				Hero hero = new Hero(null);
				hero.talents = new Vector<Talent>();
				hero.talents.addElement(new Talent("Talent", 10, "MU"));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Mut", "MU", 10));
				assertEquals("20", hero.use("Talent", -10));
		}
		
		/**
		 * Test case for {@link Hero#use(String, int)}.
		 * <p>
		 * This test case tests the use of a talent with a modifier.
		 * </p>
		 */
		@Test
		void testUseTalentWithModifier8() {
				Hero hero = new Hero(null);
				hero.talents = new Vector<Talent>();
				hero.talents.addElement(new Talent("Talent", 10, "MU"));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Mut", "MU", 10));
				assertEquals("20", hero.use("Talent", -10));
		}
		
		/**
		 * Test case for {@link Hero#use(String, int)}.
		 * <p>
		 * This test case tests the use of a talent with a modifier.
		 * </p>
		 */
		@Test
		void testUseTalentWithModifier9() {
				Hero hero = new Hero(null);
				hero.talents = new Vector<Talent>();
				hero.talents.addElement(new Talent("Talent", 10, "MU"));
				hero.attributes = new Vector<Attribute>();
				hero.attributes.addElement(new Attribute("Mut", "MU", 10));
				assertEquals("20", hero.use("Talent", -10));
		}
		
		/**
		 * Test case for {@link Hero#use(String, int)}.
		 * <p>
		 * This test case tests the use of a talent with a modifier.
		 * </p>
		 */