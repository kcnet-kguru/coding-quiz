_str = 'sTreSS'

from collections import Counter

def first_non_repeating_letter(_str):
    count_str = Counter(_str.lower())
    sort_count = sorted(count_str, key=lambda x: count_str[x])

    if sort_count[0] in _str:
        return sort_count[0]
    
    if sort_count[0].upper() in _str:
        return sort_count[0].upper()

    return -1
