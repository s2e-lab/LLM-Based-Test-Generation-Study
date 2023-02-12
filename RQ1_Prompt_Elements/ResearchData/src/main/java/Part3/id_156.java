package Part3;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;

import static org.junit.jupiter.api.Assertions.assertEquals;


class IntToMiniRoman {
    /**
     * * Given a positive integer, obtain its roman numeral equivalent as a string,
     * and return it in lowercase.
     * Restrictions: 1 <= num <= 1000

     * Examples:
     * >>> int_to_mini_roman(19) == 'xix'
     * >>> int_to_mini_roman(152) == 'clii'
     * >>> int_to_mini_roman(426) == 'cdxxvi'
     *
     * > intToMiniRoman(19)
     * "xix"
     * > intToMiniRoman(152)
     * "clii"
     * > intToMiniRoman(251)
     * "ccli"
     * > intToMiniRoman(426)
     * "cdxxvi"
     * > intToMiniRoman(500)
     * "d"
     * > intToMiniRoman(1)
     * "i"
     * > intToMiniRoman(4)
     * "iv"
     * > intToMiniRoman(43)
     * "xliii"
     * > intToMiniRoman(90)
     * "xc"
     * > intToMiniRoman(94)
     * "xciv"
     * > intToMiniRoman(532)
     * "dxxxii"
     * > intToMiniRoman(900)
     * "cm"
     * > intToMiniRoman(994)
     * "cmxciv"
     * > intToMiniRoman(1000)
     * "m"
     */
    public static String intToMiniRoman(int number) {
        String result = "";
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"m", "cm", "d", "cd", "c", "xc", "l", "xl", "x", "ix", "v", "iv", "i"};
        for (int i = 0; i < values.length; i++) {
            while (number >= values[i]) {
                number -= values[i];
                result += symbols[i];
            }
        }
        return result;
    }



}