from typing import List


def remove_duplicates(numbers: List[int]) -> List[int]:
    """ From a list of integers, remove all elements that occur more than once.
    Keep order of elements left the same as in the input.
   
    
    
    """

    import collections
    c = collections.Counter(numbers)
    return [n for n in numbers if c[n] <= 1]
