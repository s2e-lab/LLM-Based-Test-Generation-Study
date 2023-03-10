package scenario3;

import java.util.List;


class RescaleToUnit {
    /**
     * Given list of numbers (of at least two elements), apply a linear transform to that list,
     * such that the smallest number will become 0 and the largest will become 1
     *
     * > rescaleToUnit([1.0, 2.0, 3.0, 4.0, 5.0])
     * [0.0, 0.25, 0.5, 0.75, 1.0]
     * > rescaleToUnit([2.0, 49.9])
     * [0.0, 1.0]
     * > rescaleToUnit([100.0, 49.9])
     * [1.0, 0.0]
     * > rescaleToUnit([1.0, 2.0, 3.0, 4.0, 5.0])
     * [0.0, 0.25, 0.5, 0.75, 1.0]
     * > rescaleToUnit([2.0, 1.0, 5.0, 3.0, 4.0])
     * [0.25, 0.0, 1.0, 0.5, 0.75]
     * > rescaleToUnit([12.0, 11.0, 15.0, 13.0, 14.0])
     * [0.25, 0.0, 1.0, 0.5, 0.75]
     */
    public static List<Double> rescaleToUnit(List<Double> numbers) {

    }


}