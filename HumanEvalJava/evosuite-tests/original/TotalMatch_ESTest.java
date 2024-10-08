/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 22:25:56 GMT 2023
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
import original.TotalMatch;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class TotalMatch_ESTest extends TotalMatch_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList1.add((Object) "*{f~KgN3I@");
      List<Object> list0 = TotalMatch.totalMatch(linkedList0, linkedList1);
      assertFalse(list0.contains("*{f~KgN3I@"));
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      List<Object> list0 = linkedList0.subList(0, 0);
      linkedList0.add((Object) list0);
      // Undeclared exception!
      try { 
        TotalMatch.totalMatch(list0, list0);
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
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      // Undeclared exception!
      try { 
        TotalMatch.totalMatch(linkedList0, (List<Object>) null);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.TotalMatch", e);
      }
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      LinkedList<Object> linkedList1 = new LinkedList<Object>();
      linkedList1.add((Object) "*{f~KgN3I@");
      List<Object> list0 = TotalMatch.totalMatch(linkedList1, linkedList0);
      assertFalse(list0.contains("*{f~KgN3I@"));
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      linkedList0.add((Object) "*{f~KgN3I@");
      List<Object> list0 = TotalMatch.totalMatch(linkedList0, linkedList0);
      assertTrue(list0.contains("*{f~KgN3I@"));
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      LinkedList<Object> linkedList0 = new LinkedList<Object>();
      Object object0 = new Object();
      linkedList0.add(object0);
      List<Object> list0 = TotalMatch.totalMatch(linkedList0, linkedList0);
      assertEquals(1, list0.size());
  }

  @Test(timeout = 4000)
  public void test6()  throws Throwable  {
      TotalMatch totalMatch0 = new TotalMatch();
  }
}
