package scenario2;


import java.util.List;


class Skjkasdkd {
    /**
     * You are given a list of integers.
     * You need to find the largest prime value and return the sum of its digits.
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