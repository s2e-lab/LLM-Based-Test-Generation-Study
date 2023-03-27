/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 19:20:41 GMT 2023
 */

package original;

import org.junit.Test;
import static org.junit.Assert.*;
import static org.evosuite.runtime.EvoAssertions.*;
import java.util.ConcurrentModificationException;
import java.util.LinkedList;
import java.util.List;
import org.evosuite.runtime.EvoRunner;
import org.evosuite.runtime.EvoRunnerParameters;
import org.junit.runner.RunWith;
import original.WillItFly;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class WillItFly_ESTest extends WillItFly_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      linkedList0.add(integer0);
      linkedList0.add(integer0);
      Integer integer1 = new Integer((-1));
      linkedList0.add(integer1);
      linkedList0.add(integer0);
      Boolean boolean0 = WillItFly.willItFly(linkedList0, (-1));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-1));
      linkedList0.add(integer0);
      Boolean boolean0 = WillItFly.willItFly(linkedList0, 0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-1));
      linkedList0.add(integer0);
      Boolean boolean0 = WillItFly.willItFly(linkedList0, (-465));
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      List<Integer> list0 = linkedList0.subList(0, 0);
      Integer integer0 = Integer.valueOf((-1434));
      linkedList0.add(integer0);
      // Undeclared exception!
      try { 
        WillItFly.willItFly(list0, (-1434));
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      // Undeclared exception!
      try { 
        WillItFly.willItFly((List<Integer>) null, (-1));
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.WillItFly", e);
      }
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      WillItFly willItFly0 = new WillItFly();
  }
}
