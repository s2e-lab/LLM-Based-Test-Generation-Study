// LocalVariablesSorterTest.java
package org.objectweb.asm.jip.commons;

import org.objectweb.asm.jip.Label;
import org.objectweb.asm.jip.MethodAdapter;
import org.objectweb.asm.jip.MethodVisitor;
import org.objectweb.asm.jip.Opcodes;
import org.objectweb.asm.jip.Type;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link LocalVariablesSorter}.
* It contains ten unit test cases for the {@link LocalVariablesSorter#newLocal(Type)} method.
*/
class LocalVariablesSorterTest {

	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type int.
	 */
	@Test
	void testNewLocalInt() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.ILOAD, opcode);
				assertEquals(0, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_STATIC, "()V", mv);
		int local = lvs.newLocal(Type.INT_TYPE);
		assertEquals(0, local);
		lvs.visitVarInsn(Opcodes.ILOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type long.
	 */
	@Test
	void testNewLocalLong() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.LLOAD, opcode);
				assertEquals(0, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_STATIC, "()V", mv);
		int local = lvs.newLocal(Type.LONG_TYPE);
		assertEquals(0, local);
		lvs.visitVarInsn(Opcodes.LLOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type float.
	 */
	@Test
	void testNewLocalFloat() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.FLOAD, opcode);
				assertEquals(0, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_STATIC, "()V", mv);
		int local = lvs.newLocal(Type.FLOAT_TYPE);
		assertEquals(0, local);
		lvs.visitVarInsn(Opcodes.FLOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type double.
	 */
	@Test
	void testNewLocalDouble() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.DLOAD, opcode);
				assertEquals(0, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_STATIC, "()V", mv);
		int local = lvs.newLocal(Type.DOUBLE_TYPE);
		assertEquals(0, local);
		lvs.visitVarInsn(Opcodes.DLOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type object.
	 */
	@Test
	void testNewLocalObject() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.ALOAD, opcode);
				assertEquals(0, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_STATIC, "()V", mv);
		int local = lvs.newLocal(Type.getObjectType("java/lang/Object"));
		assertEquals(0, local);
		lvs.visitVarInsn(Opcodes.ALOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type array.
	 */
	@Test
	void testNewLocalArray() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.ALOAD, opcode);
				assertEquals(0, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_STATIC, "()V", mv);
		int local = lvs.newLocal(Type.getType("[I"));
		assertEquals(0, local);
		lvs.visitVarInsn(Opcodes.ALOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type int and there are
	 * already two local variables of type long.
	 */
	@Test
	void testNewLocalIntWithLongs() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.ILOAD, opcode);
				assertEquals(4, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_STATIC, "()V", mv);
		lvs.newLocal(Type.LONG_TYPE);
		lvs.newLocal(Type.LONG_TYPE);
		int local = lvs.newLocal(Type.INT_TYPE);
		assertEquals(4, local);
		lvs.visitVarInsn(Opcodes.ILOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type int and there are
	 * already two local variables of type long and one local variable of type
	 * double.
	 */
	@Test
	void testNewLocalIntWithLongsAndDouble() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.ILOAD, opcode);
				assertEquals(6, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_STATIC, "()V", mv);
		lvs.newLocal(Type.LONG_TYPE);
		lvs.newLocal(Type.LONG_TYPE);
		lvs.newLocal(Type.DOUBLE_TYPE);
		int local = lvs.newLocal(Type.INT_TYPE);
		assertEquals(6, local);
		lvs.visitVarInsn(Opcodes.ILOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type int and there are
	 * already two local variables of type long and one local variable of type
	 * double and one local variable of type float.
	 */
	@Test
	void testNewLocal