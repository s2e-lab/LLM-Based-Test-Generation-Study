

def change_base(x: int, base: int):
    """Change numerical base of input number x to base.
    return string representation after the conversion.
    base numbers are less than 10.
    
    """

    ret = ""
    while x > 0:
        ret = str(x % base) + ret
        x //= base
    return ret
