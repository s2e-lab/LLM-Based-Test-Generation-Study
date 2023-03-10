

def monotonic(l: list):
    """Return True is list elements are monotonically increasing or decreasing.
    
    
    """

    if l == sorted(l) or l == sorted(l, reverse=True):
        return True
    return False

