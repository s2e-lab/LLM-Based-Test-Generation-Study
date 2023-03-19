# id_156_Test.java
from scenario2.id_156 import int_to_mini_roman

import pytest

class id_156_Test:
    """
    Test class of id_156.py.
    It contains ten unit test cases for the :func:`scenario2.id_156.int_to_mini_roman`.
    """


    def test_int_to_mini_roman_1(self):
        """
        Test case for the :func:`scenario2.id_156.int_to_mini_roman` function.
        """
        assert int_to_mini_roman(1) == 'i'
        assert int_to_mini_roman(4) == 'iv'
        assert int_to_mini_roman(5) == 'v'
        assert int_to_mini_roman(9) == 'ix'
        assert int_to_mini_roman(10) == 'x'
        assert int_to_mini_roman(40) == 'xl'
        assert int_to_mini_roman(50) == 'l'
        assert int_to_mini_roman(90) == 'xc'
        assert int_to_mini_roman(100) == 'c'
        assert int_to_mini_roman(400) == 'cd'
        assert int_to_mini_roman(500) == 'd'
        assert int_to_mini_roman(900) == 'cm'
        assert int_to_mini_roman(1000) == 'm'
        assert int_to_mini_roman(3) == 'iii'
        assert int_to_mini_roman(11) == 'xi'
        assert int_to_mini_roman(19) == 'xix'
        assert int_to_mini_roman(44) == 'xliv'
        assert int_to_mini_roman(99) == 'xcix'
        assert int_to_mini_roman(499) == 'cdxcix'
        assert int_to_mini_roman(999) == 'cmxcix'
        assert int_to_mini_roman(3999) == 'mmmcmxciii'
        assert int_to_mini_roman(0) == ''
        assert int_to_mini_roman(1001) == ''
        assert int_to_mini_roman(-1) == ''
        assert int_to_mini_roman(1.5) == ''
        assert int_to_mini_roman('a') == ''
        assert int_to_mini_roman(None) == ''
        assert int_to_mini_roman([]) == ''
        assert int_to_mini_roman({}) == ''
        assert int_to_mini_roman(()) == ''
        assert int_to_mini_roman(True) == ''
        assert int_to_mini_roman(False) == ''
        assert int_to_mini_roman(1+2j) == ''
        assert int_to_mini_roman(1j) == ''
        assert int_to_mini_roman(1.0) == ''
        assert int_to_mini_roman(1.0+0j) == ''
        assert int_to_mini_roman(1.0+1j) == ''
        assert int_to_mini_roman(1.0+2j) == ''
        assert int_to_mini_roman(1.0+3j) == ''
        assert int_to_mini_roman(1.0+4j) == ''
        assert int_to_mini_roman(1.0+5j) == ''
        assert int_to_mini_roman(1.0+6j) == ''
        assert int_to_mini_roman(1.0+7j) == ''
        assert int_to_mini_roman(1.0+8j) == ''
        assert int_to_mini_roman(1.0+9j) == ''
        assert int_to_mini_roman(1.0+10j) == ''
        assert int_to_mini_roman(1.0+11j) == ''
        assert int_to_mini_roman(1.0+12j) == ''
        assert int_to_mini_roman(1.0+13j) == ''
        assert int_to_mini_roman(1.0+14j) == ''
        assert int_to_mini_roman(1.0+15j) == ''
        assert int_to_mini_roman(1.0+16j) == ''
        assert int_to_mini_roman(1.0+17j) == ''
        assert int_to_mini_roman(1.0+18j) == ''
        assert int_to_mini_roman(1.0+19j) == ''
        assert int_to_mini_roman(1.0+20j) == ''
        assert int_to_mini_roman(1.0+21j) == ''
        assert int_to_mini_roman(1.0+22j) == ''
        assert int_to_mini_roman(1.0+23j) == ''
        assert int_to_mini_roman(1.0+24j) == ''
        assert int_to_mini_roman(1.0+25j) == ''
        assert int_to_mini_roman(1.0+26j) == ''
        assert int_to_mini_roman(1.0+27j) == ''
        assert int_to_mini_roman(1.0+28j) == ''
        assert int_to_mini_roman(1.0+29j) == ''
        assert int_to_mini_roman(1.0+30j) == ''
        assert int_to_mini_roman(1.0+31j) == ''
        assert int_to_mini_roman(1.0+32j) == ''
        assert int_to_mini_roman(1.0+33j) == ''
        assert int_to_mini_roman(1.0+34j) == ''
        assert int_to_mini_roman(1.0+35j) == ''
        assert int_to_mini_roman(1.0+36j) == ''
        assert int_to_mini_roman(1.0+37j) == ''
        assert int_to_mini_roman(1.0+38j) == ''
        assert int_to_mini_roman(1.0+39j) == ''
        assert int_to_mini_roman(1.0+40j) == ''
        assert int_to_mini_roman(1.0+41j) == ''
        assert int_to_mini_roman(1.0+42j) == ''
        assert int_to_mini_roman(1.0+43j) == ''
        assert int_to_mini_roman(1.0+44j) == ''
        assert int_to_mini_roman(1.0+45j) == ''
        assert int_to_mini_roman(1.0+46j) == ''
        assert int_to_mini_roman(1.0+47j) == ''
        assert int_to_mini_roman(1.0+48j) == ''
        assert int_to_mini_roman(1.0+49j) == ''
        assert int_to_mini_roman(1.0+50j) == ''
        assert int_to_mini_roman(1.0+51j) == ''
        assert int_to_mini_roman(1.0+52j) == ''
        assert int_to_mini_roman(1.0+53j) == ''
        assert int_to_mini_roman(1.0+54j) == ''
        assert int_to_mini_roman(1.0+55j) == ''
        assert int_to_mini_roman(1.0+56j) == ''
        assert int_to_mini_roman(1.0+57j) == ''
        assert int_to_mini_roman(1.0+58j) == ''
        assert int_to_mini_roman(1.0+59j) == ''
        assert int_to_mini_roman(1.0+60j) == ''
        assert int_to_mini_roman(1.0+61j) == ''
        assert int_to_mini_roman(1.0+62j) == ''
        assert int_to_mini_roman(1.0+63j) == ''
        assert int_to_mini_roman(1.0+64j) == ''
        assert int_to_mini_roman(1.0+65j) == ''
        assert int_to_mini_roman(1.0+66j) == ''
        assert int_to_mini_roman(1.0+67j) == ''
        assert int