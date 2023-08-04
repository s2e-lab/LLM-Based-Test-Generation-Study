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
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link HttpFileUtils#saveEntity(HttpEntity, String)} method, of class HttpFileUtils.
     */
    @Test
    void testSaveEntity_1() {
        System.out.println("saveEntity");
        HttpEntity entity = null;
        String fileName = "";
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link HttpFileUtils#saveEntity(HttpEntity, String)} method, of class HttpFileUtils.
     */
    @Test
    void testSaveEntity_2() {
        System.out.println("saveEntity");
        HttpEntity entity = null;
        String fileName = "";
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link HttpFileUtils#saveEntity(HttpEntity, String)} method, of class HttpFileUtils.
     */
    @Test
    void testSaveEntity_3() {
        System.out.println("saveEntity");
        HttpEntity entity = null;
        String fileName = "";
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link HttpFileUtils#saveEntity(HttpEntity, String)} method, of class HttpFileUtils.
     */
    @Test
    void testSaveEntity_4() {
        System.out.println("saveEntity");
        HttpEntity entity = null;
        String fileName = "";
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link HttpFileUtils#saveEntity(HttpEntity, String)} method, of class HttpFileUtils.
     */
    @Test
    void testSaveEntity_5() {
        System.out.println("saveEntity");
        HttpEntity entity = null;
        String fileName = "";
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link HttpFileUtils#saveEntity(HttpEntity, String)} method, of class HttpFileUtils.
     */
    @Test
    void testSaveEntity_6() {
        System.out.println("saveEntity");
        HttpEntity entity = null;
        String fileName = "";
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link HttpFileUtils#saveEntity(HttpEntity, String)} method, of class HttpFileUtils.
     */
    @Test
    void testSaveEntity_7() {
        System.out.println("saveEntity");
        HttpEntity entity = null;
        String fileName = "";
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link HttpFileUtils#saveEntity(HttpEntity, String)} method, of class HttpFileUtils.
     */
    @Test
    void testSaveEntity_8() {
        System.out.println("saveEntity");
        HttpEntity entity = null;
        String fileName = "";
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link HttpFileUtils#saveEntity(HttpEntity, String)} method, of class HttpFileUtils.
     */
    @Test
    void testSaveEntity_9() {
        System.out.println("saveEntity");
        HttpEntity entity = null;
        String fileName = "";
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link HttpFileUtils#saveEntity(HttpEntity, String)} method, of class HttpFileUtils.
     */
    @Test
    void testSaveEntity_10() {
        System.out.println("saveEntity");
        HttpEntity entity = null;
        String fileName = "";
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }
}

// HttpFileUtils.java
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
public class HttpFileUtils {

    /**
     * Save Http entity to file
     *
     * @param entity HttpEntity
     * @param fileName String
     */
    public long saveEntity(HttpEntity entity, String fileName) {
        long fileSize = 0L;
        try {
            InputStream is = entity.getContent();
            File file = new File(fileName);
            if (file.exists()) {
                file.delete();
            }
            FileOutputStream fos = new FileOutputStream(file);
            byte[] buffer = new byte[1024];
            int len = 0;
            while ((len = is.read(buffer)) != -1) {
                fos.write(buffer, 0, len);
                fileSize += len;
            }
            fos.close();
            is.close();
        } catch (IOException ex) {
            Logger.getLogger(HttpFileUtils.class.getName()).log(Level.SEVERE, null, ex);
        }
        return fileSize;
    }
}

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
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link HttpFileUtils#saveEntity(HttpEntity, String)} method, of class HttpFileUtils.
     */
    @Test
    void testSaveEntity_1() {
        System.out.println("saveEntity");
        HttpEntity entity = null;
        String fileName = "";
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult, result);
    }

    /**
     * Test of {@link HttpFileUtils#saveEntity(HttpEntity, String)} method, of class HttpFileUtils.
     */
    @Test
    void testSaveEntity_2() {
        System.out.println("saveEntity");
        HttpEntity entity = null;
        String fileName = "";
        HttpFileUtils instance = new HttpFileUtils();
        long expResult = 0L;
        long result = instance.saveEntity(entity, fileName);
        assertEquals(expResult