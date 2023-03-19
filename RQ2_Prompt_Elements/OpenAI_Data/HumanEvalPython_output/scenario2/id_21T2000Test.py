# id_21_Test.java
from scenario2.id_21 import rescale_to_unit

import pytest

class id_21_Test:
    """
    Test class of id_21.py.
    It contains ten unit test cases for the :func:`scenario2.id_21.rescale_to_unit`.
    """


    def test_rescale_to_unit_1(self):
        """
        Test case for the :func:`scenario2.id_21.rescale_to_unit`.
        """
        assert rescale_to_unit([1, 2, 3, 4, 5]) == [0.0, 0.25, 0.5, 0.75, 1.0]

    def test_rescale_to_unit_2(self):
        """
        Test case for the :func:`scenario2.id_21.rescale_to_unit`.
        """
        assert rescale_to_unit([1, 2, 3, 4, 5, 6]) == [0.0, 0.2, 0.4, 0.6, 0.8, 1.0]

    def test_rescale_to_unit_3(self):
        """
        Test case for the :func:`scenario2.id_21.rescale_to_unit`.
        """
        assert rescale_to_unit([1, 2, 3, 4, 5, 6, 7]) == [0.0, 0.16666666666666666, 0.3333333333333333, 0.5, 0.6666666666666666, 0.8333333333333334, 1.0]

    def test_rescale_to_unit_4(self):
        """
        Test case for the :func:`scenario2.id_21.rescale_to_unit`.
        """
        assert rescale_to_unit([1, 2, 3, 4, 5, 6, 7, 8]) == [0.0, 0.14285714285714285, 0.2857142857142857, 0.42857142857142855, 0.5714285714285714, 0.7142857142857143, 0.8571428571428571, 1.0]

    def test_rescale_to_unit_5(self):
        """
        Test case for the :func:`scenario2.id_21.rescale_to_unit`.
        """
        assert rescale_to_unit([1, 2, 3, 4, 5, 6, 7, 8, 9]) == [0.0, 0.125, 0.25, 0.375, 0.5, 0.625, 0.75, 0.875, 1.0]

    def test_rescale_to_unit_6(self):
        """
        Test case for the :func:`scenario2.id_21.rescale_to_unit`.
        """
        assert rescale_to_unit([1, 2, 3, 4, 5, 6, 7, 8, 9, 10]) == [0.0, 0.1111111111111111, 0.2222222222222222, 0.3333333333333333, 0.4444444444444444, 0.5555555555555556, 0.6666666666666666, 0.7777777777777777, 0.8888888888888888, 1.0]

    def test_rescale_to_unit_7(self):
        """
        Test case for the :func:`scenario2.id_21.rescale_to_unit`.
        """
        assert rescale_to_unit([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11]) == [0.0, 0.1, 0.2, 0.3, 0.4, 0.5, 0.6, 0.7, 0.8, 0.9, 1.0]

    def test_rescale_to_unit_8(self):
        """
        Test case for the :func:`scenario2.id_21.rescale_to_unit`.
        """
        assert rescale_to_unit([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12]) == [0.0, 0.09090909090909091, 0.18181818181818182, 0.2727272727272727, 0.36363636363636365, 0.45454545454545453, 0.5454545454545454, 0.6363636363636364, 0.7272727272727273, 0.8181818181818182, 0.9090909090909091, 1.0]

    def test_rescale_to_unit_9(self):
        """
        Test case for the :func:`scenario2.id_21.rescale_to_unit`.
        """
        assert rescale_to_unit([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13]) == [0.0, 0.08333333333333333, 0.16666666666666666, 0.25, 0.3333333333333333, 0.4166666666666667, 0.5, 0.5833333333333334, 0.6666666666666666, 0.75, 0.8333333333333334, 0.9166666666666666, 1.0]

    def test_rescale_to_unit_10(self):
        """
        Test case for the :func:`scenario2.id_21.rescale_to_unit`.
        """
        assert rescale_to_unit([1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14]) == [0.0, 0.07142857142857142, 0.14285714285714285, 0.21428571428571427, 0.2857142857142857, 0.35714285714285715, 0.42857142857142855, 0.5, 0.5714285714285714, 0.6428571428571429, 0.7142857142857143, 0.7857142857142857, 0.8571428571428571, 1.0]