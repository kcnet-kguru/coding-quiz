"""
 Step 1         Step 2        Step 3       Step 4       Step5
                     5/           5|         5\          
                    4/            4|          4\      
1 2 3 4 5      1 2 3/         1 2 3|       1 2 3\       6 6 3
----*----      ----*          ----*        ----*        ----*

foldArray([1, 2, 3, 4, 5], 1) => [6, 6, 3]
foldArray([1, 2, 3, 4, 5], 2) => [9, 6]
foldArray([1, 2, 3, 4, 5], 3) => [15]
foldArray([-9, 9, -8, 8, 66, 23], 1) => [14, 75, 0]
"""
import numpy as np

def array_sum(arr1, arr2):
    for i in range(len(arr2)):
        arr1[i] = arr1[i] + arr2[i]
    return arr1

def foldArray(arr, iter_num):
    left = arr
    right = None

    for _ in range(iter_num):
        slice_num = len(left)//2 if len(left) % 2 == 0 else len(left)//2+1
        right = left[slice_num:]
        right = right[::-1]
        left = left[:slice_num]
        left = array_sum(left, right)
    return left