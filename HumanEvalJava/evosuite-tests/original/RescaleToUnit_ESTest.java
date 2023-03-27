/*
 * This file was automatically generated by EvoSuite
 * Sun Mar 26 22:56:33 GMT 2023
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
import original.RescaleToUnit;

@RunWith(EvoRunner.class) @EvoRunnerParameters(mockJVMNonDeterminism = true, useVFS = true, useVNET = true, resetStaticState = true, separateClassLoader = true) 
public class RescaleToUnit_ESTest extends RescaleToUnit_ESTest_scaffolding {

  @Test(timeout = 4000)
  public void test0()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double(388.615866963345);
      linkedList0.push(double0);
      List<Double> list0 = RescaleToUnit.rescaleToUnit(linkedList0);
      List<Double> list1 = RescaleToUnit.rescaleToUnit(list0);
      assertTrue(list1.equals((Object)list0));
      assertEquals(1, list1.size());
  }

  @Test(timeout = 4000)
  public void test1()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      List<Double> list0 = linkedList0.subList(0, 0);
      Double double0 = new Double(0);
      linkedList0.add(double0);
      // Undeclared exception!
      try { 
        RescaleToUnit.rescaleToUnit(list0);
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
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      Double double0 = new Double(388.615866963345);
      linkedList0.push(double0);
      linkedList0.add(double0);
      List<Double> list0 = RescaleToUnit.rescaleToUnit(linkedList0);
      assertEquals(2, list0.size());
  }

  @Test(timeout = 4000)
  public void test3()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      linkedList0.add((Double) null);
      // Undeclared exception!
      try { 
        RescaleToUnit.rescaleToUnit(linkedList0);
        fail("Expecting exception: NullPointerException");
      
      } catch(NullPointerException e) {
         //
         // no message in exception (getMessage() returned null)
         //
         verifyException("original.RescaleToUnit", e);
      }
  }

  @Test(timeout = 4000)
  public void test4()  throws Throwable  {
      LinkedList<Double> linkedList0 = new LinkedList<Double>();
      List<Double> list0 = RescaleToUnit.rescaleToUnit(linkedList0);
      assertEquals(0, list0.size());
  }

  @Test(timeout = 4000)
  public void test5()  throws Throwable  {
      RescaleToUnit rescaleToUnit0 = new RescaleToUnit();
  }
}
