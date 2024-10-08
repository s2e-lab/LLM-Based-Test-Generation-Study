
def sort_array(arr):
    """
    In this Kata, you have to sort an array of non-negative integers according to
    number of ones in their binary representation in ascending order.
    For similar number of ones, sort based on decimal value.

    
    """

    return sorted(sorted(arr), key=lambda x: bin(x)[2:].count('1'))
