from collections import Counter

def find(s):
    alphabet = 'abcdefghijklmnopqrstuvwxyz'

    s_dict = Counter(s)
    max_val = max(s_dict.values())

    for char in alphabet:
        if not char in s_dict:
            s_dict[char] = max_val
        else:
            s_dict[char] = max_val - s_dict[char]

    return ''.join(list(map(lambda x:x*s_dict[x],s_dict)))