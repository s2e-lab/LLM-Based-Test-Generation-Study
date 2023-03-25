package scenario3;


import original.Add;
import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddTest {
    @Test
	public void test1() throws Exception {
		assertEquals(1, scenario3.Add.add(0, 1));
	}

	@Test
	public void test2() throws Exception {
		assertEquals(1, scenario3.Add.add(1, 0));
	}

	@Test
	public void test3() throws Exception {
		assertEquals(5, scenario3.Add.add(2, 3));
	}

	@Test
	public void test4() throws Exception {
		assertEquals(12, scenario3.Add.add(5, 7));
	}

	@Test
	public void test5() throws Exception {
		assertEquals(12, scenario3.Add.add(7, 5));
	}

	@Test
	public void test6() throws Exception {
		assertEquals(1297, scenario3.Add.add(572, 725));
	}

	@Test
	public void test7() throws Exception {
		assertEquals(855, scenario3.Add.add(51, 804));
	}

	@Test
	public void test8() throws Exception {
		assertEquals(741, scenario3.Add.add(645, 96));
	}

	@Test
	public void test9() throws Exception {
		assertEquals(1565, scenario3.Add.add(712, 853));
	}

	@Test
	public void test10() throws Exception {
		assertEquals(324, scenario3.Add.add(223, 101));
	}

	@Test
	public void test11() throws Exception {
		assertEquals(105, scenario3.Add.add(76, 29));
	}

	@Test
	public void test12() throws Exception {
		assertEquals(565, scenario3.Add.add(416, 149));
	}

	@Test
	public void test13() throws Exception {
		assertEquals(554, scenario3.Add.add(145, 409));
	}

	@Test
	public void test14() throws Exception {
		assertEquals(965, scenario3.Add.add(535, 430));
	}

	@Test
	public void test15() throws Exception {
		assertEquals(421, scenario3.Add.add(118, 303));
	}

	@Test
	public void test16() throws Exception {
		assertEquals(381, scenario3.Add.add(287, 94));
	}

	@Test
	public void test17() throws Exception {
		assertEquals(1025, scenario3.Add.add(768, 257));
	}

	@Test
	public void test18() throws Exception {
		assertEquals(1098, scenario3.Add.add(421, 677));
	}

	@Test
	public void test19() throws Exception {
		assertEquals(1616, scenario3.Add.add(802, 814));
	}

	@Test
	public void test20() throws Exception {
		assertEquals(1432, scenario3.Add.add(510, 922));
	}

	@Test
	public void test21() throws Exception {
		assertEquals(1164, scenario3.Add.add(345, 819));
	}

	@Test
	public void test22() throws Exception {
		assertEquals(1331, scenario3.Add.add(895, 436));
	}

	@Test
	public void test23() throws Exception {
		assertEquals(547, scenario3.Add.add(123, 424));
	}

	@Test
	public void test24() throws Exception {
		assertEquals(1168, scenario3.Add.add(923, 245));
	}

	@Test
	public void test25() throws Exception {
		assertEquals(461, scenario3.Add.add(23, 438));
	}

	@Test
	public void test26() throws Exception {
		assertEquals(698, scenario3.Add.add(565, 133));
	}

	@Test
	public void test27() throws Exception {
		assertEquals(1870, scenario3.Add.add(945, 925));
	}

	@Test
	public void test28() throws Exception {
		assertEquals(1244, scenario3.Add.add(261, 983));
	}

	@Test
	public void test29() throws Exception {
		assertEquals(716, scenario3.Add.add(139, 577));
	}

	@Test
	public void test30() throws Exception {
		assertEquals(941, scenario3.Add.add(763, 178));
	}

	@Test
	public void test31() throws Exception {
		assertEquals(1039, scenario3.Add.add(147, 892));
	}

	@Test
	public void test32() throws Exception {
		assertEquals(838, scenario3.Add.add(436, 402));
	}

	@Test
	public void test33() throws Exception {
		assertEquals(1191, scenario3.Add.add(610, 581));
	}

	@Test
	public void test34() throws Exception {
		assertEquals(519, scenario3.Add.add(103, 416));
	}

	@Test
	public void test35() throws Exception {
		assertEquals(1329, scenario3.Add.add(339, 990));
	}

	@Test
	public void test36() throws Exception {
		assertEquals(634, scenario3.Add.add(130, 504));
	}

	@Test
	public void test37() throws Exception {
		assertEquals(959, scenario3.Add.add(242, 717));
	}

	@Test
	public void test38() throws Exception {
		assertEquals(672, scenario3.Add.add(562, 110));
	}

	@Test
	public void test39() throws Exception {
		assertEquals(1305, scenario3.Add.add(396, 909));
	}

	@Test
	public void test40() throws Exception {
		assertEquals(1590, scenario3.Add.add(887, 703));
	}

	@Test
	public void test41() throws Exception {
		assertEquals(1421, scenario3.Add.add(870, 551));
	}

	@Test
	public void test42() throws Exception {
		assertEquals(813, scenario3.Add.add(422, 391));
	}

	@Test
	public void test43() throws Exception {
		assertEquals(804, scenario3.Add.add(299, 505));
	}

	@Test
	public void test44() throws Exception {
		assertEquals(402, scenario3.Add.add(346, 56));
	}

	@Test
	public void test45() throws Exception {
		assertEquals(742, scenario3.Add.add(36, 706));
	}

	@Test
	public void test46() throws Exception {
		assertEquals(1149, scenario3.Add.add(738, 411));
	}

	@Test
	public void test47() throws Exception {
		assertEquals(766, scenario3.Add.add(679, 87));
	}

	@Test
	public void test48() throws Exception {
		assertEquals(328, scenario3.Add.add(25, 303));
	}

	@Test
	public void test49() throws Exception {
		assertEquals(773, scenario3.Add.add(161, 612));
	}

	@Test
	public void test50() throws Exception {
		assertEquals(1147, scenario3.Add.add(306, 841));
	}

	@Test
	public void test51() throws Exception {
		assertEquals(1384, scenario3.Add.add(973, 411));
	}

	@Test
	public void test52() throws Exception {
		assertEquals(868, scenario3.Add.add(711, 157));
	}

	@Test
	public void test53() throws Exception {
		assertEquals(498, scenario3.Add.add(471, 27));
	}

	@Test
	public void test54() throws Exception {
		assertEquals(1506, scenario3.Add.add(714, 792));
	}

	@Test
	public void test55() throws Exception {
		assertEquals(244, scenario3.Add.add(38, 206));
	}

	@Test
	public void test56() throws Exception {
		assertEquals(1250, scenario3.Add.add(907, 343));
	}

	@Test
	public void test57() throws Exception {
		assertEquals(783, scenario3.Add.add(23, 760));
	}

	@Test
	public void test58() throws Exception {
		assertEquals(1383, scenario3.Add.add(524, 859));
	}

	@Test
	public void test59() throws Exception {
		assertEquals(559, scenario3.Add.add(30, 529));
	}

	@Test
	public void test60() throws Exception {
		assertEquals(1032, scenario3.Add.add(341, 691));
	}

	@Test
	public void test61() throws Exception {
		assertEquals(896, scenario3.Add.add(167, 729));
	}

	@Test
	public void test62() throws Exception {
		assertEquals(925, scenario3.Add.add(636, 289));
	}

	@Test
	public void test63() throws Exception {
		assertEquals(647, scenario3.Add.add(503, 144));
	}

	@Test
	public void test64() throws Exception {
		assertEquals(1036, scenario3.Add.add(51, 985));
	}

	@Test
	public void test65() throws Exception {
		assertEquals(436, scenario3.Add.add(287, 149));
	}

	@Test
	public void test66() throws Exception {
		assertEquals(734, scenario3.Add.add(659, 75));
	}

	@Test
	public void test67() throws Exception {
		assertEquals(1259, scenario3.Add.add(462, 797));
	}

	@Test
	public void test68() throws Exception {
		assertEquals(547, scenario3.Add.add(406, 141));
	}

	@Test
	public void test69() throws Exception {
		assertEquals(150, scenario3.Add.add(106, 44));
	}

	@Test
	public void test70() throws Exception {
		assertEquals(1234, scenario3.Add.add(300, 934));
	}

	@Test
	public void test71() throws Exception {
		assertEquals(995, scenario3.Add.add(471, 524));
	}

	@Test
	public void test72() throws Exception {
		assertEquals(551, scenario3.Add.add(122, 429));
	}

	@Test
	public void test73() throws Exception {
		assertEquals(930, scenario3.Add.add(735, 195));
	}

	@Test
	public void test74() throws Exception {
		assertEquals(819, scenario3.Add.add(335, 484));
	}

	@Test
	public void test75() throws Exception {
		assertEquals(837, scenario3.Add.add(28, 809));
	}

	@Test
	public void test76() throws Exception {
		assertEquals(450, scenario3.Add.add(430, 20));
	}

	@Test
	public void test77() throws Exception {
		assertEquals(1551, scenario3.Add.add(916, 635));
	}

	@Test
	public void test78() throws Exception {
		assertEquals(1300, scenario3.Add.add(301, 999));
	}

	@Test
	public void test79() throws Exception {
		assertEquals(920, scenario3.Add.add(454, 466));
	}

	@Test
	public void test80() throws Exception {
		assertEquals(1164, scenario3.Add.add(905, 259));
	}

	@Test
	public void test81() throws Exception {
		assertEquals(373, scenario3.Add.add(168, 205));
	}

	@Test
	public void test82() throws Exception {
		assertEquals(1004, scenario3.Add.add(570, 434));
	}

	@Test
	public void test83() throws Exception {
		assertEquals(1023, scenario3.Add.add(64, 959));
	}

	@Test
	public void test84() throws Exception {
		assertEquals(1467, scenario3.Add.add(957, 510));
	}

	@Test
	public void test85() throws Exception {
		assertEquals(1320, scenario3.Add.add(722, 598));
	}

	@Test
	public void test86() throws Exception {
		assertEquals(996, scenario3.Add.add(770, 226));
	}

	@Test
	public void test87() throws Exception {
		assertEquals(645, scenario3.Add.add(579, 66));
	}

	@Test
	public void test88() throws Exception {
		assertEquals(791, scenario3.Add.add(117, 674));
	}

	@Test
	public void test89() throws Exception {
		assertEquals(560, scenario3.Add.add(530, 30));
	}

	@Test
	public void test90() throws Exception {
		assertEquals(1121, scenario3.Add.add(776, 345));
	}

	@Test
	public void test91() throws Exception {
		assertEquals(716, scenario3.Add.add(327, 389));
	}

	@Test
	public void test92() throws Exception {
		assertEquals(608, scenario3.Add.add(596, 12));
	}

	@Test
	public void test93() throws Exception {
		assertEquals(1110, scenario3.Add.add(599, 511));
	}

	@Test
	public void test94() throws Exception {
		assertEquals(1412, scenario3.Add.add(936, 476));
	}

	@Test
	public void test95() throws Exception {
		assertEquals(475, scenario3.Add.add(461, 14));
	}

	@Test
	public void test96() throws Exception {
		assertEquals(1123, scenario3.Add.add(966, 157));
	}

	@Test
	public void test97() throws Exception {
		assertEquals(417, scenario3.Add.add(326, 91));
	}

	@Test
	public void test98() throws Exception {
		assertEquals(847, scenario3.Add.add(392, 455));
	}

	@Test
	public void test99() throws Exception {
		assertEquals(923, scenario3.Add.add(446, 477));
	}

	@Test
	public void test100() throws Exception {
		assertEquals(1184, scenario3.Add.add(324, 860));
	}

	@Test
	public void test101() throws Exception {
		assertEquals(1030, scenario3.Add.add(945, 85));
	}

	@Test
	public void test102() throws Exception {
		assertEquals(1468, scenario3.Add.add(886, 582));
	}

	@Test
	public void test103() throws Exception {
		assertEquals(1598, scenario3.Add.add(886, 712));
	}

	@Test
	public void test104() throws Exception {
		assertEquals(1795, scenario3.Add.add(842, 953));
	}

	
}