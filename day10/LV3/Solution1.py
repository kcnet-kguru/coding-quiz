s1="Are the kids at home? aaaaa fffff"
s2="Yes they are here! aaaaa fffff"

from collections import Counter
import re

def mix(s1, s2):
    lower_char = r"[a-z]"
    s1, s2 = re.findall(lower_char, s1), re.findall(lower_char, s2)
    count_s1, count_s2 = Counter(s1), Counter(s2)
    mix_char = set(s1)
    mix_char.update(s2)

    mix_char_list = []
    for char in mix_char:
        if char in count_s1 and char in count_s2:
            if count_s1[char] > count_s2[char]:
                if count_s1[char] > 1: mix_char_list.append(f"1:{count_s1[char]*char}")
            elif count_s1[char] < count_s2[char]:
                if count_s2[char] > 1: mix_char_list.append(f"2:{count_s2[char]*char}")
            else:
                if count_s1[char] > 1: mix_char_list.append(f"=:{count_s1[char]*char}")
        elif char in count_s1 and not char in count_s2:
            if count_s1[char] > 1: mix_char_list.append(f"1:{count_s1[char]*char}")
        else:
            if count_s2[char] > 1: mix_char_list.append(f"2:{count_s2[char]*char}")

    mix_char_list = sorted(mix_char_list, key=lambda x: x[2])
    mix_char_list = sorted(mix_char_list, key=lambda x: x[0])
    mix_char_list = sorted(mix_char_list, key=lambda x: len(x), reverse=True)
    
    return '/'.join(mix_char_list)