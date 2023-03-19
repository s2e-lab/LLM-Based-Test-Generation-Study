# id_154_Test.java
from original.id_154 import cycpattern_check

import pytest

class id_154_Test:
    """
    Test class of id_154.py.
    It contains ten unit test cases for the :func:`original.id_154.cycpattern_check`.
    """


    def test_cycpattern_check_1(self):
        """
        Test case 1 for cycpattern_check.
        """
        assert cycpattern_check("abcd","abd") == False

    def test_cycpattern_check_2(self):
        """
        Test case 2 for cycpattern_check.
        """
        assert cycpattern_check("hello","ell") == True

    def test_cycpattern_check_3(self):
        """
        Test case 3 for cycpattern_check.
        """
        assert cycpattern_check("whassup","psus") == False

    def test_cycpattern_check_4(self):
        """
        Test case 4 for cycpattern_check.
        """
        assert cycpattern_check("abab","baa") == True

    def test_cycpattern_check_5(self):
        """
        Test case 5 for cycpattern_check.
        """
        assert cycpattern_check("efef","eeff") == False

    def test_cycpattern_check_6(self):
        """
        Test case 6 for cycpattern_check.
        """
        assert cycpattern_check("himenss","simen") == True

    def test_cycpattern_check_7(self):
        """
        Test case 7 for cycpattern_check.
        """
        assert cycpattern_check("abcd","abd") == False

    def test_cycpattern_check_8(self):
        """
        Test case 8 for cycpattern_check.
        """
        assert cycpattern_check("hello","ell") == True

    def test_cycpattern_check_9(self):
        """
        Test case 9 for cycpattern_check.
        """
        assert cycpattern_check("whassup","psus") == False

    def test_cycpattern_check_10(self):
        """
        Test case 10 for cycpattern_check.
        """
        assert cycpattern_check("abab","baa") == True

# id_154_Test.py
from original.id_154 import cycpattern_check

import pytest

class id_154_Test:
    """
    Test class of id_154.py.
    It contains ten unit test cases for the :func:`original.id_154.cycpattern_check`.
    """
		
    def test_cycpattern_check_1(self):
        """
        Test case 1 for cycpattern_check.
        """
        assert cycpattern_check("abcd","abd") == False

    def test_cycpattern_check_2(self):
        """
        Test case 2 for cycpattern_check.
        """
        assert cycpattern_check("hello","ell") == True

    def test_cycpattern_check_3(self):
        """
        Test case 3 for cycpattern_check.
        """
        assert cycpattern_check("whassup","psus") == False

    def test_cycpattern_check_4(self):
        """
        Test case 4 for cycpattern_check.
        """
        assert cycpattern_check("abab","baa") == True

    def test_cycpattern_check_5(self):
        """
        Test case 5 for cycpattern_check.
        """
        assert cycpattern_check("efef","eeff") == False

    def test_cycpattern_check_6(self):
        """
        Test case 6 for cycpattern_check.
        """
        assert cycpattern_check("himenss","simen") == True

    def test_cycpattern_check_7(self):
        """
        Test case 7 for cycpattern_check.
        """
        assert cycpattern_check("abcd","abd") == False

    def test_cycpattern_check_8(self):
        """
        Test case 8 for cycpattern_check.
        """
        assert cycpattern_check("hello","ell") == True

    def test_cycpattern_check_9(self):
        """
        Test case 9 for cycpattern_check.
        """
        assert cycpattern_check("whassup","psus") == False

    def test_cycpattern_check_10(self):
        """
        Test case 10 for cycpattern_check.
        """
        assert cycpattern_check("abab","baa") == True

# id_155.py

def is_palindrome(a):
    """You are given a string. You need to return True if the string is a palindrome, else return False.
    is_palindrome("abba") => True
    is_palindrome("abbccbba") => True
    is_palindrome("madam") => True
    is_palindrome("abcd") => False
    is_palindrome("a") => True
    is_palindrome("") => True

    """

    return a == a[::-1]

