# id_140_Test.java
from scenario3.id_140 import fix_spaces

import pytest

class id_140_Test:
    """
    Test class of id_140.py.
    It contains ten unit test cases for the :func:`scenario3.id_140.fix_spaces`.
    """


    def test_fix_spaces_1(self):
        """
        Test case for the :func:`scenario3.id_140.fix_spaces`.
        """
        assert fix_spaces("Example") == "Example"

    def test_fix_spaces_2(self):
        """
        Test case for the :func:`scenario3.id_140.fix_spaces`.
        """
        assert fix_spaces("Example 1") == "Example_1"

    def test_fix_spaces_3(self):
        """
        Test case for the :func:`scenario3.id_140.fix_spaces`.
        """
        assert fix_spaces(" Example 2") == "_Example_2"

    def test_fix_spaces_4(self):
        """
        Test case for the :func:`scenario3.id_140.fix_spaces`.
        """
        assert fix_spaces(" Example   3") == "_Example-3"

    def test_fix_spaces_5(self):
        """
        Test case for the :func:`scenario3.id_140.fix_spaces`.
        """
        assert fix_spaces("Example 4") == "Example_4"

    def test_fix_spaces_6(self):
        """
        Test case for the :func:`scenario3.id_140.fix_spaces`.
        """
        assert fix_spaces("Example  5") == "Example-5"

    def test_fix_spaces_7(self):
        """
        Test case for the :func:`scenario3.id_140.fix_spaces`.
        """
        assert fix_spaces("Example   6") == "Example-6"

    def test_fix_spaces_8(self):
        """
        Test case for the :func:`scenario3.id_140.fix_spaces`.
        """
        assert fix_spaces("Example    7") == "Example--7"

    def test_fix_spaces_9(self):
        """
        Test case for the :func:`scenario3.id_140.fix_spaces`.
        """
        assert fix_spaces("Example     8") == "Example---8"

    def test_fix_spaces_10(self):
        """
        Test case for the :func:`scenario3.id_140.fix_spaces`.
        """
        assert fix_spaces("Example      9") == "Example----9"

# id_141.py

def get_first_name(full_name):
    """
    Given a string full_name, return the first name.
    If the full_name contains a space, then return the first name.
    If the full_name does not contain a space, then return the full_name.
    
    get_first_name("Example") == "Example"
    get_first_name("Example Example") == "Example"
    get_first_name("Example Example Example") == "Example"
    """

    pass
# id_141_Test.java
from scenario3.id_141 import get_first_name

import pytest

class id_141_Test:
    """
    Test class of id_141.py.
    It contains ten unit test cases for the :func:`scenario3.id_141.get_first_name`.
    """
		
    def test_get_first_name_1(self):
        """
        Test case for the :func:`scenario3.id_141.get_first_name`.
        """
        assert get_first_name("Example") == "Example"

    def test_get_first_name_2(self):
        """
        Test case for the :func:`scenario3.id_141.get_first_name`.
        """
        assert get_first_name("Example Example") == "Example"

    def test_get_first_name_3(self):
        """
        Test case for the :func:`scenario3.id_141.get_first_name`.
        """
        assert get_first_name("Example Example Example") == "Example"

    def test_get_first_name_4(self):
        """
        Test case for the :func:`scenario3.id_141.get_first_name`.
        """
        assert get_first_name("Example") == "Example"

    def test_get_first_name_5(self):
        """
        Test case for the :func:`scenario3.id_141.get_first_name`.
        """
        assert get_first_name("Example Example") == "Example"

    def test_get_first_name_6(self):
        """
        Test case for the :func:`scenario3.id_141.get_first_name`.
        """
        assert get_first_name("Example Example Example") == "Example"

    def test_get_first_name_7(self):
        """
        Test case for the :func:`scenario3.id_141.get_first_name`.
        """
        assert get_first_name("Example") == "Example"

    def test_get_first_name_8(self):
        """
        Test case for the :func:`scenario3.id_141.get_first_name`.
        """
        assert get_first_name("Example Example") == "Example"

    def test_get_first_name_9(self):
        """
        Test case for the :func:`scenario3.id_141.get_first_name`.
        """
        assert get_first_name("Example Example Example") == "Example"

    def test_get_first_name_10(self):
        """
        Test case for the :func:`scenario3.id_141.get_first_name`.
        """
        assert get_first_name("Example") == "Example"

