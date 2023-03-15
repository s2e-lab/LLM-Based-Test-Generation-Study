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
* It contains ten unit test cases for the {@link Controler#findCandidat(String, String)} method.
*/
class Controler_2Test {

		private Controler controler;
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with a null value for the first parameter.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindCandidat_1() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidat(null, "prenom");
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with a null value for the second parameter.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindCandidat_2() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidat("nom", null);
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with a null value for the first and second parameters.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindCandidat_3() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidat(null, null);
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with a non-existing value for the first parameter.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindCandidat_4() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidat("nom", "prenom");
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with a non-existing value for the second parameter.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindCandidat_5() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidat("nom", "prenom");
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with a non-existing value for the first and second parameters.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindCandidat_6() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidat("nom", "prenom");
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with an existing value for the first parameter.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindCandidat_7() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidat("nom", "prenom");
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with an existing value for the second parameter.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindCandidat_8() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidat("nom", "prenom");
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with an existing value for the first and second parameters.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindCandidat_9() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidat("nom", "prenom");
				assertEquals(0, result.length);
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with an existing value for the first and second parameters.
		* @throws DaoFactoryException
		* @throws IOException
		*/
		@Test
		void testFindCandidat_10() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidat("nom", "prenom");
				assertEquals(0, result.length);
		}
}

// Controler_Test.java
package fr.unice.gfarce.main;

import java.io.IOException;
import java.text.Par