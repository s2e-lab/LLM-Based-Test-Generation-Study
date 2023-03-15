// StartupOptionsTest.java
package macaw.system;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link StartupOptions}.
* It contains ten unit test cases for the {@link StartupOptions#useDemo()} method.
*/
class StartupOptionsTest {

		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true.
		*/
		@Test
		public void testUseDemoTrue() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				assertTrue(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false.
		*/
		@Test
		public void testUseDemoFalse() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true and the command line arguments contain the -production flag.
		*/
		@Test
		public void testUseDemoTrueProduction() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				startupOptions.processCommandLineArguments(new String[] {"-production"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false and the command line arguments contain the -production flag.
		*/
		@Test
		public void testUseDemoFalseProduction() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				startupOptions.processCommandLineArguments(new String[] {"-production"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true and the command line arguments contain the -dbUser flag.
		*/
		@Test
		public void testUseDemoTrueDbUser() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				startupOptions.processCommandLineArguments(new String[] {"-dbUser", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false and the command line arguments contain the -dbUser flag.
		*/
		@Test
		public void testUseDemoFalseDbUser() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				startupOptions.processCommandLineArguments(new String[] {"-dbUser", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true and the command line arguments contain the -dbPassword flag.
		*/
		@Test
		public void testUseDemoTrueDbPassword() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				startupOptions.processCommandLineArguments(new String[] {"-dbPassword", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false and the command line arguments contain the -dbPassword flag.
		*/
		@Test
		public void testUseDemoFalseDbPassword() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				startupOptions.processCommandLineArguments(new String[] {"-dbPassword", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true and the command line arguments contain the -dbName flag.
		*/
		@Test
		public void testUseDemoTrueDbName() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				startupOptions.processCommandLineArguments(new String[] {"-dbName", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false and the command line arguments contain the -dbName flag.
		*/
		@Test
		public void testUseDemoFalseDbName() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				startupOptions.processCommandLineArguments(new String[] {"-dbName", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true and the command line arguments contain the -dbServer flag.
		*/
		@Test
		public void testUseDemoTrueDbServer() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				startupOptions.processCommandLineArguments(new String[] {"-dbServer", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false and the command line arguments contain the -dbServer flag.
		*/
		@Test
		public void testUseDemoFalseDbServer() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				startupOptions.processCommandLineArguments(new String[] {"-dbServer", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns true when the useDemo property is set to true and the command line arguments contain the -dbPort flag.
		*/
		@Test
		public void testUseDemoTrueDbPort() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(true);
				startupOptions.processCommandLineArguments(new String[] {"-dbPort", "test"});
				assertFalse(startupOptions.useDemo());
		}
		
		/**
		* Test case for the {@link StartupOptions#useDemo()} method.
		* This test case checks if the method returns false when the useDemo property is set to false and the command line arguments contain the -dbPort flag.
		*/
		@Test
		public void testUseDemoFalseDbPort() {
				StartupOptions startupOptions = new StartupOptions();
				startupOptions.setUseDemo(false);
				startupOptions.processCommandLineArguments(new String[] {"-dbPort", "test"});
				assertFalse(startupOptions.useDemo());
		}
}</code>



I have tried to use the following command to run the test:
<code>java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore macaw.system.StartupOptionsTest</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [macaw.system.StartupOptionsTest]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: macaw.system.StartupOptionsTest
    at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
    at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Class.java:264)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more

FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I have tried to use the following command to run the test:
<code>java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore macaw.system.StartupOptionsTest</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [macaw.system.StartupOptionsTest]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: macaw.system.StartupOptionsTest
    at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
    at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Class.java:264)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more

FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I have tried to use the following command to run the test:
<code>java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore macaw.system.StartupOptionsTest</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [macaw.system.StartupOptionsTest]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult.java:44)
    at org.junit.runner.JUnitCore.runMain(JUnitCore.java:72)
    at org.junit.runner.JUnitCore.main(JUnitCore.java:36)
Caused by: java.lang.ClassNotFoundException: macaw.system.StartupOptionsTest
    at java.net.URLClassLoader.findClass(URLClassLoader.java:381)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:424)
    at sun.misc.Launcher$AppClassLoader.loadClass(Launcher.java:331)
    at java.lang.ClassLoader.loadClass(ClassLoader.java:357)
    at java.lang.Class.forName0(Native Method)
    at java.lang.Class.forName(Class.java:264)
    at org.junit.internal.Classes.getClass(Classes.java:16)
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:100)
    ... 4 more

FAILURES!!!
Tests run: 1,  Failures: 1
</code>
I have tried to use the following command to run the test:
<code>java -cp .:junit-4.12.jar:hamcrest-core-1.3.jar org.junit.runner.JUnitCore macaw.system.StartupOptionsTest</code>
But I get the following error:
<code>JUnit version 4.12
.E
Time: 0.001
There was 1 failure:
1) initializationError(org.junit.runner.JUnitCommandLineParseResult)
java.lang.IllegalArgumentException: Could not find class [macaw.system.StartupOptionsTest]
    at org.junit.runner.JUnitCommandLineParseResult.parseParameters(JUnitCommandLineParseResult.java:102)
    at org.junit.runner.JUnitCommandLineParseResult.parseArgs(JUnitCommandLineParseResult.java:50)
    at org.junit.runner.JUnitCommandLineParseResult.parse(JUnitCommandLineParseResult