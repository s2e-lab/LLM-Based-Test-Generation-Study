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
		* Test case for {@link Memory#get(int)}
		*
		* @see Memory#get(int)
		*/
		@Test
		void testGet() {
				Memory memory = new Memory();
				memory.addMemoryArray(new MemoryArray(new short[] {0, 1, 2, 3, 4, 5, 6, 7, 8, 9}));
				assertEquals(0, memory.get(0));
				assertEquals(1, memory.get(1));
				assertEquals(2, memory.get(2));
				assertEquals(3, memory.get(3));
				assertEquals(4, memory.get(4));
				assertEquals(5, memory.get(5));
				assertEquals(6, memory.get(6));
				assertEquals(7, memory.get(7));
				assertEquals(8, memory.get(8));
				assertEquals(9, memory.get(9));
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
     * @param memory the memory.
     */
    public MemoryArray(short[] memory) {
        this.memory = memory;
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

    public void increment(int address) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return;
        }
        memory[address]++;
    }

    public void decrement(int address) {
        if (address < 0 || address >= memory.length) {
            errorHandler.memoryBoundsError(address);
            return;
        }
        memory[address]--;
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

    /**
     * Create a new memory cell.
     *
     * @param memory the memory.
     * @param index  the index.
     */
    public MemoryCell(Memory memory, int index) {
        this.memory = memory;
        this.index = index;
    }

    /**
     * Get the value of this memory cell.
     *
     * @return the value.
     */
    public short get() {
        return memory.get(index);
    }

    /**
     * Set the value of this memory cell.
     *
     * @param value the value.
     */
    public void set(short value) {
        memory.set(index, value);
    }

    /**
     * Increment the value of this memory cell.
     */
    public void increment() {
        memory.increment(index);
    }

    /**
     * Decrement the value of this memory cell.
     */
    public void decrement() {
        memory.decrement(index);
    }

    /**
     * Bitwise-or the value of this memory cell with the given value.
     *
     * @param value the value to or.
     */
    public void or(short value) {
        memory.or(index, value);
    }

    /**
     * Bitwise-and the value of this memory cell with the given value.
     *
     * @param value the value to or.
     */
    public void and(short value) {
        memory.and(index, value);
    }
}

// ComputerErrorHandler.java
package net.virtualinfinity.atrobots.computer;

/**
 * Handles errors in the computer.
 *
 * @author Daniel Pitts
 */
public interface ComputerErrorHandler {
    /**
     * Called when a memory bounds error occurs.
     *
     * @param address the address which was out of bounds.
     */
    void memoryBoundsError(int address);
}

// Computer.java
package net.virtualinfinity.atrobots.computer;

/**
 * Represents a computer.
 *
 * @author Daniel Pitts
 */
public class Computer {
    private final Memory memory;
    private final Registers registers;
    private final InterruptQueue interruptQueue;
    private final InterruptHandler interruptHandler;
    private final ComputerErrorHandler errorHandler;

    /**
     * Create a new computer.
     *
     * @param memory          the memory.
     * @param registers       the registers.
     * @param interruptQueue  the interrupt queue.
     * @param interruptHandler the interrupt handler.
     * @param errorHandler    the error handler.
     */
    public Computer(Memory memory, Registers registers, InterruptQueue interruptQueue, InterruptHandler interruptHandler, ComputerErrorHandler errorHandler) {
        this.memory = memory;
        this.registers = registers;
        this.interruptQueue = interruptQueue;
        this.interruptHandler = interruptHandler;
        this.errorHandler = errorHandler;
    }

    /**
     * Get the memory of this computer.
     *
     * @return the memory.
     */
    public Memory getMemory() {
        return memory;
    }

    /**
     * Get the registers of this computer.
     *
     * @return the registers.
     */
    public Registers getRegisters() {
        return registers;
    }

    /**
     * Get the interrupt queue of this computer.
     *
     * @return the interrupt queue.
     */
    public InterruptQueue getInterruptQueue() {
        return interruptQueue;
    }

    /**
     * Get the interrupt handler of this computer.
     *
     * @return the interrupt handler.
     */
    public InterruptHandler getInterruptHandler() {
        return interruptHandler;
    }

    /**
     * Get the error handler of this computer.
     *
     * @return the error handler.
     */
    public ComputerErrorHandler getErrorHandler() {
        return errorHandler;
    }
}

// Registers.java
package net.virtualinfinity.atrobots.computer;

/**
 * Represents the registers of a {@link net.virtualinfinity.atrobots.computer.Computer}.
 *
 * @author Daniel Pitts
 */
public class Registers {
    private short a;
    private short b;
    private short c;
    private short d;
    private short e;
    private short f;
    private short g;
    private short h;
    private short i;
    private short j;
    private short k;
    private short l;
    private short m;
    private short n;
    private short o;
    private short p;
    private short q;
    private short r;
    private short s;
    private short t;
    private short u;
    private short v;
    private short w;
    private short x;
    private short y;
    private short z;
    private short i0;
    private short i1;
    private short i2;
    private short i3;
    private short i4;
    private short i5;
    private short i6;
    private short i7;
    private short i8;
    private short i9;
    private short i10;
    private short i11;
    private short i12;
    private short i13;
    private short i14;
    private short i15;
    private short i16;
    private short i17;
    private short i18;
    private short i19;
    private short i20;
    private short i21;
    private short i22;
    private short i23;
    private short i24;
    private short i25;
    private short i26;
    private short i27;
    private short i28;
    private short i29;
    private short i30;
    private short i31;
    private short i32;
    private short i33;
    private short i34;
    private short i35;
    private short i36;
    private short i37;
    private short i38;
    private short i39;
    private short i40;
    private short i41;
    private short i42;
    private short i43;
    private short i44;
    private short i45;
    private short i46;
    private short i47;
    private short i48;
    private short i49;
    private short i50;
    private short i51;
    private short i52;
    private short i53;
    private short i54;
    private short i55;
    private short i56;
    private short i57;
    private short i58;
    private short i59;
    private short i60;
    private short i61;
    private short i62;
    private short i63;
    private short i64;
    private short i65;
    private short i66;
    private short i67;
    private short i68;
    private short i69;
    private short i70;
    private short i71;
    private short i72;
    private short i73;
    private short i74;
    private short i75;
    private short i76;
    private short i77;
    private short i78;
    private short i79;
    private short i80;
    private short i81;
    private short i82;
    private short i83;
    private short i84;
    private short i85;
    private short i86;
    private short i87;
    private short i88;
    private short i89;
    private short i90;
    private short i91;
    private short i92;
    private short i93;
    private short i94;
    private short i95;
    private short i96;
    private short i97;
    private short i98;
    private short i99;
    private short i100;
    private short i101;
    private short i102;
    private short i103;
    private short i104;
    private short i105;
    private short i106;
    private short i107;
    private short i108;
    private short i109;
    private short i110;
    private short i111;
    private short i112;
    private short i113;
    private short i114;
    private short i115;
    private short i116;
    private short i117;
    private short i118;
    private short i119;
    private short i120;
    private short i121;
    private short i122;
    private short i123;
    private short i124;
    private short i125;
    private short i126;
    private short i127;
    private short i128;
    private short i129;
    private short i130;
    private short i131;
    private short i132;
    private short i133;
    private short i134;
    private short i135;
    private short i136;
    private short i137;
    private short i138;
    private short i139;
    private short i140;
    private short i141;
    private short i142;
    private short i143;
    private short i144;
    private short i145;
    private short i146;
    private short i147;
    private short i148;
    private short i149;
    private short i150;
    private short i151;
    private short i152;
    private short i153;
    private short i154;
    private short i155;
    private short i156;
    private short i157;
    private short i158;
    private short i159;
    private short i160;
    private short i161;
    private short i162;
    private short i163;
    private short i164;
    private short i165;
    private short i166;
    private short i167;
    private short i168;
    private short i169;
    private short i170;
    private short i171;
    private short i172;
    private short i173;
    private short i174;
    private short i175;
    private short i176;
    private short i177;
    private short i178;
    private short i179;
    private short i180;
    private short i181;
    private short i182;
    private short i183;
    private short i184;
    private short i185;
    private short i186;
    private short i187;
    private short i188;
    private short i189;
    private short i190;
    private short i191;
    private short i192;
    private short i193;
    private short i194;
    private short i195;
    private short i196;
    private short i197;
    private short i198;
    private short i199;
    private short i200;
    private short i201;
    private short i202;
    private short i203;
    private short i204;
    private short i205;
    private short i206;
    private short i207;
    private short i208;
    private short i209;
    private short i210;
    private short i211;
    private short i212;
    private short i213;
    private short i214;
    private short i215;
    private short i216;
    private short i217;
    private short i218;
    private short i219;
    private short i220;
    private short i221;
    private short i222;
    private short i223;
    private short i224;
    private short i225;
    private short i226;
    private short i227;
    private short i228;
    private short i229;
    private short i230;
    private short i231;
    private short i232;
    private short i233;
    private short i234;
    private short i235;
    private short i236;
    private short i237;
    private short i238;
    private short i239;
    private short i240;
    private short i241;
    private short i242;
    private short i243;
    private short i244;
    private short i245;
    private short i246;
    private short i247;
    private short i248;
    private short i249;
    private short i250;
    private short i251;
   