// Main_5Test.java
package visu.handball.moves;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JInternalFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JToolBar;
import javax.swing.ListSelectionModel;
import javax.swing.UIManager;
import visu.handball.moves.actions.AboutAction;
import visu.handball.moves.actions.ChangeColorsAction;
import visu.handball.moves.actions.CloseAction;
import visu.handball.moves.actions.CreateMovePdfAction;
import visu.handball.moves.actions.DeleteEventAction;
import visu.handball.moves.actions.NewAction;
import visu.handball.moves.actions.NewMoveEventAction;
import visu.handball.moves.actions.NewPassEventAction;
import visu.handball.moves.actions.NewSequenceAction;
import visu.handball.moves.actions.OpenAction;
import visu.handball.moves.actions.PauseAnimationAction;
import visu.handball.moves.actions.PrintActualSequenzAction;
import visu.handball.moves.actions.PrintMoveAction;
import visu.handball.moves.actions.SaveAction;
import visu.handball.moves.actions.SetMoveNameAction;
import visu.handball.moves.actions.StartAnimationAction;
import visu.handball.moves.actions.StartOneSequenceAnimationAction;
import visu.handball.moves.actions.StopAnimationAction;
import visu.handball.moves.controller.CommentController;
import visu.handball.moves.controller.JMenuHelper;
import visu.handball.moves.controller.MouseController;
import visu.handball.moves.model.ColorModel;
import visu.handball.moves.model.HandballModel;
import visu.handball.moves.model.TableHandballModel;
import visu.handball.moves.model.TableSelectionListener;
import visu.handball.moves.resources.Resources;
import visu.handball.moves.views.CommentView;
import visu.handball.moves.views.EventTableCellDelayEditor;
import visu.handball.moves.views.EventTableCellRenderer;
import visu.handball.moves.views.Field;
import visu.handball.moves.views.PlayerToolBar;
import visu.handball.moves.views.StatusBar;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Main}.
* It contains ten unit test cases for the {@link Main#deepCopy(Object)} method.
*/
class Main_5Test {

    /**
     * Test of {@link Main#deepCopy(Object)} method, of class Main.
     */
    @Test
    void testDeepCopy() throws Exception {
        System.out.println("deepCopy");
        // Test 1:
        // Create a new instance of the Main class
        Main instance = new Main();
        // Create a new instance of the ColorModel class
        ColorModel colorModel = new ColorModel();
        // Create a new instance of the HandballModel class
        HandballModel handballModel = new HandballModel();
        // Create a new instance of the TableHandballModel class
        TableHandballModel tableHandballModel = new TableHandballModel();
        // Create a new instance of the TableSelectionListener class
        TableSelectionListener tableSelectionListener = new TableSelectionListener();
        // Create a new instance of the CommentController class
        CommentController commentController = new CommentController();
        // Create a new instance of the JMenuHelper class
        JMenuHelper jMenuHelper = new JMenuHelper();
        // Create a new instance of the MouseController class
        MouseController mouseController = new MouseController();
        // Create a new instance of the AboutAction class
        AboutAction aboutAction = new AboutAction();
        // Create a new instance of the ChangeColorsAction class
        ChangeColorsAction changeColorsAction = new ChangeColorsAction();
        // Create a new instance of the CloseAction class
        CloseAction closeAction = new CloseAction();
        // Create a new instance of the CreateMovePdfAction class
        CreateMovePdfAction createMovePdfAction = new CreateMovePdfAction();
        // Create a new instance of the DeleteEventAction class
        DeleteEventAction deleteEventAction = new DeleteEventAction();
        // Create a new instance of the NewAction class
        NewAction newAction = new NewAction();
        // Create a new instance of the NewMoveEventAction class
        NewMoveEventAction newMoveEventAction = new NewMoveEventAction();
        // Create a new instance of the NewPassEventAction class
        NewPassEventAction newPassEventAction = new NewPassEventAction();
        // Create a new instance of the NewSequenceAction class
        NewSequenceAction newSequenceAction = new NewSequenceAction();
        // Create a new instance of the OpenAction class
        OpenAction openAction = new OpenAction();
        // Create a new instance of the PauseAnimationAction class
        PauseAnimationAction pauseAnimationAction = new PauseAnimationAction();
        // Create a new instance of the PrintActualSequenzAction class
        PrintActualSequenzAction printActualSequenzAction = new PrintActualSequenzAction();
        // Create a new instance of the PrintMoveAction class
        PrintMoveAction printMoveAction = new PrintMoveAction();
        // Create a new instance of the SaveAction class
        SaveAction saveAction = new SaveAction();
        // Create a new instance of the SetMoveNameAction class
        SetMoveNameAction setMoveNameAction = new SetMoveNameAction();
        // Create a new instance of the StartAnimationAction class
        StartAnimationAction startAnimationAction = new StartAnimationAction();
        // Create a new instance of the StartOneSequenceAnimationAction class
        StartOneSequenceAnimationAction startOneSequenceAnimationAction = new StartOneSequenceAnimationAction();
        // Create a new instance of the StopAnimationAction class
        StopAnimationAction stopAnimationAction = new StopAnimationAction();
        // Create a new instance of the CommentView class
        CommentView commentView = new CommentView();
        // Create a new instance of the EventTableCellDelayEditor class
        EventTableCellDelayEditor eventTableCellDelayEditor = new EventTableCellDelayEditor();
        // Create a new instance of the EventTableCellRenderer class
        EventTableCellRenderer eventTableCellRenderer = new EventTableCellRenderer();
        // Create a new instance of the Field class
        Field field = new Field();
        // Create a new instance of the PlayerToolBar class
        PlayerToolBar playerToolBar = new PlayerToolBar();
        // Create a new instance of the StatusBar class
        StatusBar statusBar = new StatusBar();
        // Create a new instance of the JDesktopPane class
        JDesktopPane desktopPane = new JDesktopPane();
        // Create a new instance of the JFrame class
        JFrame frame = new JFrame();
        // Create a new instance of the JInternalFrame class
        JInternalFrame internalFrame = new JInternalFrame();
        // Create a new instance of the JMenu class
        JMenu menu = new JMenu();
        // Create a new instance of the JMenuBar class
        JMenuBar menuBar = new JMenuBar();
        // Create a new instance of the JPanel class
        JPanel panel = new JPanel();
        // Create a new instance of the JScrollPane class
        JScrollPane scrollPane = new JScrollPane();
        // Create a new instance of the JTable class
        JTable table = new JTable();
        // Create a new instance of the JToolBar class
        JToolBar toolBar = new JToolBar();
        // Create a new instance of the ListSelectionModel class
        ListSelectionModel listSelectionModel = new ListSelectionModel();
        // Create a new instance of the ImageIcon class
        ImageIcon imageIcon = new ImageIcon();
        // Create a new instance of the URL class
        URL url = new URL("http://www.google.de");
        // Create a new instance of the Dimension class
        Dimension dimension = new Dimension(100, 100);
        // Create a new instance of the Color class
        Color color = new Color(100, 100, 100);
        // Create a new instance of the ByteArrayOutputStream class
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        // Create a new instance of the ObjectOutputStream class
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(byteArrayOutputStream);
        // Create a new instance of the ByteArrayInputStream class
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(byteArrayOutputStream.toByteArray());
        // Create a new instance of the ObjectInputStream class
        ObjectInputStream objectInputStream = new ObjectInputStream(byteArrayInputStream);
        // Create a new instance of the Object class
        Object object = new Object();
        // Create a new instance of the String class
        String string = "Test";
        // Create a new instance of the Component class
        Component component = new Component() {
        };
        // Create a new instance of the BorderLayout class
        BorderLayout borderLayout = new BorderLayout();
        // Create a new instance of the Dimension class
        Dimension dimension2 = new Dimension(100, 100);
        // Create a new instance of the Color class
        Color color2 = new Color(100, 100, 100);
        // Create a new instance of the Dimension class
        Dimension dimension3 = new Dimension(100, 100);
        // Create a new instance of the Color class
        Color color3 = new Color(100, 100, 100);
        // Create a new instance of the Dimension class
        Dimension dimension4 = new Dimension(100, 100);
        // Create a new instance of the Color class
        Color color4 = new Color(100, 100, 100);
        // Create a new instance of the Dimension class
        Dimension dimension5 = new Dimension(100, 100);
        // Create a new instance of the Color class
        Color color5 = new Color(100, 100, 100);
        // Create a new instance of the Dimension class
        Dimension dimension6 = new Dimension(100, 100);
        // Create a new instance of the Color class
        Color color6 = new Color(100, 100, 100);
        // Create a new instance of the Dimension class
        Dimension dimension7 = new Dimension(100, 100);
        // Create a new instance of the Color class
        Color color7 = new Color(100, 100, 100);
        // Create a new instance of the Dimension class
        Dimension dimension8 = new Dimension(100, 100);
        // Create a new instance of the Color class
        Color color8 = new Color(100, 100, 100);
        // Create a new instance of the Dimension class
        Dimension dimension9 = new Dimension(100, 100);
        // Create a new instance of the Color class
        Color color9 = new Color(100, 100, 100);
        // Create a new instance of the Dimension class
        Dimension dimension10 = new Dimension(100, 100);
        // Create a new instance of the Color class
        Color color10 = new Color(100, 100, 100);
        // Create a new instance of the Dimension class
        Dimension dimension11 = new Dimension(100, 100);
        // Create a new instance of the Color class
        Color color11 = new Color(100, 100, 100);
        // Create a new instance of the Dimension class
        Dimension dimension12 = new Dimension(100, 100);
        // Create a new instance of the Color class
        Color color12 = new Color(100, 100, 100);
        // Create a new instance of the Dimension class
        Dimension dimension13 = new Dimension(100, 100);
        // Create a new instance of the Color