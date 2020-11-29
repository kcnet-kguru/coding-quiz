"""
ts = [50, 55, 56, 57, 58] choose_best_sum(163, 3, ts) -> 163
xs = [50] choose_best_sum(163, 3, xs) -> nil (or null or ... or -1 (C++, C, Rust, Swift, Go)
ys = [91, 74, 73, 85, 73, 81, 87] choose_best_sum(230, 3, ys) -> 228
"""
ts = [50, 55, 56, 57, 58]
xs = [50]
ys = [91, 74, 73, 85, 73, 81, 87]

from itertools import permutations

def BestSum(threshold, choice_num, arr):
    if choice_num > len(arr):
        return -1
    return max([i for i in set(map(sum,list(permutations(arr,choice_num)))) if i <= threshold])