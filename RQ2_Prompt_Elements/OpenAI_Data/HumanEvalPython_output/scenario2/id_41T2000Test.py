# id_41_Test.java
from scenario2.id_41 import car_race_collision

import pytest

class id_41_Test:
    """
    Test class of id_41.py.
    It contains ten unit test cases for the :func:`scenario2.id_41.car_race_collision`.
    """


    def test_car_race_collision_1(self):
        """
        Test case for the :func:`scenario2.id_41.car_race_collision`.
        """
        assert car_race_collision(1) == 1

    def test_car_race_collision_2(self):
        """
        Test case for the :func:`scenario2.id_41.car_race_collision`.
        """
        assert car_race_collision(2) == 4

    def test_car_race_collision_3(self):
        """
        Test case for the :func:`scenario2.id_41.car_race_collision`.
        """
        assert car_race_collision(3) == 9

    def test_car_race_collision_4(self):
        """
        Test case for the :func:`scenario2.id_41.car_race_collision`.
        """
        assert car_race_collision(4) == 16

    def test_car_race_collision_5(self):
        """
        Test case for the :func:`scenario2.id_41.car_race_collision`.
        """
        assert car_race_collision(5) == 25

    def test_car_race_collision_6(self):
        """
        Test case for the :func:`scenario2.id_41.car_race_collision`.
        """
        assert car_race_collision(6) == 36

    def test_car_race_collision_7(self):
        """
        Test case for the :func:`scenario2.id_41.car_race_collision`.
        """
        assert car_race_collision(7) == 49

    def test_car_race_collision_8(self):
        """
        Test case for the :func:`scenario2.id_41.car_race_collision`.
        """
        assert car_race_collision(8) == 64

    def test_car_race_collision_9(self):
        """
        Test case for the :func:`scenario2.id_41.car_race_collision`.
        """
        assert car_race_collision(9) == 81

    def test_car_race_collision_10(self):
        """
        Test case for the :func:`scenario2.id_41.car_race_collision`.
        """
        assert car_race_collision(10) == 100