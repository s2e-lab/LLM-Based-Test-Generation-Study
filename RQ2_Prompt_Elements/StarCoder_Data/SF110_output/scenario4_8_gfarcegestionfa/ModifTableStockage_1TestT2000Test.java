// ModifTableStockage_1Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockage_1Test {

    /**
     * Test case for the {@link ModifTableStockage#colonneMail()} method.
     * It tests the {@link ModifTableStockage#colonneMail()} method with a table with 10 rows and 3 columns.
     * It tests the {@link ModifTableStockage#colonneMail()} method with a table with 10 rows and 4 columns.
     * It tests the {@link ModifTableStockage#colonneMail()} method with a table with 10 rows and 5 columns.
     * It tests the {@link ModifTableStockage#colonneMail()} method with a table with 10 rows and 6 columns.
     * It tests the {@link ModifTableStockage#colonneMail()} method with a table with 10 rows and 7 columns.
     * It tests the {@link ModifTableStockage#colonneMail()} method with a table with 10 rows and 8 columns.
     * It tests the {@link ModifTableStockage#colonneMail()} method with a table with 10 rows and 9 columns.
     * It tests the {@link ModifTableStockage#colonneMail()} method with a table with 10 rows and 10 columns.
     * It tests the {@link ModifTableStockage#colonneMail()} method with a table with 10 rows and 11 columns.
     */
    @Test
    void colonneMail() {
        // Table with 10 rows and 3 columns
        String[] nomColonnes = {"Nom", "Prenom", "Age"};
        Object[][] matrice = {
            {"Jean", "Paul", 25},
            {"Marie", "Pauline", 26},
            {"Paul", "Jean", 27},
            {"Pauline", "Marie", 28},
            {"Jeanne", "Paul", 29},
            {"Marie", "Pauline", 30},
            {"Paul", "Jean", 31},
            {"Pauline", "Marie", 32},
            {"Jeanne", "Paul", 33},
            {"Marie", "Pauline", 34}
        };
        TableStockage ts = new TableStockage(nomColonnes, matrice);
        ModifTableStockage modifTableStockage = new ModifTableStockage(ts);
        TableStockage ts2 = modifTableStockage.colonneMail();
        assertEquals(10, ts2.getNbLignes());
        assertEquals(4, ts2.getNbColonnes());
        assertEquals("Nom", ts2.getNomColonne(0));
        assertEquals("Prenom", ts2.getNomColonne(1));
        assertEquals("Age", ts2.getNomColonne(2));
        assertEquals("E-Mail", ts2.getNomColonne(3));
        assertEquals("<EMAIL>", ts2.getValeur(0, 3));
        assertEquals("<EMAIL>", ts2.getValeur(1, 3));
        assertEquals("<EMAIL>", ts2.getValeur(2, 3));
        assertEquals("<EMAIL>", ts2.getValeur(3, 3));
        assertEquals("<EMAIL>", ts2.getValeur(4, 3));
        assertEquals("<EMAIL>", ts2.getValeur(5, 3));
        assertEquals("<EMAIL>", ts2.getValeur(6, 3));
        assertEquals("<EMAIL>", ts2.getValeur(7, 3));
        assertEquals("<EMAIL>", ts2.getValeur(8, 3));
        assertEquals("<EMAIL>", ts2.getValeur(9, 3));

        // Table with 10 rows and 4 columns
        nomColonnes = new String[] {"Nom", "Prenom", "Age", "E-Mail"};
        matrice = new Object[][] {
            {"Jean", "Paul", 25, "<EMAIL>"},
            {"Marie", "Pauline", 26, "<EMAIL>"},
            {"Paul", "Jean", 27, "<EMAIL>"},
            {"Pauline", "Marie", 28, "<EMAIL>"},
            {"Jeanne", "Paul", 29, "<EMAIL>"},
            {"Marie", "Pauline", 30, "<EMAIL>"},
            {"Paul", "Jean", 31, "<EMAIL>"},
            {"Pauline", "Marie", 32, "<EMAIL>"},
            {"Jeanne", "Paul", 33, "<EMAIL>"},
            {"Marie", "Pauline", 34, "<EMAIL>"}
        };
        ts = new TableStockage(nomColonnes, matrice);
        modifTableStockage = new ModifTableStockage(ts);
        ts2 = modifTableStockage.colonneMail();
        assertEquals(10, ts2.getNbLignes());
        assertEquals(4, ts2.getNbColonnes());
        assertEquals("Nom", ts2.getNomColonne(0));
        assertEquals("Prenom", ts2.getNomColonne(1));
        assertEquals("Age", ts2.getNomColonne(2));
        assertEquals("E-Mail", ts2.getNomColonne(3));
        assertEquals("<EMAIL>", ts2.getValeur(0, 3));
        assertEquals("<EMAIL>", ts2.getValeur(1, 3));
        assertEquals("<EMAIL>", ts2.getValeur(2, 3));
        assertEquals("<EMAIL>", ts2.getValeur(3, 3));
        assertEquals("<EMAIL>", ts2.getValeur(4, 3));
        assertEquals("<EMAIL>", ts2.getValeur(5, 3));
        assertEquals("<EMAIL>", ts2.getValeur(6, 3));
        assertEquals("<EMAIL>", ts2.getValeur(7, 3));
        assertEquals("<EMAIL>", ts2.getValeur(8, 3));
        assertEquals("<EMAIL>", ts2.getValeur(9, 3));

        // Table with 10 rows and 5 columns
        nomColonnes = new String[] {"Nom", "Prenom", "Age", "E-Mail", "Adresse"};
        matrice = new Object[][] {
            {"Jean", "Paul", 25, "<EMAIL>", "1 rue des champs"},
            {"Marie", "Pauline", 26, "<EMAIL>", "2 rue des champs"},
            {"Paul", "Jean", 27, "<EMAIL>", "3 rue des champs"},
            {"Pauline", "Marie", 28, "<EMAIL>", "4 rue des champs"},
            {"Jeanne", "Paul", 29, "<EMAIL>", "5 rue des champs"},
            {"Marie", "Pauline", 30, "<EMAIL>", "6 rue des champs"},
            {"Paul", "Jean", 31, "<EMAIL>", "7 rue des champs"},
            {"Pauline", "Marie", 32, "<EMAIL>", "8 rue des champs"},
            {"Jeanne", "Paul", 33, "<EMAIL>", "9 rue des champs"},
            {"Marie", "Pauline", 34, "<EMAIL>", "10 rue des champs"}
        };
        ts = new TableStockage(nomColonnes, matrice);
        modifTableStockage = new ModifTableStockage(ts);
        ts2 = modifTableStockage.colonneMail();
        assertEquals(10, ts2.getNbLignes());
        assertEquals(5, ts2.getNbColonnes());
        assertEquals("Nom", ts2.getNomColonne(0));
        assertEquals("Prenom", ts2.getNomColonne(1));
        assertEquals("Age", ts2.getNomColonne(2));
        assertEquals("E-Mail", ts2.getNomColonne(3));
        assertEquals("Adresse", ts2.getNomColonne(4));
        assertEquals("<EMAIL>", ts2.getValeur(0, 3));
        assertEquals("<EMAIL>", ts2.getValeur(1, 3));
        assertEquals("<EMAIL>", ts2.getValeur(2, 3));
        assertEquals("<EMAIL>", ts2.getValeur(3, 3));
        assertEquals("<EMAIL>", ts2.getValeur(4, 3));
        assertEquals("<EMAIL>", ts2.getValeur(5, 3));
        assertEquals("<EMAIL>", ts2.getValeur(6, 3));
        assertEquals("<EMAIL>", ts2.getValeur(7, 3));
        assertEquals("<EMAIL>", ts2.getValeur(8, 3));
        assertEquals("<EMAIL>", ts2.getValeur(9, 3));

        // Table with 10 rows and 