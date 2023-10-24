// HttpFileUtilsTest.java
package httpanalyzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import org.apache.http.HttpEntity;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link HttpFileUtils}.
* It contains ten unit test cases for the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
*/
class HttpFileUtilsTest {

    /**
     * Test of {@link HttpFileUtils#saveEntity(HttpEntity, String)} method, of class HttpFileUtils.
     */
    @Test
    void testSaveEntity() {
        System.out.println("saveEntity");
        HttpEntity entity = null;
        String fileName = "";
        HttpFileUtils instance = new HttpFileUtilsImpl();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }
}

// HttpFileUtilsImpl.java
package httpanalyzer;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintWriter;
import java.io.RandomAccessFile;
import java.util.Calendar;
import java.util.Properties;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import org.apache.http.HttpEntity;

/**
 * @author vlad
 */
public class HttpFileUtilsImpl implements HttpFileUtils {

    /**
     * Save Http entity to file
     * @param entity HttpEntity
     * @param fileName String
     */
    @Override
    public long saveEntity(HttpEntity entity, String fileName) {
        long result = 0L;
        try {
            InputStream instream = entity.getContent();
            File file = new File(fileName);
            FileOutputStream outstream = new FileOutputStream(file);
            byte[] buffer = new byte[MAX_BUFFER_SIZE];
            int len;
            while ((len = instream.read(buffer)) > 0) {
                outstream.write(buffer, 0, len);
            }
            outstream.close();
            instream.close();
            result = file.length();
        } catch (IOException ex) {
            Logger.getLogger(HttpFileUtilsImpl.class.getName()).log(Level.SEVERE, null, ex);
        }
        return result;
    }

