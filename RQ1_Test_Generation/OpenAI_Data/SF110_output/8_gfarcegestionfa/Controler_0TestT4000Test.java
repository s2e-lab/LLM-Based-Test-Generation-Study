// Controler_0Test.java
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
* It contains ten unit test cases for the {@link Controler#createIdentite(String, String, String, String, TypeIdentite, String, String, String, String, String, int, int, String)} method.
*/
class Controler_0Test {

		private Controler controler;
		
		/**
		* Default constructor.
		*/
		public Controler_0Test() throws DaoFactoryException {
			controler = new Controler();
			controler.setTypeDataBase("db4o");
			controler.launchDatabase();
		}
		
		/**
		* Test case for the {@link Controler#createIdentite(String, String, String, String, TypeIdentite, String, String, String, String, String, int, int, String)} method.
		* @throws IOException 
		*/
		@Test
		public void testCreateIdentite_0() throws IOException {
			// Test case for the createIdentite method
			// Inputs : nom = "nom", prenom = "prenom", sex = "sex", email = "email", type = TypeIdentite.CANDIDAT, date_naissance = "01/01/2000", diplome = "diplome", photo = "photo", nationalite = "nationalite", telephone = "telephone", bourse = 0, acceptation = 0, formation = "formation"
			// Expected result : identite = Candidat(nom = "nom", prenom = "prenom", sex = "sex", email = "email", type = TypeIdentite.CANDIDAT, date_naissance = "01/01/2000", diplome = "diplome", photo = "photo", nationalite = "nationalite", telephone = "telephone", bourse = 0, acceptation = 0, formation = "formation")
			Identite identite = controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.CANDIDAT, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
			assertEquals(identite.getNom(), "nom");
			assertEquals(identite.getPrenom(), "prenom");
			assertEquals(identite.getSex(), "sex");
			assertEquals(identite.getEmail(), "email");
			assertEquals(identite.getType(), TypeIdentite.CANDIDAT);
			assertEquals(identite.getDate_naissance(), "01/01/2000");
			assertEquals(identite.getDiplome(), "diplome");
			assertEquals(identite.getPhoto(), "photo");
			assertEquals(identite.getNationalite(), "nationalite");
			assertEquals(identite.getTelephone(), "telephone");
			assertEquals(identite.getBourse(), 0);
			assertEquals(identite.getAcceptation(), 0);
			assertEquals(identite.getFormation(), "formation");
		}
		
		/**
		* Test case for the {@link Controler#createIdentite(String, String, String, String, TypeIdentite, String, String, String, String, String, int, int, String)} method.
		* @throws IOException 
		*/
		@Test
		public void testCreateIdentite_1() throws IOException {
			// Test case for the createIdentite method
			// Inputs : nom = "nom", prenom = "prenom", sex = "sex", email = "email", type = TypeIdentite.CANDIDAT, date_naissance = "01/01/2000", diplome = "diplome", photo = "photo", nationalite = "nationalite", telephone = "telephone", bourse = 0, acceptation = 0, formation = "formation"
			// Expected result : identite = Candidat(nom = "nom", prenom = "prenom", sex = "sex", email = "email", type = TypeIdentite.CANDIDAT, date_naissance = "01/01/2000", diplome = "diplome", photo = "photo", nationalite = "nationalite", telephone = "telephone", bourse = 0, acceptation = 0, formation = "formation")
			Identite identite = controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.CANDIDAT, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
			assertEquals(identite.getNom(), "nom");
			assertEquals(identite.getPrenom(), "prenom");
			assertEquals(identite.getSex(), "sex");
			assertEquals(identite.getEmail(), "email");
			assertEquals(identite.getType(), TypeIdentite.CANDIDAT);
			assertEquals(identite.getDate_naissance(), "01/01/2000");
			assertEquals(identite.getDiplome(), "diplome");
			assertEquals(identite.getPhoto(), "photo");
			assertEquals(identite.getNationalite(), "nationalite");
			assertEquals(identite.getTelephone(), "telephone");
			assertEquals(identite.getBourse(), 0);
			assertEquals(identite.getAcceptation(), 0);
			assertEquals(identite.getFormation(), "formation");
		}
		
		/**
		* Test case for the {@link Controler#createIdentite(String, String, String, String, TypeIdentite, String, String, String, String, String, int, int, String)} method.
		* @throws IOException 
		*/
		@Test
		public void testCreateIdentite_2() throws IOException {
			// Test case for the createIdentite method
			// Inputs : nom = "nom", prenom = "prenom", sex = "sex", email = "email", type = TypeIdentite.CANDIDAT, date_naissance = "01/01/2000", diplome = "diplome", photo = "photo", nationalite = "nationalite", telephone = "telephone", bourse = 0, acceptation = 0, formation = "formation"
			// Expected result : identite = Candidat(nom = "nom", prenom = "prenom", sex = "sex", email = "email", type = TypeIdentite.CANDIDAT, date_naissance = "01/01/2000", diplome = "diplome", photo = "photo", nationalite = "nationalite", telephone = "telephone", bourse = 0, acceptation = 0, formation = "formation")
			Identite identite = controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.CANDIDAT, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
			assertEquals(identite.getNom(), "nom");
			assertEquals(identite.getPrenom(), "prenom");
			assertEquals(identite.getSex(), "sex");
			assertEquals(identite.getEmail(), "email");
			assertEquals(identite.getType(), TypeIdentite.CANDIDAT);
			assertEquals(identite.getDate_naissance(), "01/01/2000");
			assertEquals(identite.getDiplome(), "diplome");
			assertEquals(identite.getPhoto(), "photo");
			assertEquals(identite.getNationalite(), "nationalite");
			assertEquals(identite.getTelephone(), "telephone");
			assertEquals(identite.getBourse(), 0);
			assertEquals(identite.getAcceptation(), 0);
			assertEquals(identite.getFormation(), "formation");
		}
		
		/**
		* Test case for the {@link Controler#createIdentite(String, String, String, String, TypeIdentite, String, String, String, String, String, int, int, String)} method.
		* @throws IOException 
		*/
		@Test
		public void testCreateIdentite_3() throws IOException {
			// Test case for the createIdentite method
			// Inputs : nom = "nom", prenom = "prenom", sex = "sex", email = "email", type = TypeIdentite.CANDIDAT, date_naissance = "01/01/2000", diplome = "diplome", photo = "photo", nationalite = "nationalite", telephone = "telephone", bourse = 0, acceptation = 0, formation = "formation"
			// Expected result : identite = Candidat(nom = "nom", prenom = "prenom", sex = "sex", email = "email", type = TypeIdentite.CANDIDAT, date_naissance = "01/01/2000", diplome = "diplome", photo = "photo", nationalite = "nationalite", telephone = "telephone", bourse = 0, acceptation = 0, formation = "formation")
			Identite identite = controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.CANDIDAT, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
			assertEquals(identite.getNom(), "nom");
			assertEquals(identite.getPrenom(), "prenom");
			assertEquals(identite.getSex(), "sex");
			assertEquals(identite.getEmail(), "email");
			assertEquals(identite.getType(), TypeIdentite.CANDIDAT);
			assertEquals(identite.getDate_naissance(), "01/01/2000");
			assertEquals(identite.getDiplome(), "diplome");
			assertEquals(identite.getPhoto(), "photo");
			assertEquals(identite.getNationalite(), "nationalite");
			assertEquals(identite.getTelephone(), "telephone");
			assertEquals(identite.getBourse(), 0);
			assertEquals(identite.getAcceptation(), 0);
			assertEquals(identite.getFormation(), "formation");
		}
		
		/**
		* Test case for the {@link Controler#createIdentite(String, String, String, String, TypeIdentite, String, String, String, String, String, int, int, String)} method.
		* @throws IOException 
		*/
		@Test
		public void testCreateIdentite_4() throws IOException {
			// Test case for the createIdentite method
			// Inputs : nom = "nom", prenom = "prenom", sex = "sex", email = "email", type = TypeIdentite.CANDIDAT, date_naissance = "01/01/2000", diplome = "diplome", photo = "photo", nationalite = "nationalite", telephone = "telephone", bourse = 0, acceptation = 0, formation = "formation"
			// Expected result : identite = Candidat(nom = "nom", prenom = "prenom", sex = "sex", email = "email", type = TypeIdentite.CANDIDAT, date_naissance = "01/01/2000", diplome = "diplome", photo = "photo", nationalite = "nationalite", telephone = "telephone", bourse = 0, acceptation = 0, formation = "formation")
			Identite identite = controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.CANDIDAT, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
			assertEquals(identite.getNom(), "nom");
			assertEquals(identite.getPrenom(), "prenom");
			assertEquals(identite.getSex(), "sex");
			assertEquals(identite.getEmail(), "email");
			assertEquals(identite.getType(), TypeIdentite.CANDIDAT);
			assertEquals(identite.getDate_naissance(), "01/01/2000");
			assertEquals(identite.getDiplome(), "diplome");
			assertEquals(identite.getPhoto(), "photo");
			assertEquals(identite.getNationalite(), "nationalite");
			assertEquals(identite.getTelephone(), "telephone");
			assertEquals(identite.getBourse(), 0);
			assertEquals(identite.getAcceptation(), 0);
			assertEquals(identite.getFormation(), "formation");
		}
		
		/**
		* Test case for the {@link Controler#createIdentite(String, String, String, String, TypeIdentite, String, String, String, String, String, int, int, String)} method.
		* @throws IOException 
		*/
		@Test
		public void testCreateIdentite_5() throws IOException {
			// Test case for the createIdentite method
			// Inputs : nom = "nom", prenom = "prenom", sex = "sex", email = "email", type = TypeIdentite.CANDIDAT, date_naissance = "01/01/2000", diplome = "diplome", photo = "photo", nationalite = "nationalite", telephone = "telephone", bourse = 0, acceptation = 0, formation = "formation"
			// Expected result : identite = Candidat(nom = "nom", prenom = "prenom", sex = "sex", email = "email", type = TypeIdentite.CANDIDAT, date_naissance = "01/01/2000", diplome = "diplome", photo = "photo", nationalite = "nationalite", telephone = "telephone", bourse = 0, acceptation = 0, formation = "formation")
			Identite identite = controler.createIdentite("nom", "prenom", "sex", "email", TypeIdentite.CANDIDAT, "01/01/2000", "diplome", "photo", "nationalite", "telephone", 0, 0, "formation");
			assertEquals(identite.getNom(), "nom");
			assertEquals(identite.getPrenom(), "prenom");
			assertEquals(identite.getSex(), "sex");
			assertEquals(identite.getEmail(), "email");
			assertEquals(identite.getType(), TypeIdentite.CANDIDAT);
			assertEquals(identite.getDate_naissance(), "01/01/2000");
			assertEquals(identite.getDiplome(), "diplome");
			assertEquals(identite.getPhoto(), "photo");
			assertEquals(identite.getNationalite(), "nationalite");
			assertEquals(identite.getTelephone(), "telephone");
			assertEquals(identite.getBourse(), 0);
			assertEquals(identite.getAcceptation(), 0);
			assertEquals(identite.getFormation(), "formation");
		}
		
		/**
		* Test case for the {@link Controler#createIdentite(String, String, String, String, TypeIdentite, String, String, String, String, String, int, int, String)} method.
		* @throws IOException 
		*/
		@Test
		public void testCreateIdentite_6() throws IOException {
			// Test case for the createIdentite method
			// Inputs : nom = "nom", prenom = "prenom", sex = "sex", email = "email", type = TypeIdentite.CANDIDAT, date_naissance = "01/01/2000", diplome = "diplome", photo = "photo", nationalite = "nationalite", telephone = "telephone",