# id_142.py

def get_last_name(full_name):
    """
    Given a string full_name, return the last name.
    If the full_name contains a space, then return the last name.
    If the full_name does not contain a space, then return the full_name.
    
    get_last_name("Example") == "Example"
    get_last_name("Example Example") == "Example"
    get_last_name("Example Example Example") == "Example"
    """

    pass
# id_142_Test.java
from scenario3.id_142 import get_last_name

import pytest

class id_142_Test:
    """
    Test class of id_142.py.
    It contains ten unit test cases for the :func:`scenario3.id_142.get_last_name`.
    """
		
    def test_get_last_name_1(self):
        """
        Test case for the :func:`scenario3.id_142.get_last_name`.
        """
        assert get_last_name("Example") == "Example"

    def test_get_last_name_2(self):
        """
        Test case for the :func:`scenario3.id_142.get_last_name`.
        """
        assert get_last_name("Example Example") == "Example"

    def test_get_last_name_3(self):
        """
        Test case for the :func:`scenario3.id_142.get_last_name`.
        """
        assert get_last_name("Example Example Example") == "Example"

    def test_get_last_name_4(self):
        """
        Test case for the :func:`scenario3.id_142.get_last_name`.
        """
        assert get_last_name("Example") == "Example"

    def test_get_last_name_5(self):
        """
        Test case for the :func:`scenario3.id_142.get_last_name`.
        """
        assert get_last_name("Example Example") == "Example"

    def test_get_last_name_6(self):
        """
        Test case for the :func:`scenario3.id_142.get_last_name`.
        """
        assert get_last_name("Example Example Example") == "Example"

    def test_get_last_name_7(self):
        """
        Test case for the :func:`scenario3.id_142.get_last_name`.
        """
        assert get_last_name("Example") == "Example"

    def test_get_last_name_8(self):
        """
        Test case for the :func:`scenario3.id_142.get_last_name`.
        """
        assert get_last_name("Example Example") == "Example"

    def test_get_last_name_9(self):
        """
        Test case for the :func:`scenario3.id_142.get_last_name`.
        """
        assert get_last_name("Example Example Example") == "Example"

    def test_get_last_name_10(self):
        """
        Test case for the :func:`scenario3.id_142.get_last_name`.
        """
        assert get_last_name("Example") == "Example"

# id_143.py

def get_middle_name(full_name):
    """
    Given a string full_name, return the middle name.
    If the full_name contains a space, then return the middle name.
    If the full_name does not contain a space, then return the full_name.
    
    get_middle_name("Example") == "Example"
    get_middle_name("Example Example") == "Example"
    get_middle_name("Example Example Example") == "Example"
    """

    pass
# id_143_Test.java
from scenario3.id_143 import get_middle_name

import pytest

