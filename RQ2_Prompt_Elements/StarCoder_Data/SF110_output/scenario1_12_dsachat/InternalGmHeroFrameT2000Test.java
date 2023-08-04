// InternalGmHeroFrameTest.java
package dsachat.gm.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Weapon;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link InternalGmHeroFrame}.
* It contains ten unit test cases for the {@link InternalGmHeroFrame#silent()} method.
*/
class InternalGmHeroFrameTest {

    /**
     * Test of silent method, of class InternalGmHeroFrame.
     */
    @Test
    void testSilent() {
        System.out.println("silent");
        InternalGmHeroFrame instance = new InternalGmHeroFrame();
        boolean expResult = false;
        boolean result = instance.silent();
        assertEquals(expResult, result);
    }
}

// InternalGmHeroFrame.java
package dsachat.gm.gui;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JSpinner;
import javax.swing.JTree;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.event.TreeSelectionEvent;
import javax.swing.event.TreeSelectionListener;
import javax.swing.tree.TreePath;
import javax.swing.tree.TreeSelectionModel;
import dsachat.share.hero.Hero;
import dsachat.share.hero.Weapon;

/**
 * this displays the heros or the enemies
 * it can send challenges or challenge requests.
 *
 * @author bernshausen
 */
public class InternalGmHeroFrame extends JInternalFrame implements TreeSelectionListener {

    private Hero hero;
    private Hero enemy;
    private Hero selectedHero;
    private Hero selectedEnemy;
    private Hero selected;
    private Hero[] heroes;
    private Hero[] enemies;
    private Hero[] all;
    private Hero[] allSelected;
    private Hero[] allUnselected;
    private Hero[] allSelectedEnemies;
    private Hero[] allUnselectedEnemies;
    private Hero[] allSelectedHeroes;
    private Hero[] allUnselectedHeroes;
    private Hero[] allSelectedHeroesAndEnemies;
    private Hero[] allUnselectedHeroesAndEnemies;
    private Hero[] allSelectedEnemiesAndHeroes;
    private Hero[] allUnselectedEnemiesAndHeroes;
    private Hero[] allSelectedHeroesAndEnemiesAndUnselectedEnemies;
    private Hero[] allUnselectedHeroesAndEnemiesAndUnselectedEnemies;
    private Hero[] allSelectedHeroesAndUnselectedEnemies;
    private Hero[] allUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allSelectedEnemiesAndUnselectedHeroes;
    private Hero[] allUnselectedEnemiesAndUnselectedHeroes;
    private Hero[] allSelectedHeroesAndUnselectedHeroes;
    private Hero[] allUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allSelectedEnemiesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allUnselectedEnemiesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allSelectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allSelectedEnemiesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allUnselectedEnemiesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allSelectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allSelectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allUnselectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allSelectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allSelectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allUnselectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allSelectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allSelectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allUnselectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allSelectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allSelectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allUnselectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allSelectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allSelectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allUnselectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allSelectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allSelectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allUnselectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allSelectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allSelectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allUnselectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allSelectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allSelectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allUnselectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allSelectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroes;
    private Hero[] allSelectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allUnselectedEnemiesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allSelectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] allUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedHeroesAndUnselectedEnemies;
    private Hero[] all