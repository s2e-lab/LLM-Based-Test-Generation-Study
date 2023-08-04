// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains ten unit test cases for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {

    @Test
    void testCreateProgramMemory() {
        final Program program = new Program(new short[] { 0x0000, 0x0001, 0x0002, 0x0003, 0x0004, 0x0005, 0x0006, 0x0007, 0x0008, 0x0009 });
        final MemoryArray memoryArray = program.createProgramMemory();
        assertEquals(10, memoryArray.size());
        assertEquals(0x0000, memoryArray.read(0));
        assertEquals(0x0001, memoryArray.read(1));
        assertEquals(0x0002, memoryArray.read(2));
        assertEquals(0x0003, memoryArray.read(3));
        assertEquals(0x0004, memoryArray.read(4));
        assertEquals(0x0005, memoryArray.read(5));
        assertEquals(0x0006, memoryArray.read(6));
        assertEquals(0x0007, memoryArray.read(7));
        assertEquals(0x0008, memoryArray.read(8));
        assertEquals(0x0009, memoryArray.read(9));
    }
}
