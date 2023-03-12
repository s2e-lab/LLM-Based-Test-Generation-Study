
def digitSum(s):
    """Task
    Write a function that takes a string as input and returns the sum of the upper characters only'
    ASCII codes.

    
    """

    if s == "": return 0
    return sum(ord(char) if char.isupper() else 0 for char in s)
