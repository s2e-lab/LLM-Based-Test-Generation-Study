package Part2;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class Add1 {
    /**
     * Given a non-empty list of integers lst. add the even elements that are at odd indices..


     */
    public static int add(List<Integer> lst) {
        int result = 0;
        for (int i = 0; i < lst.size(); i++) {
            if (i % 2 == 1 && lst.get(i) % 2 == 0) {
                result += lst.get(i);
            }
        }
        return result;
    }

}