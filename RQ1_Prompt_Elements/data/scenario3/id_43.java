package scenario3;


import java.util.List;


class PairsSumToZero {
    /**
     * * pairs_sum_to_zero takes a list of integers as an input.
     * it returns True if there are two distinct elements in the list that
     * sum to zero, and False otherwise.
     *
     * > pairsSumToZero([1, 3, 5, 0])
     * False
     * > pairsSumToZero([1, 3, -2, 1])
     * False
     * > pairsSumToZero([1, 2, 3, 7])
     * False
     * > pairsSumToZero([2, 4, -5, 3, 5, 7])
     * True
     * > pairsSumToZero([1])
     * False
     * > pairsSumToZero([1, 3, 5, 0])
     * false
     * > pairsSumToZero([1, 3, -2, 1])
     * false
     * > pairsSumToZero([1, 2, 3, 7])
     * false
     * > pairsSumToZero([2, 4, -5, 3, 5, 7])
     * true
     * > pairsSumToZero([1])
     * false
     * > pairsSumToZero([-3, 9, -1, 3, 2, 30])
     * true
     * > pairsSumToZero([-3, 9, -1, 3, 2, 31])
     * true
     * > pairsSumToZero([-3, 9, -1, 4, 2, 30])
     * false
     * > pairsSumToZero([-3, 9, -1, 4, 2, 31])
     * false
     */
    public static Boolean pairsSumToZero(List<Integer> l) {
        for (int i = 0; i < l.size(); i++) {
            for (int j = i + 1; j < l.size(); j++) {
                if (l.get(i) + l.get(j) == 0) {
                    return true;
                }
            }
        }
        return false;
    }


}