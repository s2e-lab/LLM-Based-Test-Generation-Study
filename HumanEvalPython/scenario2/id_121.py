
def solution(lst):
    """Given a non-empty list of integers, return the sum of all of the odd elements that are in even positions.
    

    """

    return sum([x for idx, x in enumerate(lst) if idx%2==0 and x%2==1])

