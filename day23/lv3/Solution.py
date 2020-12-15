#  maxSequence([-2, 1, -3, 4, -1, 2, 1, -5, 4])
# // should be 6: [4, -1, 2, 1]

arr = [-2, 1, -3, 4, -1, 2, 1, -5, 4]

def maxSequence(arr):
    answer = 0
    _max = 0

    for i in arr:
        _max = max(_max + i, i)
        answer = max(_max, answer)

    return max(answer, 0)