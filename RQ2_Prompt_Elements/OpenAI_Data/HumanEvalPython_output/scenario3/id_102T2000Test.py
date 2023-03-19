# id_102_Test.java
from scenario3.id_102 import choose_num

import pytest

class id_102_Test:
    """
    Test class of id_102.py.
    It contains ten unit test cases for the :func:`scenario3.id_102.choose_num`.
    """


    def test_choose_num_1(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(12, 15) == 14

    def test_choose_num_2(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(13, 12) == -1

    def test_choose_num_3(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(0, 0) == 0

    def test_choose_num_4(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(0, 1) == 0

    def test_choose_num_5(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(1, 0) == -1

    def test_choose_num_6(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(1, 1) == -1

    def test_choose_num_7(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(1, 2) == 2

    def test_choose_num_8(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(2, 1) == 2

    def test_choose_num_9(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(2, 2) == 2

    def test_choose_num_10(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(2, 3) == 2

# id_102_Test.py
from scenario3.id_102 import choose_num

import pytest

class id_102_Test:
    """
    Test class of id_102.py.
    It contains ten unit test cases for the :func:`scenario3.id_102.choose_num`.
    """
		
    def test_choose_num_1(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(12, 15) == 14

    def test_choose_num_2(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(13, 12) == -1

    def test_choose_num_3(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(0, 0) == 0

    def test_choose_num_4(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(0, 1) == 0

    def test_choose_num_5(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(1, 0) == -1

    def test_choose_num_6(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(1, 1) == -1

    def test_choose_num_7(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(1, 2) == 2

    def test_choose_num_8(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(2, 1) == 2

    def test_choose_num_9(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(2, 2) == 2

    def test_choose_num_10(self):
        """
        Test case for the function :func:`scenario3.id_102.choose_num`.
        """
        assert choose_num(2, 3) == 2

# id_103.py

def is_prime(n):
    """This function takes a positive integer n and returns True if n is a
    prime number and False otherwise.

    For example:
    is_prime(2) = True
    is_prime(3) = True
    is_prime(4) = False
    """

    pass
# id_103_Test.java
from scenario3.id_103 import is_prime

import pytest

class id_103_Test:
    """
    Test class of id_103.py.
    It contains ten unit test cases for the :func:`scenario3.id_103.is_prime`.
    """
		
    def test_is_prime_1(self):
        """
        Test case for the function :func:`scenario3.id_103.is_prime`.
        """
        assert is_prime(2) == True

    def test_is_prime_2(self):
        """
        Test case for the function :func:`scenario3.id_103.is_prime`.
        """
        assert is_prime(3) == True

    def test_is_prime_3(self):
        """
        Test case for the function :func:`scenario3.id_103.is_prime`.
        """
        assert is_prime(4) == False

    def test_is_prime_4(self):
        """
        Test case for the function :func:`scenario3.id_103.is_prime`.
        """
        assert is_prime(5) == True

    def test_is_prime_5(self):
        """
        Test case for the function :func:`scenario3.id_103.is_prime`.
        """
        assert is_prime(6) == False

    def test_is_prime_6(self):
        """
        Test case for the function :func:`scenario3.id_103.is_prime`.
        """
        assert is_prime(7) == True

    def test_is_prime_7(self):
        """
        Test case for the function :func:`scenario3.id_103.is_prime`.
        """
        assert is_prime(8) == False

    def test_is_prime_8(self):
        """
        Test case for the function :func:`scenario3.id_103.is_prime`.
        """
        assert is_prime(9) == False

    def test_is_prime_9(self):
        """
        Test case for the function :func:`scenario3.id_103.is_prime`.
        """
        assert is_prime(10) == False

    def test_is_prime_10(self):
        """
        Test case for the function :func:`scenario3.id_103.is_prime`.
        """
        assert is_prime(11) == True

# id_103_Test.py
from scenario3.id_103 import is_prime

import pytest

class id_103_Test:
    """
    Test class of id_103.py.
    It contains ten unit test cases for the :func:`scenario3.id_103.is_prime`.
