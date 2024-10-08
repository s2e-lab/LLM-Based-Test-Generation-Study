/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 19:59:37 GMT 2023
 */

package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import original.EvenOddCount;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class EvenOddCount_ESTest extends EvenOddCount_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      List<Integer> list0 = EvenOddCount.evenOddCount(1);
      assertTrue(list0.contains(1));
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      List<Integer> list0 = EvenOddCount.evenOddCount(0);
      assertEquals(2, list0.size());
      assertTrue(list0.contains(0));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      List<Integer> list0 = EvenOddCount.evenOddCount((-2265));
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      EvenOddCount evenOddCount0 = new EvenOddCount();
  }
}
