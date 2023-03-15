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
			Calendar date = Calendar.getInstance();
			date.set(Calendar.MONTH, Calendar.JANUARY);
			date.set(Calendar.DAY_OF_MONTH, 1);
			date.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation(null, date);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation4() {
			Calendar date = Calendar.getInstance();
			date.set(Calendar.MONTH, Calendar.JANUARY);
			date.set(Calendar.DAY_OF_MONTH, 1);
			date.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", date);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation5() {
			Calendar date = Calendar.getInstance();
			date.set(Calendar.MONTH, Calendar.JANUARY);
			date.set(Calendar.DAY_OF_MONTH, 1);
			date.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", date);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation6() {
			Calendar date = Calendar.getInstance();
			date.set(Calendar.MONTH, Calendar.JANUARY);
			date.set(Calendar.DAY_OF_MONTH, 1);
			date.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", date);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation7() {
			Calendar date = Calendar.getInstance();
			date.set(Calendar.MONTH, Calendar.JANUARY);
			date.set(Calendar.DAY_OF_MONTH, 1);
			date.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", date);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation8() {
			Calendar date = Calendar.getInstance();
			date.set(Calendar.MONTH, Calendar.JANUARY);
			date.set(Calendar.DAY_OF_MONTH, 1);
			date.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", date);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation9() {
			Calendar date = Calendar.getInstance();
			date.set(Calendar.MONTH, Calendar.JANUARY);
			date.set(Calendar.DAY_OF_MONTH, 1);
			date.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", date);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oFormationFactory#findFormation(String, Calendar)} method.
		* It tests the case where the name is not null and the date is not null.
		*/
		@Test
		public void testFindFormation10() {
			Calendar date = Calendar.getInstance();
			date.set(Calendar.MONTH, Calendar.JANUARY);
			date.set(Calendar.DAY_OF_MONTH, 1);
			date.set(Calendar.YEAR, 2000);
			Formation[] tab = dff.findFormation("Java", date);
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
public class Db4oRespFormationFactory implements RespFormationDao {

    // Interface qui repr&eacute;sente la connexion � la BD
    ObjectContainer bd;

    String nombase;

    Configuration configuration;

    public Db4oRespFormationFactory() throws IOException {
        nombase = Db4oConfig.getInfo();
    }

    private void getConfig() {
        configuration = Db4o.newConfiguration();
        configuration.lockDatabaseFile(false);
    }

    /**
     * Ajoute un Responsable de Formation dans le cache.
     * @param rf
     * @return
     */
    @Override
    public void insert(RespFormation rf) {
        getConfig();
        bd = Db4o.openFile(configuration, nombase);
        bd.store(rf);
        bd.commit();
        bd.close();
    }

    /**
     * Modifie un Responsable de Formation deja pr&eacute;sent dans le cache.
     * @param rf
     * @return
     */
    @Override
    public void update(RespFormation rf) throws DaoException {
        getConfig();
        bd = Db4o.openFile(configuration, nombase);
        ObjectSet<RespFormation> result = bd.queryByExample(new RespFormation(rf.getNom(), rf.getPrenom()));
        List<RespFormation> res = (List<RespFormation>) result;
        if (res != null) {
            bd.delete(res.get(0));
        }
        bd.store(rf);
        bd.commit();
        bd.close();
    }

    /**
     * Supprime un Responsable de Formation dans le cache.
     * @param rf
     * @return
     */
    @Override
    public void delete(RespFormation rf) {
        getConfig();
        bd = Db4o.openFile(configuration, nombase);
        ObjectSet<RespFormation> result = bd.queryByExample(new RespFormation(rf.getNom(), rf.getPrenom()));
        List<RespFormation> res = (List<RespFormation>) result;
        if (res != null) {
            bd.delete(res.get(0));
        }
        bd.commit();
        bd.close();
    }

    /**
     * Recherche des Responsables de Formation du cache selon certains crit&egrave;res.
     * Retourne tous les responsables de formation du cache si name=prenom=null.
     * @param name
     * @param prenom
     * @return RespFormation[]
     */
    @Override
    public RespFormation[] findRespFormation(String name, String prenom) {
        getConfig();
        bd = Db4o.openFile(configuration, nombase);
        List<RespFormation> tab = new ArrayList<RespFormation>();
        ObjectSet<RespFormation> rf = bd.queryByExample(new RespFormation(name, prenom));
        List<RespFormation> res = (List<RespFormation>) rf;
        for (int i = 0; i < res.size(); i++) {
            if (name != null) {
                if (res.get(i).getNom().equals(name)) {
                    tab.add(res.get(i));
                }
            } else if (prenom != null) {
                if (res.get(i).getPrenom().equals(prenom)) {
                    tab.add(res.get(i));
                }
            } else
                tab.add(res.get(i));
        }
        bd.close();
        return tab.toArray(new RespFormation[tab.size()]);
    }
}

// Db4oRespFormationFactoryTest.java
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
import fr.unice.gfarce.identity.RespFormation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Db4oRespFormationFactory}.
* It contains ten unit test cases for the {@link Db4oRespFormationFactory#findRespFormation(String, String)} method.
*/
class Db4oRespFormationFactoryTest {
		
		private Db4oRespFormationFactory drff;
		
		public Db4oRespFormationFactoryTest() throws IOException {
			drff = new Db4oRespFormationFactory();
		}
		
		/**
		* Test case for the {@link Db4oRespFormationFactory#findRespFormation(String, String)} method.
		* It tests the case where the name is null and the prenom is null.
		*/
		@Test
		public void testFindRespFormation1() {
			RespFormation[] tab = drff.findRespFormation(null, null);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oRespFormationFactory#findRespFormation(String, String)} method.
		* It tests the case where the name is not null and the prenom is null.
		*/
		@Test
		public void testFindRespFormation2() {
			RespFormation[] tab = drff.findRespFormation("Java", null);
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oRespFormationFactory#findRespFormation(String, String)} method.
		* It tests the case where the name is null and the prenom is not null.
		*/
		@Test
		public void testFindRespFormation3() {
			RespFormation[] tab = drff.findRespFormation(null, "Java");
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oRespFormationFactory#findRespFormation(String, String)} method.
		* It tests the case where the name is not null and the prenom is not null.
		*/
		@Test
		public void testFindRespFormation4() {
			RespFormation[] tab = drff.findRespFormation("Java", "Java");
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oRespFormationFactory#findRespFormation(String, String)} method.
		* It tests the case where the name is not null and the prenom is not null.
		*/
		@Test
		public void testFindRespFormation5() {
			RespFormation[] tab = drff.findRespFormation("Java", "Java");
			assertEquals(tab.length, 0);
		}
		
		/**
		* Test case for the {@link Db4oRespFormationFactory#findRespFormation(String, String)} method.
		* It tests the case where the name is not null and the prenom is not null.
		*/
		@Test
		public void testFindRespFormation6() {
			RespFormation[] tab = drff.findRespFormation("Java", "Java");
			assertEquals(tab.length, 0);
		}
		
		/**