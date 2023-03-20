# id_59_Test.java
from scenario3.id_59 import largest_prime_factor

import pytest

class id_59_Test:
    """
    Test class of id_59.py.
    It contains ten unit test cases for the :func:`scenario3.id_59.largest_prime_factor`.
    """


    def test_largest_prime_factor_1(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(13195) == 29

    def test_largest_prime_factor_2(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(2048) == 2

    def test_largest_prime_factor_3(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(2) == 2

    def test_largest_prime_factor_4(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(3) == 3

    def test_largest_prime_factor_5(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(5) == 5

    def test_largest_prime_factor_6(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(7) == 7

    def test_largest_prime_factor_7(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(11) == 11

    def test_largest_prime_factor_8(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(13) == 13

    def test_largest_prime_factor_9(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(17) == 17

    def test_largest_prime_factor_10(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(19) == 19

# id_59_Test.py
from scenario3.id_59 import largest_prime_factor

import pytest

class id_59_Test:
    """
    Test class of id_59.py.
    It contains ten unit test cases for the :func:`scenario3.id_59.largest_prime_factor`.
    """
		
    def test_largest_prime_factor_1(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(13195) == 29

    def test_largest_prime_factor_2(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(2048) == 2

    def test_largest_prime_factor_3(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(2) == 2

    def test_largest_prime_factor_4(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(3) == 3

    def test_largest_prime_factor_5(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(5) == 5

    def test_largest_prime_factor_6(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(7) == 7

    def test_largest_prime_factor_7(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(11) == 11

    def test_largest_prime_factor_8(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(13) == 13

    def test_largest_prime_factor_9(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(17) == 17

    def test_largest_prime_factor_10(self):
        """
        Test case for the :func:`scenario3.id_59.largest_prime_factor`.
        """
        assert largest_prime_factor(19) == 19

# id_60.py


def is_prime(n: int):
    """Return True if n is a prime number.
    >>> is_prime(2)
    True
    >>> is_prime(3)
    True
    >>> is_prime(4)
    False
    >>> is_prime(5)
    True
    >>> is_prime(6)
    False
    >>> is_prime(7)
    True
    >>> is_prime(8)
    False
    >>> is_prime(9)
    False
    >>> is_prime(10)
    False
    >>> is_prime(11)
    True
    >>> is_prime(12)
    False
    >>> is_prime(13)
    True
    >>> is_prime(14)
    False
    >>> is_prime(15)
    False
    >>> is_prime(16)
    False
    >>> is_prime(17)
    True
    >>> is_prime(18)
    False
    >>> is_prime(19)
    True
    >>> is_prime(20)
    False
    >>> is_prime(21)
    False
    >>> is_prime(22)
    False
    >>> is_prime(23)
    True
    >>> is_prime(24)
    False
    >>> is_prime(25)
    False
    >>> is_prime(26)
    False
    >>> is_prime(27)
    False
    >>> is_prime(28)
    False
    >>> is_prime(29)
    True
    >>> is_prime(30)
    False
    >>> is_prime(31)
    True
    >>> is_prime(32)
    False
    >>> is_prime(33)
    False
    >>> is_prime(34)
    False
    >>> is_prime(35)
    False
    >>> is_prime(36)
    False
    >>> is_prime(37)
    True
    >>> is_prime(38)
    False
    >>> is_prime(39)
    False
    >>> is_prime(40)
    False
    >>> is_prime(41)
    True
    >>> is_prime(42)
    False
    >>> is_prime(43)
    True
    >>> is_prime(44)
    False
    >>> is_prime(45)
    False
    >>> is_prime(46)
    False
    >>> is_prime(47)
    True
    >>> is_prime(48)
    False
    >>> is_prime(49)
    False
    >>> is_prime(50)
    False
    >>> is_prime(51)
    False
    >>> is_prime(52)
    False
    >>> is_prime(53)
    True
    >>> is_prime(54)
    False
    >>> is_prime(55)
    False
    >>> is_prime(56)
    False
    >>> is_prime(57)
    False
    >>> is_prime(58)
    False
    >>> is_prime(59)
    True
    >>> is_prime(60)
    False
    >>> is_prime(61)
    True
    >>> is_prime(62)
    False
    >>> is_prime(63)
    False
    >>> is_prime(64)
    False
    >>> is_prime(65)
    False
    >>> is_prime(66)
    False
    >>> is_prime(67)
    True
    >>> is_prime(68)
    False
    >>> is_prime(69)
    False
    >>> is_prime(70)
    False
    >>> is_prime(71)
    True
    >>> is_prime(72)
    False
    >>> is_prime(73)
    True
    >>> is_prime(74)
    False
    >>> is_prime(75)
    False
    >>> is_prime(76)
    False
    >>> is_prime(77)
    False
    >>> is_prime(78)
    False
    >>> is_prime(79)
    True
    >>> is_prime(80)
    False
    >>> is_prime(81)
    False
    >>> is_prime(82)
    False
    >>> is_prime(83)
    True
    >>> is_prime(84)
    False
    >>> is_prime(85)
    False
    >>> is_prime(86)
    False
    >>> is_prime(87)
    False
    >>> is_prime(88)
    False
    >>> is_prime(89)
    True
    >>> is_prime(90)
    False
    >>> is_prime(91)
    False
    >>> is_prime(92)
    False
    >>> is_prime(93)
    False
    >>> is_prime(94)
    False
    >>> is_prime(95)
    False
    >>> is_prime(96)
    False
    >>> is_prime(97)
    True
    >>> is_prime(98)
    False
    >>> is_prime(99)
    False
    >>> is_prime(100)
    False
    >>> is_prime(101)
    True
    >>> is_prime(102)
    False
    >>> is_prime(103)
    True
    >>> is_prime(104)
    False
    >>> is_prime(105)
    False
    >>> is_prime(106)
    False
    >>> is_prime(107)
    True
    >>> is_prime(108)
    False
    >>> is_prime(109)
    True
    >>> is_prime(110)
    False
    >>> is_prime(111)
    False
    >>> is_prime(112)
    False
    >>> is_prime(113)
    True
    >>> is_prime(114)
    False
    >>> is_prime(115)
    False
    >>> is_prime(116)
    False
    >>> is_prime(117)
    False
    >>> is_prime(118)
    False
    >>> is_prime(119)
    False
    >>> is_prime(120)
    False
    >>> is_prime(121)
    False
    >>> is_prime(122)
    False
    >>> is_prime(123)
    False
    >>> is_prime(124)
    False
    >>> is_prime(125)
    False
    >>> is_prime(126)
    False
    >>> is_prime(127)
    True
    >>> is_prime(128)
    False
    >>> is_prime(129)
    False
    >>> is_prime(130)
    False
    >>> is_prime(131)
    True
    >>> is_prime(132)
    False
    >>> is_prime(133)
    False
    >>> is_prime(134)
    False
    >>> is_prime(135)
    False
    >>> is_prime(136)
    False
    >>> is_prime(137)
    True
    >>> is_prime(138)
    False
    >>> is_prime(139)
    True
    >>> is_prime(140)
    False
    >>> is_prime(141)
    False
    >>> is_prime(142)
    False
    >>> is_prime(143)
    False
    >>> is_prime(144)
    False
    >>> is_prime(145)
    False
    >>> is_prime(146)
    False
    >>> is_prime(147)
    False
    >>> is_prime(148)
    False
    >>> is_prime(149)
    False
    >>> is_prime(150)
    False
    >>> is_prime(151)
    True
    >>> is_prime(152)
    False
    >>> is_prime(153)
    True
    >>> is_prime(154)
    False
    >>> is_prime(155)
    False
    >>> is_prime(156)
    False
    >>> is_prime(157)
    True
    >>> is_prime(158)
    False
    >>> is_prime(159)
    False
    >>> is_prime(160)
    False
    >>> is_prime(161)
    False
    >>> is_prime(162)
    False
    >>> is_prime(163)
    True
    >>> is_prime(164)
    False
    >>> is_prime(165)
    False
    >>> is_prime(166)
    False
    >>> is_prime(167)
    True
    >>> is_prime(168)
    False
    >>> is_prime(169)
    False
    >>> is_prime(170)
    False
    >>> is_prime(171)
    False
    >>> is_prime(172)
    False
    >>> is_prime(173)
    True
    >>> is_prime(174)
    False
    >>> is_prime(175)
    False
    >>> is_prime(176)
    False
    >>> is_prime(177)
    False
    >>> is_prime(178)
    False
    >>> is_prime(179)
    True
    >>> is_prime(180)
    False
    >>> is_prime(181)
    False
    >>> is_prime(182)
    False
    >>> is_prime(183)
    True
    >>> is_prime(184)
    False
    >>> is_prime(185)
    False
    >>> is_prime(186)
    False
    >>> is_prime(187)
    False
    >>> is_prime(188)
    False
    >>> is_prime(189)
    True
    >>> is_prime(190)
    False
    >>> is_prime(191)
    True
    >>> is_prime(192)
    False
    >>> is_prime(193)
    True
    >>> is_prime(194)
    False
    >>> is_prime(195)
    False
    >>> is_prime(196)
    False
    >>> is_prime(197)
    True
    >>> is_prime(198)
    False
    >>> is_prime(199)
    True
    >>> is_prime(200)
    False
    >>> is_prime(201)
    False
    >>> is_prime(202)
    False
    >>> is_prime(203)
    True
    >>> is_prime(204)
    False
    >>> is_prime(205)
    False
    >>> is_prime(206)
    False
    >>> is_prime(207)
    False
    >>> is_prime(208)
    False
    >>> is_prime(209)
    False
    >>> is_prime(210)
    False
    >>> is_prime(211)
    True
    >>> is_prime(212)
    False
    >>> is_prime(213)
    False
    >>> is_prime(214)
    False
    >>> is_prime(215)
    False
    >>> is_prime(216)
    False
    >>> is_prime(217)
    True
    >>> is_prime(218)
    False
    >>> is_prime(219)
    False
    >>> is_prime(220)
    False
    >>> is_prime(221)
    False
    >>> is_prime(222)
    False
    >>> is_prime(223)
    True
    >>> is_prime(224)
    False
    >>> is_prime(225)
    False
    >>> is_prime(226)
    False
    >>> is_prime(227)
    False
    >>> is_prime(