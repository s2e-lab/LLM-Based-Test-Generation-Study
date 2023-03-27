/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 21:30:34 GMT 2023
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
import original.SumSquares1;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SumSquares1_ESTest extends SumSquares1_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      List<Object> list0 = linkedList0.subList(0, 0);
      linkedList0.add(object0);
      // Undeclared exception!
      try { 
        SumSquares1.sumSquares(list0);
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
      // Undeclared exception!
      try { 
        SumSquares1.sumSquares((List<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.SumSquares1", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      linkedList0.add(object0);
      // Undeclared exception!
      try { 
        SumSquares1.sumSquares(linkedList0);
        fail("Expecting exception: ClassCastException");
      
      } catch(ClassCastException e) {
         //
         // java.lang.Object cannot be cast to java.lang.Integer
         //
         verifyException("original.SumSquares1", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(1443);
      linkedList0.add((Object) integer0);
      linkedList0.add((Object) integer0);
      linkedList0.add((Object) integer0);
      linkedList0.offerLast(integer0);
      linkedList0.add((Object) integer0);
      int int0 = SumSquares1.sumSquares(linkedList0);
      assertEquals((-1286114605), int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Integer integer0 = new Integer(1443);
      linkedList0.add((Object) integer0);
      linkedList0.add((Object) integer0);
      int int0 = SumSquares1.sumSquares(linkedList0);
      assertEquals(2083692, int0);
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      int int0 = SumSquares1.sumSquares(linkedList0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      SumSquares1 sumSquares1_0 = new SumSquares1();
  }
}
