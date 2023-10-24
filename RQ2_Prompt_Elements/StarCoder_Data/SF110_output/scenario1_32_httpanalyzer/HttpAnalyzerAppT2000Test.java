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

    @Test
    void testGetApplication() {
        HttpAnalyzerApp app = HttpAnalyzerApp.getApplication();
        assertNotNull(app);
    }
}

// HttpAnalyzerAppView.java
package httpanalyzer;

import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.Icon;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.io.StringReader;
import java.io.StringWriter;
import java.io.Writer;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.KeyStroke;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.DefaultEditorKit;
import javax.swing.text.Document;
import javax.swing.text.html.HTMLEditorKit;
import javax.swing.text.html.StyleSheet;
import org.apache.commons.io.FileUtils;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.util.EntityUtils;
import org.jdesktop.application.Application;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;
import org.jdesktop.application.Task;
import org.jdesktop.application.TaskMonitor.ProgressListener;
import org.jdesktop.application.TaskMonitor.ProgressEvent;
import org.jdesktop.application.TaskMonitor.State;
import org.jdesktop.application.TaskMonitor.TaskMonitorListener;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.Type;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.StateValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ProgressValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.MessageValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionType;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionMessage;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTrace;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.TypeValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.MessageValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.SourceValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.LineNumberValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ClassNameValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.MethodNameValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.FileNameValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadNameValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupNameValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadIdValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadPriorityValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadStateValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadStackTraceValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentNameValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentIdValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentPriorityValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentStateValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentStackTraceValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentNameValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentIdValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentPriorityValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentStateValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentStackTraceValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentNameValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentIdValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentPriorityValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentStateValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentStackTraceValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentNameValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentIdValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentPriorityValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentStateValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentStackTraceValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent.ExceptionTraceElement.ThreadGroupParentNameValue;
import org.jdesktop.application.TaskMonitor.TaskMonitorEvent