/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 22:32:48 GMT 2023
 */

package original;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import original.SeparateParenGroups;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SeparateParenGroups_ESTest extends SeparateParenGroups_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      List<String> list0 = SeparateParenGroups.separateParenGroups("qV R)=@<7n{}a3<");
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      // Undeclared exception!
      try { 
        SeparateParenGroups.separateParenGroups((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.SeparateParenGroups", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      List<String> list0 = SeparateParenGroups.separateParenGroups("i()8cD");
      assertFalse(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      List<String> list0 = SeparateParenGroups.separateParenGroups("\"^,tx(vwrAD(&(X)");
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SeparateParenGroups separateParenGroups0 = new SeparateParenGroups();
  }
}
