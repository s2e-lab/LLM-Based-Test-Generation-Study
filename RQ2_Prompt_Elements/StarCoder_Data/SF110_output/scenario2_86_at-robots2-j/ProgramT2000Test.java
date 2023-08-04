// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains ten unit test cases for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {

    /**
    * Test case for the {@link Program#createProgramMemory()} method.
    * It tests the creation of a program memory array with the program code pre-flashed.
    */
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

// Program.java
package net.virtualinfinity.atrobots.computer;

/**
 * A Program is a ROM definition.
 *
 * @author <NAME>
 */
public class Program {

    /**
     * Creates a read-only memory array with the program code pre-flashed.
     *
     * @return the memory array.
     */
    public MemoryArray createProgramMemory() {
        final ReadOnlyMemoryArray readOnlyMemoryArray = new ReadOnlyMemoryArray(programCode.length);
        readOnlyMemoryArray.flash(programCode);
        return readOnlyMemoryArray;
    }
}

// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains ten unit test cases for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		
    /**
    * Test case for the {@link Program#createProgramMemory()} method.
    * It tests the creation of a program memory array with the program code pre-flashed.
    */
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

// Program.java
package net.virtualinfinity.atrobots.computer;

/**
 * A Program is a ROM definition.
 *
 * @author <NAME>
 */
public class Program {

    /**
     * Creates a read-only memory array with the program code pre-flashed.
     *
     * @return the memory array.
     */
    public MemoryArray createProgramMemory() {
        final ReadOnlyMemoryArray readOnlyMemoryArray = new ReadOnlyMemoryArray(programCode.length);
        readOnlyMemoryArray.flash(programCode);
        return readOnlyMemoryArray;
    }
}

// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains ten unit test cases for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		
    /**
    * Test case for the {@link Program#createProgramMemory()} method.
    * It tests the creation of a program memory array with the program code pre-flashed.
    */
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

// Program.java
package net.virtualinfinity.atrobots.computer;

/**
 * A Program is a ROM definition.
 *
 * @author <NAME>
 */
public class Program {

    /**
     * Creates a read-only memory array with the program code pre-flashed.
     *
     * @return the memory array.
     */
    public MemoryArray createProgramMemory() {
        final ReadOnlyMemoryArray readOnlyMemoryArray = new ReadOnlyMemoryArray(programCode.length);
        readOnlyMemoryArray.flash(programCode);
        return readOnlyMemoryArray;
    }
}

// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains ten unit test cases for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		
    /**
    * Test case for the {@link Program#createProgramMemory()} method.
    * It tests the creation of a program memory array with the program code pre-flashed.
    */
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

// Program.java
package net.virtualinfinity.atrobots.computer;

/**
 * A Program is a ROM definition.
 *
 * @author <NAME>
 */
public class Program {

    /**
     * Creates a read-only memory array with the program code pre-flashed.
     *
     * @return the memory array.
     */
    public MemoryArray createProgramMemory() {
        final ReadOnlyMemoryArray readOnlyMemoryArray = new ReadOnlyMemoryArray(programCode.length);
        readOnlyMemoryArray.flash(programCode);
        return readOnlyMemoryArray;
    }
}

// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains ten unit test cases for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		
    /**
    * Test case for the {@link Program#createProgramMemory()} method.
    * It tests the creation of a program memory array with the program code pre-flashed.
    */
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

// Program.java
package net.virtualinfinity.atrobots.computer;

/**
 * A Program is a ROM definition.
 *
 * @author <NAME>
 */
public class Program {

    /**
     * Creates a read-only memory array with the program code pre-flashed.
     *
     * @return the memory array.
     */
    public MemoryArray createProgramMemory() {
        final ReadOnlyMemoryArray readOnlyMemoryArray = new ReadOnlyMemoryArray(programCode.length);
        readOnlyMemoryArray.flash(programCode);
        return readOnlyMemoryArray;
    }
}

// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Program}.
* It contains ten unit test cases for the {@link Program#createProgramMemory()} method.
*/
class ProgramTest {
		
    /**
    * Test case for the {@link Program#createProgramMemory()} method.
    * It tests the creation of a program memory array with the program code pre-flashed.
    */
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

// Program.java
package net.virtualinfinity.atrobots.computer;

/**
 * A Program is a ROM definition.
 *
 * @author <NAME>
 */
public class Program {

    /**
     * Creates a read-only memory array with the program code pre-flashed.
     *
     * @return the memory array.
     */
    public MemoryArray createProgramMemory() {
        final ReadOnlyMemoryArray readOnlyMemoryArray = new ReadOnlyMemoryArray(programCode.length);
        readOnlyMemoryArray.flash(programCode);
        return readOnlyMemoryArray;
    }
}

// ProgramTest.java
package net.virtualinfinity.atrobots.computer;


import org.junit.jupiter.api.Test;