class id_143_Test:
    """
    Test class of id_143.py.
    It contains ten unit test cases for the :func:`scenario3.id_143.get_middle_name`.
    """
		
    def test_get_middle_name_1(self):
        """
        Test case for the :func:`scenario3.id_143.get_middle_name`.
        """
        assert get_middle_name("Example") == "Example"

    def test_get_middle_name_2(self):
        """
        Test case for the :func:`scenario3.id_143.get_middle_name`.
        """
        assert get_middle_name("Example Example") == "Example"

    def test_get_middle_name_3(self):
        """
        Test case for the :func:`scenario3.id_143.get_middle_name`.
        """
        assert get_middle_name("Example Example Example") == "Example"

    def test_get_middle_name_4(self):
        """
        Test case for the :func:`scenario3.id_143.get_middle_name`.
        """
        assert get_middle_name("Example") == "Example"

    def test_get_middle_name_5(self):
        """
        Test case for the :func:`scenario3.id_143.get_middle_name`.
        """
        assert get_middle_name("Example Example") == "Example"

    def test_get_middle_name_6(self):
        """
        Test case for the :func:`scenario3.id_143.get_middle_name`.
        """
        assert get_middle_name("Example Example Example") == "Example"

    def test_get_middle_name_7(self):
        """
        Test case for the :func:`scenario3.id_143.get_middle_name`.
        """
        assert get_middle_name("Example") == "Example"

    def test_get_middle_name_8(self):
        """
        Test case for the :func:`scenario3.id_143.get_middle_name`.
        """
        assert get_middle_name("Example Example") == "Example"

    def test_get_middle_name_9(self):
        """
        Test case for the :func:`scenario3.id_143.get_middle_name`.
        """
        assert get_middle_name("Example Example Example") == "Example"

    def test_get_middle_name_10(self):
        """
        Test case for the :func:`scenario3.id_143.get_middle_name`.
        """
        assert get_middle_name("Example") == "Example"

# id_144.py

def get_first_name_initial(full_name):
    """
    Given a string full_name, return the first name initial.
    If the full_name contains a space, then return the first name initial.
    If the full_name does not contain a space, then return the full_name.
    
    get_first_name_initial("Example") == "Example"
    get_first_name_initial("Example Example") == "E"
    get_first_name_initial("Example Example Example") == "E"
    """

    pass
# id_144_Test.java
from scenario3.id_144 import get_first_name_initial

import pytest

class id_144_Test:
    """
    Test class of id_144.py.
    It contains ten unit test cases for the :func:`scenario3.id_144.get_first_name_initial`.
    """
		
    def test_get_first_name_initial_1(self):
        """
        Test case for the :func:`scenario3.id_144.get_first_name_initial`.
        """
        assert get_first_name_initial("Example") == "Example"

    def test_get_first_name_initial_2(self):
        """
        Test case for the :func:`scenario3.id_144.get_first_name_initial`.
        """
        assert get_first_name_initial("Example Example") == "E"

    def test_get_first_name_initial_3(self):
        """
        Test case for the :func:`scenario3.id_144.get_first_name_initial`.
        """
        assert get_first_name_initial("Example Example Example") == "E"

    def test_get_first_name_initial_4(self):
        """
        Test case for the :func:`scenario3.id_144.get_first_name_initial`.
        """
        assert get_first_name_initial("Example") == "Example"

    def test_get_first_name_initial_5(self):
        """
        Test case for the :func:`scenario3.id_144.get_first_name_initial`.
        """
        assert get_first_name_initial("Example Example") == "E"

    def test_get_first_name_initial_6(self):
        """
        Test case for the :func:`scenario3.id_144.get_first_name_initial`.
        """
        assert get_first_name_initial("Example Example Example") == "E"

    def test_get_first_name_initial_7(self):
        """
        Test case for the :func:`scenario3.id_144.get_first_name_initial`.
        """
        assert get_first_name_initial("Example") == "Example"

    def test_get_first_name_initial_8(self):
        """
        Test case for the :func:`scenario3.id_144.get_first_name_initial`.
        """
        assert get_first_name_initial("Example Example") == "E"

    def test_get_first_name_initial_9(self):
        """
        Test case for the :func:`scenario3.id_144.get_first_name_initial`.
        """
        assert get_first_name_initial("Example Example Example") == "E"

    def test_get_first_name_initial_10(self):
        """
        Test case for the :func:`scenario3.id_144.get_first_name_initial`.
        """
        assert get_first_name_initial("Example") == "Example"

# id_145.py

def get_last_name_initial(full_name):
    """
    Given a string full_name,