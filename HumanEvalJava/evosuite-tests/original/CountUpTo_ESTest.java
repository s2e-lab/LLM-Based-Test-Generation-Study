/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 20:27:41 GMT 2023
 */

package original;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import original.CountUpTo;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class CountUpTo_ESTest extends CountUpTo_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      // Undeclared exception!
      CountUpTo.countUpTo(2031);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      List<Object> list0 = CountUpTo.countUpTo(211);
      assertEquals(46, list0.size());
      assertFalse(list0.contains(211));
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      List<Object> list0 = CountUpTo.countUpTo(1);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      CountUpTo countUpTo0 = new CountUpTo();
  }
}
