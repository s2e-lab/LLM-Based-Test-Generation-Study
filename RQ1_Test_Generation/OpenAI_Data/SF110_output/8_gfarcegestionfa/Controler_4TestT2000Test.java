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
* It contains ten unit test cases for the {@link Controler#findFormation(String, String)} method.
*/
class Controler_4Test {

		private Controler controler;
		
		/**
		* Default constructor.
		*/
		public Controler_4Test() throws DaoFactoryException {
				controler = new Controler();
				controler.setTypeDataBase("db4o");
				controler.launchDatabase();
		}
		
		/**
		* Test case for the {@link Controler#findFormation(String, String)} method.
		* Test case for the {@link Controler#findFormation(String, String)} method.
		* @throws IOException 
		* @throws ParseException 
		* @throws WriteException 
		* @throws RowsExceededException 
		*/
		@Test
		void testFindFormation_1() throws RowsExceededException, WriteException, ParseException, IOException {
				Formation[] formations = controler.findFormation("Licence", "01/01/2000");
				assertEquals(1, formations.length);
				assertEquals("Licence", formations[0].getTitre());
				assertEquals(2000, formations[0].getDate_limite_candidature().get(Calendar.YEAR));
				assertEquals(1, formations[0].getDate_limite_candidature().get(Calendar.MONTH));
				assertEquals(1, formations[0].getDate_limite_candidature().get(Calendar.DAY_OF_MONTH));
				assertEquals(1000, formations[0].getMontant_inscription());
				assertEquals("Jean", formations[0].getResponsable().getNom());
				assertEquals("Dupont", formations[0].getResponsable().getPrenom());
				assertEquals("M", formations[0].getResponsable().getSex());
				assertEquals("jean.dupont@unice.fr", formations[0].getResponsable().getEmail());
				assertEquals("0600000000", formations[0].getResponsable().getTelephone());
				assertEquals(TypeIdentite.FORMATEUR, formations[0].getResponsable().getType());
				assertEquals(1, formations[0].getCandidat().size());
				Candidat[] candidats = formations[0].getCandidat().toArray(new Candidat[1]);
				assertEquals("Jean", candidats[0].getNom());
				assertEquals("Dupont", candidats[0].getPrenom());
				assertEquals("M", candidats[0].getSex());
				assertEquals("jean.dupont@unice.fr", candidats[0].getEmail());
				assertEquals(2000, candidats[0].getDate_naissance().get(Calendar.YEAR));
				assertEquals(1, candidats[0].getDate_naissance().get(Calendar.MONTH));
				assertEquals(1, candidats[0].getDate_naissance().get(Calendar.DAY_OF_MONTH));
				assertEquals("Bac", candidats[0].getDiplome());
				assertEquals("France", candidats[0].getNationalite());
				assertEquals(0, candidats[0].getBource());
				assertEquals(1, candidats[0].getAcceptation());
				assertEquals(TypeIdentite.CANDIDAT, candidats[0].getType());
		}
		
		/**
		* Test case for the {@link Controler#findFormation(String, String)} method.
		* Test case for the {@link Controler#findFormation(String, String)} method.
		* @throws IOException 
		* @throws ParseException 
		* @throws WriteException 
		* @throws RowsExceededException 
		*/
		@Test
		void testFindFormation_2() throws RowsExceededException, WriteException, ParseException, IOException {
				Formation[] formations = controler.findFormation("Licence", "01/01/2001");
				assertEquals(1, formations.length);
				assertEquals("Licence", formations[0].getTitre());
				assertEquals(2001, formations[0].getDate_limite_candidature().get(Calendar.YEAR));
				assertEquals(1, formations[0].getDate_limite_candidature().get(Calendar.MONTH));
				assertEquals(1, formations[0].getDate_limite_candidature().get(Calendar.DAY_OF_MONTH));
				assertEquals(1000, formations[0].getMontant_inscription());
				assertEquals("Jean", formations[0].getResponsable().getNom());
				assertEquals("Dupont", formations[0].getResponsable().getPrenom());
				assertEquals("M", formations[0].getResponsable().getSex());
				assertEquals("jean.dupont@unice.fr", formations[0].getResponsable().getEmail());
				assertEquals("0600000000", formations[0].getResponsable().getTelephone());
				assertEquals(TypeIdentite.FORMATEUR, formations[0].getResponsable().getType());
				assertEquals(1, formations[0].getCandidat().size());
				Candidat[] candidats = formations[0].getCandidat().toArray(new Candidat[1]);
				assertEquals("Jean", candidats[0].getNom());
				assertEquals("Dupont", candidats[0].getPrenom());
				assertEquals("M", candidats[0].getSex());
				assertEquals("jean.dupont@unice.fr", candidats[0].getEmail());
				assertEquals(2000, candidats[0].getDate_naissance().get(Calendar.YEAR));
				assertEquals(1, candidats[0].getDate_naissance().get(Calendar.MONTH));
				assertEquals(1, candidats[0].getDate_naissance().get(Calendar.DAY_OF_MONTH));
				assertEquals("Bac", candidats[0].getDiplome());
				assertEquals("France", candidats[0].getNationalite());
				assertEquals(0, candidats[0].getBource());
				assertEquals(1, candidats[0].getAcceptation());
				assertEquals(TypeIdentite.CANDIDAT, candidats[0].getType());
		}
		
		/**
		* Test case for the {@link Controler#findFormation(String, String)} method.
		* Test case for the {@link Controler#findFormation(String, String)} method.
		* @throws IOException 
		* @throws ParseException 
		* @throws WriteException 
		* @throws RowsExceededException 
		*/
		@Test
		void testFindFormation_3() throws RowsExceededException, WriteException, ParseException, IOException {
				Formation[] formations = controler.findFormation("Licence", "01/01/2002");
				assertEquals(1, formations.length);
				assertEquals("Licence", formations[0].getTitre());
				assertEquals(2002, formations[0].getDate_limite_candidature().get(Calendar.YEAR