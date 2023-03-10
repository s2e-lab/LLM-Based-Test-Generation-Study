
def iscube(a):
    '''
    Write a function that takes an integer a and returns True 
    if this ingeger is a cube of some integer number.
    Note: you may assume the input is always valid.
    
    '''

    a = abs(a)
    return int(round(a ** (1. / 3))) ** 3 == a
