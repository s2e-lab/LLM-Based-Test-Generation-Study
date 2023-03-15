// ByteVector_4Test.java
package org.objectweb.asm.jip;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ByteVector}.
* It contains ten unit test cases for the {@link ByteVector#putUTF8(String)} method.
*/
class ByteVector_4Test {

	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 0.
	 */
	@Test
	void testPutUTF8_0() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("");
		assertEquals(2, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(0, bv.data[1]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 1.
	 */
	@Test
	void testPutUTF8_1() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("a");
		assertEquals(3, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(1, bv.data[1]);
		assertEquals(97, bv.data[2]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 2.
	 */
	@Test
	void testPutUTF8_2() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("ab");
		assertEquals(4, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(2, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 3.
	 */
	@Test
	void testPutUTF8_3() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abc");
		assertEquals(5, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(3, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 4.
	 */
	@Test
	void testPutUTF8_4() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abcd");
		assertEquals(6, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(4, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
		assertEquals(100, bv.data[5]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 5.
	 */
	@Test
	void testPutUTF8_5() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abcde");
		assertEquals(7, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(5, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
		assertEquals(100, bv.data[5]);
		assertEquals(101, bv.data[6]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 6.
	 */
	@Test
	void testPutUTF8_6() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abcdef");
		assertEquals(8, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(6, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
		assertEquals(100, bv.data[5]);
		assertEquals(101, bv.data[6]);
		assertEquals(102, bv.data[7]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 7.
	 */
	@Test
	void testPutUTF8_7() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abcdefg");
		assertEquals(9, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(7, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
		assertEquals(100, bv.data[5]);
		assertEquals(101, bv.data[6]);
		assertEquals(102, bv.data[7]);
		assertEquals(103, bv.data[8]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 8.
	 */
	@Test
	void testPutUTF8_8() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abcdefgh");
		assertEquals(10, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(8, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
		assertEquals(100, bv.data[5]);
		assertEquals(101, bv.data[6]);
		assertEquals(102, bv.data[7]);
		assertEquals(103, bv.data[8]);
		assertEquals(104, bv.data[9]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 9.
	 */
	@Test
	void testPutUTF8_9() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abcdefghi");
		assertEquals(11, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(9, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
		assertEquals(100, bv.data[5]);
		assertEquals(101, bv.data[6]);
		assertEquals(102, bv.data[7]);
		assertEquals(103, bv.data[8]);
		assertEquals(104, bv.data[9]);
		assertEquals(105, bv.data[10]);
	}
	
	/**
	 * Test case for {@link ByteVector#putUTF8(String)}
	 * <p>
	 * Test method for {@link ByteVector#putUTF8(String)}.
	 * <p>
	 * Test case for a string with a length of 10.
	 */
	@Test
	void testPutUTF8_10() {
		ByteVector bv = new ByteVector();
		bv.putUTF8("abcdefghij");
		assertEquals(12, bv.length);
		assertEquals(0, bv.data[0]);
		assertEquals(10, bv.data[1]);
		assertEquals(97, bv.data[2]);
		assertEquals(98, bv.data[3]);
		assertEquals(99, bv.data[4]);
		assertEquals(100, bv.data[5]);
		assertEquals(101, bv.data[6]);
		assertEquals(102, bv.data[7]);
		assertEquals(103, bv.data[8]);
		assertEquals(104, bv.data[9]);
		assertEquals(105, bv.data[10]);
		assertEquals(106, bv.data[11]);
	}
}

// ClassReader.java
/**
 * ASM: a very small and fast Java bytecode manipulation framework
 * Copyright (c) 2000-2007 INRIA, France Telecom
 * All rights reserved.
 *
 * Redistribution and use in source and binary forms, with or without
 * modification, are permitted provided that the following conditions
 * are met:
 * 1. Redistributions of source code must retain the above copyright
 *    notice, this list of conditions and the following disclaimer.
 * 2. Redistributions in binary form must reproduce the above copyright
 *    notice, this list of conditions and the following disclaimer in the
 *    documentation and/or other materials provided with the distribution.
 * 3. Neither the name of the copyright holders nor the names of its
 *    contributors may be used to endorse or promote products derived from
 *    this software without specific prior written permission.
 *
 * THIS SOFTWARE IS PROVIDED BY THE COPYRIGHT HOLDERS AND CONTRIBUTORS "AS IS"
 * AND ANY EXPRESS OR IMPLIED WARRANTIES, INCLUDING, BUT NOT LIMITED TO, THE
 * IMPLIED WARRANTIES OF MERCHANTABILITY AND FITNESS FOR A PARTICULAR PURPOSE
 * ARE DISCLAIMED. IN NO EVENT SHALL THE COPYRIGHT OWNER OR CONTRIBUTORS BE
 * LIABLE FOR ANY DIRECT, INDIRECT, INCIDENTAL, SPECIAL, EXEMPLARY, OR
 * CONSEQUENTIAL DAMAGES (INCLUDING, BUT NOT LIMITED TO, PROCUREMENT OF
 * SUBSTITUTE GOODS OR SERVICES; LOSS OF USE, DATA, OR PROFITS; OR BUSINESS
 * INTERRUPTION) HOWEVER CAUSED AND ON ANY THEORY OF LIABILITY, WHETHER IN
 * CONTRACT, STRICT LIABILITY, OR TORT (INCLUDING NEGLIGENCE OR OTHERWISE)
 * ARISING IN ANY WAY OUT OF THE USE OF THIS SOFTWARE, EVEN IF ADVISED OF
 * THE POSSIBILITY OF SUCH DAMAGE.
 */
package org.objectweb.asm.jip;

import java.io.IOException;
import java.io.InputStream;

/**
 * A Java class parser to make a {@link ClassVisitor} visit an existing class.
 * This class parses a byte array conforming to the Java class file format and
 * calls the appropriate visit methods of a given class visitor for each field,
 * method and bytecode instruction encountered.
 *
 * @author Eric Bruneton
 */
public class ClassReader {

    /**
     * The class to be parsed. <i>The content of this array must not be
     * modified. This field is intended for {@link Attribute} sub classes, and
     * is normally not needed by class generators or adapters.</i>
     */
    public final byte[] b;

    /**
     * The start index of each constant pool item in {@link #b b}, plus one. The
     * one byte offset skips the constant pool item tag that indicates its type.
     */
    private final int[] items;

    /**
     * The String objects corresponding to the CONSTANT_Utf8 items. This cache
     * avoids multiple parsing of a given CONSTANT_Utf8 constant pool item,
     * which GREATLY improves performances (by a factor 2 to 3). This caching
     * strategy could be extended to all constant pool items, but its benefit
     * would not be so great for these items (because they are much less
     * expensive to parse than CONSTANT_Utf8 items).
     */
    private final String[] strings;

    /**
     * Maximum length of the strings contained in the constant pool of the
     * class.
     */
    private final int maxStringLength;

    /**
     * Start index of the class header information (access, name...) in
     * {@link #b b}.
     */
    public final int header;

    // ------------------------------------------------------------------------
    // Constructors
    // ------------------------------------------------------------------------

    /**
     * Constructs a new {@link ClassReader} object.
     *
     * @param b the bytecode of the class to be read.
     */
    public ClassReader(final byte[] b) {
        this(b, 0, b.length);
    }

    /**
     * Constructs a new {@link ClassReader} object.
     *
     * @param b the bytecode of the class to be read.
     * @param off the start offset of the class data.
     * @param len the length of the class data.
     */
    public ClassReader(final byte[] b, final int off, final int len) {
        this.b = b;
        // parses the constant pool
        items = new int[readUnsignedShort(off + 8)];
        int n = items.length;
        strings = new String[n];
        int max = 0;
        int index = off + 10;
        for (int i = 1; i < n; ++i) {
            items[i] = index + 1;
            int size;
            switch (b[index]) {
                case ClassWriter.FIELD:
                case ClassWriter.METH:
                case ClassWriter.IMETH:
                case ClassWriter.INT:
                case ClassWriter.FLOAT:
                case ClassWriter.NAME_TYPE:
                case ClassWriter.INDY:
                    size = 5;
                    break;
                case ClassWriter.LONG:
                case ClassWriter.DOUBLE:
                    size = 9;
                    ++i;
                    break;
                case ClassWriter.UTF8:
                    size = 3 + readUnsignedShort(index + 1);
                    if (size > max) {
                        max = size;
                    }
                    break;
                // case ClassWriter.HANDLE_BASE + [1..9]:
                default:
                    size = 4;
                    break;
            }
            index += size;
       