// ParameterListTest5.java
package org.scribe.model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import org.scribe.utils.OAuthEncoder;
import org.scribe.utils.Preconditions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link ParameterList}.
* It contains ten unit test cases for the {@link ParameterList#sort()} method.
*/
class ParameterListTest5 {

		/**
		* Test case 1 for {@link ParameterList#sort()}.
		* This test case checks if the method returns a sorted list of parameters.
		*/
		@Test
		public void testSort1() {
				ParameterList list = new ParameterList();
				list.add("a", "1");
				list.add("b", "2");
				list.add("c", "3");
				list.add("d", "4");
				list.add("e", "5");
				list.add("f", "6");
				list.add("g", "7");
				list.add("h", "8");
				list.add("i", "9");
				list.add("j", "10");
				list.add("k", "11");
				list.add("l", "12");
				list.add("m", "13");
				list.add("n", "14");
				list.add("o", "15");
				list.add("p", "16");
				list.add("q", "17");
				list.add("r", "18");
				list.add("s", "19");
				list.add("t", "20");
				list.add("u", "21");
				list.add("v", "22");
				list.add("w", "23");
				list.add("x", "24");
				list.add("y", "25");
				list.add("z", "26");
				list.add("A", "27");
				list.add("B", "28");
				list.add("C", "29");
				list.add("D", "30");
				list.add("E", "31");
				list.add("F", "32");
				list.add("G", "33");
				list.add("H", "34");
				list.add("I", "35");
				list.add("J", "36");
				list.add("K", "37");
				list.add("L", "38");
				list.add("M", "39");
				list.add("N", "40");
				list.add("O", "41");
				list.add("P", "42");
				list.add("Q", "43");
				list.add("R", "44");
				list.add("S", "45");
				list.add("T", "46");
				list.add("U", "47");
				list.add("V", "48");
				list.add("W", "49");
				list.add("X", "50");
				list.add("Y", "51");
				list.add("Z", "52");
				list.add("0", "53");
				list.add("1", "54");
				list.add("2", "55");
				list.add("3", "56");
				list.add("4", "57");
				list.add("5", "58");
				list.add("6", "59");
				list.add("7", "60");
				list.add("8", "61");
				list.add("9", "62");
				list.add("!", "63");
				list.add("@", "64");
				list.add("#", "65");
				list.add("$", "66");
				list.add("%", "67");
				list.add("^", "68");
				list.add("&", "69");
				list.add("*", "70");
				list.add("(", "71");
				list.add(")", "72");
				list.add("-", "73");
				list.add("_", "74");
				list.add("=", "75");
				list.add("+", "76");
				list.add("[", "77");
				list.add("{", "78");
				list.add("]", "79");
				list.add("}", "80");
				list.add("\\", "81");
				list.add("|", "82");
				list.add(";", "83");
				list.add(":", "84");
				list.add("'", "85");
				list.add("\"", "86");
				list.add(",", "87");
				list.add("<", "88");
				list.add(".", "89");
				list.add(">", "90");
				list.add("/", "91");
				list.add("?", "92");
				list.add("`", "93");
				list.add("~", "94");
				list.add(" ", "95");
				list.add("\t", "96");
				list.add("\n", "97");
				list.add("\r", "98");
				list.add("\f", "99");
				list.add("\b", "100");
				list.add("\u0000", "101");
				list.add("\u0001", "102");
				list.add("\u0002", "103");
				list.add("\u0003", "104");
				list.add("\u0004", "105");
				list.add("\u0005", "106");
				list.add("\u0006", "107");
				list.add("\u0007", "108");
				list.add("\u0008", "109");
				list.add("\u000E", "110");
				list.add("\u000F", "111");
				list.add("\u0010", "112");
				list.add("\u0011", "113");
				list.add("\u0012", "114");
				list.add("\u0013", "115");
				list.add("\u0014", "116");
				list.add("\u0015", "117");
				list.add("\u0016", "118");
				list.add("\u0017", "119");
				list.add("\u0018", "120");
				list.add("\u0019", "121");
				list.add("\u001A", "122");
				list.add("\u001B", "123");
				list.add("\u001C", "124");
				list.add("\u001D", "125");
				list.add("\u001E", "126");
				list.add("\u001F", "127");
				list.add("\u007F", "128");
				list.add("\u0080", "129");
				list.add("\u0081", "130");
				list.add("\u0082", "131");
				list.add("\u0083", "132");
				list.add("\u0084", "133");
				list.add("\u0085", "134");