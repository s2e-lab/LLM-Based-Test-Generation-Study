/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 21:56:06 GMT 2023
 */

package original;

import org.junit.Test;
import static org.junit.Assert.*;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import original.AnyInt;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class AnyInt_ESTest extends AnyInt_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      Integer integer0 = new Integer((-1654));
      Boolean boolean0 = AnyInt.anyInt(integer0, integer0, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      Integer integer0 = Integer.valueOf(1);
      Integer integer1 = new Integer(2);
      Boolean boolean0 = AnyInt.anyInt(integer0, integer0, integer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Integer integer1 = new Integer(15);
      Boolean boolean0 = AnyInt.anyInt(integer0, integer1, integer1);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Integer integer0 = new Integer(0);
      Boolean boolean0 = AnyInt.anyInt(integer0, integer0, integer0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      Integer integer0 = new Integer((-1654));
      Float float0 = new Float((double) (-1654));
      Boolean boolean0 = AnyInt.anyInt(integer0, integer0, float0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Integer integer0 = new Integer((-1654));
      Float float0 = new Float((double) (-1654));
      Boolean boolean0 = AnyInt.anyInt(integer0, float0, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      Integer integer0 = Integer.valueOf(1);
      Boolean boolean0 = AnyInt.anyInt(integer0, integer0, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      Integer integer0 = new Integer((-1654));
      Float float0 = new Float((double) (-1654));
      Boolean boolean0 = AnyInt.anyInt(float0, integer0, integer0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test8()  throws Throwable  {
      AnyInt anyInt0 = new AnyInt();
  }
}
