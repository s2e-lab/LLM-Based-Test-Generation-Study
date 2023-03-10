
def count_upper(s):
    """
    Given a string s, count the number of uppercase vowels in even indices.
    
    
    """

    count = 0
    for i in range(0,len(s),2):
        if s[i] in "AEIOU":
            count += 1
    return count
