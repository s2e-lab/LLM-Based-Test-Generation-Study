package Part3;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


class HasCloseElements {
    /**
     * Check if in given list of numbers, are any two numbers closer to each other than
     * given threshold.
     * >>> has_close_elements([1.0, 2.0, 3.0], 0.5)
     * False
     * >>> has_close_elements([1.0, 2.8, 3.0, 4.0, 5.0, 2.0], 0.3)
     * True
     *
     * > hasCloseElements([1.0, 2.0, 3.9, 4.0, 5.0, 2.2], 0.3)
     * true
     * > hasCloseElements([1.0, 2.0, 3.9, 4.0, 5.0, 2.2], 0.05)
     * false
     * > hasCloseElements([1.0, 2.0, 5.9, 4.0, 5.0], 0.95)
     * true
     * > hasCloseElements([1.0, 2.0, 5.9, 4.0, 5.0], 0.8)
     * false
     * > hasCloseElements([1.0, 2.0, 3.0, 4.0, 5.0, 2.0], 0.1)
     * true
     * > hasCloseElements([1.1, 2.2, 3.1, 4.1, 5.1], 1.0)
     * true
     * > hasCloseElements([1.1, 2.2, 3.1, 4.1, 5.1], 0.5)
     * false
     */
    public static Boolean hasCloseElements(List<Double> numbers, Double threshold) {
        for (int i = 0; i < numbers.size(); i++) {
            for (int j = i + 1; j < numbers.size(); j++) {
                if (Math.abs(numbers.get(i) - numbers.get(j)) < threshold) {
                    return true;
                }
            }
        }
        return false;
    }

}