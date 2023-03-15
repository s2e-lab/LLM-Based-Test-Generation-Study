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
				assertEquals(f.getTitre(), "test");
				assertEquals(f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH), 1);
				assertEquals(f.getDate_limite_candidature().get(Calendar.MONTH), 0);
				assertEquals(f.getDate_limite_candidature().get(Calendar.YEAR), 2010);
				assertEquals(f.getMontant_inscription(), 1000);
				assertEquals(f.getResponsable().getNom(), "test");
				assertEquals(f.getResponsable().getPrenom(), "test");
				c.deleteFormation("test", "01/01/2010");
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
				assertEquals(f.getTitre(), "test");
				assertEquals(f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH), 1);
				assertEquals(f.getDate_limite_candidature().get(Calendar.MONTH), 0);
				assertEquals(f.getDate_limite_candidature().get(Calendar.YEAR), 2010);
				assertEquals(f.getMontant_inscription(), 1000);
				assertEquals(f.getResponsable().getNom(), "test");
				assertEquals(f.getResponsable().getPrenom(), "test");
				c.deleteFormation("test", "01/01/2010");
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
				assertEquals(f.getTitre(), "test");
				assertEquals(f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH), 1);
				assertEquals(f.getDate_limite_candidature().get(Calendar.MONTH), 0);
				assertEquals(f.getDate_limite_candidature().get(Calendar.YEAR), 2010);
				assertEquals(f.getMontant_inscription(), 1000);
				assertEquals(f.getResponsable().getNom(), "test");
				assertEquals(f.getResponsable().getPrenom(), "test");
				c.deleteFormation("test", "01/01/2010");
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
				assertEquals(f.getTitre(), "test");
				assertEquals(f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH), 1);
				assertEquals(f.getDate_limite_candidature().get(Calendar.MONTH), 0);
				assertEquals(f.getDate_limite_candidature().get(Calendar.YEAR), 2010);
				assertEquals(f.getMontant_inscription(), 1000);
				assertEquals(f.getResponsable().getNom(), "test");
				assertEquals(f.getResponsable().getPrenom(), "test");
				c.deleteFormation("test", "01/01/2010");
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
				assertEquals(f.getTitre(), "test");
				assertEquals(f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH), 1);
				assertEquals(f.getDate_limite_candidature().get(Calendar.MONTH), 0);
				assertEquals(f.getDate_limite_candidature().get(Calendar.YEAR), 2010);
				assertEquals(f.getMontant_inscription(), 1000);
				assertEquals(f.getResponsable().getNom(), "test");
				assertEquals(f.getResponsable().getPrenom(), "test");
				c.deleteFormation("test", "01/01/2010");
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
				assertEquals(f.getTitre(), "test");
				assertEquals(f.getDate_limite_candidature().get(Calendar.DAY_OF_MONTH), 1);
		