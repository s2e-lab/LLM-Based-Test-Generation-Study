package scenario2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class Tri {
    /**
     * Everyone knows Fibonacci sequence, it was studied deeply by mathematicians in
     * the last couple centuries. However, what people don't know is Tribonacci sequence.
     * Tribonacci sequence is defined by the recurrence:
     * tri(1) = 3
     * tri(n) = 1 + n / 2, if n is even.
     * tri(n) =  tri(n - 1) + tri(n - 2) + tri(n + 1), if n is odd.
     * For example:
     * tri(2) = 1 + (2 / 2) = 2
     * tri(4) = 3
     * tri(3) = tri(2) + tri(1) + tri(4)
     * = 2 + 3 + 3 = 8
     * You are given a non-negative integer number n, you have to a return a list of the
     * first n + 1 numbers of the Tribonacci sequence.
     */
    public static List<Number> tri(int n) {
        if (n == 0) {
            return Arrays.asList(1);
        }
        List<Number> my_tri = new ArrayList<>();
        my_tri.add(1);
        my_tri.add(3);
        for (int i = 2; i < n + 1; i++) {
            if (i % 2 == 0) {
                my_tri.add(i / 2 + 1.0);
            } else {
                my_tri.add(my_tri.get(i - 1).doubleValue() + my_tri.get(i - 2).doubleValue() + (i + 3) / 2);
            }
        }
        return my_tri;
    }

}