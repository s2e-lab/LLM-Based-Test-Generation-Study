// Memory_1Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains ten unit test cases for the {@link Memory#get(int)} method.
*/
class Memory_1Test {

    /**
    * Test case for the {@link Memory#get(int)} method.
    * It tests the case where the address is within the first array.
    */
    @Test
    void test_get_1() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        assertEquals(1, memory.get(0));
        assertEquals(2, memory.get(1));
        assertEquals(3, memory.get(2));
        assertEquals(4, memory.get(3));
        assertEquals(5, memory.get(4));
        assertEquals(6, memory.get(5));
        assertEquals(7, memory.get(6));
        assertEquals(8, memory.get(7));
        assertEquals(9, memory.get(8));
        assertEquals(10, memory.get(9));
    }

    /**
    * Test case for the {@link Memory#get(int)} method.
    * It tests the case where the address is within the second array.
    */
    @Test
    void test_get_2() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        memory.arrays.add(new MemoryArray(new short[] { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }));
        assertEquals(1, memory.get(0));
        assertEquals(2, memory.get(1));
        assertEquals(3, memory.get(2));
        assertEquals(4, memory.get(3));
        assertEquals(5, memory.get(4));
        assertEquals(6, memory.get(5));
        assertEquals(7, memory.get(6));
        assertEquals(8, memory.get(7));
        assertEquals(9, memory.get(8));
        assertEquals(10, memory.get(9));
        assertEquals(11, memory.get(10));
        assertEquals(12, memory.get(11));
        assertEquals(13, memory.get(12));
        assertEquals(14, memory.get(13));
        assertEquals(15, memory.get(14));
        assertEquals(16, memory.get(15));
        assertEquals(17, memory.get(16));
        assertEquals(18, memory.get(17));
        assertEquals(19, memory.get(18));
        assertEquals(20, memory.get(19));
    }

    /**
    * Test case for the {@link Memory#get(int)} method.
    * It tests the case where the address is within the third array.
    */
    @Test
    void test_get_3() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        memory.arrays.add(new MemoryArray(new short[] { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }));
        memory.arrays.add(new MemoryArray(new short[] { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 }));
        assertEquals(1, memory.get(0));
        assertEquals(2, memory.get(1));
        assertEquals(3, memory.get(2));
        assertEquals(4, memory.get(3));
        assertEquals(5, memory.get(4));
        assertEquals(6, memory.get(5));
        assertEquals(7, memory.get(6));
        assertEquals(8, memory.get(7));
        assertEquals(9, memory.get(8));
        assertEquals(10, memory.get(9));
        assertEquals(11, memory.get(10));
        assertEquals(12, memory.get(11));
        assertEquals(13, memory.get(12));
        assertEquals(14, memory.get(13));
        assertEquals(15, memory.get(14));
        assertEquals(16, memory.get(15));
        assertEquals(17, memory.get(16));
        assertEquals(18, memory.get(17));
        assertEquals(19, memory.get(18));
        assertEquals(20, memory.get(19));
        assertEquals(21, memory.get(20));
        assertEquals(22, memory.get(21));
        assertEquals(23, memory.get(22));
        assertEquals(24, memory.get(23));
        assertEquals(25, memory.get(24));
        assertEquals(26, memory.get(25));
        assertEquals(27, memory.get(26));
        assertEquals(28, memory.get(27));
        assertEquals(29, memory.get(28));
        assertEquals(30, memory.get(29));
    }

    /**
    * Test case for the {@link Memory#get(int)} method.
    * It tests the case where the address is within the fourth array.
    */
    @Test
    void test_get_4() {
        Memory memory = new Memory();
        memory.arrays.add(new MemoryArray(new short[] { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 }));
        memory.arrays.add(new MemoryArray(new short[] { 11, 12, 13, 14, 15, 16, 17, 18, 19, 20 }));
        memory.arrays.add(new MemoryArray(new short[] { 21, 22, 23, 24, 25, 26, 27, 28, 29, 30 }));
        memory.arrays.add(new MemoryArray(new short[] { 31, 32, 33, 34, 35, 36, 37, 38, 39, 40 }));
        assertEquals(1, memory.get(0));
        assertEquals(2, memory.get(1));
        assertEquals(3, memory.get(2));
        assertEquals(4, memory.get(3));
        assertEquals(5, memory.get(4));
        assertEquals(6, memory.get(5));
        assertEquals(7, memory.get(6));
        assertEquals(8, memory.get(7));
        assertEquals(9, memory.get(8));
        assertEquals(10, memory.get(9));
        assertEquals(11, memory.get(10));
        assertEquals(12, memory.get(11));
        assertEquals(13, memory.get(12));
        assertEquals(14, memory.get(13));
        assertEquals(15, memory.get(14));
        assertEquals(16, memory.get(15));
        assertEquals(17, memory.get(16));
        assertEquals(18, memory.get(17));
        assertEquals(19, memory.get(18));
        assertEquals(20, memory.get(19));
        assertEquals(21, memory.get(20));
        assertEquals(22, memory.get(21));
        assertEquals(23, memory.get(22));
        assertEquals(24, memory.get(23));
        assertEquals(25, memory.get(24));
        assertEquals(26, memory.get(25));
        assertEquals(27, memory.get(26));
        assertEquals(28, memory.get(27));
        assertEquals(29, memory.get(28));
        assertEquals(30, memory.get(29));
        assertEquals(31, memory.get(30));
        assertEquals(32, memory.get(31));
        assertEquals(33, memory.get(32));
        assertEquals(34, memory.get(33));
        assertEquals(35, memory.get(34));
        assertEquals(36, memory.get(35));
        assertEquals(37, memory.get(36));
        assertEquals(38, memory.get(37));
        assertEquals(39, memory.get(38));
        assertEquals(40, memory.get(39));
    }

    /**
    * Test case for the {@link Memory#get(int)} method.
    * It tests the case where the address is within the fifth array.
    */
    @