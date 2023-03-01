// DigitsTest.java
package scenario2;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link Digits}.
* It contains ten unit test cases for the {@link Digits#digits(int)} method.
*/
class DigitsTest {

	@Test
	void testDigits() {
		assertEquals(0, Digits.digits(0));
		assertEquals(0, Digits.digits(2));
		assertEquals(0, Digits.digits(4));
		assertEquals(0, Digits.digits(6));
		assertEquals(0, Digits.digits(8));
		assertEquals(1, Digits.digits(1));
		assertEquals(1, Digits.digits(3));
		assertEquals(1, Digits.digits(5));
		assertEquals(1, Digits.digits(7));
		assertEquals(1, Digits.digits(9));
		assertEquals(0, Digits.digits(10));
		assertEquals(0, Digits.digits(12));
		assertEquals(0, Digits.digits(14));
		assertEquals(0, Digits.digits(16));
		assertEquals(0, Digits.digits(18));
		assertEquals(1, Digits.digits(11));
		assertEquals(1, Digits.digits(13));
		assertEquals(1, Digits.digits(15));
		assertEquals(1, Digits.digits(17));
		assertEquals(1, Digits.digits(19));
		assertEquals(0, Digits.digits(20));
		assertEquals(0, Digits.digits(22));
		assertEquals(0, Digits.digits(24));
		assertEquals(0, Digits.digits(26));
		assertEquals(0, Digits.digits(28));
		assertEquals(1, Digits.digits(21));
		assertEquals(1, Digits.digits(23));
		assertEquals(1, Digits.digits(25));
		assertEquals(1, Digits.digits(27));
		assertEquals(1, Digits.digits(29));
		assertEquals(0, Digits.digits(30));
		assertEquals(0, Digits.digits(32));
		assertEquals(0, Digits.digits(34));
		assertEquals(0, Digits.digits(36));
		assertEquals(0, Digits.digits(38));
		assertEquals(1, Digits.digits(31));
		assertEquals(1, Digits.digits(33));
		assertEquals(1, Digits.digits(35));
		assertEquals(1, Digits.digits(37));
		assertEquals(1, Digits.digits(39));
		assertEquals(0, Digits.digits(40));
		assertEquals(0, Digits.digits(42));
		assertEquals(0, Digits.digits(44));
		assertEquals(0, Digits.digits(46));
		assertEquals(0, Digits.digits(48));
		assertEquals(1, Digits.digits(41));
		assertEquals(1, Digits.digits(43));
		assertEquals(1, Digits.digits(45));
		assertEquals(1, Digits.digits(47));
		assertEquals(1, Digits.digits(49));
		assertEquals(0, Digits.digits(50));
		assertEquals(0, Digits.digits(52));
		assertEquals(0, Digits.digits(54));
		assertEquals(0, Digits.digits(56));
		assertEquals(0, Digits.digits(58));
		assertEquals(1, Digits.digits(51));
		assertEquals(1, Digits.digits(53));
		assertEquals(1, Digits.digits(55));
		assertEquals(1, Digits.digits(57));
		assertEquals(1, Digits.digits(59));
		assertEquals(0, Digits.digits(60));
		assertEquals(0, Digits.digits(62));
		assertEquals(0, Digits.digits(64));
		assertEquals(0, Digits.digits(66));
		assertEquals(0, Digits.digits(68));
		assertEquals(1, Digits.digits(61));
		assertEquals(1, Digits.digits(63));
		assertEquals(1, Digits.digits(65));
		assertEquals(1, Digits.digits(67));
		assertEquals(1, Digits.digits(69));
		assertEquals(0, Digits.digits(70));
		assertEquals(0, Digits.digits(72));
		assertEquals(0, Digits.digits(74));
		assertEquals(0, Digits.digits(76));
		assertEquals(0, Digits.digits(78));
		assertEquals(1, Digits.digits(71));
		assertEquals(1, Digits.digits(73));
		assertEquals(1, Digits.digits(75));
		assertEquals(1, Digits.digits(77));
		assertEquals(1, Digits.digits(79));
		assertEquals(0, Digits.digits(80));
		assertEquals(0, Digits.digits(82));
		assertEquals(0, Digits.digits(84));
		assertEquals(0, Digits.digits(86));
		assertEquals(0, Digits.digits(88));
		assertEquals(1, Digits.digits(81));
		assertEquals(1, Digits.digits(83));
		assertEquals(1, Digits.digits(85));
		assertEquals(1, Digits.digits(87));
		assertEquals(1, Digits.digits(89));
		assertEquals(0, Digits.digits(90));
		assertEquals(0, Digits.digits(92));
		assertEquals(0, Digits.digits(94));
		assertEquals(0, Digits.digits(96));
		assertEquals(0, Digits.digits(98));
		assertEquals(1, Digits.digits(91));
		assertEquals(1, Digits.digits(93));
		assertEquals(1, Digits.digits(95));
		assertEquals(1, Digits.digits(97));
		assertEquals(1, Digits.digits(99));
		assertEquals(0, Digits.digits(100));
		assertEquals(0, Digits.digits(102));
		assertEquals(0, Digits.digits(104));
		assertEquals(0, Digits.digits(106));
		assertEquals(0, Digits.digits(108));
		assertEquals(1, Digits.digits(101));
		assertEquals(1, Digits.digits(103));
		assertEquals(1, Digits.digits(105));
		assertEquals(1, Digits.digits(107));
		assertEquals(1, Digits.digits(109));
		assertEquals(0, Digits.digits(110));
		assertEquals(0, Digits.digits(112));
		assertEquals(0, Digits.digits(114));
		assertEquals(0, Digits.digits(116));
		assertEquals(0, Digits.digits(118));
		assertEquals(1, Digits.digits(111));
		assertEquals(1, Digits.digits(113));
		assertEquals(1, Digits.digits(115));
		assertEquals(1, Digits.digits(117));
		assertEquals(1, Digits.digits(119));
		assertEquals(0, Digits.digits(120));
		assertEquals(0, Digits.digits(122));
		assertEquals(0, Digits.digits(124));
		assertEquals(0, Digits.digits(126));
		assertEquals(0, Digits.digits(128));
		assertEquals(1, Digits.digits(121));
		assertEquals(1, Digits.digits(123));
		assertEquals(1, Digits.digits(125));
		assertEquals(1, Digits.digits(127));
		assertEquals(1, Digits.digits(129));
		assertEquals(0, Digits.digits(130));
		assertEquals(0, Digits.digits(132));
		assertEquals(0, Digits.digits(134));
		assertEquals(0, Digits.digits(136));
		assertEquals(0, Digits.digits(138));
		assertEquals(1, Digits.digits(131));
		assertEquals(1, Digits.digits(133));
		assertEquals(1, Digits.digits(135));
		assertEquals(1, Digits.digits(137));
		assertEquals(1, Digits.digits(139));
		assertEquals(0, Digits.digits(140));
		assertEquals(0, Digits.digits(142));
		assertEquals(0, Digits.digits(144));
		assertEquals(0, Digits.digits(146));
		assertEquals(0, Digits.digits(148));
		assertEquals(1, Digits.digits(141));
		assertEquals(1, Digits.digits(143));
		assertEquals(1, Digits.digits(145));
		assertEquals(1, Digits.digits(147));
		assertEquals(1, Digits.digits(149));
		assertEquals(0, Digits.digits(150));
		assertEquals(0, Digits.digits(152));
		assertEquals(0, Digits.digits(154));
		assertEquals(0, Digits.digits(156));
		assertEquals(0, Digits.digits(158));
		assertEquals(1, Digits.digits(151));
		assertEquals(1, Digits.digits(153));
		assertEquals(1, Digits.digits(155));
		assertEquals(1, Digits.digits(157));
		assertEquals(1, Digits.digits(159));
		assertEquals(0, Digits.digits(160));
		assertEquals(0, Digits.digits(162));
		assertEquals(0, Digits.digits(164));
		assertEquals(0, Digits.digits(166));
		assertEquals(0, Digits.digits(168));
		assertEquals(1, Digits.digits(161));
		assertEquals(1, Digits.digits(163));
		assertEquals(1, Digits.digits(165));
		assertEquals(1, Digits.digits(167));
		assertEquals(1, Digits.digits(169));
		assertEquals(0, Digits.digits(170));
		assertEquals(0, Digits.digits(172));
		assertEquals(0, Digits.digits(174));
		assertEquals(0, Digits.digits(176));
		assertEquals(0, Digits.digits(178));
		assertEquals(1, Digits.digits(171));
		assertEquals(1, Digits.digits(173));
		assertEquals(1, Digits.digits(175));
		assertEquals(1, Digits.digits(177));
		assertEquals(1, Digits.digits(179));
		assertEquals(0, Digits.digits(180));
		assertEquals(0, Digits.digits(182));
		assertEquals(0, Digits.digits(184));
		assertEquals(0, Digits.digits(186));
		assertEquals(0, Digits.digits(188));
		assertEquals(1, Digits.digits(181));
		assertEquals(1, Digits.digits(183));
		assertEquals(1, Digits.digits(185));
		assertEquals(1, Digits.digits(187));
		assertEquals(1, Digits.digits(189));
		assertEquals(0, Digits.digits(190));
		assertEquals(0, Digits.digits(192));
		assertEquals(0, Digits.digits(194));
		assertEquals(0, Digits.digits(196));
		assertEquals(0, Digits.digits(198));
		assertEquals(1, Digits.digits(191));
		assertEquals(1, Digits.digits(193));
		assertEquals(1, Digits.digits(195));
		assertEquals(1, Digits.digits(197));
		assertEquals(1, Digits.digits(199));
		assertEquals(0, Digits.digits(200));
		assertEquals(0, Digits.digits(202));
		assertEquals(0, Digits.digits(204));
		assertEquals(0, Digits.digits(206));
		assertEquals(0, Digits.digits(208));
		assertEquals(1, Digits.digits(201));
		assertEquals(1, Digits.digits(203));
		assertEquals(1, Digits.digits(205));
		assertEquals(1, Digits.digits(207));
		assertEquals(1, Digits.digits(209));
		assertEquals(0, Digits.digits(210));
		assertEquals(0, Digits.digits(212));
		assertEquals(0, Digits.digits(214));
		assertEquals(0, Digits.digits(216));
		assertEquals(0, Digits.digits(218));
		assertEquals(1, Digits.digits(211));
		assertEquals(1, Digits.digits(213));
		assertEquals(1, Digits.digits(215));
		assertEquals(1, Digits.digits(217));
		assertEquals(1, Digits.digits(219));
		assertEquals(0, Digits.digits(220));
		assertEquals(0, Digits.digits(222));
		assertEquals(0, Digits.digits(224));
		assertEquals(0, Digits.digits(226));
		assertEquals(0, Digits.digits(228));
		assertEquals(1, Digits.digits(221));
		assertEquals(1, Digits.digits(223));
		assertEquals(1, Digits.digits(225));
		assertEquals(1, Digits.digits(227));
		assertEquals(1, Digits.digits(229));
		assertEquals(0, Digits.digits(230));
		assertEquals(0, Digits.digits(232));
		assertEquals(0, Digits.digits(234));
		assertEquals(0, Digits.digits(236));
		assertEquals(0, Dig