package scenario2;


import java.util.ArrayList;
import java.util.List;


class OddCount {
    /**
     * Given a list of strings, where each string consists of only digits, return a list.
     * Each element i of the output should be "the number of odd elements in the
     * string i of the input." where all the i's should be replaced by the number
     * of odd digits in the i'th string of the input.
     */
    public static List<String> oddCount(List<String> lst) {
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < lst.size(); i++) {
            int count = 0;
            for (int j = 0; j < lst.get(i).length(); j++) {
                if (Integer.parseInt(lst.get(i).substring(j, j + 1)) % 2 != 0) {
                    count++;
                }
            }
            result.add("the number of odd elements " + count + "n the str" + count + "ng " + count + " of the " + count + "nput.");
        }
        return result;
    }

}