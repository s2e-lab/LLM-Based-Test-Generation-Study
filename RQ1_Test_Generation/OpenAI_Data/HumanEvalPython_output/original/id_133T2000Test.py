# id_133_Test.java
from original.id_133 import sum_squares

import pytest

class id_133_Test:
    """
    Test class of id_133.py.
    It contains ten unit test cases for the :func:`original.id_133.sum_squares`.
    """


    def test_sum_squares_1(self):
        """
        Test case for sum_squares.
        """
        assert sum_squares([1,2,3]) == 14
		
    def test_sum_squares_2(self):
        """
        Test case for sum_squares.
        """
        assert sum_squares([1,4,9]) == 98
		
    def test_sum_squares_3(self):
        """
        Test case for sum_squares.
        """
        assert sum_squares([1,3,5,7]) == 84
		
    def test_sum_squares_4(self):
        """
        Test case for sum_squares.
        """
        assert sum_squares([1.4,4.2,0]) == 29
		
    def test_sum_squares_5(self):
        """
        Test case for sum_squares.
        """
        assert sum_squares([-2.4,1,1]) == 6
		
    def test_sum_squares_6(self):
        """
        Test case for sum_squares.
        """
        assert sum_squares([-1.4,1,1]) == 5
		
    def test_sum_squares_7(self):
        """
        Test case for sum_squares.
        """
        assert sum_squares([-1.4,1,1,1]) == 8
		
    def test_sum_squares_8(self):
        """
        Test case for sum_squares.
        """
        assert sum_squares([-1.4,1,1,1,1]) == 10
		
    def test_sum_squares_9(self):
        """
        Test case for sum_squares.
        """
        assert sum_squares([-1.4,1,1,1,1,1]) == 13
		
    def test_sum_squares_10(self):
        """
        Test case for sum_squares.
        """
        assert sum_squares([-1.4,1,1,1,1,1,1]) == 15
		

# id_134.py


def sum_of_digits(n):
    """You are given a number n.
    You need to return the sum of digits of n.
    Examples:
    For n = 123 the output should be 6
    For n = 12345 the output should be 15
    For n = 123456789 the output should be 45
    For n = -12345 the output should be 15
    For n = -123456789 the output should be 45
    For n = 0 the output should be 0
    For n = -1 the output should be 1
    For n = -10 the output should be 1
    For n = -100 the output should be 1
    For n = -1000 the output should be 1
    For n = -10000 the output should be 1
    For n = -100000 the output should be 1
    For n = -1000000 the output should be 1
    For n = -10000000 the output should be 1
    For n = -100000000 the output should be 1
    For n = -1000000000 the output should be 1
    For n = -10000000000 the output should be 1
    For n = -100000000000 the output should be 1
    For n = -1000000000000 the output should be 1
    For n = -10000000000000 the output should be 1
    For n = -100000000000000 the output should be 1
    For n = -1000000000000000 the output should be 1
    For n = -10000000000000000 the output should be 1
    For n = -100000000000000000 the output should be 1
    For n = -1000000000000000000 the output should be 1
    For n = -10000000000000000000 the output should be 1
    For n = -100000000000000000000 the output should be 1
    For n = -1000000000000000000000 the output should be 1
    For n = -10000000000000000000000 the output should be 1
    For n = -100000000000000000000000 the output should be 1
    For n = -1000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -100000000000000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -1000000000000000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n = -10000000000000000000000000000000000000000000000000000000000000000000000000000000000000 the output should be 1
    For n =