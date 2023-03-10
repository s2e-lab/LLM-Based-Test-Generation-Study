// RequestParamsDialogTest1.java
/*
 * RequestParamsFrame.java
 *
 * Created on 22.03.2010, 12:53:49
 */
package httpanalyzer;

import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.apache.http.NameValuePair;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.protocol.HTTP;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link RequestParamsDialog}.
* It contains ten unit test cases for the {@link RequestParamsDialog#isDataChanged()} method.
*/
class RequestParamsDialogTest1 {

		/**
		 * Test of isDataChanged method, of class RequestParamsDialog.
		 */
		@Test
		void testIsDataChanged() {
				System.out.println("isDataChanged");
				RequestParamsDialog instance = new RequestParamsDialog(new javax.swing.JFrame(), true);
				boolean expResult = false;
				boolean result = instance.isDataChanged();
				assertEquals(expResult, result);
				// TODO review the generated test code and remove the default call to fail.
				fail("The test case is a prototype.");
		}
		
		/**
		 * Test of getRequestParams method, of class RequestParamsDialog.
		 */
		@Test
		void testGetRequestParams() {
				System.out.println("getRequestParams");
				RequestParamsDialog instance = new RequestParamsDialog(new javax.swing.JFrame(), true);
				String expResult = "";
				String result = instance.getRequestParams();
				assertEquals(expResult, result);
				// TODO review the generated test code and remove the default call to fail.
				fail("The test case is a prototype.");
		}
		
		/**
		 * Test of initLetterMap method, of class RequestParamsDialog.
		 */
		@Test
		void testInitLetterMap() {
				System.out.println("initLetterMap");
				RequestParamsDialog instance = new RequestParamsDialog(new javax.swing.JFrame(), true);
				instance.initLetterMap();
				// TODO review the generated test code and remove the default call to fail.
				fail("The test case is a prototype.");
		}
		
		/**
		 * Test of encodingString method, of class RequestParamsDialog.
		 */
		@Test
		void testEncodingString() {
				System.out.println("encodingString");
				String baseLine = "";
				RequestParamsDialog instance = new RequestParamsDialog(new javax.swing.JFrame(), true);
				String expResult = "";
				String result = instance.encodingString(baseLine);
				assertEquals(expResult, result);
				// TODO review the generated test code and remove the default call to fail.
				fail("The test case is a prototype.");
		}
		
		/**
		 * Test of applyButtonActionPerformed method, of class RequestParamsDialog.
		 */
		@Test
		void testApplyButtonActionPerformed() {
				System.out.println("applyButtonActionPerformed");
				java.awt.event.ActionEvent evt = null;
				RequestParamsDialog instance = new RequestParamsDialog(new javax.swing.JFrame(), true);
				instance.applyButtonActionPerformed(evt);
				// TODO review the generated test code and remove the default call to fail.
				fail("The test case is a prototype.");
		}
		
		/**
		 * Test of cancelButtonActionPerformed method, of class RequestParamsDialog.
		 */
		@Test
		void testCancelButtonActionPerformed() {
				System.out.println("cancelButtonActionPerformed");
				java.awt.event.ActionEvent evt = null;
				RequestParamsDialog instance = new RequestParamsDialog(new javax.swing.JFrame(), true);
				instance.cancelButtonActionPerformed(evt);
				// TODO review the generated test code and remove the default call to fail.
				fail("The test case is a prototype.");
		}
		
		/**
		 * Test of encodeTextFieldKeyReleased method, of class RequestParamsDialog.
		 */
		@Test
		void testEncodeTextFieldKeyReleased() {
				System.out.println("encodeTextFieldKeyReleased");
				java.awt.event.KeyEvent evt = null;
				RequestParamsDialog instance = new RequestParamsDialog(new javax.swing.JFrame(), true);
				instance.encodeTextFieldKeyReleased(evt);
				// TODO review the generated test code and remove the default call to fail.
				fail("The test case is a prototype.");
		}
		
		/**
		 * Test of main method, of class RequestParamsDialog.
		 */
		@Test
		void testMain() {
				System.out.println("main");
				String[] args = null;
				RequestParamsDialog.main(args);
				// TODO review the generated test code and remove the default call to fail.
				fail("The test case is a prototype.");
		}
		
}