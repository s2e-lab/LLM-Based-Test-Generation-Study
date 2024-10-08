// GetOddCollatzTest.java
package scenario2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
* Test class of {@link GetOddCollatz}.
* It contains ten unit test cases for the {@link GetOddCollatz#getOddCollatz(int)} method.
*/
class GetOddCollatzTest {

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It should return [1] when n = 1.
     */
    @Test
    void testGetOddCollatz1() {
        List<Integer> expected = new ArrayList<Integer>();
        expected.add(1);
        assertEquals(expected, GetOddCollatz.getOddCollatz(1));
    }

    /**
     * Test case for {@link GetOddCollatz#getOddCollatz(int)}.
     * It should return [1, 3, 5, 7, 9, 11, 15, 17, 19, 21, 25, 27, 29, 31, 35, 37, 39, 41, 45, 47, 49, 51, 55, 57, 59, 61, 65, 67, 69, 71, 75, 77, 79, 81, 85, 87, 89, 91, 95, 97, 99, 101, 105, 107, 109, 111, 115, 117, 119, 121, 125, 127, 129, 131, 135, 137, 139, 141, 145, 147, 149, 151, 155, 157, 159, 161, 165, 167, 169, 171, 175, 177, 179, 181, 185, 187, 189, 191, 195, 197, 199, 201, 205, 207, 209, 211, 215, 217, 219, 221, 225, 227, 229, 231, 235, 237, 239, 241, 245, 247, 249, 251, 255, 257, 259, 261, 265, 267, 269, 271, 275, 277, 279, 281, 285, 287, 289, 291, 295, 297, 299, 301, 305, 307, 309, 311, 315, 317, 319, 321, 325, 327, 329, 331, 335, 337, 339, 341, 345, 347, 349, 351, 355, 357, 359, 361, 365, 367, 369, 371, 375, 377, 379, 381, 385, 387, 389, 391, 395, 397, 399, 401, 405, 407, 409, 411, 415, 417, 419, 421, 425, 427, 429, 431, 435, 437, 439, 441, 445, 447, 449, 451, 455, 457, 459, 461, 465, 467, 469, 471, 475, 477, 479, 481, 485, 487, 489, 491, 495, 497, 499, 501, 505, 507, 509, 511, 515, 517, 519, 521, 525, 527, 529, 531, 535, 537, 539, 541, 545, 547, 549, 551, 555, 557, 559, 561, 565, 567, 569, 571, 575, 577, 579, 581, 585, 587, 589, 591, 595, 597, 599, 601, 605, 607, 609, 611, 615, 617, 619, 621, 625, 627, 629, 631, 635, 637, 639, 641, 645, 647, 649, 651, 655, 657, 659, 661, 665, 667, 669, 671, 675, 677, 679, 681, 685, 687, 689, 691, 695, 697, 699, 701, 705, 707, 709, 711, 715, 717, 719, 721, 725, 727, 729, 731, 735, 737, 739, 741, 745, 747, 749, 751, 755, 757, 759, 761, 765, 767, 769, 771, 775, 777, 779, 781, 785, 787, 789, 791, 795, 797, 799, 801, 805, 807, 809, 811, 815, 817, 819, 821, 825, 827, 829, 831, 835, 837, 839, 841, 845, 847, 849, 851, 855, 857, 859, 861, 865, 867, 869, 871, 875, 877, 879, 881, 885, 887, 889, 891, 895, 897, 899, 901, 905, 907, 909, 911, 915, 917, 919, 921, 925, 927, 929, 931, 935, 937, 939, 941, 945, 947, 949, 951, 955, 957, 959, 