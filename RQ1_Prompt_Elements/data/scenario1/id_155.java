package scenario1;


import java.util.Arrays;
import java.util.List;


class EvenOddCount {

    public static List<Integer> evenOddCount(int num) {
        int even = 0;
        int odd = 0;
        if (num == 0) {
            even++;
        }
        while (num != 0) {
            if (num % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num /= 10;
        }
        return Arrays.asList(even, odd);
    }

}