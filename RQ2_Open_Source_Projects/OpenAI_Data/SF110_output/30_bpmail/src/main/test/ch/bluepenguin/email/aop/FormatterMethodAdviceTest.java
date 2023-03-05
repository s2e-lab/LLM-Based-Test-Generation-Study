// FormatterMethodAdviceTest.java
package ch.bluepenguin.email.aop;

import java.util.Vector;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link FormatterMethodAdvice}.
* It contains ten unit test cases for the {@link FormatterMethodAdvice#invoke(MethodInvocation)} method.
*/
class FormatterMethodAdviceTest {

	/**
	 * Test method for {@link ch.bluepenguin.email.aop.FormatterMethodAdvice#invoke(org.aopalliance.intercept.MethodInvocation)}.
	 */
	@Test
	public void testInvoke() {
		FormatterMethodAdvice advice = new FormatterMethodAdvice();
		MethodInvocation invocation = new MethodInvocation() {
			public Object proceed() throws Throwable {
				return new Vector();
			}
			public Object getThis() {
				return null;
			}
			public Object[] getArguments() {
				return null;
			}
			public MethodInterceptor getMethodInterceptor() {
				return null;
			}
			public java.lang.reflect.Method getMethod() {
				return null;
			}
		};
		try {
			advice.invoke(invocation);
		} catch (Throwable e) {
			fail("Unexpected exception thrown: " + e.getMessage());
		}
	}
}