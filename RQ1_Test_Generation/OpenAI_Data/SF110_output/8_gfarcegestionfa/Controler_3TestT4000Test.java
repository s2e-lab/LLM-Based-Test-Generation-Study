// Controler_3Test.java
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
* It contains ten unit test cases for the {@link Controler#findRespForm(String, String)} method.
*/
class Controler_3Test {

		private Controler controler;
		
		/**
		* Test case for the {@link Controler#findRespForm(String, String)} method.
		* This test case is used to test the method with a null value for the first parameter.
		* The expected result is an exception.
		*/
		@Test
		void testFindRespForm_1() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				assertThrows(IllegalArgumentException.class, () -> {
						controler.findRespForm(null, "prenom");
				});
		}
		
		/**
		* Test case for the {@link Controler#findRespForm(String, String)} method.
		* This test case is used to test the method with a null value for the second parameter.
		* The expected result is an exception.
		*/
		@Test
		void testFindRespForm_2() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				assertThrows(IllegalArgumentException.class, () -> {
						controler.findRespForm("nom", null);
				});
		}
		
		/**
		* Test case for the {@link Controler#findRespForm(String, String)} method.
		* This test case is used to test the method with a null value for the first and second parameters.
		* The expected result is an exception.
		*/
		@Test
		void testFindRespForm_3() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				assertThrows(IllegalArgumentException.class, () -> {
						controler.findRespForm(null, null);
				});
		}
		
		/**
		* Test case for the {@link Controler#findRespForm(String, String)} method.
		* This test case is used to test the method with a non-existing name.
		* The expected result is an empty array.
		*/
		@Test
		void testFindRespForm_4() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				assertEquals(0, controler.findRespForm("nom", "prenom").length);
		}
		
		/**
		* Test case for the {@link Controler#findRespForm(String, String)} method.
		* This test case is used to test the method with an existing name.
		* The expected result is an array containing one element.
		*/
		@Test
		void testFindRespForm_5() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.FORMATEUR, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
				
				assertEquals(1, controler.findRespForm("nom", "prenom").length);
		}
		
		/**
		* Test case for the {@link Controler#findRespForm(String, String)} method.
		* This test case is used to test the method with an existing name.
		* The expected result is an array containing one element.
		*/
		@Test
		void testFindRespForm_6() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.FORMATEUR, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
				
				assertEquals(1, controler.findRespForm("nom", "prenom").length);
		}
		
		/**
		* Test case for the {@link Controler#findRespForm(String, String)} method.
		* This test case is used to test the method with an existing name.
		* The expected result is an array containing one element.
		*/
		@Test
		void testFindRespForm_7() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.FORMATEUR, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
				
				assertEquals(1, controler.findRespForm("nom", "prenom").length);
		}
		
		/**
		* Test case for the {@link Controler#findRespForm(String, String)} method.
		* This test case is used to test the method with an existing name.
		* The expected result is an array containing one element.
		*/
		@Test
		void testFindRespForm_8() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.FORMATEUR, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
				
				assertEquals(1, controler.findRespForm("nom", "prenom").length);
		}
		
		/**
		* Test case for the {@link Controler#findRespForm(String, String)} method.
		* This test case is used to test the method with an existing name.
		* The expected result is an array containing one element.
		*/
		@Test
		void testFindRespForm_9() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.FORMATEUR, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
				
				assertEquals(1, controler.findRespForm("nom", "prenom").length);
		}
		
		/**
		* Test case for the {@link Controler#findRespForm(String, String)} method.
		* This test case is used to test the method with an existing name.
		* The expected result is an array containing one element.
		*/
		@Test
		void testFindRespForm_10() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.FORMATEUR, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
				
				assertEquals(1, controler.findRespForm("nom", "prenom").length);
		}
}

// Controler_4Test.java
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
class Controler_4Test {
		
		private Controler controler;
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with a null value for the first parameter.
		* The expected result is an exception.
		*/
		@Test
		void testFindCandidat_1() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				assertThrows(IllegalArgumentException.class, () -> {
						controler.findCandidat(null, "prenom");
				});
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with a null value for the second parameter.
		* The expected result is an exception.
		*/
		@Test
		void testFindCandidat_2() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				assertThrows(IllegalArgumentException.class, () -> {
						controler.findCandidat("nom", null);
				});
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with a null value for the first and second parameters.
		* The expected result is an exception.
		*/
		@Test
		void testFindCandidat_3() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				assertThrows(IllegalArgumentException.class, () -> {
						controler.findCandidat(null, null);
				});
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with a non-existing name.
		* The expected result is an empty array.
		*/
		@Test
		void testFindCandidat_4() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				assertEquals(0, controler.findCandidat("nom", "prenom").length);
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with an existing name.
		* The expected result is an array containing one element.
		*/
		@Test
		void testFindCandidat_5() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.CANDIDAT, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
				
				assertEquals(1, controler.findCandidat("nom", "prenom").length);
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with an existing name.
		* The expected result is an array containing one element.
		*/
		@Test
		void testFindCandidat_6() throws DaoFactoryException, IOException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				
				controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.CANDIDAT, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
				
				assertEquals(1, controler.findCandidat("nom", "prenom").length);
		}
		
		/**
		* Test case for the {@link Controler#findCandidat(String, String)} method.
		* This test case is used to test the method with an existing name.
		* The expected result is an array containing one element.
		*/
		@Test
		void testFindCandidat_7() throws DaoFactoryException, IOException {
				controler = new Controler