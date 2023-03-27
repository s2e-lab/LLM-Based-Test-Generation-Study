/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 22:11:48 GMT 2023
 */

package original;

import org.junit.Test;
import static org.junit.Assert.*;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import original.Eat;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Eat_ESTest extends Eat_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      List<Integer> list0 = Eat.eat(4342, (-1), 4342);
      assertFalse(list0.contains(4342));
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      List<Integer> list0 = Eat.eat(0, 0, 0);
      assertTrue(list0.contains(0));
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      List<Integer> list0 = Eat.eat(3114, 0, (-1));
      assertEquals(2, list0.size());
      assertFalse(list0.contains((-1)));
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      Eat eat0 = new Eat();
  }
}
