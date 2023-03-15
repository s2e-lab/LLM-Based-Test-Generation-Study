// Db4oFormationFactoryTest.java
package fr.unice.gfarce.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.Configuration;
import com.db4o.ext.ExtObjectContainer;
import fr.unice.gfarce.connect.Db4oConfig;
import fr.unice.gfarce.identity.Formation;
import fr.unice.gfarce.identity.RespFormation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Db4oFormationFactory}.
* It contains ten unit test cases for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
*/
class Db4oFormationFactoryTest {

		private Db4oFormationFactory dff;
		
		public Db4oFormationFactoryTest() throws IOException {
			dff = new Db4oFormationFactory();
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is null and the date is null.
		*/
		@Test
		public void testFindFormation1() {
			Formation[] tab = dff.findFormation(null, null);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is null.
		*/
		@Test
		public void testFindFormation2() {
			Formation[] tab = dff.findFormation("Java", null);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is null and the date is not null.
		*/
		@Test
		public void testFindFormation3() {
			Calendar c = Calendar.getInstance();
			c.set(Calendar.MONTH, Calendar.JANUARY);
			c.set(Calendar.DAY_OF_MONTH, 1);
			c.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation(null, c);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation4() {
			Calendar c = Calendar.getInstance();
			c.set(Calendar.MONTH, Calendar.JANUARY);
			c.set(Calendar.DAY_OF_MONTH, 1);
			c.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", c);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation5() {
			Calendar c = Calendar.getInstance();
			c.set(Calendar.MONTH, Calendar.JANUARY);
			c.set(Calendar.DAY_OF_MONTH, 1);
			c.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", c);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation6() {
			Calendar c = Calendar.getInstance();
			c.set(Calendar.MONTH, Calendar.JANUARY);
			c.set(Calendar.DAY_OF_MONTH, 1);
			c.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", c);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation7() {
			Calendar c = Calendar.getInstance();
			c.set(Calendar.MONTH, Calendar.JANUARY);
			c.set(Calendar.DAY_OF_MONTH, 1);
			c.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", c);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation8() {
			Calendar c = Calendar.getInstance();
			c.set(Calendar.MONTH, Calendar.JANUARY);
			c.set(Calendar.DAY_OF_MONTH, 1);
			c.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", c);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation9() {
			Calendar c = Calendar.getInstance();
			c.set(Calendar.MONTH, Calendar.JANUARY);
			c.set(Calendar.DAY_OF_MONTH, 1);
			c.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", c);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation10() {
			Calendar c = Calendar.getInstance();
			c.set(Calendar.MONTH, Calendar.JANUARY);
			c.set(Calendar.DAY_OF_MONTH, 1);
			c.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", c);
			assertEquals(tab.length, 0);
		}
}

// Db4oRespFormationFactory.java
/**
 * Classe Db4oRespFormationFactory
 */
package fr.unice.gfarce.dao;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import com.db4o.Db4o;
import com.db4o.ObjectContainer;
import com.db4o.ObjectSet;
import com.db4o.config.Configuration;
import com.db4o.ext.ExtObjectContainer;
import fr.unice.gfarce.connect.Db4oConfig;
import fr.unice.gfarce.identity.RespFormation;

/**
 *  Classe permettant d'acc&eacute;der &agrave; la base de donn&eacute;es db4o et d'en modifier les Responsables de Formations.
 */
public class Db4oRespFormation