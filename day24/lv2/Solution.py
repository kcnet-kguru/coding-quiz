"""
alphabetWar("s*zz");           //=> Right side wins!
alphabetWar("*zd*qm*wp*bs*"); //=> Let's fight again!
alphabetWar("zzzz*s*");       //=> Right side wins!
alphabetWar("www*www****z");  //=> Left side wins!
"""

import re

def alphabetWar(alphabets):
    left = {'w': 4, 'p': 3, 'b': 2, 's': 1}
    right = {'m': 4, 'q': 3, 'd': 2, 'z': 1}

    pattern = re.compile('.[*].|.[*]|[*].|[*]')
    l_count = 0
    r_count = 0
    for i in re.sub(pattern, '',alphabets):
        if i in left:
            l_count += left[i]
        if i in right:
            r_count += right[i]

    if l_count > r_count:
        return 'Left side wins!'
    elif r_count > l_count:
        return 'Right side wins!'
    return "Let's fight again!"