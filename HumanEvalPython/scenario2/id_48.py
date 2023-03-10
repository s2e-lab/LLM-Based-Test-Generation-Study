

def is_palindrome(text: str):
    """
    Checks if given string is a palindrome
    
    
    """

    for i in range(len(text)):
        if text[i] != text[len(text) - 1 - i]:
            return False
    return True

