// GetOddCollatz.java
package scenario3;

import java.util.ArrayList;
import java.util.List;

class GetOddCollatz {

    /**
     * * Given a positive integer n, return a sorted list that has the odd numbers in collatz sequence.
     *
     * The Collatz conjecture is a conjecture in mathematics that concerns a sequence defined
     * as follows: start with any positive integer n. Then each term is obtained from the
     * previous term as follows: if the previous term is even, the next term is one half of
     * the previous term. If the previous term is odd, the next term is 3 times the previous
     * term plus 1. The conjecture is that no matter what value of n, the sequence will always reach 1.
     *
     * Note:
     * 1. Collatz(1) is [1].
     * 2. returned list sorted in increasing order.
     *
     * For example:
     * getOddCollatz(5) returns [1, 5] # The collatz sequence for 5 is [5, 16, 8, 4, 2, 1], so the odd numbers are only 1, and 5.
     *
     * > getOddCollatz(14)
     * [1, 5, 7, 11, 13, 17]
     * > getOddCollatz(5)
     * [1, 5]
     * > getOddCollatz(12)
     * [1, 3, 5]
     * > getOddCollatz(1)
     * [1]
     */
    public static List<Integer> getOddCollatz(int n) {
        List<Integer> oddCollatz = new ArrayList<>();
        oddCollatz.add(1);
        if (n == 1) {
            return oddCollatz;
        }
        int num = n;
        while (num != 1) {
            if (num % 2 == 0) {
                num = num / 2;
            } else {
                oddCollatz.add(num);
                num = num * 3 + 1;
            }
        }
        oddCollatz.add(num);
        List<Integer> result = new ArrayList<>();
        for (int i : oddCollatz) {
            if (i % 2 != 0) {
                result.add(i);
            }
        }
        return result;
    }
}

// GetOddCollatzTest.java
package scenario3;

import java.util.Arrays;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {

    @Test
    void testGetOddCollatzForOne() {
        List<Integer> expected = Arrays.asList(1);
        List<Integer> actual = GetOddCollatz.getOddCollatz(1);
        assertEquals(expected, actual);
    }

    @Test
    void testGetOddCollatzForFive() {
        List<Integer> expected = Arrays.asList(1, 5);
        List<Integer> actual = GetOddCollatz.getOddCollatz(5);
        assertEquals(expected, actual);
    }

    @Test
    void testGetOddCollatzForTwelve() {
        List<Integer> expected = Arrays.asList(1, 3, 5);
        List<Integer> actual = GetOddCollatz.getOddCollatz(12);
        assertEquals(expected, actual);
    }

    @Test
    void testGetOddCollatzForFourteen() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 11, 13, 17);
        List<Integer> actual = GetOddCollatz.getOddCollatz(14);
        assertEquals(expected, actual);
    }

    @Test
    void testGetOddCollatzForTwenty() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 9, 11, 13, 15, 17, 21);
        List<Integer> actual = GetOddCollatz.getOddCollatz(20);
        assertEquals(expected, actual);
    }

    @Test
    void testGetOddCollatzForThirty() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 9, 11, 13, 15, 17, 21, 25, 27, 31);
        List<Integer> actual = GetOddCollatz.getOddCollatz(30);
        assertEquals(expected, actual);
    }

    @Test
    void testGetOddCollatzForFifty() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 9, 11, 13, 15, 17, 21, 25, 27, 31, 41, 43);
        List<Integer> actual = GetOddCollatz.getOddCollatz(50);
        assertEquals(expected, actual);
    }

    @Test
    void testGetOddCollatzForHundred() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 9, 11, 13, 15, 17, 21, 25, 27, 31, 41, 43, 47, 53, 55, 57, 59, 71, 73, 77, 83, 85, 87, 91, 95, 107, 109, 115, 119, 121, 123, 127);
        List<Integer> actual = GetOddCollatz.getOddCollatz(100);
        assertEquals(expected, actual);
    }

    @Test
    void testGetOddCollatzForThousand() {
        List<Integer> expected = Arrays.asList(1, 5, 7, 9, 11, 13, 15, 17, 21, 25, 27, 31, 41, 43, 47, 53, 55, 57, 59, 71, 73, 77, 83, 85, 87, 91, 95, 107, 109, 115, 119, 121, 123, 127, 159, 161, 167, 169, 179, 181, 191, 193, 197, 209, 213, 215, 227, 231, 239, 241, 255, 257, 263, 267, 269, 271, 275, 279, 283, 287, 297, 311, 313, 327, 329, 331, 335, 337, 341, 343, 345, 351, 353, 357, 365, 367, 369, 371, 375, 383, 385, 389, 391, 397, 401, 403, 407, 409, 415, 417, 419, 421, 427, 431, 433, 435, 437, 443, 445, 447, 453, 455, 457, 461, 463, 467, 479, 481, 485, 487, 491, 493, 495, 497, 501, 503, 505, 507, 509, 511, 513, 519, 521, 523, 527, 529, 537, 539, 541, 543, 545, 549, 551, 553, 555, 557, 559, 561, 563, 565, 567, 569, 571, 577, 579, 581, 583, 585, 587, 591, 593, 597, 599, 601, 603, 605, 607, 609, 611, 617, 619, 623, 625, 627, 629, 631, 633, 635, 637, 639, 641, 643, 645, 647, 649, 651, 653, 655, 657, 659, 661, 663, 665, 667, 669, 671, 673, 675, 677, 679, 681, 683, 685, 687, 689, 691, 693, 695, 697, 699, 701, 703, 705, 707, 709, 711, 713, 715, 717, 719, 721, 723, 725, 727, 729, 731, 733, 735, 737, 739, 741, 743, 745, 747, 749, 751, 753, 755, 757, 759, 761, 763, 765, 767, 769, 771, 773, 775, 777, 779, 781, 783, 785, 787, 789, 791, 793, 795, 797, 799, 