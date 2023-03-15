// FTPFileStorage_1Test.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.*;
import nu.staldal.lagoon.core.*;
import nu.staldal.ftp.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFileStorage}.
* It contains ten unit test cases for the {@link FTPFileStorage#createFile(String)} method.
*/
class FTPFileStorage_1Test {

		/**
		* Test case 1 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_1() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				OutputHandler result = fixture.createFile(pathname);
				assertNotNull(result);
		}
		
		/**
		* Test case 2 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_2() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				OutputHandler result = fixture.createFile(pathname);
				assertNotNull(result);
		}
		
		/**
		* Test case 3 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_3() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				OutputHandler result = fixture.createFile(pathname);
				assertNotNull(result);
		}
		
		/**
		* Test case 4 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_4() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				OutputHandler result = fixture.createFile(pathname);
				assertNotNull(result);
		}
		
		/**
		* Test case 5 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_5() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				OutputHandler result = fixture.createFile(pathname);
				assertNotNull(result);
		}
		
		/**
		* Test case 6 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_6() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				OutputHandler result = fixture.createFile(pathname);
				assertNotNull(result);
		}
		
		/**
		* Test case 7 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_7() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				OutputHandler result = fixture.createFile(pathname);
				assertNotNull(result);
		}
		
		/**
		* Test case 8 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_8() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				OutputHandler result = fixture.createFile(pathname);
				assertNotNull(result);
		}
		
		/**
		* Test case 9 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_9() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				OutputHandler result = fixture.createFile(pathname);
				assertNotNull(result);
		}
		
		/**
		* Test case 10 for method {@link FTPFileStorage#createFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testCreateFile_10() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				OutputHandler result = fixture.createFile(pathname);
				assertNotNull(result);
		}
}

// FTPFileStorage_2Test.java
package nu.staldal.lagoon.filestorage;

import java.io.*;
import java.net.*;
import nu.staldal.lagoon.core.*;
import nu.staldal.ftp.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FTPFileStorage}.
* It contains ten unit test cases for the {@link FTPFileStorage#deleteFile(String)} method.
*/
class FTPFileStorage_2Test {
		
		/**
		* Test case 1 for method {@link FTPFileStorage#deleteFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testDeleteFile_1() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				fixture.deleteFile(pathname);
		}
		
		/**
		* Test case 2 for method {@link FTPFileStorage#deleteFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testDeleteFile_2() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				fixture.deleteFile(pathname);
		}
		
		/**
		* Test case 3 for method {@link FTPFileStorage#deleteFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testDeleteFile_3() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				fixture.deleteFile(pathname);
		}
		
		/**
		* Test case 4 for method {@link FTPFileStorage#deleteFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testDeleteFile_4() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				fixture.deleteFile(pathname);
		}
		
		/**
		* Test case 5 for method {@link FTPFileStorage#deleteFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testDeleteFile_5() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				fixture.deleteFile(pathname);
		}
		
		/**
		* Test case 6 for method {@link FTPFileStorage#deleteFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testDeleteFile_6() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				fixture.deleteFile(pathname);
		}
		
		/**
		* Test case 7 for method {@link FTPFileStorage#deleteFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testDeleteFile_7() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				fixture.deleteFile(pathname);
		}
		
		/**
		* Test case 8 for method {@link FTPFileStorage#deleteFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testDeleteFile_8() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				fixture.deleteFile(pathname);
		}
		
		/**
		* Test case 9 for method {@link FTPFileStorage#deleteFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testDeleteFile_9() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
				String pathname = "";
				fixture.deleteFile(pathname);
		}
		
		/**
		* Test case 10 for method {@link FTPFileStorage#deleteFile(String)}.
		*
		* @throws IOException
		* @throws FTPException
		* @throws AuthenticationException
		* @throws UnknownHostException
		* @throws MalformedURLException
		*/
		@Test
		public void testDeleteFile_10() throws MalformedURLException, UnknownHostException, AuthenticationException, FTPException, IOException {
				FTPFileStorage fixture = new FTPFileStorage();
				fixture.open("", new LagoonContext(), "");
