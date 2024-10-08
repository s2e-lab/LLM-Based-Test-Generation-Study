/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 20:51:43 GMT 2023
 */

package original;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import original.Encrypt;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Encrypt_ESTest extends Encrypt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      String string0 = Encrypt.encrypt("IfSZ{fQgvxS[");
      assertEquals("IjSZ{jQkzbS[", string0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      String string0 = Encrypt.encrypt("IjSZ{jQkzbS[");
      assertEquals("InSZ{nQodfS[", string0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      String string0 = Encrypt.encrypt("");
      assertEquals("", string0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        Encrypt.encrypt((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.Encrypt", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      String string0 = Encrypt.encrypt("%o&BB8wW,uaH");
      assertEquals("%s&BB8aW,yeH", string0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Encrypt encrypt0 = new Encrypt();
  }
}
