/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 19:58:00 GMT 2023
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
import original.TriplesSumToZero;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TriplesSumToZero_ESTest extends TriplesSumToZero_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-1934));
      linkedList0.offer(integer0);
      linkedList0.addLast(integer0);
      linkedList0.add(integer0);
      Boolean boolean0 = TriplesSumToZero.triplesSumToZero(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      List<Integer> list0 = linkedList0.subList(0, 0);
      linkedList0.add((Integer) null);
      // Undeclared exception!
      try { 
        TriplesSumToZero.triplesSumToZero(list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      // Undeclared exception!
      try { 
        TriplesSumToZero.triplesSumToZero((List<Integer>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.TriplesSumToZero", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(0);
      linkedList0.push(integer0);
      linkedList0.add(integer0);
      linkedList0.push(integer0);
      Boolean boolean0 = TriplesSumToZero.triplesSumToZero(linkedList0);
      assertTrue(boolean0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer(1);
      linkedList0.add(integer0);
      linkedList0.add(integer0);
      linkedList0.push(integer0);
      Boolean boolean0 = TriplesSumToZero.triplesSumToZero(linkedList0);
      assertFalse(boolean0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      TriplesSumToZero triplesSumToZero0 = new TriplesSumToZero();
  }
}
