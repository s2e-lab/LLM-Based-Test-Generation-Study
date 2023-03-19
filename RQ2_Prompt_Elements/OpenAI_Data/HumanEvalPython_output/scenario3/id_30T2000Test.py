# id_30_Test.java
from scenario3.id_30 import get_positive

import pytest

class id_30_Test:
    """
    Test class of id_30.py.
    It contains ten unit test cases for the :func:`scenario3.id_30.get_positive`.
    """


    def test_get_positive_1(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, 2, -4, 5, 6]) == [2, 5, 6]

    def test_get_positive_2(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10]) == [5, 3, 2, 3, 9, 123, 1]

    def test_get_positive_3(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6]) == []

    def test_get_positive_4(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0]) == []

    def test_get_positive_5(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0, 1]) == [1]

    def test_get_positive_6(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0, 1, 2]) == [1, 2]

    def test_get_positive_7(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0, 1, 2, 3]) == [1, 2, 3]

    def test_get_positive_8(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0, 1, 2, 3, 4]) == [1, 2, 3, 4]

    def test_get_positive_9(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_get_positive_10(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0, 1, 2, 3, 4, 5, 6]) == [1, 2, 3, 4, 5, 6]

# id_30_Test.py
from scenario3.id_30 import get_positive

import pytest

class id_30_Test:
    """
    Test class of id_30.py.
    It contains ten unit test cases for the :func:`scenario3.id_30.get_positive`.
    """
		
    def test_get_positive_1(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, 2, -4, 5, 6]) == [2, 5, 6]

    def test_get_positive_2(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10]) == [5, 3, 2, 3, 9, 123, 1]

    def test_get_positive_3(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6]) == []

    def test_get_positive_4(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0]) == []

    def test_get_positive_5(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0, 1]) == [1]

    def test_get_positive_6(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0, 1, 2]) == [1, 2]

    def test_get_positive_7(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0, 1, 2, 3]) == [1, 2, 3]

    def test_get_positive_8(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0, 1, 2, 3, 4]) == [1, 2, 3, 4]

    def test_get_positive_9(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0, 1, 2, 3, 4, 5]) == [1, 2, 3, 4, 5]

    def test_get_positive_10(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0, 1, 2, 3, 4, 5, 6]) == [1, 2, 3, 4, 5, 6]

# id_30_Test.java
from scenario3.id_30 import get_positive

import pytest

class id_30_Test:
    """
    Test class of id_30.py.
    It contains ten unit test cases for the :func:`scenario3.id_30.get_positive`.
    """
		
    def test_get_positive_1(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, 2, -4, 5, 6]) == [2, 5, 6]

    def test_get_positive_2(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([5, 3, -5, 2, -3, 3, 9, 0, 123, 1, -10]) == [5, 3, 2, 3, 9, 123, 1]

    def test_get_positive_3(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6]) == []

    def test_get_positive_4(self):
        """
        Test case for the :func:`scenario3.id_30.get_positive`.
        """
        assert get_positive([-1, -2, -4, -5, -6, 0