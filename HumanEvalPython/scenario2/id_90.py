
def next_smallest(lst):
    """
    You are given a list of integers.
    Write a function next_smallest() that returns the 2nd smallest element of the list.
    Return None if there is no such element.
    
    
    """

    lst = sorted(set(lst))
    return None if len(lst) < 2 else lst[1]
