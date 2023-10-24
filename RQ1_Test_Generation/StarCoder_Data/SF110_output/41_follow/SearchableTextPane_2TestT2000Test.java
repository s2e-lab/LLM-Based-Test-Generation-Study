// SearchableTextPane_2Test.java
package ghm.follow.search;

import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JTextArea;
import javax.swing.plaf.ComponentUI;
import javax.swing.text.BadLocationException;
import javax.swing.text.Document;
import javax.swing.text.Element;
import javax.swing.text.Utilities;
import javax.swing.text.DefaultHighlighter.DefaultHighlightPainter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SearchableTextPane}.
* It contains ten unit test cases for the {@link SearchableTextPane#search(String, int)} method.
*/
class SearchableTextPane_2Test {

    private static final Logger log = Logger.getLogger(SearchableTextPane_2Test.class.getName());

    private static final String TEXT = "This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This is a test text. This