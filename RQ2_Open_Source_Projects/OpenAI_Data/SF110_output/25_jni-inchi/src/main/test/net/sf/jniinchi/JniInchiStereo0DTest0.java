// JniInchiStereo0DTest0.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewTetrahedralStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0DTest0 {

	@Test
	void testCreateNewTetrahedralStereo0D0() throws Exception {
		JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		JniInchiAtom at3 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		INCHI_PARITY parity = INCHI_PARITY.EVEN;
		JniInchiStereo0D result = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, parity);
		assertNotNull(result);
		assertEquals(0.0, result.getCentralAtom().getX());
		assertEquals(0.0, result.getCentralAtom().getY());
		assertEquals(0.0, result.getCentralAtom().getZ());
		assertEquals("C", result.getCentralAtom().getElementType());
		assertEquals(0.0, result.getNeighbor(0).getX());
		assertEquals(0.0, result.getNeighbor(0).getY());
		assertEquals(0.0, result.getNeighbor(0).getZ());
		assertEquals("C", result.getNeighbor(0).getElementType());
		assertEquals(0.0, result.getNeighbor(1).getX());
		assertEquals(0.0, result.getNeighbor(1).getY());
		assertEquals(0.0, result.getNeighbor(1).getZ());
		assertEquals("C", result.getNeighbor(1).getElementType());
		assertEquals(0.0, result.getNeighbor(2).getX());
		assertEquals(0.0, result.getNeighbor(2).getY());
		assertEquals(0.0, result.getNeighbor(2).getZ());
		assertEquals("C", result.getNeighbor(2).getElementType());
		assertEquals(0.0, result.getNeighbor(3).getX());
		assertEquals(0.0, result.getNeighbor(3).getY());
		assertEquals(0.0, result.getNeighbor(3).getZ());
		assertEquals("C", result.getNeighbor(3).getElementType());
		assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, result.getStereoType());
		assertEquals(INCHI_PARITY.EVEN, result.getParity());
		assertEquals(INCHI_PARITY.NONE, result.getDisconnectedParity());
	}

	@Test
	void testCreateNewTetrahedralStereo0D1() throws Exception {
		JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		JniInchiAtom at3 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		INCHI_PARITY parity = INCHI_PARITY.ODD;
		JniInchiStereo0D result = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, parity);
		assertNotNull(result);
		assertEquals(0.0, result.getCentralAtom().getX());
		assertEquals(0.0, result.getCentralAtom().getY());
		assertEquals(0.0, result.getCentralAtom().getZ());
		assertEquals("C", result.getCentralAtom().getElementType());
		assertEquals(0.0, result.getNeighbor(0).getX());
		assertEquals(0.0, result.getNeighbor(0).getY());
		assertEquals(0.0, result.getNeighbor(0).getZ());
		assertEquals("C", result.getNeighbor(0).getElementType());
		assertEquals(0.0, result.getNeighbor(1).getX());
		assertEquals(0.0, result.getNeighbor(1).getY());
		assertEquals(0.0, result.getNeighbor(1).getZ());
		assertEquals("C", result.getNeighbor(1).getElementType());
		assertEquals(0.0, result.getNeighbor(2).getX());
		assertEquals(0.0, result.getNeighbor(2).getY());
		assertEquals(0.0, result.getNeighbor(2).getZ());
		assertEquals("C", result.getNeighbor(2).getElementType());
		assertEquals(0.0, result.getNeighbor(3).getX());
		assertEquals(0.0, result.getNeighbor(3).getY());
		assertEquals(0.0, result.getNeighbor(3).getZ());
		assertEquals("C", result.getNeighbor(3).getElementType());
		assertEquals(INCHI_STEREOTYPE.TETRAHEDRAL, result.getStereoType());
		assertEquals(INCHI_PARITY.ODD, result.getParity());
		assertEquals(INCHI_PARITY.NONE, result.getDisconnectedParity());
	}

	@Test
	void testCreateNewTetrahedralStereo0D2() throws Exception {
		JniInchiAtom atC = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		JniInchiAtom at3 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
		INCHI_PARITY parity = INCHI_PARITY.UNKNOWN;
		JniInchiStereo0D result = JniInchiStereo0D.createNewTetrahedralStereo0D(atC, at0, at1, at2, at3, parity);
		assertNotNull(result);
		assertEquals(0.0, result.getCentralAtom().getX());
		assertEquals(0.0, result.getCentralAtom().getY());
		assertEquals(0.0, result.getCentralAtom().getZ());
		assertEquals("C", result.getCentralAtom().getElementType());
		assertEquals(0.0, result.getNeighbor(0).getX());
		assertEquals(0.0, result.getNeighbor(0).getY());
		assertEquals(0.0, result.getNeighbor(0).getZ());
		assertEquals("C", result.getNeighbor(0).getElementType());
		