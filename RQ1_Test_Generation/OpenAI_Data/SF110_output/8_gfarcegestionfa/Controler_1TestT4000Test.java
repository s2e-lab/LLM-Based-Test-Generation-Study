// Controler_1Test.java
package fr.unice.gfarce.main;

import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import fr.unice.gfarce.dao.DaoFactory;
import fr.unice.gfarce.dao.DaoFactory.TypeFabrique;
import fr.unice.gfarce.dao.DaoFactoryException;
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;
import fr.unice.gfarce.identity.Candidat;
import fr.unice.gfarce.identity.Formation;
import fr.unice.gfarce.identity.Identite;
import fr.unice.gfarce.identity.Identite.TypeIdentite;
import fr.unice.gfarce.identity.RespFormation;
import fr.unice.gfarce.interGraph.FenetreChoix;
import fr.unice.gfarce.xls.WritingXLS;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Controler}.
* It contains ten unit test cases for the {@link Controler#createFormation(String, String, int, String)} method.
*/
class Controler_1Test {

		/**
		 * Test case for {@link Controler#createFormation(String, String, int, String)}
		 * @throws DaoFactoryException
		 * @throws IOException
		 */
		@Test
		void testCreateFormation() throws DaoFactoryException, IOException {
				Controler c = new Controler();
				c.setTypeDataBase("db4o");
				c.launchDatabase();
				Formation f = c.createFormation("test", "01/01/2010", 1000, "test test");
				assertEquals("test", f.getTitre());
				assertEquals(1000, f.getMontant_inscription());
				assertEquals("test test", f.getResponsable().getNom() + " " + f.getResponsable().getPrenom());
				assertEquals(1, f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH));
				assertEquals(0, f.getDate_limite_candidature().get(Calendar.MONTH));
				assertEquals(2010, f.getDate_limite_candidature().get(Calendar.YEAR));
		}
		
		/**
		 * Test case for {@link Controler#createFormation(String, String, int, String)}
		 * @throws DaoFactoryException
		 * @throws IOException
		 */
		@Test
		void testCreateFormation1() throws DaoFactoryException, IOException {
				Controler c = new Controler();
				c.setTypeDataBase("db4o");
				c.launchDatabase();
				Formation f = c.createFormation("test", "01/01/2010", 1000, "test test");
				assertEquals("test", f.getTitre());
				assertEquals(1000, f.getMontant_inscription());
				assertEquals("test test", f.getResponsable().getNom() + " " + f.getResponsable().getPrenom());
				assertEquals(1, f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH));
				assertEquals(0, f.getDate_limite_candidature().get(Calendar.MONTH));
				assertEquals(2010, f.getDate_limite_candidature().get(Calendar.YEAR));
		}
		
		/**
		 * Test case for {@link Controler#createFormation(String, String, int, String)}
		 * @throws DaoFactoryException
		 * @throws IOException
		 */
		@Test
		void testCreateFormation2() throws DaoFactoryException, IOException {
				Controler c = new Controler();
				c.setTypeDataBase("db4o");
				c.launchDatabase();
				Formation f = c.createFormation("test", "01/01/2010", 1000, "test test");
				assertEquals("test", f.getTitre());
				assertEquals(1000, f.getMontant_inscription());
				assertEquals("test test", f.getResponsable().getNom() + " " + f.getResponsable().getPrenom());
				assertEquals(1, f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH));
				assertEquals(0, f.getDate_limite_candidature().get(Calendar.MONTH));
				assertEquals(2010, f.getDate_limite_candidature().get(Calendar.YEAR));
		}
		
		/**
		 * Test case for {@link Controler#createFormation(String, String, int, String)}
		 * @throws DaoFactoryException
		 * @throws IOException
		 */
		@Test
		void testCreateFormation3() throws DaoFactoryException, IOException {
				Controler c = new Controler();
				c.setTypeDataBase("db4o");
				c.launchDatabase();
				Formation f = c.createFormation("test", "01/01/2010", 1000, "test test");
				assertEquals("test", f.getTitre());
				assertEquals(1000, f.getMontant_inscription());
				assertEquals("test test", f.getResponsable().getNom() + " " + f.getResponsable().getPrenom());
				assertEquals(1, f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH));
				assertEquals(0, f.getDate_limite_candidature().get(Calendar.MONTH));
				assertEquals(2010, f.getDate_limite_candidature().get(Calendar.YEAR));
		}
		
		/**
		 * Test case for {@link Controler#createFormation(String, String, int, String)}
		 * @throws DaoFactoryException
		 * @throws IOException
		 */
		@Test
		void testCreateFormation4() throws DaoFactoryException, IOException {
				Controler c = new Controler();
				c.setTypeDataBase("db4o");
				c.launchDatabase();
				Formation f = c.createFormation("test", "01/01/2010", 1000, "test test");
				assertEquals("test", f.getTitre());
				assertEquals(1000, f.getMontant_inscription());
				assertEquals("test test", f.getResponsable().getNom() + " " + f.getResponsable().getPrenom());
				assertEquals(1, f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH));
				assertEquals(0, f.getDate_limite_candidature().get(Calendar.MONTH));
				assertEquals(2010, f.getDate_limite_candidature().get(Calendar.YEAR));
		}
		
		/**
		 * Test case for {@link Controler#createFormation(String, String, int, String)}
		 * @throws DaoFactoryException
		 * @throws IOException
		 */
		@Test
		void testCreateFormation5() throws DaoFactoryException, IOException {
				Controler c = new Controler();
				c.setTypeDataBase("db4o");
				c.launchDatabase();
				Formation f = c.createFormation("test", "01/01/2010", 1000, "test test");
				assertEquals("test", f.getTitre());
				assertEquals(1000, f.getMontant_inscription());
				assertEquals("test test", f.getResponsable().getNom() + " " + f.getResponsable().getPrenom());
				assertEquals(1, f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH));
				assertEquals(0, f.getDate_limite_candidature().get(Calendar.MONTH));
				assertEquals(2010, f.getDate_limite_candidature().get(Calendar.YEAR));
		}
		
		/**
		 * Test case for {@link Controler#createFormation(String, String, int, String)}
		 * @throws DaoFactoryException
		 * @throws IOException
		 */
		@Test
		void testCreateFormation6() throws DaoFactoryException, IOException {
				Controler c = new Controler();
				c.setTypeDataBase("db4o");
				c.launchDatabase();
				Formation f = c.createFormation("test", "01/01/2010", 1000, "test test");
				assertEquals("test", f.getTitre());
				assertEquals(1000, f.getMontant_inscription());
				assertEquals("test test", f.getResponsable().getNom() + " " + f.getResponsable().getPrenom());
				assertEquals(1, f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH));
				assertEquals(0, f.getDate_limite_candidature().get(Calendar.MONTH));
				assertEquals(2010, f.getDate_limite_candidature().get(Calendar.YEAR));
		}
		
		/**
		 * Test case for {@link Controler#createFormation(String, String, int, String)}
		 * @throws DaoFactoryException
		 * @throws IOException
		 */
		@Test
		void testCreateFormation7() throws DaoFactoryException, IOException {
				Controler c = new Controler();
				c.setTypeDataBase("db4o");
				c.launchDatabase();
				Formation f = c.createFormation("test", "01/01/2010", 1000, "test test");
				assertEquals("test", f.getTitre());
				assertEquals(1000, f.getMontant_inscription());
				assertEquals("test test", f.getResponsable().getNom() + " " + f.getResponsable().getPrenom());
				assertEquals(1, f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH));
				assertEquals(0, f.getDate_limite_candidature().get(Calendar.MONTH));
				assertEquals(2010, f.getDate_limite_candidature().get(Calendar.YEAR));
		}
		
		/**
		 * Test case for {@link Controler#createFormation(String, String, int, String)}
		 * @throws DaoFactoryException
		 * @throws IOException
		 */
		@Test
		void testCreateFormation8() throws DaoFactoryException, IOException {
				Controler c = new Controler();
				c.setTypeDataBase("db4o");
				c.launchDatabase();
				Formation f = c.createFormation("test", "01/01/2010", 1000, "test test");
				assertEquals("test", f.getTitre());
				assertEquals(1000, f.getMontant_inscription());
				assertEquals("test test", f.getResponsable().getNom() + " " + f.getResponsable().getPrenom());
				assertEquals(1, f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH));
				assertEquals(0, f.getDate_limite_candidature().get(Calendar.MONTH));
				assertEquals(2010, f.getDate_limite_candidature().get(Calendar.YEAR));
		}
		
		/**
		 * Test case for {@link Controler#createFormation(String, String, int, String)}
		 * @throws DaoFactoryException
		 * @throws IOException
		 */
		@Test
		void testCreateFormation9() throws DaoFactoryException, IOException {
				Controler c = new Controler();
				c.setTypeDataBase("db4o");
				c.launchDatabase();
				Formation f = c.createFormation("test", "01/01/2010", 1000, "test test");
				assertEquals("test", f.getTitre());
				assertEquals(1000, f.getMontant_inscription());
				assertEquals("test test", f.getResponsable().getNom() + " " + f.getResponsable().getPrenom());
				assertEquals(1, f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH));
				assertEquals(0, f.getDate_limite_candidature().get(Calendar.MONTH));
				assertEquals(2010, f.getDate_limite_candidature().get(Calendar.YEAR));
		}
		
		/**
		 * Test case for {@link Controler#createFormation(String, String, int, String)}
		 * @throws DaoFactoryException
		 * @throws IOException
		 */
		@Test
		void testCreateFormation10() throws DaoFactoryException, IOException {
				Controler c = new Controler();
				c.setTypeDataBase("db4o");
				c.launchDatabase();
				Formation f = c.createFormation("test", "01/01/2010", 1000, "test test");
				assertEquals("test", f.getTitre());
				assertEquals(1000, f.getMontant_inscription());
				assertEquals("test test", f.getResponsable().getNom() + " " + f.getResponsable().getPrenom());
				assertEquals(1, f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH));
				assertEquals(0, f.getDate_limite_candidature().get(Calendar.MONTH));
				assertEquals(2010, f.getDate_limite_candidature().get(Calendar.YEAR));
		}
}

// Controler_2Test.java
package fr.unice.gfarce.main;

import java.io.IOException;
import java.text.ParseException;
import java.util.Calendar;
import java.util.Collection;
import jxl.write.WriteException;
import jxl.write.biff.RowsExceededException;
import fr.unice.gfarce.dao.DaoFactory;
import fr.unice.gfarce.dao.DaoFactory.TypeFabrique;
import fr.unice.gfarce.dao.DaoFactoryException;
import fr.unice.gfarce.dao.FormationDao;
import fr.unice.gfarce.dao.IdentiteDao;
import fr.unice.gfarce.identity.Candidat;
import fr.unice.gfarce.identity.Formation;
import fr.unice.gfarce.identity.Identite;
import fr.unice.gfarce.identity.Identite.TypeIdentite;
import fr.unice.gfarce.identity.RespFormation;
import fr.unice.gfarce.interGraph.FenetreChoix;
import fr.unice.gfarce.xls.WritingXLS;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Controler}.
* It contains ten unit test cases