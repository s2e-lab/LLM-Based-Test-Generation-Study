// SecClientTest.java
package dsachat.client.net;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.math.BigInteger;
import java.net.Socket;
import java.net.UnknownHostException;
import java.security.AlgorithmParameterGenerator;
import java.security.AlgorithmParameters;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPair;
import java.security.KeyPairGenerator;
import java.security.PublicKey;
import java.security.spec.X509EncodedKeySpec;
import java.util.Vector;
import javax.crypto.Cipher;
import javax.crypto.CipherInputStream;
import javax.crypto.CipherOutputStream;
import javax.crypto.KeyAgreement;
import javax.crypto.spec.DHParameterSpec;
import javax.crypto.spec.SecretKeySpec;
import dsachat.share.ConnectionEndpoint;
import dsachat.share.InputEvent;
import dsachat.share.InputListener;
import dsachat.share.KeyExc;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SecClient}.
* It contains ten unit test cases for the {@link SecClient#isConnected()} method.
*/
class SecClientTest {

		/**
		* Test case for {@link SecClient#isConnected()} method.
		* This test case tests the {@link SecClient#isConnected()} method.
		* It is expected that the method returns true.
		*/
		@Test
		void testIsConnected() {
				SecClient secClient = new SecClient();
				assertTrue(secClient.isConnected());
		}
		
		/**
		* Test case for {@link SecClient#isConnected()} method.
		* This test case tests the {@link SecClient#isConnected()} method.
		* It is expected that the method returns false.
		*/
		@Test
		void testIsConnected2() {
				SecClient secClient = new SecClient();
				assertFalse(secClient.isConnected());
		}
		
		/**
		* Test case for {@link SecClient#isConnected()} method.
		* This test case tests the {@link SecClient#isConnected()} method.
		* It is expected that the method returns true.
		*/
		@Test
		void testIsConnected3() {
				SecClient secClient = new SecClient();
				assertTrue(secClient.isConnected());
		}
		
		/**
		* Test case for {@link SecClient#isConnected()} method.
		* This test case tests the {@link SecClient#isConnected()} method.
		* It is expected that the method returns false.
		*/
		@Test
		void testIsConnected4() {
				SecClient secClient = new SecClient();
				assertFalse(secClient.isConnected());
		}
		
		/**
		* Test case for {@link SecClient#isConnected()} method.
		* This test case tests the {@link SecClient#isConnected()} method.
		* It is expected that the method returns true.
		*/
		@Test
		void testIsConnected5() {
				SecClient secClient = new SecClient();
				assertTrue(secClient.isConnected());
		}
		
		/**
		* Test case for {@link SecClient#isConnected()} method.
		* This test case tests the {@link SecClient#isConnected()} method.
		* It is expected that the method returns false.
		*/
		@Test
		void testIsConnected6() {
				SecClient secClient = new SecClient();
				assertFalse(secClient.isConnected());
		}
		
		/**
		* Test case for {@link SecClient#isConnected()} method.
		* This test case tests the {@link SecClient#isConnected()} method.
		* It is expected that the method returns true.
		*/
		@Test
		void testIsConnected7() {
				SecClient secClient = new SecClient();
				assertTrue(secClient.isConnected());
		}
		
		/**
		* Test case for {@link SecClient#isConnected()} method.
		* This test case tests the {@link SecClient#isConnected()} method.
		* It is expected that the method returns false.
		*/
		@Test
		void testIsConnected8() {
				SecClient secClient = new SecClient();
				assertFalse(secClient.isConnected());
		}
		
		/**
		* Test case for {@link SecClient#isConnected()} method.
		* This test case tests the {@link SecClient#isConnected()} method.
		* It is expected that the method returns true.
		*/
		@Test
		void testIsConnected9() {
				SecClient secClient = new SecClient();
				assertTrue(secClient.isConnected());
		}
		
		/**
		* Test case for {@link SecClient#isConnected()} method.
		* This test case tests the {@link SecClient#isConnected()} method.
		* It is expected that the method returns false.
		*/
		@Test
		void testIsConnected10() {
				SecClient secClient = new SecClient();
				assertFalse(secClient.isConnected());
		}
}