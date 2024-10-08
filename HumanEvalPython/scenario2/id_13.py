

def greatest_common_divisor(a: int, b: int) -> int:
    """ Return a greatest common divisor of two integers a and b
    
    """

    while b:
        a, b = b, a % b
    return a
