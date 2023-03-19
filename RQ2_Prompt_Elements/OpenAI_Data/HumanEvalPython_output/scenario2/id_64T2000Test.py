# id_64_Test.java
from scenario2.id_64 import vowels_count

import pytest

class id_64_Test:
    """
    Test class of id_64.py.
    It contains ten unit test cases for the :func:`scenario2.id_64.vowels_count`.
    """


    def test_vowels_count_1(self):
        """
        Test case for the function :func:`scenario2.id_64.vowels_count`.
        """
        assert vowels_count("hello") == 2
        assert vowels_count("world") == 1
        assert vowels_count("y") == 1
        assert vowels_count("") == 0
        assert vowels_count("a") == 1
        assert vowels_count("e") == 1
        assert vowels_count("i") == 1
        assert vowels_count("o") == 1
        assert vowels_count("u") == 1
        assert vowels_count("y") == 1
        assert vowels_count("A") == 1
        assert vowels_count("E") == 1
        assert vowels_count("I") == 1
        assert vowels_count("O") == 1
        assert vowels_count("U") == 1
        assert vowels_count("Y") == 1
        assert vowels_count("aeiou") == 5
        assert vowels_count("AEIOU") == 5
        assert vowels_count("aeiouy") == 6
        assert vowels_count("AEIOUY") == 6
        assert vowels_count("aeiouyAEIOUY") == 12
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUY") == 24
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 36
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 48
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 60
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 72
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 84
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 96
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 108
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 120
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 132
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 144
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 156
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 168
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 180
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 192
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 204
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUY") == 216
        assert vowels_count("aeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiouyAEIOUYaeiou