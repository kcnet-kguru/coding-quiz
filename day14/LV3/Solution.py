"""
who_is_next(["Sheldon", "Leonard", "Penny", "Rajesh", "Howard"], 1) == "Sheldon"
who_is_next(["Sheldon", "Leonard", "Penny", "Rajesh", "Howard"], 52) == "Penny"
who_is_next(["Sheldon", "Leonard", "Penny", "Rajesh", "Howard"], 7230702951) == "Leonard"
"""

import math

def who_is_next(arr, num):
    iter_num = math.floor(math.log2(num/len(arr)+1))
    return arr[math.ceil((num - (5 * (pow(2,iter_num)-1))) / pow(2,iter_num)) - 1]