
def string_to_md5(text):
    """
    Given a string 'text', return its md5 hash equivalent string.
    If 'text' is an empty string, return None.

    """

    import hashlib
    return hashlib.md5(text.encode('ascii')).hexdigest() if text else None

