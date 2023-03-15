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
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link HttpAnalyzerApp}.
	*/
	@Test
	public void testGetApplication() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof HttpAnalyzerApp);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication2() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link SingleFrameApplication}.
	*/
	@Test
	public void testGetApplication3() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof SingleFrameApplication);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication4() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication5() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication6() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication7() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication8() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication9() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
	
	/**
	* Test case for {@link HttpAnalyzerApp#getApplication()} method.
	* It checks if the method returns an instance of {@link Application}.
	*/
	@Test
	public void testGetApplication10() {
		assertTrue(HttpAnalyzerApp.getApplication() instanceof Application);
	}
}

// HttpAnalyzerView.java
/*
 * GNU GENERAL PUBLIC LICENSE
 * Version 3, 29 June 2007
 *
 * Copyright (C) 2010, vlad
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 *
 *
 * HttpAnalyzerView.java
 */
package httpanalyzer;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.BorderFactory;
import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComponent;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JToolBar;
import javax.swing.KeyStroke;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;
import javax.swing.UIManager;
import javax.swing.UnsupportedLookAndFeelException;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumn;
import javax.swing.table.TableColumnModel;
import javax.swing.text.BadLocationException;
import javax.swing.text.DefaultHighlighter;
import javax.swing.text.Highlighter;
import javax.swing.text.Highlighter.HighlightPainter;
import org.jdesktop.application.Action;
import org.jdesktop.application.ResourceMap;
import org.jdesktop.application.SingleFrameApplication;
import org.jdesktop.application.FrameView;
import org.jdesktop.application.TaskMonitor;

/**
 * The application's main frame.
 */
public class HttpAnalyzerView extends FrameView {

    private static final String[] COLUMN_NAMES = {"Name", "Value"};
    private static final String[] COLUMN_NAMES2 = {"Name", "Value", "Type"};
    private static final String[] COLUMN_NAMES3 = {"Name", "Value", "Type", "Description"};
    private static final String[] COLUMN_NAMES4 = {"Name", "Value", "Type", "Description", "Required"};
    private static final String[] COLUMN_NAMES5 = {"Name", "Value", "Type", "Description", "Required", "Default"};
    private static final String[] COLUMN_NAMES6 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example"};
    private static final String[] COLUMN_NAMES7 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max"};
    private static final String[] COLUMN_NAMES8 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern"};
    private static final String[] COLUMN_NAMES9 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum"};
    private static final String[] COLUMN_NAMES10 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems"};
    private static final String[] COLUMN_NAMES11 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength"};
    private static final String[] COLUMN_NAMES12 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems"};
    private static final String[] COLUMN_NAMES13 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow"};
    private static final String[] COLUMN_NAMES14 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends"};
    private static final String[] COLUMN_NAMES15 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends", "Format"};
    private static final String[] COLUMN_NAMES16 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends", "Format", "DivisibleBy"};
    private static final String[] COLUMN_NAMES17 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends", "Format", "DivisibleBy", "ReadOnly"};
    private static final String[] COLUMN_NAMES18 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends", "Format", "DivisibleBy", "ReadOnly", "Id"};
    private static final String[] COLUMN_NAMES19 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends", "Format", "DivisibleBy", "ReadOnly", "Id", "Title"};
    private static final String[] COLUMN_NAMES20 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends", "Format", "DivisibleBy", "ReadOnly", "Id", "Title", "Description"};
    private static final String[] COLUMN_NAMES21 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends", "Format", "DivisibleBy", "ReadOnly", "Id", "Title", "Description", "Transient"};
    private static final String[] COLUMN_NAMES22 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends", "Format", "DivisibleBy", "ReadOnly", "Id", "Title", "Description", "Transient", "Hidden"};
    private static final String[] COLUMN_NAMES23 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends", "Format", "DivisibleBy", "ReadOnly", "Id", "Title", "Description", "Transient", "Hidden", "AdditionalProperties"};
    private static final String[] COLUMN_NAMES24 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends", "Format", "DivisibleBy", "ReadOnly", "Id", "Title", "Description", "Transient", "Hidden", "AdditionalProperties", "AdditionalItems"};
    private static final String[] COLUMN_NAMES25 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends", "Format", "DivisibleBy", "ReadOnly", "Id", "Title", "Description", "Transient", "Hidden", "AdditionalProperties", "AdditionalItems", "PatternProperties"};
    private static final String[] COLUMN_NAMES26 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends", "Format", "DivisibleBy", "ReadOnly", "Id", "Title", "Description", "Transient", "Hidden", "AdditionalProperties", "AdditionalItems", "PatternProperties", "Dependencies"};
    private static final String[] COLUMN_NAMES27 = {"Name", "Value", "Type", "Description", "Required", "Default", "Example", "Min", "Max", "Pattern", "Enum", "MinItems", "MaxItems", "MinLength", "MaxLength", "UniqueItems", "Disallow", "Extends", "Format", "Divisible