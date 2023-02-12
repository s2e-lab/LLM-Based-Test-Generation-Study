package Part3;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class CorrectBracketing1 {
    /**
     * brackets is a string of "(" and ")".
     * return True if every opening bracket has a corresponding closing bracket.

     * >>> correct_bracketing("(")
     * False
     * >>> correct_bracketing("()")
     * True
     * >>> correct_bracketing("(()())")
     * True
     * >>> correct_bracketing(")(()")
     * False
     *
     * > correctBracketing("()")
     * true
     * > correctBracketing("(()())")
     * true
     * > correctBracketing("()()(()())()")
     * true
     * > correctBracketing("()()((()()())())(()()(()))")
     * true
     * > correctBracketing("((()())))")
     * false
     * > correctBracketing(")(()")
     * false
     * > correctBracketing("(")
     * false
     * > correctBracketing("((((")
     * false
     * > correctBracketing(")")
     * false
     * > correctBracketing("(()")
     * false
     * > correctBracketing("()()(()())())(()")
     * false
     * > correctBracketing("()()(()())()))()")
     * false
     */
    public static Boolean correctBracketing(String brackets) {
        int count = 0;
        for (int i = 0; i < brackets.length(); i++) {
            if (brackets.charAt(i) == '(') {
                count++;
            } else {
                count--;
            }
            if (count < 0) {
                return false;
            }
        }
        return count == 0;
    }



}