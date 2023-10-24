// HttpAnalyzerAppTest.java
package httpanalyzer;

import org.jdesktop.application.Application;
import org.jdesktop.application.SingleFrameApplication;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpAnalyzerApp}.
* It contains ten unit test cases for the {@link HttpAnalyzerApp#getApplication()} method.
*/
class HttpAnalyzerAppTest {

    /**
     * Test case for {@link HttpAnalyzerApp#getApplication()}.
     */
    @Test
    void testGetApplication() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertNotNull(app);
    }
}

// HttpAnalyzerAppView.java
package httpanalyzer;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.filechooser.FileNameExtensionFilter;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import org.jdesktop.application.Task;
import org.jdesktop.application.Task.BlockingScope;
import org.jdesktop.application.Task.BlockingScope.State;
import org.jdesktop.application.TaskMonitor.Monitor;
import org.jdesktop.application.TaskMonitor.ProgressMonitor;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;
import org.jdesktop.application.TaskMonitor.ProgressMonitor.State as ProgressState;