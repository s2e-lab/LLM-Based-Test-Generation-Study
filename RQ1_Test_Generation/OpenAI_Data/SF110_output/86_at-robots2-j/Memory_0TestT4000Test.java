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

		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_0() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(0));
				assertEquals(0, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_1() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				assertEquals(1, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_2() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(2));
				assertEquals(2, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_3() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(3));
				assertEquals(3, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_4() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(4));
				assertEquals(4, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_5() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(5));
				assertEquals(5, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_6() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(6));
				assertEquals(6, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_7() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(7));
				assertEquals(7, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_8() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(8));
				assertEquals(8, memory.size());
		}
		
		/**
		* Test case for the {@link Memory#size()} method.
		*/
		@Test
		void testSize_9() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(9));
				assertEquals(9, memory.size());
		}
		
}

// MemoryArray.java
package net.virtualinfinity.atrobots.computer;

/**
 * A section of memory.
 *
 * @author Daniel Pitts
 */
public class MemoryArray {
    private final short[] memory;
    private ComputerErrorHandler errorHandler;

    /**
     * Create a new section of memory.
     *
     * @param size the size of the memory.
     */
    public MemoryArray(int size) {
        memory = new short[size];
    }

    /**
     * Get the size of this memory section.
     *
     * @return the size.
     */
    public int size() {
        return memory.length;
    }

    /**
     * Read the value at the specific address
     *
     * @param address the address to read.
     * @return the value at that address, or 0 if invalid.
     */
    public short get(int address) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return 0;
        }
        return memory[address];
    }

    /**
     * writes the value at the specific address
     *
     * @param address the address to write.
     * @param value   the value to write at that address.
     */
    public void put(int address, short value) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return;
        }
        memory[address] = value;
    }

    /**
     * Bitwise-or the value at the given location with the given value.
     *
     * @param address the address
     * @param value   the value to or.
     */
    public void or(int address, short value) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return;
        }
        memory[address] |= value;
    }

    /**
     * Bitwise-and the value at the given location with the given value.
     *
     * @param address the address
     * @param value   the value to or.
     */
    public void and(int address, short value) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return;
        }
        memory[address] &= value;
    }

    public void setErrorHandler(ComputerErrorHandler errorHandler) {
        this.errorHandler = errorHandler;
    }

    public void decrement(int address) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return;
        }
        memory[address]--;
    }

    public void increment(int address) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return;
        }
        memory[address]++;
    }
}

// MemoryCell.java
package net.virtualinfinity.atrobots.computer;

/**
 * A memory cell.
 *
 * @author Daniel Pitts
 */
public class MemoryCell {
    private final Memory memory;
    private final int index;

    public MemoryCell(Memory memory, int index) {
        this.memory = memory;
        this.index = index;
    }

    public short get() {
        return memory.get(index);
    }

    public void set(short value) {
        memory.set(index, value);
    }

    public void or(short value) {
        memory.or(index, value);
    }

    public void and(short value) {
        memory.and(index, value);
    }

    public void increment() {
        memory.increment(index);
    }

    public void decrement() {
        memory.decrement(index);
    }
}

// ComputerErrorHandler.java
package net.virtualinfinity.atrobots.computer;

/**
 * @author Daniel Pitts
 */
public interface ComputerErrorHandler {
    void memoryBoundsError(int address);
}

// Computer.java
package net.virtualinfinity.atrobots.computer;

/**
 * @author Daniel Pitts
 */
public class Computer {
    private final Memory memory;
    private final ComputerErrorHandler errorHandler;

    public Computer(Memory memory, ComputerErrorHandler errorHandler) {
        this.memory = memory;
        this.errorHandler = errorHandler;
    }

    public void or(int address, short value) {
        memory.or(address, value);
    }

    public void and(int address, short value) {
        memory.and(address, value);
    }

    public void set(int address, short value) {
        memory.set(address, value);
    }

    public short get(int address) {
        return memory.get(address);
    }

    public int unsigned(int index) {
        return memory.unsigned(index);
    }

