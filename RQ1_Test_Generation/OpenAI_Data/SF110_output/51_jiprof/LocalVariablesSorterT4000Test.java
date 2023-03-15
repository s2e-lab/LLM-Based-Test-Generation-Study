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
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_PUBLIC, "()V", mv);
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
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_PUBLIC, "()V", mv);
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
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_PUBLIC, "()V", mv);
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
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_PUBLIC, "()V", mv);
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
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_PUBLIC, "()V", mv);
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
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_PUBLIC, "()V", mv);
		int local = lvs.newLocal(Type.getType("[I"));
		assertEquals(0, local);
		lvs.visitVarInsn(Opcodes.ALOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type int and the method has a parameter.
	 */
	@Test
	void testNewLocalIntWithParameter() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.ILOAD, opcode);
				assertEquals(1, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_PUBLIC, "(I)V", mv);
		int local = lvs.newLocal(Type.INT_TYPE);
		assertEquals(1, local);
		lvs.visitVarInsn(Opcodes.ILOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type long and the method has a parameter.
	 */
	@Test
	void testNewLocalLongWithParameter() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.LLOAD, opcode);
				assertEquals(1, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_PUBLIC, "(I)V", mv);
		int local = lvs.newLocal(Type.LONG_TYPE);
		assertEquals(1, local);
		lvs.visitVarInsn(Opcodes.LLOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type float and the method has a parameter.
	 */
	@Test
	void testNewLocalFloatWithParameter() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.FLOAD, opcode);
				assertEquals(1, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_PUBLIC, "(I)V", mv);
		int local = lvs.newLocal(Type.FLOAT_TYPE);
		assertEquals(1, local);
		lvs.visitVarInsn(Opcodes.FLOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type double and the method has a parameter.
	 */
	@Test
	void testNewLocalDoubleWithParameter() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.DLOAD, opcode);
				assertEquals(1, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_PUBLIC, "(I)V", mv);
		int local = lvs.newLocal(Type.DOUBLE_TYPE);
		assertEquals(1, local);
		lvs.visitVarInsn(Opcodes.DLOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type object and the method has a parameter.
	 */
	@Test
	void testNewLocalObjectWithParameter() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.ALOAD, opcode);
				assertEquals(1, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_PUBLIC, "(I)V", mv);
		int local = lvs.newLocal(Type.getObjectType("java/lang/Object"));
		assertEquals(1, local);
		lvs.visitVarInsn(Opcodes.ALOAD, local);
	}
	
	/**
	 * Test case for {@link LocalVariablesSorter#newLocal(Type)} method.
	 * It tests the case when the local variable is of type array and the method has a parameter.
	 */
	@Test
	void testNewLocalArrayWithParameter() {
		MethodVisitor mv = new MethodAdapter(null) {
			public void visitVarInsn(int opcode, int var) {
				assertEquals(Opcodes.ALOAD, opcode);
				assertEquals(1, var);
			}
		};
		LocalVariablesSorter lvs = new LocalVariablesSorter(Opcodes.ACC_PUBLIC, "(I)V", mv);
		int local = lvs.newLocal(Type.getType("[I"));
		assertEquals(1, local);
		lvs.visitVarInsn(Opcodes.ALOAD, local);
	}
}