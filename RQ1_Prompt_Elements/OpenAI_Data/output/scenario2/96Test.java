// CountUpToTest.java
package scenario2;

import java.util.ArrayList;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link CountUpTo}.
* It contains ten unit test cases for the {@link CountUpTo#countUpTo(int)} method.
*/
class CountUpToTest {

	@Test
	void testCountUpTo_1() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		assertEquals(expected, CountUpTo.countUpTo(10));
	}
	
	@Test
	void testCountUpTo_2() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		assertEquals(expected, CountUpTo.countUpTo(20));
	}
	
	@Test
	void testCountUpTo_3() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		expected.add(23);
		expected.add(29);
		expected.add(31);
		expected.add(37);
		expected.add(41);
		expected.add(43);
		expected.add(47);
		expected.add(53);
		expected.add(59);
		expected.add(61);
		expected.add(67);
		expected.add(71);
		expected.add(73);
		expected.add(79);
		expected.add(83);
		expected.add(89);
		expected.add(97);
		assertEquals(expected, CountUpTo.countUpTo(100));
	}
	
	@Test
	void testCountUpTo_4() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		expected.add(23);
		expected.add(29);
		expected.add(31);
		expected.add(37);
		expected.add(41);
		expected.add(43);
		expected.add(47);
		expected.add(53);
		expected.add(59);
		expected.add(61);
		expected.add(67);
		expected.add(71);
		expected.add(73);
		expected.add(79);
		expected.add(83);
		expected.add(89);
		expected.add(97);
		expected.add(101);
		expected.add(103);
		expected.add(107);
		expected.add(109);
		expected.add(113);
		expected.add(127);
		expected.add(131);
		expected.add(137);
		expected.add(139);
		expected.add(149);
		expected.add(151);
		expected.add(157);
		expected.add(163);
		expected.add(167);
		expected.add(173);
		expected.add(179);
		expected.add(181);
		expected.add(191);
		expected.add(193);
		expected.add(197);
		expected.add(199);
		assertEquals(expected, CountUpTo.countUpTo(200));
	}
	
	@Test
	void testCountUpTo_5() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		expected.add(23);
		expected.add(29);
		expected.add(31);
		expected.add(37);
		expected.add(41);
		expected.add(43);
		expected.add(47);
		expected.add(53);
		expected.add(59);
		expected.add(61);
		expected.add(67);
		expected.add(71);
		expected.add(73);
		expected.add(79);
		expected.add(83);
		expected.add(89);
		expected.add(97);
		expected.add(101);
		expected.add(103);
		expected.add(107);
		expected.add(109);
		expected.add(113);
		expected.add(127);
		expected.add(131);
		expected.add(137);
		expected.add(139);
		expected.add(149);
		expected.add(151);
		expected.add(157);
		expected.add(163);
		expected.add(167);
		expected.add(173);
		expected.add(179);
		expected.add(181);
		expected.add(191);
		expected.add(193);
		expected.add(197);
		expected.add(199);
		expected.add(211);
		expected.add(223);
		expected.add(227);
		expected.add(229);
		expected.add(233);
		expected.add(239);
		expected.add(241);
		expected.add(251);
		expected.add(257);
		expected.add(263);
		expected.add(269);
		expected.add(271);
		expected.add(277);
		expected.add(281);
		expected.add(283);
		expected.add(293);
		expected.add(307);
		expected.add(311);
		expected.add(313);
		expected.add(317);
		expected.add(331);
		expected.add(337);
		expected.add(347);
		expected.add(349);
		expected.add(353);
		expected.add(359);
		expected.add(367);
		expected.add(373);
		expected.add(379);
		expected.add(383);
		expected.add(389);
		expected.add(397);
		expected.add(401);
		expected.add(409);
		expected.add(419);
		expected.add(421);
		expected.add(431);
		expected.add(433);
		expected.add(439);
		expected.add(443);
		expected.add(449);
		expected.add(457);
		expected.add(461);
		expected.add(463);
		expected.add(467);
		expected.add(479);
		expected.add(487);
		expected.add(491);
		expected.add(499);
		expected.add(503);
		expected.add(509);
		expected.add(521);
		expected.add(523);
		expected.add(541);
		assertEquals(expected, CountUpTo.countUpTo(550));
	}
	
	@Test
	void testCountUpTo_6() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		expected.add(23);
		expected.add(29);
		expected.add(31);
		expected.add(37);
		expected.add(41);
		expected.add(43);
		expected.add(47);
		expected.add(53);
		expected.add(59);
		expected.add(61);
		expected.add(67);
		expected.add(71);
		expected.add(73);
		expected.add(79);
		expected.add(83);
		expected.add(89);
		expected.add(97);
		expected.add(101);
		expected.add(103);
		expected.add(107);
		expected.add(109);
		expected.add(113);
		expected.add(127);
		expected.add(131);
		expected.add(137);
		expected.add(139);
		expected.add(149);
		expected.add(151);
		expected.add(157);
		expected.add(163);
		expected.add(167);
		expected.add(173);
		expected.add(179);
		expected.add(181);
		expected.add(191);
		expected.add(193);
		expected.add(197);
		expected.add(199);
		expected.add(211);
		expected.add(223);
		expected.add(227);
		expected.add(229);
		expected.add(233);
		expected.add(239);
		expected.add(241);
		expected.add(251);
		expected.add(257);
		expected.add(263);
		expected.add(269);
		expected.add(271);
		expected.add(277);
		expected.add(281);
		expected.add(283);
		expected.add(293);
		expected.add(307);
		expected.add(311);
		expected.add(313);
		expected.add(317);
		expected.add(331);
		expected.add(337);
		expected.add(347);
		expected.add(349);
		expected.add(353);
		expected.add(359);
		expected.add(367);
		expected.add(373);
		expected.add(379);
		expected.add(383);
		expected.add(389);
		expected.add(397);
		expected.add(401);
		expected.add(409);
		expected.add(419);
		expected.add(421);
		expected.add(431);
		expected.add(433);
		expected.add(439);
		expected.add(443);
		expected.add(449);
		expected.add(457);
		expected.add(461);
		expected.add(463);
		expected.add(467);
		expected.add(479);
		expected.add(487);
		expected.add(491);
		expected.add(499);
		expected.add(503);
		expected.add(509);
		expected.add(521);
		expected.add(523);
		expected.add(541);
		expected.add(547);
		expected.add(557);
		expected.add(563);
		expected.add(569);
		expected.add(571);
		expected.add(577);
		expected.add(587);
		expected.add(593);
		expected.add(599);
		expected.add(601);
		expected.add(607);
		expected.add(613);
		expected.add(617);
		expected.add(619);
		expected.add(631);
		expected.add(641);
		expected.add(643);
		expected.add(647);
		expected.add(653);
		expected.add(659);
		expected.add(661);
		expected.add(673);
		expected.add(677);
		expected.add(683);
		expected.add(691);
		expected.add(701);
		expected.add(709);
		expected.add(719);
		expected.add(727);
		expected.add(733);
		expected.add(739);
		expected.add(743);
		expected.add(751);
		expected.add(757);
		expected.add(761);
		expected.add(769);
		expected.add(773);
		expected.add(787);
		expected.add(797);
		expected.add(809);
		expected.add(811);
		expected.add(821);
		expected.add(823);
		expected.add(827);
		expected.add(829);
		expected.add(839);
		expected.add(853);
		expected.add(857);
		expected.add(859);
		expected.add(863);
		expected.add(877);
		expected.add(881);
		expected.add(883);
		expected.add(887);
		expected.add(907);
		expected.add(911);
		expected.add(919);
		expected.add(929);
		expected.add(937);
		expected.add(941);
		expected.add(947);
		expected.add(953);
		expected.add(967);
		expected.add(971);
		expected.add(977);
		expected.add(983);
		expected.add(991);
		expected.add(997);
		assertEquals(expected, CountUpTo.countUpTo(1000));
	}
	
	@Test
	void testCountUpTo_7() {
		List<Object> expected = new ArrayList<Object>();
		expected.add(2);
		expected.add(3);
		expected.add(5);
		expected.add(7);
		expected.add(11);
		expected.add(13);
		expected.add(17);
		expected.add(19);
		expected.add(23);
		expected.add(29);
		expected.add(31);
		expected.add(37);
		expected.add(41);
		expected.add(43);
		expected.add(47);
		expected.add(53);
		expected.add(59);
		expected.add(61);
		expected.add(67);
		expected.add(71);
		expected.add(73);
		expected.add(79);
		expected.add(83);
		expected.add(89);
		expected.add(97);
		expected.add(101);
		expected.add(103);
		expected.add(107);
		expected.add(109);
		expected.add(113);
		expected.add(127);
		expected.add(131);
		expected.add(137);
		expected.add(139);
		expected.add(149);
		expected.add(151);
		expected.add(157);
		expected.add(163);
		expected.add(167);
		expected.add(173);
		expected.add(179);
		expected.add(181);
		expected.add(191);
		expected.add(193);
		expected.add(197);
		expected.add(199);
		expected.add(211);
		expected.add(223);
		expected.add(227);
		expected