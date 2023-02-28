package scenario3;


import java.util.Arrays;
import java.util.Map;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AddTest {

    @Test
    public void test() throws Exception{

        assertEquals(1, scenario3.Add.add(0, 1));
		assertEquals(1, scenario3.Add.add(1, 0));
		assertEquals(5, scenario3.Add.add(2, 3));
		assertEquals(12, scenario3.Add.add(5, 7));
		assertEquals(12, scenario3.Add.add(7, 5));
		assertEquals(1297, scenario3.Add.add(572, 725));
		assertEquals(855, scenario3.Add.add(51, 804));
		assertEquals(741, scenario3.Add.add(645, 96));
		assertEquals(1565, scenario3.Add.add(712, 853));
		assertEquals(324, scenario3.Add.add(223, 101));
		assertEquals(105, scenario3.Add.add(76, 29));
		assertEquals(565, scenario3.Add.add(416, 149));
		assertEquals(554, scenario3.Add.add(145, 409));
		assertEquals(965, scenario3.Add.add(535, 430));
		assertEquals(421, scenario3.Add.add(118, 303));
		assertEquals(381, scenario3.Add.add(287, 94));
		assertEquals(1025, scenario3.Add.add(768, 257));
		assertEquals(1098, scenario3.Add.add(421, 677));
		assertEquals(1616, scenario3.Add.add(802, 814));
		assertEquals(1432, scenario3.Add.add(510, 922));
		assertEquals(1164, scenario3.Add.add(345, 819));
		assertEquals(1331, scenario3.Add.add(895, 436));
		assertEquals(547, scenario3.Add.add(123, 424));
		assertEquals(1168, scenario3.Add.add(923, 245));
		assertEquals(461, scenario3.Add.add(23, 438));
		assertEquals(698, scenario3.Add.add(565, 133));
		assertEquals(1870, scenario3.Add.add(945, 925));
		assertEquals(1244, scenario3.Add.add(261, 983));
		assertEquals(716, scenario3.Add.add(139, 577));
		assertEquals(941, scenario3.Add.add(763, 178));
		assertEquals(1039, scenario3.Add.add(147, 892));
		assertEquals(838, scenario3.Add.add(436, 402));
		assertEquals(1191, scenario3.Add.add(610, 581));
		assertEquals(519, scenario3.Add.add(103, 416));
		assertEquals(1329, scenario3.Add.add(339, 990));
		assertEquals(634, scenario3.Add.add(130, 504));
		assertEquals(959, scenario3.Add.add(242, 717));
		assertEquals(672, scenario3.Add.add(562, 110));
		assertEquals(1305, scenario3.Add.add(396, 909));
		assertEquals(1590, scenario3.Add.add(887, 703));
		assertEquals(1421, scenario3.Add.add(870, 551));
		assertEquals(813, scenario3.Add.add(422, 391));
		assertEquals(804, scenario3.Add.add(299, 505));
		assertEquals(402, scenario3.Add.add(346, 56));
		assertEquals(742, scenario3.Add.add(36, 706));
		assertEquals(1149, scenario3.Add.add(738, 411));
		assertEquals(766, scenario3.Add.add(679, 87));
		assertEquals(328, scenario3.Add.add(25, 303));
		assertEquals(773, scenario3.Add.add(161, 612));
		assertEquals(1147, scenario3.Add.add(306, 841));
		assertEquals(1384, scenario3.Add.add(973, 411));
		assertEquals(868, scenario3.Add.add(711, 157));
		assertEquals(498, scenario3.Add.add(471, 27));
		assertEquals(1506, scenario3.Add.add(714, 792));
		assertEquals(244, scenario3.Add.add(38, 206));
		assertEquals(1250, scenario3.Add.add(907, 343));
		assertEquals(783, scenario3.Add.add(23, 760));
		assertEquals(1383, scenario3.Add.add(524, 859));
		assertEquals(559, scenario3.Add.add(30, 529));
		assertEquals(1032, scenario3.Add.add(341, 691));
		assertEquals(896, scenario3.Add.add(167, 729));
		assertEquals(925, scenario3.Add.add(636, 289));
		assertEquals(647, scenario3.Add.add(503, 144));
		assertEquals(1036, scenario3.Add.add(51, 985));
		assertEquals(436, scenario3.Add.add(287, 149));
		assertEquals(734, scenario3.Add.add(659, 75));
		assertEquals(1259, scenario3.Add.add(462, 797));
		assertEquals(547, scenario3.Add.add(406, 141));
		assertEquals(150, scenario3.Add.add(106, 44));
		assertEquals(1234, scenario3.Add.add(300, 934));
		assertEquals(995, scenario3.Add.add(471, 524));
		assertEquals(551, scenario3.Add.add(122, 429));
		assertEquals(930, scenario3.Add.add(735, 195));
		assertEquals(819, scenario3.Add.add(335, 484));
		assertEquals(837, scenario3.Add.add(28, 809));
		assertEquals(450, scenario3.Add.add(430, 20));
		assertEquals(1551, scenario3.Add.add(916, 635));
		assertEquals(1300, scenario3.Add.add(301, 999));
		assertEquals(920, scenario3.Add.add(454, 466));
		assertEquals(1164, scenario3.Add.add(905, 259));
		assertEquals(373, scenario3.Add.add(168, 205));
		assertEquals(1004, scenario3.Add.add(570, 434));
		assertEquals(1023, scenario3.Add.add(64, 959));
		assertEquals(1467, scenario3.Add.add(957, 510));
		assertEquals(1320, scenario3.Add.add(722, 598));
		assertEquals(996, scenario3.Add.add(770, 226));
		assertEquals(645, scenario3.Add.add(579, 66));
		assertEquals(791, scenario3.Add.add(117, 674));
		assertEquals(560, scenario3.Add.add(530, 30));
		assertEquals(1121, scenario3.Add.add(776, 345));
		assertEquals(716, scenario3.Add.add(327, 389));
		assertEquals(608, scenario3.Add.add(596, 12));
		assertEquals(1110, scenario3.Add.add(599, 511));
		assertEquals(1412, scenario3.Add.add(936, 476));
		assertEquals(475, scenario3.Add.add(461, 14));
		assertEquals(1123, scenario3.Add.add(966, 157));
		assertEquals(417, scenario3.Add.add(326, 91));
		assertEquals(847, scenario3.Add.add(392, 455));
		assertEquals(923, scenario3.Add.add(446, 477));
		assertEquals(1184, scenario3.Add.add(324, 860));
		assertEquals(1030, scenario3.Add.add(945, 85));
		assertEquals(1468, scenario3.Add.add(886, 582));
		assertEquals(1598, scenario3.Add.add(886, 712));
		assertEquals(1795, scenario3.Add.add(842, 953));
		
    }

}