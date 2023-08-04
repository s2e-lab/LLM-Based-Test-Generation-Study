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
        final Program program = new Program();
        final MemoryArray memoryArray = program.createProgramMemory();
        assertEquals(program.programCode.length, memoryArray.size());
        for (int i = 0; i < program.programCode.length; i++) {
            assertEquals(program.programCode[i], memoryArray.read(i));
        }
    }
}
