// HttpFileUtils_1Test.java
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
* It contains ten unit test cases for the {@link HttpFileUtils#loadPreferenceFromFile(JFrame)} method.
*/
class HttpFileUtils_1Test {

		/**
		* Test case for {@link HttpFileUtils#loadPreferenceFromFile(JFrame)} method.
		* Test case for the {@link HttpFileUtils#loadPreferenceFromFile(JFrame)} method.
		* @throws IOException
		*/
		@Test
		void testLoadPreferenceFromFile() throws IOException {
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				Properties properties = new Properties();
				//Create a file chooser
				final JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Load template");
				fileChooser.setDialogType(javax.swing.JFileChooser.OPEN_DIALOG);
				fileChooser.addChoosableFileFilter(new MyTxtFilter());
				fileChooser.addChoosableFileFilter(new MyXmlFilter());
				int returnVal = fileChooser.showOpenDialog(parentFrame);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
						try {
								String fileSetUser = fileChooser.getSelectedFile().toString();
								File file;
								if (fileSetUser.contains(".")) {
										file = new File(fileSetUser);
								} else {
										file = new File(fileSetUser + ".xml");
								}
								FileInputStream fis = new FileInputStream(file);
								properties.loadFromXML(fis);
								fis.close();
						} catch (IOException ex) {
								Logger.getLogger(HttpFileUtils.class.getName()).log(Level.SEVERE, null, ex);
								new SwingTools(parentFrame).showErrorDialog("IO error", ex.getLocalizedMessage());
						}
				} else {
						System.out.println("File wasn't choosen!");
				}
				return properties;
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveSessionInfo(HttpAnalyzerView, JFrame)} method.
		* Test case for the {@link HttpFileUtils#saveSessionInfo(HttpAnalyzerView, JFrame)} method.
		* @throws IOException
		*/
		@Test
		void testSaveSessionInfo() throws IOException {
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				//Create a file chooser
				final JFileChooser fileChooser = new JFileChooser();
				// NOI18N
				fileChooser.setDialogTitle("Save your session");
				fileChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
				Calendar calendar = Calendar.getInstance();
				System.out.print("Date: ");
				System.out.print(calendar.get(Calendar.MONTH));
				System.out.print(" " + calendar.get(Calendar.DATE) + " ");
				System.out.println(calendar.get(Calendar.YEAR));
				String preFileName = "session-" + Integer.toString(calendar.get(Calendar.DATE)) + "-" + Integer.toString(calendar.get(Calendar.MONTH)) + ".txt";
				fileChooser.setSelectedFile(new File(preFileName));
				int returnVal = fileChooser.showSaveDialog(parentFrame);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
						String fileName = fileChooser.getSelectedFile().toString();
						File file = null;
						System.out.println("File choose =" + fileName);
						if (!fileName.toString().endsWith(".txt")) {
								file = new File(fileName + ".txt");
						} else {
								file = new File(fileName);
						}
						PrintWriter outWriter = null;
						try {
								outWriter = new PrintWriter(file);
								String[] str = mainView.replayDataPane.getText().split("\n");
								for (int i = 0; i < str.length; i++) {
										outWriter.print(str[i] + "\r\n");
								}
						} catch (Exception ex) {
								new SwingTools(parentFrame).showErrorDialog("IO error", ex.getLocalizedMessage());
						} finally {
								if (outWriter != null) {
										outWriter.close();
								}
						}
						//This is where a real application would open the file.
						//log.append("Opening: " + file.getName() + "." + newline);
				} else {
						System.out.println("File wasn't choosen!");
						//log.append("Open command cancelled by user." + newline);
				}
		}
		
		/**
		* Test case for {@link HttpFileUtils#fillToFileField(HttpAnalyzerView, JFrame)} method.
		* Test case for the {@link HttpFileUtils#fillToFileField(HttpAnalyzerView, JFrame)} method.
		* @throws IOException
		*/
		@Test
		void testFillToFileField() throws IOException {
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				final JFileChooser fileChooser = new JFileChooser();
				fileChooser.setDialogTitle("Save your content");
				fileChooser.setDialogType(javax.swing.JFileChooser.SAVE_DIALOG);
				int returnVal = fileChooser.showSaveDialog(parentFrame);
				if (returnVal == JFileChooser.APPROVE_OPTION) {
						mainView.toFileTextField.setText(fileChooser.getSelectedFile().toString());
						mainView.toFileCheckBox.setSelected(true);
				} else {
						System.out.println("File wasn't choosen!");
				}
		}
		
		/**
		* Test case for {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* Test case for the {@link HttpFileUtils#saveEntity(HttpEntity, String)} method.
		* @throws IOException
		*/
		@Test
		void testSaveEntity() throws IOException {
				HttpFileUtils httpFileUtils = new HttpFileUtils();
				long size = 0L;
				File file = new File(fileName);
				byte[] buffer = new byte[MAX_BUFFER_SIZE];
	