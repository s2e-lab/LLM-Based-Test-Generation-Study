// PartyTest.java
package state;

import java.io.*;
import java.util.*;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Party}.
* It contains ten unit test cases for the {@link Party#gangBoss()} method.
*/
class PartyTest {

		/**
		* Test case 1 for {@link Party#gangBoss()}.
		* This test case tests the gangBoss method when the party is the boss.
		*/
		@Test
		void testGangBoss1() {
				Party p = new Party(1);
				assertEquals(p, p.gangBoss());
		}
		
		/**
		* Test case 2 for {@link Party#gangBoss()}.
		* This test case tests the gangBoss method when the party is not the boss.
		*/
		@Test
		void testGangBoss2() {
				Party p = new Party(1);
				Party p2 = new Party(2);
				p.add(p2);
				assertEquals(p, p2.gangBoss());
		}
		
		/**
		* Test case 3 for {@link Party#gangBoss()}.
		* This test case tests the gangBoss method when the party is not the boss.
		*/
		@Test
		void testGangBoss3() {
				Party p = new Party(1);
				Party p2 = new Party(2);
				Party p3 = new Party(3);
				p.add(p2);
				p2.add(p3);
				assertEquals(p, p3.gangBoss());
		}
		
		/**
		* Test case 4 for {@link Party#gangBoss()}.
		* This test case tests the gangBoss method when the party is not the boss.
		*/
		@Test
		void testGangBoss4() {
				Party p = new Party(1);
				Party p2 = new Party(2);
				Party p3 = new Party(3);
				Party p4 = new Party(4);
				p.add(p2);
				p2.add(p3);
				p3.add(p4);
				assertEquals(p, p4.gangBoss());
		}
		
		/**
		* Test case 5 for {@link Party#gangBoss()}.
		* This test case tests the gangBoss method when the party is not the boss.
		*/
		@Test
		void testGangBoss5() {
				Party p = new Party(1);
				Party p2 = new Party(2);
				Party p3 = new Party(3);
				Party p4 = new Party(4);
				Party p5 = new Party(5);
				p.add(p2);
				p2.add(p3);
				p3.add(p4);
				p4.add(p5);
				assertEquals(p, p5.gangBoss());
		}
		
		/**
		* Test case 6 for {@link Party#gangBoss()}.
		* This test case tests the gangBoss method when the party is not the boss.
		*/
		@Test
		void testGangBoss6() {
				Party p = new Party(1);
				Party p2 = new Party(2);
				Party p3 = new Party(3);
				Party p4 = new Party(4);
				Party p5 = new Party(5);
				Party p6 = new Party(6);
				p.add(p2);
				p2.add(p3);
				p3.add(p4);
				p4.add(p5);
				p5.add(p6);
				assertEquals(p, p6.gangBoss());
		}
		
		/**
		* Test case 7 for {@link Party#gangBoss()}.
		* This test case tests the gangBoss method when the party is not the boss.
		*/
		@Test
		void testGangBoss7() {
				Party p = new Party(1);
				Party p2 = new Party(2);
				Party p3 = new Party(3);
				Party p4 = new Party(4);
				Party p5 = new Party(5);
				Party p6 = new Party(6);
				Party p7 = new Party(7);
				p.add(p2);
				p2.add(p3);
				p3.add(p4);
				p4.add(p5);
				p5.add(p6);
				p6.add(p7);
				assertEquals(p, p7.gangBoss());
		}
		
		/**
		* Test case 8 for {@link Party#gangBoss()}.
		* This test case tests the gangBoss method when the party is not the boss.
		*/
		@Test
		void testGangBoss8() {
				Party p = new Party(1);
				Party p2 = new Party(2);
				Party p3 = new Party(3);
				Party p4 = new Party(4);
				Party p5 = new Party(5);
				Party p6 = new Party(6);
				Party p7 = new Party(7);
				Party p8 = new Party(8);
				p.add(p2);
				p2.add(p3);
				p3.add(p4);
				p4.add(p5);
				p5.add(p6);
				p6.add(p7);
				p7.add(p8);
				assertEquals(p, p8.gangBoss());
		}
		
		/**
		* Test case 9 for {@link Party#gangBoss()}.
		* This test case tests the gangBoss method when the party is not the boss.
		*/
		@Test
		void testGangBoss9() {
				Party p = new Party(1);
				Party p2 = new Party(2);
				Party p3 = new Party(3);
				Party p4 = new Party(4);
				Party p5 = new Party(5);
				Party p6 = new Party(6);
				Party p7 = new Party(7);
				Party p8 = new Party(8);
				Party p9 = new Party(9);
				p.add(p2);
				p2.add(p3);
				p3.add(p4);
				p4.add(p5);
				p5.add(p6);
				p6.add(p7);
				p7.add(p8);
				p8.add(p9);
				assertEquals(p, p9.gangBoss());
		}
		
		/**
		* Test case 10 for {@link Party#gangBoss()}.
		* This test case tests the gangBoss method when the party is not the boss.
		*/
		@Test
		void testGangBoss10() {
				Party p = new Party(1);
				Party p2 = new Party(2);
				Party p3 = new Party(3);
				Party p4 = new Party(4);
				Party p5 = new Party(5);
				Party p6 = new Party(6);
				Party p7 = new Party(