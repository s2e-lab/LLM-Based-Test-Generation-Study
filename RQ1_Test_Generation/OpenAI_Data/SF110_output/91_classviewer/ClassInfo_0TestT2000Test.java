// ClassInfo_0Test.java
//5-5-04  Added recursive search to find all interfaces.   ___JSH
//7-30-04 Switched to TreeList to keep from getting interfaces twice in list.  ___JSH
//8-01-04 Handled exceptions with fields.   ___JSH
package com.jstevh.viewer;

import java.awt.*;
import java.lang.reflect.*;
import java.util.*;
import javax.swing.*;
import javax.swing.border.*;
import com.jstevh.tools.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ClassInfo}.
* It contains ten unit test cases for the {@link ClassInfo#printFields()} method.
*/
class ClassInfo_0Test {

		@Test
		void testPrintFields() {
				ClassInfo ci = new ClassInfo("java.awt.WindowConstants");
				String[] fields = ci.printFields();
				assertEquals(fields[0], "public static final int java.awt.WindowConstants.DISPOSE_ON_CLOSE");
				assertEquals(fields[1], "public static final int java.awt.WindowConstants.DO_NOTHING_ON_CLOSE");
				assertEquals(fields[2], "public static final int java.awt.WindowConstants.EXIT_ON_CLOSE");
				assertEquals(fields[3], "public static final int java.awt.WindowConstants.HIDE_ON_CLOSE");
		}
		
		@Test
		void testPrintFields2() {
				ClassInfo ci = new ClassInfo("java.awt.WindowConstants");
				String[] fields = ci.printFields();
				assertEquals(fields[0], "public static final int java.awt.WindowConstants.DISPOSE_ON_CLOSE");
				assertEquals(fields[1], "public static final int java.awt.WindowConstants.DO_NOTHING_ON_CLOSE");
				assertEquals(fields[2], "public static final int java.awt.WindowConstants.EXIT_ON_CLOSE");
				assertEquals(fields[3], "public static final int java.awt.WindowConstants.HIDE_ON_CLOSE");
		}
		
		@Test
		void testPrintFields3() {
				ClassInfo ci = new ClassInfo("java.awt.WindowConstants");
				String[] fields = ci.printFields();
				assertEquals(fields[0], "public static final int java.awt.WindowConstants.DISPOSE_ON_CLOSE");
				assertEquals(fields[1], "public static final int java.awt.WindowConstants.DO_NOTHING_ON_CLOSE");
				assertEquals(fields[2], "public static final int java.awt.WindowConstants.EXIT_ON_CLOSE");
				assertEquals(fields[3], "public static final int java.awt.WindowConstants.HIDE_ON_CLOSE");
		}
		
		@Test
		void testPrintFields4() {
				ClassInfo ci = new ClassInfo("java.awt.WindowConstants");
				String[] fields = ci.printFields();
				assertEquals(fields[0], "public static final int java.awt.WindowConstants.DISPOSE_ON_CLOSE");
				assertEquals(fields[1], "public static final int java.awt.WindowConstants.DO_NOTHING_ON_CLOSE");
				assertEquals(fields[2], "public static final int java.awt.WindowConstants.EXIT_ON_CLOSE");
				assertEquals(fields[3], "public static final int java.awt.WindowConstants.HIDE_ON_CLOSE");
		}
		
		@Test
		void testPrintFields5() {
				ClassInfo ci = new ClassInfo("java.awt.WindowConstants");
				String[] fields = ci.printFields();
				assertEquals(fields[0], "public static final int java.awt.WindowConstants.DISPOSE_ON_CLOSE");
				assertEquals(fields[1], "public static final int java.awt.WindowConstants.DO_NOTHING_ON_CLOSE");
				assertEquals(fields[2], "public static final int java.awt.WindowConstants.EXIT_ON_CLOSE");
				assertEquals(fields[3], "public static final int java.awt.WindowConstants.HIDE_ON_CLOSE");
		}
		
		@Test
		void testPrintFields6() {
				ClassInfo ci = new ClassInfo("java.awt.WindowConstants");
				String[] fields = ci.printFields();
				assertEquals(fields[0], "public static final int java.awt.WindowConstants.DISPOSE_ON_CLOSE");
				assertEquals(fields[1], "public static final int java.awt.WindowConstants.DO_NOTHING_ON_CLOSE");
				assertEquals(fields[2], "public static final int java.awt.WindowConstants.EXIT_ON_CLOSE");
				assertEquals(fields[3], "public static final int java.awt.WindowConstants.HIDE_ON_CLOSE");
		}
		
		@Test
		void testPrintFields7() {
				ClassInfo ci = new ClassInfo("java.awt.WindowConstants");
				String[] fields = ci.printFields();
				assertEquals(fields[0], "public static final int java.awt.WindowConstants.DISPOSE_ON_CLOSE");
				assertEquals(fields[1], "public static final int java.awt.WindowConstants.DO_NOTHING_ON_CLOSE");
				assertEquals(fields[2], "public static final int java.awt.WindowConstants.EXIT_ON_CLOSE");
				assertEquals(fields[3], "public static final int java.awt.WindowConstants.HIDE_ON_CLOSE");
		}
		
		@Test
		void testPrintFields8() {
				ClassInfo ci = new ClassInfo("java.awt.WindowConstants");
				String[] fields = ci.printFields();
				assertEquals(fields[0], "public static final int java.awt.WindowConstants.DISPOSE_ON_CLOSE");
				assertEquals(fields[1], "public static final int java.awt.WindowConstants.DO_NOTHING_ON_CLOSE");
				assertEquals(fields[2], "public static final int java.awt.WindowConstants.EXIT_ON_CLOSE");
				assertEquals(fields[3], "public static final int java.awt.WindowConstants.HIDE_ON_CLOSE");
		}
		
		@Test
		void testPrintFields9() {
				ClassInfo ci = new ClassInfo("java.awt.WindowConstants");
				String[] fields = ci.printFields();
				assertEquals(fields[0], "public static final int java.awt.WindowConstants.DISPOSE_ON_CLOSE");
				assertEquals(fields[1], "public static final int java.awt.WindowConstants.DO_NOTHING_ON_CLOSE");
				assertEquals(fields[2], "public static final int java.awt.WindowConstants.EXIT_ON_CLOSE");
				assertEquals(fields[3], "public static final int java.awt.WindowConstants.HIDE_ON_CLOSE");
		}
		
		@Test
		void testPrintFields10() {
				ClassInfo ci = new ClassInfo("java.awt.WindowConstants");
				String[] fields = ci.printFields();
				assertEquals(fields[0], "public static final int java.awt.WindowConstants.DISPOSE_ON_CLOSE");
				assertEquals(fields[1], "public static final int java.awt.WindowConstants.DO_NOTHING_ON_CLOSE");
				assertEquals(fields[2], "public static final int java.awt.WindowConstants.EXIT_ON_CLOSE");
				assertEquals(fields[3], "public static final int java.awt.WindowConstants.HIDE_ON_