// JniInchiStereo0DTest1.java
package net.sf.jniinchi;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStereo0D}.
* It contains ten unit test cases for the {@link JniInchiStereo0D#createNewDoublebondStereo0D(JniInchiAtom, JniInchiAtom, JniInchiAtom, JniInchiAtom, INCHI_PARITY)} method.
*/
class JniInchiStereo0DTest1 {

		@Test
		void testCreateNewDoublebondStereo0D() {
				JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at3 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.EVEN);
				assertEquals(stereo.getNeighbor(0), at0);
				assertEquals(stereo.getNeighbor(1), at1);
				assertEquals(stereo.getNeighbor(2), at2);
				assertEquals(stereo.getNeighbor(3), at3);
				assertEquals(stereo.getStereoType(), INCHI_STEREOTYPE.DOUBLEBOND);
				assertEquals(stereo.getParity(), INCHI_PARITY.EVEN);
		}
		
		@Test
		void testCreateNewDoublebondStereo0D1() {
				JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at3 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.ODD);
				assertEquals(stereo.getNeighbor(0), at0);
				assertEquals(stereo.getNeighbor(1), at1);
				assertEquals(stereo.getNeighbor(2), at2);
				assertEquals(stereo.getNeighbor(3), at3);
				assertEquals(stereo.getStereoType(), INCHI_STEREOTYPE.DOUBLEBOND);
				assertEquals(stereo.getParity(), INCHI_PARITY.ODD);
		}
		
		@Test
		void testCreateNewDoublebondStereo0D2() {
				JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at3 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.UNKNOWN);
				assertEquals(stereo.getNeighbor(0), at0);
				assertEquals(stereo.getNeighbor(1), at1);
				assertEquals(stereo.getNeighbor(2), at2);
				assertEquals(stereo.getNeighbor(3), at3);
				assertEquals(stereo.getStereoType(), INCHI_STEREOTYPE.DOUBLEBOND);
				assertEquals(stereo.getParity(), INCHI_PARITY.UNKNOWN);
		}
		
		@Test
		void testCreateNewDoublebondStereo0D3() {
				JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at3 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.NONE);
				assertEquals(stereo.getNeighbor(0), at0);
				assertEquals(stereo.getNeighbor(1), at1);
				assertEquals(stereo.getNeighbor(2), at2);
				assertEquals(stereo.getNeighbor(3), at3);
				assertEquals(stereo.getStereoType(), INCHI_STEREOTYPE.DOUBLEBOND);
				assertEquals(stereo.getParity(), INCHI_PARITY.NONE);
		}
		
		@Test
		void testCreateNewDoublebondStereo0D4() {
				JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at3 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiStereo0D stereo = JniInchiStereo0D.createNewDoublebondStereo0D(at0, at1, at2, at3, INCHI_PARITY.UNSPECIFIED);
				assertEquals(stereo.getNeighbor(0), at0);
				assertEquals(stereo.getNeighbor(1), at1);
				assertEquals(stereo.getNeighbor(2), at2);
				assertEquals(stereo.getNeighbor(3), at3);
				assertEquals(stereo.getStereoType(), INCHI_STEREOTYPE.DOUBLEBOND);
				assertEquals(stereo.getParity(), INCHI_PARITY.UNSPECIFIED);
		}
		
		@Test
		void testCreateNewDoublebondStereo0D5() {
				JniInchiAtom at0 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at1 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom at2 = new JniInchiAtom("C", 0.0, 0.0, 0.0, "");
				JniInchiAtom