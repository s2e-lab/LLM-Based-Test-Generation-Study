

def string_sequence(n: int) -> str:
    """ Return a string containing space-delimited numbers starting from 0 upto n inclusive.
    
    
    """

    return ' '.join([str(x) for x in range(n + 1)])

