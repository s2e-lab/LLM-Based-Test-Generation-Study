// HttpFileUtilsTest0.java
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
class HttpFileUtilsTest0 {

		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* <p>
		* Test case for the following conditions:
		* <ul>
		* <li>entity is null</li>
		* <li>fileName is null</li>
		* </ul>
		* <p>
		* Expected result:
		* <ul>
		* <li>IllegalArgumentException</li>
		* </ul>
		*/
		@Test
		void testSaveEntity_1() {
				HttpEntity entity = null;
				String fileName = null;
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IllegalArgumentException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* <p>
		* Test case for the following conditions:
		* <ul>
		* <li>entity is null</li>
		* <li>fileName is not null</li>
		* </ul>
		* <p>
		* Expected result:
		* <ul>
		* <li>IllegalArgumentException</li>
		* </ul>
		*/
		@Test
		void testSaveEntity_2() {
				HttpEntity entity = null;
				String fileName = "";
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IllegalArgumentException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* <p>
		* Test case for the following conditions:
		* <ul>
		* <li>entity is not null</li>
		* <li>fileName is null</li>
		* </ul>
		* <p>
		* Expected result:
		* <ul>
		* <li>IllegalArgumentException</li>
		* </ul>
		*/
		@Test
		void testSaveEntity_3() {
				HttpEntity entity = new HttpEntity() {
						@Override
						public boolean isRepeatable() {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
						public boolean isChunked() {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
						public long getContentLength() {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
						public org.apache.http.Header getContentType() {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
						public org.apache.http.Header getContentEncoding() {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
						public InputStream getContent() throws IOException, IllegalStateException {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
						public void writeTo(OutputStream outstream) throws IOException {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
						public boolean isStreaming() {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
						public void consumeContent() throws IOException {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}
				};
				String fileName = null;
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				assertThrows(IllegalArgumentException.class, () -> {
						httpFileUtils.saveEntity(entity, fileName);
				});
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* <p>
		* Test case for the following conditions:
		* <ul>
		* <li>entity is not null</li>
		* <li>fileName is not null</li>
		* <li>entity.getContent() throws IOException</li>
		* </ul>
		* <p>
		* Expected result:
		* <ul>
		* <li>IOException</li>
		* </ul>
		*/
		@Test
		void testSaveEntity_4() {
				HttpEntity entity = new HttpEntity() {
						@Override
						public boolean isRepeatable() {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
						public boolean isChunked() {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
						public long getContentLength() {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
						public org.apache.http.Header getContentType() {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
						public org.apache.http.Header getContentEncoding() {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
						public InputStream getContent() throws IOException, IllegalStateException {
								throw new IOException();
						}

						@Override
						public void writeTo(OutputStream outstream) throws IOException {
								throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
						}

						@Override
	