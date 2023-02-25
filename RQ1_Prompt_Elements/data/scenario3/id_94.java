package scenario3;

import java.util.List;




class Skjkasdkd {
    /**
     * You are given a list of integers.
     * You need to find the largest prime value and return the sum of its digits.

     * Examples:
     * For lst = [0,3,2,1,3,5,7,4,5,5,5,2,181,32,4,32,3,2,32,324,4,3] the output should be 10
     * For lst = [1,0,1,8,2,4597,2,1,3,40,1,2,1,2,4,2,5,1] the output should be 25
     * For lst = [1,3,1,32,5107,34,83278,109,163,23,2323,32,30,1,9,3] the output should be 13
     * For lst = [0,724,32,71,99,32,6,0,5,91,83,0,5,6] the output should be 11
     * For lst = [0,81,12,3,1,21] the output should be 3
     * For lst = [0,8,1,2,1,7] the output should be 7
     *
     * > skjkasdkd([0, 3, 2, 1, 3, 5, 7, 4, 5, 5, 5, 2, 181, 32, 4, 32, 3, 2, 32, 324, 4, 3])
     * 10
     * > skjkasdkd([1, 0, 1, 8, 2, 4597, 2, 1, 3, 40, 1, 2, 1, 2, 4, 2, 5, 1])
     * 25
     * > skjkasdkd([1, 3, 1, 32, 5107, 34, 83278, 109, 163, 23, 2323, 32, 30, 1, 9, 3])
     * 13
     * > skjkasdkd([0, 724, 32, 71, 99, 32, 6, 0, 5, 91, 83, 0, 5, 6])
     * 11
     * > skjkasdkd([0, 81, 12, 3, 1, 21])
     * 3
     * > skjkasdkd([0, 8, 1, 2, 1, 7])
     * 7
     * > skjkasdkd([8191])
     * 19
     * > skjkasdkd([8191, 123456, 127, 7])
     * 19
     * > skjkasdkd([127, 97, 8192])
     * 10
     */
    public static int skjkasdkd(List<Integer> lst) {
        int largestPrime = 0;
        for (int value : lst) {
            if (isPrime(value) && value > largestPrime) {
                largestPrime = value;
            }
        }
        int sum = 0;
        while (largestPrime > 0) {
            sum += largestPrime % 10;
            largestPrime /= 10;
        }
        return sum;
    }

    private static boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}