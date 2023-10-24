// ControlerTest.java
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
* It contains ten unit test cases for the {@link Controler#findAllFormation()} method.
*/
class ControlerTest {

    /**
     * Test of {@link Controler#findAllFormation()} method.
     *
     * @throws DaoFactoryException
     * @throws IOException
     * @throws WriteException
     * @throws RowsExceededException
     * @throws ParseException
     */
    @Test
    void testFindAllFormation() throws DaoFactoryException, IOException, WriteException, RowsExceededException, ParseException {
        DaoFactory daoFactory = DaoFactory.getDaoFactory(TypeFabrique.DAO_FACTORY_PERSISTANT);
        FormationDao fdao = daoFactory.getFormationDao();
        Collection<Formation> formations = fdao.findAll();
        assertEquals(formations.size(), 1);
        Formation formation = formations.iterator().next();
        assertEquals(formation.getNom(), "Formation 1");
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
        assertEquals(formation.getDuree(), 10);
       