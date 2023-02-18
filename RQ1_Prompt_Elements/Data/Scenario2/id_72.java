package Part2;


import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;


class WillItFly {
    /**
     * * Write a function that returns True if the object q will fly, and False otherwise.
     * The object q will fly if it's balanced (it is a palindromic list) and the sum of its elements is less than or equal the maximum possible weight w.

     */
    public static Boolean willItFly(List<Integer> q, int w) {
        int sum = 0;
        for (int i = 0; i < q.size(); i++) {
            sum += q.get(i);
        }
        if (sum > w) {
            return false;
        }
        for (int i = 0; i < q.size() / 2; i++) {
            if (q.get(i) != q.get(q.size() - i - 1)) {
                return false;
            }
        }
        return true;
    }

}