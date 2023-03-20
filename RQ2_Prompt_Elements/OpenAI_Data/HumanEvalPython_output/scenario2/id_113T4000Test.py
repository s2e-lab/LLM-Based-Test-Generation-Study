# id_113_Test.java
from scenario2.id_113 import odd_count

import pytest

class id_113_Test:
    """
    Test class of id_113.py.
    It contains ten unit test cases for the :func:`scenario2.id_113.odd_count`.
    """


    def test_odd_count_1(self):
        """
        Test case 1 for :func:`scenario2.id_113.odd_count`.
        """
        assert odd_count(["1", "2", "3", "4", "5"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 1n the str1ng 2 of the 1nput.", "the number of odd elements 1n the str1ng 3 of the 1nput.", "the number of odd elements 1n the str1ng 4 of the 1nput.", "the number of odd elements 1n the str1ng 5 of the 1nput."]

    def test_odd_count_2(self):
        """
        Test case 2 for :func:`scenario2.id_113.odd_count`.
        """
        assert odd_count(["1", "2", "3", "4", "5", "6", "7", "8", "9", "10"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 1n the str1ng 2 of the 1nput.", "the number of odd elements 1n the str1ng 3 of the 1nput.", "the number of odd elements 1n the str1ng 4 of the 1nput.", "the number of odd elements 1n the str1ng 5 of the 1nput.", "the number of odd elements 1n the str1ng 6 of the 1nput.", "the number of odd elements 1n the str1ng 7 of the 1nput.", "the number of odd elements 1n the str1ng 8 of the 1nput.", "the number of odd elements 1n the str1ng 9 of the 1nput.", "the number of odd elements 1n the str1ng 10 of the 1nput."]

    def test_odd_count_3(self):
        """
        Test case 3 for :func:`scenario2.id_113.odd_count`.
        """
        assert odd_count(["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 1n the str1ng 2 of the 1nput.", "the number of odd elements 1n the str1ng 3 of the 1nput.", "the number of odd elements 1n the str1ng 4 of the 1nput.", "the number of odd elements 1n the str1ng 5 of the 1nput.", "the number of odd elements 1n the str1ng 6 of the 1nput.", "the number of odd elements 1n the str1ng 7 of the 1nput.", "the number of odd elements 1n the str1ng 8 of the 1nput.", "the number of odd elements 1n the str1ng 9 of the 1nput.", "the number of odd elements 1n the str1ng 10 of the 1nput.", "the number of odd elements 1n the str1ng 11 of the 1nput.", "the number of odd elements 1n the str1ng 12 of the 1nput.", "the number of odd elements 1n the str1ng 13 of the 1nput.", "the number of odd elements 1n the str1ng 14 of the 1nput.", "the number of odd elements 1n the str1ng 15 of the 1nput.", "the number of odd elements 1n the str1ng 16 of the 1nput.", "the number of odd elements 1n the str1ng 17 of the 1nput.", "the number of odd elements 1n the str1ng 18 of the 1nput.", "the number of odd elements 1n the str1ng 19 of the 1nput.", "the number of odd elements 1n the str1ng 20 of the 1nput."]

    def test_odd_count_4(self):
        """
        Test case 4 for :func:`scenario2.id_113.odd_count`.
        """
        assert odd_count(["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 1n the str1ng 2 of the 1nput.", "the number of odd elements 1n the str1ng 3 of the 1nput.", "the number of odd elements 1n the str1ng 4 of the 1nput.", "the number of odd elements 1n the str1ng 5 of the 1nput.", "the number of odd elements 1n the str1ng 6 of the 1nput.", "the number of odd elements 1n the str1ng 7 of the 1nput.", "the number of odd elements 1n the str1ng 8 of the 1nput.", "the number of odd elements 1n the str1ng 9 of the 1nput.", "the number of odd elements 1n the str1ng 10 of the 1nput.", "the number of odd elements 1n the str1ng 11 of the 1nput.", "the number of odd elements 1n the str1ng 12 of the 1nput.", "the number of odd elements 1n the str1ng 13 of the 1nput.", "the number of odd elements 1n the str1ng 14 of the 1nput.", "the number of odd elements 1n the str1ng 15 of the 1nput.", "the number of odd elements 1n the str1ng 16 of the 1nput.", "the number of odd elements 1n the str1ng 17 of the 1nput.", "the number of odd elements 1n the str1ng 18 of the 1nput.", "the number of odd elements 1n the str1ng 19 of the 1nput.", "the number of odd elements 1n the str1ng 20 of the 1nput.", "the number of odd elements 1n the str1ng 21 of the 1nput.", "the number of odd elements 1n the str1ng 22 of the 1nput.", "the number of odd elements 1n the str1ng 23 of the 1nput.", "the number of odd elements 1n the str1ng 24 of the 1nput.", "the number of odd elements 1n the str1ng 25 of the 1nput.", "the number of odd elements 1n the str1ng 26 of the 1nput.", "the number of odd elements 1n the str1ng 27 of the 1nput.", "the number of odd elements 1n the str1ng 28 of the 1nput.", "the number of odd elements 1n the str1ng 29 of the 1nput.", "the number of odd elements 1n the str1ng 30 of the 1nput.", "the number of odd elements 1n the str1ng 31 of the 1nput.", "the number of odd elements 1n the str1ng 32 of the 1nput.", "the number of odd elements 1n the str1ng 33 of the 1nput.", "the number of odd elements 1n the str1ng 34 of the 1nput.", "the number of odd elements 1n the str1ng 35 of the 1nput.", "the number of odd elements 1n the str1ng 36 of the 1nput.", "the number of odd elements 1n the str1ng 37 of the 1nput.", "the number of odd elements 1n the str1ng 38 of the 1nput.", "the number of odd elements 1n the str1ng 39 of the 1nput.", "the number of odd elements 1n the str1ng 40 of the 1nput.", "the number of odd elements 1n the str1ng 41 of the 1nput.", "the number of odd elements 1n the str1ng 42 of the 1nput.", "the number of odd elements 1n the str1ng 43 of the 1nput.", "the number of odd elements 1n the str1ng 44 of the 1nput.", "the number of odd elements 1n the str1ng 45 of the 1nput.", "the number of odd elements 1n the str1ng 46 of the 1nput.", "the number of odd elements 1n the str1ng 47 of the 1nput.", "the number of odd elements 1n the str1ng 48 of the 1nput.", "the number of odd elements 1n the str1ng 49 of the 1nput.", "the number of odd elements 1n the str1ng 50 of the 1nput."]

    def test_odd_count_5(self):
        """
        Test case 5 for :func:`scenario2.id_113.odd_count`.
        """
        assert odd_count(["1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31", "32", "33", "34", "35", "36", "37", "38", "39", "40", "41", "42", "43", "44", "45", "46", "47", "48", "49", "50", "51", "52", "53", "54", "55", "56", "57", "58", "59", "60", "61", "62", "63", "64", "65", "66", "67", "68", "69", "70", "71", "72", "73", "74", "75", "76", "77", "78", "79", "80", "81", "82", "83", "84", "85", "86", "87", "88", "89", "90", "91", "92", "93", "94", "95", "96", "97", "98", "99", "100"]) == ["the number of odd elements 1n the str1ng 1 of the 1nput.", "the number of odd elements 1n the str1ng 2 of the 1nput.", "the number of odd elements 1n the str1ng 3 of the 1nput.", "the number of odd elements 1n the str1ng 4 of the 1nput.", "the number of odd elements 1n the str1ng 5 of the 1nput.", "the number of odd elements 1n the str1ng 6 of the 1nput.", "the number of odd elements 1n the str1ng 7 of the 1nput.", "the number of odd elements 1n the str1ng 8 of the 1nput.", "the number of odd elements 1n the str1ng 9 of the 1nput.", "the number of odd elements 1n the str1ng 10 of the 1nput.", "the number of odd elements 1n the str1ng 11 of the 1nput.", "the number of odd elements 1n the str1ng 12 of the 1nput.", "the number of odd elements 1n the str1ng 13 of the 1nput.", "the number of odd elements 1n the str1ng 14 of the 1nput.", "the number of odd elements 1n the str1ng 15 of the 1nput.", "the number of odd elements 1n the str1ng 16 of the 1nput.", "the number of odd elements 1n the str1ng 17 of the 1nput.", "the number of odd elements 1n the str1ng 18 of the 1nput.", "the number of odd elements 1n the str1ng 19 of the 1nput.", "the number of odd elements 1n the str1ng 20 of the 1nput.", "the number of odd elements 1n the str1ng 21 of the 1nput.", "the number of odd elements 1n the str1ng 22 of the 1nput.", "the number of odd elements 1n the str1ng 23 of the 1nput.", "the number of odd elements 1n the str1ng 24 of the 1nput.", "the number of odd elements 1n the str1ng 25 of the 1nput.", "the number of odd elements 1n the str1ng 26 of the 1nput.", "the number of odd elements 1n the str1ng 27 of the 1nput.", "the number of odd elements 1n the str1ng 28 of the 1nput.", "the number of odd elements 1n the str1ng 29 of the 1nput.", "the number of odd elements 1n the str1ng 30 of the 1nput.", "the number of odd elements 1n the str1ng 31 of the 1nput.", "the number of odd elements 1n the str1ng 32 of the 1nput.", "the number of odd elements 1n the str1ng 33 of the 1nput.", "the number of odd elements 1n the str1ng 34 of the 1nput.", "the number of odd elements 1n the str1ng 35 of the 1nput.", "the number of odd elements 1n the str1ng 36 of the 1nput.", "the number of odd elements 1n the str1ng 37 of the 1nput.", "the number of odd elements 1n the str1ng 38 of the 1nput.", "the number of odd elements 1n the str1ng 39 of the 1nput.", "the number of odd elements 1n the str1ng 40 of the 1nput.", "the number of odd elements 1n the str1ng 41 of the 1nput.", "the number of odd elements 1n the str1ng 42 of the 1nput.", "the number of odd elements 1n the str1ng 43 of the 1nput.", "the number of odd elements 1n the str1ng 44 of the 1nput.", "the number of odd elements 1n the str1ng 45 of the 1nput.", "the number of odd elements 1n the str1ng 46 of the 1nput.", "the number of odd elements 1n the str1ng 47 of the 1nput.", "the number of odd elements 1n the str1ng 48 of the 1nput.", "the number of odd elements 1n the str1ng 49 of the 1nput.", "the number of odd elements 1n the str1ng 50 of the 1nput.", "the number of odd elements 1n the str1ng 51 of the 1nput.", "the number of odd elements 1n the str1ng 52 of the 1nput.", "the number of odd elements 1n the str1ng 53 of the 1nput.", "the number of odd elements 1n the str1ng 54 of the 1nput.", "the number of odd elements 1n the str1ng 55 of the 1nput.", "the number of odd elements 1n the str1ng 56 of the 1nput.", "the number of odd elements 1n the str1ng 57 of the 1nput.", "the number of odd elements 1n the str1ng 58 of the 1nput.", "the number of odd elements 1n the str1ng 59 of the 1nput.", "the number of odd elements 1n the str1ng 60 of the 1nput.", "the number of odd elements 1n the str1ng 61 of the 1nput.", "the number of odd elements 1n the str1ng 62 of the 1nput.", "the number of odd elements 1n the str1ng 63 of the 1nput.", "the number of odd elements 1n the str1ng 64 of the 1nput.", "the number of odd elements 1n the str1ng 65 of the 1nput.", "the number of odd elements 1n the str1ng 66 of the 1nput.", "the number of odd elements 1n the str1ng 67 of the 1nput.", "the number of odd elements 1n the str1ng 68 of the 1nput.", "the number of odd elements 1n the str1ng 69 of the 1nput.", "the number of odd elements 1n the str1ng 70 of the 1nput.", "the number of odd elements 1n the str1ng 71 of the 1nput.", "the number of odd elements 1n the str1ng 72 of the 1nput.", "the number of odd elements 1n the str1ng 73 of the 1nput.", "the number of odd elements 1n the str1ng 74 of the 1nput.", "the number of odd elements 1n the str1ng 75 of the 1nput.", "the number of odd elements 1n the str1ng 76 of the 1nput.", "the number of odd elements 1n the str1ng 77 of the 1nput.", "the number of odd elements 1n the str1ng 78 of the 1nput.", "the number of odd elements 1n the str1ng 79 of the 1nput.", "the number of odd elements 1n the str1ng 80 of the 1nput.", "the number of odd elements 1n the str1ng 81 of the 1nput.", "the number of odd elements 1n the str1ng 82 of the 1nput.", "the number of odd elements 1n the str1ng 83 of the 1nput