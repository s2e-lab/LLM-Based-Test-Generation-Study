// Discriminator_1Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Discriminator}.
* It contains ten unit test cases for the {@link Discriminator#getTypeDesc()} method.
*/
class Discriminator_1Test {

    /**
    * Test case number: 1
    * Test case values: allowedEngines = null, processor = null, CPU = 0.0, RAM = 0.0, OS = null
    */
    @Test
    void test1() {
        Discriminator discriminator = new Discriminator();
        discriminator.setAllowedEngines(null);
        discriminator.setProcessor(null);
        discriminator.setCPU((float) 0.0);
        discriminator.setRAM((float) 0.0);
        discriminator.setOS(null);
        assertEquals(null, discriminator.getAllowedEngines());
        assertEquals(null, discriminator.getProcessor());
        assertEquals((float) 0.0, discriminator.getCPU(), 0.0);
        assertEquals((float) 0.0, discriminator.getRAM(), 0.0);
        assertEquals(null, discriminator.getOS());
    }

    /**
    * Test case number: 2
    * Test case values: allowedEngines = null, processor = null, CPU = 0.0, RAM = 0.0, OS = ""
    */
    @Test
    void test2() {
        Discriminator discriminator = new Discriminator();
        discriminator.setAllowedEngines(null);
        discriminator.setProcessor(null);
        discriminator.setCPU((float) 0.0);
        discriminator.setRAM((float) 0.0);
        discriminator.setOS("");
        assertEquals(null, discriminator.getAllowedEngines());
        assertEquals(null, discriminator.getProcessor());
        assertEquals((float) 0.0, discriminator.getCPU(), 0.0);
        assertEquals((float) 0.0, discriminator.getRAM(), 0.0);
        assertEquals("", discriminator.getOS());
    }

    /**
    * Test case number: 3
    * Test case values: allowedEngines = null, processor = null, CPU = 0.0, RAM = 0.0, OS = " "
    */
    @Test
    void test3() {
        Discriminator discriminator = new Discriminator();
        discriminator.setAllowedEngines(null);
        discriminator.setProcessor(null);
        discriminator.setCPU((float) 0.0);
        discriminator.setRAM((float) 0.0);
        discriminator.setOS(" ");
        assertEquals(null, discriminator.getAllowedEngines());
        assertEquals(null, discriminator.getProcessor());
        assertEquals((float) 0.0, discriminator.getCPU(), 0.0);
        assertEquals((float) 0.0, discriminator.getRAM(), 0.0);
        assertEquals(" ", discriminator.getOS());
    }

    /**
    * Test case number: 4
    * Test case values: allowedEngines = null, processor = null, CPU = 0.0, RAM = 0.0, OS = "  "
    */
    @Test
    void test4() {
        Discriminator discriminator = new Discriminator();
        discriminator.setAllowedEngines(null);
        discriminator.setProcessor(null);
        discriminator.setCPU((float) 0.0);
        discriminator.setRAM((float) 0.0);
        discriminator.setOS("  ");
        assertEquals(null, discriminator.getAllowedEngines());
        assertEquals(null, discriminator.getProcessor());
        assertEquals((float) 0.0, discriminator.getCPU(), 0.0);
        assertEquals((float) 0.0, discriminator.getRAM(), 0.0);
        assertEquals("  ", discriminator.getOS());
    }

    /**
    * Test case number: 5
    * Test case values: allowedEngines = null, processor = null, CPU = 0.0, RAM = 0.0, OS = "a"
    */
    @Test
    void test5() {
        Discriminator discriminator = new Discriminator();
        discriminator.setAllowedEngines(null);
        discriminator.setProcessor(null);
        discriminator.setCPU((float) 0.0);
        discriminator.setRAM((float) 0.0);
        discriminator.setOS("a");
        assertEquals(null, discriminator.getAllowedEngines());
        assertEquals(null, discriminator.getProcessor());
        assertEquals((float) 0.0, discriminator.getCPU(), 0.0);
        assertEquals((float) 0.0, discriminator.getRAM(), 0.0);
        assertEquals("a", discriminator.getOS());
    }

    /**
    * Test case number: 6
    * Test case values: allowedEngines = null, processor = null, CPU = 0.0, RAM = 0.0, OS = "ab"
    */
    @Test
    void test6() {
        Discriminator discriminator = new Discriminator();
        discriminator.setAllowedEngines(null);
        discriminator.setProcessor(null);
        discriminator.setCPU((float) 0.0);
        discriminator.setRAM((float) 0.0);
        discriminator.setOS("ab");
        assertEquals(null, discriminator.getAllowedEngines());
        assertEquals(null, discriminator.getProcessor());
        assertEquals((float) 0.0, discriminator.getCPU(), 0.0);
        assertEquals((float) 0.0, discriminator.getRAM(), 0.0);
        assertEquals("ab", discriminator.getOS());
    }

    /**
    * Test case number: 7
    * Test case values: allowedEngines = null, processor = null, CPU = 0.0, RAM = 0.0, OS = "abc"
    */
    @Test
    void test7() {
        Discriminator discriminator = new Discriminator();
        discriminator.setAllowedEngines(null);
        discriminator.setProcessor(null);
        discriminator.setCPU((float) 0.0);
        discriminator.setRAM((float) 0.0);
        discriminator.setOS("abc");
        assertEquals(null, discriminator.getAllowedEngines());
        assertEquals(null, discriminator.getProcessor());
        assertEquals((float) 0.0, discriminator.getCPU(), 0.0);
        assertEquals((float) 0.0, discriminator.getRAM(), 0.0);
        assertEquals("abc", discriminator.getOS());
    }

    /**
    * Test case number: 8
    * Test case values: allowedEngines = null, processor = null, CPU = 0.0, RAM = 0.0, OS = "abcd"
    */
    @Test
    void test8() {
        Discriminator discriminator = new Discriminator();
        discriminator.setAllowedEngines(null);
        discriminator.setProcessor(null);
        discriminator.setCPU((float) 0.0);
        discriminator.setRAM((float) 0.0);
        discriminator.setOS("abcd");
        assertEquals(null, discriminator.getAllowedEngines());
        assertEquals(null, discriminator.getProcessor());
        assertEquals((float) 0.0, discriminator.getCPU(), 0.0);
        assertEquals((float) 0.0, discriminator.getRAM(), 0.0);
        assertEquals("abcd", discriminator.getOS());
    }

    /**
    * Test case number: 9
    * Test case values: allowedEngines = null, processor = null, CPU = 0.0, RAM = 0.0, OS = "abcde"
    */
    @Test
    void test9() {
        Discriminator discriminator = new Discriminator();
        discriminator.setAllowedEngines(null);
        discriminator.setProcessor(null);
        discriminator.setCPU((float) 0.0);
        discriminator.setRAM((float) 0.0);
        discriminator.setOS("abcde");
        assertEquals(null, discriminator.getAllowedEngines());
        assertEquals(null, discriminator.getProcessor());
        assertEquals((float) 0.0, discriminator.getCPU(), 0.0);
        assertEquals((float) 0.0, discriminator.getRAM(), 0.0);
        assertEquals("abcde", discriminator.getOS());
    }

    /**
    * Test case number: 10
    * Test case values: allowedEngines = null, processor = null, CPU = 0.0, RAM = 0.0, OS = "abcdef"
    */
    @Test
    void test10() {
        Discriminator discriminator = new Discriminator();
        discriminator.setAllowedEngines(null);
        discriminator.setProcessor(null);
        discriminator.setCPU((float) 0.0);
        discriminator.setRAM((float) 0.0);
        discriminator.setOS("abcdef");
        assertEquals(null, discriminator.getAllowedEngines());
        assertEquals(null, discriminator.getProcessor());
        assertEquals((float) 0.0, discriminator.getCPU(), 0.0);
        assertEquals((float) 0.0, discriminator.getRAM(), 0.0);
        assertEquals("abcdef", discriminator.getOS());
    }
}

// Discriminator_2Test.java
package mygrid.web;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Discriminator}.
* It contains ten unit test cases