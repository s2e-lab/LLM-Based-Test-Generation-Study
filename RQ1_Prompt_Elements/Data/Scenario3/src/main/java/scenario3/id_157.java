package scenario3;

import java.io.*;
import java.lang.*;
import java.util.*;
import java.math.*;




class RightAngleTriangle {
    /**
     * * Given the lengths of the three sides of a triangle. Return True if the three
     * sides form a right-angled triangle, False otherwise.
     * A right-angled triangle is a triangle in which one angle is right angle or 
     * 90 degree.
     * Example:
     * right_angle_triangle(3, 4, 5) == True
     * right_angle_triangle(1, 2, 3) == False
     *
     * > rightAngleTriangle(3, 4, 5)
     * true
     * > rightAngleTriangle(1, 2, 3)
     * false
     * > rightAngleTriangle(10, 6, 8)
     * true
     * > rightAngleTriangle(2, 2, 2)
     * false
     * > rightAngleTriangle(7, 24, 25)
     * true
     * > rightAngleTriangle(10, 5, 7)
     * false
     * > rightAngleTriangle(5, 12, 13)
     * true
     * > rightAngleTriangle(15, 8, 17)
     * true
     * > rightAngleTriangle(48, 55, 73)
     * true
     * > rightAngleTriangle(1, 1, 1)
     * false
     * > rightAngleTriangle(2, 2, 10)
     * false
     */
    public static Boolean rightAngleTriangle(int a, int b, int c) {
        if (a == b || b == c || a == c) {
            return false;
        }
        if (a > b && a > c) {
            return a * a == b * b + c * c;
        }
        if (b > a && b > c) {
            return b * b == a * a + c * c;
        }
        return c * c == a * a + b * b;
    }



}