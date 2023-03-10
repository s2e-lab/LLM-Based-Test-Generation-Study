

def largest_divisor(n: int) -> int:
    """ For a given number n, find the largest number that divides n evenly, smaller than n
    
    
    """

    for i in reversed(range(n)):
        if n % i == 0:
            return i

