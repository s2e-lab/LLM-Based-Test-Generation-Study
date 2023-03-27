/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 22:19:12 GMT 2023
 */

package original;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import original.SumToN;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SumToN_ESTest extends SumToN_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      SumToN.sumToN(6225156);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      int int0 = SumToN.sumToN(509);
      assertEquals(129795, int0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      int int0 = SumToN.sumToN((-6179));
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      SumToN sumToN0 = new SumToN();
  }
}
