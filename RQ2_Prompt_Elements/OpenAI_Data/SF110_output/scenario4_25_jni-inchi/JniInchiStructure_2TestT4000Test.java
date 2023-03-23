// JniInchiStructure_2Test.java
package net.sf.jniinchi;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link JniInchiStructure}.
* It contains ten unit test cases for the {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
*/
class JniInchiStructure_2Test {

	/**
	 * Test case for {@link JniInchiStructure#addStereo0D(JniInchiStereo0D)} method.
	 * 
	 * @throws JniInchiException
	 */
	@Test
	void testAddStereo0D_1() throws JniInchiException {
		JniInchiAtom atom1 = new JniInchiAtom("N");
		JniInchiAtom atom2 = new JniInchiAtom("C");
		JniInchiAtom atom3 = new JniInchiAtom("C");
		JniInchiAtom atom4 = new JniInchiAtom("C");
		JniInchiAtom atom5 = new JniInchiAtom("C");
		JniInchiAtom atom6 = new JniInchiAtom("C");
		JniInchiAtom atom7 = new JniInchiAtom("C");
		JniInchiAtom atom8 = new JniInchiAtom("C");
		JniInchiAtom atom9 = new JniInchiAtom("C");
		JniInchiAtom atom10 = new JniInchiAtom("C");
		JniInchiAtom atom11 = new JniInchiAtom("C");
		JniInchiAtom atom12 = new JniInchiAtom("C");
		JniInchiAtom atom13 = new JniInchiAtom("C");
		JniInchiAtom atom14 = new JniInchiAtom("C");
		JniInchiAtom atom15 = new JniInchiAtom("C");
		JniInchiAtom atom16 = new JniInchiAtom("C");
		JniInchiAtom atom17 = new JniInchiAtom("C");
		JniInchiAtom atom18 = new JniInchiAtom("C");
		JniInchiAtom atom19 = new JniInchiAtom("C");
		JniInchiAtom atom20 = new JniInchiAtom("C");
		JniInchiAtom atom21 = new JniInchiAtom("C");
		JniInchiAtom atom22 = new JniInchiAtom("C");
		JniInchiAtom atom23 = new JniInchiAtom("C");
		JniInchiAtom atom24 = new JniInchiAtom("C");
		JniInchiAtom atom25 = new JniInchiAtom("C");
		JniInchiAtom atom26 = new JniInchiAtom("C");
		JniInchiAtom atom27 = new JniInchiAtom("C");
		JniInchiAtom atom28 = new JniInchiAtom("C");
		JniInchiAtom atom29 = new JniInchiAtom("C");
		JniInchiAtom atom30 = new JniInchiAtom("C");
		JniInchiAtom atom31 = new JniInchiAtom("C");
		JniInchiAtom atom32 = new JniInchiAtom("C");
		JniInchiAtom atom33 = new JniInchiAtom("C");
		JniInchiAtom atom34 = new JniInchiAtom("C");
		JniInchiAtom atom35 = new JniInchiAtom("C");
		JniInchiAtom atom36 = new JniInchiAtom("C");
		JniInchiAtom atom37 = new JniInchiAtom("C");
		JniInchiAtom atom38 = new JniInchiAtom("C");
		JniInchiAtom atom39 = new JniInchiAtom("C");
		JniInchiAtom atom40 = new JniInchiAtom("C");
		JniInchiAtom atom41 = new JniInchiAtom("C");
		JniInchiAtom atom42 = new JniInchiAtom("C");
		JniInchiAtom atom43 = new JniInchiAtom("C");
		JniInchiAtom atom44 = new JniInchiAtom("C");
		JniInchiAtom atom45 = new JniInchiAtom("C");
		JniInchiAtom atom46 = new JniInchiAtom("C");
		JniInchiAtom atom47 = new JniInchiAtom("C");
		JniInchiAtom atom48 = new JniInchiAtom("C");
		JniInchiAtom atom49 = new JniInchiAtom("C");
		JniInchiAtom atom50 = new JniInchiAtom("C");
		JniInchiAtom atom51 = new JniInchiAtom("C");
		JniInchiAtom atom52 = new JniInchiAtom("C");
		JniInchiAtom atom53 = new JniInchiAtom("C");
		JniInchiAtom atom54 = new JniInchiAtom("C");
		JniInchiAtom atom55 = new JniInchiAtom("C");
		JniInchiAtom atom56 = new JniInchiAtom("C");
		JniInchiAtom atom57 = new JniInchiAtom("C");
		JniInchiAtom atom58 = new JniInchiAtom("C");
		JniInchiAtom atom59 = new JniInchiAtom("C");
		JniInchiAtom atom60 = new JniInchiAtom("C");
		JniInchiAtom atom61 = new JniInchiAtom("C");
		JniInchiAtom atom62 = new JniInchiAtom("C");
		JniInchiAtom atom63 = new JniInchiAtom("C");
		JniInchiAtom atom64 = new JniInchiAtom("C");
		JniInchiAtom atom65 = new JniInchiAtom("C");
		JniInchiAtom atom66 = new JniInchiAtom("C");
		JniInchiAtom atom67 = new JniInchiAtom("C");
		JniInchiAtom atom68 = new JniInchiAtom("C");
		JniInchiAtom atom69 = new JniInchiAtom("C");
		JniInchiAtom atom70 = new JniInchiAtom("C");
		JniInchiAtom atom71 = new JniInchiAtom("C");
		JniInchiAtom atom72 = new JniInchiAtom("C");
		JniInchiAtom atom73 = new JniInchiAtom("C");
		JniInchiAtom atom74 = new JniInchiAtom("C");
		JniInchiAtom atom75 = new JniInchiAtom("C");
		JniInchiAtom atom76 = new JniInchiAtom("C");
		JniInchiAtom atom77 = new JniInchiAtom("C");
		JniInchiAtom atom78 = new JniInchiAtom("C");
		JniInchiAtom atom79 = new JniInchiAtom("C");
		JniInchiAtom atom80 = new JniInchiAtom("C");
		JniInchiAtom atom81 = new JniInchiAtom("C");
		JniInchiAtom atom82 = new JniInchiAtom("C");
		JniInchiAtom atom83 = new JniInchiAtom("C");
		JniInchiAtom atom84 = new JniInchiAtom("C");
		JniInchiAtom atom85 = new JniInchiAtom("C");
		JniInchiAtom atom86 = new JniInchiAtom("C");
		JniInchiAtom atom87 = new JniInchiAtom("C");
		JniInchiAtom atom88 = new JniInchiAtom("C");
		JniInchiAtom atom89 = new JniInchiAtom("C");
		JniInchiAtom atom90 = new JniInchiAtom("C");
		JniInchiAtom atom91 = new JniInchiAtom("C");
		JniInchiAtom atom92 = new JniInchiAtom("C");
		JniInchiAtom atom93 = new JniInchiAtom("C");
		JniInchiAtom atom94 = new JniInchiAtom("C");
		JniInchiAtom atom95 = new JniInchiAtom("C");
		JniInchiAtom atom96 = new JniInchiAtom("C");
		JniInchiAtom atom97 = new JniInchiAtom("C");
		JniInchiAtom atom98 = new JniInchiAtom("C");
		JniInchiAtom atom99 = new JniInchiAtom("C");
		JniInchiAtom atom100 = new JniInchiAtom("C");
		JniInchiAtom atom101 = new JniInchiAtom("C");
		JniInchiAtom atom102 = new JniInchiAtom("C");
		JniInchiAtom atom103 = new JniInchiAtom("C");
		JniInchiAtom atom104 = new JniInchiAtom("C");
		JniInchiAtom atom105 = new JniInchiAtom("C");
		JniInchiAtom atom106 = new JniInchiAtom("C");
		JniInchiAtom atom107 = new JniInchiAtom("C");
		JniInchiAtom atom108 = new JniInchiAtom("C");
		JniInchiAtom atom109 = new JniInchiAtom("C");
		JniInchiAtom atom110 = new JniInchiAtom("C");
		JniInchiAtom atom111 = new JniInchiAtom("C");
		JniInchiAtom atom112 = new JniInchiAtom("C");
		JniInchiAtom atom113 = new JniInchiAtom("C");
		JniInchiAtom atom114 = new JniInchiAtom("C");
		JniInchiAtom atom115 = new JniInchiAtom("C");
		JniInchiAtom atom116 = new JniInchiAtom("C");
		JniInchiAtom atom117 = new JniInchiAtom("C");
		JniInchiAtom atom118 = new JniInchiAtom("C");
		JniInchiAtom atom119 = new JniInchiAtom("C");
		JniInchiAtom atom120 = new JniInchiAtom("C");
		JniInchiAtom atom121 = new JniInchiAtom("C");
		JniInchiAtom atom122 = new JniInchiAtom("C");
		JniInchiAtom atom123 = new JniInchiAtom("C");
		JniInchiAtom atom124 = new JniInchiAtom("C");
		JniInchiAtom atom125 = new JniInchiAtom("C");
		JniInchiAtom atom126 = new JniInchiAtom("C");
		JniInchiAtom atom127 = new JniInchiAtom("C");
		JniInchiAtom atom128 = new JniInchiAtom("C");
		JniInchiAtom atom129 = new JniInchiAtom("C");
		JniInchiAtom atom130 = new JniInchiAtom("C");
		JniInchiAtom atom131 = new JniInchiAtom("C");
		JniInchiAtom atom132 = new JniInchiAtom("C");
		JniInchiAtom atom133 = new JniInchiAtom("C");
		JniInchiAtom atom134 = new JniInchiAtom("C");
		JniInchiAtom atom135 = new JniInchiAtom("C");
		JniInchiAtom atom136 = new JniInchiAtom("C");
		JniInchiAtom atom137 = new JniInchiAtom("C");
		JniInchiAtom atom138 = new JniInchiAtom("C");
		JniInchiAtom atom139 = new JniInchiAtom("C");
		JniInchiAtom atom140 = new JniInchiAtom("C");
		JniInchiAtom atom141 = new JniInchiAtom("C");
		JniInchiAtom atom142 = new JniInchiAtom("C");
		JniInchiAtom atom143 = new JniInchiAtom("C");
		JniInchiAtom atom144 = new JniInchiAtom("C");
		JniInchiAtom atom145 = new JniInchiAtom("C");
		JniInchiAtom atom146 = new JniInchiAtom("C");
		JniInchiAtom atom147 = new JniInchiAtom("C");
		JniInchiAtom atom148 = new JniInchiAtom("C");
		JniInchiAtom atom149 = new JniInchiAtom("C");
		JniInchiAtom atom150 = new JniInchiAtom("C");
		JniInchiAtom atom151 = new JniInchiAtom("C");
		JniInchiAtom atom152 = new JniInchiAtom("C");
		JniInchiAtom atom153 = new JniInchiAtom("C");
		JniInchiAtom atom154 = new JniInchiAtom("C");
		JniInchiAtom atom155 = new JniInchiAtom("C");
		JniInchiAtom atom156 = new JniInchiAtom("C");
		JniInchiAtom atom157 = new JniInchiAtom("C");
		JniInchiAtom atom158 = new JniInchiAtom("C");
		JniInchiAtom atom159 = new JniInchiAtom("C");
		JniInchiAtom atom160 = new JniInchiAtom("C");
		JniInchiAtom atom161 = new JniInchiAtom("C");
		JniInchiAtom atom162 = new JniInchiAtom("C");
		JniInchiAtom atom163 = new JniInchiAtom("C");
		JniInchiAtom atom164 = new JniInchiAtom("C");
		JniInchiAtom atom165 = new JniInchiAtom("C");
		JniInchiAtom atom166 = new JniInchiAtom("C");
		JniInchiAtom atom167 = new JniInchiAtom("C");
		JniInchiAtom atom168 = new JniInchiAtom("C");
		JniInchiAtom atom169 = new JniInchiAtom("C");
		JniInchiAtom atom170 = new JniInchiAtom("C");
		JniInchiAtom atom171 = new JniInchiAtom("C");
		JniInchiAtom atom172 = new JniInchiAtom("C");
		JniInchiAtom atom173 = new JniInchiAtom("C");
		JniInchiAtom atom174 = new JniInchiAtom("C");
		JniInchiAtom atom175 = new JniInchiAtom("C");
		JniInchiAtom atom176 = new JniInchiAtom("C");
		JniInchiAtom atom177 = new JniInchiAtom("C");
		JniInchiAtom atom178 = new JniInchiAtom("C");
		JniInchi