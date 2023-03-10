

def sum_squares(lst):
    """You are given a list of numbers.
    You need to return the sum of squared numbers in the given list,
    round each element in the list to the upper int(Ceiling) first.
    
    
    

    """

    import math
    squared = 0
    for i in lst:
        squared += math.ceil(i)**2
    return squared

