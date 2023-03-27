/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 18:45:47 GMT 2023
 */

package original;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import original.ParseMusic;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class ParseMusic_ESTest extends ParseMusic_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      List<Object> list0 = ParseMusic.parseMusic("no~C0z4");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      List<Object> list0 = ParseMusic.parseMusic("G3=&O02vY+.");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      List<Object> list0 = ParseMusic.parseMusic("");
      assertFalse(list0.contains(""));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      // Undeclared exception!
      try { 
        ParseMusic.parseMusic((String) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.ParseMusic", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      List<Object> list0 = ParseMusic.parseMusic("original.ParseMusic");
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      List<Object> list0 = ParseMusic.parseMusic("~dk'o");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      List<Object> list0 = ParseMusic.parseMusic("0H;D04T7\n%quo|");
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test7()  throws Throwable  {
      ParseMusic parseMusic0 = new ParseMusic();
  }
}
