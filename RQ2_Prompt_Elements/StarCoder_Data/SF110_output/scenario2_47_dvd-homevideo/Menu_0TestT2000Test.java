// Menu_0Test.java


import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.File;
import java.io.FileWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.FilenameFilter;
import java.util.StringTokenizer;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Menu}.
* It contains ten unit test cases for the {@link Menu#init()} method.
*/
class Menu_0Test {

    /**
     * Test case for {@link Menu#init()}.
     * It tests the case where the user specifies a background picture and audio
     * to use for the menu, or a default background can also be used.
     * It also tests the case where the user specifies unique titles for each
     * chapter of the DVD.  If nothing is specified then the title
     * of the DVD will be used followed by an underscore and increasing
     * integer for each video clip.
     */
    @Test
    void testInit() {
        Menu menu = new Menu();
        menu.m_GUI = new GUI();
        menu.m_GUI.strOutputDir = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test";
        menu.m_GUI.strDVDTitle = "test