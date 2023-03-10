
def right_angle_triangle(a, b, c):
    '''
    Given the lengths of the three sides of a triangle. Return True if the three
    sides form a right-angled triangle, False otherwise.
    A right-angled triangle is a triangle in which one angle is right angle or 
    90 degree.

    '''

    return a*a == b*b + c*c or b*b == a*a + c*c or c*c == a*a + b*b