# id_155_Test.java
from original.id_155 import is_palindrome

import pytest

class id_155_Test:
    """
    Test class of id_155.py.
    It contains ten unit test cases for the :func:`original.id_155.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for is_palindrome.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 for is_palindrome.
        """
        assert is_palindrome("abbccbba") == True

    def test_is_palindrome_3(self):
        """
        Test case 3 for is_palindrome.
        """
        assert is_palindrome("madam") == True

    def test_is_palindrome_4(self):
        """
        Test case 4 for is_palindrome.
        """
        assert is_palindrome("abcd") == False

    def test_is_palindrome_5(self):
        """
        Test case 5 for is_palindrome.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_6(self):
        """
        Test case 6 for is_palindrome.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_7(self):
        """
        Test case 7 for is_palindrome.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_8(self):
        """
        Test case 8 for is_palindrome.
        """
        assert is_palindrome("abbccbba") == True

    def test_is_palindrome_9(self):
        """
        Test case 9 for is_palindrome.
        """
        assert is_palindrome("madam") == True

    def test_is_palindrome_10(self):
        """
        Test case 10 for is_palindrome.
        """
        assert is_palindrome("abcd") == False

# id_155_Test.py
from original.id_155 import is_palindrome

import pytest

class id_155_Test:
    """
    Test class of id_155.py.
    It contains ten unit test cases for the :func:`original.id_155.is_palindrome`.
    """
		
    def test_is_palindrome_1(self):
        """
        Test case 1 for is_palindrome.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_2(self):
        """
        Test case 2 for is_palindrome.
        """
        assert is_palindrome("abbccbba") == True

    def test_is_palindrome_3(self):
        """
        Test case 3 for is_palindrome.
        """
        assert is_palindrome("madam") == True

    def test_is_palindrome_4(self):
        """
        Test case 4 for is_palindrome.
        """
        assert is_palindrome("abcd") == False

    def test_is_palindrome_5(self):
        """
        Test case 5 for is_palindrome.
        """
        assert is_palindrome("a") == True

    def test_is_palindrome_6(self):
        """
        Test case 6 for is_palindrome.
        """
        assert is_palindrome("") == True

    def test_is_palindrome_7(self):
        """
        Test case 7 for is_palindrome.
        """
        assert is_palindrome("abba") == True

    def test_is_palindrome_8(self):
        """
        Test case 8 for is_palindrome.
        """
        assert is_palindrome("abbccbba") == True

    def test_is_palindrome_9(self):
        """
        Test case 9 for is_palindrome.
        """
        assert is_palindrome("madam") == True

    def test_is_palindrome_10(self):
        """
        Test case 10 for is_palindrome.
        """
        assert is_palindrome("abcd") == False

# id_156.py

def is_palindrome_rec(a):
    """You are given a string. You need to return True if the string is a palindrome, else return False.
    is_palindrome_rec("abba") => True
    is_palindrome_rec("abbccbba") => True
    is_palindrome_rec("madam") => True
    is_palindrome_rec("abcd") => False
    is_palindrome_rec("a") => True
    is_palindrome_rec("") => True

    """

    if len(a) <= 1:
        return True
    else:
        return a[0] == a[-1] and is_palindrome_rec(a[1:-1])

# id_156_Test.java
from original.id_156 import is_palindrome_rec

import pytest

