
def solve(N):
    """Given a positive integer N, return the total sum of its digits in binary.
    
    
    
    """

    return bin(sum(int(i) for i in str(N)))[2:]
