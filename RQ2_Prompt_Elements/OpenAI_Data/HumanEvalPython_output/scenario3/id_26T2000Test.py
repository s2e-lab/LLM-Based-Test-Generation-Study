# id_26_Test.java
from scenario3.id_26 import remove_duplicates

import pytest

class id_26_Test:
    """
    Test class of id_26.py.
    It contains ten unit test cases for the :func:`scenario3.id_26.remove_duplicates`.
    """


    def test_remove_duplicates_1(self):
        """
        Test case for the :func:`scenario3.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4]) == [1, 3, 4]

    def test_remove_duplicates_2(self):
        """
        Test case for the :func:`scenario3.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10]) == [1, 3, 6, 7, 8, 9]

    def test_remove_duplicates_3(self):
        """
        Test case for the :func:`scenario3.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10]) == [1, 3, 6, 7, 8, 9]

    def test_remove_duplicates_4(self):
        """
        Test case for the :func:`scenario3.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10]) == [1, 3, 6, 7, 8, 9]

    def test_remove_duplicates_5(self):
        """
        Test case for the :func:`scenario3.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11]) == [1, 3, 6, 7, 8, 9, 11]

    def test_remove_duplicates_6(self):
        """
        Test case for the :func:`scenario3.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 11]) == [1, 3, 6, 7, 8, 9, 11]

    def test_remove_duplicates_7(self):
        """
        Test case for the :func:`scenario3.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 11, 11]) == [1, 3, 6, 7, 8, 9, 11]

    def test_remove_duplicates_8(self):
        """
        Test case for the :func:`scenario3.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 11, 11, 11]) == [1, 3, 6, 7, 8, 9, 11]

    def test_remove_duplicates_9(self):
        """
        Test case for the :func:`scenario3.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12]) == [1, 3, 6, 7, 8, 9, 11, 12]

    def test_remove_duplicates_10(self):
        """
        Test case for the :func:`scenario3.id_26.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 11, 11, 11, 12, 12]) == [1, 3, 6, 7, 8, 9, 11, 12]

# id_27.py
from typing import List


def remove_duplicates(numbers: List[int]) -> List[int]:
    """ From a list of integers, remove all elements that occur more than once.
    Keep order of elements left the same as in the input.
    >>> remove_duplicates([1, 2, 3, 2, 4])
    [1, 3, 4]
    """

    pass

# id_27_Test.java
from scenario3.id_27 import remove_duplicates

import pytest

class id_27_Test:
    """
    Test class of id_27.py.
    It contains ten unit test cases for the :func:`scenario3.id_27.remove_duplicates`.
    """
		
    def test_remove_duplicates_1(self):
        """
        Test case for the :func:`scenario3.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4]) == [1, 3, 4]

    def test_remove_duplicates_2(self):
        """
        Test case for the :func:`scenario3.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10]) == [1, 3, 6, 7, 8, 9]

    def test_remove_duplicates_3(self):
        """
        Test case for the :func:`scenario3.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10]) == [1, 3, 6, 7, 8, 9]

    def test_remove_duplicates_4(self):
        """
        Test case for the :func:`scenario3.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10]) == [1, 3, 6, 7, 8, 9]

    def test_remove_duplicates_5(self):
        """
        Test case for the :func:`scenario3.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11]) == [1, 3, 6, 7, 8, 9, 11]

    def test_remove_duplicates_6(self):
        """
        Test case for the :func:`scenario3.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 11]) == [1, 3, 6, 7, 8, 9, 11]

    def test_remove_duplicates_7(self):
        """
        Test case for the :func:`scenario3.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7, 8, 9, 10, 10, 10, 10, 11, 11, 11]) == [1, 3, 6, 7, 8, 9, 11]

    def test_remove_duplicates_8(self):
        """
        Test case for the :func:`scenario3.id_27.remove_duplicates`.
        """
        assert remove_duplicates([1, 2, 3, 2, 4, 4, 5, 5, 5, 6, 7,