    public MemoryCell getCell(int index) {
        return memory.getCell(index);
    }

    public void increment(int address) {
        memory.increment(address);
    }

    public void decrement(int address) {
        memory.decrement(address);
    }
}

// Computer_0Test.java
package net.virtualinfinity.atrobots.computer;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Computer}.
* It contains ten unit test cases for the {@link Computer#get(int)} method.
*/
class Computer_0Test {
		
		/**
		* Test case for the {@link Computer#get(int)} method.
		*/
		@Test
		void testGet_0() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				Computer computer = new Computer(memory, new ComputerErrorHandler() {
						@Override
						public void memoryBoundsError(int address) {
								fail("memoryBoundsError");
						}
				});
				computer.set(0, (short) 0);
				assertEquals(0, computer.get(0));
		}
		
		/**
		* Test case for the {@link Computer#get(int)} method.
		*/
		@Test
		void testGet_1() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				Computer computer = new Computer(memory, new ComputerErrorHandler() {
						@Override
						public void memoryBoundsError(int address) {
								fail("memoryBoundsError");
						}
				});
				computer.set(0, (short) 1);
				assertEquals(1, computer.get(0));
		}
		
		/**
		* Test case for the {@link Computer#get(int)} method.
		*/
		@Test
		void testGet_2() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				Computer computer = new Computer(memory, new ComputerErrorHandler() {
						@Override
						public void memoryBoundsError(int address) {
								fail("memoryBoundsError");
						}
				});
				computer.set(0, (short) 2);
				assertEquals(2, computer.get(0));
		}
		
		/**
		* Test case for the {@link Computer#get(int)} method.
		*/
		@Test
		void testGet_3() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				Computer computer = new Computer(memory, new ComputerErrorHandler() {
						@Override
						public void memoryBoundsError(int address) {
								fail("memoryBoundsError");
						}
				});
				computer.set(0, (short) 3);
				assertEquals(3, computer.get(0));
		}
		
		/**
		* Test case for the {@link Computer#get(int)} method.
		*/
		@Test
		void testGet_4() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				Computer computer = new Computer(memory, new ComputerErrorHandler() {
						@Override
						public void memoryBoundsError(int address) {
								fail("memoryBoundsError");
						}
				});
				computer.set(0, (short) 4);
				assertEquals(4, computer.get(0));
		}
		
		/**
		* Test case for the {@link Computer#get(int)} method.
		*/
		@Test
		void testGet_5() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				Computer computer = new Computer(memory, new ComputerErrorHandler() {
						@Override
						public void memoryBoundsError(int address) {
								fail("memoryBoundsError");
						}
				});
				computer.set(0, (short) 5);
				assertEquals(5, computer.get(0));
		}
		
		/**
		* Test case for the {@link Computer#get(int)} method.
		*/
		@Test
		void testGet_6() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				Computer computer = new Computer(memory, new ComputerErrorHandler() {
						@Override
						public void memoryBoundsError(int address) {
								fail("memoryBoundsError");
						}
				});
				computer.set(0, (short) 6);
				assertEquals(6, computer.get(0));
		}
		
		/**
		* Test case for the {@link Computer#get(int)} method.
		*/
		@Test
		void testGet_7() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				Computer computer = new Computer(memory, new ComputerErrorHandler() {
						@Override
						public void memoryBoundsError(int address) {
								fail("memoryBoundsError");
						}
				});
				computer.set(0, (short) 7);
				assertEquals(7, computer.get(0));
		}
		
		/**
		* Test case for the {@link Computer#get(int)} method.
		*/
		@Test
		void testGet_8() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(1));
				Computer computer = new Computer(memory, new ComputerErrorHandler() {
						@Override
						public void memoryBoundsError(int address) {
								fail("memoryBoundsError");
						}
				});
				computer.set(0, (short) 8);
				assertEquals(8, computer.get(0));
		}
		
		/**
		* Test case for the {@link Computer#get(int)} method.
		*/
