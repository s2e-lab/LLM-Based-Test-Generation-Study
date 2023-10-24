// Menu_1Test.java


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
* It contains ten unit test cases for the {@link Menu#createXML()} method.
*/
class Menu_1Test {

    /**
    * Test case for {@link Menu#createXML()}
    * @throws IOException
    */
    @Test
    void testCreateXML() throws IOException {
        Menu menu = new Menu();
        menu.m_GUI = new GUI();
        menu.m_GUI.strOutputDir = "test/dvd-menu/test-files/Menu_1Test";
        menu.m_GUI.strBackground = "test/dvd-menu/test-files/Menu_1Test/background.jpg";
        menu.m_GUI.strAudio = "test/dvd-menu/test-files/Menu_1Test/audio.wav";
        menu.m_GUI.strTitle = "test/dvd-menu/test-files/Menu_1Test/title.txt";
        menu.m_GUI.strChapter = "test/dvd-menu/test-files/Menu_1Test/chapter.txt";
        menu.m_GUI.strChapterTitle = "test/dvd-menu/test-files/Menu_1Test/chapter_title.txt";
        menu.m_GUI.strChapterTitle2 = "test/dvd-menu/test-files/Menu_1Test/chapter_title2.txt";
        menu.m_GUI.strChapterTitle3 = "test/dvd-menu/test-files/Menu_1Test/chapter_title3.txt";
        menu.m_GUI.strChapterTitle4 = "test/dvd-menu/test-files/Menu_1Test/chapter_title4.txt";
        menu.m_GUI.strChapterTitle5 = "test/dvd-menu/test-files/Menu_1Test/chapter_title5.txt";
        menu.m_GUI.strChapterTitle6 = "test/dvd-menu/test-files/Menu_1Test/chapter_title6.txt";
        menu.m_GUI.strChapterTitle7 = "test/dvd-menu/test-files/Menu_1Test/chapter_title7.txt";
        menu.m_GUI.strChapterTitle8 = "test/dvd-menu/test-files/Menu_1Test/chapter_title8.txt";
        menu.m_GUI.strChapterTitle9 = "test/dvd-menu/test-files/Menu_1Test/chapter_title9.txt";
        menu.m_GUI.strChapterTitle10 = "test/dvd-menu/test-files/Menu_1Test/chapter_title10.txt";
        menu.m_GUI.strChapterTitle11 = "test/dvd-menu/test-files/Menu_1Test/chapter_title11.txt";
        menu.m_GUI.strChapterTitle12 = "test/dvd-menu/test-files/Menu_1Test/chapter_title12.txt";
        menu.m_GUI.strChapterTitle13 = "test/dvd-menu/test-files/Menu_1Test/chapter_title13.txt";
        menu.m_GUI.strChapterTitle14 = "test/dvd-menu/test-files/Menu_1Test/chapter_title14.txt";
        menu.m_GUI.strChapterTitle15 = "test/dvd-menu/test-files/Menu_1Test/chapter_title15.txt";
        menu.m_GUI.strChapterTitle16 = "test/dvd-menu/test-files/Menu_1Test/chapter_title16.txt";
        menu.m_GUI.strChapterTitle17 = "test/dvd-menu/test-files/Menu_1Test/chapter_title17.txt";
        menu.m_GUI.strChapterTitle18 = "test/dvd-menu/test-files/Menu_1Test/chapter_title18.txt";
        menu.m_GUI.strChapterTitle19 = "test/dvd-menu/test-files/Menu_1Test/chapter_title19.txt";
        menu.m_GUI.strChapterTitle20 = "test/dvd-menu/test-files/Menu_1Test/chapter_title20.txt";
        menu.m_GUI.strChapterTitle21 = "test/dvd-menu/test-files/Menu_1Test/chapter_title21.txt";
        menu.m_GUI.strChapterTitle22 = "test/dvd-menu/test-files/Menu_1Test/chapter_title22.txt";
        menu.m_GUI.strChapterTitle23 = "test/dvd-menu/test-files/Menu_1Test/chapter_title23.txt";
        menu.m_GUI.strChapterTitle24 = "test/dvd-menu/test-files/Menu_1Test/chapter_title24.txt";
        menu.m_GUI.strChapterTitle25 = "test/dvd-menu/test-files/Menu_1Test/chapter_title25.txt";
        menu.m_GUI.strChapterTitle26 = "test/dvd-menu/test-files/Menu_1Test/chapter_title26.txt";
        menu.m_GUI.strChapterTitle27 = "test/dvd-menu/test-files/Menu_1Test/chapter_title27.txt";
        menu.m_GUI.strChapterTitle28 = "test/dvd-menu/test-files/Menu_1Test/chapter_title28.txt";
        menu.m_GUI.strChapterTitle29 = "test/dvd-menu/test-files/Menu_1Test/chapter_title29.txt";
        menu.m_GUI.strChapterTitle30 = "test/dvd-menu/test-files/Menu_1Test/chapter_title30.txt";
        menu.m_GUI.strChapterTitle31 = "test/dvd-menu/test-files/Menu_1Test/chapter_title31.txt";
        menu.m_GUI.strChapterTitle32 = "test/dvd-menu/test-files/Menu_1Test/chapter_title32.txt";
        menu.m_GUI.strChapterTitle33 = "test/dvd-menu/test-files/Menu_1Test/chapter_title33.txt";
        menu.m_GUI.strChapterTitle34 = "test/dvd-menu/test-files/Menu_1Test/chapter_title34.txt";
        menu.m_GUI.strChapterTitle35 = "test/dvd-menu/test-files/Menu_1Test/chapter_title35.txt";
        menu.m_GUI.strChapterTitle36 = "test/dvd-menu/test-files/Menu_1Test/chapter_title36.txt";
        menu.m_GUI.strChapterTitle37 = "test/dvd-menu/test-files/Menu_1Test/chapter_title37.txt";
        menu.m_GUI.strChapterTitle38 = "test/dvd-menu/test-files/Menu_1Test/chapter_title38.txt";
        menu.m_GUI.strChapterTitle39 = "test/dvd-menu/test-files/Menu_1Test/chapter_title39.txt";
        menu.m_GUI.strChapterTitle40 = "test/dvd-menu/test-files/Menu_1Test/chapter_title40.txt";
        menu.m_GUI.strChapterTitle41 = "test/dvd-menu/test-files/Menu_1Test/chapter_title41.txt";
        menu.m_GUI.strChapterTitle42 = "test/dvd-menu/test-files/Menu_1Test/chapter_title42.txt";
        menu.m_GUI.strChapterTitle43 = "test/dvd-menu/test-files/Menu_1Test/chapter_title43.txt";
        menu.m_GUI.strChapterTitle44 = "test/dvd-menu/test-files/Menu_1Test/chapter_title44.txt";
        menu.m_GUI.strChapterTitle45 = "test/dvd-menu/test-files/Menu_1Test/chapter_title45.txt";
        menu.m_GUI.strChapterTitle46 = "test/dvd-menu/test-files/Menu_1Test/chapter_title46.txt";
        menu.m_GUI.strChapterTitle47 = "test/dvd-menu/test-files/Menu_1Test/chapter_title47.txt";
        menu.m_GUI.strChapterTitle48 = "test/dvd-menu/test-files/Menu_1Test/chapter_title48.txt";
        menu.m_GUI.strChapterTitle49 = "test/dvd-menu/test-files/Menu_1Test/chapter_title49.txt";
        menu.m_GUI.strChapterTitle