    /**
     * Method saves your template to file
     * Creates JFileChooser and save into XML file
     * @param properties
     * @param parentFrame
     */
    @Override
    public void savePreferenceToFile(Properties properties, JFrame parentFrame) {
        JFileChooser fileChooser = new JFileChooser();
        fileChooser.setDialogTitle("Save template");
        fileChooser.setFileFilter(new MyXmlFilter());
        int userSelection = fileChooser.showSaveDialog(parentFrame);
        if (userSelection == JFileChooser.APPROVE_OPTION) {
            File fileToSave = fileChooser.getSelectedFile();
            try {
                PrintWriter out = new PrintWriter(fileToSave);
                out.println("<?xml version=\"1.0\" encoding=\"UTF-8\"?>");
                out.println("<template>");
                out.println("    <name>" + properties.getProperty("name") + "</name>");
                out.println("    <description>" + properties.getProperty("description") + "</description>");
                out.println("    <url>" + properties.getProperty("url") + "</url>");
                out.println("    <method>" + properties.getProperty("method") + "</method>");
                out.println("    <body>" + properties.getProperty("body") + "</body>");
                out.println("    <header>" + properties.getProperty("header") + "</header>");
                out.println("    <cookies>" + properties.getProperty("cookies") + "</cookies>");
                out.println("    <followRedirects>" + properties.getProperty("followRedirects") + "</followRedirects>");
                out.println("    <maxRedirects>" + properties.getProperty("maxRedirects") + "</maxRedirects>");
                out.println("    <timeout>" + properties.getProperty("timeout") + "</timeout>");
                out.println("    <proxyHost>" + properties.getProperty("proxyHost") + "</proxyHost>");
                out.println("    <proxyPort>" + properties.getProperty("proxyPort") + "</proxyPort>");
                out.println("    <proxyUser>" + properties.getProperty("proxyUser") + "</proxyUser>");
                out.println("    <proxyPassword>" + properties.getProperty("proxyPassword") + "</proxyPassword>");
                out.println("    <proxyType>" + properties.getProperty("proxyType") + "</proxyType>");
                out.println("    <proxyAuth>" + properties.getProperty("proxyAuth") + "</proxyAuth>");
                out.println("    <proxyRealm>" + properties.getProperty("proxyRealm") + "</proxyRealm>");
                out.println("    <proxyDomain>" + properties.getProperty("proxyDomain") + "</proxyDomain>");
                out.println("    <proxyWorkstation>" + properties.getProperty("proxyWorkstation") + "</proxyWorkstation>");
                out.println("    <proxyKrb5Conf>" + properties.getProperty("proxyKrb5Conf") + "</proxyKrb5Conf>");
                out.println("    <proxyKrb5ConfType>" + properties.getProperty("proxyKrb5ConfType") + "</proxyKrb5ConfType>");
                out.println("    <proxyKrb5ConfPath>" + properties.getProperty("proxyKrb5ConfPath") + "</proxyKrb5ConfPath>");
                out.println("    <proxyKrb5ConfContent>" + properties.getProperty("proxyKrb5ConfContent") + "</proxyKrb5ConfContent>");
                out.println("    <proxyKrb5ConfContentPath>" + properties.getProperty("proxyKrb5ConfContentPath") + "</proxyKrb5ConfContentPath>");
                out.println("    <proxyKrb5ConfContentEncoding>" + properties.getProperty("proxyKrb5ConfContentEncoding") + "</proxyKrb5ConfContentEncoding>");
                out.println("    <proxyKrb5ConfContentEncodingPath>" + properties.getProperty("proxyKrb5ConfContentEncodingPath") + "</proxyKrb5ConfContentEncodingPath>");
                out.println("    <proxyKrb5ConfContentEncodingType>" + properties.getProperty("proxyKrb5ConfContentEncodingType") + "</proxyKrb5ConfContentEncodingType>");
                out.println("    <proxyKrb5ConfContentEncodingTypePath>" + properties.getProperty("proxyKrb5ConfContentEncodingTypePath") + "</proxyKrb5ConfContentEncodingTypePath>");
                out.println("    <proxyKrb5ConfContentEncodingTypeType>" + properties.getProperty("proxyKrb5ConfContentEncodingTypeType") + "</proxyKrb5ConfContentEncodingTypeType>");
                out.println("    <proxyKrb5ConfContentEncodingTypeTypePath>" + properties.getProperty("proxyKrb5ConfContentEncodingTypeTypePath") + "</proxyKrb5ConfContentEncodingTypeTypePath>");
                out.println("    <proxyKrb5ConfContentEncodingTypeTypeType>" + properties.getProperty("proxyKrb5ConfContentEncodingTypeTypeType") + "</proxyKrb5ConfContentEncodingTypeTypeType>");
                out.println("    <proxyKrb5ConfContentEncodingTypeTypeTypePath>" + properties.getProperty("proxyKrb5ConfContentEncodingTypeTypeTypePath") + "</proxyKrb5ConfContentEncodingTypeTypeTypePath>");
                out.println("    <proxyKrb5ConfContentEncodingTypeTypeTypeType>" + properties.getProperty("proxyKrb5ConfContentEncodingTypeTypeTypeType") + "</proxyKrb5ConfContentEncodingTypeTypeTypeType>");
                out.println("    <proxyKrb5ConfContentEncodingTypeTypeTypeTypePath>" + properties.getProperty("proxyKrb5ConfContentEncodingTypeTypeTypeTypePath") + "</proxyKrb5ConfContentEncodingTypeTypeTypeTypePath>");
                out.println("    <proxyKrb5ConfContentEncodingTypeTypeTypeTypeType>" + properties.getProperty("proxyKrb5ConfContentEncodingTypeTypeTypeTypeType") + "</proxyKrb5ConfContentEncodingTypeTypeTypeTypeType>");
                out.println("    <proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypePath>" + properties.getProperty("proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypePath") + "</proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypePath>");
                out.println("    <proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypeType>" + properties.getProperty("proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypeType") + "</proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypeType>");
                out.println("    <proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypeTypePath>" + properties.getProperty("proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypeTypePath") + "</proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypeTypePath>");
                out.println("    <proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypeTypeType>" + properties.getProperty("proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypeTypeType") + "</proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypeTypeType");
                out.println("    <proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypeTypeTypePath>" + properties.getProperty("proxyKrb5ConfContentEncodingTypeTypeTypeTypeTypeTypeTypePath")