class id_156_Test:
    """
    Test class of id_156.py.
    It contains ten unit test cases for the :func:`original.id_156.is_palindrome_rec`.
    """
		
    def test_is_palindrome_rec_1(self):
        """
        Test case 1 for is_palindrome_rec.
        """
        assert is_palindrome_rec("abba") == True

    def test_is_palindrome_rec_2(self):
        """
        Test case 2 for is_palindrome_rec.
        """
        assert is_palindrome_rec("abbccbba") == True

    def test_is_palindrome_rec_3(self):
        """
        Test case 3 for is_palindrome_rec.
        """
        assert is_palindrome_rec("madam") == True

    def test_is_palindrome_rec_4(self):
        """
        Test case 4 for is_palindrome_rec.
        """
        assert is_palindrome_rec("abcd") == False

    def test_is_palindrome_rec_5(self):
        """
        Test case 5 for is_palindrome_rec.
        """
        assert is_palindrome_rec("a") == True

    def test_is_palindrome_rec_6(self):
        """
        Test case 6 for is_palindrome_rec.
        """
        assert is_palindrome_rec("") == True

    def test_is_palindrome_rec_7(self):
        """
        Test case 7 for is_palindrome_rec.
        """
        assert is_palindrome_rec("abba") == True

    def test_is_palindrome_rec_8(self):
        """
        Test case 8 for is_palindrome_rec.
        """
        assert is_palindrome_rec("abbccbba") == True

    def test_is_palindrome_rec_9(self):
        """
        Test case 9 for is_palindrome_rec.
        """
        assert is_palindrome_rec("madam") == True

    def test_is_palindrome_rec_10(self):
        """
        Test case 10 for is_palindrome_rec.
        """
        assert is_palindrome_rec("abcd") == False

# id_156_Test.py
from original.id_156 import is_palindrome_rec

import pytest

class id_156_Test:
    """
    Test class of id_156.py.
    It contains ten unit test cases for the :func:`original.id_156.is_palindrome_rec`.
    """
		
    def test_is_palindrome_rec_1(self):
        """
        Test case 1 for is_palindrome_rec.
        """
        assert is_palindrome_rec("abba") == True

    def test_is_palindrome_rec_2(self):
        """
        Test case 2 for is_palindrome_rec.
        """
        assert is_palindrome_rec("abbccbba") == True

    def test_is_palindrome_rec_3(self):
        """
        Test case 3 for is_palindrome_rec.
        """
        assert is_palindrome_rec("madam") == True

    def test_is_palindrome_rec_4(self):
        """
        Test case 4 for is_palindrome_rec.
        """
        assert is_palindrome_rec("abcd") == False

    def test_is_palindrome_rec_5(self):
        """
        Test case 5 for is_palindrome_rec.
        """
        assert is_palindrome_rec("a") == True

    def test_is_palindrome_rec_6(self):
        """
        Test case 6 for is_palindrome_rec.
        """
        assert is_palindrome_rec("") == True

    def test_is_palindrome_rec_7(self):
        """
        Test case 7 for is_palindrome_rec.
        """
        assert is_palindrome_rec("abba") == True

    def test_is_palindrome_rec_8(self):
        """
        Test case 8 for is_palindrome_rec.
        """
        assert is_palindrome_rec("abbccbba") == True

    def test_is_palindrome_rec_9(self):
        """
        Test case 9 for is_palindrome_rec.
        """
        assert is_palindrome_rec("madam") == True

    def test_is_palindrome_rec_10(self):
        """
        Test case 10 for is_palindrome_rec.
        """
        assert is_palindrome_rec("abcd") == False

# id_157.py

def is_palindrome_rec_2(a):
    """You are given a string. You need to return True if the string is a palindrome, else return False.
    is_palindrome_rec_2("abba") => True
    is_palindrome_rec_2("abbccbba") => True
    is_palindrome_rec_2("madam") => True
    is_palindrome_rec_2("abcd") => False
    is_palindrome_rec_2("a") => True
    is_palindrome_rec_2("") => True

    """

    if len(a) <= 1:
        return True
    else:
        return a[0] == a[-1] and is_palindrome_rec_2(a[1:-1])

# id_157_Test.java
from original.id_157 import is_palindrome_rec_2

import pytest

class id_157_Test:
    """
    Test class of id_157.py.
    It contains ten unit