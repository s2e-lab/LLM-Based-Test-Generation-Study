/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 20:24:23 GMT 2023
 */

package original;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import original.CheckDictCase;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CheckDictCase_ESTest extends CheckDictCase_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Object object0 = new Object();
      Boolean boolean0 = CheckDictCase.checkDictCase(object0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      CheckDictCase checkDictCase0 = new CheckDictCase();
  }
}
