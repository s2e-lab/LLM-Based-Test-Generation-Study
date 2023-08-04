// ModifTableStockage_2Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#selectMail()} method.
*/
class ModifTableStockage_2Test {

    /**
     * Test case for the {@link ModifTableStockage#selectMail()} method.
     * It tests the selection of the E-Mails.
     */
    @Test
    void selectMail() {
        // creation de la table d'origine
        String[] nomColonnes = {"Nom", "Prenom", "E-Mail"};
        Object[][] matrice = {{"Jean", "Paul", "<EMAIL>"}, {"Marie", "Pauline", "<EMAIL>"}, {"Paul", "Jean", "<EMAIL>"}};
        TableStockage ts = new TableStockage(nomColonnes, matrice);

        // creation de la table modifiee
        ModifTableStockage modifTableStockage = new ModifTableStockage(ts);
        TableStockage ts2 = modifTableStockage.selectMail();

        // test de la table modifiee
        assertEquals(ts2.getNbLignes(), 2);
        assertEquals(ts2.getNbColonnes(), 3);
        assertEquals(ts2.getNomColonnes()[0], "Nom");
        assertEquals(ts2.getNomColonnes()[1], "Prenom");
        assertEquals(ts2.getNomColonnes()[2], "E-Mail");
        assertEquals(ts2.getMatrice()[0][0], "Jean");
        assertEquals(ts2.getMatrice()[0][1], "Paul");
        assertEquals(ts2.getMatrice()[0][2], "<EMAIL>");
        assertEquals(ts2.getMatrice()[1][0], "Marie");
        assertEquals(ts2.getMatrice()[1][1], "Pauline");
        assertEquals(ts2.getMatrice()[1][2], "<EMAIL>");
    }
}

// ModifTableStockage_3Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#colonneMail()} method.
*/
class ModifTableStockage_3Test {
		
    /**
     * Test case for the {@link ModifTableStockage#colonneMail()} method.
     * It tests the creation of the "E-Mail" column.
     */
    @Test
    void colonneMail() {
        // creation de la table d'origine
        String[] nomColonnes = {"Nom", "Prenom", "E-Mail"};
        Object[][] matrice = {{"Jean", "Paul", "<EMAIL>"}, {"Marie", "Pauline", "<EMAIL>"}, {"Paul", "Jean", "<EMAIL>"}};
        TableStockage ts = new TableStockage(nomColonnes, matrice);

        // creation de la table modifiee
        ModifTableStockage modifTableStockage = new ModifTableStockage(ts);
        TableStockage ts2 = modifTableStockage.colonneMail();

        // test de la table modifiee
        assertEquals(ts2.getNbLignes(), 3);
        assertEquals(ts2.getNbColonnes(), 4);
        assertEquals(ts2.getNomColonnes()[0], "Nom");
        assertEquals(ts2.getNomColonnes()[1], "Prenom");
        assertEquals(ts2.getNomColonnes()[2], "E-Mail");
        assertEquals(ts2.getNomColonnes()[3], "E-Mail");
        assertEquals(ts2.getMatrice()[0][0], "Jean");
        assertEquals(ts2.getMatrice()[0][1], "Paul");
        assertEquals(ts2.getMatrice()[0][2], "<EMAIL>");
        assertEquals(ts2.getMatrice()[0][3], "<EMAIL>");
        assertEquals(ts2.getMatrice()[1][0], "Marie");
        assertEquals(ts2.getMatrice()[1][1], "Pauline");
        assertEquals(ts2.getMatrice()[1][2], "<EMAIL>");
        assertEquals(ts2.getMatrice()[1][3], "<EMAIL>");
        assertEquals(ts2.getMatrice()[2][0], "Paul");
        assertEquals(ts2.getMatrice()[2][1], "Jean");
        assertEquals(ts2.getMatrice()[2][2], "<EMAIL>");
        assertEquals(ts2.getMatrice()[2][3], "<EMAIL>");
    }
}

// ModifTableStockage_4Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#fusionnerColonnes(int)} method.
*/
class ModifTableStockage_4Test {
		
    /**
     * Test case for the {@link ModifTableStockage#fusionnerColonnes(int)} method.
     * It tests the fusion of two columns.
     */
    @Test
    void fusionnerColonnes() {
        // creation de la table d'origine
        String[] nomColonnes = {"Nom", "Prenom", "E-Mail"};
        Object[][] matrice = {{"Jean", "Paul", "<EMAIL>"}, {"Marie", "Pauline", "<EMAIL>"}, {"Paul", "Jean", "<EMAIL>"}};
        TableStockage ts = new TableStockage(nomColonnes, matrice);

        // creation de la table modifiee
        ModifTableStockage modifTableStockage = new ModifTableStockage(ts);
        TableStockage ts2 = modifTableStockage.fusionnerColonnes(2);

        // test de la table modifiee
        assertEquals(ts2.getNbLignes(), 3);
        assertEquals(ts2.getNbColonnes(), 3);
        assertEquals(ts2.getNomColonnes()[0], "Nom");
        assertEquals(ts2.getNomColonnes()[1], "Prenom");
        assertEquals(ts2.getNomColonnes()[2], "E-Mail");
        assertEquals(ts2.getMatrice()[0][0], "Jean");
        assertEquals(ts2.getMatrice()[0][1], "Paul");
        assertEquals(ts2.getMatrice()[0][2], "<EMAIL>");
        assertEquals(ts2.getMatrice()[1][0], "Marie");
        assertEquals(ts2.getMatrice()[1][1], "Pauline");
        assertEquals(ts2.getMatrice()[1][2], "<EMAIL>");
        assertEquals(ts2.getMatrice()[2][0], "Paul");
        assertEquals(ts2.getMatrice()[2][1], "Jean");
        assertEquals(ts2.getMatrice()[2][2], "<EMAIL>");
    }
}

// ModifTableStockage_5Test.java
package fr.unice.gfarce.interGraph;

import javax.swing.JOptionPane;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ModifTableStockage}.
* It contains ten unit test cases for the {@link ModifTableStockage#separerColonne(int)} method.
*/
class ModifTableStockage_5Test {
		
    /**
     * Test case for the {@link ModifTableStockage#separerColonne(int)} method.
     * It tests the separation of a column.
     */
    @Test
    void separerColonne() {
        // creation de la table d'origine
        String[] nomColonnes = {"Nom", "Prenom", "E-Mail"};
        Object[][] matrice = {{"Jean", "Paul", "<EMAIL>"}, {"Marie", "Pauline", "<EMAIL>"}, {"Paul", "Jean", "<EMAIL>"}};
        TableStockage ts = new TableStockage(nomColonnes, matrice);

        // creation de la table modifiee
        ModifTableStockage modifTableStockage = new ModifTableStockage(ts);
        TableStockage ts2 = modifTableStockage.separerColonne(2);

        // test de la table modifiee
        assertEquals(ts2.getNbLignes(), 3);
        assertEquals(ts2.getNbColonnes(), 4);
        assertEquals(ts2.getNomColonnes()[0], "Nom");
        assertEquals(ts2.getNomColonnes()[1], "Prenom");
        assertEquals(ts2.getNomColonnes()[2], "E-Mail");
        assertEquals(ts2.getNomColonnes()[3], "E-Mail");
        assertEquals(ts2.getMat