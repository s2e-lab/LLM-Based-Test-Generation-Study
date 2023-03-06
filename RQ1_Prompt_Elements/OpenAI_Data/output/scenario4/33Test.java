// SortThirdTest.java
package scenario3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link SortThird}.
* It contains ten unit test cases for the {@link SortThird#sortThird(List)} method.
*/
class SortThirdTest {

	@Test
	void testSortThird1() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	@Test
	void testSortThird2() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(4);
		l.add(8);
		l.add(9);
		l.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(6);
		expected.add(3);
		expected.add(4);
		expected.add(8);
		expected.add(9);
		expected.add(5);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	@Test
	void testSortThird3() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(1);
		l.add(2);
		l.add(3);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(2);
		expected.add(3);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	@Test
	void testSortThird4() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(3);
		l.add(-5);
		l.add(2);
		l.add(-3);
		l.add(3);
		l.add(9);
		l.add(0);
		l.add(123);
		l.add(1);
		l.add(-10);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(1);
		expected.add(3);
		expected.add(-5);
		expected.add(2);
		expected.add(-3);
		expected.add(3);
		expected.add(5);
		expected.add(0);
		expected.add(123);
		expected.add(9);
		expected.add(-10);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	@Test
	void testSortThird5() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(8);
		l.add(-12);
		l.add(4);
		l.add(23);
		l.add(2);
		l.add(3);
		l.add(11);
		l.add(12);
		l.add(-10);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(-10);
		expected.add(8);
		expected.add(-12);
		expected.add(3);
		expected.add(23);
		expected.add(2);
		expected.add(4);
		expected.add(11);
		expected.add(12);
		expected.add(5);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	@Test
	void testSortThird6() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(4);
		l.add(8);
		l.add(9);
		l.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(6);
		expected.add(3);
		expected.add(4);
		expected.add(8);
		expected.add(9);
		expected.add(5);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	@Test
	void testSortThird7() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(8);
		l.add(3);
		l.add(4);
		l.add(6);
		l.add(9);
		l.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(8);
		expected.add(3);
		expected.add(4);
		expected.add(6);
		expected.add(9);
		expected.add(5);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	@Test
	void testSortThird8() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(9);
		l.add(4);
		l.add(8);
		l.add(3);
		l.add(2);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(6);
		expected.add(9);
		expected.add(4);
		expected.add(8);
		expected.add(3);
		expected.add(5);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	@Test
	void testSortThird9() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(4);
		l.add(8);
		l.add(9);
		l.add(2);
		l.add(1);
		List<Integer> expected = new ArrayList<Integer>();
		expected.add(2);
		expected.add(6);
		expected.add(3);
		expected.add(4);
		expected.add(8);
		expected.add(9);
		expected.add(5);
		expected.add(1);
		assertEquals(expected, SortThird.sortThird(l));
	}
	
	@Test
	void testSortThird10() {
		List<Integer> l = new ArrayList<Integer>();
		l.add(5);
		l.add(6);
		l.add(3);
		l.add(4);
		l.add(8);
		l.add(9);
		l.add(2);
		l.add(1);
		l.add(0);
		l.add(10);
		l.add(11);
		l.add(12);
		l.add(13);
		l.add(14);
		l.add(15);
		l.add(16);
		l.add(17);
		l.add(18);
		l.add(19);
		l.add(20);
		l.add(21);
		l.add(22);
		l.add(23);
		l.add(24);
		l.add(25);
		l.add(26);
		l.add(27);
		l.add(28);
		l.add(29);
		l.add(30);
		l.add(31);
		l.add(32);
		l.add(33);
		l.add(34);
		l.add(35);
		l.add(36);
		l.add(37);
		l.add(38);
		l.add(39);
		l.add(40);
		l.add(41);
		l.add(42);
		l.add(43);
		l.add(44);
		l.add(45);
		l.add(46);
		l.add(47);
		l.add(48);
		l.add(49);
		l.add(50);
		l.add(51);
		l.add(52);
		l.add(53);
		l.add(54);
		l.add(55);
		l.add(56);
		l.add(57);
		l.add(58);
		l.add(59);
		l.add(60);
		l.add(61);
		l.add(62);
		l.add(63);
		l.add(64);
		l.add(65);
		l.add(66);
		l.add(67);
		l.add(68);
		l.add(69);
		l.add(70);
		l.add(71);
		l.add(72);
		l.add(73);
		l.add(74);
		l.add(75);
		l.add(76);
		l.add(77);
		l.add(78);
		l.add(79);
		l.add(80);
		l.add(81);
		l.add(82);
		l.add(83);
		l.add(84);
		l.add(85);
		l.add(86);
		l.add(87);
		l.add(88);
		l.add(89);
		l.add(90);
		l.add(91);
		l.add(92);
		l.add(93);
		l.add(94);
		l.add(95);
		l.add(96);
		l.add(97);
		l.add(98);
		l.add(99);
		l.add(100);
		l.add(101);
		l.add(102);
		l.add(103);
		l.add(104);
		l.add(105);
		l.add(106);
		l.add(107);
		l.add(108);
		l.add(109);
		l.add(110);
		l.add(111);
		l.add(112);
		l.add(113);
		l.add(114);
		l.add(115);
		l.add(116);
		l.add(117);
		l.add(118);
		l.add(119);
		l.add(120);
		l.add(121);
		l.add(122);
		l.add(123);
		l.add(124);
		l.add(125);
		l.add(126);
		l.add(127);
		l.add(128);
		l.add(129);
		l.add(130);
		l.add(131);
		l.add(132);
		l.add(133);
		l.add(134);
		l.add(135);
		l.add(136);
		l.add(137);
		l.add(138);
		l.add(139);
		l.add(140);
		l.add(141);
		l.add(142);
		l.add(143);
		l.add(144);
		l.add(145);
		l.add(146);
		l.add(147);
		l.add(148);
		l.add(149);
		l.add(150);
		l.add(151);
		l.add(152);
		l.add(153);
		l.add(154);
		l.add(155);
		l.add(156);
		l.add(157);
		l.add(158);
		l.add(159);
		l.add(160);
		l.add(161);
		l.add(162);
		l.add(163);
		l.add(164);
		l.add(165);
		l.add(166);
		l.add(167);
		l.add(168);
		l.add(169);
		l.add(170);
		l.add(171);
		l.add(172);
		l.add(173);
		l.add(174);
		l.add(175);
		l.add(176);
		l.add(177);
		l.add(178);
		l.add(179);
		l.add(180);
		l.add(181);
		l.add(182);
		l.add(183);
		l.add(184);
		l.add(185);
		l.add(186);
		l.add(187);
		l.add(188);
		l.add(189);
		l.add(190);
		l.add(191);
		l.add(192);
		l.add(193);
		l.add(194);
		l.add(195);
		l.add(196);
		l.add(197);
		l.add(198);
		l.add(199);
		l.add(200);
		l.add(201);
		l.add(202);
		l.add(203);
		l.add(204);
		l.add(205);
		l.add(206);
		l.add(207);
		l.add(208);
		l.add(209);
		l.add(210);
		l.add(211);
		l.add(212);
		l.add(213);
		l.add(214);
		l.add(215);
		l.add(216);
		l.add(217);
		l.add(218);
		l.add(219);
		l.add(220);
		l.add(221);
		l.add(222);
		l.add(223);
		l.add(224);
		l.add(225);
		l.add(226);
		l.add(227);
		l.add(228);
		l.add(229);
		l.add(230);
		l.add(231);
		l.add(232);
		l.add(233);
		l.add(234);
		l.add(235);
		l.add(236);
		l.add(237);
		l.add(238);
		l.add(239);
		l.add(240);
		l.add(241);
		l.add(242);
		l.add(243);
		l.add(244);
		l.add(245);
		l.add(246);
		l.add(247);
		l.add(248);
	