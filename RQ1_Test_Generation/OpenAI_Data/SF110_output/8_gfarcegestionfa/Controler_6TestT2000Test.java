// Controler_6Test.java
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
* It contains ten unit test cases for the {@link Controler#findCandidatInFormation(String, String)} method.
*/
class Controler_6Test {

		private Controler controler;
		
		/**
		* Test case for the {@link Controler#findCandidatInFormation(String, String)} method.
		* This test case is used to test the method with a valid formation name and a valid date.
		* The expected result is a non-empty array of candidates.
		*/
		@Test
		void testFindCandidatInFormation_1() throws Exception {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidatInFormation("M1", "01/09/2010");
				assertNotNull(result);
				assertTrue(result.length > 0);
		}
		
		/**
		* Test case for the {@link Controler#findCandidatInFormation(String, String)} method.
		* This test case is used to test the method with a valid formation name and a valid date.
		* The expected result is a non-empty array of candidates.
		*/
		@Test
		void testFindCandidatInFormation_2() throws Exception {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidatInFormation("M2", "01/09/2011");
				assertNotNull(result);
				assertTrue(result.length > 0);
		}
		
		/**
		* Test case for the {@link Controler#findCandidatInFormation(String, String)} method.
		* This test case is used to test the method with a valid formation name and a valid date.
		* The expected result is a non-empty array of candidates.
		*/
		@Test
		void testFindCandidatInFormation_3() throws Exception {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidatInFormation("M1", "01/09/2011");
				assertNotNull(result);
				assertTrue(result.length > 0);
		}
		
		/**
		* Test case for the {@link Controler#findCandidatInFormation(String, String)} method.
		* This test case is used to test the method with a valid formation name and a valid date.
		* The expected result is a non-empty array of candidates.
		*/
		@Test
		void testFindCandidatInFormation_4() throws Exception {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidatInFormation("M2", "01/09/2010");
				assertNotNull(result);
				assertTrue(result.length > 0);
		}
		
		/**
		* Test case for the {@link Controler#findCandidatInFormation(String, String)} method.
		* This test case is used to test the method with a valid formation name and a valid date.
		* The expected result is a non-empty array of candidates.
		*/
		@Test
		void testFindCandidatInFormation_5() throws Exception {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidatInFormation("M1", "01/09/2012");
				assertNotNull(result);
				assertTrue(result.length > 0);
		}
		
		/**
		* Test case for the {@link Controler#findCandidatInFormation(String, String)} method.
		* This test case is used to test the method with a valid formation name and a valid date.
		* The expected result is a non-empty array of candidates.
		*/
		@Test
		void testFindCandidatInFormation_6() throws Exception {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidatInFormation("M2", "01/09/2012");
				assertNotNull(result);
				assertTrue(result.length > 0);
		}
		
		/**
		* Test case for the {@link Controler#findCandidatInFormation(String, String)} method.
		* This test case is used to test the method with a valid formation name and a valid date.
		* The expected result is a non-empty array of candidates.
		*/
		@Test
		void testFindCandidatInFormation_7() throws Exception {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidatInFormation("M1", "01/09/2013");
				assertNotNull(result);
				assertTrue(result.length > 0);
		}
		
		/**
		* Test case for the {@link Controler#findCandidatInFormation(String, String)} method.
		* This test case is used to test the method with a valid formation name and a valid date.
		* The expected result is a non-empty array of candidates.
		*/
		@Test
		void testFindCandidatInFormation_8() throws Exception {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidatInFormation("M2", "01/09/2013");
				assertNotNull(result);
				assertTrue(result.length > 0);
		}
		
		/**
		* Test case for the {@link Controler#findCandidatInFormation(String, String)} method.
		* This test case is used to test the method with a valid formation name and a valid date.
		* The expected result is a non-empty array of candidates.
		*/
		@Test
		void testFindCandidatInFormation_9() throws Exception {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
				Candidat[] result = controler.findCandidatInFormation("M1", "01/09/2014");
				assertNotNull(result);
				assertTrue(result.length > 0);
		}
		
		/**
		* Test case for the {@link Controler#findCandidatInFormation(String, String)} method.
		* This test case is used to test the method with a valid formation name and a valid date.
		* The expected result is a non-empty array of candidates.
		*/
		@Test
		void testFindCandidatInFormation_10() throws Exception {
				controler = new Controler();
				controler.setType