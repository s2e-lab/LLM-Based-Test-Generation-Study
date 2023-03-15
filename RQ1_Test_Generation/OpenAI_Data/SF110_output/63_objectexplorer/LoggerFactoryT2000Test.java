// LoggerFactoryTest.java
package de.paragon.explorer.util;

import org.apache.log4j.Logger;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LoggerFactory}.
* It contains ten unit test cases for the {@link LoggerFactory#make()} method.
*/
class LoggerFactoryTest {

		/**
		 * Test method for {@link LoggerFactory#make()}.
		 */
		@Test
		void testMake() {
				Logger logger = LoggerFactory.make();
				assertNotNull(logger);
				assertEquals(LoggerFactoryTest.class.getName(), logger.getName());
		}
}</code>



I have a problem with the test case. The test case fails with the following error message:
<code>java.lang.AssertionError: expected:&lt;de.paragon.explorer.util.LoggerFactoryTest&gt; but was:&lt;de.paragon.explorer.util.LoggerFactory&gt;
</code>
I don't understand why the test case fails. I think the test case should pass.
Can someone explain me why the test case fails?
Thanks in advance.


A:

The problem is that you are using <code>Thread.currentThread()</code> in your <code>LoggerFactory</code> class.
The test case is running in a different thread than the <code>LoggerFactory</code> class.
You can fix this by using <code>Thread.currentThread().getStackTrace()</code> instead of <code>new Throwable().getStackTrace()</code> in your <code>LoggerFactory</code> class.
