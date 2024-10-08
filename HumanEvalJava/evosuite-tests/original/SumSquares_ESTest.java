/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 21:50:50 GMT 2023
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
import original.SumSquares;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class SumSquares_ESTest extends SumSquares_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Number> linkedList0 = new LinkedList<Number>();
      List<Number> list0 = linkedList0.subList(0, 0);
      Float float0 = new Float((double) 0);
      linkedList0.add((Number) float0);
      // Undeclared exception!
      try { 
        SumSquares.sumSquares(list0);
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
      LinkedList<Number> linkedList0 = new LinkedList<Number>();
      linkedList0.add((Number) null);
      // Undeclared exception!
      try { 
        SumSquares.sumSquares(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.SumSquares", e);
      }
  }

  @Test(timeout = 4000)
  public void test2()  throws Throwable  {
      LinkedList<Number> linkedList0 = new LinkedList<Number>();
      Float float0 = new Float((float) 4232L);
      linkedList0.add((Number) float0);
      int int0 = SumSquares.sumSquares(linkedList0);
      assertEquals(17909824, int0);
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Number> linkedList0 = new LinkedList<Number>();
      int int0 = SumSquares.sumSquares(linkedList0);
      assertEquals(0, int0);
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      SumSquares sumSquares0 = new SumSquares();
  }
}
