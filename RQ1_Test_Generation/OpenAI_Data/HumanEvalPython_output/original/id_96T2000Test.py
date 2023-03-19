# id_96_Test.java
from original.id_96 import count_up_to

import pytest

class id_96_Test:
    """
    Test class of id_96.py.
    It contains ten unit test cases for the :func:`original.id_96.count_up_to`.
    """


    def test_count_up_to_1(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(5) == [2, 3]

    def test_count_up_to_2(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(11) == [2, 3, 5, 7]

    def test_count_up_to_3(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(0) == []

    def test_count_up_to_4(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(20) == [2, 3, 5, 7, 11, 13, 17, 19]

    def test_count_up_to_5(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(1) == []

    def test_count_up_to_6(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(18) == [2, 3, 5, 7, 11, 13, 17]

    def test_count_up_to_7(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(2) == []

    def test_count_up_to_8(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(3) == [2]

    def test_count_up_to_9(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(4) == [2, 3]

    def test_count_up_to_10(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(5) == [2, 3]

# id_96_Test.py
from original.id_96 import count_up_to

import pytest

class id_96_Test:
    """
    Test class of id_96.py.
    It contains ten unit test cases for the :func:`original.id_96.count_up_to`.
    """
		
    def test_count_up_to_1(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(5) == [2, 3]

    def test_count_up_to_2(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(11) == [2, 3, 5, 7]

    def test_count_up_to_3(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(0) == []

    def test_count_up_to_4(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(20) == [2, 3, 5, 7, 11, 13, 17, 19]

    def test_count_up_to_5(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(1) == []

    def test_count_up_to_6(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(18) == [2, 3, 5, 7, 11, 13, 17]

    def test_count_up_to_7(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(2) == []

    def test_count_up_to_8(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(3) == [2]

    def test_count_up_to_9(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(4) == [2, 3]

    def test_count_up_to_10(self):
        """
        Test case for the function :func:`original.id_96.count_up_to`.
        """
        assert count_up_to(5) == [2, 3]

# id_97.py

def count_up_to(n):
    """Implement a function that takes an non-negative integer and returns an array of the first n
    integers that are prime numbers and less than n.
    for example:
    count_up_to(5) => [2,3]
    count_up_to(11) => [2,3,5,7]
    count_up_to(0) => []
    count_up_to(20) => [2,3,5,7,11,13,17,19]
    count_up_to(1) => []
    count_up_to(18) => [2,3,5,7,11,13,17]
    """

    primes = []
    for i in range(2, n):
        is_prime = True
        for j in range(2, i):
            if i % j == 0:
                is_prime = False
                break
        if is_prime:
            primes.append(i)
    return primes


# id_97_Test.java
from original.id_97 import count_up_to

import pytest

class id_97_Test:
    """
    Test class of id_97.py.
    It contains ten unit test cases for the :func:`original.id_97.count_up_to`.
    """
		
    def test_count_up_to_1(self):
        """
        Test case for the function :func:`original.id_97.count_up_to`.
        """
        assert count_up_to(5) == [2, 3]

    def test_count_up_to_2(self):
        """
        Test case for the function :func:`original.id_97.count_up_to`.
        """
        assert count_up_to(11) == [2, 3, 5, 7]

    def test_count_up_to_3(self):
        """
        Test case for the function :func:`original.id_97.count_up_to`.
        """
        assert count_up_to(0) == []

    def test_count_up_to_4(self):
        """
        Test case for the function :func:`original.id_97.count_up_to`.
        """
        assert count_up_to(20) == [2, 3, 5, 7, 11, 13, 17, 19]

    def test_count_up_to_5(self):
        """
        Test case for the function :func:`original.id_97.count_up_to`.
        """
        assert count_up_to(1) == []

    def test_count_up_to_6(self):
        """
        Test case for the function :func