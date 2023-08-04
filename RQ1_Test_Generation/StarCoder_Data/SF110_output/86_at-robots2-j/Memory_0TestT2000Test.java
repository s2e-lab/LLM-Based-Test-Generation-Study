// Memory_0Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains ten unit test cases for the {@link Memory#size()} method.
*/
class Memory_0Test {

    private final Memory memory = new Memory();

    @Test
    void size_0() {
        assertEquals(0, memory.size());
    }

    @Test
    void size_1() {
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(1, memory.size());
    }

    @Test
    void size_2() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(2, memory.size());
    }

    @Test
    void size_3() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(3, memory.size());
    }

    @Test
    void size_4() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(4, memory.size());
    }

    @Test
    void size_5() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(5, memory.size());
    }

    @Test
    void size_6() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(6, memory.size());
    }

    @Test
    void size_7() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(7, memory.size());
    }

    @Test
    void size_8() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(8, memory.size());
    }

    @Test
    void size_9() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(9, memory.size());
    }

    @Test
    void size_10() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(10, memory.size());
    }
}

// Memory_1Test.java
package net.virtualinfinity.atrobots.computer;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Memory}.
* It contains ten unit test cases for the {@link Memory#size()} method.
*/
class Memory_1Test {
		
    private final Memory memory = new Memory();

    @Test
    void size_0() {
        assertEquals(0, memory.size());
    }

    @Test
    void size_1() {
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(1, memory.size());
    }

    @Test
    void size_2() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(2, memory.size());
    }

    @Test
    void size_3() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(3, memory.size());
    }

    @Test
    void size_4() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(4, memory.size());
    }

    @Test
    void size_5() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(5, memory.size());
    }

    @Test
    void size_6() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(6, memory.size());
    }

    @Test
    void size_7() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(7, memory.size());
    }

    @Test
    void size_8() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(8, memory.size());
    }

    @Test
    void size_9() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        assertEquals(9, memory.size());
    }

    @Test
    void size_10() {
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray(new MemoryArray(1));
        memory.addMemoryArray