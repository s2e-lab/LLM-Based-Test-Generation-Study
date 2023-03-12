

def max_element(l: list):
    """Return maximum element in the list.
    
    """

    m = l[0]
    for e in l:
        if e > m:
            m = e
    return m

