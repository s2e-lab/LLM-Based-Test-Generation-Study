// Drink_1Test.java
package bierse.model;

import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileWriter;
import org.jdom.Document;
import org.jdom.Element;
import org.jdom.input.SAXBuilder;
import org.jdom.output.XMLOutputter;
import bierse.view.MyKeyMap;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Drink}.
* It contains ten unit test cases for the {@link Drink#save()} method.
*/
class Drink_1Test {

    private static final String DRINKS_FOLDER = "drinks/";
    private static final String NEW_DRINK_NAME = "newDrink";
    private static final String NEW_DRINK_FILE = DRINKS_FOLDER + NEW_DRINK_NAME + ".xml";
    private static final String NEW_DRINK_FILE_CONTENT = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
            + "<drink>\n"
            + "    <minPrice>0.0</minPrice>\n"
            + "    <maxPrice>0.0</maxPrice>\n"
            + "    <startPrice>0.0</startPrice>\n"
            + "    <targetAmount>0.0</targetAmount>\n"
            + "    <deltaAmount>0.0</deltaAmount>\n"
            + "    <maxStep>0</maxStep>\n"
            + "    <used>false</used>\n"
            + "    <key>0</key>\n"
            + "</drink>\n";
    private static final String NEW_DRINK_FILE_CONTENT_2 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
            + "<drink>\n"
            + "    <minPrice>0.0</minPrice>\n"
            + "    <maxPrice>0.0</maxPrice>\n"
            + "    <startPrice>0.0</startPrice>\n"
            + "    <targetAmount>0.0</targetAmount>\n"
            + "    <deltaAmount>0.0</deltaAmount>\n"
            + "    <maxStep>0</maxStep>\n"
            + "    <used>false</used>\n"
            + "    <key>0</key>\n"
            + "</drink>\n";
    private static final String NEW_DRINK_FILE_CONTENT_3 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
            + "<drink>\n"
            + "    <minPrice>0.0</minPrice>\n"
            + "    <maxPrice>0.0</maxPrice>\n"
            + "    <startPrice>0.0</startPrice>\n"
            + "    <targetAmount>0.0</targetAmount>\n"
            + "    <deltaAmount>0.0</deltaAmount>\n"
            + "    <maxStep>0</maxStep>\n"
            + "    <used>false</used>\n"
            + "    <key>0</key>\n"
            + "</drink>\n";
    private static final String NEW_DRINK_FILE_CONTENT_4 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
            + "<drink>\n"
            + "    <minPrice>0.0</minPrice>\n"
            + "    <maxPrice>0.0</maxPrice>\n"
            + "    <startPrice>0.0</startPrice>\n"
            + "    <targetAmount>0.0</targetAmount>\n"
            + "    <deltaAmount>0.0</deltaAmount>\n"
            + "    <maxStep>0</maxStep>\n"
            + "    <used>false</used>\n"
            + "    <key>0</key>\n"
            + "</drink>\n";
    private static final String NEW_DRINK_FILE_CONTENT_5 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
            + "<drink>\n"
            + "    <minPrice>0.0</minPrice>\n"
            + "    <maxPrice>0.0</maxPrice>\n"
            + "    <startPrice>0.0</startPrice>\n"
            + "    <targetAmount>0.0</targetAmount>\n"
            + "    <deltaAmount>0.0</deltaAmount>\n"
            + "    <maxStep>0</maxStep>\n"
            + "    <used>false</used>\n"
            + "    <key>0</key>\n"
            + "</drink>\n";
    private static final String NEW_DRINK_FILE_CONTENT_6 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
            + "<drink>\n"
            + "    <minPrice>0.0</minPrice>\n"
            + "    <maxPrice>0.0</maxPrice>\n"
            + "    <startPrice>0.0</startPrice>\n"
            + "    <targetAmount>0.0</targetAmount>\n"
            + "    <deltaAmount>0.0</deltaAmount>\n"
            + "    <maxStep>0</maxStep>\n"
            + "    <used>false</used>\n"
            + "    <key>0</key>\n"
            + "</drink>\n";
    private static final String NEW_DRINK_FILE_CONTENT_7 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
            + "<drink>\n"
            + "    <minPrice>0.0</minPrice>\n"
            + "    <maxPrice>0.0</maxPrice>\n"
            + "    <startPrice>0.0</startPrice>\n"
            + "    <targetAmount>0.0</targetAmount>\n"
            + "    <deltaAmount>0.0</deltaAmount>\n"
            + "    <maxStep>0</maxStep>\n"
            + "    <used>false</used>\n"
            + "    <key>0</key>\n"
            + "</drink>\n";
    private static final String NEW_DRINK_FILE_CONTENT_8 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
            + "<drink>\n"
            + "    <minPrice>0.0</minPrice>\n"
            + "    <maxPrice>0.0</maxPrice>\n"
            + "    <startPrice>0.0</startPrice>\n"
            + "    <targetAmount>0.0</targetAmount>\n"
            + "    <deltaAmount>0.0</deltaAmount>\n"
            + "    <maxStep>0</maxStep>\n"
            + "    <used>false</used>\n"
            + "    <key>0</key>\n"
            + "</drink>\n";
    private static final String NEW_DRINK_FILE_CONTENT_9 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
            + "<drink>\n"
            + "    <minPrice>0.0</minPrice>\n"
            + "    <maxPrice>0.0</maxPrice>\n"
            + "    <startPrice>0.0</startPrice>\n"
            + "    <targetAmount>0.0</targetAmount>\n"
            + "    <deltaAmount>0.0</deltaAmount>\n"
            + "    <maxStep>0</maxStep>\n"
            + "    <used>false</used>\n"
            + "    <key>0</key>\n"
            + "</drink>\n";
    private static final String NEW_DRINK_FILE_CONTENT_10 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
            + "<drink>\n"
            + "    <minPrice>0.0</minPrice>\n"
            + "    <maxPrice>0.0</maxPrice>\n"
            + "    <startPrice>0.0</startPrice>\n"
            + "    <targetAmount>0.0</targetAmount>\n"
            + "    <deltaAmount>0.0</deltaAmount>\n"
            + "    <maxStep>0</maxStep>\n"
            + "    <used>false</used>\n"
            + "    <key>0</key>\n"
            + "</drink>\n";
    private static final String NEW_DRINK_FILE_CONTENT_11 = "<?xml version=\"1.0\" encoding=\"UTF-8\" standalone=\"yes\"?>\n"
            + "<drink>\n"
            + "    <minPrice>0.0</minPrice>\n"
            + "    <maxPrice>0.0</maxPrice>\n"
            + "    <startPrice>0.0</startPrice>\n"
            + "    <targetAmount>0.0</targetAmount>\n"
            + "    <deltaAmount>0.0</deltaAmount>\n"
            + "    <maxStep>0