arr1 = [4, 3, 2, 3, 4]
s1 = 6

arr2 = [10, 5, 2, 3, 7, 5]
s2 = 10

def solution1(arr, s):
    inner = []
    for i in arr:
        for j in inner:
            if s - j == i:
                return [j ,i]
        inner.append(i)
    return None

def solution2(arr, s):
    inner = []
    for i in arr:
        if s - i in inner:
            return [s - i, i]
        inner.append(i)
    return None

def solution3(arr, s):
    inner = set()
    for i in arr:
        if s - i in inner:
            return [s - i, i]
        inner.add(i)
    return None