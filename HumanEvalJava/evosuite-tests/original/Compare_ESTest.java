/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 20:37:33 GMT 2023
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
import original.Compare;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class Compare_ESTest extends Compare_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.offer((Integer) null);
      List<Integer> list0 = linkedList0.subList(1, 1);
      linkedList0.pollFirst();
      // Undeclared exception!
      try { 
        Compare.compare(list0, list0);
        fail("Expecting exception: ConcurrentModificationException");
      
      } catch(ConcurrentModificationException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("java.util.SubList", e);
      }
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      linkedList0.add((Integer) null);
      // Undeclared exception!
      try { 
        Compare.compare(linkedList0, linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.Compare", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      LinkedList<Integer> linkedList1 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-4892));
      linkedList1.add(integer0);
      // Undeclared exception!
      try { 
        Compare.compare(linkedList1, linkedList0);
        fail("Expecting exception: IndexOutOfBoundsException");
      
      } catch(IndexOutOfBoundsException e) {
         //
         // Index: 0, Size: 0
         //
         verifyException("java.util.LinkedList", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      Integer integer0 = new Integer((-1));
      linkedList0.add(integer0);
      List<Integer> list0 = Compare.compare(linkedList0, linkedList0);
      List<Integer> list1 = Compare.compare(linkedList0, list0);
      assertFalse(list1.equals((Object)list0));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Integer> linkedList0 = new LinkedList<Integer>();
      List<Integer> list0 = Compare.compare(linkedList0, linkedList0);
      assertTrue(list0.isEmpty());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      Compare compare0 = new Compare();
  }
}
