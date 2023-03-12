

def modp(n: int, p: int):
    """Return 2^n modulo p (be aware of numerics).
    
    
    """

    ret = 1
    for i in range(n):
        ret = (2 * ret) % p
    return ret

