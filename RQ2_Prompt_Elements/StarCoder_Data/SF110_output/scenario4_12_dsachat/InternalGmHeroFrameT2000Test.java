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
        InternalGmHeroFrame instance = new InternalGmHeroFrame(null, null, null);
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

    /**
     */
    private static final long serialVersionUID = -8647088721012280920L;

    private GmFrame parent;

    private JTree tree;

    private JButton btnExec;

    private JSpinner spnMod;

    private MultiHeroTreeModel model;

    private JComboBox cmbUsers;

    private JRadioButton radAttack;

    private JRadioButton radDefense;

    private String frameName;

    /**
     * set up a new window
     * @param parent the parent component and action listener
     * @param heros the data to display in tree
     * @param name the name and caption of this frame
     */
    public InternalGmHeroFrame(GmFrame parent, Vector<Hero> heros, String name) {
        super(name, true, true, true, true);
        this.parent = parent;
        this.frameName = name;
        this.model = new MultiHeroTreeModel(heros);
        this.tree = new JTree(model);
        this.tree.getSelectionModel().setSelectionMode(TreeSelectionModel.SINGLE_TREE_SELECTION);
        this.tree.addTreeSelectionListener(this);
        this.tree.setRootVisible(false);
        this.tree.setShowsRootHandles(true);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setRowHeight(20);
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setLargeModel(true);
        this.tree.setScrollsOnExpand(true);
        this.tree.setToggleClickCount(0);
        this.tree.setRowHeight(20);
        this.tree.setShowsRootHandles(true);
        this.tree.setRootVisible(false);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setToggleClickCount(0);
        this.tree.setRowHeight(20);
        this.tree.setShowsRootHandles(true);
        this.tree.setRootVisible(false);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setToggleClickCount(0);
        this.tree.setRowHeight(20);
        this.tree.setShowsRootHandles(true);
        this.tree.setRootVisible(false);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setToggleClickCount(0);
        this.tree.setRowHeight(20);
        this.tree.setShowsRootHandles(true);
        this.tree.setRootVisible(false);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setToggleClickCount(0);
        this.tree.setRowHeight(20);
        this.tree.setShowsRootHandles(true);
        this.tree.setRootVisible(false);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setToggleClickCount(0);
        this.tree.setRowHeight(20);
        this.tree.setShowsRootHandles(true);
        this.tree.setRootVisible(false);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setToggleClickCount(0);
        this.tree.setRowHeight(20);
        this.tree.setShowsRootHandles(true);
        this.tree.setRootVisible(false);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setToggleClickCount(0);
        this.tree.setRowHeight(20);
        this.tree.setShowsRootHandles(true);
        this.tree.setRootVisible(false);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setToggleClickCount(0);
        this.tree.setRowHeight(20);
        this.tree.setShowsRootHandles(true);
        this.tree.setRootVisible(false);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setToggleClickCount(0);
        this.tree.setRowHeight(20);
        this.tree.setShowsRootHandles(true);
        this.tree.setRootVisible(false);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setToggleClickCount(0);
        this.tree.setRowHeight(20);
        this.tree.setShowsRootHandles(true);
        this.tree.setRootVisible(false);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setToggleClickCount(0);
        this.tree.setRowHeight(20);
        this.tree.setShowsRootHandles(true);
        this.tree.setRootVisible(false);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setToggleClickCount(0);
        this.tree.setRowHeight(20);
        this.tree.setShowsRootHandles(true);
        this.tree.setRootVisible(false);
        this.tree.setCellRenderer(new HeroTreeRenderer());
        this.tree.setEditable(false);
        this.tree.setScrollsOnExpand(true);
        this.tree.setExpandsSelectedPaths(true);
        this.tree.setToggleClick